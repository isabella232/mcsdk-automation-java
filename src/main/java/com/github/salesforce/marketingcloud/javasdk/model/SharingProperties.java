/*
 * Marketing Cloud REST API
 * Marketing Cloud's REST API is our newest API. It supports multi-channel use cases, is much more lightweight and easy to use than our SOAP API, and is getting more comprehensive with every release.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: mc_sdk@salesforce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.salesforce.marketingcloud.javasdk.model;

import java.util.Objects;
import java.util.Arrays;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * SharingProperties
 */

public class SharingProperties {
  /**
   * Indicates the permission that you are granting to the list of MIDs in sharedWith. Possible values are view, edit, or local.
   */
  @JsonAdapter(SharingTypeEnum.Adapter.class)
  public enum SharingTypeEnum {
    VIEW("view"),
    
    EDIT("edit"),
    
    LOCAL("local");

    private String value;

    SharingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SharingTypeEnum fromValue(String text) {
      for (SharingTypeEnum b : SharingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SharingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SharingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SharingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SharingTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sharingType")
  private SharingTypeEnum sharingType = null;

  @SerializedName("sharedWith")
  private List<Integer> sharedWith = null;

  public SharingProperties sharingType(SharingTypeEnum sharingType) {
    this.sharingType = sharingType;
    return this;
  }

   /**
   * Indicates the permission that you are granting to the list of MIDs in sharedWith. Possible values are view, edit, or local.
   * @return sharingType
  **/
  @ApiModelProperty(value = "Indicates the permission that you are granting to the list of MIDs in sharedWith. Possible values are view, edit, or local.")
  public SharingTypeEnum getSharingType() {
    return sharingType;
  }

  public void setSharingType(SharingTypeEnum sharingType) {
    this.sharingType = sharingType;
  }

  public SharingProperties sharedWith(List<Integer> sharedWith) {
    this.sharedWith = sharedWith;
    return this;
  }

  public SharingProperties addSharedWithItem(Integer sharedWithItem) {
    if (this.sharedWith == null) {
      this.sharedWith = new ArrayList<Integer>();
    }
    this.sharedWith.add(sharedWithItem);
    return this;
  }

   /**
   * List of MID IDs the asset is shared with
   * @return sharedWith
  **/
 @Size(max=100)  @ApiModelProperty(value = "List of MID IDs the asset is shared with")
  public List<Integer> getSharedWith() {
    return sharedWith;
  }

  public void setSharedWith(List<Integer> sharedWith) {
    this.sharedWith = sharedWith;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingProperties sharingProperties = (SharingProperties) o;
    return Objects.equals(this.sharingType, sharingProperties.sharingType) &&
        Objects.equals(this.sharedWith, sharingProperties.sharedWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharingType, sharedWith);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingProperties {\n");
    
    sb.append("    sharingType: ").append(toIndentedString(sharingType)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
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

