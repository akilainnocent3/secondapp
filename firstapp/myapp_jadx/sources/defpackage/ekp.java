package defpackage;

import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ekp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ekp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                KeWithdrawActivity keWithdrawActivity = (KeWithdrawActivity) obj;
                int i2 = KeWithdrawActivity.Z;
                if (keWithdrawActivity.isFinishing()) {
                    return null;
                }
                keWithdrawActivity.finish();
                return null;
            case 1:
                int i3 = PreMatchMyFavoriteActivity.b1;
                gby.b(((PreMatchMyFavoriteActivity) obj).r0.getDescriptionView().getContext());
                return Unit.a;
            default:
                ((Function1) obj).invoke(qve0.j.a);
                return Unit.a;
        }
    }
}
