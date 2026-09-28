package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rqf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rqf(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                tqf.a((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int i2 = LuckyNumberFeatureMatchView.v;
                ((LuckyNumberFeatureMatchView) obj3).a(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }
}
