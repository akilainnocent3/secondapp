package com.iab.omid.library.bigosg.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f52755a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f52756b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bigosg.adsession.a> f52757c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f52755a;
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f52756b);
    }

    public Collection<com.iab.omid.library.bigosg.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f52757c);
    }

    public boolean d() {
        return this.f52757c.size() > 0;
    }

    public void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        this.f52756b.add(aVar);
    }

    public void b(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f52757c.add(aVar);
        if (zD) {
            return;
        }
        f.a().b();
    }

    public void c(com.iab.omid.library.bigosg.adsession.a aVar) {
        boolean zD = d();
        this.f52756b.remove(aVar);
        this.f52757c.remove(aVar);
        if (!zD || d()) {
            return;
        }
        f.a().c();
    }
}
