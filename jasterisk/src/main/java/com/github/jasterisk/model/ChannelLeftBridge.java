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
import com.github.jasterisk.model.Bridge;
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
 * Notification that a channel has left a bridge.
 */
@ApiModel(description = "Notification that a channel has left a bridge.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-02T16:24:17.590+02:00")
public class ChannelLeftBridge {
  @SerializedName("bridge")
  private Bridge bridge = null;

  @SerializedName("channel")
  private Channel channel = null;

  public ChannelLeftBridge bridge(Bridge bridge) {
    this.bridge = bridge;
    return this;
  }

   /**
   * Get bridge
   * @return bridge
  **/
  @ApiModelProperty(required = true, value = "")
  public Bridge getBridge() {
    return bridge;
  }

  public void setBridge(Bridge bridge) {
    this.bridge = bridge;
  }

  public ChannelLeftBridge channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "")
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
    ChannelLeftBridge channelLeftBridge = (ChannelLeftBridge) o;
    return Objects.equals(this.bridge, channelLeftBridge.bridge) &&
        Objects.equals(this.channel, channelLeftBridge.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridge, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelLeftBridge {\n");
    
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
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
