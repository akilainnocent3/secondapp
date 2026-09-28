package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lult;", "Lavw;", "Lslt;", "Lrdd;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ult extends avw<slt> implements rdd {
    public final x7k e;
    public final olt f;
    public jvd0 i;

    public ult(x7k x7kVar, olt oltVar) {
        super(slt.b.a);
        this.e = x7kVar;
        this.f = oltVar;
    }

    @Override // defpackage.rdd
    public final void onResume(ibs ibsVar) {
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.i = y1(new tlt(this, null));
    }
}
