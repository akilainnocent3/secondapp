package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h32 implements ekv {
    public final ArrayList<ekv.c> a = new ArrayList<>(1);
    public final HashSet<ekv.c> b = new HashSet<>(1);
    public final mkv.a c = new mkv.a();
    public final mef.a d = new mef.a();
    public Looper e;
    public qxf0 f;
    public sp10 g;

    @Override // defpackage.ekv
    public final void a(Handler handler, mkv mkvVar) {
        handler.getClass();
        CopyOnWriteArrayList<mkv.a.C0872a> copyOnWriteArrayList = this.c.c;
        mkv.a.C0872a c0872a = new mkv.a.C0872a();
        c0872a.a = handler;
        c0872a.b = mkvVar;
        copyOnWriteArrayList.add(c0872a);
    }

    @Override // defpackage.ekv
    public final void b(mkv mkvVar) {
        CopyOnWriteArrayList<mkv.a.C0872a> copyOnWriteArrayList = this.c.c;
        for (mkv.a.C0872a c0872a : copyOnWriteArrayList) {
            if (c0872a.b == mkvVar) {
                copyOnWriteArrayList.remove(c0872a);
            }
        }
    }

    @Override // defpackage.ekv
    public final void d(mef mefVar) {
        CopyOnWriteArrayList<mef.a.C0868a> copyOnWriteArrayList = this.d.c;
        for (mef.a.C0868a c0868a : copyOnWriteArrayList) {
            if (c0868a.a == mefVar) {
                copyOnWriteArrayList.remove(c0868a);
            }
        }
    }

    @Override // defpackage.ekv
    public final void f(ekv.c cVar) {
        ArrayList<ekv.c> arrayList = this.a;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            k(cVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        t();
    }

    @Override // defpackage.ekv
    public final void h(ekv.c cVar) {
        this.e.getClass();
        HashSet<ekv.c> hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            q();
        }
    }

    @Override // defpackage.ekv
    public final void i(Handler handler, mef mefVar) {
        handler.getClass();
        CopyOnWriteArrayList<mef.a.C0868a> copyOnWriteArrayList = this.d.c;
        mef.a.C0868a c0868a = new mef.a.C0868a();
        c0868a.a = mefVar;
        copyOnWriteArrayList.add(c0868a);
    }

    @Override // defpackage.ekv
    public final void j(ekv.c cVar, mrg0 mrg0Var, sp10 sp10Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        ly0.b(looper == null || looper == looperMyLooper);
        this.g = sp10Var;
        qxf0 qxf0Var = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(cVar);
            r(mrg0Var);
        } else if (qxf0Var != null) {
            h(cVar);
            cVar.a(this, qxf0Var);
        }
    }

    @Override // defpackage.ekv
    public final void k(ekv.c cVar) {
        HashSet<ekv.c> hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        p();
    }

    public abstract void r(mrg0 mrg0Var);

    public final void s(qxf0 qxf0Var) {
        this.f = qxf0Var;
        ArrayList<ekv.c> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ekv.c cVar = arrayList.get(i);
            i++;
            cVar.a(this, qxf0Var);
        }
    }

    public abstract void t();

    public void p() {
    }

    public void q() {
    }
}
