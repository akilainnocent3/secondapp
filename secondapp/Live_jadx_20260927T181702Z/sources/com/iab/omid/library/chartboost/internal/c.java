package com.iab.omid.library.chartboost.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f53020c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.chartboost.adsession.a> f53021a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.chartboost.adsession.a> f53022b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f53020c;
    }

    public Collection<com.iab.omid.library.chartboost.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f53022b);
    }

    public Collection<com.iab.omid.library.chartboost.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f53021a);
    }

    public boolean d() {
        return this.f53022b.size() > 0;
    }

    public void a(com.iab.omid.library.chartboost.adsession.a aVar) {
        this.f53021a.add(aVar);
    }

    public void b(com.iab.omid.library.chartboost.adsession.a aVar) {
        boolean zD = d();
        this.f53021a.remove(aVar);
        this.f53022b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.chartboost.adsession.a aVar) {
        boolean zD = d();
        this.f53022b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
