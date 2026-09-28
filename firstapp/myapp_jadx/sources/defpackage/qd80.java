package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class qd80 implements pd80, gs5 {
    public final pd80 a;
    public final String b;
    public final Set<String> c;

    public qd80(pd80 pd80Var) {
        pd80Var.getClass();
        this.a = pd80Var;
        this.b = pd80Var.h() + '?';
        this.c = fz9.a(pd80Var);
    }

    @Override // defpackage.gs5
    public final Set<String> a() {
        return this.c;
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return true;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // defpackage.pd80
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qd80) {
            return Intrinsics.g(this.a, ((qd80) obj).a);
        }
        return false;
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return this.a.getKind();
    }

    @Override // defpackage.pd80
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
