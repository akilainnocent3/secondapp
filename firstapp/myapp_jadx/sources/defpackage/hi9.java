package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hi9 {
    public static final op8 a = new op8(-1752433878, new gi9(0), false);

    public static final boolean a(RegularMarketRule regularMarketRule) {
        String str = regularMarketRule != null ? regularMarketRule.a : null;
        if (Intrinsics.g(str, "60200")) {
            return true;
        }
        slc.a.getClass();
        return Intrinsics.g(str, slc.d) || Intrinsics.g(str, "60100");
    }

    public static final eku b(il4 il4Var) {
        il4Var.getClass();
        double d = il4Var.g.b;
        String str = il4Var.f;
        int i = (int) il4Var.e;
        im4 im4Var = il4Var.h;
        int i2 = im4Var.a;
        int i3 = im4Var.b;
        if ((7 & 8) != 0) {
            d = 0.0d;
        }
        if ((7 & 16) != 0) {
            str = "";
        }
        if ((7 & 32) != 0) {
            i = 0;
        }
        int i4 = (7 & 64) != 0 ? 0 : i2;
        int i5 = (7 & 128) == 0 ? i3 : 0;
        if ((7 & 256) != 0) {
            il4Var = il4.a.a(63, null);
        }
        return new eku(false, false, true, d, str, i, i4, i5, il4Var);
    }
}
