/*
 * Created on Dec 21, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2012 the original author or authors.
 */
package org.assertj.core.assertions.data;

import static junit.framework.Assert.assertEquals;
import static org.assertj.core.assertions.data.MapEntry.entry;

import org.assertj.core.assertions.data.MapEntry;
import org.junit.*;

/**
 * Tests for <{@link MapEntry#toString()}.
 *
 * @author Alex Ruiz
 */
public class MapEntry_toString_Test {
  private static MapEntry entry;

  @BeforeClass
  public static void setUpOnce() {
    entry = entry("name", "Yoda");
  }

  @Test
  public void should_implement_toString() {
    assertEquals("MapEntry[key='name', value='Yoda']", entry.toString());
  }
}