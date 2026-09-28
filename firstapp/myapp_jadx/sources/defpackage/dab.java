package defpackage;

import com.sportybet.feature.gift.gift.presentation.GiftActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dab implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dab(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgb) obj).d2();
                break;
            default:
                int i2 = GiftActivity.e;
                ((GiftActivity) obj).finish();
                break;
        }
        return Unit.a;
    }
}
