package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.PeriodNumber;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d6y extends RecyclerView.f<b> {
    public final List<PeriodNumber> a;
    public s6p b;
    public PeriodNumber c;

    public class a extends b implements View.OnClickListener {
        public final TextView a;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.number_text);
            this.a = textView;
            textView.setOnClickListener(this);
        }

        @Override // d6y.b
        public final void a(int i) {
            d6y d6yVar = d6y.this;
            PeriodNumber periodNumber = d6yVar.a.get(i);
            String periodNumber2 = periodNumber.getPeriodNumber();
            String betType = periodNumber.getBetType();
            int color = Color.parseColor(TextUtils.equals(periodNumber2, d6yVar.c.getPeriodNumber()) ? "#32ea6a" : "#ffffff");
            TextView textView = this.a;
            textView.setTextColor(color);
            textView.setText(sn5.c(textView, R.string.jackpot__round_type, periodNumber2, betType));
            textView.setTag(periodNumber);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof TextView) {
                PeriodNumber periodNumber = (PeriodNumber) view.getTag();
                d6y d6yVar = d6y.this;
                d6yVar.c = periodNumber;
                s6p s6pVar = d6yVar.b;
                if (s6pVar != null) {
                    PeriodNumber periodNumber2 = s6pVar.H;
                    periodNumber2.setBetType(periodNumber.getBetType());
                    periodNumber2.setPeriodNumber(periodNumber.getPeriodNumber());
                    periodNumber2.setId(periodNumber.getId());
                    s6pVar.F.setText(sn5.d(s6pVar, R.string.jackpot__round_type, periodNumber2.getPeriodNumber(), periodNumber2.getBetType()));
                    s6pVar.G.setText(sn5.d(s6pVar, R.string.jackpot__sporty_games, periodNumber2.getBetType()));
                    yec yecVar = s6pVar.a;
                    if (yecVar != null && yecVar.isShowing()) {
                        s6pVar.a.dismiss();
                        s6pVar.F.setChecked(false);
                    }
                    s6pVar.n0();
                    s6pVar.m0(false);
                }
            }
        }
    }

    public static abstract class b extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    public d6y(List<PeriodNumber> list, PeriodNumber periodNumber) {
        this.a = list;
        this.c = periodNumber;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((b) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(dzc.a(viewGroup, R.layout.jackpot_numbers_item, viewGroup, false));
    }
}
