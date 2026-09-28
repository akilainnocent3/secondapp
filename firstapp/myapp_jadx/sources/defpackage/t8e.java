package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess$invoke$topUpEmitter$1", f = "DepositUiProcess.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t8e extends tje0 implements Function2<qnd, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ vtw<pdd0> b;
    public final /* synthetic */ w7e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8e(vtw<pdd0> vtwVar, w7e w7eVar, v1b<? super t8e> v1bVar) {
        super(2, v1bVar);
        this.b = vtwVar;
        this.c = w7eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t8e t8eVar = new t8e(this.b, this.c, v1bVar);
        t8eVar.a = obj;
        return t8eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qnd qndVar, v1b<? super Unit> v1bVar) {
        return ((t8e) create(qndVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qnd qndVar = (qnd) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        w7e w7eVar = this.c;
        List<String> list = w7eVar.a;
        if (list.isEmpty()) {
            list = null;
        }
        this.b.a(qnd.e(qndVar, null, null, list, null, null, w7eVar.b, 7167));
        return Unit.a;
    }
}
