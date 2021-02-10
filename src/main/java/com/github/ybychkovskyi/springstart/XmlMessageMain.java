package com.github.ybychkovskyi.springstart;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class XmlMessageMain {
  public static void main(String[] args) throws Exception {
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
    rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/app-context-xml.xml"));
    HelloWorldMessageProvider provider = factory.getBean("messageProvider", HelloWorldMessageProvider.class);
    System.out.println(provider.getMessage());

  }
}
