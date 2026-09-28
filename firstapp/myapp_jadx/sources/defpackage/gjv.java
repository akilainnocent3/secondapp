package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gjv implements ijv.d {
    public final /* synthetic */ a a;

    public /* synthetic */ gjv(a aVar) {
        this.a = aVar;
    }

    @Override // ijv.d
    public final int a(Object obj) {
        ziv zivVar = (ziv) obj;
        String str = zivVar.b;
        a aVar = this.a;
        return ((str.equals(aVar.n) || str.equals(ijv.b(aVar))) && zivVar.c(aVar, false) && zivVar.d(aVar)) ? 1 : 0;
    }
}
