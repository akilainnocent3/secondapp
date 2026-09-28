package defpackage;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.Winnings;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class jgj0 extends RecyclerView.f<b> {
    public List<Winnings> a;

    public class a extends b {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final ImageView d;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.left_text);
            this.b = (TextView) view.findViewById(R.id.mid_Text);
            this.c = (TextView) view.findViewById(R.id.right_text);
            this.d = (ImageView) view.findViewById(R.id.index_img);
        }

        @Override // jgj0.b
        public final void a(int i) {
            TextView textView = this.c;
            TextView textView2 = this.b;
            TextView textView3 = this.a;
            ImageView imageView = this.d;
            if (i == 0) {
                textView3.setTextColor(Color.parseColor("#9ca0ab"));
                Typeface typeface = Typeface.DEFAULT;
                textView3.setTypeface(typeface);
                textView3.setText(sn5.c(textView3, R.string.jackpot__correct_events, new Object[0]));
                textView2.setText(sn5.c(textView2, R.string.bet_history__no_dot_tickets, new Object[0]));
                textView2.setTextColor(Color.parseColor("#9ca0ab"));
                textView2.setTypeface(typeface);
                textView.setText(sn5.c(textView, R.string.bet_history__winning_per_ticket, new Object[0]));
                textView.setTextColor(Color.parseColor("#9ca0ab"));
                textView.setTypeface(typeface);
                imageView.setVisibility(4);
                return;
            }
            jgj0 jgj0Var = jgj0.this;
            if (i < jgj0Var.a.size() + 1) {
                Winnings winnings = jgj0Var.a.get(i - 1);
                textView3.setText(sn5.c(textView3, R.string.app_common__out_of, String.valueOf(winnings.correctEvents)));
                textView2.setText(String.valueOf(winnings.winNum));
                textView.setText(a8b.a(bjb0.P(winnings.perWinnings, Locale.US)));
                imageView.setVisibility(0);
                if (i == 1) {
                    imageView.setImageDrawable(iwh0.a(imageView.getContext(), R.drawable.ic_jackpot_index, Color.parseColor("#fafd00")));
                } else if (i == 2) {
                    imageView.setImageDrawable(iwh0.a(imageView.getContext(), R.drawable.ic_jackpot_index, Color.parseColor("#33ea6a")));
                } else if (i == 3) {
                    imageView.setImageDrawable(iwh0.a(imageView.getContext(), R.drawable.ic_jackpot_index, Color.parseColor("#0d9737")));
                }
            }
        }
    }

    public static abstract class b extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        if (this.a.size() > 0) {
            return this.a.size() + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((b) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(dzc.a(viewGroup, R.layout.jackpot_winnings, viewGroup, false));
    }
}
