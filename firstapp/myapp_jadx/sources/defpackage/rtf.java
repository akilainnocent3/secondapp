package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.luckywheel.LuckyWheelActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rtf implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ttf.a((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                LuckyWheelActivity luckyWheelActivity = (LuckyWheelActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = LuckyWheelActivity.e;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vau.a((ccu) luckyWheelActivity.b.getValue(), aVar, 8);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rtf(LuckyWheelActivity luckyWheelActivity) {
        this.b = luckyWheelActivity;
    }
}
