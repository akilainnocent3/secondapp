package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class q70 implements ComponentCallbacks2 {
    public final /* synthetic */ s70 a;

    public q70(s70 s70Var) {
        this.a = s70Var;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            s70 s70Var = this.a;
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

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
