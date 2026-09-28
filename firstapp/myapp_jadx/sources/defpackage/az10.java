package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class az10 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;

    public az10(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.c.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
