package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class b440 extends RecyclerView.d0 {
    public final lgd0 a;
    public final Function0<Unit> b;
    public final Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b440(lgd0 lgd0Var, w440 w440Var, x440 x440Var) {
        super(lgd0Var.a);
        w440Var.getClass();
        x440Var.getClass();
        this.a = lgd0Var;
        this.b = w440Var;
        this.c = x440Var;
        lgd0Var.c.setOnClickListener(new View.OnClickListener() { // from class: z340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.invoke();
            }
        });
        lgd0Var.e.setOnClickListener(new View.OnClickListener() { // from class: a440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.invoke();
            }
        });
    }
}
