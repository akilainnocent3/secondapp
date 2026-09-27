package com.iab.omid.library.prebidorg;

import android.content.Context;
import com.iab.omid.library.prebidorg.internal.zv;
import com.iab.omid.library.prebidorg.internal.zx;
import com.iab.omid.library.prebidorg.utils.zw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zt {
    private boolean zz;

    private void zr(Context context) {
        zw.zz(context, "Application Context cannot be null");
    }

    public void zz(Context context) {
        zr(context);
        if (zz()) {
            return;
        }
        zz(true);
        zx.zs().zz(context);
        com.iab.omid.library.prebidorg.internal.zr.zw().zz(context);
        com.iab.omid.library.prebidorg.utils.zz.zz(context);
        com.iab.omid.library.prebidorg.utils.zs.zz(context);
        com.iab.omid.library.prebidorg.utils.zu.zz(context);
        zv.zr().zz(context);
        com.iab.omid.library.prebidorg.internal.zz.zz().zz(context);
    }

    public void zz(boolean z10) {
        this.zz = z10;
    }

    public boolean zz() {
        return this.zz;
    }
}
