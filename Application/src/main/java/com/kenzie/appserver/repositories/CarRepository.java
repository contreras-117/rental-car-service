package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.CarPrimaryKey;
import com.kenzie.appserver.repositories.model.CarRecord;

import com.kenzie.appserver.service.model.Car;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface CarRepository extends CrudRepository<CarRecord, CarPrimaryKey> {
}
