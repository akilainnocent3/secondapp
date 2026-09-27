package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5171ka implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    @oy.m
    public final C4912a9 a(@oy.m C5142j7 c5142j7) {
        C4912a9 c4912a9 = null;
        if ((c5142j7 != null ? c5142j7.f97609b : null) != null && c5142j7.f97610c != null) {
            c4912a9 = new C4912a9();
            c4912a9.f96927b = c5142j7.f97609b.doubleValue();
            c4912a9.f96926a = c5142j7.f97610c.doubleValue();
            Integer num = c5142j7.f97611d;
            if (num != null) {
                c4912a9.f96932g = num.intValue();
            }
            Integer num2 = c5142j7.f97612e;
            if (num2 != null) {
                c4912a9.f96930e = num2.intValue();
            }
            Integer num3 = c5142j7.f97613f;
            if (num3 != null) {
                c4912a9.f96929d = num3.intValue();
            }
            Integer num4 = c5142j7.f97614g;
            if (num4 != null) {
                c4912a9.f96931f = num4.intValue();
            }
            Long l10 = c5142j7.f97615h;
            if (l10 != null) {
                c4912a9.f96928c = TimeUnit.MILLISECONDS.toSeconds(l10.longValue());
            }
            String str = c5142j7.f97616i;
            if (str != null) {
                if (kotlin.jvm.internal.m0.g(str, "gps")) {
                    c4912a9.f96933h = 1;
                } else if (kotlin.jvm.internal.m0.g(str, "network")) {
                    c4912a9.f96933h = 2;
                }
            }
            String str2 = c5142j7.f97617j;
            if (str2 != null) {
                c4912a9.f96934i = str2;
            }
        }
        return c4912a9;
    }
}
