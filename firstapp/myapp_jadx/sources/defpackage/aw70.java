package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class aw70 extends x<String, b> {
    public dv70 b;

    public static final class a extends n.e<String> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            return Intrinsics.g(str3, str4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            return Intrinsics.g(str3, str4);
        }
    }

    public static final class b extends RecyclerView.d0 {
        public final wid0 a;
        public final View.OnClickListener b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(wid0 wid0Var, dv70 dv70Var) {
            TextView textView = wid0Var.a;
            super(textView);
            this.a = wid0Var;
            this.b = dv70Var;
            textView.setOnClickListener(new ni30(this, 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        bVar.getClass();
        String item = getItem(i);
        item.getClass();
        String str = item;
        TextView textView = bVar.a.a;
        textView.setTag(str);
        textView.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.spr_new_search_history_item, viewGroup, false);
        if (viewA != null) {
            return new b(new wid0((TextView) viewA), this.b);
        }
        bmy.a("rootView");
        return null;
    }
}
