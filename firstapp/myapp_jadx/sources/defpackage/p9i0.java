package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public interface p9i0<T extends View> extends hx90 {
    static dqe l(int i, int i2, int i3) {
        if (i == -2) {
            return dqe.b.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            dqe.a.a(i4);
            return new dqe.a(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        dqe.a.a(i5);
        return new dqe.a(i5);
    }

    default ww90 a() {
        int paddingRight;
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        int i = layoutParams != null ? layoutParams.width : -1;
        int width = getView().getWidth();
        if (r()) {
            paddingRight = getView().getPaddingRight() + getView().getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        dqe dqeVarL = l(i, width, paddingRight);
        if (dqeVarL == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
        dqe dqeVarL2 = l(layoutParams2 != null ? layoutParams2.height : -1, getView().getHeight(), r() ? getView().getPaddingBottom() + getView().getPaddingTop() : 0);
        if (dqeVarL2 == null) {
            return null;
        }
        return new ww90(dqeVarL, dqeVarL2);
    }

    @Override // defpackage.hx90
    default Object d(v1b<? super ww90> v1bVar) throws Throwable {
        ww90 ww90VarA = a();
        if (ww90VarA != null) {
            return ww90VarA;
        }
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
        o9i0 o9i0Var = new o9i0(this, viewTreeObserver, bc6Var);
        viewTreeObserver.addOnPreDrawListener(o9i0Var);
        bc6Var.t(new n9i0(this, viewTreeObserver, o9i0Var));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    T getView();

    default void q(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default boolean r() {
        return true;
    }
}
