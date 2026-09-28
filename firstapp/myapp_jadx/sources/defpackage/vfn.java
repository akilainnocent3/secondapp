package defpackage;

import android.net.ConnectivityManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vfn extends qlr implements Function0<Unit> {
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ ConnectivityManager b;
    public final /* synthetic */ wfn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfn(yp40 yp40Var, ConnectivityManager connectivityManager, wfn wfnVar) {
        super(0);
        this.a = yp40Var;
        this.b = connectivityManager;
        this.c = wfnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.a.a) {
            jgt.e().a(quj0.a, "NetworkRequestConstraintController unregister callback");
            this.b.unregisterNetworkCallback(this.c);
        }
        return Unit.a;
    }
}
