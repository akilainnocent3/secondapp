package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xhk {
    public final nvd0 a;
    public final Handler b;
    public final ArrayList c;
    public final xa50 d;
    public final ue4 e;
    public boolean f;
    public boolean g;
    public ea50<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public nsg0<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    public static class a extends ujc<Bitmap> {
        public final Handler d;
        public final int e;
        public final long f;
        public Bitmap i;

        public a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        @Override // defpackage.d5f0
        public final void e(Object obj) {
            this.i = (Bitmap) obj;
            Handler handler = this.d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
        }

        @Override // defpackage.d5f0
        public final void h(Drawable drawable) {
            this.i = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            xhk xhkVar = xhk.this;
            if (i == 1) {
                xhkVar.b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            xhkVar.d.n((a) message.obj);
            return false;
        }
    }

    public xhk(com.bumptech.glide.a aVar, nvd0 nvd0Var, int i, int i2, ffh0 ffh0Var, Bitmap bitmap) {
        ue4 ue4Var = aVar.a;
        wzk wzkVar = aVar.c;
        xa50 xa50VarD = com.bumptech.glide.a.d(wzkVar.getBaseContext());
        ea50<Bitmap> ea50VarF = com.bumptech.glide.a.d(wzkVar.getBaseContext()).k().a(((hb50) new hb50().e(hre.b).D()).x(true).n(i, i2));
        this.c = new ArrayList();
        this.d = xa50VarD;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = ue4Var;
        this.b = handler;
        this.h = ea50VarF;
        this.a = nvd0Var;
        c(ffh0Var, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            b(aVar);
            return;
        }
        this.g = true;
        nvd0 nvd0Var = this.a;
        zhk zhkVar = nvd0Var.l;
        int i3 = zhkVar.c;
        if (i3 <= 0 || (i2 = nvd0Var.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((whk) zhkVar.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        nvd0Var.b();
        this.k = new a(this.b, nvd0Var.k, jUptimeMillis);
        ea50<Bitmap> ea50VarP = this.h.a(new hb50().v(new acy(Double.valueOf(Math.random())))).P(nvd0Var);
        ea50VarP.L(this.k, null, ea50VarP, fug.a);
    }

    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.n = aVar;
            return;
        }
        if (aVar.i != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.d(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(nsg0<Bitmap> nsg0Var, Bitmap bitmap) {
        gm20.c(nsg0Var, "Argument must not be null");
        this.m = nsg0Var;
        gm20.c(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new hb50().A(nsg0Var, true));
        this.o = erh0.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
