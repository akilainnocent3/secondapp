package com.iab.omid.library.bigosg.walking;

import android.view.View;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f52824a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0493a> f52825b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f52826c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f52827d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f52828e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f52829f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f52830g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f52831h;

    /* JADX INFO: renamed from: com.iab.omid.library.bigosg.walking.a$a, reason: collision with other inner class name */
    public static class C0493a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.bigosg.b.c f52832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f52833b = new ArrayList<>();

        public C0493a(com.iab.omid.library.bigosg.b.c cVar, String str) {
            this.f52832a = cVar;
            a(str);
        }

        public com.iab.omid.library.bigosg.b.c a() {
            return this.f52832a;
        }

        public ArrayList<String> b() {
            return this.f52833b;
        }

        public void a(String str) {
            this.f52833b.add(str);
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f52827d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f52824a.size() == 0) {
            return null;
        }
        String str = this.f52824a.get(view);
        if (str != null) {
            this.f52824a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f52826c.get(str);
    }

    public c c(View view) {
        if (this.f52827d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f52831h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.f52831h = true;
    }

    public String a(String str) {
        return this.f52830g.get(str);
    }

    public C0493a b(View view) {
        C0493a c0493a = this.f52825b.get(view);
        if (c0493a != null) {
            this.f52825b.remove(view);
        }
        return c0493a;
    }

    public void c() {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f52828e.add(adSessionId);
                            this.f52824a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f52829f.add(adSessionId);
                            this.f52826c.put(adSessionId, viewD);
                            this.f52830g.put(adSessionId, strD);
                        }
                    } else {
                        this.f52829f.add(adSessionId);
                        this.f52830g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f52824a.clear();
        this.f52825b.clear();
        this.f52826c.clear();
        this.f52827d.clear();
        this.f52828e.clear();
        this.f52829f.clear();
        this.f52830g.clear();
        this.f52831h = false;
    }

    public HashSet<String> a() {
        return this.f52828e;
    }

    public HashSet<String> b() {
        return this.f52829f;
    }

    private void a(com.iab.omid.library.bigosg.adsession.a aVar) {
        Iterator<com.iab.omid.library.bigosg.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.bigosg.b.c cVar, com.iab.omid.library.bigosg.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0493a c0493a = this.f52825b.get(view);
        if (c0493a != null) {
            c0493a.a(aVar.getAdSessionId());
        } else {
            this.f52825b.put(view, new C0493a(cVar, aVar.getAdSessionId()));
        }
    }
}
