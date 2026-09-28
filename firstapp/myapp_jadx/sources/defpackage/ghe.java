package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import com.sportygames.commons.views.NavigationActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ghe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ghe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(new afe.h(cie.b));
                return Unit.a;
            case 1:
                NavigationActivity navigationActivity = (NavigationActivity) obj;
                int i2 = NavigationActivity.y;
                if (!(navigationActivity.getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    GameDetails gameDetails = navigationActivity.w;
                    if (gameDetails == null) {
                        Intrinsics.n("gameDetails");
                        throw null;
                    }
                    new nle(navigationActivity, gameDetails.getName(), null, navigationActivity.getDrawable(R.drawable.evenodd_bet_history_bg), new xio(1), 4).show();
                }
                return Unit.a;
            case 2:
                ((zy10) obj).R0();
                return Unit.a;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
