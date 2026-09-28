package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$errorHandle$2", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class gvi0 extends tje0 implements Function2<mk50<? extends List<? extends CommonGameDetails>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ yui0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvi0(Throwable th, yui0 yui0Var, v1b<? super gvi0> v1bVar) {
        super(2, v1bVar);
        this.b = th;
        this.c = yui0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gvi0 gvi0Var = new gvi0(this.b, this.c, v1bVar);
        gvi0Var.a = obj;
        return gvi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends List<? extends CommonGameDetails>> mk50Var, v1b<? super Unit> v1bVar) {
        return ((gvi0) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        iwg bVar;
        mk50 mk50Var = (mk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(mk50Var, mk50.b.a)) {
            bVar = iwg.a.a;
        } else {
            mk50.c cVar = mk50Var instanceof mk50.c ? (mk50.c) mk50Var : null;
            bVar = new iwg.b(cVar != null ? (List) cVar.a : null);
        }
        String message = this.b.getMessage();
        if (message == null) {
            message = "Something went wrong.";
        }
        wwd0 wwd0Var = this.c.T;
        ari0.e eVar = new ari0.e(message, bVar, true);
        wwd0Var.getClass();
        wwd0Var.k(null, eVar);
        return Unit.a;
    }
}
