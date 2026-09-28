package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kc20 implements Function0 {
    public final /* synthetic */ PreMatchEventActivity a;

    public /* synthetic */ kc20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = PreMatchEventActivity.a2;
        PreMatchEventActivity preMatchEventActivity = this.a;
        FragmentManager supportFragmentManager = preMatchEventActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        ilk ilkVar = new ilk();
        a aVar = new a(supportFragmentManager);
        aVar.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
        aVar.c("GiftGrabPromotionDialogFragment");
        aVar.d();
        String str = preMatchEventActivity.P;
        if (str != null && mlk.a(str)) {
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
        }
        return Unit.a;
    }
}
