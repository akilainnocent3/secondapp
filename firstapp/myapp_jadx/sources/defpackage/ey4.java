package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class ey4 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ Function0 b;

    public ey4(cq40 cq40Var, Function0 function0) {
        this.a = cq40Var;
        this.b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        this.b.invoke();
    }
}
