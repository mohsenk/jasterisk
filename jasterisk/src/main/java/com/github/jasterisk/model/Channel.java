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
import com.github.jasterisk.model.CallerID;
import com.github.jasterisk.model.DialplanCEP;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A specific communication connection between Asterisk and an Endpoint.
 */
@ApiModel(description = "A specific communication connection between Asterisk and an Endpoint.")

public class Channel {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("caller")
  private CallerID caller = null;

  @SerializedName("connected")
  private CallerID connected = null;

  @SerializedName("accountcode")
  private String accountcode = null;

  @SerializedName("dialplan")
  private DialplanCEP dialplan = null;

  @SerializedName("creationtime")
  private OffsetDateTime creationtime = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("channelvars")
  private String channelvars = null;

  public Channel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the channel.  This is the same as the Uniqueid field in AMI.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the channel.  This is the same as the Uniqueid field in AMI.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Channel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the channel (i.e. SIP/foo-0000a7e3)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the channel (i.e. SIP/foo-0000a7e3)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Channel state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Channel caller(CallerID caller) {
    this.caller = caller;
    return this;
  }

   /**
   * Get caller
   * @return caller
  **/
  @ApiModelProperty(required = true, value = "")
  public CallerID getCaller() {
    return caller;
  }

  public void setCaller(CallerID caller) {
    this.caller = caller;
  }

  public Channel connected(CallerID connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @ApiModelProperty(required = true, value = "")
  public CallerID getConnected() {
    return connected;
  }

  public void setConnected(CallerID connected) {
    this.connected = connected;
  }

  public Channel accountcode(String accountcode) {
    this.accountcode = accountcode;
    return this;
  }

   /**
   * Get accountcode
   * @return accountcode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountcode() {
    return accountcode;
  }

  public void setAccountcode(String accountcode) {
    this.accountcode = accountcode;
  }

  public Channel dialplan(DialplanCEP dialplan) {
    this.dialplan = dialplan;
    return this;
  }

   /**
   * Current location in the dialplan
   * @return dialplan
  **/
  @ApiModelProperty(required = true, value = "Current location in the dialplan")
  public DialplanCEP getDialplan() {
    return dialplan;
  }

  public void setDialplan(DialplanCEP dialplan) {
    this.dialplan = dialplan;
  }

  public Channel creationtime(OffsetDateTime creationtime) {
    this.creationtime = creationtime;
    return this;
  }

   /**
   * Timestamp when channel was created
   * @return creationtime
  **/
  @ApiModelProperty(required = true, value = "Timestamp when channel was created")
  public OffsetDateTime getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(OffsetDateTime creationtime) {
    this.creationtime = creationtime;
  }

  public Channel language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The default spoken language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The default spoken language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Channel channelvars(String channelvars) {
    this.channelvars = channelvars;
    return this;
  }

   /**
   * Channel variables
   * @return channelvars
  **/
  @ApiModelProperty(value = "Channel variables")
  public String getChannelvars() {
    return channelvars;
  }

  public void setChannelvars(String channelvars) {
    this.channelvars = channelvars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.id, channel.id) &&
        Objects.equals(this.name, channel.name) &&
        Objects.equals(this.state, channel.state) &&
        Objects.equals(this.caller, channel.caller) &&
        Objects.equals(this.connected, channel.connected) &&
        Objects.equals(this.accountcode, channel.accountcode) &&
        Objects.equals(this.dialplan, channel.dialplan) &&
        Objects.equals(this.creationtime, channel.creationtime) &&
        Objects.equals(this.language, channel.language) &&
        Objects.equals(this.channelvars, channel.channelvars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, state, caller, connected, accountcode, dialplan, creationtime, language, channelvars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    caller: ").append(toIndentedString(caller)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    accountcode: ").append(toIndentedString(accountcode)).append("\n");
    sb.append("    dialplan: ").append(toIndentedString(dialplan)).append("\n");
    sb.append("    creationtime: ").append(toIndentedString(creationtime)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    channelvars: ").append(toIndentedString(channelvars)).append("\n");
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

