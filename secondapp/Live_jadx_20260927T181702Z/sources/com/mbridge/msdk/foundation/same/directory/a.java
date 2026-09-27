package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f67049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f67050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f67051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f67052d;

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public String b() {
        return this.f67050b;
    }

    public a c() {
        return this.f67051c;
    }

    public c d() {
        return this.f67052d;
    }

    public void b(a aVar) {
        this.f67051c = aVar;
    }

    public void a(a aVar) {
        if (this.f67049a == null) {
            this.f67049a = new ArrayList();
        }
        aVar.b(this);
        this.f67049a.add(aVar);
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public List<a> a() {
        return this.f67049a;
    }

    public void a(String str) {
        this.f67050b = str;
    }

    public void a(c cVar) {
        this.f67052d = cVar;
    }
}
