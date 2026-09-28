package defpackage;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.Outcome;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class irj extends RecyclerView.f<b> {
    public ArrayList a;
    public x5p b;

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

        @Override // irj.b
        public final void a(int i) {
            JackpotElement jackpotElement = (JackpotElement) irj.this.a.get(i);
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
                    textView.setText(outcome.odds);
                    textView.setTag(outcome);
                    int i3 = outcome.status;
                    if (i3 == 0) {
                        textView.setBackgroundResource(R.drawable.spr_shape_jungle_green_item_bg);
                        textView.setEnabled(true);
                        textView.setTextColor(-1);
                    } else if (i3 == 1) {
                        textView.setBackgroundResource(R.drawable.spr_shape_weird_green_item_bg);
                        textView.setEnabled(true);
                        textView.setTextColor(Color.parseColor("#353a45"));
                    } else if (i3 == 2) {
                        textView.setBackgroundResource(R.drawable.spr_shape_gray_item_bg);
                        textView.setEnabled(false);
                        textView.setTextColor(Color.parseColor("#9da0ab"));
                    }
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
                view.setBackgroundResource(R.drawable.spr_shape_jungle_green_item_bg);
                ((TextView) view).setTextColor(-1);
            } else if (i == 0) {
                outcome.status = 1;
                view.setBackgroundResource(R.drawable.spr_shape_weird_green_item_bg);
                ((TextView) view).setTextColor(Color.parseColor("#353a45"));
            }
            x5p x5pVar = irj.this.b;
            if (x5pVar != null) {
                getAdapterPosition();
                x5pVar.C0();
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
        return new a(dzc.a(viewGroup, R.layout.spr_jackpot_games_item, viewGroup, false));
    }
}
