package defpackage;

import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.earlypayout.presentation.EarlyPayoutConfigViewModel$fetchEarlyPayoutConfigs$1", f = "EarlyPayoutConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tjf extends tje0 implements Function2<EarlyPayoutConfigModel, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ujf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjf(ujf ujfVar, v1b<? super tjf> v1bVar) {
        super(2, v1bVar);
        this.b = ujfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tjf tjfVar = new tjf(this.b, v1bVar);
        tjfVar.a = obj;
        return tjfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EarlyPayoutConfigModel earlyPayoutConfigModel, v1b<? super Unit> v1bVar) {
        return ((tjf) create(earlyPayoutConfigModel, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        EarlyPayoutConfigModel earlyPayoutConfigModel = (EarlyPayoutConfigModel) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (earlyPayoutConfigModel == null) {
            return Unit.a;
        }
        Map<ckf, EarlyPayoutConfig> mapD = g2k.d(earlyPayoutConfigModel);
        ujf ujfVar = this.b;
        wwd0 wwd0Var = ujfVar.c;
        wwd0Var.getClass();
        wwd0Var.k(null, mapD);
        ujfVar.b.a(mapD);
        return Unit.a;
    }
}
