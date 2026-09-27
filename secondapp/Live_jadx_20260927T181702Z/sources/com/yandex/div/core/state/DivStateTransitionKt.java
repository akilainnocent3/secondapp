package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import dr.w2;
import ds.l;
import f2.f2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStateTransitionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void visit(View view, l<? super View, w2> lVar) {
        if (view instanceof ViewGroup) {
            Iterator<View> it = f2.e((ViewGroup) view).iterator();
            while (it.hasNext()) {
                visit(it.next(), lVar);
            }
        }
        lVar.invoke(view);
    }
}
