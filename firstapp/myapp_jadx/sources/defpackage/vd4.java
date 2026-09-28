package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class vd4 extends j8i0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ssw<qd4.b> E;
    public ssw<zc4> F;
    public ssw<CharSequence> G;
    public ssw<Boolean> H;
    public ssw<Boolean> I;
    public ssw<Boolean> K;
    public ssw<Integer> M;
    public ssw<CharSequence> N;
    public Executor a;
    public qd4.a b;
    public qd4.d c;
    public qd4.c d;
    public v41 e;
    public hc6 f;
    public c i;
    public String v;
    public boolean y;
    public boolean z;
    public int w = 0;
    public boolean J = true;
    public int L = 0;

    public static final class a extends v41.c {
        public final WeakReference<vd4> a;

        public a(vd4 vd4Var) {
            this.a = new WeakReference<>(vd4Var);
        }

        @Override // v41.c
        public final void a(int i, CharSequence charSequence) {
            WeakReference<vd4> weakReference = this.a;
            if (weakReference.get() == null || weakReference.get().A || !weakReference.get().z) {
                return;
            }
            vd4 vd4Var = weakReference.get();
            zc4 zc4Var = new zc4(i, charSequence);
            ssw<zc4> sswVar = vd4Var.F;
            if (sswVar == null) {
                sswVar = new ssw<>();
                vd4Var.F = sswVar;
            }
            vd4.A1(sswVar, zc4Var);
        }

        @Override // v41.c
        public final void b(qd4.b bVar) {
            WeakReference<vd4> weakReference = this.a;
            if (weakReference.get() == null || !weakReference.get().z) {
                return;
            }
            int i = -1;
            if (bVar.b == -1) {
                qd4.c cVar = bVar.a;
                int iX1 = weakReference.get().x1();
                if ((iX1 & 32767) != 0 && !w41.b(iX1)) {
                    i = 2;
                }
                bVar = new qd4.b(cVar, i);
            }
            vd4 vd4Var = weakReference.get();
            ssw<qd4.b> sswVar = vd4Var.E;
            if (sswVar == null) {
                sswVar = new ssw<>();
                vd4Var.E = sswVar;
            }
            vd4.A1(sswVar, bVar);
        }
    }

    public static class b implements Executor {
        public final Handler a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public static class c implements DialogInterface.OnClickListener {
        public final WeakReference<vd4> a;

        public c(vd4 vd4Var) {
            this.a = new WeakReference<>(vd4Var);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            WeakReference<vd4> weakReference = this.a;
            if (weakReference.get() != null) {
                weakReference.get().z1(true);
            }
        }
    }

    public static <T> void A1(ssw<T> sswVar, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            sswVar.m(t);
        } else {
            sswVar.j(t);
        }
    }

    public final int x1() {
        qd4.d dVar = this.c;
        if (dVar != null) {
            return w41.a(dVar, this.d);
        }
        return 0;
    }

    public final void y1(int i) {
        ssw<Integer> sswVar = this.M;
        if (sswVar == null) {
            sswVar = new ssw<>();
            this.M = sswVar;
        }
        A1(sswVar, Integer.valueOf(i));
    }

    public final void z1(boolean z) {
        ssw<Boolean> sswVar = this.I;
        if (sswVar == null) {
            sswVar = new ssw<>();
            this.I = sswVar;
        }
        A1(sswVar, Boolean.valueOf(z));
    }
}
