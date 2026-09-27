package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j22 {
    public static Float a(String str) {
        if (str != null) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
                kotlin.jvm.internal.m0.o(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
                boolean z10 = ad1.f146762a;
            }
        }
        return null;
    }
}
