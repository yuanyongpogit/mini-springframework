package com.github.wenbo2018.minispringframework.support;

import com.github.wenbo2018.minispringframework.beans.Io.Resource;
import com.github.wenbo2018.minispringframework.beans.Io.ResourceLoader;
import com.github.wenbo2018.minispringframework.except.BeanDefinitionStoreException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by wenbo.shen on 2017/12/16.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(Resource resource) throws IOException, ParserConfigurationException, SAXException;

    int loadBeanDefinitions(String... locations) throws BeanDefinitionStoreException;

    ResourceLoader getResourceLoader();

}
