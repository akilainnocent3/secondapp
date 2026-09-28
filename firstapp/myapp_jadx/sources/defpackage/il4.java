package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class il4 {
    public final hl4 a;
    public final zn4 b;
    public final float c;
    public final float d;
    public final float e;
    public final String f;
    public final mo4 g;
    public final im4 h;
    public final zi4 i;
    public final List<ck4> j;
    public final List<vj4> k;
    public final xj4 l;

    public static final class a {
        public static il4 a(int i, String str) {
            zn4 zn4Var = new zn4(0);
            if ((i & 32) != 0) {
                str = "";
            }
            String str2 = str;
            str2.getClass();
            float f = (7.0f - 2.0f) / 2.0f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            return new il4(zn4Var, str2, new mo4(2), new zi4(f, f, Math.max(0.0f, 12.0f - 2.0f), 480), 3725);
        }
    }

    public il4(zn4 zn4Var, String str, mo4 mo4Var, zi4 zi4Var, int i) {
        hl4 hl4Var = hl4.a;
        zn4 zn4Var2 = (i & 2) != 0 ? new zn4(0) : zn4Var;
        String str2 = (i & 32) != 0 ? "" : str;
        mo4 mo4Var2 = (i & 64) != 0 ? new mo4(3) : mo4Var;
        im4 im4Var = new im4(0, 0);
        zi4 zi4Var2 = (i & 256) != 0 ? new zi4(0.0f, 0.0f, 0.0f, 511) : zi4Var;
        m2g m2gVar = m2g.a;
        this(hl4Var, zn4Var2, 0.0f, 0.0f, 0.0f, str2, mo4Var2, im4Var, zi4Var2, m2gVar, m2gVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il4)) {
            return false;
        }
        il4 il4Var = (il4) obj;
        return this.a == il4Var.a && Intrinsics.g(this.b, il4Var.b) && Float.compare(this.c, il4Var.c) == 0 && Float.compare(this.d, il4Var.d) == 0 && Float.compare(this.e, il4Var.e) == 0 && Intrinsics.g(this.f, il4Var.f) && Intrinsics.g(this.g, il4Var.g) && Intrinsics.g(this.h, il4Var.h) && Intrinsics.g(this.i, il4Var.i) && Intrinsics.g(this.j, il4Var.j) && Intrinsics.g(this.k, il4Var.k) && this.l == il4Var.l;
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + gmf0.a(tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f)) * 31)) * 31)) * 31, 31, this.j), 31, this.k);
        xj4 xj4Var = this.l;
        return iA + (xj4Var == null ? 0 : xj4Var.hashCode());
    }

    public final String toString() {
        return "BonusCupGameState(phase=" + this.a + ", playfield=" + this.b + ", elapsedSeconds=" + this.c + ", displayedTimerProgress=" + this.d + ", displayedSecondsRemaining=" + this.e + ", currency=" + this.f + ", reward=" + this.g + ", hazards=" + this.h + ", cup=" + this.i + ", fallingObjects=" + this.j + ", effects=" + this.k + ", endReason=" + this.l + ')';
    }

    public il4(hl4 hl4Var, zn4 zn4Var, float f, float f2, float f3, String str, mo4 mo4Var, im4 im4Var, zi4 zi4Var, List<ck4> list, List<vj4> list2, xj4 xj4Var) {
        hl4Var.getClass();
        zn4Var.getClass();
        str.getClass();
        mo4Var.getClass();
        zi4Var.getClass();
        list.getClass();
        list2.getClass();
        this.a = hl4Var;
        this.b = zn4Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = str;
        this.g = mo4Var;
        this.h = im4Var;
        this.i = zi4Var;
        this.j = list;
        this.k = list2;
        this.l = xj4Var;
    }

    public il4() {
        this(null, null, null, null, 4095);
    }
}
