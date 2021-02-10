package com.github.ybychkovskyi.springstart;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class XmlConfigWithBeanFactory {
  public static void main(String[] args) throws Exception {
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
    rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/xmlBeanFactory.xml"));
    Oracle oracle = factory.getBean("oracle", Oracle.class);
    System.out.println(oracle.defineMeaningOfLife());
  }
}
