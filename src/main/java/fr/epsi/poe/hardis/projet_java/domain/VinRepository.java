package fr.epsi.poe.hardis.projet_java.domain;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Ismail on 24/03/2017.
 */
// C'est une class interface qui definit le repository pour region,
//se referer a la doc  https://spring.io/guides/gs/accessing-data-rest/


@RepositoryRestResource(collectionResourceRel = "complementNom", path = "complementNom")
public interface VinRepository extends PagingAndSortingRepository<Vin, Long> {

    List <Vin> findByComplementNom (@Param("complementNom") String complementNom);
}
