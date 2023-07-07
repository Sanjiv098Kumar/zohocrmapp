package zohoCrmApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zohoCrmApp.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
