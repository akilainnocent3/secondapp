package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.i;
import defpackage.br10;
import defpackage.cdl;
import defpackage.ekv;
import defpackage.jrh0;
import defpackage.mef;
import defpackage.mkv;
import defpackage.mrg0;
import defpackage.nkv;
import defpackage.okv;
import defpackage.pjv;
import defpackage.qxf0;
import defpackage.sp10;
import defpackage.t2;
import defpackage.tb90;
import defpackage.tws;
import defpackage.xz;
import defpackage.ytu;
import defpackage.zjv;
import defpackage.ztu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final sp10 a;
    public final e e;
    public final xz h;
    public final cdl i;
    public boolean k;
    public mrg0 l;
    public tb90 j = new tb90.a();
    public final IdentityHashMap<zjv, c> c = new IdentityHashMap<>();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();
    public final HashSet g = new HashSet();

    public final class a implements mkv, mef {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.mkv
        public final void L(int i, ekv.b bVar, final tws twsVar, final pjv pjvVar, final int i2) {
            final Pair<Integer, ekv.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: tkv
                    @Override // java.lang.Runnable
                    public final void run() {
                        xz xzVar = i.this.h;
                        Pair pair = pairA;
                        xzVar.L(((Integer) pair.first).intValue(), (ekv.b) pair.second, twsVar, pjvVar, i2);
                    }
                });
            }
        }

        @Override // defpackage.mkv
        public final void M(int i, ekv.b bVar, final pjv pjvVar) {
            final Pair<Integer, ekv.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: rkv
                    @Override // java.lang.Runnable
                    public final void run() {
                        xz xzVar = i.this.h;
                        Pair pair = pairA;
                        xzVar.M(((Integer) pair.first).intValue(), (ekv.b) pair.second, pjvVar);
                    }
                });
            }
        }

        @Override // defpackage.mkv
        public final void S(int i, ekv.b bVar, final tws twsVar, final pjv pjvVar) {
            final Pair<Integer, ekv.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: qkv
                    @Override // java.lang.Runnable
                    public final void run() {
                        xz xzVar = i.this.h;
                        Pair pair = pairA;
                        xzVar.S(((Integer) pair.first).intValue(), (ekv.b) pair.second, twsVar, pjvVar);
                    }
                });
            }
        }

        @Override // defpackage.mkv
        public final void U(int i, ekv.b bVar, final tws twsVar, final pjv pjvVar) {
            final Pair<Integer, ekv.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: skv
                    @Override // java.lang.Runnable
                    public final void run() {
                        xz xzVar = i.this.h;
                        Pair pair = pairA;
                        xzVar.U(((Integer) pair.first).intValue(), (ekv.b) pair.second, twsVar, pjvVar);
                    }
                });
            }
        }

        public final Pair<Integer, ekv.b> a(int i, ekv.b bVar) {
            ekv.b bVarA;
            c cVar = this.a;
            ekv.b bVar2 = null;
            if (bVar != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cVar.c.size()) {
                        bVarA = null;
                        break;
                    }
                    if (((ekv.b) cVar.c.get(i2)).d == bVar.d) {
                        Object obj = bVar.a;
                        Object obj2 = cVar.b;
                        int i3 = t2.d;
                        bVarA = bVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                }
                if (bVarA == null) {
                    return null;
                }
                bVar2 = bVarA;
            }
            return Pair.create(Integer.valueOf(i + cVar.d), bVar2);
        }

        @Override // defpackage.mkv
        public final void n(int i, ekv.b bVar, final pjv pjvVar) {
            final Pair<Integer, ekv.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: pkv
                    @Override // java.lang.Runnable
                    public final void run() {
                        xz xzVar = i.this.h;
                        Pair pair = pairA;
                        int iIntValue = ((Integer) pair.first).intValue();
                        ekv.b bVar2 = (ekv.b) pair.second;
                        bVar2.getClass();
                        xzVar.n(iIntValue, bVar2, pjvVar);
                    }
                });
            }
        }

        @Override // defpackage.mkv
        public final void v(int i, ekv.b bVar, final tws twsVar, final pjv pjvVar, final IOException iOException, final boolean z) {
            final Pair<Integer, ekv.b> pairA = a(i, bVar);
            if (pairA != null) {
                i.this.i.i(new Runnable() { // from class: ukv
                    @Override // java.lang.Runnable
                    public final void run() {
                        xz xzVar = i.this.h;
                        Pair pair = pairA;
                        xzVar.v(((Integer) pair.first).intValue(), (ekv.b) pair.second, twsVar, pjvVar, iOException, z);
                    }
                });
            }
        }
    }

    public static final class b {
        public final ekv a;
        public final okv b;
        public final a c;

        public b(ekv ekvVar, okv okvVar, a aVar) {
            this.a = ekvVar;
            this.b = okvVar;
            this.c = aVar;
        }
    }

    public static final class c implements nkv {
        public final ztu a;
        public int d;
        public boolean e;
        public final ArrayList c = new ArrayList();
        public final Object b = new Object();

        public c(ekv ekvVar, boolean z) {
            this.a = new ztu(ekvVar, z);
        }

        @Override // defpackage.nkv
        public final Object a() {
            return this.b;
        }

        @Override // defpackage.nkv
        public final qxf0 b() {
            return this.a.o;
        }
    }

    public i(e eVar, xz xzVar, cdl cdlVar, sp10 sp10Var) {
        this.a = sp10Var;
        this.e = eVar;
        this.h = xzVar;
        this.i = cdlVar;
    }

    public final qxf0 a(int i, ArrayList arrayList, tb90 tb90Var) {
        if (!arrayList.isEmpty()) {
            this.j = tb90Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                c cVar = (c) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    c cVar2 = (c) arrayList2.get(i2 - 1);
                    cVar.d = cVar2.a.o.b.o() + cVar2.d;
                    cVar.e = false;
                    cVar.c.clear();
                } else {
                    cVar.d = 0;
                    cVar.e = false;
                    cVar.c.clear();
                }
                int iO = cVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((c) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    e(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.a.k(bVar.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final qxf0 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return qxf0.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            c cVar = (c) arrayList.get(i);
            cVar.d = iO;
            iO += cVar.a.o.b.o();
        }
        return new br10(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.a.k(bVar.b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVarRemove = this.f.remove(cVar);
            bVarRemove.getClass();
            a aVar = bVarRemove.c;
            ekv ekvVar = bVarRemove.a;
            ekvVar.f(bVarRemove.b);
            ekvVar.b(aVar);
            ekvVar.d(aVar);
            this.g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ekv$c, okv] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(c cVar) {
        ztu ztuVar = cVar.a;
        ?? r1 = new ekv.c() { // from class: okv
            @Override // ekv.c
            public final void a(h32 h32Var, qxf0 qxf0Var) {
                cdl cdlVar = this.a.e.v;
                cdlVar.l(2);
                cdlVar.k(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(ztuVar, r1, aVar));
        String str = jrh0.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        ztuVar.a(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        ztuVar.i(new Handler(looperMyLooper2, null), aVar);
        ztuVar.j(r1, this.l, this.a);
    }

    public final void f(zjv zjvVar) {
        IdentityHashMap<zjv, c> identityHashMap = this.c;
        c cVarRemove = identityHashMap.remove(zjvVar);
        cVarRemove.getClass();
        cVarRemove.a.o(zjvVar);
        cVarRemove.c.remove(((ytu) zjvVar).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            c cVar = (c) arrayList.remove(i3);
            this.d.remove(cVar.b);
            int i4 = -cVar.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((c) arrayList.get(i5)).d += i4;
            }
            cVar.e = true;
            if (this.k) {
                d(cVar);
            }
        }
    }
}
