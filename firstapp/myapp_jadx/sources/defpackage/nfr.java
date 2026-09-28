package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$playerDisplayState$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nfr extends tje0 implements kaj<Boolean, Boolean, Boolean, UiText, khr, v1b<? super mfr.a>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ UiText d;
    public /* synthetic */ khr e;

    public nfr(v1b<? super nfr> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(Boolean bool, Boolean bool2, Boolean bool3, UiText uiText, khr khrVar, v1b<? super mfr.a> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        nfr nfrVar = new nfr(v1bVar);
        nfrVar.a = zBooleanValue;
        nfrVar.b = zBooleanValue2;
        nfrVar.c = zBooleanValue3;
        nfrVar.d = uiText;
        nfrVar.e = khrVar;
        return nfrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        UiText uiText = this.d;
        khr khrVar = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new mfr.a(z, z2, z3, uiText, khrVar);
    }
}
