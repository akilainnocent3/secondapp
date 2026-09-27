package com.iab.omid.library.startio.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f53873c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f53874a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f53875b = new ArrayList();

    private c() {
    }

    public static c c() {
        return f53873c;
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.f53875b);
    }

    public Collection b() {
        return Collections.unmodifiableCollection(this.f53874a);
    }

    public boolean d() {
        return this.f53875b.size() > 0;
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar) {
        this.f53874a.add(aVar);
    }

    public void b(com.iab.omid.library.startio.adsession.a aVar) {
        boolean zD = d();
        this.f53874a.remove(aVar);
        this.f53875b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.startio.adsession.a aVar) {
        boolean zD = d();
        this.f53875b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
