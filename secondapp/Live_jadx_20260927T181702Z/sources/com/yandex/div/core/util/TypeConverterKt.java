package com.yandex.div.core.util;

import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TypeConverterKt {
    public static final int toIntSafely(long j10) {
        long j11 = j10 >> 31;
        if (j11 == 0 || j11 == -1) {
            return (int) j10;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j10 + "' to Int");
        }
        return j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }
}
