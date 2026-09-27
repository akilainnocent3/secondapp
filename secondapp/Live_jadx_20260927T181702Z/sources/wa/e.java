package wa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e extends g<bb.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bb.d f142579i;

    public e(List<hb.a<bb.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            bb.d dVar = list.get(i10).f88080b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f142579i = new bb.d(new float[iMax], new int[iMax]);
    }

    @Override // wa.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public bb.d i(hb.a<bb.d> aVar, float f10) {
        this.f142579i.g(aVar.f88080b, aVar.f88081c, f10);
        return this.f142579i;
    }
}
