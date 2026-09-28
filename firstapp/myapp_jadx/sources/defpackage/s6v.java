package defpackage;

import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportybet.android.cashoutphase3.widget.LiveMatchTrackerView;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s6v implements CashoutLiveEventControlsHeaderView.a {
    public final /* synthetic */ u6v a;

    public s6v(u6v u6vVar) {
        this.a = u6vVar;
    }

    @Override // com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView.a
    public final void a(boolean z) {
        BetSelection betSelectionC;
        u6v u6vVar = this.a;
        zzy zzyVar = u6vVar.c;
        fhd0 fhd0Var = u6vVar.b;
        pl6 pl6VarB = u6vVar.b(u6vVar.getBindingAdapterPosition());
        if (pl6VarB == null || (betSelectionC = pl6VarB.c()) == null) {
            return;
        }
        c8i0.o(fhd0Var.K, z);
        if (z) {
            String str = betSelectionC.eventId;
            str.getClass();
            zzyVar.r(u6vVar.getBindingAdapterPosition(), str);
            pl6 pl6VarB2 = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB2 != null) {
                pl6VarB2.i = ils.STREAMING;
            }
        } else {
            fhd0Var.K.g();
            pl6 pl6VarB3 = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB3 != null) {
                pl6VarB3.i = ils.NONE;
            }
        }
        zzyVar.n(ils.STREAMING, z);
        c8i0.o(fhd0Var.y.a, z);
    }

    @Override // com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView.a
    public final void b() {
        this.a.c.b();
    }

    @Override // com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView.a
    public final void c(boolean z) {
        BetSelection betSelectionC;
        u6v u6vVar = this.a;
        fhd0 fhd0Var = u6vVar.b;
        c8i0.o(fhd0Var.A, z);
        if (z) {
            pl6 pl6VarB = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB == null || (betSelectionC = pl6VarB.c()) == null) {
                return;
            }
            LiveMatchTrackerView liveMatchTrackerView = fhd0Var.A;
            String str = betSelectionC.eventId;
            str.getClass();
            String str2 = betSelectionC.sportId;
            str2.getClass();
            liveMatchTrackerView.g(str, str2, betSelectionC.eventSource);
            pl6 pl6VarB2 = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB2 != null) {
                pl6VarB2.i = ils.STATS;
            }
        } else {
            fhd0Var.A.b();
            pl6 pl6VarB3 = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB3 != null) {
                pl6VarB3.i = ils.NONE;
            }
        }
        u6vVar.c.n(ils.STATS, z);
        c8i0.o(fhd0Var.y.a, z);
    }

    @Override // com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView.a
    public final void d(boolean z) {
        BetSelection betSelectionC;
        u6v u6vVar = this.a;
        fhd0 fhd0Var = u6vVar.b;
        c8i0.o(fhd0Var.A, z);
        if (z) {
            pl6 pl6VarB = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB == null || (betSelectionC = pl6VarB.c()) == null) {
                return;
            }
            LiveMatchTrackerView liveMatchTrackerView = fhd0Var.A;
            String str = betSelectionC.eventId;
            str.getClass();
            String str2 = betSelectionC.sportId;
            str2.getClass();
            liveMatchTrackerView.e(str, str2, betSelectionC.eventSource);
            pl6 pl6VarB2 = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB2 != null) {
                pl6VarB2.i = ils.LIVE_MATCH_TRACKER;
            }
        } else {
            fhd0Var.A.b();
            pl6 pl6VarB3 = u6vVar.b(u6vVar.getBindingAdapterPosition());
            if (pl6VarB3 != null) {
                pl6VarB3.i = ils.NONE;
            }
        }
        u6vVar.c.n(ils.LIVE_MATCH_TRACKER, z);
        c8i0.o(fhd0Var.y.a, z);
    }

    @Override // com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView.a
    public final void e(boolean z) {
        pl6 pl6VarB;
        List<BetSelection> list;
        String str;
        u6v u6vVar = this.a;
        int bindingAdapterPosition = u6vVar.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || (pl6VarB = u6vVar.b(bindingAdapterPosition)) == null) {
            return;
        }
        xh6 xh6Var = u6vVar.d.a;
        ArrayList arrayList = xh6Var.A;
        pl6VarB.i = z ? ils.GAMES : ils.NONE;
        Bet bet = pl6VarB.a;
        String str2 = "";
        if (bet != null && (list = bet.selections) != null && (str = list.get(pl6VarB.d).matchStatus) != null) {
            str2 = str;
        }
        rdd0 rdd0Var = xh6Var.z;
        if (z) {
            rdd0Var.a(new nqv.a(str2, oqv.OPEN_BETS), k00.d, k00.c);
            pl6 pl6Var = xh6Var.N;
            Integer num = xh6Var.O;
            if (pl6Var != null && num != null) {
                int iIntValue = num.intValue();
                pl6Var.i = ils.NONE;
                if (iIntValue != -1 && iIntValue >= 0 && iIntValue < arrayList.size()) {
                    xh6Var.notifyItemChanged(iIntValue, "minigame_button_pressed");
                }
            }
            xh6Var.N = pl6VarB;
            xh6Var.O = Integer.valueOf(bindingAdapterPosition);
        } else {
            rdd0Var.a(new nqv.b(str2, oqv.OPEN_BETS), k00.d, k00.c);
            xh6Var.N = null;
            xh6Var.O = null;
        }
        if (bindingAdapterPosition != -1 && bindingAdapterPosition >= 0 && bindingAdapterPosition < arrayList.size()) {
            xh6Var.notifyItemChanged(bindingAdapterPosition, "minigame_button_pressed");
        }
        u6vVar.c.n(ils.GAMES, z);
    }
}
