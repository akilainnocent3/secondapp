package com.yandex.div.histogram.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class JSONUtf8BytesCalculator {
    private static final int ARRAY_BRACKETS_BYTES = 2;

    @l
    public static final Companion Companion = new Companion(null);
    private static final int ENTRIES_SEPARATOR_BYTES = 1;
    private static final int ESCAPED_CHARACTERS_BYTES = 2;
    private static final int FALSE_BYTES = 5;
    private static final int KEY_VALUE_SEPARATOR_BYTES = 1;
    private static final int NULL_BYTES = 4;
    private static final int OBJECT_BRACES_BYTES = 2;
    private static final int QUOTES_BYTES = 2;
    private static final int TRUE_BYTES = 4;
    private int bytesSize;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateUtf8JsonArrayBytes(JSONArray jSONArray, JSONUtf8BytesCalculator jSONUtf8BytesCalculator) {
            jSONUtf8BytesCalculator.array().entriesSeparator(jSONArray.length());
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jSONUtf8BytesCalculator.value(jSONArray.get(i10));
            }
        }

        public final int calculateUtf8JsonBytes(@l JSONObject jSONObject) {
            JSONUtf8BytesCalculator jSONUtf8BytesCalculator = new JSONUtf8BytesCalculator();
            calculateUtf8JsonBytes(jSONObject, jSONUtf8BytesCalculator);
            return jSONUtf8BytesCalculator.bytesSize;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateUtf8JsonBytes(JSONObject jSONObject, JSONUtf8BytesCalculator jSONUtf8BytesCalculator) {
            jSONUtf8BytesCalculator.object().entriesSeparator(jSONObject.length());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONUtf8BytesCalculator.key(next).keyValueSeparator().value(jSONObject.get(next));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator array() {
        this.bytesSize += 2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator entriesSeparator(int i10) {
        if (i10 <= 1) {
            return this;
        }
        this.bytesSize += i10 - 1;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator key(String str) {
        string(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator keyValueSeparator() {
        this.bytesSize++;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator object() {
        this.bytesSize += 2;
        return this;
    }

    private final void string(String str) {
        int utf8CharByteSize;
        this.bytesSize += 2;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = this.bytesSize;
            if (cCharAt == '\"' || cCharAt == '\\' || cCharAt == '/' || cCharAt == '\t' || cCharAt == '\b' || cCharAt == '\n' || cCharAt == '\r') {
                utf8CharByteSize = 2;
            } else if (cCharAt <= 31) {
                HistogramUtils histogramUtils = HistogramUtils.INSTANCE;
                u1 u1Var = u1.f102789a;
                String str2 = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(cCharAt)}, 1));
                m0.o(str2, "format(format, *args)");
                utf8CharByteSize = histogramUtils.calculateUtf8StringByteSize(str2);
            } else {
                utf8CharByteSize = HistogramUtils.INSTANCE.getUtf8CharByteSize(cCharAt);
            }
            this.bytesSize = i11 + utf8CharByteSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONUtf8BytesCalculator value(Object obj) {
        if (obj instanceof JSONArray) {
            Companion.calculateUtf8JsonArrayBytes((JSONArray) obj, this);
            return this;
        }
        if (obj instanceof JSONObject) {
            Companion.calculateUtf8JsonBytes((JSONObject) obj, this);
            return this;
        }
        if (obj == null || obj == JSONObject.NULL) {
            this.bytesSize += 4;
            return this;
        }
        if (obj instanceof Boolean) {
            this.bytesSize += ((Boolean) obj).booleanValue() ? 4 : 5;
            return this;
        }
        if (obj instanceof Number) {
            this.bytesSize += HistogramUtils.INSTANCE.calculateUtf8StringByteSize(JSONObject.numberToString((Number) obj));
            return this;
        }
        string(obj.toString());
        return this;
    }
}
