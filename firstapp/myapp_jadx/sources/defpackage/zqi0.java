package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zqi0 {
    public final boolean a;
    public final oui0 b;
    public final vri0 c;
    public final vri0 d;
    public final dpi0 e;
    public final tui0 f;
    public final boolean g;

    public /* synthetic */ zqi0(int i) {
        this(true, new oui0.b(new yoi0(0)), new vri0(0), new vri0(0), new dpi0.b(true), new tui0(0), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqi0)) {
            return false;
        }
        zqi0 zqi0Var = (zqi0) obj;
        return this.a == zqi0Var.a && Intrinsics.g(this.b, zqi0Var.b) && Intrinsics.g(this.c, zqi0Var.c) && Intrinsics.g(this.d, zqi0Var.d) && Intrinsics.g(this.e, zqi0Var.e) && Intrinsics.g(this.f, zqi0Var.f) && this.g == zqi0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDControlPanelState(isEditable=");
        sb.append(this.a);
        sb.append(", spinModeData=");
        sb.append(this.b);
        sb.append(", segment=");
        sb.append(this.c);
        sb.append(", risk=");
        sb.append(this.d);
        sb.append(", betButtonState=");
        sb.append(this.e);
        sb.append(", turboState=");
        sb.append(this.f);
        sb.append(", hasGiftButton=");
        return ruw.a(sb, this.g, ')');
    }

    public zqi0(boolean z, oui0 oui0Var, vri0 vri0Var, vri0 vri0Var2, dpi0 dpi0Var, tui0 tui0Var, boolean z2) {
        oui0Var.getClass();
        dpi0Var.getClass();
        tui0Var.getClass();
        this.a = z;
        this.b = oui0Var;
        this.c = vri0Var;
        this.d = vri0Var2;
        this.e = dpi0Var;
        this.f = tui0Var;
        this.g = z2;
    }

    public zqi0() {
        this(0);
    }
}
