package com.iab.omid.library.prebidorg.adsession;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zf extends zr {

    /* JADX INFO: renamed from: zc, reason: collision with root package name */
    private static final Pattern f53691zc = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: zb, reason: collision with root package name */
    private boolean f53692zb;

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final zs f53693zr;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private com.iab.omid.library.prebidorg.weakreference.zz f53695zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private com.iab.omid.library.prebidorg.publisher.zz f53696zu;
    private boolean zy;
    private final zt zz;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final List f53694zs = new ArrayList();

    /* JADX INFO: renamed from: zv, reason: collision with root package name */
    private boolean f53697zv = false;

    /* JADX INFO: renamed from: zw, reason: collision with root package name */
    private boolean f53698zw = false;

    /* JADX INFO: renamed from: zx, reason: collision with root package name */
    private final String f53699zx = UUID.randomUUID().toString();

    public zf(zs zsVar, zt ztVar) {
        this.f53693zr = zsVar;
        this.zz = ztVar;
        zu(null);
        this.f53696zu = (ztVar.zz() == zu.HTML || ztVar.zz() == zu.JAVASCRIPT) ? new com.iab.omid.library.prebidorg.publisher.zr(ztVar.zx()) : new com.iab.omid.library.prebidorg.publisher.zs(ztVar.zt(), ztVar.zu());
        this.f53696zu.zb();
        com.iab.omid.library.prebidorg.internal.zs.zs().zz(this);
        this.f53696zu.zz(zsVar);
    }

    private static void zr(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void zs() {
        if (this.zy) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void zt() {
        if (this.f53692zb) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void zz(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f53691zc.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public String zb() {
        return this.f53699zx;
    }

    public com.iab.omid.library.prebidorg.publisher.zz zc() {
        return this.f53696zu;
    }

    public boolean zd() {
        return this.f53693zr.zz();
    }

    public boolean ze() {
        return this.f53693zr.zr();
    }

    public boolean zf() {
        return this.f53697zv;
    }

    public void zg() {
        zs();
        zc().zw();
        this.zy = true;
    }

    public void zh() {
        zt();
        zc().zy();
        this.f53692zb = true;
    }

    public void zi() {
        if (this.f53698zw) {
            return;
        }
        this.f53694zs.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View zu() {
        return (View) this.f53695zt.get();
    }

    public List zv() {
        return this.f53694zs;
    }

    public boolean zw() {
        return false;
    }

    public boolean zx() {
        return this.f53697zv && !this.f53698zw;
    }

    public boolean zy() {
        return this.f53698zw;
    }

    private com.iab.omid.library.prebidorg.internal.zu zs(View view) {
        for (com.iab.omid.library.prebidorg.internal.zu zuVar : this.f53694zs) {
            if (zuVar.zs().get() == view) {
                return zuVar;
            }
        }
        return null;
    }

    private void zt(View view) {
        Collection<zf> collectionZr = com.iab.omid.library.prebidorg.internal.zs.zs().zr();
        if (collectionZr == null || collectionZr.isEmpty()) {
            return;
        }
        for (zf zfVar : collectionZr) {
            if (zfVar != this && zfVar.zu() == view) {
                zfVar.f53695zt.clear();
            }
        }
    }

    private void zu(View view) {
        this.f53695zt = new com.iab.omid.library.prebidorg.weakreference.zz(view);
    }

    @Override // com.iab.omid.library.prebidorg.adsession.zr
    public void zr() {
        if (this.f53697zv) {
            return;
        }
        this.f53697zv = true;
        com.iab.omid.library.prebidorg.internal.zs.zs().zs(this);
        this.f53696zu.zz(com.iab.omid.library.prebidorg.internal.zx.zs().zr());
        this.f53696zu.zz(com.iab.omid.library.prebidorg.internal.zz.zz().zr());
        this.f53696zu.zz(this, this.zz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void zz(List list) {
        if (zw()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((com.iab.omid.library.prebidorg.weakreference.zz) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    public void zz(JSONObject jSONObject) {
        zt();
        zc().zz(jSONObject);
        this.f53692zb = true;
    }

    @Override // com.iab.omid.library.prebidorg.adsession.zr
    public void zz(View view, zx zxVar, String str) {
        if (this.f53698zw) {
            return;
        }
        zr(view);
        zz(str);
        if (zs(view) == null) {
            this.f53694zs.add(new com.iab.omid.library.prebidorg.internal.zu(view, zxVar, str));
        }
    }

    @Override // com.iab.omid.library.prebidorg.adsession.zr
    public void zz() {
        if (this.f53698zw) {
            return;
        }
        this.f53695zt.clear();
        zi();
        this.f53698zw = true;
        zc().zv();
        com.iab.omid.library.prebidorg.internal.zs.zs().zr(this);
        zc().zr();
        this.f53696zu = null;
    }

    @Override // com.iab.omid.library.prebidorg.adsession.zr
    public void zz(View view) {
        if (this.f53698zw) {
            return;
        }
        com.iab.omid.library.prebidorg.utils.zw.zz(view, "AdView is null");
        if (zu() == view) {
            return;
        }
        zu(view);
        zc().zz();
        zt(view);
    }
}
