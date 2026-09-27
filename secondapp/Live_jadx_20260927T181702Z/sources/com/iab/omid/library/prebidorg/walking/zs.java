package com.iab.omid.library.prebidorg.walking;

import android.view.View;
import com.iab.omid.library.prebidorg.adsession.zf;
import com.iab.omid.library.prebidorg.utils.zx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zs {
    private boolean zy;
    private final HashMap zz = new HashMap();

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final HashMap f53794zr = new HashMap();

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final HashMap f53795zs = new HashMap();

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final HashSet f53796zt = new HashSet();

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private final HashSet f53797zu = new HashSet();

    /* JADX INFO: renamed from: zv, reason: collision with root package name */
    private final HashSet f53798zv = new HashSet();

    /* JADX INFO: renamed from: zw, reason: collision with root package name */
    private final HashMap f53799zw = new HashMap();

    /* JADX INFO: renamed from: zx, reason: collision with root package name */
    private final Map f53800zx = new WeakHashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class zz {

        /* JADX INFO: renamed from: zr, reason: collision with root package name */
        private final ArrayList f53801zr = new ArrayList();
        private final com.iab.omid.library.prebidorg.internal.zu zz;

        public zz(com.iab.omid.library.prebidorg.internal.zu zuVar, String str) {
            this.zz = zuVar;
            zz(str);
        }

        public ArrayList zr() {
            return this.f53801zr;
        }

        public com.iab.omid.library.prebidorg.internal.zu zz() {
            return this.zz;
        }

        public void zz(String str) {
            this.f53801zr.add(str);
        }
    }

    private Boolean zr(View view) {
        if (view.hasWindowFocus()) {
            this.f53800zx.remove(view);
            return Boolean.FALSE;
        }
        if (this.f53800zx.containsKey(view)) {
            return (Boolean) this.f53800zx.get(view);
        }
        Map map = this.f53800zx;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public zz zs(View view) {
        zz zzVar = (zz) this.f53794zr.get(view);
        if (zzVar != null) {
            this.f53794zr.remove(view);
        }
        return zzVar;
    }

    public String zt(View view) {
        if (this.zz.size() == 0) {
            return null;
        }
        String str = (String) this.zz.get(view);
        if (str != null) {
            this.zz.remove(view);
        }
        return str;
    }

    public zu zu(View view) {
        if (this.f53796zt.contains(view)) {
            return zu.PARENT_VIEW;
        }
        return this.zy ? zu.OBSTRUCTION_VIEW : zu.UNDERLYING_VIEW;
    }

    public boolean zv(View view) {
        if (!this.f53800zx.containsKey(view)) {
            return true;
        }
        this.f53800zx.put(view, Boolean.TRUE);
        return false;
    }

    public View zz(String str) {
        return (View) this.f53795zs.get(str);
    }

    private String zz(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (zr(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strZz = zx.zz(view);
            if (strZz != null) {
                return strZz;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f53796zt.addAll(hashSet);
        return null;
    }

    public String zr(String str) {
        return (String) this.f53799zw.get(str);
    }

    public HashSet zs() {
        return this.f53797zu;
    }

    public void zt() {
        this.zy = true;
    }

    public void zu() {
        com.iab.omid.library.prebidorg.internal.zs zsVarZs = com.iab.omid.library.prebidorg.internal.zs.zs();
        if (zsVarZs != null) {
            for (zf zfVar : zsVarZs.zz()) {
                View viewZu = zfVar.zu();
                if (zfVar.zx()) {
                    String strZb = zfVar.zb();
                    if (viewZu != null) {
                        String strZz = zz(viewZu);
                        if (strZz == null) {
                            this.f53797zu.add(strZb);
                            this.zz.put(viewZu, strZb);
                            zz(zfVar);
                        } else if (strZz != "noWindowFocus") {
                            this.f53798zv.add(strZb);
                            this.f53795zs.put(strZb, viewZu);
                            this.f53799zw.put(strZb, strZz);
                        }
                    } else {
                        this.f53798zv.add(strZb);
                        this.f53799zw.put(strZb, "noAdView");
                    }
                }
            }
        }
    }

    public HashSet zr() {
        return this.f53798zv;
    }

    public void zz() {
        this.zz.clear();
        this.f53794zr.clear();
        this.f53795zs.clear();
        this.f53796zt.clear();
        this.f53797zu.clear();
        this.f53798zv.clear();
        this.f53799zw.clear();
        this.zy = false;
    }

    private void zz(zf zfVar) {
        Iterator it = zfVar.zv().iterator();
        while (it.hasNext()) {
            zz((com.iab.omid.library.prebidorg.internal.zu) it.next(), zfVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zz(com.iab.omid.library.prebidorg.internal.zu zuVar, zf zfVar) {
        View view = (View) zuVar.zs().get();
        if (view == null) {
            return;
        }
        zz zzVar = (zz) this.f53794zr.get(view);
        if (zzVar != null) {
            zzVar.zz(zfVar.zb());
        } else {
            this.f53794zr.put(view, new zz(zuVar, zfVar.zb()));
        }
    }
}
