package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f147112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f147113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh1 f147114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh1 f147115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f147116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r00 f147117f;

    public /* synthetic */ b81(Context context, lu2 lu2Var) {
        this(context, lu2Var, new rh1(context), new mh1());
    }

    public final void a(final em3 em3Var) {
        this.f147114c.a();
        this.f147115d.a(new Runnable() { // from class: yads.vx3
            @Override // java.lang.Runnable
            public final void run() {
                b81.a(this.f157126b, em3Var);
            }
        });
    }

    public final void a(r00 r00Var) {
        this.f147114c.a();
        this.f147117f = r00Var;
        Iterator it = this.f147116e.iterator();
        while (it.hasNext()) {
            s81 s81Var = ((c81) it.next()).f147625d;
            s81Var.f155308f = r00Var;
            s81Var.f155307e.a(r00Var);
        }
    }

    public b81(Context context, lu2 lu2Var, rh1 rh1Var, mh1 mh1Var) {
        this.f147112a = context;
        this.f147113b = lu2Var;
        this.f147114c = rh1Var;
        this.f147115d = mh1Var;
        this.f147116e = new CopyOnWriteArrayList();
        rh1Var.a();
    }

    public static final void a(b81 b81Var, em3 em3Var) {
        Context context = b81Var.f147112a;
        lu2 lu2Var = b81Var.f147113b;
        n43 n43Var = n43.f152875b;
        n43 n43VarA = m43.a();
        c81 c81Var = new c81(context, lu2Var, b81Var, n43VarA);
        b81Var.f147116e.add(c81Var);
        r00 r00Var = b81Var.f147117f;
        s81 s81Var = c81Var.f147625d;
        s81Var.f155308f = r00Var;
        s81Var.f155307e.a(r00Var);
        n43VarA.b(ie1.f150571b, c81Var);
        s81 s81Var2 = c81Var.f147625d;
        s81Var2.getClass();
        s81Var2.f155307e.f158143e = new rb1(em3Var);
        c81Var.f147624c.a(v5.f156746e, null);
        qe3 qe3Var = c81Var.f147626e;
        q81 q81Var = c81Var.f147627f;
        we3 we3Var = qe3Var.f154452b;
        Object obj = qe3Var.f154454d;
        we3Var.getClass();
        ue3 ue3Var = new ue3(we3Var, q81Var, em3Var, obj);
        ve3 ve3Var = new ve3(q81Var);
        if (we3Var.f157350j.contains(obj)) {
            ue3Var.invoke();
        } else {
            jv.k.f(we3Var.f157346f, null, null, new re3(we3Var, obj, ue3Var, ve3Var, null), 3, null);
        }
    }
}
