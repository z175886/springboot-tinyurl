
package com.spring.utility.Repository;

import com.spring.utility.Models.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Websiterepo extends JpaRepository<Website,String> {
}