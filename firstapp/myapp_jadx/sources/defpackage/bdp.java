package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class bdp implements pd80 {
    public final mpe0 a;

    public bdp(Function0<? extends pd80> function0) {
        this.a = hwr.b(function0);
    }

    public final pd80 a() {
        return (pd80) this.a.getValue();
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        return a().c(str);
    }

    @Override // defpackage.pd80
    public final int d() {
        return a().d();
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        return a().e(i);
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        return a().f(i);
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        return a().g(i);
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return m2g.a;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return a().getKind();
    }

    @Override // defpackage.pd80
    public final String h() {
        return a().h();
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        return a().i(i);
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }
}
