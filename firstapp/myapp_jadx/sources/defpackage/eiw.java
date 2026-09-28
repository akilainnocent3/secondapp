package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class eiw extends RecyclerView.d0 {
    public final sid0 a;
    public final bfw b;
    public final mpe0 c;
    public final mpe0 d;
    public final mpe0 e;
    public final mpe0 f;
    public final mpe0 i;
    public final mpe0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(sid0 sid0Var, bfw bfwVar) {
        super(sid0Var.a);
        bfwVar.getClass();
        this.a = sid0Var;
        this.b = bfwVar;
        this.c = hwr.b(new mdn(this, 2));
        int i = 1;
        this.d = hwr.b(new o7i(this, i));
        this.e = hwr.b(new ej4(this, 1));
        this.f = hwr.b(new fj4(this, i));
        this.i = hwr.b(new Function0() { // from class: biw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.a().getColor(R.color.border_inverse_brand_sub));
            }
        });
        this.v = hwr.b(new q6d(this, i));
    }

    public final Context a() {
        Context context = this.a.a.getContext();
        context.getClass();
        return context;
    }
}
