package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x63 f156556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53 f156557b;

    public /* synthetic */ uq2(x63 x63Var) {
        this(x63Var, new u53());
    }

    public final void a(View view, long j10, long j11) {
        view.setVisibility(0);
        this.f156556a.getClass();
        View viewFindViewWithTag = view.findViewWithTag("timer_value");
        TextView textView = viewFindViewWithTag instanceof TextView ? (TextView) viewFindViewWithTag : null;
        if (textView != null) {
            this.f156557b.getClass();
            textView.setText(String.valueOf((int) Math.ceil((j10 - j11) / u53.f156288a)));
        }
    }

    public uq2(x63 x63Var, u53 u53Var) {
        this.f156556a = x63Var;
        this.f156557b = u53Var;
    }
}
