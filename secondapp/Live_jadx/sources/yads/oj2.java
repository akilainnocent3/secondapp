package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oj2 {
    public static String a(long j10) {
        long jCeil = (long) Math.ceil(j10 / 1000);
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)}, 2));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
