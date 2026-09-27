package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f53368a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0511a> f53369b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f53370c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f53371d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f53372e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f53373f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f53374g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f53375h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f53376i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53377j;

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0511a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f53378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f53379b = new ArrayList<>();

        public C0511a(e eVar, String str) {
            this.f53378a = eVar;
            a(str);
        }

        public e a() {
            return this.f53378a;
        }

        public ArrayList<String> b() {
            return this.f53379b;
        }

        public void a(String str) {
            this.f53379b.add(str);
        }
    }

    public View a(String str) {
        return this.f53370c.get(str);
    }

    public C0511a b(View view) {
        C0511a c0511a = this.f53369b.get(view);
        if (c0511a != null) {
            this.f53369b.remove(view);
        }
        return c0511a;
    }

    public String c(View view) {
        if (this.f53368a.size() == 0) {
            return null;
        }
        String str = this.f53368a.get(view);
        if (str != null) {
            this.f53368a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f53371d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f53377j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f53375h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f53372e.add(strC);
                            this.f53368a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f53373f.add(strC);
                            this.f53370c.put(strC, viewE);
                            this.f53374g.put(strC, strA);
                        }
                    } else {
                        this.f53373f.add(strC);
                        this.f53374g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f53376i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f53376i.containsKey(view)) {
            return this.f53376i.get(view);
        }
        Map<View, Boolean> map = this.f53376i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f53374g.get(str);
    }

    public HashSet<String> c() {
        return this.f53372e;
    }

    public void d() {
        this.f53377j = true;
    }

    public boolean e(View view) {
        if (!this.f53376i.containsKey(view)) {
            return true;
        }
        this.f53376i.put(view, Boolean.TRUE);
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
        this.f53371d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f53373f;
    }

    public boolean c(String str) {
        return this.f53375h.contains(str);
    }

    public void a() {
        this.f53368a.clear();
        this.f53369b.clear();
        this.f53370c.clear();
        this.f53371d.clear();
        this.f53372e.clear();
        this.f53373f.clear();
        this.f53374g.clear();
        this.f53377j = false;
        this.f53375h.clear();
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0511a c0511a = this.f53369b.get(view);
        if (c0511a != null) {
            c0511a.a(aVar.c());
        } else {
            this.f53369b.put(view, new C0511a(eVar, aVar.c()));
        }
    }
}
