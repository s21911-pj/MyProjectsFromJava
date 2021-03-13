package pl.pjatk.demo.service;

import org.springframework.stereotype.Service;
import pl.pjatk.demo.exception.NotEmptyException;
import pl.pjatk.demo.exception.TransactionException;
import pl.pjatk.demo.model.Transaction;
import pl.pjatk.demo.repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Transaction findById(Long id) {
        return transactionRepository.findById(id).orElseThrow(() -> new TransactionException(id));
    }

    public Transaction addNewTransaction(Transaction transaction) {
        if (transaction.getTransactionCost() == 0 || transaction.getTransactionDate() == null) {
            throw new NotEmptyException(" That field ");
        }
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(Transaction updatingTransaction, Long id){
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(()->new TransactionException(id));
        if (updatingTransaction.getTransactionDate()!=null){
            transaction.setTransactionDate(updatingTransaction.getTransactionDate());
        }if(updatingTransaction.getTransactionCost()>=0){
            transaction.setTransactionCost(updatingTransaction.getTransactionCost());
        }return transactionRepository.save(updatingTransaction);
    }
}
