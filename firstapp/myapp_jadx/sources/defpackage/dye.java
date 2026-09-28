package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class dye {
    public final Long a;
    public final IntRange b;
    public final ijf0 c;
    public final uxs d;
    public final boolean e;
    public final boolean f;
    public final zwe g;
    public final boolean h;
    public final String i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dye(int i) {
        this(null, new IntRange(1900, n11.c(), 1), new ijf0((String) null, 0L, 7), uxs.DISABLE, true, true, null, false, "");
        n11 n11Var = n11.a;
    }

    public static dye a(dye dyeVar, Long l, ijf0 ijf0Var, uxs uxsVar, boolean z, boolean z2, zwe zweVar, boolean z3, String str, int i) {
        if ((i & 1) != 0) {
            l = dyeVar.a;
        }
        Long l2 = l;
        IntRange intRange = dyeVar.b;
        if ((i & 4) != 0) {
            ijf0Var = dyeVar.c;
        }
        ijf0 ijf0Var2 = ijf0Var;
        if ((i & 8) != 0) {
            uxsVar = dyeVar.d;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 16) != 0) {
            z = dyeVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = dyeVar.f;
        }
        boolean z5 = z2;
        zwe zweVar2 = (i & 64) != 0 ? dyeVar.g : zweVar;
        boolean z6 = (i & 128) != 0 ? dyeVar.h : z3;
        String str2 = (i & 256) != 0 ? dyeVar.i : str;
        dyeVar.getClass();
        intRange.getClass();
        ijf0Var2.getClass();
        uxsVar2.getClass();
        str2.getClass();
        return new dye(l2, intRange, ijf0Var2, uxsVar2, z4, z5, zweVar2, z6, str2);
    }

    public final ijf0 b() {
        s9e0 s9e0Var = s9e0.a;
        Long l = this.a;
        String strO = l != null ? bwf0.o((6 & 4) != 0 ? 0 : 1, l.longValue(), false) : "";
        s9e0Var.getClass();
        return new ijf0(strO, 0L, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dye)) {
            return false;
        }
        dye dyeVar = (dye) obj;
        return Intrinsics.g(this.a, dyeVar.a) && Intrinsics.g(this.b, dyeVar.b) && Intrinsics.g(this.c, dyeVar.c) && this.d == dyeVar.d && this.e == dyeVar.e && this.f == dyeVar.f && Intrinsics.g(this.g, dyeVar.g) && this.h == dyeVar.h && Intrinsics.g(this.i, dyeVar.i);
    }

    public final int hashCode() {
        Long l = this.a;
        int iA = mtg0.a(mtg0.a(y45.a(this.d, ey1.b(this.c, (this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
        zwe zweVar = this.g;
        return this.i.hashCode() + mtg0.a((iA + (zweVar != null ? zweVar.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DobVerificationState(dobInMillis=");
        sb.append(this.a);
        sb.append(", yearRange=");
        sb.append(this.b);
        sb.append(", nin=");
        sb.append(this.c);
        sb.append(", buttonStatus=");
        sb.append(this.d);
        sb.append(llGRV.UvrEfuWEcfQo);
        nng.a(", enableNinField=", ", activeDialog=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", shouldShowDatePicker=");
        sb.append(this.h);
        sb.append(", content=");
        return uf80.a(sb, this.i, ")");
    }

    public dye(Long l, IntRange intRange, ijf0 ijf0Var, uxs uxsVar, boolean z, boolean z2, zwe zweVar, boolean z3, String str) {
        this.a = l;
        this.b = intRange;
        this.c = ijf0Var;
        this.d = uxsVar;
        this.e = z;
        this.f = z2;
        this.g = zweVar;
        this.h = z3;
        this.i = str;
    }

    public dye() {
        this(0);
    }
}
