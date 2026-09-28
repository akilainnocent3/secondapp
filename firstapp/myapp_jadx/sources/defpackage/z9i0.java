package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z9i0 implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ View[] b;

    public /* synthetic */ z9i0(d dVar, View[] viewArr) {
        this.a = dVar;
        this.b = viewArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.a;
        int i = dVar.p;
        View[] viewArr = this.b;
        if (i != -1) {
            for (View view : viewArr) {
                view.setTag(dVar.p, Long.valueOf(System.nanoTime()));
            }
        }
        if (dVar.q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(dVar.q, null);
            }
        }
    }
}
