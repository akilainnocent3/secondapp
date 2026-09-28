package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n8e0 implements m8e0 {
    public final tnh0 a;
    public b26 b;

    public n8e0(tnh0 tnh0Var) {
        tnh0Var.getClass();
        this.a = tnh0Var;
        this.b = null;
    }

    @Override // defpackage.m8e0
    public final l8e0 a(int i, m26 m26Var, ArrayList arrayList, ArrayList arrayList2, h16 h16Var, Range range, boolean z) {
        int i2;
        Rect rectE;
        arrayList = arrayList;
        m26Var.getClass();
        h16Var.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String strD = m26Var.d();
        strD.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            pnh0 pnh0Var = (pnh0) obj;
            k8e0 k8e0Var = pnh0Var.i;
            if (k8e0Var == null) {
                hb5.a("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            b26 b26Var = this.b;
            if (b26Var == null) {
                ib5.a("Required value was null.");
                return null;
            }
            int iM = pnh0Var.h.m();
            int i4 = size;
            k8e0 k8e0Var2 = pnh0Var.i;
            Size sizeF = k8e0Var2 != null ? k8e0Var2.f() : null;
            if (sizeF == null) {
                hb5.a("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            o8e0 o8e0VarO = pnh0Var.h.O();
            tge0 tge0Var = (tge0) ((iz5) b26Var).b.get(strD);
            km20.a("No such camera id in supported combination list: ".concat(strD), tge0Var != null);
            hl1 hl1VarL = tge0Var.l(iM);
            vge0.c cVar = vge0.c.b;
            o8e0 o8e0Var = vge0.e;
            vge0 vge0VarB = vge0.a.b(iM, sizeF, hl1VarL, i, cVar, o8e0VarO);
            int iM2 = pnh0Var.h.m();
            k8e0 k8e0Var3 = pnh0Var.i;
            Size sizeF2 = k8e0Var3 != null ? k8e0Var3.f() : null;
            sizeF2.getClass();
            dhf dhfVarB = k8e0Var.b();
            ArrayList arrayListJ = g8e0.J(pnh0Var);
            hoa hoaVarD = k8e0Var.d();
            int i5 = pnh0Var.h.i();
            Range<Integer> rangeW = pnh0Var.h.w(k8e0.a);
            if (rangeW == null) {
                hb5.a("Required value was null.");
                return null;
            }
            ig1 ig1Var = new ig1(vge0VarB, iM2, sizeF2, dhfVarB, arrayListJ, hoaVarD, i5, rangeW, pnh0Var.h.A());
            arrayList3.add(ig1Var);
            linkedHashMap2.put(ig1Var, pnh0Var);
            linkedHashMap.put(pnh0Var, k8e0Var);
            size = i4;
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Object obj2 = pair.second;
        obj2.getClass();
        Map map = (Map) obj2;
        HashMap mapV = v36.v(arrayList, (tnh0) h16Var.b(h16.a, tnh0.a), this.a, range);
        String strD2 = m26Var.d();
        strD2.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Reader.READ_DONE;
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            try {
                rectE = m26Var.e();
            } catch (NullPointerException unused) {
                rectE = null;
            }
            pge0 pge0Var = new pge0(m26Var, rectE != null ? lsg0.g(rectE) : null);
            int size2 = arrayList.size();
            int i6 = 0;
            boolean z2 = false;
            while (i6 < size2) {
                Object obj3 = arrayList.get(i6);
                i6++;
                pnh0 pnh0Var2 = (pnh0) obj3;
                Object obj4 = mapV.get(pnh0Var2);
                if (obj4 == null) {
                    hb5.a("Required value was null.");
                    return null;
                }
                v36.b bVar = (v36.b) obj4;
                mapV = mapV;
                snh0<?> snh0VarP = pnh0Var2.p(m26Var, bVar.a, bVar.b);
                snh0VarP.getClass();
                linkedHashMap4.put(snh0VarP, pnh0Var2);
                linkedHashMap5.put(snh0VarP, pge0Var.b(snh0VarP));
                if (snh0VarP.z() == 2) {
                    z2 = true;
                }
            }
            b26 b26Var2 = this.b;
            if (b26Var2 == null) {
                ib5.a("Required value was null.");
                return null;
            }
            ArrayList arrayList4 = new ArrayList(map.keySet());
            boolean zA = v36.A(arrayList);
            km20.a("No new use cases to be bound.", !linkedHashMap5.isEmpty());
            tge0 tge0Var2 = (tge0) ((iz5) b26Var2).b.get(strD2);
            km20.a("No such camera id in supported combination list: ".concat(strD2), tge0Var2 != null);
            gie0 gie0VarJ = tge0Var2.j(i, arrayList4, linkedHashMap5, z2, zA, z);
            HashMap map2 = gie0VarJ.a;
            HashMap map3 = gie0VarJ.b;
            i2 = gie0VarJ.c;
            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                Object value = entry.getValue();
                Object obj5 = map2.get(entry.getKey());
                if (obj5 == null) {
                    hb5.a("Required value was null.");
                    return null;
                }
                linkedHashMap3.put(value, obj5);
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj6 = map.get(entry2.getKey());
                    if (obj6 == null) {
                        hb5.a("Required value was null.");
                        return null;
                    }
                    linkedHashMap3.put(obj6, entry2.getValue());
                }
            }
        }
        Object obj7 = pair.first;
        obj7.getClass();
        return new l8e0(kpu.h((Map) obj7, linkedHashMap3), i2);
    }
}
