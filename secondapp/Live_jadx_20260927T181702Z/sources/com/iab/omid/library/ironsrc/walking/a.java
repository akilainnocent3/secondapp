package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f53503a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0515a> f53504b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f53505c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f53506d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f53507e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f53508f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f53509g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f53510h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f53511i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53512j;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0515a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f53513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f53514b = new ArrayList<>();

        public C0515a(e eVar, String str) {
            this.f53513a = eVar;
            a(str);
        }

        public e a() {
            return this.f53513a;
        }

        public ArrayList<String> b() {
            return this.f53514b;
        }

        public void a(String str) {
            this.f53514b.add(str);
        }
    }

    public View a(String str) {
        return this.f53505c.get(str);
    }

    public C0515a b(View view) {
        C0515a c0515a = this.f53504b.get(view);
        if (c0515a != null) {
            this.f53504b.remove(view);
        }
        return c0515a;
    }

    public String c(View view) {
        if (this.f53503a.size() == 0) {
            return null;
        }
        String str = this.f53503a.get(view);
        if (str != null) {
            this.f53503a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f53506d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f53512j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f53510h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f53507e.add(adSessionId);
                            this.f53503a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f53508f.add(adSessionId);
                            this.f53505c.put(adSessionId, viewC);
                            this.f53509g.put(adSessionId, strA);
                        }
                    } else {
                        this.f53508f.add(adSessionId);
                        this.f53509g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f53511i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f53511i.containsKey(view)) {
            return this.f53511i.get(view);
        }
        Map<View, Boolean> map = this.f53511i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f53509g.get(str);
    }

    public HashSet<String> c() {
        return this.f53507e;
    }

    public void d() {
        this.f53512j = true;
    }

    public boolean e(View view) {
        if (!this.f53511i.containsKey(view)) {
            return true;
        }
        this.f53511i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
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
        this.f53506d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f53508f;
    }

    public boolean c(String str) {
        return this.f53510h.contains(str);
    }

    public void a() {
        this.f53503a.clear();
        this.f53504b.clear();
        this.f53505c.clear();
        this.f53506d.clear();
        this.f53507e.clear();
        this.f53508f.clear();
        this.f53509g.clear();
        this.f53512j = false;
        this.f53510h.clear();
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0515a c0515a = this.f53504b.get(view);
        if (c0515a != null) {
            c0515a.a(aVar.getAdSessionId());
        } else {
            this.f53504b.put(view, new C0515a(eVar, aVar.getAdSessionId()));
        }
    }
}
