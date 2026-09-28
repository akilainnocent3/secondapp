package defpackage;

import com.sportybet.plugin.realsports.prematch.data.LiveSectionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.LiveSectionUseCase$fetchLiveSectionData$2", f = "LiveSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mts extends tje0 implements Function2<lk50<? extends LiveSectionData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ t2j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mts(t2j t2jVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = t2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mts mtsVar = new mts(this.b, v1bVar);
        mtsVar.a = obj;
        return mtsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends LiveSectionData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((mts) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
