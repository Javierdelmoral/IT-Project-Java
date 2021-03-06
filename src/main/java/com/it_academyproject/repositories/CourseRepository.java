
package com.it_academyproject.repositories;

import com.it_academyproject.domains.Itinerary;
import com.it_academyproject.domains.MyAppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import com.it_academyproject.domains.Course;

import java.util.Date;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer>
{
    public List<Course> findByEndDate(Date endDate );
    public List<Course> findByUserStudent(MyAppUser user );
    public List<Course> findByItinerary(Itinerary itinerary);
    public List<Course> findByItineraryAndEndDate( Itinerary itinerary , Date date);

}
