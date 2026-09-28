package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nve0 {
    public final boolean a;
    public final i0f0 b;
    public final boolean c;
    public final exe0 d;
    public final wse0 e;
    public final l0f0 f;
    public final boolean g;

    public nve0(boolean z, i0f0 i0f0Var, boolean z2, exe0 exe0Var, wse0 wse0Var, l0f0 l0f0Var, boolean z3) {
        i0f0Var.getClass();
        exe0Var.getClass();
        wse0Var.getClass();
        l0f0Var.getClass();
        this.a = z;
        this.b = i0f0Var;
        this.c = z2;
        this.d = exe0Var;
        this.e = wse0Var;
        this.f = l0f0Var;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nve0)) {
            return false;
        }
        nve0 nve0Var = (nve0) obj;
        return this.a == nve0Var.a && Intrinsics.g(this.b, nve0Var.b) && this.c == nve0Var.c && Intrinsics.g(this.d, nve0Var.d) && Intrinsics.g(this.e, nve0Var.e) && Intrinsics.g(this.f, nve0Var.f) && this.g == nve0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + mtg0.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGControlPanelState(isEditable=");
        sb.append(this.a);
        sb.append(", spinModeData=");
        sb.append(this.b);
        sb.append(", caveSwitchEnable=");
        sb.append(this.c);
        sb.append(", map=");
        sb.append(this.d);
        sb.append(", betButtonState=");
        sb.append(this.e);
        sb.append(", turboState=");
        sb.append(this.f);
        sb.append(", hasGiftButton=");
        return ruw.a(sb, this.g, ')');
    }

    public nve0() {
        this(0);
    }

    public /* synthetic */ nve0(int i) {
        this(true, new i0f0.b(0), true, new exe0(0), new wse0.b(true), new l0f0(0), false);
    }
}
