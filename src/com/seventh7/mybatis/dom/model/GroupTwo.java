package com.seventh7.mybatis.dom.model;

import com.intellij.psi.xml.XmlTag;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.Convert;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.SubTagList;
import com.seventh7.mybatis.dom.converter.ParameterMapConverter;

import java.util.List;

/**
 * @author yanglin
 */
public interface GroupTwo extends GroupOne, IdDomElement{

  @SubTagList("bind")
  public List<Bind> getBinds();

  @Attribute("parameterMap")
  @Convert(ParameterMapConverter.class)
  public GenericAttributeValue<XmlTag> getParameterMap();

}
