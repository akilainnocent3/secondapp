package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class jth implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ kth b;

    public class a implements Runnable {
        public final /* synthetic */ jth a;

        public a(jth jthVar) {
            this.a = jthVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            cel celVarA = cel.a();
            celVarA.getClass();
            erh0.a();
            celVarA.d.set(true);
            jth.this.b.b = true;
            View view = jth.this.a;
            view.getViewTreeObserver().removeOnDrawListener(this.a);
            jth.this.b.a.clear();
        }
    }

    public jth(kth kthVar, View view) {
        this.b = kthVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        erh0.f().post(new a(this));
    }
}
