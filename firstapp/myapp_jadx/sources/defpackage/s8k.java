package defpackage;

import com.sporty.android.core.model.security.twofa.TwoFAHintInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.GetMeScreenPopupUseCase$invoke$2", f = "GetMeScreenPopupUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s8k extends tje0 implements jaj<TwoFAHintInfo, Boolean, Boolean, Boolean, v1b<? super pfv>, Object> {
    public /* synthetic */ TwoFAHintInfo a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ t8k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8k(t8k t8kVar, v1b<? super s8k> v1bVar) {
        super(5, v1bVar);
        this.e = t8kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TwoFAHintInfo twoFAHintInfo = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.e.getClass();
        boolean shouldShowInMe = twoFAHintInfo.getShouldShowInMe();
        if (z3) {
            return pfv.DEVICE_MANAGEMENT_HINT;
        }
        if (z && z2) {
            return pfv.RATE_APP;
        }
        if (!shouldShowInMe || z) {
            return null;
        }
        return pfv.TWO_FA;
    }

    @Override // defpackage.jaj
    public final Object l(TwoFAHintInfo twoFAHintInfo, Boolean bool, Boolean bool2, Boolean bool3, v1b<? super pfv> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        s8k s8kVar = new s8k(this.e, v1bVar);
        s8kVar.a = twoFAHintInfo;
        s8kVar.b = zBooleanValue;
        s8kVar.c = zBooleanValue2;
        s8kVar.d = zBooleanValue3;
        return s8kVar.invokeSuspend(Unit.a);
    }
}
