package yg;

import androidx.annotation.Nullable;
import re.v4;
import re.x4;
import re.y7;
import zf.l0;
import zf.u1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f159382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ah.f f159383b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void b(v4 v4Var);

        void onTrackSelectionsInvalidated();
    }

    public final ah.f a() {
        return (ah.f) eh.a.k(this.f159383b);
    }

    public c0 c() {
        return c0.B;
    }

    @Nullable
    public x4.f d() {
        return null;
    }

    @k.i
    public void e(a aVar, ah.f fVar) {
        this.f159382a = aVar;
        this.f159383b = fVar;
    }

    public final void f() {
        a aVar = this.f159382a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    public final void g(v4 v4Var) {
        a aVar = this.f159382a;
        if (aVar != null) {
            aVar.b(v4Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(@Nullable Object obj);

    @k.i
    public void j() {
        this.f159382a = null;
        this.f159383b = null;
    }

    public abstract g0 k(x4[] x4VarArr, u1 u1Var, l0.b bVar, y7 y7Var) throws re.s;

    public void l(te.e eVar) {
    }

    public void m(c0 c0Var) {
    }
}
