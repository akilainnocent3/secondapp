package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.activities.ResultsSearchActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class om50 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ ResultsSearchActivity b;
    public final /* synthetic */ egd0 c;

    public om50(cq40 cq40Var, ResultsSearchActivity resultsSearchActivity, egd0 egd0Var) {
        this.a = cq40Var;
        this.b = resultsSearchActivity;
        this.c = egd0Var;
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
        int i = ResultsSearchActivity.e;
        this.b.A1();
        lop.b(this.c.c, Boolean.FALSE);
    }
}
