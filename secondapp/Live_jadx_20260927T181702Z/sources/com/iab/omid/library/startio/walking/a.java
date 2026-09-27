package com.iab.omid.library.startio.walking;

import android.view.View;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f53950a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f53951b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f53952c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f53953d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f53954e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f53955f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f53956g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet f53957h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f53958i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53959j;

    /* JADX INFO: renamed from: com.iab.omid.library.startio.walking.a$a, reason: collision with other inner class name */
    public class C0529a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f53960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f53961b = new ArrayList();

        public C0529a(e eVar, String str) {
            this.f53960a = eVar;
            a(str);
        }

        public e a() {
            return this.f53960a;
        }

        public ArrayList b() {
            return this.f53961b;
        }

        public void a(String str) {
            this.f53961b.add(str);
        }
    }

    public View a(String str) {
        return (View) this.f53952c.get(str);
    }

    public C0529a b(View view) {
        C0529a c0529a = (C0529a) this.f53951b.get(view);
        if (c0529a != null) {
            this.f53951b.remove(view);
        }
        return c0529a;
    }

    public String c(View view) {
        if (this.f53950a.size() == 0) {
            return null;
        }
        String str = (String) this.f53950a.get(view);
        if (str != null) {
            this.f53950a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        if (this.f53953d.contains(view)) {
            return c.PARENT_VIEW;
        }
        return this.f53959j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f53957h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f53954e.add(strC);
                            this.f53950a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f53955f.add(strC);
                            this.f53952c.put(strC, viewE);
                            this.f53956g.put(strC, strA);
                        }
                    } else {
                        this.f53955f.add(strC);
                        this.f53956g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f53958i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f53958i.containsKey(view)) {
            return (Boolean) this.f53958i.get(view);
        }
        Map map = this.f53958i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return (String) this.f53956g.get(str);
    }

    public HashSet c() {
        return this.f53954e;
    }

    public void d() {
        this.f53959j = true;
    }

    public boolean e(View view) {
        if (!this.f53958i.containsKey(view)) {
            return true;
        }
        this.f53958i.put(view, Boolean.TRUE);
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
        this.f53953d.addAll(hashSet);
        return null;
    }

    public HashSet b() {
        return this.f53955f;
    }

    public boolean c(String str) {
        return this.f53957h.contains(str);
    }

    public void a() {
        this.f53950a.clear();
        this.f53951b.clear();
        this.f53952c.clear();
        this.f53953d.clear();
        this.f53954e.clear();
        this.f53955f.clear();
        this.f53956g.clear();
        this.f53959j = false;
        this.f53957h.clear();
    }

    private void a(com.iab.omid.library.startio.adsession.a aVar) {
        Iterator it = aVar.f().iterator();
        while (it.hasNext()) {
            a((e) it.next(), aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(e eVar, com.iab.omid.library.startio.adsession.a aVar) {
        View view = (View) eVar.c().get();
        if (view == null) {
            return;
        }
        C0529a c0529a = (C0529a) this.f53951b.get(view);
        if (c0529a != null) {
            c0529a.a(aVar.c());
        } else {
            this.f53951b.put(view, new C0529a(eVar, aVar.c()));
        }
    }
}
