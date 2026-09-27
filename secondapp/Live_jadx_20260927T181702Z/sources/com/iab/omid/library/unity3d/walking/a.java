package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f54080a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0533a> f54081b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f54082c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f54083d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f54084e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f54085f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f54086g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f54087h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54088i;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.a$a, reason: collision with other inner class name */
    public static class C0533a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f54089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f54090b = new ArrayList<>();

        public C0533a(e eVar, String str) {
            this.f54089a = eVar;
            a(str);
        }

        public e a() {
            return this.f54089a;
        }

        public ArrayList<String> b() {
            return this.f54090b;
        }

        public void a(String str) {
            this.f54090b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f54087h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f54087h.containsKey(view)) {
            return this.f54087h.get(view);
        }
        Map<View, Boolean> map = this.f54087h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f54082c.get(str);
    }

    public C0533a c(View view) {
        C0533a c0533a = this.f54081b.get(view);
        if (c0533a != null) {
            this.f54081b.remove(view);
        }
        return c0533a;
    }

    public String d(View view) {
        if (this.f54080a.size() == 0) {
            return null;
        }
        String str = this.f54080a.get(view);
        if (str != null) {
            this.f54080a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.f54083d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f54088i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f54087h.containsKey(view)) {
            return true;
        }
        this.f54087h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f54083d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f54086g.get(str);
    }

    public HashSet<String> c() {
        return this.f54084e;
    }

    public void d() {
        this.f54088i = true;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f54084e.add(adSessionId);
                            this.f54080a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f54085f.add(adSessionId);
                            this.f54082c.put(adSessionId, viewC);
                            this.f54086g.put(adSessionId, strA);
                        }
                    } else {
                        this.f54085f.add(adSessionId);
                        this.f54086g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f54080a.clear();
        this.f54081b.clear();
        this.f54082c.clear();
        this.f54083d.clear();
        this.f54084e.clear();
        this.f54085f.clear();
        this.f54086g.clear();
        this.f54088i = false;
    }

    public HashSet<String> b() {
        return this.f54085f;
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0533a c0533a = this.f54081b.get(view);
        if (c0533a != null) {
            c0533a.a(aVar.getAdSessionId());
        } else {
            this.f54081b.put(view, new C0533a(eVar, aVar.getAdSessionId()));
        }
    }
}
