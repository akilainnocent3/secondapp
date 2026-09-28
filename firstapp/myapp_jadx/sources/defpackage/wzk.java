package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wzk extends ContextWrapper {
    public static final y1k i = new y1k();
    public final px0 a;
    public final b0l b;
    public final j4d c;
    public final List<wa50<Object>> d;
    public final ox0 e;
    public final n6g f;
    public final zzk g;
    public hb50 h;

    public wzk(Context context, px0 px0Var, a150 a150Var, j4d j4dVar, vzk.a aVar, ox0 ox0Var, List list, n6g n6gVar, zzk zzkVar) {
        super(context.getApplicationContext());
        this.a = px0Var;
        this.c = j4dVar;
        this.d = list;
        this.e = ox0Var;
        this.f = n6gVar;
        this.g = zzkVar;
        this.b = new b0l(a150Var);
    }

    public final x050 a() {
        return (x050) this.b.get();
    }
}
