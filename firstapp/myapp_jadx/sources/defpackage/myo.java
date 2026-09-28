package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class myo {
    public final t03 a;
    public final vz2 b;

    public /* synthetic */ myo(int i) {
        this(new t03(0), new vz2(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myo)) {
            return false;
        }
        myo myoVar = (myo) obj;
        return Intrinsics.g(this.a, myoVar.a) && Intrinsics.g(this.b, myoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InternalBetSliderState(slider=" + this.a + ", betAmount=" + this.b + ')';
    }

    public myo(t03 t03Var, vz2 vz2Var) {
        t03Var.getClass();
        vz2Var.getClass();
        this.a = t03Var;
        this.b = vz2Var;
    }

    public myo() {
        this(0);
    }
}
