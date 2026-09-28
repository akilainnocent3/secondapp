package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class u9m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ComposeView b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ View d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ b120 i;
    public final /* synthetic */ p9m v;

    public u9m(View view, ComposeView composeView, ViewGroup viewGroup, View view2, float f, float f2, b120 b120Var, p9m p9mVar) {
        this.a = view;
        this.b = composeView;
        this.c = viewGroup;
        this.d = view2;
        this.e = f;
        this.f = f2;
        this.i = b120Var;
        this.v = p9mVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.isLaidOut()) {
            ComposeView composeView = this.b;
            if (composeView.isLaidOut()) {
                ViewGroup viewGroup = this.c;
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                v9m.b(this.a, viewGroup, composeView, this.d, this.e, this.f, this.i);
                composeView.setVisibility(0);
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.v);
            }
        }
    }
}
