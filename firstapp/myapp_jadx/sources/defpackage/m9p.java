package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
@fae
public class m9p implements c9p, ck7, isz {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public static final class a<T> extends bc6<T> {
        public final m9p w;

        public a(v1b<? super T> v1bVar, m9p m9pVar) {
            super(1, v1bVar);
            this.w = m9pVar;
        }

        @Override // defpackage.bc6
        public final Throwable n(m9p m9pVar) {
            Throwable thC;
            Object objK = this.w.K();
            if (!(objK instanceof c) || (thC = ((c) objK).c()) == null) {
                return objK instanceof dn8 ? ((dn8) objK).a : m9pVar.getCancellationException();
            }
            return thC;
        }

        @Override // defpackage.bc6
        public final String z() {
            return "AwaitContinuation";
        }
    }

    public static final class b extends j9p {
        public final m9p e;
        public final c f;
        public final ak7 i;
        public final Object v;

        public b(m9p m9pVar, c cVar, ak7 ak7Var, Object obj) {
            this.e = m9pVar;
            this.f = cVar;
            this.i = ak7Var;
            this.v = obj;
        }

        @Override // defpackage.j9p
        public final boolean k() {
            return false;
        }

        @Override // defpackage.j9p
        public final void l(Throwable th) {
            int i = m9p.c;
            m9p m9pVar = this.e;
            m9pVar.getClass();
            ak7 ak7Var = this.i;
            ak7 ak7VarU = m9p.U(ak7Var);
            c cVar = this.f;
            Object obj = this.v;
            if (ak7VarU == null || !m9pVar.k0(cVar, ak7VarU, obj)) {
                cVar.a.c(new qgs(2), 2);
                ak7 ak7VarU2 = m9p.U(ak7Var);
                if (ak7VarU2 == null || !m9pVar.k0(cVar, ak7VarU2, obj)) {
                    m9pVar.n(m9pVar.A(cVar, obj));
                }
            }
        }
    }

    public static final class c implements uen {
        public static final /* synthetic */ long b;
        public static final /* synthetic */ long c;
        public static final /* synthetic */ long d;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final exx a;

        static {
            Unsafe unsafe = s0o.a;
            c = unsafe.objectFieldOffset(c.class.getDeclaredField("_isCompleting$volatile"));
            d = unsafe.objectFieldOffset(c.class.getDeclaredField("_rootCause$volatile"));
            b = unsafe.objectFieldOffset(c.class.getDeclaredField("_exceptionsHolder$volatile"));
        }

        public c(exx exxVar, Throwable th) {
            this.a = exxVar;
            this._rootCause$volatile = th;
        }

        @Override // defpackage.uen
        public final exx a() {
            return this.a;
        }

        public final void b(Throwable th) {
            Throwable thC = c();
            if (thC == null) {
                s0o.a.putObjectVolatile(this, d, th);
                return;
            }
            if (th == thC) {
                return;
            }
            Unsafe unsafe = s0o.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, th);
                return;
            }
            if (!(objectVolatile instanceof Throwable)) {
                if (objectVolatile instanceof ArrayList) {
                    ((ArrayList) objectVolatile).add(th);
                    return;
                } else {
                    ogf.a(objectVolatile, "State is ");
                    return;
                }
            }
            if (th == objectVolatile) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objectVolatile);
            arrayList.add(th);
            unsafe.putObjectVolatile(this, j, arrayList);
        }

        public final Throwable c() {
            return (Throwable) s0o.a.getObjectVolatile(this, d);
        }

        public final boolean d() {
            return c() != null;
        }

        public final boolean e() {
            return s0o.a.getIntVolatile(this, c) == 1;
        }

        public final ArrayList f(Throwable th) {
            ArrayList arrayList;
            Unsafe unsafe = s0o.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                arrayList = new ArrayList(4);
            } else if (objectVolatile instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objectVolatile);
                arrayList = arrayList2;
            } else {
                if (!(objectVolatile instanceof ArrayList)) {
                    ogf.a(objectVolatile, "State is ");
                    return null;
                }
                arrayList = (ArrayList) objectVolatile;
            }
            Throwable thC = c();
            if (thC != null) {
                arrayList.add(0, thC);
            }
            if (th != null && !th.equals(thC)) {
                arrayList.add(th);
            }
            unsafe.putObjectVolatile(this, j, p9p.e);
            return arrayList;
        }

        @Override // defpackage.uen
        public final boolean isActive() {
            return c() == null;
        }

        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + s0o.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
        }
    }

    public final class d extends j9p {
        public final a780<?> e;

        public d(a780<?> a780Var) {
            this.e = a780Var;
        }

        @Override // defpackage.j9p
        public final boolean k() {
            return false;
        }

        @Override // defpackage.j9p
        public final void l(Throwable th) {
            m9p m9pVar = m9p.this;
            Object objK = m9pVar.K();
            if (!(objK instanceof dn8)) {
                objK = p9p.a(objK);
            }
            this.e.d(m9pVar, objK);
        }
    }

    public final class e extends j9p {
        public final a780<?> e;

        public e(a780<?> a780Var) {
            this.e = a780Var;
        }

        @Override // defpackage.j9p
        public final boolean k() {
            return false;
        }

        @Override // defpackage.j9p
        public final void l(Throwable th) {
            this.e.d(m9p.this, Unit.a);
        }
    }

    @c0d(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, WebSocketProtocol.CLOSE_NO_STATUS_CODE}, m = "invokeSuspend")
    public static final class f extends ji50 implements Function2<wc80<? super c9p>, v1b<? super Unit>, Object> {
        public tet b;
        public ak7 c;
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ m9p f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v1b v1bVar, m9p m9pVar) {
            super(2, v1bVar);
            this.f = m9pVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = new f(v1bVar, this.f);
            fVar.e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wc80<? super c9p> wc80Var, v1b<? super Unit> v1bVar) {
            return ((f) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005d  */
        /* JADX WARN: Code duplicated, block: B:23:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:25:0x0073). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L18
                ak7 r1 = r5.c
                tet r3 = r5.b
                java.lang.Object r4 = r5.e
                wc80 r4 = (defpackage.wc80) r4
                defpackage.uj50.b(r6)
                goto L73
            L18:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L1f:
                defpackage.uj50.b(r6)
                goto L78
            L23:
                defpackage.uj50.b(r6)
                java.lang.Object r6 = r5.e
                wc80 r6 = (defpackage.wc80) r6
                m9p r1 = r5.f
                java.lang.Object r1 = r1.K()
                boolean r4 = r1 instanceof defpackage.ak7
                if (r4 == 0) goto L3e
                ak7 r1 = (defpackage.ak7) r1
                ck7 r1 = r1.e
                r5.d = r3
                r6.b(r5, r1)
                return r0
            L3e:
                boolean r3 = r1 instanceof defpackage.uen
                if (r3 == 0) goto L78
                uen r1 = (defpackage.uen) r1
                exx r1 = r1.a()
                if (r1 == 0) goto L78
                java.lang.Object r3 = r1.f()
                r3.getClass()
                uet r3 = (defpackage.uet) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L57:
                boolean r6 = r1.equals(r3)
                if (r6 != 0) goto L78
                boolean r6 = r1 instanceof defpackage.ak7
                if (r6 == 0) goto L73
                ak7 r1 = (defpackage.ak7) r1
                ck7 r6 = r1.e
                r5.e = r4
                r5.b = r3
                r5.c = r1
                r5.d = r2
                r4.b(r5, r6)
                y5b r5 = defpackage.y5b.a
                return r0
            L73:
                uet r1 = r1.g()
                goto L57
            L78:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: m9p.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ class g extends saj implements gaj<m9p, a780<?>, Object, Unit> {
        public static final g a = new g(3, m9p.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // defpackage.gaj
        public final Unit invoke(m9p m9pVar, a780<?> a780Var, Object obj) {
            Object objK;
            m9p m9pVar2 = m9pVar;
            a780<?> a780Var2 = a780Var;
            int i = m9p.c;
            do {
                objK = m9pVar2.K();
                if (!(objK instanceof uen)) {
                    a780Var2.c(Unit.a);
                }
                return Unit.a;
            } while (m9pVar2.g0(objK) < 0);
            a780Var2.e(i9p.g(m9pVar2, m9pVar2.new e(a780Var2)));
            return Unit.a;
        }
    }

    static {
        Unsafe unsafe = s0o.a;
        b = unsafe.objectFieldOffset(m9p.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(m9p.class.getDeclaredField("_parentHandle$volatile"));
    }

    public m9p(boolean z) {
        this._state$volatile = z ? p9p.g : p9p.f;
    }

    public static ak7 U(uet uetVar) {
        while (uetVar.i()) {
            uetVar = uetVar.h();
        }
        while (true) {
            uetVar = uetVar.g();
            if (!uetVar.i()) {
                if (uetVar instanceof ak7) {
                    return (ak7) uetVar;
                }
                if (uetVar instanceof exx) {
                    return null;
                }
            }
        }
    }

    public static String h0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof uen) {
                return ((uen) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof dn8 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.d()) {
            return "Cancelling";
        }
        return cVar.e() ? "Completing" : "Active";
    }

    public static CancellationException i0(m9p m9pVar, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new d9p(m9pVar.v(), th, m9pVar) : cancellationException;
    }

    public final Object A(c cVar, Object obj) throws Throwable {
        Throwable th;
        m9p m9pVar;
        c cVar2;
        dn8 dn8Var = obj instanceof dn8 ? (dn8) obj : null;
        Throwable th2 = dn8Var != null ? dn8Var.a : null;
        synchronized (cVar) {
            try {
                cVar.d();
                ArrayList arrayListF = cVar.f(th2);
                Throwable thC = C(cVar, arrayListF);
                if (thC != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            int size = arrayListF.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListF.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thC && th3 != thC && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    rtg.a(thC, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thC != null && thC != th2) {
                    obj = new dn8(thC, false);
                }
                if (thC != null && (u(thC) || L(thC))) {
                    obj.getClass();
                    s0o.a.compareAndSwapInt((dn8) obj, dn8.b, 0, 1);
                }
                X(obj);
                Object venVar = obj instanceof uen ? new ven((uen) obj) : obj;
                while (true) {
                    Unsafe unsafe = s0o.a;
                    long j = b;
                    m9pVar = this;
                    cVar2 = cVar;
                    if (unsafe.compareAndSwapObject(m9pVar, j, cVar2, venVar) || unsafe.getObjectVolatile(m9pVar, j) != cVar2) {
                        break;
                    }
                    this = m9pVar;
                    cVar = cVar2;
                }
                m9pVar.y(cVar2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Object B() throws Throwable {
        Object objK = K();
        if (objK instanceof uen) {
            ib5.a("This job has not completed yet");
            return null;
        }
        if (objK instanceof dn8) {
            throw ((dn8) objK).a;
        }
        return p9p.a(objK);
    }

    public final Throwable C(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new d9p(v(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof txf0) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof txf0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return this instanceof dm8;
    }

    public boolean G(Object obj) {
        return R(obj);
    }

    public final exx I(uen uenVar) {
        exx exxVarA = uenVar.a();
        if (exxVarA != null) {
            return exxVarA;
        }
        if (uenVar instanceof o1g) {
            return new exx();
        }
        if (uenVar instanceof j9p) {
            f0((j9p) uenVar);
            return null;
        }
        ogf.a(uenVar, "State should have list: ");
        return null;
    }

    @Override // defpackage.isz
    public final CancellationException J() {
        Throwable thC;
        Object objK = K();
        if (objK instanceof c) {
            thC = ((c) objK).c();
        } else if (objK instanceof dn8) {
            thC = ((dn8) objK).a;
        } else {
            if (objK instanceof uen) {
                ogf.a(objK, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new d9p("Parent job is ".concat(h0(objK)), thC, this) : cancellationException;
    }

    public final Object K() {
        return s0o.a.getObjectVolatile(this, b);
    }

    public boolean L(Throwable th) {
        return false;
    }

    public final void N(c9p c9pVar) {
        long j = a;
        lxx lxxVar = lxx.a;
        if (c9pVar == null) {
            s0o.a.putObjectVolatile(this, j, lxxVar);
            return;
        }
        c9pVar.start();
        zj7 zj7VarAttachChild = c9pVar.attachChild(this);
        Unsafe unsafe = s0o.a;
        unsafe.putObjectVolatile(this, j, zj7VarAttachChild);
        if (isCompleted()) {
            zj7VarAttachChild.dispose();
            unsafe.putObjectVolatile(this, j, lxxVar);
        }
    }

    public final wse O(boolean z, j9p j9pVar) {
        m9p m9pVar;
        j9p j9pVar2;
        boolean zC;
        j9pVar.d = this;
        loop0: while (true) {
            Object objK = this.K();
            if (!(objK instanceof o1g)) {
                m9pVar = this;
                j9pVar2 = j9pVar;
                boolean z2 = objK instanceof uen;
                lxx lxxVar = lxx.a;
                if (z2) {
                    uen uenVar = (uen) objK;
                    exx exxVarA = uenVar.a();
                    if (exxVarA == null) {
                        m9pVar.f0((j9p) objK);
                    } else {
                        if (j9pVar2.k()) {
                            c cVar = uenVar instanceof c ? (c) uenVar : null;
                            Throwable thC = cVar != null ? cVar.c() : null;
                            if (thC == null) {
                                zC = exxVarA.c(j9pVar2, 5);
                            } else if (z) {
                                j9pVar2.l(thC);
                                return lxxVar;
                            }
                        } else {
                            zC = exxVarA.c(j9pVar2, 1);
                        }
                        if (zC) {
                            break;
                        }
                    }
                    this = m9pVar;
                    j9pVar = j9pVar2;
                } else if (z) {
                    Object objK2 = m9pVar.K();
                    dn8 dn8Var = objK2 instanceof dn8 ? (dn8) objK2 : null;
                    j9pVar2.l(dn8Var != null ? dn8Var.a : null);
                }
                return lxxVar;
            }
            o1g o1gVar = (o1g) objK;
            if (o1gVar.a) {
                while (true) {
                    Unsafe unsafe = s0o.a;
                    long j = b;
                    m9pVar = this;
                    j9pVar2 = j9pVar;
                    if (unsafe.compareAndSwapObject(m9pVar, j, objK, j9pVar2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(m9pVar, j) != objK) {
                        break;
                    }
                    this = m9pVar;
                    j9pVar = j9pVar2;
                }
            } else {
                m9pVar = this;
                j9pVar2 = j9pVar;
                m9pVar.e0(o1gVar);
            }
            this = m9pVar;
            j9pVar = j9pVar2;
        }
        return j9pVar2;
    }

    public boolean Q() {
        return this instanceof xf4;
    }

    public final boolean R(Object obj) {
        Object objJ0;
        do {
            objJ0 = j0(K(), obj);
            if (objJ0 == p9p.a) {
                return false;
            }
            if (objJ0 == p9p.b) {
                return true;
            }
        } while (objJ0 == p9p.c);
        n(objJ0);
        return true;
    }

    public final Object S(Object obj) {
        Object objJ0;
        do {
            objJ0 = j0(K(), obj);
            if (objJ0 == p9p.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                dn8 dn8Var = obj instanceof dn8 ? (dn8) obj : null;
                throw new IllegalStateException(str, dn8Var != null ? dn8Var.a : null);
            }
        } while (objJ0 == p9p.c);
        return objJ0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void W(exx exxVar, Throwable th) {
        exxVar.c(new qgs(4), 4);
        Object objF = exxVar.f();
        objF.getClass();
        fn8 fn8Var = null;
        for (uet uetVarG = (uet) objF; !uetVarG.equals(exxVar); uetVarG = uetVarG.g()) {
            if ((uetVarG instanceof j9p) && ((j9p) uetVarG).k()) {
                try {
                    ((j9p) uetVarG).l(th);
                } catch (Throwable th2) {
                    if (fn8Var != null) {
                        rtg.a(fn8Var, th2);
                    } else {
                        fn8Var = new fn8("Exception in completion handler " + uetVarG + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (fn8Var != null) {
            M(fn8Var);
        }
        u(th);
    }

    @Override // defpackage.ck7
    public final void Z(m9p m9pVar) {
        r(m9pVar);
    }

    @Override // defpackage.c9p
    public final zj7 attachChild(ck7 ck7Var) {
        m9p m9pVar;
        ak7 ak7Var = new ak7(ck7Var);
        ak7Var.d = this;
        loop0: while (true) {
            Object objK = this.K();
            if (objK instanceof o1g) {
                o1g o1gVar = (o1g) objK;
                if (o1gVar.a) {
                    while (true) {
                        Unsafe unsafe = s0o.a;
                        long j = b;
                        m9pVar = this;
                        if (unsafe.compareAndSwapObject(m9pVar, j, objK, ak7Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(m9pVar, j) != objK) {
                            break;
                        }
                        this = m9pVar;
                    }
                } else {
                    m9pVar = this;
                    m9pVar.e0(o1gVar);
                }
                this = m9pVar;
            } else {
                m9pVar = this;
                boolean z = objK instanceof uen;
                lxx lxxVar = lxx.a;
                Throwable thC = null;
                if (!z) {
                    Object objK2 = m9pVar.K();
                    dn8 dn8Var = objK2 instanceof dn8 ? (dn8) objK2 : null;
                    ak7Var.l(dn8Var != null ? dn8Var.a : null);
                    return lxxVar;
                }
                exx exxVarA = ((uen) objK).a();
                if (exxVarA != null) {
                    if (exxVarA.c(ak7Var, 7)) {
                        break;
                    }
                    boolean zC = exxVarA.c(ak7Var, 3);
                    Object objK3 = m9pVar.K();
                    if (objK3 instanceof c) {
                        thC = ((c) objK3).c();
                    } else {
                        dn8 dn8Var2 = objK3 instanceof dn8 ? (dn8) objK3 : null;
                        if (dn8Var2 != null) {
                            thC = dn8Var2.a;
                        }
                    }
                    ak7Var.l(thC);
                    if (zC) {
                        break;
                    }
                    return lxxVar;
                }
                m9pVar.f0((j9p) objK);
                this = m9pVar;
            }
        }
        return ak7Var;
    }

    @Override // defpackage.c9p
    @fae
    public final /* synthetic */ boolean cancel(Throwable th) {
        t(th != null ? i0(this, th) : new d9p(v(), null, this));
        return true;
    }

    public final void e0(o1g o1gVar) {
        exx exxVar = new exx();
        Object penVar = o1gVar.a ? exxVar : new pen(exxVar);
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = b;
            m9p m9pVar = this;
            o1g o1gVar2 = o1gVar;
            if (unsafe.compareAndSwapObject(m9pVar, j, o1gVar2, penVar) || unsafe.getObjectVolatile(m9pVar, j) != o1gVar2) {
                return;
            }
            this = m9pVar;
            o1gVar = o1gVar2;
        }
    }

    public final void f0(j9p j9pVar) {
        j9p j9pVar2;
        m9p m9pVar;
        exx exxVar = new exx();
        Unsafe unsafe = s0o.a;
        unsafe.putObjectVolatile(exxVar, uet.b, j9pVar);
        long j = uet.a;
        unsafe.putObjectVolatile(exxVar, j, j9pVar);
        loop0: while (true) {
            if (j9pVar.f() != j9pVar) {
                j9pVar2 = j9pVar;
                break;
            }
            while (true) {
                Unsafe unsafe2 = s0o.a;
                j9pVar2 = j9pVar;
                if (unsafe2.compareAndSwapObject(j9pVar2, uet.a, j9pVar, exxVar)) {
                    exxVar.e(j9pVar2);
                    break loop0;
                }
                m9pVar = this;
                j9pVar = j9pVar2;
                if (unsafe2.getObjectVolatile(j9pVar2, j) != j9pVar2) {
                    break;
                } else {
                    this = m9pVar;
                }
            }
            this = m9pVar;
        }
        uet uetVarG = j9pVar2.g();
        while (true) {
            Unsafe unsafe3 = s0o.a;
            long j2 = b;
            m9p m9pVar2 = this;
            if (unsafe3.compareAndSwapObject(m9pVar2, j2, j9pVar2, uetVarG) || unsafe3.getObjectVolatile(m9pVar2, j2) != j9pVar2) {
                return;
            } else {
                this = m9pVar2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r, function2);
    }

    public final int g0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof o1g;
        long j = b;
        if (!z) {
            m9p m9pVar = this;
            Object obj2 = obj;
            if (!(obj2 instanceof pen)) {
                return 0;
            }
            exx exxVar = ((pen) obj2).a;
            do {
                m9p m9pVar2 = m9pVar;
                unsafe = s0o.a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(m9pVar2, b, obj3, exxVar);
                m9pVar = m9pVar2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    m9pVar.d0();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(m9pVar, j) == obj2);
            return -1;
        }
        if (((o1g) obj).a) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = s0o.a;
            m9p m9pVar3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(m9pVar3, b, obj4, p9p.g)) {
                m9pVar3.d0();
                return 1;
            }
            if (unsafe2.getObjectVolatile(m9pVar3, j) != obj4) {
                return -1;
            }
            this = m9pVar3;
            obj = obj4;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // defpackage.c9p
    public final CancellationException getCancellationException() {
        Object objK = K();
        if (!(objK instanceof c)) {
            if (!(objK instanceof uen)) {
                return objK instanceof dn8 ? i0(this, ((dn8) objK).a) : new d9p(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            ogf.a(this, "Job is still new or active: ");
            return null;
        }
        Throwable thC = ((c) objK).c();
        if (thC == null) {
            ogf.a(this, "Job is still new or active: ");
            return null;
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new d9p(strConcat, thC, this) : cancellationException;
    }

    @Override // defpackage.c9p
    public final Sequence<c9p> getChildren() {
        return new yc80(new f(null, this));
    }

    public Object getCompleted() {
        return B();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objK = K();
        if (objK instanceof uen) {
            ib5.a("This job has not completed yet");
            return null;
        }
        dn8 dn8Var = objK instanceof dn8 ? (dn8) objK : null;
        if (dn8Var != null) {
            return dn8Var.a;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.a<?> getKey() {
        return c9p.b.a;
    }

    @Override // defpackage.c9p
    public final s680 getOnJoin() {
        g gVar = g.a;
        gVar.getClass();
        y8h0.d(3, gVar);
        return new t680(this, gVar);
    }

    @Override // defpackage.c9p
    public final c9p getParent() {
        zj7 zj7Var = (zj7) s0o.a.getObjectVolatile(this, a);
        if (zj7Var != null) {
            return zj7Var.getParent();
        }
        return null;
    }

    @Override // defpackage.c9p
    public final wse invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        return O(z2, z ? new t0p(function1) : new u0p(function1));
    }

    @Override // defpackage.c9p
    public boolean isActive() {
        Object objK = K();
        return (objK instanceof uen) && ((uen) objK).isActive();
    }

    @Override // defpackage.c9p
    public final boolean isCancelled() {
        Object objK = K();
        if (objK instanceof dn8) {
            return true;
        }
        return (objK instanceof c) && ((c) objK).d();
    }

    @Override // defpackage.c9p
    public final boolean isCompleted() {
        return !(K() instanceof uen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Throwable] */
    public final Object j0(Object obj, Object obj2) {
        m9p m9pVar;
        if (!(obj instanceof uen)) {
            return p9p.a;
        }
        if ((!(obj instanceof o1g) && !(obj instanceof j9p)) || (obj instanceof ak7) || (obj2 instanceof dn8)) {
            m9p m9pVar2 = this;
            uen uenVar = (uen) obj;
            exx exxVarI = m9pVar2.I(uenVar);
            if (exxVarI == null) {
                return p9p.c;
            }
            c cVar = uenVar instanceof c ? (c) uenVar : null;
            if (cVar == null) {
                cVar = new c(exxVarI, null);
            }
            c cVar2 = cVar;
            dq40 dq40Var = new dq40();
            synchronized (cVar2) {
                if (cVar2.e()) {
                    return p9p.a;
                }
                s0o.a.putIntVolatile(cVar2, c.c, 1);
                if (cVar2 != uenVar) {
                    while (true) {
                        m9pVar = m9pVar2;
                        Unsafe unsafe = s0o.a;
                        long j = b;
                        m9p m9pVar3 = m9pVar2;
                        m9pVar2 = m9pVar3;
                        if (unsafe.compareAndSwapObject(m9pVar3, j, uenVar, cVar2)) {
                            m9pVar = m9pVar2;
                            break;
                        }
                        if (unsafe.getObjectVolatile(m9pVar2, j) != uenVar) {
                            return p9p.c;
                        }
                    }
                }
                m9pVar = m9pVar2;
                boolean zD = cVar2.d();
                dn8 dn8Var = obj2 instanceof dn8 ? (dn8) obj2 : null;
                if (dn8Var != null) {
                    cVar2.b(dn8Var.a);
                }
                ?? C = zD ? 0 : cVar2.c();
                dq40Var.a = C;
                Unit unit = Unit.a;
                if (C != 0) {
                    m9pVar.W(exxVarI, C);
                }
                ak7 ak7VarU = U(exxVarI);
                if (ak7VarU != null && m9pVar.k0(cVar2, ak7VarU, obj2)) {
                    return p9p.b;
                }
                exxVarI.c(new qgs(2), 2);
                ak7 ak7VarU2 = U(exxVarI);
                return (ak7VarU2 == null || !m9pVar.k0(cVar2, ak7VarU2, obj2)) ? m9pVar.A(cVar2, obj2) : p9p.b;
            }
        }
        uen uenVar2 = (uen) obj;
        Object venVar = obj2 instanceof uen ? new ven((uen) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = s0o.a;
            long j2 = b;
            m9p m9pVar4 = this;
            if (unsafe2.compareAndSwapObject(m9pVar4, j2, uenVar2, venVar)) {
                m9pVar4.X(obj2);
                m9pVar4.y(uenVar2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(m9pVar4, j2) != uenVar2) {
                return p9p.c;
            }
            this = m9pVar4;
        }
    }

    @Override // defpackage.c9p
    public final Object join(v1b<? super Unit> v1bVar) throws Throwable {
        Object objK;
        do {
            objK = K();
            if (!(objK instanceof uen)) {
                i9p.e(v1bVar.getContext());
                return Unit.a;
            }
        } while (g0(objK) < 0);
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        bc6Var.u(new gte(i9p.g(this, new in50(bc6Var))));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        if (objO != y5bVar) {
            objO = Unit.a;
        }
        return objO == y5bVar ? objO : Unit.a;
    }

    public final boolean k0(c cVar, ak7 ak7Var, Object obj) {
        do {
            ck7 ck7Var = ak7Var.e;
            b bVar = new b(this, cVar, ak7Var, obj);
            if ((ck7Var instanceof m9p ? ((m9p) ck7Var).O(false, bVar) : ck7Var.invokeOnCompletion(false, false, new h9p(bVar))) != lxx.a) {
                return true;
            }
            ak7Var = U(ak7Var);
        } while (ak7Var != null);
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    public void p(Object obj) {
        n(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    public final Object q(v1b<Object> v1bVar) throws Throwable {
        Object objK;
        do {
            objK = K();
            if (!(objK instanceof uen)) {
                if (objK instanceof dn8) {
                    throw ((dn8) objK).a;
                }
                return p9p.a(objK);
            }
        } while (g0(objK) < 0);
        a aVar = new a(yzo.b(v1bVar), this);
        aVar.q();
        aVar.u(new gte(i9p.g(this, new bn50(aVar))));
        Object objO = aVar.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[LOOP:2: B:56:0x00b2->B:63:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean r(Object obj) {
        m9p m9pVar;
        Throwable thZ;
        Object objK;
        Throwable thC;
        toe0 toe0Var;
        Object objJ0;
        uen uenVar;
        exx exxVarI;
        c cVar;
        Unsafe unsafe;
        long j;
        Object objJ1 = p9p.a;
        if (E()) {
            do {
                Object objK2 = K();
                if (!(objK2 instanceof uen) || ((objK2 instanceof c) && ((c) objK2).e())) {
                    objJ1 = p9p.a;
                    break;
                }
                objJ1 = j0(objK2, new dn8(z(obj), false));
            } while (objJ1 == p9p.c);
            if (objJ1 != p9p.b) {
                if (objJ1 == p9p.a) {
                    thZ = null;
                    loop1: while (true) {
                        objK = this.K();
                        if (objK instanceof c) {
                            if (objK instanceof uen) {
                                if (thZ == null) {
                                    thZ = this.z(obj);
                                }
                                uenVar = (uen) objK;
                                if (uenVar.isActive()) {
                                    exxVarI = this.I(uenVar);
                                    if (exxVarI == null) {
                                        m9pVar = this;
                                    } else {
                                        cVar = new c(exxVarI, thZ);
                                        while (true) {
                                            unsafe = s0o.a;
                                            j = b;
                                            m9pVar = this;
                                            if (unsafe.compareAndSwapObject(m9pVar, j, uenVar, cVar)) {
                                                m9pVar.W(exxVarI, thZ);
                                                objJ0 = p9p.a;
                                            } else if (unsafe.getObjectVolatile(m9pVar, j) != uenVar) {
                                                this = m9pVar;
                                            }
                                        }
                                    }
                                    this = m9pVar;
                                } else {
                                    m9pVar = this;
                                    objJ0 = m9pVar.j0(objK, new dn8(thZ, false));
                                    if (objJ0 != p9p.a) {
                                        ogf.a(objK, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objJ0 != p9p.c) {
                                        this = m9pVar;
                                    }
                                }
                            } else {
                                m9pVar = this;
                                objJ0 = p9p.d;
                            }
                            objJ1 = objJ0;
                            break;
                        }
                        synchronized (objK) {
                            if (s0o.a.getObjectVolatile((c) objK, c.b) == p9p.e) {
                                toe0Var = p9p.d;
                            } else {
                                boolean zD = ((c) objK).d();
                                if (obj == null || !zD) {
                                    if (thZ == null) {
                                        thZ = this.z(obj);
                                    }
                                    ((c) objK).b(thZ);
                                }
                                thC = zD ? null : ((c) objK).c();
                                if (thC != null) {
                                    this.W(((c) objK).a, thC);
                                }
                                toe0Var = p9p.a;
                            }
                        }
                        m9pVar = this;
                        objJ1 = toe0Var;
                        break;
                    }
                }
                m9pVar = this;
                if (objJ1 != p9p.a && objJ1 != p9p.b) {
                    if (objJ1 == p9p.d) {
                        return false;
                    }
                    m9pVar.n(objJ1);
                    return true;
                }
            }
        } else {
            if (objJ1 == p9p.a) {
                thZ = null;
                loop1: while (true) {
                    objK = this.K();
                    if (objK instanceof c) {
                        if (objK instanceof uen) {
                            if (thZ == null) {
                                thZ = this.z(obj);
                            }
                            uenVar = (uen) objK;
                            if (uenVar.isActive()) {
                                exxVarI = this.I(uenVar);
                                if (exxVarI == null) {
                                    m9pVar = this;
                                } else {
                                    cVar = new c(exxVarI, thZ);
                                    while (true) {
                                        unsafe = s0o.a;
                                        j = b;
                                        m9pVar = this;
                                        if (unsafe.compareAndSwapObject(m9pVar, j, uenVar, cVar)) {
                                            m9pVar.W(exxVarI, thZ);
                                            objJ0 = p9p.a;
                                        } else if (unsafe.getObjectVolatile(m9pVar, j) != uenVar) {
                                            this = m9pVar;
                                        }
                                    }
                                }
                                this = m9pVar;
                            } else {
                                m9pVar = this;
                                objJ0 = m9pVar.j0(objK, new dn8(thZ, false));
                                if (objJ0 != p9p.a) {
                                    ogf.a(objK, "Cannot happen in ");
                                    return false;
                                }
                                if (objJ0 != p9p.c) {
                                    this = m9pVar;
                                }
                            }
                        } else {
                            m9pVar = this;
                            objJ0 = p9p.d;
                        }
                        objJ1 = objJ0;
                        break;
                    }
                    synchronized (objK) {
                        if (s0o.a.getObjectVolatile((c) objK, c.b) == p9p.e) {
                            toe0Var = p9p.d;
                        } else {
                            boolean zD2 = ((c) objK).d();
                            if (obj == null) {
                                if (thZ == null) {
                                    thZ = this.z(obj);
                                }
                                ((c) objK).b(thZ);
                            } else {
                                if (thZ == null) {
                                    thZ = this.z(obj);
                                }
                                ((c) objK).b(thZ);
                            }
                            if (zD2) {
                            }
                            if (thC != null) {
                                this.W(((c) objK).a, thC);
                            }
                            toe0Var = p9p.a;
                        }
                        m9pVar = this;
                        objJ1 = toe0Var;
                        break;
                    }
                }
            }
            m9pVar = this;
            if (objJ1 != p9p.a) {
                if (objJ1 == p9p.d) {
                    return false;
                }
                m9pVar.n(objJ1);
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.c9p
    public final boolean start() {
        int iG0;
        do {
            iG0 = g0(K());
            if (iG0 == 0) {
                return false;
            }
        } while (iG0 != 1);
        return true;
    }

    public void t(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final String toString() {
        return (T() + '{' + h0(K()) + '}') + '@' + x2d.b(this);
    }

    public final boolean u(Throwable th) {
        if (!Q()) {
            boolean z = th instanceof CancellationException;
            zj7 zj7Var = (zj7) s0o.a.getObjectVolatile(this, a);
            if (zj7Var == null || zj7Var == lxx.a) {
                return z;
            }
            return zj7Var.b(th) || z;
        }
        return true;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && D();
    }

    public final void y(uen uenVar, Object obj) {
        Unsafe unsafe = s0o.a;
        long j = a;
        zj7 zj7Var = (zj7) unsafe.getObjectVolatile(this, j);
        if (zj7Var != null) {
            zj7Var.dispose();
            unsafe.putObjectVolatile(this, j, lxx.a);
        }
        fn8 fn8Var = null;
        dn8 dn8Var = obj instanceof dn8 ? (dn8) obj : null;
        Throwable th = dn8Var != null ? dn8Var.a : null;
        if (uenVar instanceof j9p) {
            try {
                ((j9p) uenVar).l(th);
                return;
            } catch (Throwable th2) {
                M(new fn8("Exception in completion handler " + uenVar + " for " + this, th2));
                return;
            }
        }
        exx exxVarA = uenVar.a();
        if (exxVarA != null) {
            exxVarA.c(new qgs(1), 1);
            Object objF = exxVarA.f();
            objF.getClass();
            for (uet uetVarG = (uet) objF; !uetVarG.equals(exxVarA); uetVarG = uetVarG.g()) {
                if (uetVarG instanceof j9p) {
                    try {
                        ((j9p) uetVarG).l(th);
                    } catch (Throwable th3) {
                        if (fn8Var != null) {
                            rtg.a(fn8Var, th3);
                        } else {
                            fn8Var = new fn8("Exception in completion handler " + uetVarG + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (fn8Var != null) {
                M(fn8Var);
            }
        }
    }

    public final Throwable z(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new d9p(v(), null, this) : th;
        }
        obj.getClass();
        return ((isz) obj).J();
    }

    @Override // defpackage.c9p
    @fae
    public final c9p plus(c9p c9pVar) {
        return c9pVar;
    }

    @Override // defpackage.c9p
    public final wse invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return O(true, new u0p(function1));
    }

    @Override // defpackage.c9p
    @fae
    public final /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // defpackage.c9p
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d9p(v(), null, this);
        }
        t(cancellationException);
    }

    public void d0() {
    }

    public void M(fn8 fn8Var) {
        throw fn8Var;
    }

    public void X(Object obj) {
    }

    public void n(Object obj) {
    }
}
