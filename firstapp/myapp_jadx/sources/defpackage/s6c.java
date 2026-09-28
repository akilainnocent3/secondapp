package defpackage;

import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s6c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CustomCodeActivity customCodeActivity = (CustomCodeActivity) obj;
                int i2 = CustomCodeActivity.f;
                azm azmVar = customCodeActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                if (!customCodeActivity.isFinishing() && !customCodeActivity.isDestroyed()) {
                    customCodeActivity.finish();
                    Unit unit = Unit.a;
                }
                return Unit.a;
            case 1:
                jj0 jj0Var = y880.a;
                gly glyVar = (gly) ((twd0) obj).getValue();
                long j = glyVar.a;
                return glyVar;
            default:
                ((q1c0) obj).T2();
                return Unit.a;
        }
    }
}
