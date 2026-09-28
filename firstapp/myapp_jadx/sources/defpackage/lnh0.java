package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lnh0<Data> implements i2w<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final i2w<d0l, Data> a;

    public static class a implements j2w<Uri, InputStream> {
        @Override // defpackage.j2w
        public final i2w<Uri, InputStream> c(wjw wjwVar) {
            return new lnh0(wjwVar.b(d0l.class, InputStream.class));
        }
    }

    public lnh0(i2w<d0l, Data> i2wVar) {
        this.a = i2wVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Uri uri, int i, int i2, s2z s2zVar) {
        return this.a.a(new d0l(uri.toString()), i, i2, s2zVar);
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
