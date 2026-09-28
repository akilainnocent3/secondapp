package defpackage;

import android.util.Range;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qnh0 {
    public static w36 a;

    public static final void a(m26 m26Var, e6s e6sVar, kg50 kg50Var) {
        wt5 wt5VarR;
        m26Var.getClass();
        w36 w36Var = a;
        if (w36Var == null) {
            ib5.a("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String strD = m26Var.d();
        strD.getClass();
        n26 n26VarB = w36Var.a.b(strD);
        rf rfVar = new rf(n26VarB.h(), j16.a);
        ona onaVar = ona.c;
        v36 v36Var = new v36(n26VarB, null, rfVar, null, onaVar, onaVar, w36Var.b, w36Var.d, w36Var.c);
        synchronized (v36Var.z) {
        }
        List<c26> list = e6sVar.a;
        synchronized (v36Var.z) {
            v36Var.v = list;
        }
        synchronized (v36Var.z) {
        }
        Range<Integer> range = e6sVar.b;
        synchronized (v36Var.z) {
            v36Var.w = range;
        }
        List<pnh0> list2 = e6sVar.e;
        pgt.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + kg50Var);
        synchronized (v36Var.z) {
            sf sfVar = v36Var.a;
            h16 h16Var = v36Var.y;
            sfVar.c(h16Var);
            sf sfVar2 = v36Var.b;
            if (sfVar2 != null) {
                sfVar2.c(h16Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(v36Var.e);
            linkedHashSet.addAll(list2);
            HashMap mapK = v36.k(linkedHashSet, kg50Var);
            try {
                try {
                    wt5VarR = v36Var.r(linkedHashSet, v36Var.b != null);
                    v36.D(mapK);
                } catch (IllegalArgumentException e) {
                    throw new v36.a(e);
                }
            } catch (Throwable th) {
                v36.D(mapK);
                throw th;
            }
        }
        wt5VarR.getClass();
    }
}
