package ab;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<hb.a<PointF>> f4650a;

    public e(List<hb.a<PointF>> list) {
        this.f4650a = list;
    }

    @Override // ab.o
    public boolean e() {
        return this.f4650a.size() == 1 && this.f4650a.get(0).i();
    }

    @Override // ab.o
    public wa.a<PointF, PointF> f() {
        return this.f4650a.get(0).i() ? new wa.k(this.f4650a) : new wa.j(this.f4650a);
    }

    @Override // ab.o
    public List<hb.a<PointF>> g() {
        return this.f4650a;
    }
}
