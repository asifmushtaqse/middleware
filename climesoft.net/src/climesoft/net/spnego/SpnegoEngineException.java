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
package climesoft.net.spnego;

/**
 * Signals SPNEGO protocol failure.
 */
public class SpnegoEngineException extends Exception {

  private static final long serialVersionUID = -3123799505052881438L;

  public SpnegoEngineException(String message) {
    super(message);
  }

  public SpnegoEngineException(String message, Throwable cause) {
    super(message, cause);
  }
}