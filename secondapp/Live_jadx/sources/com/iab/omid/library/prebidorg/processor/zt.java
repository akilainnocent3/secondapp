package com.iab.omid.library.prebidorg.processor;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zt implements zz {
    private final int[] zz = new int[2];

    private void zr(ViewGroup viewGroup, JSONObject jSONObject, zz.InterfaceC0521zz interfaceC0521zz, boolean z10) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0521zz.zz((View) it2.next(), this, jSONObject, z10);
            }
        }
    }

    @Override // com.iab.omid.library.prebidorg.processor.zz
    public JSONObject zz(View view) {
        if (view == null) {
            return com.iab.omid.library.prebidorg.utils.zs.zz(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zz);
        int[] iArr = this.zz;
        return com.iab.omid.library.prebidorg.utils.zs.zz(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.prebidorg.processor.zz
    public void zz(View view, JSONObject jSONObject, zz.InterfaceC0521zz interfaceC0521zz, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z10) {
                zr(viewGroup, jSONObject, interfaceC0521zz, z11);
            } else {
                zz(viewGroup, jSONObject, interfaceC0521zz, z11);
            }
        }
    }

    private void zz(ViewGroup viewGroup, JSONObject jSONObject, zz.InterfaceC0521zz interfaceC0521zz, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            interfaceC0521zz.zz(viewGroup.getChildAt(i10), this, jSONObject, z10);
        }
    }
}
