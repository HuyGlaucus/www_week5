package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.Candidate;

//@RepositoryRestResource(collectionResourceRel = "candidates", path = "candidates")
//public interface CandidateRepository extends PagingAndSortingRepository<Candidate, Long> {
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
