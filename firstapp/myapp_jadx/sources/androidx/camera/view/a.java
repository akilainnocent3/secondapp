package androidx.camera.view;

import androidx.camera.view.PreviewView;
import defpackage.dbj;
import defpackage.ew5;
import defpackage.m26;
import defpackage.n26;
import defpackage.nbj;
import defpackage.nqe;
import defpackage.nv5;
import defpackage.oaj;
import defpackage.obj;
import defpackage.pgt;
import defpackage.pq20;
import defpackage.pw6;
import defpackage.qq20;
import defpackage.ssw;
import defpackage.tcy;
import defpackage.wz0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements tcy.a<n26.a> {
    public final m26 a;
    public final ssw<PreviewView.f> b;
    public PreviewView.f c;
    public final c d;
    public dbj e;
    public boolean f = false;

    public a(m26 m26Var, ssw<PreviewView.f> sswVar, c cVar) {
        this.a = m26Var;
        this.b = sswVar;
        this.d = cVar;
        synchronized (this) {
            this.c = sswVar.d();
        }
    }

    @Override // tcy.a
    public final void a(n26.a aVar) {
        n26.a aVar2 = aVar;
        n26.a aVar3 = n26.a.CLOSING;
        PreviewView.f fVar = PreviewView.f.a;
        if (aVar2 == aVar3 || aVar2 == n26.a.CLOSED || aVar2 == n26.a.RELEASING || aVar2 == n26.a.RELEASED) {
            b(fVar);
            if (this.f) {
                this.f = false;
                dbj dbjVar = this.e;
                if (dbjVar != null) {
                    dbjVar.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((aVar2 == n26.a.OPENING || aVar2 == n26.a.OPEN || aVar2 == n26.a.PENDING_OPEN) && !this.f) {
            m26 m26Var = this.a;
            b(fVar);
            ArrayList arrayList = new ArrayList();
            nv5.a aVar4 = new nv5.a();
            nv5.d<T> dVar = new nv5.d<>(aVar4);
            aVar4.b = dVar;
            aVar4.a = ew5.class;
            try {
                qq20 qq20Var = new qq20(aVar4, m26Var);
                arrayList.add(qq20Var);
                m26Var.h(nqe.a(), qq20Var);
                aVar4.a = "waitForCaptureResult";
            } catch (Exception e) {
                dVar.a(e);
            }
            pw6 pw6VarG = obj.g(dbj.a(dVar), new wz0() { // from class: nq20
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    return this.a.d.h();
                }
            }, nqe.a());
            oaj oajVar = new oaj() { // from class: oq20
                @Override // defpackage.oaj
                public final Object apply(Object obj) {
                    this.a.b(PreviewView.f.b);
                    return null;
                }
            };
            pw6 pw6VarG2 = obj.g(pw6VarG, new nbj(oajVar), nqe.a());
            this.e = pw6VarG2;
            pq20 pq20Var = new pq20(this, arrayList, m26Var);
            pw6VarG2.k(new obj.b(pw6VarG2, pq20Var), nqe.a());
            this.f = true;
        }
    }

    public final void b(PreviewView.f fVar) {
        synchronized (this) {
            try {
                if (this.c.equals(fVar)) {
                    return;
                }
                this.c = fVar;
                pgt.a("StreamStateObserver", "Update Preview stream state to " + fVar);
                this.b.j(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tcy.a
    public final void onError(Throwable th) {
        dbj dbjVar = this.e;
        if (dbjVar != null) {
            dbjVar.cancel(false);
            this.e = null;
        }
        b(PreviewView.f.a);
    }
}
