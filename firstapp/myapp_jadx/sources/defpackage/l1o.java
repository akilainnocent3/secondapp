package defpackage;

import com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusActivity;
import com.sportybet.android.instantwin.presentation.racingrace.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l1o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.invoke(a.InterfaceC0315a.b.a);
                function1.invoke(a.c.a);
                return Unit.a;
            default:
                azm azmVar = ((VerifyPhoneForBonusActivity) obj).c;
                if (azmVar != null) {
                    azmVar.d(wae.DEPOSIT);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
