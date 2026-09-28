package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$state$1", f = "LNFeatureMatchQuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class saq extends tje0 implements jaj<kaq, t2q, Boolean, Boolean, v1b<? super kaq>, Object> {
    public /* synthetic */ kaq a;
    public /* synthetic */ t2q b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kaq kaqVar = this.a;
        t2q t2qVar = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qcn<Integer> qcnVar = kaqVar.a;
        String str = kaqVar.b;
        String str2 = kaqVar.c;
        String str3 = kaqVar.d;
        UiText uiText = kaqVar.e;
        String str4 = kaqVar.f;
        String str5 = kaqVar.g;
        String str6 = kaqVar.h;
        String str7 = kaqVar.i;
        qrd0 qrd0Var = kaqVar.j;
        s2q s2qVar = kaqVar.k;
        tsd0 tsd0Var = kaqVar.l;
        boolean z3 = kaqVar.m;
        boolean z4 = kaqVar.n;
        qcnVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        uiText.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        s2qVar.getClass();
        tsd0Var.getClass();
        t2qVar.getClass();
        return new kaq(qcnVar, str, str2, str3, uiText, str4, str5, str6, str7, qrd0Var, s2qVar, tsd0Var, z3, z4, z2, t2qVar, z);
    }

    @Override // defpackage.jaj
    public final Object l(kaq kaqVar, t2q t2qVar, Boolean bool, Boolean bool2, v1b<? super kaq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        saq saqVar = new saq(5, v1bVar);
        saqVar.a = kaqVar;
        saqVar.b = t2qVar;
        saqVar.c = zBooleanValue;
        saqVar.d = zBooleanValue2;
        return saqVar.invokeSuspend(Unit.a);
    }
}
