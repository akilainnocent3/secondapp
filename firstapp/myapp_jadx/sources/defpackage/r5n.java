package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sportybet.plugin.realsports.widget.FlashBoostBadgeView;

/* JADX INFO: loaded from: classes7.dex */
public final class r5n implements View.OnLayoutChangeListener {
    public final /* synthetic */ q5n a;
    public final /* synthetic */ FlashBoostBadgeView b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ ku1 d;

    public r5n(q5n q5nVar, FlashBoostBadgeView flashBoostBadgeView, ViewGroup viewGroup, ku1 ku1Var) {
        this.a = q5nVar;
        this.b = flashBoostBadgeView;
        this.c = viewGroup;
        this.d = ku1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        t5n.b(this.d, this.a, view, this.c, this.b);
    }
}
