/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jasterisk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A key/value pair variable in a text message.
 */
@ApiModel(description = "A key/value pair variable in a text message.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-02T16:24:17.590+02:00")
public class TextMessageVariable {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public TextMessageVariable key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A unique key identifying the variable.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "A unique key identifying the variable.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public TextMessageVariable value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the variable.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the variable.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextMessageVariable textMessageVariable = (TextMessageVariable) o;
    return Objects.equals(this.key, textMessageVariable.key) &&
        Objects.equals(this.value, textMessageVariable.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextMessageVariable {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

