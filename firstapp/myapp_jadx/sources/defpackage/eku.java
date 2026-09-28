package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class eku extends pp4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final il4 i;

    public eku(boolean z, boolean z2, boolean z3, double d, String str, int i, int i2, int i3, il4 il4Var) {
        str.getClass();
        il4Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = d;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = il4Var;
    }

    public static eku a(eku ekuVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = ekuVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = ekuVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = ekuVar.c;
        }
        double d = ekuVar.d;
        String str = ekuVar.e;
        int i2 = ekuVar.f;
        int i3 = ekuVar.g;
        int i4 = ekuVar.h;
        il4 il4Var = ekuVar.i;
        str.getClass();
        il4Var.getClass();
        return new eku(z4, z5, z3, d, str, i2, i3, i4, il4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eku)) {
            return false;
        }
        eku ekuVar = (eku) obj;
        return this.a == ekuVar.a && this.b == ekuVar.b && this.c == ekuVar.c && Double.compare(this.d, ekuVar.d) == 0 && Intrinsics.g(this.e, ekuVar.e) && this.f == ekuVar.f && this.g == ekuVar.g && this.h == ekuVar.h && Intrinsics.g(this.i, ekuVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gpp.a(this.h, gpp.a(this.g, gpp.a(this.f, gmf0.a(nrg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        return "MainBonusCupUIState(showGameInstructions=" + this.a + ", showNativeCupBeforeGameplay=" + this.b + ", movementControlsEnabled=" + this.c + ", reward=" + this.d + ", currency=" + this.e + ", secondsRemaining=" + this.f + TEFcJcMqR.qJKIanepV + this.g + ", redCards=" + this.h + ", gameState=" + this.i + ')';
    }
}
