package com.iab.omid.library.inmobi.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f53296c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f53297a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.inmobi.adsession.a> f53298b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f53296c;
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f53298b);
    }

    public Collection<com.iab.omid.library.inmobi.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f53297a);
    }

    public boolean d() {
        return this.f53298b.size() > 0;
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        this.f53297a.add(aVar);
    }

    public void b(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f53297a.remove(aVar);
        this.f53298b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.inmobi.adsession.a aVar) {
        boolean zD = d();
        this.f53298b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
