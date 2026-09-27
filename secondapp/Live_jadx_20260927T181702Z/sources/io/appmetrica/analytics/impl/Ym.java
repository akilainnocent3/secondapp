package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ym extends N2 {
    public Ym(int i10, @NonNull String str) {
        this(i10, str, PublicLogger.getAnonymousInstance());
    }

    @k.h1(otherwise = 3)
    public final int b() {
        return this.f96189a;
    }

    public Ym(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final String a(@Nullable String str) {
        if (str != null) {
            int length = str.length();
            int i10 = this.f96189a;
            if (length > i10) {
                String strSubstring = str.substring(0, i10);
                this.f96191c.warning("\"%s\" %s size exceeded limit of %d characters", this.f96190b, str, Integer.valueOf(this.f96189a));
                return strSubstring;
            }
        }
        return str;
    }

    @NonNull
    @k.h1(otherwise = 3)
    public final String a() {
        return this.f96190b;
    }
}
