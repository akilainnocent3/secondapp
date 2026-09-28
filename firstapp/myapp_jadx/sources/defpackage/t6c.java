package defpackage;

import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t6c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = CustomCodeActivity.f;
                azm azmVar = ((CustomCodeActivity) obj).b;
                if (azmVar != null) {
                    azmVar.d(wae.ME_GIFTS);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            default:
                ((q1c0) obj).T2();
                return Unit.a;
        }
    }
}
