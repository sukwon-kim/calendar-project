package org.my.calendarcore;

import org.my.calendarcore.SimpleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleEntityRepository extends JpaRepository<SimpleEntity, Long> {
}
