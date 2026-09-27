package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Vm extends N2 {
    public Vm(int i10, @NonNull String str) {
        this(i10, str, PublicLogger.getAnonymousInstance());
    }

    @k.h1(otherwise = 3)
    public final int b() {
        return this.f96189a;
    }

    public Vm(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @NonNull
    @k.h1(otherwise = 3)
    public final String a() {
        return this.f96190b;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final String a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i10 = this.f96189a;
            if (length <= i10) {
                return str;
            }
            String str2 = new String(bytes, 0, i10, "UTF-8");
            try {
                this.f96191c.warning("\"%s\" %s exceeded limit of %d bytes", this.f96190b, str, Integer.valueOf(this.f96189a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
