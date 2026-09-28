package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class idb0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ndb0.b a;
    public final /* synthetic */ View b;

    public idb0(ndb0.b bVar, View view) {
        this.a = bVar;
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
