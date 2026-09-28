package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class r70 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ s70 a;

    public r70(s70 s70Var) {
        this.a = s70Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Context context = view.getContext();
        s70 s70Var = this.a;
        if (s70Var.d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(s70Var.f);
        s70Var.d = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        s70 s70Var = this.a;
        Context context = view.getContext();
        if (s70Var.d) {
            context.getApplicationContext().unregisterComponentCallbacks(s70Var.f);
            s70Var.d = false;
        }
        jb0 jb0Var = s70Var.e;
        if (jb0Var != null) {
            synchronized (jb0Var) {
                try {
                    rtw<jb0.a, xef> rtwVar = jb0Var.c;
                    if (rtwVar != null) {
                        rtwVar.g();
                    }
                    rtw<jb0.a, oln> rtwVar2 = jb0Var.d;
                    if (rtwVar2 != null) {
                        rtwVar2.g();
                    }
                    jb0Var.e = null;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        s70Var.e = null;
    }
}
