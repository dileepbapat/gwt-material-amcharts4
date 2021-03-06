/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
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
 * #L%
 */
package gwt.material.design.amcore.client.formatter;

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amcore.client.base.BaseObject;
import gwt.material.design.amcore.client.base.Language;
import gwt.material.design.amcore.client.base.Sprite;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "am4core")
public class DateFormatter extends BaseObject {

    @JsProperty
    public boolean capitalize;

    @JsProperty
    public String dateFormat;

    @JsProperty
    public int firstDayOfWeek;

    @JsProperty
    public String inputDateFormat;

    @JsProperty
    public Language language;

    @JsProperty
    public Sprite sprite;

    @JsProperty
    public boolean utc;

    @JsMethod
    public native String format(Object source);

    @JsMethod
    public native String format(Object source, String format);

    @JsMethod
    public native JsDate parse(Object source);

    @JsOverlay
    public final Date _parse(Object source) {
        return new Date((long) parse(source).getTime());
    }

    @JsMethod
    public native JsDate parse(Object source, String format);

    @JsOverlay
    public final Date _parse(Object source, String format) {
        return new Date((long) parse(source, format).getTime());
    }
}
