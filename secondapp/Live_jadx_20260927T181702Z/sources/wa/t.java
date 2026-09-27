package wa;

import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class t<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A f142634i;

    public t(hb.j<A> jVar) {
        this(jVar, null);
    }

    @Override // wa.a
    public float c() {
        return 1.0f;
    }

    @Override // wa.a
    public A h() {
        hb.j<A> jVar = this.f142557e;
        A a10 = this.f142634i;
        return jVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // wa.a
    public A i(hb.a<K> aVar, float f10) {
        return h();
    }

    @Override // wa.a
    public void l() {
        if (this.f142557e != null) {
            super.l();
        }
    }

    @Override // wa.a
    public void n(float f10) {
        this.f142556d = f10;
    }

    public t(hb.j<A> jVar, @Nullable A a10) {
        super(Collections.EMPTY_LIST);
        o(jVar);
        this.f142634i = a10;
    }
}
