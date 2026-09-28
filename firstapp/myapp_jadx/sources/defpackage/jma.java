package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class jma<T> extends h32 {
    public final HashMap<T, b<T>> h = new HashMap<>();
    public Handler i;
    public mrg0 j;

    public final class a implements mkv, mef {
        public final T a;
        public mkv.a b;
        public mef.a c;

        public a(T t) {
            this.b = new mkv.a(jma.this.c.c, 0, null);
            this.c = new mef.a(jma.this.d.c, 0, null);
            this.a = t;
        }

        @Override // defpackage.mkv
        public final void L(int i, ekv.b bVar, tws twsVar, pjv pjvVar, int i2) {
            if (a(i, bVar)) {
                mkv.a aVar = this.b;
                aVar.a(new gkv(aVar, twsVar, i(pjvVar, bVar), i2));
            }
        }

        @Override // defpackage.mkv
        public final void M(int i, ekv.b bVar, pjv pjvVar) {
            if (a(i, bVar)) {
                mkv.a aVar = this.b;
                aVar.a(new fkv(aVar, i(pjvVar, bVar)));
            }
        }

        @Override // defpackage.mkv
        public final void S(int i, ekv.b bVar, tws twsVar, pjv pjvVar) {
            if (a(i, bVar)) {
                mkv.a aVar = this.b;
                aVar.a(new jkv(aVar, twsVar, i(pjvVar, bVar)));
            }
        }

        @Override // defpackage.mkv
        public final void U(int i, ekv.b bVar, tws twsVar, pjv pjvVar) {
            if (a(i, bVar)) {
                mkv.a aVar = this.b;
                aVar.a(new hkv(aVar, twsVar, i(pjvVar, bVar)));
            }
        }

        public final boolean a(int i, ekv.b bVar) {
            ekv.b bVarU;
            T t = this.a;
            jma jmaVar = jma.this;
            if (bVar != null) {
                bVarU = jmaVar.u(t, bVar);
                if (bVarU == null) {
                    return false;
                }
            } else {
                bVarU = null;
            }
            int iW = jmaVar.w(i, t);
            mkv.a aVar = this.b;
            if (aVar.a != iW || !Objects.equals(aVar.b, bVarU)) {
                this.b = new mkv.a(jmaVar.c.c, iW, bVarU);
            }
            mef.a aVar2 = this.c;
            if (aVar2.a == iW && Objects.equals(aVar2.b, bVarU)) {
                return true;
            }
            this.c = new mef.a(jmaVar.d.c, iW, bVarU);
            return true;
        }

        public final pjv i(pjv pjvVar, ekv.b bVar) {
            long j = pjvVar.f;
            jma jmaVar = jma.this;
            T t = this.a;
            long jV = jmaVar.v(t, j);
            long j2 = pjvVar.g;
            long jV2 = jmaVar.v(t, j2);
            return (jV == j && jV2 == j2) ? pjvVar : new pjv(pjvVar.a, pjvVar.b, pjvVar.c, pjvVar.d, pjvVar.e, jV, jV2);
        }

        @Override // defpackage.mkv
        public final void n(int i, ekv.b bVar, pjv pjvVar) {
            if (a(i, bVar)) {
                mkv.a aVar = this.b;
                pjv pjvVarI = i(pjvVar, bVar);
                ekv.b bVar2 = aVar.b;
                bVar2.getClass();
                aVar.a(new kkv(aVar, bVar2, pjvVarI));
            }
        }

        @Override // defpackage.mkv
        public final void v(int i, ekv.b bVar, tws twsVar, pjv pjvVar, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                mkv.a aVar = this.b;
                aVar.a(new ikv(aVar, twsVar, i(pjvVar, bVar), iOException, z));
            }
        }
    }

    public static final class b<T> {
        public final ekv a;
        public final ima b;
        public final jma<T>.a c;

        public b(ekv ekvVar, ima imaVar, a aVar) {
            this.a = ekvVar;
            this.b = imaVar;
            this.c = aVar;
        }
    }

    @Override // defpackage.ekv
    public void l() {
        Iterator<b<T>> it = this.h.values().iterator();
        while (it.hasNext()) {
            it.next().a.l();
        }
    }

    @Override // defpackage.h32
    public final void p() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.k(bVar.b);
        }
    }

    @Override // defpackage.h32
    public final void q() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.h(bVar.b);
        }
    }

    @Override // defpackage.h32
    public void t() {
        HashMap<T, b<T>> map = this.h;
        for (b<T> bVar : map.values()) {
            ekv ekvVar = bVar.a;
            jma<T>.a aVar = bVar.c;
            ekvVar.f(bVar.b);
            ekvVar.b(aVar);
            ekvVar.d(aVar);
        }
        map.clear();
    }

    public abstract ekv.b u(T t, ekv.b bVar);

    public abstract void x(Object obj, h32 h32Var, qxf0 qxf0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ekv$c, ima] */
    public final void y(final T t, ekv ekvVar) {
        HashMap<T, b<T>> map = this.h;
        ly0.b(!map.containsKey(t));
        ?? r1 = new ekv.c() { // from class: ima
            @Override // ekv.c
            public final void a(h32 h32Var, qxf0 qxf0Var) {
                this.a.x(t, h32Var, qxf0Var);
            }
        };
        a aVar = new a(t);
        map.put(t, new b<>(ekvVar, r1, aVar));
        Handler handler = this.i;
        handler.getClass();
        ekvVar.a(handler, aVar);
        Handler handler2 = this.i;
        handler2.getClass();
        ekvVar.i(handler2, aVar);
        mrg0 mrg0Var = this.j;
        sp10 sp10Var = this.g;
        ly0.g(sp10Var);
        ekvVar.j(r1, mrg0Var, sp10Var);
        if (this.b.isEmpty()) {
            ekvVar.k(r1);
        }
    }

    public long v(Object obj, long j) {
        return j;
    }

    public int w(int i, Object obj) {
        return i;
    }
}
