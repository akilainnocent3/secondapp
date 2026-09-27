package hb;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e extends f<PointF> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PointF f88102g;

    public e(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f88102g = new PointF();
    }

    @Override // hb.f, hb.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    @Override // hb.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PointF e(PointF pointF, PointF pointF2, float f10) {
        this.f88102g.set(gb.l.k(pointF.x, pointF2.x, f10), gb.l.k(pointF.y, pointF2.y, f10));
        return this.f88102g;
    }

    public e(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f88102g = new PointF();
    }
}
