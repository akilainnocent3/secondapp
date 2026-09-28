package defpackage;

import android.view.View;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class s98 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ t98 b;

    public s98(cq40 cq40Var, t98 t98Var) {
        this.a = cq40Var;
        this.b = t98Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 500) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        Object tag = view.getTag();
        if (!(tag instanceof Pair)) {
            tag = null;
        }
        Pair pair = (Pair) tag;
        if (pair != null) {
            this.b.b.b(((Number) pair.a).intValue(), ((Number) pair.b).intValue());
        }
    }
}
