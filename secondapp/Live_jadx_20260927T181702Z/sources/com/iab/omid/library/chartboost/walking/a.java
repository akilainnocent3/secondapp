package com.iab.omid.library.chartboost.walking;

import android.view.View;
import com.iab.omid.library.chartboost.internal.e;
import com.iab.omid.library.chartboost.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f53092a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0502a> f53093b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f53094c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f53095d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f53096e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f53097f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f53098g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f53099h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f53100i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53101j;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.a$a, reason: collision with other inner class name */
    public static class C0502a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f53102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f53103b = new ArrayList<>();

        public C0502a(e eVar, String str) {
            this.f53102a = eVar;
            a(str);
        }

        public e a() {
            return this.f53102a;
        }

        public ArrayList<String> b() {
            return this.f53103b;
        }

        public void a(String str) {
            this.f53103b.add(str);
        }
    }

    public View a(String str) {
        return this.f53094c.get(str);
    }

    public C0502a b(View view) {
        C0502a c0502a = this.f53093b.get(view);
        if (c0502a != null) {
            this.f53093b.remove(view);
        }
        return c0502a;
    }

    public String c(View view) {
        if (this.f53092a.size() == 0) {
            return null;
        }
        String str = this.f53092a.get(view);
        if (str != null) {
            this.f53092a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f53095d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f53101j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.chartboost.internal.c cVarC = com.iab.omid.library.chartboost.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.chartboost.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f53099h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f53096e.add(strC);
                            this.f53092a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f53097f.add(strC);
                            this.f53094c.put(strC, viewE);
                            this.f53098g.put(strC, strA);
                        }
                    } else {
                        this.f53097f.add(strC);
                        this.f53098g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f53100i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f53100i.containsKey(view)) {
            return this.f53100i.get(view);
        }
        Map<View, Boolean> map = this.f53100i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f53098g.get(str);
    }

    public HashSet<String> c() {
        return this.f53096e;
    }

    public void d() {
        this.f53101j = true;
    }

    public boolean e(View view) {
        if (!this.f53100i.containsKey(view)) {
            return true;
        }
        this.f53100i.put(view, Boolean.TRUE);
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
        this.f53095d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f53097f;
    }

    public boolean c(String str) {
        return this.f53099h.contains(str);
    }

    public void a() {
        this.f53092a.clear();
        this.f53093b.clear();
        this.f53094c.clear();
        this.f53095d.clear();
        this.f53096e.clear();
        this.f53097f.clear();
        this.f53098g.clear();
        this.f53101j = false;
        this.f53099h.clear();
    }

    private void a(com.iab.omid.library.chartboost.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.chartboost.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0502a c0502a = this.f53093b.get(view);
        if (c0502a != null) {
            c0502a.a(aVar.c());
        } else {
            this.f53093b.put(view, new C0502a(eVar, aVar.c()));
        }
    }
}
