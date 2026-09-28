package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sxh0 extends x<uxh0, vxh0> {

    public final class a extends n.e<uxh0> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(uxh0 uxh0Var, uxh0 uxh0Var2) {
            uxh0 uxh0Var3 = uxh0Var;
            uxh0 uxh0Var4 = uxh0Var2;
            uxh0Var3.getClass();
            uxh0Var4.getClass();
            return Intrinsics.g(uxh0Var3, uxh0Var4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(uxh0 uxh0Var, uxh0 uxh0Var2) {
            uxh0 uxh0Var3 = uxh0Var;
            uxh0 uxh0Var4 = uxh0Var2;
            uxh0Var3.getClass();
            uxh0Var4.getClass();
            return Intrinsics.g(uxh0Var3.b, uxh0Var4.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        vxh0 vxh0Var = (vxh0) d0Var;
        vxh0Var.getClass();
        uxh0 item = getItem(i);
        item.getClass();
        uxh0 uxh0Var = item;
        txh0 txh0Var = vxh0Var.a;
        TextView textView = txh0Var.c;
        UiText uiText = uxh0Var.c;
        Context context = txh0Var.a.getContext();
        context.getClass();
        textView.setText(uiText.e(context).toString());
        TextView textView2 = txh0Var.b;
        textView2.setText(uxh0Var.d);
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, uxh0Var.f ? R.drawable.ic_check_green : 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.verified_info_item, viewGroup, false);
        int i2 = R.id.content;
        TextView textView = (TextView) h5e.a(R.id.content, viewA);
        if (textView != null) {
            i2 = R.id.title;
            TextView textView2 = (TextView) h5e.a(R.id.title, viewA);
            if (textView2 != null) {
                return new vxh0(new txh0((ConstraintLayout) viewA, textView, textView2));
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
