package eb;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h0 implements n0<bb.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f80671a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c.a f80672b = fb.c.a.a("c", "v", "i", jg.b0.f100164e);

    @Override // eb.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bb.o a(fb.c cVar, float f10) throws IOException {
        if (cVar.y() == fb.c.b.BEGIN_ARRAY) {
            cVar.d();
        }
        cVar.h();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zN = false;
        while (cVar.m()) {
            int iE = cVar.E(f80672b);
            if (iE == 0) {
                zN = cVar.n();
            } else if (iE == 1) {
                listF = s.f(cVar, f10);
            } else if (iE == 2) {
                listF2 = s.f(cVar, f10);
            } else if (iE != 3) {
                cVar.F();
                cVar.G();
            } else {
                listF3 = s.f(cVar, f10);
            }
        }
        cVar.l();
        if (cVar.y() == fb.c.b.END_ARRAY) {
            cVar.k();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new bb.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new za.a(gb.l.a(listF.get(i11), listF3.get(i11)), gb.l.a(pointF2, listF2.get(i10)), pointF2));
        }
        if (zN) {
            PointF pointF3 = listF.get(0);
            int i12 = size - 1;
            arrayList.add(new za.a(gb.l.a(listF.get(i12), listF3.get(i12)), gb.l.a(pointF3, listF2.get(0)), pointF3));
        }
        return new bb.o(pointF, zN, arrayList);
    }
}
