package by.training.repository;

import by.training.model.Address;
import by.training.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
