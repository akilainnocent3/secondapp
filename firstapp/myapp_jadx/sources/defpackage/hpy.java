package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class hpy extends saj implements gaj<ipy, a780<?>, Object, Unit> {
    public static final hpy a = new hpy(3, ipy.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.gaj
    public final Unit invoke(ipy ipyVar, a780<?> a780Var, Object obj) {
        final ipy ipyVar2 = ipyVar;
        final a780<?> a780Var2 = a780Var;
        long j = ipyVar2.a;
        if (j <= 0) {
            a780Var2.c(Unit.a);
        } else {
            Runnable runnable = new Runnable() { // from class: gpy
                @Override // java.lang.Runnable
                public final void run() {
                    a780Var2.d(ipyVar2, Unit.a);
                }
            };
            a780Var2.getClass();
            x680 x680Var = (x680) a780Var2;
            CoroutineContext coroutineContext = x680Var.a;
            x680Var.c = hkd.d(coroutineContext).m(j, runnable, coroutineContext);
        }
        return Unit.a;
    }
}
