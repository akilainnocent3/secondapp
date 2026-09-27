package com.vungle.ads.internal.locale;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SystemLocaleInfo implements LocaleInfo {
    @Override // com.vungle.ads.internal.locale.LocaleInfo
    @l
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        m0.o(language, "getDefault().language");
        return language;
    }

    @Override // com.vungle.ads.internal.locale.LocaleInfo
    @l
    public String getTimeZoneId() {
        String id2 = TimeZone.getDefault().getID();
        m0.o(id2, "getDefault().id");
        return id2;
    }
}
