package com.iab.omid.library.startio.processor;

import android.view.View;
import com.iab.omid.library.startio.utils.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f53908a;

    public c(a aVar) {
        this.f53908a = aVar;
    }

    public ArrayList a() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            Collection collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() << 1) + 3);
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                View viewE = ((com.iab.omid.library.startio.adsession.a) it.next()).e();
                if (viewE != null && h.g(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d((View) arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.startio.processor.a
    public JSONObject a(View view) {
        JSONObject jSONObjectA = com.iab.omid.library.startio.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.startio.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.startio.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0527a interfaceC0527a, boolean z10, boolean z11) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            interfaceC0527a.a((View) it.next(), this.f53908a, jSONObject, z11);
        }
    }
}
