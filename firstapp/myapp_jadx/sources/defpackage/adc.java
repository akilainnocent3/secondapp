package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$displayResetCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class adc extends tje0 implements Function2<fac.b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adc(bdc bdcVar, v1b<? super adc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        adc adcVar = new adc(this.b, v1bVar);
        adcVar.a = obj;
        return adcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fac.b bVar, v1b<? super Unit> v1bVar) {
        return ((adc) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fac.b bVar = (fac.b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.G.setValue(bVar);
        return Unit.a;
    }
}
