package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ia20 implements ViewTreeObserver.OnPreDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> b;
    public final pt0 c;
    public final qt0 d;

    public ia20(View view, pt0 pt0Var, qt0 qt0Var) {
        this.b = new AtomicReference<>(view);
        this.c = pt0Var;
        this.d = qt0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.b.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        pt0 pt0Var = this.c;
        Handler handler = this.a;
        handler.post(pt0Var);
        handler.postAtFrontOfQueue(this.d);
        return true;
    }
}
