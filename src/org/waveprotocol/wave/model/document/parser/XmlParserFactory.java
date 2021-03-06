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
package org.waveprotocol.wave.model.document.parser;


/**
 * Creates a XmlPullParser.
 *
 */
public class XmlParserFactory {
  private XmlParserFactory() {}

  /**
   * XmlPullParser that parses and validates entire xml string on creation.
   */
  public static SafeXmlPullParser buffered(String xml) throws XmlParseException {
    BufferedXmlParser xmlParserImpl = new BufferedXmlParser(xml);
    return xmlParserImpl;
  }

  /**
   * XmlPullParser that lazily parses and validates xml string. The validation
   * is done as each item is parsed, some preliminary validation might also be
   * done at initialization time.
   */
  public static XmlPullParser unbuffered(String xml) throws XmlParseException {
    return new StreamingXmlParser(xml);
  }
}
