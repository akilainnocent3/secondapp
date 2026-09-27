package com.iab.omid.library.prebidorg.internal;

import com.iab.omid.library.prebidorg.adsession.zf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zs {

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private static zs f53742zs = new zs();
    private final ArrayList zz = new ArrayList();

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final ArrayList f53743zr = new ArrayList();

    private zs() {
    }

    public static zs zs() {
        return f53742zs;
    }

    public Collection zr() {
        return Collections.unmodifiableCollection(this.zz);
    }

    public boolean zt() {
        return this.f53743zr.size() > 0;
    }

    public Collection zz() {
        return Collections.unmodifiableCollection(this.f53743zr);
    }

    public void zr(zf zfVar) {
        boolean zZt = zt();
        this.zz.remove(zfVar);
        this.f53743zr.remove(zfVar);
        if (!zZt || zt()) {
            return;
        }
        zx.zs().zu();
    }

    public void zs(zf zfVar) {
        boolean zZt = zt();
        this.f53743zr.add(zfVar);
        if (zZt) {
            return;
        }
        zx.zs().zt();
    }

    public void zz(zf zfVar) {
        this.zz.add(zfVar);
    }
}
