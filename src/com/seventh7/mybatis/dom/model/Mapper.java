package com.seventh7.mybatis.dom.model;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTagList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author yanglin
 */
public interface Mapper extends DomElement {

  @NotNull
  @Required
  @Attribute("namespace")
  public GenericAttributeValue<String> getNamespace();

  @NotNull
  @SubTagList("resultMap")
  public List<ResultMap> getResultMaps();

  @NotNull
  @SubTagList("parameterMap")
  public List<ParameterMap> getParameterMaps();

  @NotNull
  @SubTagList("sql")
  public List<Sql> getSqls();

  @NotNull
  @SubTagList("insert")
  public List<Insert> getInserts();

  @NotNull
  @SubTagList("update")
  public List<Update> getUpdates();

  @NotNull
  @SubTagList("delete")
  public List<Delete> getDeletes();

  @NotNull
  @SubTagList("select")
  public List<Select> getSelects();
}
