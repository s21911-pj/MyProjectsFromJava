package pl.pjatk.demo.service;

import org.springframework.stereotype.Service;
import pl.pjatk.demo.repository.TransactionRepository;

@Service
public class TransactionService {
private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
}
