package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a82 extends RecyclerView.d0 {
    public a82(View view) {
        super(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: y72
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a82 a82Var = this.a;
                a82Var.b(a82Var.getLayoutPosition(), view2);
            }
        });
    }

    public abstract void a(int i);

    public abstract void b(int i, View view);
}
