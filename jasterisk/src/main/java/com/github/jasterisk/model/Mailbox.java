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
 * Represents the state of a mailbox.
 */
@ApiModel(description = "Represents the state of a mailbox.")

public class Mailbox {
  @SerializedName("name")
  private String name = null;

  @SerializedName("old_messages")
  private Integer oldMessages = null;

  @SerializedName("new_messages")
  private Integer newMessages = null;

  public Mailbox name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the mailbox.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the mailbox.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Mailbox oldMessages(Integer oldMessages) {
    this.oldMessages = oldMessages;
    return this;
  }

   /**
   * Count of old messages in the mailbox.
   * @return oldMessages
  **/
  @ApiModelProperty(required = true, value = "Count of old messages in the mailbox.")
  public Integer getOldMessages() {
    return oldMessages;
  }

  public void setOldMessages(Integer oldMessages) {
    this.oldMessages = oldMessages;
  }

  public Mailbox newMessages(Integer newMessages) {
    this.newMessages = newMessages;
    return this;
  }

   /**
   * Count of new messages in the mailbox.
   * @return newMessages
  **/
  @ApiModelProperty(required = true, value = "Count of new messages in the mailbox.")
  public Integer getNewMessages() {
    return newMessages;
  }

  public void setNewMessages(Integer newMessages) {
    this.newMessages = newMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mailbox mailbox = (Mailbox) o;
    return Objects.equals(this.name, mailbox.name) &&
        Objects.equals(this.oldMessages, mailbox.oldMessages) &&
        Objects.equals(this.newMessages, mailbox.newMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, oldMessages, newMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mailbox {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oldMessages: ").append(toIndentedString(oldMessages)).append("\n");
    sb.append("    newMessages: ").append(toIndentedString(newMessages)).append("\n");
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

