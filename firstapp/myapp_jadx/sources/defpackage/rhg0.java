package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class rhg0 extends RecyclerView.d0 {
    public final bjd0 a;
    public final jpy b;

    public rhg0(bjd0 bjd0Var, fcz fczVar) {
        super(bjd0Var.a);
        this.a = bjd0Var;
        this.b = fczVar;
        bjd0Var.b.setOnClickListener(new o840(this, 1));
    }
}
