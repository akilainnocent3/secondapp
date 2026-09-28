package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class jla implements tse {
    public final /* synthetic */ View a;
    public final /* synthetic */ gla b;

    public jla(View view, gla glaVar) {
        this.a = view;
        this.b = glaVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }
}
