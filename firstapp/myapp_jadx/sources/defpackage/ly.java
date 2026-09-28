package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ly implements yqm {
    public final hz a;
    public final yi5 b;
    public final uwd0<ex> c;
    public final uwd0<Boolean> d;

    public ly(hz hzVar, yi5 yi5Var) {
        hzVar.getClass();
        yi5Var.getClass();
        this.a = hzVar;
        this.b = yi5Var;
        this.c = hzVar.e();
        this.d = hzVar.b();
    }

    @Override // defpackage.yqm
    public final iy a() {
        return new iy(this.a.a());
    }

    @Override // defpackage.yqm
    public final uwd0<Boolean> b() {
        return this.d;
    }

    @Override // defpackage.yqm
    public final Object c(String str, String str2, String str3, v1b<? super Unit> v1bVar) {
        return this.a.c(str, str2, str3, v1bVar);
    }

    @Override // defpackage.yqm
    public final <E extends Enum<E> & csm<E>> lyh<E> d(x66<E> x66Var) {
        x66Var.getClass();
        return this.b.a().b() ? this.a.d(x66Var) : new gzh(null);
    }

    @Override // defpackage.yqm
    public final uwd0<ex> e() {
        return this.c;
    }

    @Override // defpackage.yqm
    public final Object f(x66 x66Var, csm csmVar, z3d z3dVar) {
        return this.a.k(x66Var.a, csmVar.getValue(), z3dVar);
    }

    @Override // defpackage.yqm
    public final Object g(boolean z, e4d e4dVar) {
        return this.a.g(z, e4dVar);
    }

    @Override // defpackage.yqm
    public final Object h(String str, x1b x1bVar) {
        return this.a.h(str, x1bVar);
    }

    @Override // defpackage.yqm
    public final Object i(x66 x66Var, a4d a4dVar) {
        return this.a.f(x66Var.a, a4dVar);
    }

    @Override // defpackage.yqm
    public final yzh j(x66 x66Var) {
        x66Var.getClass();
        return bm50.a(new or60(new ky(this, x66Var, null)));
    }

    @Override // defpackage.yqm
    public final Object k(String str, String str2, qdb0 qdb0Var) {
        List<String> list;
        x66 x66VarA = z76.a(str);
        return this.a.m(str, str2, (x66VarA == null || (list = x66VarA.b) == null) ? null : (String) CollectionsKt.firstOrNull(list), qdb0Var);
    }

    @Override // defpackage.yqm
    public final Object l(x66 x66Var, nsy nsyVar) {
        return this.a.l(x66Var, nsyVar);
    }

    @Override // defpackage.yqm
    public final yzh m(x66 x66Var, boolean z) {
        x66Var.getClass();
        return bm50.a(new or60(new jy(this, x66Var, z, null)));
    }
}
