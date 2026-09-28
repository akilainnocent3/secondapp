package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.components.ShAllBetList;
import com.sportygames.sportyherov2.remote.models.RoundBetResponse;
import com.sportygames.sportyherov2.remote.models.TopBets;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bkz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8i0 b;

    public /* synthetic */ bkz(w8i0 w8i0Var, int i) {
        this.a = i;
        this.b = w8i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<TopBets> topBets;
        int i = this.a;
        w8i0 w8i0Var = this.b;
        switch (i) {
            case 0:
                ((use) obj).getClass();
                return new lkz.c((lkz.d) w8i0Var);
            default:
                q1c0 q1c0Var = (q1c0) w8i0Var;
                ((View) obj).getClass();
                q1c0Var.i2 = 0;
                q1c0Var.x2(R.color.color_FFFFFF12, R.color.sg_transparent, R.color.sg_transparent);
                q1c0Var.P1("all_bets_clicked", false);
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    ShAllBetList shAllBetList = w3c0Var.k0;
                    RoundBetResponse roundBetResponse = q1c0Var.C2;
                    boolean z = ((roundBetResponse == null || (topBets = roundBetResponse.getTopBets()) == null) ? 0 : topBets.size()) > 0;
                    shAllBetList.F = 0;
                    if (z) {
                        shAllBetList.J(0);
                    } else {
                        shAllBetList.binding.i.setVisibility(8);
                        shAllBetList.I();
                    }
                    shAllBetList.H();
                }
                return Unit.a;
        }
    }
}
