package com.bytedance.sdk.component.adexpress.dynamic.hv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod {
    public static float hww(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<tq.hww> hww(float f10, List<tq.hww> list) {
        ArrayList<tq.hww> arrayList = new ArrayList();
        Iterator<tq.hww> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((tq.hww) it.next().clone());
        }
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        for (tq.hww hwwVar : arrayList) {
            if (hwwVar.f34087tq) {
                i10 = (int) (i10 + hwwVar.hww);
            } else {
                i11 = (int) (i11 + hwwVar.hww);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = false;
                for (tq.hww hwwVar2 : arrayList) {
                    if (!hwwVar2.f34087tq) {
                        float f14 = hwwVar2.f34086sd;
                        if (f14 != 0.0f && hwwVar2.hww * f13 > f14) {
                            hwwVar2.hww = f14;
                            hwwVar2.f34087tq = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(hwwVar2);
                }
                if (z11) {
                    return hww(f10, arrayList2);
                }
            }
            int i12 = 0;
            for (tq.hww hwwVar3 : arrayList) {
                if (hwwVar3.f34087tq) {
                    hwwVar3.hww = hww(hwwVar3.hww * f12);
                } else {
                    hwwVar3.hww = hww(hwwVar3.hww * f13);
                }
                i12 = (int) (i12 + hwwVar3.hww);
            }
            float f15 = i12;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size = 0; size < arrayList.size() && f16 > 0.0f; size = (size + 1) % arrayList.size()) {
                    tq.hww hwwVar4 = (tq.hww) arrayList.get(size);
                    if ((f10 < f11 && hwwVar4.f34087tq) || (f10 > f11 && !hwwVar4.f34087tq)) {
                        hwwVar4.hww += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
