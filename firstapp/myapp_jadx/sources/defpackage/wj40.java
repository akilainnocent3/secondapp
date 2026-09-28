package defpackage;

import android.util.Log;
import androidx.compose.runtime.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wj40 extends mma {
    public static final wwd0 y = xwd0.a(qg00.e);
    public static final AtomicReference<Boolean> z = new AtomicReference<>(Boolean.FALSE);
    public final ta5 a;
    public final Object b;
    public c9p c;
    public Throwable d;
    public final ArrayList e;
    public List<? extends t2b> f;
    public stw<Object> g;
    public final duw<t2b> h;
    public final ArrayList i;
    public final ArrayList j;
    public final rtw<Object, Object> k;
    public final zkx l;
    public final rtw<z6w, y6w> m;
    public final rtw<Object, Object> n;
    public ArrayList o;
    public LinkedHashSet p;
    public bc6 q;
    public a r;
    public boolean s;
    public final wwd0 t;
    public final t6a0<stw<e>> u;
    public final e9p v;
    public final CoroutineContext w;
    public final b x;

    public static final class a {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }
    }

    public final class b {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final /* synthetic */ c[] i;

        static {
            c cVar = new c("ShutDown", 0);
            a = cVar;
            c cVar2 = new c("ShuttingDown", 1);
            b = cVar2;
            c cVar3 = new c("Inactive", 2);
            c = cVar3;
            c cVar4 = new c("InactivePendingWork", 3);
            d = cVar4;
            c cVar5 = new c("Idle", 4);
            e = cVar5;
            c cVar6 = new c("PendingWork", 5);
            f = cVar6;
            i = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) i.clone();
        }
    }

    public wj40(CoroutineContext coroutineContext) {
        ta5 ta5Var = new ta5(new kn00(this, 1));
        this.a = ta5Var;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new stw<>((Object) null);
        this.h = new duw<>(new t2b[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = tlw.b();
        this.l = new zkx();
        this.m = fz60.b();
        this.n = tlw.b();
        this.t = xwd0.a(c.c);
        this.u = new t6a0<>();
        e9p e9pVar = new e9p((c9p) coroutineContext.get(c9p.b.a));
        e9pVar.invokeOnCompletion(new Function1() { // from class: tj40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final wj40 wj40Var = this.a;
                final Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (wj40Var.b) {
                    try {
                        c9p c9pVar = wj40Var.c;
                        if (c9pVar != null) {
                            wwd0 wwd0Var = wj40Var.t;
                            wj40.c cVar = wj40.c.b;
                            wwd0Var.getClass();
                            wwd0Var.k(null, cVar);
                            c9pVar.cancel(cancellationException);
                            wj40Var.q = null;
                            c9pVar.invokeOnCompletion(new Function1() { // from class: uj40
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    wj40 wj40Var2 = wj40Var;
                                    Throwable th2 = th;
                                    Throwable th3 = (Throwable) obj2;
                                    synchronized (wj40Var2.b) {
                                        if (th2 == null) {
                                            th2 = null;
                                        } else if (th3 != null) {
                                            try {
                                                if (th3 instanceof CancellationException) {
                                                    th3 = null;
                                                }
                                                if (th3 != null) {
                                                    rtg.a(th2, th3);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        wj40Var2.d = th2;
                                        wwd0 wwd0Var2 = wj40Var2.t;
                                        wj40.c cVar2 = wj40.c.a;
                                        wwd0Var2.getClass();
                                        wwd0Var2.k(null, cVar2);
                                    }
                                    return Unit.a;
                                }
                            });
                        } else {
                            wj40Var.d = cancellationException;
                            wwd0 wwd0Var2 = wj40Var.t;
                            wj40.c cVar2 = wj40.c.a;
                            wwd0Var2.getClass();
                            wwd0Var2.k(null, cVar2);
                            Unit unit = Unit.a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.a;
            }
        });
        this.v = e9pVar;
        this.w = coroutineContext.plus(ta5Var).plus(e9pVar);
        this.x = new b();
    }

    public static final void E(ArrayList arrayList, wj40 wj40Var, t2b t2bVar) {
        arrayList.clear();
        synchronized (wj40Var.b) {
            try {
                Iterator it = wj40Var.j.iterator();
                while (it.hasNext()) {
                    z6w z6wVar = (z6w) it.next();
                    if (z6wVar.c.equals(t2bVar)) {
                        arrayList.add(z6wVar);
                        it.remove();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void w(wtw wtwVar) {
        try {
            if (wtwVar.w() instanceof e5a0.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            wtwVar.c();
        } catch (Throwable th) {
            wtwVar.c();
            throw th;
        }
    }

    public static final void y(wj40 wj40Var, z6w z6wVar, z6w z6wVar2) {
        List<z6w> list = z6wVar2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                z6w z6wVar3 = list.get(i);
                zkx zkxVar = wj40Var.l;
                w6w<Object> w6wVar = z6wVar3.a;
                tlw.a(zkxVar.a, w6wVar, new blx(z6wVar3, z6wVar));
                tlw.a(zkxVar.b, z6wVar, w6wVar);
                y(wj40Var, z6wVar, z6wVar3);
            }
        }
    }

    public final boolean A() {
        return !this.s && (this.a.d.get() & 134217727) > 0;
    }

    public final boolean B() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.g.c() || this.h.c != 0 || A();
        }
        return z2;
    }

    public final List<t2b> C() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.e;
        List<t2b> arrayList2 = arrayList.isEmpty() ? m2g.a : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    public final void D(t2b t2bVar) {
        synchronized (this.b) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((z6w) arrayList.get(i)).c.equals(t2bVar)) {
                    Unit unit = Unit.a;
                    ArrayList arrayList2 = new ArrayList();
                    E(arrayList2, this, t2bVar);
                    while (!arrayList2.isEmpty()) {
                        F(arrayList2, null);
                        E(arrayList2, this, t2bVar);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<t2b> F(List<z6w> list, stw<Object> stwVar) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z6w z6wVar = list.get(i);
            t2b t2bVar = z6wVar.c;
            Object arrayList2 = map.get(t2bVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(t2bVar, arrayList2);
            }
            ((ArrayList) arrayList2).add(z6wVar);
        }
        for (Map.Entry entry : map.entrySet()) {
            t2b t2bVar2 = (t2b) entry.getKey();
            List list2 = (List) entry.getValue();
            if (t2bVar2.p()) {
                androidx.compose.runtime.c.b("Check failed");
            }
            c5a0.a aVar = c5a0.e;
            wer werVar = new wer(t2bVar2, 2);
            sj40 sj40Var = new sj40(t2bVar2, stwVar);
            aVar.getClass();
            wtw wtwVarG = c5a0.a.g(werVar, sj40Var);
            try {
                c5a0 c5a0VarJ = wtwVarG.j();
                try {
                    synchronized (this.b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                z6w z6wVar2 = (z6w) list2.get(i2);
                                Object objC = tlw.c(this.k, z6wVar2.a);
                                z6w z6wVar3 = (z6w) objC;
                                if (z6wVar3 != null) {
                                    this.l.a(z6wVar3);
                                }
                                arrayList.add(new Pair(z6wVar2, objC));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.b == 0) {
                                    if (this.l.a.a(((z6w) pair.a).a)) {
                                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i4 = 0;
                                        while (i4 < size4) {
                                            Object obj = arrayList.get(i4);
                                            i4++;
                                            Pair pair2 = (Pair) obj;
                                            if (pair2.b == 0) {
                                                zkx zkxVar = this.l;
                                                w6w<Object> w6wVar = ((z6w) pair2.a).a;
                                                rtw<Object, Object> rtwVar = zkxVar.a;
                                                blx blxVar = (blx) tlw.c(rtwVar, w6wVar);
                                                if (rtwVar.e()) {
                                                    zkxVar.b.g();
                                                }
                                                if (blxVar != null) {
                                                    z6w z6wVar4 = blxVar.a;
                                                    tlw.a(this.n, blxVar.b, z6wVar4);
                                                    pair2 = new Pair(pair2.a, z6wVar4);
                                                }
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((Pair) arrayList.get(i5)).b != 0) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((Pair) arrayList.get(i6)).b == 0) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair pair3 = (Pair) arrayList.get(i7);
                                        z6w z6wVar5 = pair3.b == 0 ? (z6w) pair3.a : null;
                                        if (z6wVar5 != null) {
                                            arrayList4.add(z6wVar5);
                                        }
                                    }
                                    synchronized (this.b) {
                                        p48.w(arrayList4, this.j);
                                        Unit unit = Unit.a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((Pair) obj2).b != 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    t2bVar2.m(arrayList);
                    Unit unit2 = Unit.a;
                    c5a0.q(c5a0VarJ);
                    w(wtwVarG);
                } catch (Throwable th2) {
                    c5a0.q(c5a0VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(wtwVarG);
                throw th3;
            }
        }
        return CollectionsKt.A0(map.keySet());
    }

    public final t2b G(t2b t2bVar, stw<Object> stwVar) {
        if (t2bVar.p() || t2bVar.isDisposed()) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.p;
        if (linkedHashSet != null && linkedHashSet.contains(t2bVar)) {
            return null;
        }
        c5a0.a aVar = c5a0.e;
        wer werVar = new wer(t2bVar, 2);
        sj40 sj40Var = new sj40(t2bVar, stwVar);
        aVar.getClass();
        wtw wtwVarG = c5a0.a.g(werVar, sj40Var);
        try {
            c5a0 c5a0VarJ = wtwVarG.j();
            if (stwVar != null) {
                try {
                    if (stwVar.c()) {
                        t2bVar.i(new vj40(t2bVar, stwVar));
                    }
                } catch (Throwable th) {
                    c5a0.q(c5a0VarJ);
                    throw th;
                }
            }
            boolean zJ = t2bVar.j();
            c5a0.q(c5a0VarJ);
            w(wtwVarG);
            if (zJ) {
                return t2bVar;
            }
            return null;
        } catch (Throwable th2) {
            w(wtwVarG);
            throw th2;
        }
    }

    public final void H(Throwable th, t2b t2bVar) throws Throwable {
        if (!z.get().booleanValue() || (th instanceof uja)) {
            synchronized (this.b) {
                a aVar = this.r;
                if (aVar != null) {
                    throw aVar.a;
                }
                this.r = new a(th);
                Unit unit = Unit.a;
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.g();
                this.g = new stw<>((Object) null);
                this.j.clear();
                this.k.g();
                this.m.g();
                this.r = new a(th);
                if (t2bVar != null) {
                    J(t2bVar);
                }
                z();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean I() {
        synchronized (this.b) {
            boolean z2 = true;
            if (this.g.b()) {
                if (this.h.c == 0 && !A() && !this.k.f()) {
                    z2 = false;
                }
                return z2;
            }
            List<t2b> listC = C();
            iz60 iz60Var = new iz60(this.g);
            this.g = new stw<>((Object) null);
            try {
                int size = listC.size();
                for (int i = 0; i < size; i++) {
                    listC.get(i).k(iz60Var);
                    if (((c) this.t.getValue()).compareTo(c.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.b) {
                    if (z() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.h.c == 0 && !A() && !this.k.f()) {
                        z2 = false;
                    }
                }
                return z2;
            } catch (Throwable th) {
                synchronized (this.b) {
                    stw<Object> stwVar = this.g;
                    stwVar.getClass();
                    Iterator<T> it = iz60Var.iterator();
                    while (it.hasNext()) {
                        stwVar.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void J(t2b t2bVar) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(t2bVar)) {
            arrayList.add(t2bVar);
        }
        if (this.e.remove(t2bVar)) {
            this.f = null;
        }
    }

    @Override // defpackage.mma
    public final void a(t2b t2bVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) throws Throwable {
        c cVar;
        boolean zContains;
        boolean zP = t2bVar.p();
        synchronized (this.b) {
            c cVar2 = (c) this.t.getValue();
            cVar = c.b;
            zContains = cVar2.compareTo(cVar) > 0 ? true ^ C().contains(t2bVar) : true;
        }
        try {
            c5a0.a aVar = c5a0.e;
            wer werVar = new wer(t2bVar, 2);
            sj40 sj40Var = new sj40(t2bVar, null);
            aVar.getClass();
            wtw wtwVarG = c5a0.a.g(werVar, sj40Var);
            try {
                c5a0 c5a0VarJ = wtwVarG.j();
                try {
                    t2bVar.b(function2);
                    Unit unit = Unit.a;
                    c5a0.q(c5a0VarJ);
                    w(wtwVarG);
                    synchronized (this.b) {
                        if (((c) this.t.getValue()).compareTo(cVar) > 0 && !C().contains(t2bVar)) {
                            this.e.add(t2bVar);
                            this.f = null;
                        }
                    }
                    if (!zP) {
                        n5a0.g().m();
                    }
                    try {
                        D(t2bVar);
                        try {
                            t2bVar.o();
                            t2bVar.d();
                            if (zP) {
                                return;
                            }
                            n5a0.g().m();
                        } catch (Throwable th) {
                            H(th, null);
                        }
                    } catch (Throwable th2) {
                        H(th2, t2bVar);
                    }
                } catch (Throwable th3) {
                    c5a0.q(c5a0VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(wtwVarG);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.b) {
                    Unit unit2 = Unit.a;
                }
            }
            H(th5, t2bVar);
        }
    }

    @Override // defpackage.mma
    public final gz60<e> b(t2b t2bVar, atr atrVar, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
        t6a0<stw<e>> t6a0Var = this.u;
        try {
            atr atrVarT = t2bVar.t(atrVar);
            try {
                a(t2bVar, function2);
                stw<Object> stwVarA = t6a0Var.a();
                if (stwVarA == null) {
                    stwVarA = hz60.a;
                    stwVarA.getClass();
                }
                t2bVar.t(atrVarT);
                t6a0Var.b(null);
                return stwVarA;
            } catch (Throwable th) {
                t2bVar.t(atrVarT);
                throw th;
            }
        } catch (Throwable th2) {
            t6a0Var.b(null);
            throw th2;
        }
    }

    @Override // defpackage.mma
    public final void c(z6w z6wVar) {
        zb6<Unit> zb6VarZ;
        synchronized (this.b) {
            try {
                tlw.a(this.k, z6wVar.a, z6wVar);
                if (z6wVar.h != null) {
                    y(this, z6wVar, z6wVar);
                }
                zb6VarZ = z();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zb6VarZ != null) {
            zi50.a aVar = zi50.b;
            ((bc6) zb6VarZ).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.mma
    public final boolean e() {
        return z.get().booleanValue();
    }

    @Override // defpackage.mma
    public final boolean f() {
        return false;
    }

    @Override // defpackage.mma
    public final boolean g() {
        return false;
    }

    @Override // defpackage.mma
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.mma
    public final lma i() {
        return null;
    }

    @Override // defpackage.mma
    public final CoroutineContext k() {
        return this.w;
    }

    @Override // defpackage.mma
    public final void l(t2b t2bVar) {
        zb6<Unit> zb6VarZ;
        synchronized (this.b) {
            if (this.h.h(t2bVar)) {
                zb6VarZ = null;
            } else {
                this.h.b(t2bVar);
                zb6VarZ = z();
            }
        }
        if (zb6VarZ != null) {
            zi50.a aVar = zi50.b;
            ((bc6) zb6VarZ).resumeWith(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[Catch: all -> 0x007e, LOOP:0: B:16:0x0048->B:28:0x0088, LOOP_END, TryCatch #0 {all -> 0x007e, blocks: (B:4:0x0009, B:6:0x0016, B:11:0x002f, B:13:0x0035, B:16:0x0048, B:18:0x0058, B:20:0x0064, B:22:0x006d, B:25:0x0080, B:28:0x0088, B:29:0x008b, B:7:0x001c, B:9:0x0020, B:10:0x0023), top: B:34:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008b A[EDGE_INSN: B:37:0x008b->B:29:0x008b BREAK  A[LOOP:0: B:16:0x0048->B:28:0x0088], SYNTHETIC] */
    @Override // defpackage.mma
    public final void m(z6w z6wVar, y6w y6wVar, fv0<?> fv0Var) {
        ccy ccyVar;
        synchronized (this.b) {
            try {
                this.m.m(z6wVar, y6wVar);
                Object objD = this.n.d(z6wVar);
                if (objD == null) {
                    ccyVar = dcy.b;
                    ccyVar.getClass();
                } else if (objD instanceof etw) {
                    ccyVar = (ccy) objD;
                } else {
                    Object[] objArr = dcy.a;
                    etw etwVar = new etw(1);
                    etwVar.g(objD);
                    ccyVar = etwVar;
                }
                if (ccyVar.e()) {
                    rtw rtwVarB = y6wVar.b(fv0Var, ccyVar);
                    Object[] objArr2 = rtwVarB.b;
                    Object[] objArr3 = rtwVarB.c;
                    long[] jArr = rtwVarB.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj = objArr2[i4];
                                        this.m.m((z6w) obj, (y6w) objArr3[i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i != length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mma
    public final y6w n(z6w z6wVar) {
        y6w y6wVarK;
        synchronized (this.b) {
            y6wVarK = this.m.k(z6wVar);
        }
        return y6wVarK;
    }

    @Override // defpackage.mma
    public final gz60<e> o(t2b t2bVar, atr atrVar, gz60<e> gz60Var) {
        t6a0<stw<e>> t6a0Var = this.u;
        try {
            I();
            t2bVar.k(new iz60(gz60Var));
            atr atrVarT = t2bVar.t(atrVar);
            try {
                t2b t2bVarG = G(t2bVar, null);
                if (t2bVarG != null) {
                    D(t2bVar);
                    t2bVarG.o();
                    t2bVarG.d();
                }
                stw<Object> stwVarA = t6a0Var.a();
                if (stwVarA == null) {
                    stwVarA = hz60.a;
                    stwVarA.getClass();
                }
                t2bVar.t(atrVarT);
                t6a0Var.b(null);
                return stwVarA;
            } catch (Throwable th) {
                t2bVar.t(atrVarT);
                throw th;
            }
        } catch (Throwable th2) {
            t6a0Var.b(null);
            throw th2;
        }
    }

    @Override // defpackage.mma
    public final void r(e eVar) {
        t6a0<stw<e>> t6a0Var = this.u;
        stw<e> stwVarA = t6a0Var.a();
        if (stwVarA == null) {
            stwVarA = hz60.a();
            t6a0Var.b(stwVarA);
        }
        stwVarA.d(eVar);
    }

    @Override // defpackage.mma
    public final void s(uma umaVar) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(umaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mma
    public final void v(uma umaVar) {
        synchronized (this.b) {
            if (this.e.remove(umaVar)) {
                this.f = null;
            }
            this.h.j(umaVar);
            this.i.remove(umaVar);
            Unit unit = Unit.a;
        }
    }

    public final void x() {
        synchronized (this.b) {
            try {
                if (((c) this.t.getValue()).compareTo(c.e) >= 0) {
                    wwd0 wwd0Var = this.t;
                    c cVar = c.b;
                    wwd0Var.getClass();
                    wwd0Var.k(null, cVar);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v.cancel((CancellationException) null);
    }

    public final zb6<Unit> z() {
        c cVar;
        wwd0 wwd0Var = this.t;
        int iCompareTo = ((c) wwd0Var.getValue()).compareTo(c.b);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        duw<t2b> duwVar = this.h;
        if (iCompareTo > 0) {
            if (this.r != null) {
                cVar = c.c;
            } else if (this.c == null) {
                this.g = new stw<>((Object) null);
                duwVar.g();
                cVar = A() ? c.d : c.c;
            } else {
                cVar = (duwVar.c == 0 && !this.g.c() && arrayList2.isEmpty() && arrayList.isEmpty() && !A() && !this.k.f()) ? c.e : c.f;
            }
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            if (cVar != c.f) {
                return null;
            }
            bc6 bc6Var = this.q;
            this.q = null;
            return bc6Var;
        }
        for (t2b t2bVar : C()) {
        }
        this.e.clear();
        this.f = m2g.a;
        this.g = new stw<>((Object) null);
        duwVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.o = null;
        bc6 bc6Var2 = this.q;
        if (bc6Var2 != null) {
            bc6Var2.cancel(null);
        }
        this.q = null;
        this.r = null;
        return null;
    }

    @Override // defpackage.mma
    public final void p(Set<oma> set) {
    }
}
