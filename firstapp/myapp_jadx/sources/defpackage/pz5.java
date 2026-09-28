package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class pz5 implements tnh0 {
    public final lse b;

    public pz5(Context context) {
        this.b = lse.b(context);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x003b  */
    @Override // defpackage.tnh0
    public final hoa a(tnh0.b bVar, int i) {
        int i2;
        ftw ftwVarV = ftw.V();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        ftw ftwVarV2 = ftw.V();
        ArrayList arrayList = new ArrayList();
        buw buwVarA = buw.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = bVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 3 && zhe.a.b(PreviewUnderExposureQuirk.class) == null) {
                i2 = 3;
            } else {
                i2 = 1;
            }
        } else if (i == 2) {
            i2 = 5;
        } else {
            i2 = 1;
        }
        wg1 wg1Var = snh0.y;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        w2z w2zVarU = w2z.U(ftwVarV2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        c4f0 c4f0Var = c4f0.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : buwVarA.a.keySet()) {
            arrayMap.put(str, buwVarA.a.get(str));
            arrayList6 = arrayList6;
        }
        ftwVarV.Y(wg1Var, new wf80(arrayList5, arrayList6, arrayList7, arrayList8, new ue6(arrayList9, w2zVarU, i2, false, arrayList10, false, new c4f0(arrayMap), null), null, null, 0, null));
        ftwVarV.Y(snh0.A, oz5.a);
        HashSet hashSet2 = new HashSet();
        ftw ftwVarV3 = ftw.V();
        ArrayList arrayList11 = new ArrayList();
        buw buwVarA2 = buw.a();
        int iOrdinal2 = bVar.ordinal();
        int i3 = iOrdinal2 != 0 ? (iOrdinal2 == 3 && zhe.a.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i == 2 ? 5 : 2;
        wg1 wg1Var2 = snh0.z;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        w2z w2zVarU2 = w2z.U(ftwVarV3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        c4f0 c4f0Var2 = c4f0.b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str2 : buwVarA2.a.keySet()) {
            arrayMap2.put(str2, buwVarA2.a.get(str2));
        }
        ftwVarV.Y(wg1Var2, new ue6(arrayList12, w2zVarU2, i3, false, arrayList13, false, new c4f0(arrayMap2), null));
        ftwVarV.Y(snh0.B, bVar == tnh0.b.a ? l8n.b : ay5.a);
        if (bVar == tnh0.b.b) {
            ftwVarV.Y(x9n.q, this.b.e());
        }
        ftwVarV.Y(x9n.l, Integer.valueOf(this.b.c(true).getRotation()));
        if (bVar == tnh0.b.d || bVar == tnh0.b.e) {
            ftwVarV.Y(snh0.G, Boolean.TRUE);
        }
        return w2z.U(ftwVarV);
    }
}
