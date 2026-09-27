package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f52701a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0490a> f52702b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f52703c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f52704d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f52705e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f52706f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f52707g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f52708h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f52709i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f52710j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0490a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f52711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f52712b = new ArrayList<>();

        public C0490a(e eVar, String str) {
            this.f52711a = eVar;
            a(str);
        }

        public e a() {
            return this.f52711a;
        }

        public ArrayList<String> b() {
            return this.f52712b;
        }

        public void a(String str) {
            this.f52712b.add(str);
        }
    }

    public View a(String str) {
        return this.f52703c.get(str);
    }

    public C0490a b(View view) {
        C0490a c0490a = this.f52702b.get(view);
        if (c0490a != null) {
            this.f52702b.remove(view);
        }
        return c0490a;
    }

    public String c(View view) {
        if (this.f52701a.size() == 0) {
            return null;
        }
        String str = this.f52701a.get(view);
        if (str != null) {
            this.f52701a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f52704d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f52710j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f52708h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f52705e.add(strC);
                            this.f52701a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f52706f.add(strC);
                            this.f52703c.put(strC, viewE);
                            this.f52707g.put(strC, strA);
                        }
                    } else {
                        this.f52706f.add(strC);
                        this.f52707g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f52709i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f52709i.containsKey(view)) {
            return this.f52709i.get(view);
        }
        Map<View, Boolean> map = this.f52709i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f52707g.get(str);
    }

    public HashSet<String> c() {
        return this.f52705e;
    }

    public void d() {
        this.f52710j = true;
    }

    public boolean e(View view) {
        if (!this.f52709i.containsKey(view)) {
            return true;
        }
        this.f52709i.put(view, Boolean.TRUE);
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
        this.f52704d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f52706f;
    }

    public boolean c(String str) {
        return this.f52708h.contains(str);
    }

    public void a() {
        this.f52701a.clear();
        this.f52702b.clear();
        this.f52703c.clear();
        this.f52704d.clear();
        this.f52705e.clear();
        this.f52706f.clear();
        this.f52707g.clear();
        this.f52710j = false;
        this.f52708h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0490a c0490a = this.f52702b.get(view);
        if (c0490a != null) {
            c0490a.a(aVar.c());
        } else {
            this.f52702b.put(view, new C0490a(eVar, aVar.c()));
        }
    }
}
