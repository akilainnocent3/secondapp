package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sportybet.plugin.realsports.widget.FlashBoostBadgeView;

/* JADX INFO: loaded from: classes7.dex */
public final class s5n implements View.OnAttachStateChangeListener {
    public final /* synthetic */ q5n a;
    public final /* synthetic */ FlashBoostBadgeView b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ ku1 d;

    public static final class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ q5n b;
        public final /* synthetic */ FlashBoostBadgeView c;
        public final /* synthetic */ ViewGroup d;
        public final /* synthetic */ ku1 e;

        public a(ku1 ku1Var, q5n q5nVar, View view, ViewGroup viewGroup, FlashBoostBadgeView flashBoostBadgeView) {
            this.a = view;
            this.b = q5nVar;
            this.c = flashBoostBadgeView;
            this.d = viewGroup;
            this.e = ku1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            t5n.b(this.e, this.b, this.a, this.d, this.c);
        }
    }

    public s5n(q5n q5nVar, FlashBoostBadgeView flashBoostBadgeView, ViewGroup viewGroup, ku1 ku1Var) {
        this.a = q5nVar;
        this.b = flashBoostBadgeView;
        this.c = viewGroup;
        this.d = ku1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        qry.a(view, new a(this.d, this.a, view, this.c, this.b));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FlashBoostBadgeView flashBoostBadgeView;
        view.getClass();
        q5n q5nVar = this.a;
        ViewGroup viewGroup = q5nVar.a;
        if (viewGroup == null || (flashBoostBadgeView = q5nVar.b) == null) {
            return;
        }
        viewGroup.getOverlay().remove(flashBoostBadgeView);
    }
}
