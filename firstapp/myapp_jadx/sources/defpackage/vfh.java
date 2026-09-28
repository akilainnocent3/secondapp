package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vfh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vfh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e6f0 e6f0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                FeaturedMatchView featuredMatchView = (FeaturedMatchView) obj;
                if (featuredMatchView.E && (e6f0Var = featuredMatchView.C) != null) {
                    String str = e6f0Var.a;
                    if (!StringsKt.U(str)) {
                        featuredMatchView.c.t(str, e6f0Var.b, e6f0Var.c);
                    }
                }
                break;
            default:
                tmg0 tmg0Var = (tmg0) ((mmg0) obj).i.getValue();
                ej5.c(o8i0.d(tmg0Var), null, null, new smg0(tmg0Var.b, tmg0Var, null), 3);
                break;
        }
    }
}
