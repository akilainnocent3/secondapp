package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final class bnl0 implements Runnable {
    public final /* synthetic */ iol0 a;

    public bnl0(iol0 iol0Var, kol0 kol0Var) {
        this.a = iol0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.a;
        iol0Var.b().g();
        iol0Var.k = new o6l0(iol0Var);
        lqk0 lqk0Var = new lqk0(iol0Var);
        lqk0Var.i();
        iol0Var.c = lqk0Var;
        e7l0 e7l0Var = iol0Var.a;
        wok0 wok0VarE0 = iol0Var.e0();
        hm20.h(e7l0Var);
        wok0VarE0.d = e7l0Var;
        mkl0 mkl0Var = new mkl0(iol0Var);
        mkl0Var.i();
        iol0Var.i = mkl0Var;
        knk0 knk0Var = new knk0(iol0Var);
        knk0Var.i();
        iol0Var.f = knk0Var;
        zfl0 zfl0Var = new zfl0(iol0Var);
        zfl0Var.i();
        iol0Var.h = zfl0Var;
        jml0 jml0Var = new jml0(iol0Var);
        jml0Var.i();
        iol0Var.e = jml0Var;
        iol0Var.d = new x5l0(iol0Var);
        if (iol0Var.r != iol0Var.s) {
            iol0Var.a().f.c(Integer.valueOf(iol0Var.r), "Not all upload components initialized", Integer.valueOf(iol0Var.s));
        }
        iol0Var.m.set(true);
        iol0Var.a().n.a("UploadController is now fully initialized");
        iol0Var.b().g();
        lqk0 lqk0Var2 = iol0Var.c;
        iol0.U(lqk0Var2);
        lqk0Var2.q();
        lqk0 lqk0Var3 = iol0Var.c;
        iol0.U(lqk0Var3);
        lqk0Var3.g();
        lqk0Var3.h();
        if (lqk0Var3.N()) {
            t2l0 t2l0Var = v2l0.v0;
            if (((Long) t2l0Var.a(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseV = lqk0Var3.V();
                k8l0 k8l0Var = lqk0Var3.a;
                k8l0Var.k.getClass();
                int iDelete = sQLiteDatabaseV.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(t2l0Var.a(null))});
                if (iDelete > 0) {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.n.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                }
            }
        }
        if (iol0Var.i.h.a() == 0) {
            d6l0 d6l0Var = iol0Var.i.h;
            iol0Var.e().getClass();
            d6l0Var.b(System.currentTimeMillis());
        }
        iol0Var.N();
    }
}
