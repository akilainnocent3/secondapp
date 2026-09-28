package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class mdb0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ndb0.a a;
    public final /* synthetic */ View b;

    public mdb0(ndb0.a aVar, View view) {
        this.a = aVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.a.b.a()) {
            return false;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
