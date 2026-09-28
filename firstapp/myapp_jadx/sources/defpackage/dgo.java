package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class dgo implements m7o {
    @Override // defpackage.m7o
    public final String a() {
        wae.a aVar = wae.b;
        return bjb0.S("/applink/instantWin");
    }

    @Override // defpackage.m7o
    public final void b(String str) {
        yrh0.e(str);
    }

    @Override // defpackage.m7o
    public final String c(t6i0.a aVar) {
        return yrh0.h(aVar);
    }

    @Override // defpackage.m7o
    public final boolean d(t6i0.a aVar, Uri uri, String str) {
        str.getClass();
        return xs60.b(aVar, uri, str, "image/png");
    }
}
