package hb;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i extends j<PointF> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f88106d;

    public i() {
        this.f88106d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF e(b<PointF> bVar) {
        T t10 = this.f88109c;
        if (t10 != 0) {
            return (PointF) t10;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // hb.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PointF a(b<PointF> bVar) {
        this.f88106d.set(gb.l.k(bVar.g().x, bVar.b().x, bVar.c()), gb.l.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF pointFE = e(bVar);
        this.f88106d.offset(pointFE.x, pointFE.y);
        return this.f88106d;
    }

    public i(@NonNull PointF pointF) {
        super(pointF);
        this.f88106d = new PointF();
    }
}
