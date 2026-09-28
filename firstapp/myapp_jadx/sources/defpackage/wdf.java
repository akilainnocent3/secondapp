package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class wdf extends AnimatorListenerAdapter {
    public final /* synthetic */ xdf a;

    public wdf(xdf xdfVar) {
        this.a = xdfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        xdf xdfVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = xdfVar.i;
        if (arrayList == null || xdfVar.v) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zd0) obj).a(xdfVar);
        }
    }
}
