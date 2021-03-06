/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.wave.client.autohide;

/**
 * Interface for things that use AutoHiders to interpret incoming events and
 * notify AutoHiders when they should hide.
 *
 */
public interface AutoHiderRegistrar {
  /**
   * @param autoHider AutoHider that should be considered when processing
   *        incoming events.
   */
  void registerAutoHider(AutoHider autoHider);

  /**
   * @param autoHider AutoHider that should no longer be considered when
   *        processing incoming events.
   */
  void deregisterAutoHider(AutoHider autoHider);
}
