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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Notification that the source of video in a bridge has changed.
 */
@ApiModel(description = "Notification that the source of video in a bridge has changed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-02T16:24:17.590+02:00")
public class BridgeVideoSourceChanged {
  @SerializedName("bridge")
  private Bridge bridge = null;

  @SerializedName("old_video_source_id")
  private String oldVideoSourceId = null;

  public BridgeVideoSourceChanged bridge(Bridge bridge) {
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

  public BridgeVideoSourceChanged oldVideoSourceId(String oldVideoSourceId) {
    this.oldVideoSourceId = oldVideoSourceId;
    return this;
  }

   /**
   * Get oldVideoSourceId
   * @return oldVideoSourceId
  **/
  @ApiModelProperty(value = "")
  public String getOldVideoSourceId() {
    return oldVideoSourceId;
  }

  public void setOldVideoSourceId(String oldVideoSourceId) {
    this.oldVideoSourceId = oldVideoSourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeVideoSourceChanged bridgeVideoSourceChanged = (BridgeVideoSourceChanged) o;
    return Objects.equals(this.bridge, bridgeVideoSourceChanged.bridge) &&
        Objects.equals(this.oldVideoSourceId, bridgeVideoSourceChanged.oldVideoSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridge, oldVideoSourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeVideoSourceChanged {\n");
    
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    oldVideoSourceId: ").append(toIndentedString(oldVideoSourceId)).append("\n");
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

