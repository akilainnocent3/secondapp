package defpackage;

import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class enh0 implements i2w<URL, InputStream> {
    public final i2w<d0l, InputStream> a;

    public static class a implements j2w<URL, InputStream> {
        @Override // defpackage.j2w
        public final i2w<URL, InputStream> c(wjw wjwVar) {
            return new enh0(wjwVar.b(d0l.class, InputStream.class));
        }
    }

    public enh0(i2w<d0l, InputStream> i2wVar) {
        this.a = i2wVar;
    }

    @Override // defpackage.i2w
    public final i2w.a<InputStream> a(URL url, int i, int i2, s2z s2zVar) {
        return this.a.a(new d0l(url), i, i2, s2zVar);
    }

    @Override // defpackage.i2w
    public final boolean b(URL url) {
        return true;
    }
}
