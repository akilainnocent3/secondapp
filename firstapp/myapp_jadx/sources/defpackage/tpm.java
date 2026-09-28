package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class tpm implements i2w<d0l, InputStream> {
    public static final h2z<Integer> b = h2z.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final h2w<d0l, d0l> a;

    public static class a implements j2w<d0l, InputStream> {
        public final h2w<d0l, d0l> a = new h2w<>();

        @Override // defpackage.j2w
        public final i2w<d0l, InputStream> c(wjw wjwVar) {
            return new tpm(this.a);
        }
    }

    public tpm(h2w<d0l, d0l> h2wVar) {
        this.a = h2wVar;
    }

    @Override // defpackage.i2w
    public final i2w.a<InputStream> a(d0l d0lVar, int i, int i2, s2z s2zVar) {
        d0l d0lVar2 = d0lVar;
        g2w g2wVar = this.a.a;
        h2w.a aVarA = h2w.a.a(d0lVar2);
        Object objA = g2wVar.a(aVarA);
        ArrayDeque arrayDeque = h2w.a.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVarA);
        }
        d0l d0lVar3 = (d0l) objA;
        if (d0lVar3 == null) {
            g2wVar.d(h2w.a.a(d0lVar2), d0lVar2);
        } else {
            d0lVar2 = d0lVar3;
        }
        return new i2w.a<>(d0lVar2, new iqm(d0lVar2, ((Integer) s2zVar.c(b)).intValue()));
    }

    @Override // defpackage.i2w
    public final boolean b(d0l d0lVar) {
        return true;
    }
}
