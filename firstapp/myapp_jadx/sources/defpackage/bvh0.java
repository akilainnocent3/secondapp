package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bvh0 implements g8j0 {
    public final String a;
    public final ytw b;

    public bvh0(enn ennVar, String str) {
        this.a = str;
        this.b = m.b(ennVar);
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

    public final enn e() {
        return (enn) ((x5a0) this.b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvh0) {
            return Intrinsics.g(e(), ((bvh0) obj).e());
        }
        return false;
    }

    public final void f(enn ennVar) {
        ((x5a0) this.b).setValue(ennVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return rr1.b(sb, e().d, ')');
    }
}
