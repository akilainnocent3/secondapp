package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gif implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ gif(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = sif.k1;
                vn20.f(hp0.A, CaBJCMnsV.sypQjaHBcIwg, "PAYMENT_LIMIT_REACHED", true, true);
                break;
        }
        return Unit.a;
    }
}
