package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q0b implements pd80 {
    public final sd80 a;
    public final ygp<?> b;
    public final String c;

    public q0b(sd80 sd80Var, ygp ygpVar) {
        ygpVar.getClass();
        this.a = sd80Var;
        this.b = ygpVar;
        this.c = sd80Var.a + '<' + ygpVar.k() + '>';
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // defpackage.pd80
    public final int d() {
        return this.a.c;
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        q0b q0bVar = obj instanceof q0b ? (q0b) obj : null;
        return q0bVar != null && this.a.equals(q0bVar.a) && Intrinsics.g(q0bVar.b, this.b);
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return this.a.b;
    }

    @Override // defpackage.pd80
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        return this.a.i[i];
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
