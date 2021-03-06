/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.nui.itemRendering;

import java.util.Objects;

/**
 * This ItemRenderer displays the result of the object's toString() method. If the object is null, 'null' is displayed.
 *
 * @author Immortius
 */
public class ToStringTextRenderer<T> extends StringTextRenderer<T> {

    @Override
    public String getString(T value) {
        return Objects.toString(value);
    }
}
