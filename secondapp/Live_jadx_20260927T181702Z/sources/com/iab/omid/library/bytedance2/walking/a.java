package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f52952a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0497a> f52953b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f52954c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f52955d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f52956e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f52957f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f52958g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f52959h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f52960i;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0497a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f52961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f52962b = new ArrayList<>();

        public C0497a(e eVar, String str) {
            this.f52961a = eVar;
            a(str);
        }

        public e a() {
            return this.f52961a;
        }

        public ArrayList<String> b() {
            return this.f52962b;
        }

        public void a(String str) {
            this.f52962b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f52959h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f52959h.containsKey(view)) {
            return this.f52959h.get(view);
        }
        Map<View, Boolean> map = this.f52959h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f52954c.get(str);
    }

    public C0497a c(View view) {
        C0497a c0497a = this.f52953b.get(view);
        if (c0497a != null) {
            this.f52953b.remove(view);
        }
        return c0497a;
    }

    public String d(View view) {
        if (this.f52952a.size() == 0) {
            return null;
        }
        String str = this.f52952a.get(view);
        if (str != null) {
            this.f52952a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        if (this.f52955d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f52960i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f52959h.containsKey(view)) {
            return true;
        }
        this.f52959h.put(view, Boolean.TRUE);
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
        this.f52955d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f52958g.get(str);
    }

    public HashSet<String> c() {
        return this.f52956e;
    }

    public void d() {
        this.f52960i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f52956e.add(adSessionId);
                            this.f52952a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f52957f.add(adSessionId);
                            this.f52954c.put(adSessionId, viewC);
                            this.f52958g.put(adSessionId, strA);
                        }
                    } else {
                        this.f52957f.add(adSessionId);
                        this.f52958g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f52952a.clear();
        this.f52953b.clear();
        this.f52954c.clear();
        this.f52955d.clear();
        this.f52956e.clear();
        this.f52957f.clear();
        this.f52958g.clear();
        this.f52960i = false;
    }

    public HashSet<String> b() {
        return this.f52957f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0497a c0497a = this.f52953b.get(view);
        if (c0497a != null) {
            c0497a.a(aVar.getAdSessionId());
        } else {
            this.f52953b.put(view, new C0497a(eVar, aVar.getAdSessionId()));
        }
    }
}
