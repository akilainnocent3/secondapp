package defpackage;

import com.sportybet.feature.luckynumber.featurematch.presentation.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$state$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z5u extends tje0 implements jaj<qcn<? extends d>, Integer, Boolean, Boolean, v1b<? super obq>, Object> {
    public /* synthetic */ qcn a;
    public /* synthetic */ int b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = this.a;
        int i = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new obq(qcnVar, i, z, z2);
    }

    @Override // defpackage.jaj
    public final Object l(qcn<? extends d> qcnVar, Integer num, Boolean bool, Boolean bool2, v1b<? super obq> v1bVar) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        z5u z5uVar = new z5u(5, v1bVar);
        z5uVar.a = qcnVar;
        z5uVar.b = iIntValue;
        z5uVar.c = zBooleanValue;
        z5uVar.d = zBooleanValue2;
        return z5uVar.invokeSuspend(Unit.a);
    }
}
