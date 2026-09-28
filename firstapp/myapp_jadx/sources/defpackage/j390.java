package defpackage;

import android.net.ConnectivityManager;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class j390 extends qlr implements Function0<Unit> {
    public final /* synthetic */ aox.b a;
    public final /* synthetic */ ConnectivityManager b;
    public final /* synthetic */ k390 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j390(aox.b bVar, ConnectivityManager connectivityManager, k390 k390Var) {
        super(0);
        this.a = bVar;
        this.b = connectivityManager;
        this.c = k390Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = k390.b;
        aox.b bVar = this.a;
        ConnectivityManager connectivityManager = this.b;
        k390 k390Var = this.c;
        synchronized (obj) {
            LinkedHashMap linkedHashMap = k390.c;
            linkedHashMap.remove(bVar);
            if (linkedHashMap.isEmpty()) {
                jgt.e().a(quj0.a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(k390Var);
                k390.a.getClass();
                k390.d = null;
                k390.e = false;
            }
        }
        return Unit.a;
    }
}
