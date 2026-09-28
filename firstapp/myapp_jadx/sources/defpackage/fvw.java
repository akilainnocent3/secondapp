package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportyherov2.remote.models.BetHistoryItem;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fvw extends RecyclerView.f<a> {
    public final List<BetHistoryItem> a;

    public final class a extends RecyclerView.d0 {
        public final it80 a;

        public a(it80 it80Var) {
            super(it80Var.a);
            this.a = it80Var;
        }
    }

    public fvw(List<BetHistoryItem> list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<BetHistoryItem> list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String str;
        String str2;
        String roundId;
        String string;
        Double cashoutCoefficient;
        a aVar = (a) d0Var;
        aVar.getClass();
        List<BetHistoryItem> list = this.a;
        BetHistoryItem betHistoryItem = list != null ? list.get(i) : null;
        it80 it80Var = aVar.a;
        double dDoubleValue = (betHistoryItem == null || (cashoutCoefficient = betHistoryItem.getCashoutCoefficient()) == null) ? 0.0d : cashoutCoefficient.doubleValue();
        TextView textView = it80Var.d;
        String str3 = "--";
        String str4 = "0.00";
        if (dDoubleValue == 0.0d) {
            str = "--";
        } else {
            try {
                str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                str.getClass();
            } catch (Exception unused) {
                str = "0.00";
            }
        }
        textView.setText(str);
        double payoutAmount = betHistoryItem != null ? betHistoryItem.getPayoutAmount() : 0.0d;
        TextView textView2 = it80Var.f;
        if (payoutAmount == 0.0d) {
            str2 = "0";
        } else {
            try {
                str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(payoutAmount);
                str2.getClass();
            } catch (Exception unused2) {
                str2 = "0.00";
            }
        }
        textView2.setText(str2);
        TextView textView3 = it80Var.c;
        if (betHistoryItem != null) {
            try {
                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(betHistoryItem.getStakeAmount());
                str5.getClass();
                str4 = str5;
            } catch (Exception unused3) {
            }
        } else {
            str4 = "--";
        }
        textView3.setText(str4);
        TextView textView4 = it80Var.e;
        if (betHistoryItem != null && (roundId = betHistoryItem.getRoundId()) != null && (string = roundId.toString()) != null) {
            str3 = string;
        }
        textView4.setText(str3);
        it80Var.b.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new a(it80.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
