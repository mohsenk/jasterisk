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
 * Notification that one bridge has merged into another.
 */
@ApiModel(description = "Notification that one bridge has merged into another.")

public class BridgeMerged {
  @SerializedName("bridge")
  private Bridge bridge = null;

  @SerializedName("bridge_from")
  private Bridge bridgeFrom = null;

  public BridgeMerged bridge(Bridge bridge) {
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

  public BridgeMerged bridgeFrom(Bridge bridgeFrom) {
    this.bridgeFrom = bridgeFrom;
    return this;
  }

   /**
   * Get bridgeFrom
   * @return bridgeFrom
  **/
  @ApiModelProperty(required = true, value = "")
  public Bridge getBridgeFrom() {
    return bridgeFrom;
  }

  public void setBridgeFrom(Bridge bridgeFrom) {
    this.bridgeFrom = bridgeFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeMerged bridgeMerged = (BridgeMerged) o;
    return Objects.equals(this.bridge, bridgeMerged.bridge) &&
        Objects.equals(this.bridgeFrom, bridgeMerged.bridgeFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridge, bridgeFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeMerged {\n");
    
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    bridgeFrom: ").append(toIndentedString(bridgeFrom)).append("\n");
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

