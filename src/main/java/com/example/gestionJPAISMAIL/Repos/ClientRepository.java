package com.example.gestionJPAISMAIL.Repos;




import com.example.gestionJPAISMAIL.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
