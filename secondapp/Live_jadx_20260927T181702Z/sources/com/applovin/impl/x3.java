package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29499a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(a3 a3Var);
    }

    public void a(a aVar) {
        this.f29499a.add(aVar);
    }

    public void b(a aVar) {
        this.f29499a.remove(aVar);
    }

    public void a(a3 a3Var) {
        Iterator it = new ArrayList(this.f29499a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(a3Var);
        }
    }
}
