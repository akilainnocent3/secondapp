package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qss extends RecyclerView.d0 {
    public final z4p a;
    public final boolean b;

    public qss(z4p z4pVar, boolean z) {
        super(z4pVar.a);
        this.a = z4pVar;
        this.b = z;
    }

    public final void a(nss.b bVar) {
        String strA;
        sw2 sw2Var = bVar.b;
        boolean z = bVar.c;
        z4p z4pVar = this.a;
        LinearLayout linearLayout = z4pVar.f;
        View view = z4pVar.e;
        TextView textView = z4pVar.v;
        TextView textView2 = z4pVar.d;
        linearLayout.setVisibility(4);
        String str = sw2Var.a;
        String str2 = sw2Var.c;
        str.getClass();
        boolean z2 = str.length() == 0;
        z4pVar.c.setText(sw2Var.a);
        String strA2 = sw2Var.b;
        if (str2 != null && str2.length() != 0) {
            strA2 = oxc.a(strA2, " @", gky.a.a(str2, false));
        }
        textView2.setText(strA2);
        boolean z3 = sw2Var.g;
        View view2 = this.itemView;
        boolean z4 = this.b;
        int i = R.color.transparent;
        if (z3) {
            view2.getClass();
            textView2.setBackgroundColor(c8i0.c(R.color.transparent, view2));
            textView.setText("");
        } else {
            view2.getClass();
            if (z2) {
                i = R.color.bg_surface_secondary;
            }
            textView2.setBackgroundColor(c8i0.c(i, view2));
            if (z4) {
                Context context = this.itemView.getContext();
                context.getClass();
                strA = sn5.b(context, R.string.component_betslip__single, new Object[0]);
            } else {
                strA = sw2Var.d.a(textView.getContext());
            }
            textView.setText(strA);
        }
        boolean z5 = sw2Var.f;
        View view3 = z4pVar.b;
        if (z5) {
            view3.setVisibility(8);
            view.setVisibility(8);
        } else {
            view3.setVisibility(!z ? 0 : 8);
            view.setVisibility((!z || z4) ? 8 : 0);
        }
    }
}
