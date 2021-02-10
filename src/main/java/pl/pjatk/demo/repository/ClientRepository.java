package pl.pjatk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.demo.model.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
