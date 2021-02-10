package pl.pjatk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.demo.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
