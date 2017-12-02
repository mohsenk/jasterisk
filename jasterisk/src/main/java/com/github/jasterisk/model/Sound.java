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
import com.github.jasterisk.model.FormatLangPair;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A media file that may be played back.
 */
@ApiModel(description = "A media file that may be played back.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-02T16:24:17.590+02:00")
public class Sound {
  @SerializedName("id")
  private String id = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("formats")
  private List<FormatLangPair> formats = new ArrayList<>();

  public Sound id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Sound&#39;s identifier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Sound's identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Sound text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text description of the sound, usually the words spoken.
   * @return text
  **/
  @ApiModelProperty(value = "Text description of the sound, usually the words spoken.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Sound formats(List<FormatLangPair> formats) {
    this.formats = formats;
    return this;
  }

  public Sound addFormatsItem(FormatLangPair formatsItem) {
    this.formats.add(formatsItem);
    return this;
  }

   /**
   * The formats and languages in which this sound is available.
   * @return formats
  **/
  @ApiModelProperty(required = true, value = "The formats and languages in which this sound is available.")
  public List<FormatLangPair> getFormats() {
    return formats;
  }

  public void setFormats(List<FormatLangPair> formats) {
    this.formats = formats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sound sound = (Sound) o;
    return Objects.equals(this.id, sound.id) &&
        Objects.equals(this.text, sound.text) &&
        Objects.equals(this.formats, sound.formats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, formats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sound {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
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

