package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import defpackage.uam;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jnh<T extends uam> implements tsz.a<T> {
    public final tsz.a<? extends T> a;
    public final List<StreamKey> b;

    public jnh(tsz.a<? extends T> aVar, List<StreamKey> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // tsz.a
    public final Object a(Uri uri, eqc eqcVar) {
        uam uamVar = (uam) this.a.a(uri, eqcVar);
        List<StreamKey> list = this.b;
        return (list == null || list.isEmpty()) ? uamVar : (uam) uamVar.a(list);
    }
}
