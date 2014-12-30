
package com.suncafly.rules.demo;
import java.util.Collection;

public interface TestDAO {

	Test findByKey(Integer id);

	Collection findAll();

}
