/*
 * Copyright (c) 2015 AsyncHttpClient Project. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 *     http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package climesoft.net.util;

public final class Assertions {

  private Assertions() {
  }

  public static <T> T assertNotNull(T value, String name) {
    if (value == null)
      throw new NullPointerException(name);
    return value;

  }

  public static String assertNotEmpty(String value, String name) {
    assertNotNull(value, name);
    if (value.length() == 0)
      throw new IllegalArgumentException("empty " + name);
    return value;
  }
}
