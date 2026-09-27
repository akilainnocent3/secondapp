package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5315q3 implements InterfaceC5541z5 {
    @Override // ds.l
    @oy.m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(@oy.l ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC5095hb.c(asString);
        if (Gm.a(mapC)) {
            return mapC;
        }
        AbstractC5077gj.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
