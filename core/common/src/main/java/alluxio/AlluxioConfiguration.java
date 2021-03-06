/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio;

import alluxio.conf.Source;
import alluxio.wire.ConfigProperty;
import alluxio.wire.Scope;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Alluxio configuration.
 */
public interface AlluxioConfiguration {
  /**
   * Gets the value for the given key in the {@link Properties}; if this key is not found, a
   * RuntimeException is thrown.
   *
   * @param key the key to get the value for
   * @return the value for the given key
   */
  String get(PropertyKey key);

  /**
   * Gets the value for the given key in the {@link Properties}; if this key is not found, a
   * RuntimeException is thrown.
   *
   * @param key the key to get the value for
   * @param options options for getting configuration value
   * @return the value for the given key
   */
  String get(PropertyKey key, ConfigurationValueOptions options);

  /**
   * Checks if the configuration contains value for the given key.
   *
   * @param key the key to check
   * @return true if there is value for the key, false otherwise
   */
  boolean containsKey(PropertyKey key);

  /**
   * Gets the integer representation of the value for the given key.
   *
   * @param key the key to get the value for
   * @return the value for the given key as an {@code int}
   */
  int getInt(PropertyKey key);

  /**
   * Gets the long representation of the value for the given key.
   *
   * @param key the key to get the value for
   * @return the value for the given key as a {@code long}
   */
  long getLong(PropertyKey key);

  /**
   * Gets the double representation of the value for the given key.
   *
   * @param key the key to get the value for
   * @return the value for the given key as a {@code double}
   */
  double getDouble(PropertyKey key);

  /**
   * Gets the float representation of the value for the given key.
   *
   * @param key the key to get the value for
   * @return the value for the given key as a {@code float}
   */
  float getFloat(PropertyKey key);

  /**
   * Gets the boolean representation of the value for the given key.
   *
   * @param key the key to get the value for
   * @return the value for the given key as a {@code boolean}
   */
  boolean getBoolean(PropertyKey key);

  /**
   * Gets the value for the given key as a list.
   *
   * @param key the key to get the value for
   * @param delimiter the delimiter to split the values
   * @return the list of values for the given key
   */
  List<String> getList(PropertyKey key, String delimiter);

  /**
   * Gets the value for the given key as an enum value.
   *
   * @param key the key to get the value for
   * @param enumType the type of the enum
   * @param <T> the type of the enum
   * @return the value for the given key as an enum value
   */
  <T extends Enum<T>> T getEnum(PropertyKey key, Class<T> enumType);

  /**
   * Gets the bytes of the value for the given key.
   *
   * @param key the key to get the value for
   * @return the bytes of the value for the given key
   */
  long getBytes(PropertyKey key);

  /**
   * Gets the time of key in millisecond unit.
   *
   * @param key the key to get the value for
   * @return the time of key in millisecond unit
   */
  long getMs(PropertyKey key);

  /**
   * Gets the time of the key as a duration.
   *
   * @param key the key to get the value for
   * @return the value of the key represented as a duration
   */
  Duration getDuration(PropertyKey key);

  /**
   * Gets the value for the given key as a class.
   *
   * @param key the key to get the value for
   * @param <T> the type of the class
   * @return the value for the given key as a class
   */
  <T> Class<T> getClass(PropertyKey key);

  /**
   * Gets a set of properties that share a given common prefix key as a map. E.g., if A.B=V1 and
   * A.C=V2, calling this method with prefixKey=A returns a map of {B=V1, C=V2}, where B and C are
   * also valid properties. If no property shares the prefix, an empty map is returned.
   *
   * @param prefixKey the prefix key
   * @return a map from nested properties aggregated by the prefix
   */
  Map<String, String> getNestedProperties(PropertyKey prefixKey);

  /**
   * @return a map of the properties represented by this configuration,
   *         including all default properties
   *
   * @param options options for getting configuration value
   */
  Map<String, String> toMap(ConfigurationValueOptions options);

  /**
   * @return a view of the resolved properties represented by this configuration,
   *         including all default properties
   */
  Map<String, String> toMap();

  /**
   * @return a map of the raw properties represented by this configuration,
   *         including all default properties
   */
  Map<String, String> toRawMap();

  /**
   * @param key the property key
   * @return the source for the given key
   */
  Source getSource(PropertyKey key);

  /**
   * Gets the raw configuration of a given scope.
   *
   * @param scope the property key scope
   * @return a list of raw configurations inside the property scope
   */
  List<ConfigProperty> getConfiguration(Scope scope);

  /**
   * Merges the current configuration properties with new properties. If a property exists
   * both in the new and current configuration, the one from the new configuration wins if
   * its priority is higher or equal than the existing one.
   *
   * @param properties the source {@link Properties} to be merged
   * @param source the source of the the properties (e.g., system property, default and etc)
   */
  void merge(Map<?, ?> properties, Source source);

  /**
   * Validates the configuration.
   *
   * @throws IllegalStateException if invalid configuration is encountered
   */
  void validate();
}
