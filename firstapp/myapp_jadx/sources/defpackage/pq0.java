package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pq0 implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public class a extends j9i0 {
        public a() {
        }

        @Override // defpackage.i9i0
        public final void a() {
            AppCompatDelegateImpl appCompatDelegateImpl = pq0.this.a;
            appCompatDelegateImpl.K.setAlpha(1.0f);
            appCompatDelegateImpl.N.d(null);
            appCompatDelegateImpl.N = null;
        }

        @Override // defpackage.j9i0, defpackage.i9i0
        public final void c() {
            pq0.this.a.K.setVisibility(0);
        }
    }

    public pq0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.L.showAtLocation(appCompatDelegateImpl.K, 55, 0, 0);
        g9i0 g9i0Var = appCompatDelegateImpl.N;
        if (g9i0Var != null) {
            g9i0Var.b();
        }
        if (!appCompatDelegateImpl.P || (viewGroup = appCompatDelegateImpl.Q) == null || !viewGroup.isLaidOut()) {
            appCompatDelegateImpl.K.setAlpha(1.0f);
            appCompatDelegateImpl.K.setVisibility(0);
            return;
        }
        appCompatDelegateImpl.K.setAlpha(0.0f);
        g9i0 g9i0VarA = r6i0.a(appCompatDelegateImpl.K);
        g9i0VarA.a(1.0f);
        appCompatDelegateImpl.N = g9i0VarA;
        g9i0VarA.d(new a());
    }
}
