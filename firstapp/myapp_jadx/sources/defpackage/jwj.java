package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jwj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jwj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                int i2 = PreMatchEventActivity.a2;
                rdd0 rdd0Var = preMatchEventActivity.c;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(s2k0.y.a, k00.d);
                if (preMatchEventActivity.getAccountHelper().isLogin()) {
                    azm azmVar = preMatchEventActivity.f;
                    if (azmVar == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    azmVar.i(wae.WORLDCUP_MISSION, c5j0.a("source", yFmFZvuWxAYfEj.ICEkBYBIO), null, Sender.UNKNOWN);
                } else {
                    chk chkVar = preMatchEventActivity.d;
                    if (chkVar == null) {
                        Intrinsics.n("getWorldCupPassPromotionsUrlUseCase");
                        throw null;
                    }
                    String strA = chkVar.a();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_share_dialog_title", preMatchEventActivity.getCMSString(R.string.az_menu__promotion_share_title, new Object[0]));
                    bundle.putString("data_share_dialog_sharing_content", strA);
                    bundle.putInt("data_share_dialog_title_style", R.style.H3_B);
                    bundle.putInt("data_share_dialog_title_bottom_padding", 16);
                    azm azmVar2 = preMatchEventActivity.f;
                    if (azmVar2 == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    azmVar2.h(strA, bundle, Sender.UNKNOWN);
                }
                return Unit.a;
        }
    }
}
