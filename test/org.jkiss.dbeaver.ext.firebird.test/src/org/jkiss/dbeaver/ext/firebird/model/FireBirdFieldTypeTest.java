/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.firebird.model;

import org.jkiss.junit.DBeaverUnitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FireBirdFieldTypeTest extends DBeaverUnitTest {

    @Test
    public void testTimeZoneTypeNamesUseFirebirdSyntax() {
        Assertions.assertEquals("TIME WITH TIME ZONE", FireBirdFieldType.TIME_WITH_TIMEZONE.getName());
        Assertions.assertEquals("TIMESTAMP WITH TIME ZONE", FireBirdFieldType.TIMESTAMP_WITH_TIMEZONE.getName());
    }
}
