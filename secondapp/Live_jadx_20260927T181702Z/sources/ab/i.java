package ab;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4652b;

    public i(b bVar, b bVar2) {
        this.f4651a = bVar;
        this.f4652b = bVar2;
    }

    @Override // ab.o
    public boolean e() {
        return this.f4651a.e() && this.f4652b.e();
    }

    @Override // ab.o
    public wa.a<PointF, PointF> f() {
        return new wa.n(this.f4651a.f(), this.f4652b.f());
    }

    @Override // ab.o
    public List<hb.a<PointF>> g() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
