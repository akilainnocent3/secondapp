package com.iab.omid.library.fyber.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f53155c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f53156a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.fyber.adsession.a> f53157b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f53155c;
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f53157b);
    }

    public Collection<com.iab.omid.library.fyber.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f53156a);
    }

    public boolean d() {
        return this.f53157b.size() > 0;
    }

    public void a(com.iab.omid.library.fyber.adsession.a aVar) {
        this.f53156a.add(aVar);
    }

    public void b(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f53156a.remove(aVar);
        this.f53157b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.fyber.adsession.a aVar) {
        boolean zD = d();
        this.f53157b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
