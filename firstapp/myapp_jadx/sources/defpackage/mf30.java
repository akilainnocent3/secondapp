package defpackage;

import com.sporty.android.core.model.MyLog;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$fetchOutcomeDataOnAttach$1", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tf30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf30(tf30 tf30Var, v1b<? super mf30> v1bVar) {
        super(2, v1bVar);
        this.a = tf30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mf30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tf30 tf30Var = this.a;
        ArrayList arrayListU = tf30Var.y.U();
        if (arrayListU.isEmpty() || arrayListU.size() > 1) {
            tf30Var.d0 = null;
            return Unit.a;
        }
        String requestBody = g880.k(arrayListU, true).getRequestBody();
        if (Intrinsics.g(requestBody, tf30Var.d0)) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_QUICK_BET);
            aVar.g("same selection on attach, outcome fetch skipped.", new Object[0]);
            return Unit.a;
        }
        tf30Var.d0 = requestBody;
        aak aakVar = aak.a;
        jvd0 jvd0Var = tf30Var.e0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        tf30Var.e0 = ej5.c(o8i0.d(tf30Var), null, null, new of30(tf30Var, requestBody, arrayListU, null), 3);
        return Unit.a;
    }
}
