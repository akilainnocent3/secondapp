package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class wx80 implements cvh0<vx80> {
    public static final wx80 a = new wx80();
    public static final hep.a b = hep.a.a("c", "v", "i", "o");

    @Override // defpackage.cvh0
    public final vx80 a(hep hepVar, float f) {
        if (hepVar.J() == hep.b.a) {
            hepVar.d();
        }
        hepVar.f();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zU = false;
        while (hepVar.o()) {
            int iV = hepVar.V(b);
            if (iV == 0) {
                zU = hepVar.u();
            } else if (iV == 1) {
                arrayListC = lfp.c(hepVar, f);
            } else if (iV == 2) {
                arrayListC2 = lfp.c(hepVar, f);
            } else if (iV != 3) {
                hepVar.Y();
                hepVar.Z();
            } else {
                arrayListC3 = lfp.c(hepVar, f);
            }
        }
        hepVar.l();
        if (hepVar.J() == hep.b.b) {
            hepVar.g();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            hb5.a("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new vx80(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new h4c(rqv.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), rqv.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zU) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new h4c(rqv.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), rqv.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new vx80(pointF, zU, arrayList);
    }
}
