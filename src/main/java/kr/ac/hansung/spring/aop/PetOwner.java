package kr.ac.hansung.spring.aop;

import javax.annotation.Resource;

/**
 * Created by jihun on 2017. 1. 24..
 */
public class PetOwner {
    // @Autowired  // wiring by type
    // @Qualifier(value="qf_cat")
    @Resource(name="dog")      // wiring by name
    private AnimalType animal;

    public void play() {
        animal.sound();
    }
}
