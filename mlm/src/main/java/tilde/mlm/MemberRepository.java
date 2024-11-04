package tilde.mlm;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a bean called MemberRepository
// CRUD refers Create, Read, Update, Delete

public interface MemberRepository extends CrudRepository<Member, Integer> { // CrudRepository< > : A Generic Class

}
