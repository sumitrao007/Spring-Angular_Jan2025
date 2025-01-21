package com.hefshine.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = {"com.hefshine"})
@PropertySource("classpath:myfile.properties")
public class Myconfig {

}
