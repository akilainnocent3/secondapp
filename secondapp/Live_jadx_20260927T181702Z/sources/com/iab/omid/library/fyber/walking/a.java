package com.iab.omid.library.fyber.walking;

import android.view.View;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f53227a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0506a> f53228b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f53229c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f53230d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f53231e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f53232f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f53233g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f53234h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f53235i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53236j;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.a$a, reason: collision with other inner class name */
    public static class C0506a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f53237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f53238b = new ArrayList<>();

        public C0506a(e eVar, String str) {
            this.f53237a = eVar;
            a(str);
        }

        public e a() {
            return this.f53237a;
        }

        public ArrayList<String> b() {
            return this.f53238b;
        }

        public void a(String str) {
            this.f53238b.add(str);
        }
    }

    public View a(String str) {
        return this.f53229c.get(str);
    }

    public C0506a b(View view) {
        C0506a c0506a = this.f53228b.get(view);
        if (c0506a != null) {
            this.f53228b.remove(view);
        }
        return c0506a;
    }

    public String c(View view) {
        if (this.f53227a.size() == 0) {
            return null;
        }
        String str = this.f53227a.get(view);
        if (str != null) {
            this.f53227a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f53230d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f53236j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f53234h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f53231e.add(strC);
                            this.f53227a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f53232f.add(strC);
                            this.f53229c.put(strC, viewE);
                            this.f53233g.put(strC, strA);
                        }
                    } else {
                        this.f53232f.add(strC);
                        this.f53233g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f53235i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f53235i.containsKey(view)) {
            return this.f53235i.get(view);
        }
        Map<View, Boolean> map = this.f53235i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f53233g.get(str);
    }

    public HashSet<String> c() {
        return this.f53231e;
    }

    public void d() {
        this.f53236j = true;
    }

    public boolean e(View view) {
        if (!this.f53235i.containsKey(view)) {
            return true;
        }
        this.f53235i.put(view, Boolean.TRUE);
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
        this.f53230d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f53232f;
    }

    public boolean c(String str) {
        return this.f53234h.contains(str);
    }

    public void a() {
        this.f53227a.clear();
        this.f53228b.clear();
        this.f53229c.clear();
        this.f53230d.clear();
        this.f53231e.clear();
        this.f53232f.clear();
        this.f53233g.clear();
        this.f53236j = false;
        this.f53234h.clear();
    }

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.fyber.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0506a c0506a = this.f53228b.get(view);
        if (c0506a != null) {
            c0506a.a(aVar.c());
        } else {
            this.f53228b.put(view, new C0506a(eVar, aVar.c()));
        }
    }
}
