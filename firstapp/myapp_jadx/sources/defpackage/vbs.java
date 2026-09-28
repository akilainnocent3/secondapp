package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vbs implements g8j0 {
    public final g8j0 a;
    public final int b;

    public vbs(g8j0 g8j0Var, int i) {
        this.a = g8j0Var;
        this.b = i;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        if ((this.b & 16) != 0) {
            return this.a.a(mmdVar);
        }
        return 0;
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        if (((asrVar == asr.a ? 4 : 1) & this.b) != 0) {
            return this.a.b(mmdVar, asrVar);
        }
        return 0;
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        if ((this.b & 32) != 0) {
            return this.a.c(mmdVar);
        }
        return 0;
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        if (((asrVar == asr.a ? 8 : 2) & this.b) != 0) {
            return this.a.d(mmdVar, asrVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbs)) {
            return false;
        }
        vbs vbsVar = (vbs) obj;
        return Intrinsics.g(this.a, vbsVar.a) && this.b == vbsVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = w8j0.a;
        if ((i & i2) == i2) {
            w8j0.a(sb3, "Start");
        }
        int i3 = w8j0.c;
        if ((i & i3) == i3) {
            w8j0.a(sb3, "Left");
        }
        if ((i & 16) == 16) {
            w8j0.a(sb3, "Top");
        }
        int i4 = w8j0.b;
        if ((i & i4) == i4) {
            w8j0.a(sb3, "End");
        }
        int i5 = w8j0.d;
        if ((i & i5) == i5) {
            w8j0.a(sb3, "Right");
        }
        if ((i & 32) == 32) {
            w8j0.a(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
