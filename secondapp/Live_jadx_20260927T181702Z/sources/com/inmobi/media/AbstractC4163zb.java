package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: renamed from: com.inmobi.media.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4163zb {
    public static final ContentValues a(C3939qb c3939qb) {
        kotlin.jvm.internal.m0.p(c3939qb, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", c3939qb.f57426a);
        contentValues.put("saveTimestamp", Long.valueOf(c3939qb.f57427b));
        contentValues.put("retryCount", Integer.valueOf(c3939qb.f57428c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c3939qb.f57429d));
        contentValues.put("checkpoints", Integer.valueOf(c3939qb.f57431f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c3939qb.f57430e ? 1 : 0));
        return contentValues;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x005a  */
    public static final C3939qb a(ContentValues contentValues) {
        boolean z10;
        kotlin.jvm.internal.m0.p(contentValues, "<this>");
        String asString = contentValues.getAsString("filename");
        kotlin.jvm.internal.m0.o(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        kotlin.jvm.internal.m0.o(asLong, "getAsLong(...)");
        long jLongValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        kotlin.jvm.internal.m0.o(asInteger, "getAsInteger(...)");
        int iIntValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        kotlin.jvm.internal.m0.o(asLong2, "getAsLong(...)");
        long jLongValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        kotlin.jvm.internal.m0.o(asInteger2, "getAsInteger(...)");
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        if (asInteger3 != null) {
            z10 = asInteger3.intValue() == 1;
        }
        return new C3939qb(asString, jLongValue, iIntValue, jLongValue2, z10, iIntValue2);
    }
}
