package defpackage;

import com.sportybet.android.ugpay.deposit.MedialOtherActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dlv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dlv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MedialOtherActivity medialOtherActivity = (MedialOtherActivity) obj;
                int i2 = MedialOtherActivity.z;
                if (medialOtherActivity.isFinishing()) {
                    return null;
                }
                medialOtherActivity.finish();
                return null;
            default:
                ((x7c0) obj).e2();
                return Unit.a;
        }
    }
}
