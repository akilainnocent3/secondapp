package com.iab.omid.library.prebidorg.processor;

import android.view.View;
import com.iab.omid.library.prebidorg.adsession.zf;
import com.iab.omid.library.prebidorg.utils.zu;
import com.iab.omid.library.prebidorg.utils.zx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zs implements zz {
    private final zz zz;

    public zs(zz zzVar) {
        this.zz = zzVar;
    }

    public ArrayList zz() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        com.iab.omid.library.prebidorg.internal.zs zsVarZs = com.iab.omid.library.prebidorg.internal.zs.zs();
        if (zsVarZs != null) {
            Collection collectionZz = zsVarZs.zz();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionZz.size() * 2) + 3);
            Iterator it = collectionZz.iterator();
            while (it.hasNext()) {
                View viewZu = ((zf) it.next()).zu();
                if (viewZu != null && zx.zu(viewZu) && (rootView = viewZu.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fZs = zx.zs(rootView);
                    int size = arrayList.size();
                    while (size > 0 && zx.zs((View) arrayList.get(size - 1)) > fZs) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.prebidorg.processor.zz
    public JSONObject zz(View view) {
        JSONObject jSONObjectZz = com.iab.omid.library.prebidorg.utils.zs.zz(0, 0, 0, 0);
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObjectZz, zu.zz());
        return jSONObjectZz;
    }

    @Override // com.iab.omid.library.prebidorg.processor.zz
    public void zz(View view, JSONObject jSONObject, zz.InterfaceC0521zz interfaceC0521zz, boolean z10, boolean z11) {
        Iterator it = zz().iterator();
        while (it.hasNext()) {
            interfaceC0521zz.zz((View) it.next(), this.zz, jSONObject, z11);
        }
    }
}
