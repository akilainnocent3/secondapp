package com.cleveradssolutions.adapters.exchange.rendering.networking.tracking;

import com.cleveradssolutions.adapters.exchange.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f42418a;

    public static a a() {
        if (f42418a == null) {
            f42418a = new a();
        }
        return f42418a;
    }

    public void b(ArrayList arrayList) {
        c(arrayList);
    }

    public void c(List list) {
        if (list == null) {
            b.g("fireEventTrackingURLs(): Unable to execute event tracking requests. Provided list is null");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.cleveradssolutions.mediation.api.a.f43836a.e((String) it.next(), null);
        }
    }
}
