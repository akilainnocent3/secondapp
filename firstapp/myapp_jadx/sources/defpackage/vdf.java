package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class vdf extends AnimatorListenerAdapter {
    public final /* synthetic */ xdf a;

    public vdf(xdf xdfVar) {
        this.a = xdfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        xdf xdfVar = this.a;
        ArrayList arrayList = xdfVar.i;
        if (arrayList == null || xdfVar.v) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zd0) obj).b(xdfVar);
        }
    }
}
