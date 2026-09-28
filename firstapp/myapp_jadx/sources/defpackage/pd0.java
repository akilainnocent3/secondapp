package defpackage;

import androidx.compose.runtime.m;

/* JADX INFO: loaded from: classes.dex */
public final class pd0 implements g8j0 {
    public final int a;
    public final String b;
    public final ytw c = m.b(ymn.e);
    public final ytw d = m.b(Boolean.TRUE);

    public pd0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        return e().b;
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        return e().c;
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        return e().d;
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        return e().a;
    }

    public final ymn e() {
        return (ymn) ((x5a0) this.c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pd0) {
            return this.a == ((pd0) obj).a;
        }
        return false;
    }

    public final void f(l8j0 l8j0Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            ((x5a0) this.c).setValue(l8j0Var.a.g(i2));
            ((x5a0) this.d).setValue(Boolean.valueOf(l8j0Var.a.q(i2)));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return rr1.b(sb, e().d, ')');
    }
}
