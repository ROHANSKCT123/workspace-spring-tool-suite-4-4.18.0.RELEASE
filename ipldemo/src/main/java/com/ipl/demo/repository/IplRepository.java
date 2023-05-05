package com.ipl.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IplRepository extends JpaRepository <Ipl, Integer> 
{

}
