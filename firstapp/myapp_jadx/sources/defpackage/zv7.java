package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzv7;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zv7 extends j8i0 {
    public final n4k a;
    public final wwd0 b;
    public final v340 c;
    public jvd0 d;

    public zv7(n4k n4kVar, rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = n4kVar;
        wwd0 wwd0VarA = xwd0.a(new xv7(0));
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        super.onCleared();
    }
}
