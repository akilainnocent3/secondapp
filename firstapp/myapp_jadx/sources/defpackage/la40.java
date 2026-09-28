package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class la40 implements oce0, m75 {
    public final m75 a;
    public final b01 b;
    public final ht c;
    public final d0b d;

    public la40(m75 m75Var, b01 b01Var, ht htVar, d0b d0bVar) {
        this.a = m75Var;
        this.b = b01Var;
        this.c = htVar;
        this.d = d0bVar;
    }

    @Override // defpackage.oce0
    public final b01 a() {
        return this.b;
    }

    @Override // defpackage.m75
    public final d b(d dVar, ht htVar) {
        return this.a.b(dVar, htVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof la40) {
            la40 la40Var = (la40) obj;
            if (this.a.equals(la40Var.a) && this.b == la40Var.b && Intrinsics.g(this.c, la40Var.c) && Intrinsics.g(this.d, la40Var.d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m75
    public final d f(d dVar) {
        return this.a.f(dVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + tvh.a(1.0f, (this.d.hashCode() + ((this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 856586624) * 31)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=Loaded Image, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
