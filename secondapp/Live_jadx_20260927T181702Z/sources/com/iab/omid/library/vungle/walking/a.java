package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f54220a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0538a> f54221b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f54222c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f54223d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f54224e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f54225f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f54226g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f54227h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f54228i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54229j;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0538a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f54230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f54231b = new ArrayList<>();

        public C0538a(e eVar, String str) {
            this.f54230a = eVar;
            a(str);
        }

        public e a() {
            return this.f54230a;
        }

        public ArrayList<String> b() {
            return this.f54231b;
        }

        public void a(String str) {
            this.f54231b.add(str);
        }
    }

    public View a(String str) {
        return this.f54222c.get(str);
    }

    public C0538a b(View view) {
        C0538a c0538a = this.f54221b.get(view);
        if (c0538a != null) {
            this.f54221b.remove(view);
        }
        return c0538a;
    }

    public String c(View view) {
        if (this.f54220a.size() == 0) {
            return null;
        }
        String str = this.f54220a.get(view);
        if (str != null) {
            this.f54220a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f54223d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f54229j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f54227h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f54224e.add(strC);
                            this.f54220a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f54225f.add(strC);
                            this.f54222c.put(strC, viewE);
                            this.f54226g.put(strC, strA);
                        }
                    } else {
                        this.f54225f.add(strC);
                        this.f54226g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f54228i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f54228i.containsKey(view)) {
            return this.f54228i.get(view);
        }
        Map<View, Boolean> map = this.f54228i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f54226g.get(str);
    }

    public HashSet<String> c() {
        return this.f54224e;
    }

    public void d() {
        this.f54229j = true;
    }

    public boolean e(View view) {
        if (!this.f54228i.containsKey(view)) {
            return true;
        }
        this.f54228i.put(view, Boolean.TRUE);
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
        this.f54223d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f54225f;
    }

    public boolean c(String str) {
        return this.f54227h.contains(str);
    }

    public void a() {
        this.f54220a.clear();
        this.f54221b.clear();
        this.f54222c.clear();
        this.f54223d.clear();
        this.f54224e.clear();
        this.f54225f.clear();
        this.f54226g.clear();
        this.f54229j = false;
        this.f54227h.clear();
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0538a c0538a = this.f54221b.get(view);
        if (c0538a != null) {
            c0538a.a(aVar.c());
        } else {
            this.f54221b.put(view, new C0538a(eVar, aVar.c()));
        }
    }
}
