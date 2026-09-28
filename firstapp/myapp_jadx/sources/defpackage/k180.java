package defpackage;

import android.animation.AnimatorSet;
import com.appsflyer.internal.AFa1uSDK;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.c;
import com.google.android.material.search.e;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k180 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k180(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = eVar.c;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet animatorSetG = eVar.g(true);
                animatorSetG.addListener(new c(eVar));
                animatorSetG.start();
                break;
            default:
                ((AFa1uSDK) obj).copy();
                break;
        }
    }
}
