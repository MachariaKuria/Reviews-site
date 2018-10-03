package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review whiteRhino = new Review(1L,"Treetops Hotel","Service","/images/TreetopsLodge.jpg","****","Enjoyed seeing the Elephants.");
		Review maraSopa = new Review(2L,"Mara Sopa Lodge","Food","/images/MaraSopa.jpg","***","Internet was at my finger tips.");
		Review amboseli = new Review(3L,"Amboseli Serena Lodge","Facilities","/images/AmboseliSerena.jpg","*****","Enjoyed viewing the wildlife while eating my dessert.");
		Review tsavo = new Review(4L,"Tsavo East","Rooms","/images/Tsavo.jpg","****","Found a lion pride nearby.");
		Review moutainLodge = new Review(5L,"Mountain Lodge Hotel","Outdoor","/images/MountainLodge.jpg","***","Saw two rhinos at a drinking well.");
	
		reviewList.put(whiteRhino.getId(), whiteRhino);
		reviewList.put(maraSopa.getId(), maraSopa);
		reviewList.put(amboseli.getId(), amboseli);
		reviewList.put(tsavo.getId(), tsavo);
		reviewList.put(moutainLodge.getId(), moutainLodge);
	}

	public ReviewRepository(Review...reviews) {
		for(Review review: reviews) {
		reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
