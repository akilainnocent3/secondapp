package com.yandex.div.histogram.util;

import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HistogramUtils {

    @l
    public static final HistogramUtils INSTANCE = new HistogramUtils();

    private HistogramUtils() {
    }

    public final int calculateUtf8JsonByteSize(@l JSONObject jSONObject) {
        return JSONUtf8BytesCalculator.Companion.calculateUtf8JsonBytes(jSONObject);
    }

    public final int calculateUtf8StringByteSize(@l String str) {
        int length = str.length();
        int utf8CharByteSize = 0;
        for (int i10 = 0; i10 < length; i10++) {
            utf8CharByteSize += getUtf8CharByteSize(str.charAt(i10));
        }
        return utf8CharByteSize;
    }

    public final int getUtf8CharByteSize(char c10) {
        if (Character.isHighSurrogate(c10)) {
            return 4;
        }
        if (Character.isLowSurrogate(c10)) {
            return 0;
        }
        if (c10 < 128) {
            return 1;
        }
        if (c10 < 2048) {
            return 2;
        }
        if (c10 < 0) {
            return 3;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unsupported character: '" + c10 + '\'');
        }
        return 4;
    }

    public final boolean shouldRecordHistogram(@HistogramCallType @l String str, @l HistogramRecordConfiguration histogramRecordConfiguration) {
        int iHashCode = str.hashCode();
        if (iHashCode != 2106116) {
            if (iHashCode != 2106217) {
                if (iHashCode == 2688677 && str.equals("Warm")) {
                    return histogramRecordConfiguration.isWarmRecordingEnabled();
                }
            } else if (str.equals("Cool")) {
                return histogramRecordConfiguration.isCoolRecordingEnabled();
            }
        } else if (str.equals("Cold")) {
            return histogramRecordConfiguration.isColdRecordingEnabled();
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (!Assert.isEnabled()) {
            return false;
        }
        Assert.fail("Unknown histogram call type: " + str);
        return false;
    }
}
