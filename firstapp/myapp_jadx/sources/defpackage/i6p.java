package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.Outcome;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i6p extends RecyclerView.f<b> {
    public ArrayList a;
    public c7p b;

    public class a extends b implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView[] e;

        public a(View view) {
            super(view);
            this.e = new TextView[]{textView, textView, textView};
            this.c = (TextView) view.findViewById(R.id.jackpot_index);
            this.d = (TextView) view.findViewById(R.id.jackpot_time);
            this.b = (TextView) view.findViewById(R.id.jackpot_home_name);
            this.a = (TextView) view.findViewById(R.id.jackpot_away_name);
            TextView textView = (TextView) view.findViewById(R.id.jackpot_home);
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) view.findViewById(R.id.jackpot_draw);
            textView2.setOnClickListener(this);
            TextView textView3 = (TextView) view.findViewById(R.id.jackpot_away);
            textView3.setOnClickListener(this);
        }

        public static void b(TextView textView, Outcome outcome) {
            int i = outcome.status;
            if (i == 0) {
                textView.setBackgroundColor(textView.getContext().getColor(R.color.custom_brand_secondary_variable_type1_opacity_type3));
                textView.setEnabled(true);
                textView.setTextColor(textView.getContext().getColor(R.color.brand_secondary_variable_type3));
            } else if (i == 1) {
                textView.setBackgroundColor(textView.getContext().getColor(R.color.brand_secondary));
                textView.setEnabled(true);
                textView.setTextColor(textView.getContext().getColor(R.color.text_type2_primary));
            } else {
                if (i != 2) {
                    return;
                }
                textView.setBackgroundColor(textView.getContext().getColor(R.color.background_disable_type1_primary));
                textView.setEnabled(false);
                textView.setTextColor(textView.getContext().getColor(R.color.text_disable_type1_primary));
            }
        }

        @Override // i6p.b
        public final void a(int i) {
            JackpotElement jackpotElement = (JackpotElement) i6p.this.a.get(i);
            this.c.setText(String.valueOf(i + 1));
            this.b.setText(jackpotElement.home);
            this.a.setText(jackpotElement.away);
            this.d.setText(bwf0.a.g(jackpotElement.date));
            List<Outcome> list = jackpotElement.outcomes;
            int size = list.size();
            TextView[] textViewArr = this.e;
            if (size == textViewArr.length) {
                for (int i2 = 0; i2 < textViewArr.length; i2++) {
                    Outcome outcome = list.get(i2);
                    TextView textView = textViewArr[i2];
                    textView.setText(gky.a(outcome.odds));
                    textView.setTag(outcome);
                    b(textView, outcome);
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Outcome outcome;
            if (!(view instanceof TextView) || (outcome = (Outcome) view.getTag()) == null) {
                return;
            }
            int i = outcome.status;
            if (i == 1) {
                outcome.status = 0;
            } else if (i == 0) {
                outcome.status = 1;
            }
            b((TextView) view, outcome);
            c7p c7pVar = i6p.this.b;
            if (c7pVar != null) {
                getAdapterPosition();
                c7pVar.C0();
            }
        }
    }

    public static abstract class b extends RecyclerView.d0 {
        public abstract void a(int i);
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
        return new a(dzc.a(viewGroup, R.layout.jap_jackpot_games_item, viewGroup, false));
    }
}
