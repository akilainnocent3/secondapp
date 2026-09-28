package defpackage;

import com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j9b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j9b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gvi gviVar = ((fgb) obj).z;
                if (gviVar != null) {
                    gviVar.H.d();
                }
                return Unit.a;
            default:
                phx phxVar = (phx) obj;
                int i2 = LuckyNumberActivity.i;
                return phxVar;
        }
    }
}
