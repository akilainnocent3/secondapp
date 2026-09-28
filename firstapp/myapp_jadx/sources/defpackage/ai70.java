package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ai70 {
    public final rfh0 a;
    public final qcn<String> b;

    public ai70(rfh0 rfh0Var, qcn<String> qcnVar) {
        qcnVar.getClass();
        this.a = rfh0Var;
        this.b = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai70)) {
            return false;
        }
        ai70 ai70Var = (ai70) obj;
        return Intrinsics.g(this.a, ai70Var.a) && Intrinsics.g(this.b, ai70Var.b);
    }

    public final int hashCode() {
        rfh0 rfh0Var = this.a;
        return this.b.hashCode() + ((rfh0Var == null ? 0 : rfh0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ScheduledFootballSelectedMarketHeaderState(universalSpecifierButtonState=" + this.a + ", subtitleTexts=" + this.b + ")";
    }
}
