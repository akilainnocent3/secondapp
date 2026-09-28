package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fof {
    public final ijf0 a;
    public final int b;
    public final boolean c;

    public /* synthetic */ fof(int i) {
        this(new ijf0("", 0L, 6), 100, false);
    }

    public static fof a(fof fofVar, ijf0 ijf0Var, boolean z, int i) {
        fofVar.getClass();
        int i2 = (i & 4) != 0 ? fofVar.b : 100;
        fofVar.getClass();
        fofVar.getClass();
        return new fof(ijf0Var, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fof)) {
            return false;
        }
        fof fofVar = (fof) obj;
        return Intrinsics.g(this.a, fofVar.a) && this.b == fofVar.b && this.c == fofVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + mtg0.a(gpp.a(this.b, ey1.b(this.a, Boolean.hashCode(false) * 31, 31), 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditBioUIState(isLoading=false, bioValue=");
        sb.append(this.a);
        sb.append(", maxChars=");
        sb.append(this.b);
        sb.append(", canSave=");
        return mq0.a(sb, this.c, ", showUrlError=false)");
    }

    public fof(ijf0 ijf0Var, int i, boolean z) {
        this.a = ijf0Var;
        this.b = i;
        this.c = z;
    }

    public fof() {
        this(0);
    }
}
