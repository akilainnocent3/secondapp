package androidx.work;

import defpackage.bjb0;
import defpackage.dqe0;
import defpackage.eqa;
import defpackage.fqa;
import defpackage.fse;
import defpackage.gjd;
import defpackage.iwx;
import defpackage.lfd;
import defpackage.pfd;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ExecutorService a = fqa.a(false);
    public final pfd b = fse.a;
    public final ExecutorService c = fqa.a(true);
    public final dqe0 d = new dqe0();
    public final bjb0 e;
    public final iwx f;
    public final lfd g;
    public final int h;
    public final eqa i;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0076a {
        public bjb0 a;
        public int b = 4;
    }

    public interface b {
        a b();
    }

    public a(C0076a c0076a) {
        bjb0 bjb0Var = c0076a.a;
        this.e = bjb0Var == null ? gjd.b : bjb0Var;
        this.f = iwx.a;
        this.g = new lfd();
        this.h = c0076a.b;
        this.i = new eqa();
    }
}
