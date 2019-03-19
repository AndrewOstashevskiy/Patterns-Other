package hello.repos;

import hello.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MessagesRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
