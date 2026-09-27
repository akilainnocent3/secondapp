package com.iab.omid.library.prebidorg.internal;

import android.view.View;
import com.iab.omid.library.prebidorg.adsession.zf;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zr extends zt {

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private static zr f53741zt = new zr();

    private zr() {
    }

    public static zr zw() {
        return f53741zt;
    }

    @Override // com.iab.omid.library.prebidorg.internal.zt
    public void zr(boolean z10) {
        Iterator it = zs.zs().zr().iterator();
        while (it.hasNext()) {
            ((zf) it.next()).zc().zz(z10);
        }
    }

    @Override // com.iab.omid.library.prebidorg.internal.zt
    public boolean zt() {
        Iterator it = zs.zs().zz().iterator();
        while (it.hasNext()) {
            View viewZu = ((zf) it.next()).zu();
            if (viewZu != null && viewZu.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
