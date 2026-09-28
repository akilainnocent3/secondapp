package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lo20.a;

/* JADX INFO: loaded from: classes.dex */
public final class gyr {
    public final po20 a;
    public final Function1<? super dlx, Unit> b;
    public final mo20 c;
    public lo20 d;
    public int e;
    public int f;
    public int g;

    public final class a implements dlx {
        public final int a;
        public final ArrayList b = new ArrayList();

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.dlx
        public final void a(int i) {
            gyr gyrVar = gyr.this;
            lo20 lo20Var = gyrVar.d;
            if (lo20Var == null) {
                return;
            }
            mo20 mo20Var = gyrVar.c;
            po20 po20Var = lo20Var.c;
            this.b.add(lo20Var.new a(i, mo20Var, po20Var instanceof ow20 ? (ow20) po20Var : null, null));
        }

        @Override // defpackage.dlx
        public final int b() {
            return this.a;
        }
    }

    public interface b {
        void c();

        void cancel();
    }

    public interface c {
        long a(int i);

        int b();
    }

    public gyr() {
        this.c = new mo20();
        this.e = -1;
        this.f = -1;
    }

    public final b a(int i, long j, boolean z, Function1<? super c, Unit> function1) {
        lo20 lo20Var = this.d;
        if (lo20Var == null) {
            return hgf.a;
        }
        po20 po20Var = lo20Var.c;
        boolean z2 = po20Var instanceof ow20;
        lo20.a aVar = lo20Var.new a(i, this.c, z2 ? (ow20) po20Var : null, function1);
        aVar.d = new kxa(j);
        if (!z2) {
            po20Var.a(aVar);
        } else if (z) {
            ((ow20) po20Var).c(aVar);
        } else {
            ((ow20) po20Var).b(aVar);
        }
        rc0.a(i, "compose:lazy:schedule_prefetch:index");
        return aVar;
    }

    @fae
    public gyr(po20 po20Var, Function1<? super dlx, Unit> function1) {
        this();
        this.a = po20Var;
        this.b = function1;
    }
}
