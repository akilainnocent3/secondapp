package defpackage;

import com.sporty.android.core.model.realsports.EarlyPayoutConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.earlypayout.data.repository.EarlyPayoutConfigRepositoryImpl$getEarlyPayoutBOConfigs$2", f = "EarlyPayoutConfigRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rjf extends tje0 implements Function2<EarlyPayoutConfigModel, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sjf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjf(sjf sjfVar, v1b<? super rjf> v1bVar) {
        super(2, v1bVar);
        this.b = sjfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rjf rjfVar = new rjf(this.b, v1bVar);
        rjfVar.a = obj;
        return rjfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EarlyPayoutConfigModel earlyPayoutConfigModel, v1b<? super Unit> v1bVar) {
        return ((rjf) create(earlyPayoutConfigModel, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        EarlyPayoutConfigModel earlyPayoutConfigModel = (EarlyPayoutConfigModel) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.b.f(earlyPayoutConfigModel);
        return Unit.a;
    }
}
