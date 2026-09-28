package defpackage;

import android.view.View;
import com.sporty.android.sportynews.data.ArticleItem;

/* JADX INFO: loaded from: classes5.dex */
public final class dce0 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ fce0 b;

    public dce0(cq40 cq40Var, fce0 fce0Var) {
        this.a = cq40Var;
        this.b = fce0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fce0 fce0Var = this.b;
        ArticleItem articleItem = fce0Var.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        fce0Var.f.b(articleItem.getId(), articleItem.getArticleType(), false);
    }
}
