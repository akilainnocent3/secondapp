package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ywf0 extends x<xvf0, exf0> {
    public axf0 b;

    public final class a extends n.e<xvf0> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(xvf0 xvf0Var, xvf0 xvf0Var2) {
            xvf0 xvf0Var3 = xvf0Var;
            xvf0 xvf0Var4 = xvf0Var2;
            xvf0Var3.getClass();
            xvf0Var4.getClass();
            return xvf0Var3.c == xvf0Var4.c;
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(xvf0 xvf0Var, xvf0 xvf0Var2) {
            xvf0 xvf0Var3 = xvf0Var;
            xvf0 xvf0Var4 = xvf0Var2;
            xvf0Var3.getClass();
            xvf0Var4.getClass();
            return Intrinsics.g(xvf0Var3.b, xvf0Var4.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        exf0 exf0Var = (exf0) d0Var;
        exf0Var.getClass();
        xvf0 item = getItem(i);
        item.getClass();
        xvf0 xvf0Var = item;
        CheckedTextView checkedTextView = exf0Var.a.a;
        checkedTextView.setTag(xvf0Var);
        checkedTextView.setText(xvf0Var.b);
        checkedTextView.setChecked(xvf0Var.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.spr_single_select_item_view, viewGroup, false);
        if (viewA != null) {
            return new exf0(new pjd0((CheckedTextView) viewA), this.b);
        }
        bmy.a("rootView");
        return null;
    }
}
