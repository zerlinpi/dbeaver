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

public class FireBirdTriggerTypeTest extends DBeaverUnitTest {

    @Test
    public void testUpdateOrInsertTriggerTypes() {
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_UPDATE_OR_INSERT, FireBirdTriggerType.getByType(11));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_UPDATE_OR_INSERT, FireBirdTriggerType.getByType(12));
    }

    @Test
    public void testReorderedTwoActionTriggerTypes() {
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_DELETE_OR_INSERT, FireBirdTriggerType.getByType(13));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_DELETE_OR_INSERT, FireBirdTriggerType.getByType(14));
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_DELETE_OR_UPDATE, FireBirdTriggerType.getByType(21));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_DELETE_OR_UPDATE, FireBirdTriggerType.getByType(22));
    }

    @Test
    public void testReorderedThreeActionTriggerTypes() {
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_DELETE_OR_UPDATE_OR_INSERT, FireBirdTriggerType.getByType(53));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_DELETE_OR_UPDATE_OR_INSERT, FireBirdTriggerType.getByType(54));
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_UPDATE_OR_DELETE_OR_INSERT, FireBirdTriggerType.getByType(59));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_UPDATE_OR_DELETE_OR_INSERT, FireBirdTriggerType.getByType(60));
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_DELETE_OR_INSERT_OR_UPDATE, FireBirdTriggerType.getByType(77));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_DELETE_OR_INSERT_OR_UPDATE, FireBirdTriggerType.getByType(78));
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_INSERT_OR_DELETE_OR_UPDATE, FireBirdTriggerType.getByType(89));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_INSERT_OR_DELETE_OR_UPDATE, FireBirdTriggerType.getByType(90));
        Assertions.assertEquals(FireBirdTriggerType.BEFORE_UPDATE_OR_INSERT_OR_DELETE, FireBirdTriggerType.getByType(107));
        Assertions.assertEquals(FireBirdTriggerType.AFTER_UPDATE_OR_INSERT_OR_DELETE, FireBirdTriggerType.getByType(108));
    }

    @Test
    public void testAllTriggerTypesRoundTrip() {
        for (FireBirdTriggerType triggerType : FireBirdTriggerType.values()) {
            Assertions.assertSame(triggerType, FireBirdTriggerType.getByType(triggerType.getType()));
        }
    }
}
