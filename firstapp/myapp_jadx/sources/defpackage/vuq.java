package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$state$1", f = "LNMissionTabViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class vuq extends tje0 implements kaj<lk50<? extends qcn<? extends osv>>, scn<Integer, ? extends uxs>, ucn<? extends Integer>, ucn<? extends Integer>, Boolean, v1b<? super ruq>, Object> {
    public int a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ scn c;
    public /* synthetic */ ucn d;
    public /* synthetic */ ucn e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ tuq i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuq(tuq tuqVar, v1b<? super vuq> v1bVar) {
        super(6, v1bVar);
        this.i = tuqVar;
    }

    @Override // defpackage.kaj
    public final Object f(lk50<? extends qcn<? extends osv>> lk50Var, scn<Integer, ? extends uxs> scnVar, ucn<? extends Integer> ucnVar, ucn<? extends Integer> ucnVar2, Boolean bool, v1b<? super ruq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        vuq vuqVar = new vuq(this.i, v1bVar);
        vuqVar.b = lk50Var;
        vuqVar.c = scnVar;
        vuqVar.d = ucnVar;
        vuqVar.e = ucnVar2;
        vuqVar.f = zBooleanValue;
        return vuqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        cuq cuqVar;
        lk50 lk50Var = this.b;
        scn scnVar = this.c;
        ucn ucnVar = this.d;
        ucn ucnVar2 = this.e;
        boolean z = this.f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                cuqVar = cuq.c.a;
            } else if (lk50Var instanceof lk50.a) {
                cuqVar = cuq.b.a;
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                qcn qcnVar = (qcn) ((lk50.c) lk50Var).a;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = z;
                this.a = 1;
                obj = this.i.z1(qcnVar, scnVar, ucnVar, ucnVar2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            return new ruq(cuqVar, z);
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        cuqVar = (cuq) obj;
        return new ruq(cuqVar, z);
    }
}
