package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class t9m implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ComposeView b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ View d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ b120 g;
    public final /* synthetic */ p9m h;

    public t9m(View view, ComposeView composeView, ViewGroup viewGroup, View view2, float f, float f2, b120 b120Var, p9m p9mVar) {
        this.a = view;
        this.b = composeView;
        this.c = viewGroup;
        this.d = view2;
        this.e = f;
        this.f = f2;
        this.g = b120Var;
        this.h = p9mVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        boolean zIsLaidOut = this.a.isLaidOut();
        p9m p9mVar = this.h;
        b120 b120Var = this.g;
        ViewGroup viewGroup = this.c;
        ComposeView composeView = this.b;
        if (!zIsLaidOut || !composeView.isLaidOut()) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new u9m(this.a, composeView, viewGroup, this.d, this.e, this.f, b120Var, p9mVar));
            return;
        }
        v9m.b(this.a, viewGroup, composeView, this.d, this.e, this.f, b120Var);
        composeView.setVisibility(0);
        viewGroup.getViewTreeObserver().addOnScrollChangedListener(p9mVar);
    }
}
