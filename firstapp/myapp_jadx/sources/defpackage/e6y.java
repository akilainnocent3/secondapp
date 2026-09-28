package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class e6y extends RecyclerView.f<b> {
    public List<String> a;
    public r6p b;
    public String c;

    public class a extends b implements View.OnClickListener {
        public final TextView a;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.number_text);
            this.a = textView;
            textView.setOnClickListener(this);
        }

        @Override // e6y.b
        public final void a(int i) {
            e6y e6yVar = e6y.this;
            String str = e6yVar.a.get(i);
            int color = Color.parseColor(TextUtils.equals(str, e6yVar.c) ? "#32ea6a" : "#ffffff");
            TextView textView = this.a;
            textView.setTextColor(color);
            textView.setText(sn5.c(textView, R.string.jackpot__round_index, str));
            textView.setTag(str);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof TextView) {
                String str = (String) view.getTag();
                e6y e6yVar = e6y.this;
                e6yVar.c = str;
                r6p r6pVar = e6yVar.b;
                if (r6pVar != null) {
                    r6pVar.F = str;
                    r6pVar.E.setText(sn5.d(r6pVar, R.string.jackpot__round_index, str));
                    yec yecVar = r6pVar.I;
                    if (yecVar != null && yecVar.isShowing()) {
                        r6pVar.I.dismiss();
                        r6pVar.E.setChecked(false);
                    }
                    r6pVar.m0(false);
                }
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
        return new a(dzc.a(viewGroup, R.layout.jackpot_numbers_item, viewGroup, false));
    }
}
