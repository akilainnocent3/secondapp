package y5;

import android.content.Context;
import androidx.annotation.Nullable;
import s5.j2;
import s5.s0;
import u4.d5;
import u4.y4;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public b f146205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public z5.e f146206b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        f0 a(Context context);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void b(androidx.media3.exoplayer.q qVar);

        void onTrackSelectionsInvalidated();
    }

    public final z5.e a() {
        return (z5.e) l0.E(this.f146206b);
    }

    public d5 c() {
        return d5.J;
    }

    @Nullable
    public androidx.media3.exoplayer.r.f d() {
        return null;
    }

    @k.i
    public void e(b bVar, z5.e eVar) {
        l0.g0(this.f146205a == null);
        this.f146205a = bVar;
        this.f146206b = eVar;
    }

    public final void f() {
        b bVar = this.f146205a;
        if (bVar != null) {
            bVar.onTrackSelectionsInvalidated();
        }
    }

    public final void g(androidx.media3.exoplayer.q qVar) {
        b bVar = this.f146205a;
        if (bVar != null) {
            bVar.b(qVar);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(@Nullable Object obj);

    @k.i
    public void j() {
        this.f146205a = null;
        this.f146206b = null;
    }

    public abstract h0 k(androidx.media3.exoplayer.r[] rVarArr, j2 j2Var, s0.b bVar, y4 y4Var) throws d5.h0;

    public void l(u4.i iVar) {
    }

    public void m(d5 d5Var) {
    }
}
