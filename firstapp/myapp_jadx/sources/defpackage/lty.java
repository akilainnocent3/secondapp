package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class lty {
    public final g64 a;
    public final qty b;
    public final dty c;

    public lty(y8i0 y8i0Var, qty qtyVar, dty dtyVar, y8j y8jVar) {
        y8jVar.getClass();
        this.a = new g64(y8i0Var);
        this.b = qtyVar;
        this.c = dtyVar;
        LinearLayout linearLayout = y8i0Var.a;
        linearLayout.getClass();
        y8jVar.e(linearLayout, "one_up_tag");
    }

    public final void a() {
        g64 g64Var = this.a;
        g64Var.a(false);
        y8i0 y8i0Var = g64Var.a;
        LinearLayout linearLayout = y8i0Var.a;
        linearLayout.setOnClickListener(null);
        linearLayout.setClickable(false);
        y8i0Var.e.setText((CharSequence) null);
        y8i0Var.b.setVisibility(8);
        y8i0Var.d.setVisibility(8);
        y8i0Var.c.setVisibility(8);
        linearLayout.setVisibility(8);
    }
}
