package edu.carteiradigitalsimplificada.repositories;

import edu.carteiradigitalsimplificada.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
