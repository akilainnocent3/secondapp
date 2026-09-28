package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.experiment.OneUpExperimentCoordinator$awaitResolvedExperimentState$resolvedSession$1", f = "OneUpExperimentCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
public final class msy extends tje0 implements Function2<osy, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ psy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msy(psy psyVar, v1b<? super msy> v1bVar) {
        super(2, v1bVar);
        this.b = psyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        msy msyVar = new msy(this.b, v1bVar);
        msyVar.a = obj;
        return msyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(osy osyVar, v1b<? super Boolean> v1bVar) {
        return ((msy) create(osyVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        osy osyVar = (osy) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!osyVar.a.equals(this.b) || osyVar.b);
    }
}
