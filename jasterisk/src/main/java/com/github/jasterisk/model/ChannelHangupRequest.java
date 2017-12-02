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
import com.github.jasterisk.model.Channel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A hangup was requested on the channel.
 */
@ApiModel(description = "A hangup was requested on the channel.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-02T16:24:17.590+02:00")
public class ChannelHangupRequest {
  @SerializedName("cause")
  private Integer cause = null;

  @SerializedName("soft")
  private Boolean soft = null;

  @SerializedName("channel")
  private Channel channel = null;

  public ChannelHangupRequest cause(Integer cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Integer representation of the cause of the hangup.
   * @return cause
  **/
  @ApiModelProperty(value = "Integer representation of the cause of the hangup.")
  public Integer getCause() {
    return cause;
  }

  public void setCause(Integer cause) {
    this.cause = cause;
  }

  public ChannelHangupRequest soft(Boolean soft) {
    this.soft = soft;
    return this;
  }

   /**
   * Whether the hangup request was a soft hangup request.
   * @return soft
  **/
  @ApiModelProperty(value = "Whether the hangup request was a soft hangup request.")
  public Boolean isSoft() {
    return soft;
  }

  public void setSoft(Boolean soft) {
    this.soft = soft;
  }

  public ChannelHangupRequest channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel on which the hangup was requested.
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "The channel on which the hangup was requested.")
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelHangupRequest channelHangupRequest = (ChannelHangupRequest) o;
    return Objects.equals(this.cause, channelHangupRequest.cause) &&
        Objects.equals(this.soft, channelHangupRequest.soft) &&
        Objects.equals(this.channel, channelHangupRequest.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, soft, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelHangupRequest {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    soft: ").append(toIndentedString(soft)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

