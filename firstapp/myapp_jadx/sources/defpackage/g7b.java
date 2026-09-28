package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g7b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Fragment fragmentG = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj;
                rdd0 rdd0Var = preMatchSportActivity.b0;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(s2k0.s.a, k00.d);
                if (preMatchSportActivity.getAccountHelper().isLogin()) {
                    azm azmVar = preMatchSportActivity.K;
                    if (azmVar == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    azmVar.f(wae.WORLDCUP_MISSION, a.c(new Pair("source", "tournament_banner")));
                } else {
                    chk chkVar = preMatchSportActivity.M;
                    if (chkVar == null) {
                        Intrinsics.n("getWorldCupPassPromotionsUrlUseCase");
                        throw null;
                    }
                    String strA = chkVar.a();
                    azm azmVar2 = preMatchSportActivity.K;
                    if (azmVar2 == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    azm.c(azmVar2, strA, vj5.a(new Pair("data_share_dialog_title", preMatchSportActivity.getCMSString(R.string.az_menu__promotion_share_title, new Object[0])), new Pair("data_share_dialog_sharing_content", strA), new Pair("data_share_dialog_title_style", Integer.valueOf(R.style.H3_B)), new Pair("data_share_dialog_title_bottom_padding", 16)), null, 4);
                }
                return Unit.a;
            default:
                kab0 kab0Var = (kab0) obj;
                GameDetails gameDetails = kab0Var.b;
                wz.a("BetHistoryClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                e activity = kab0Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentG = supportFragmentManager.G(R.id.flContent);
                }
                if (!(fragmentG instanceof com.sportygames.commons.components.a)) {
                    kab0Var.I0();
                }
                return Unit.a;
        }
    }
}
