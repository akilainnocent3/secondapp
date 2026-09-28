package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class x680<R> implements ob6, a780, bwi0 {
    public static final /* synthetic */ long f = s0o.a.objectFieldOffset(x680.class.getDeclaredField("state$volatile"));
    public static final /* synthetic */ int i = 0;
    public final CoroutineContext a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = b780.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = b780.d;

    public final class a {
        public final Object a;
        public final gaj<Object, a780<?>, Object, Unit> b;
        public final gaj<Object, Object, Object, Object> c;
        public final Object d;
        public final tje0 e;
        public final gaj<a780<?>, Object, Object, gaj<Throwable, Object, CoroutineContext, Unit>> f;
        public Object g;
        public int h = -1;

        public a(Object obj, gaj gajVar, gaj gajVar2, Object obj2, tje0 tje0Var, gaj gajVar3) {
            this.a = obj;
            this.b = gajVar;
            this.c = gajVar2;
            this.d = obj2;
            this.e = tje0Var;
            this.f = gajVar3;
        }

        public final void a() {
            Object obj = this.g;
            if (obj instanceof f580) {
                ((f580) obj).h(this.h, x680.this.a);
                return;
            }
            wse wseVar = obj instanceof wse ? (wse) obj : null;
            if (wseVar != null) {
                wseVar.dispose();
            }
        }
    }

    public x680(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.bwi0
    public final void a(f580<?> f580Var, int i2) {
        this.c = f580Var;
        this.d = i2;
    }

    @Override // defpackage.ob6
    public final void b(Throwable th) {
        x680<R> x680Var;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == b780.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = s0o.a;
                x680Var = this;
                if (unsafe2.compareAndSwapObject(x680Var, f, objectVolatile, b780.c)) {
                    ArrayList arrayList = x680Var.b;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((a) obj).a();
                    }
                    x680Var.e = b780.d;
                    x680Var.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(x680Var, j) != objectVolatile) {
                    break;
                } else {
                    this = x680Var;
                }
            }
            this = x680Var;
        }
    }

    @Override // defpackage.a780
    public final void c(Object obj) {
        this.e = obj;
    }

    @Override // defpackage.a780
    public final boolean d(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    @Override // defpackage.a780
    public final void e(wse wseVar) {
        this.c = wseVar;
    }

    public final Object f(x1b x1bVar) {
        Unsafe unsafe = s0o.a;
        long j = f;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        a aVar = (a) objectVolatile;
        Object obj = aVar.d;
        Object obj2 = this.e;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                a aVar2 = (a) obj3;
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            s0o.a.putObjectVolatile(this, j, b780.b);
            this.e = b780.d;
            this.b = null;
        }
        Object objInvoke = aVar.c.invoke(aVar.a, obj, obj2);
        haj hajVar = aVar.e;
        return obj == b780.e ? ((Function1) hajVar).invoke(x1bVar) : ((Function2) hajVar).invoke(objInvoke, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(x1b x1bVar) throws Throwable {
        y680 y680Var;
        bc6 bc6Var;
        Unsafe unsafe;
        x680<R> x680Var;
        if (x1bVar instanceof y680) {
            y680Var = (y680) x1bVar;
            int i2 = y680Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y680Var.d = i2 - Integer.MIN_VALUE;
            } else {
                y680Var = new y680(this, x1bVar);
            }
        } else {
            y680Var = new y680(this, x1bVar);
        }
        y680 y680Var2 = y680Var;
        Object obj = y680Var2.b;
        y5b y5bVar = y5b.a;
        int i3 = y680Var2.d;
        if (i3 == 0) {
            uj50.b(obj);
            y680Var2.a = this;
            y680Var2.d = 1;
            bc6 bc6Var2 = new bc6(1, yzo.b(y680Var2));
            bc6Var2.q();
            loop0: while (true) {
                Unsafe unsafe2 = s0o.a;
                long j = f;
                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
                bc6 bc6Var3 = bc6Var2;
                toe0 toe0Var = b780.a;
                if (objectVolatile == toe0Var) {
                    bc6 bc6Var4 = bc6Var3;
                    while (true) {
                        Unsafe unsafe3 = s0o.a;
                        bc6Var = bc6Var4;
                        if (unsafe3.compareAndSwapObject(this, f, objectVolatile, bc6Var4)) {
                            bc6Var.u(this);
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                        bc6Var4 = bc6Var;
                    }
                    bc6Var2 = bc6Var;
                } else {
                    bc6Var = bc6Var3;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof a)) {
                            ogf.a(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        Unit unit = Unit.a;
                        a aVar = (a) objectVolatile;
                        Object obj2 = this.e;
                        gaj<a780<?>, Object, Object, gaj<Throwable, Object, CoroutineContext, Unit>> gajVar = aVar.f;
                        bc6Var.s(unit, gajVar != null ? gajVar.invoke(this, aVar.d, obj2) : null);
                        break;
                    }
                    do {
                        unsafe = s0o.a;
                        if (unsafe.compareAndSwapObject(this, f, objectVolatile, toe0Var)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                x680<R>.a aVarH = h(it.next());
                                aVarH.getClass();
                                aVarH.g = null;
                                aVarH.h = -1;
                                i(aVarH, true);
                            }
                            break;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    bc6Var2 = bc6Var;
                }
            }
            Object objO = bc6Var.o();
            if (objO != y5b.a) {
                objO = Unit.a;
            }
            if (objO != y5bVar) {
                x680Var = this;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x680Var = y680Var2.a;
        uj50.b(obj);
        y680Var2.a = null;
        y680Var2.d = 2;
        Object objF = x680Var.f(y680Var2);
        return objF == y5bVar ? y5bVar : objF;
    }

    @Override // defpackage.a780
    public final CoroutineContext getContext() {
        return this.a;
    }

    public final x680<R>.a h(Object obj) {
        ArrayList arrayList = this.b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            if (((a) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        x680<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void i(x680<R>.a aVar, boolean z) {
        Object obj = aVar.a;
        Unsafe unsafe = s0o.a;
        long j = f;
        if (unsafe.getObjectVolatile(this, j) instanceof a) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (((a) obj2).a == obj) {
                        q1b.a(wga.a(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        aVar.b.invoke(obj, this, aVar.d);
        if (this.e != b780.d) {
            s0o.a.putObjectVolatile(this, j, aVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(aVar);
        }
        aVar.g = this.c;
        aVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final int j(Object obj, Object obj2) {
        x680<R> x680Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = s0o.a;
            long j = f;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof zb6) {
                x680<R>.a aVarH = this.h(obj);
                if (aVarH != null) {
                    gaj<a780<?>, Object, Object, gaj<Throwable, Object, CoroutineContext, Unit>> gajVar = aVarH.f;
                    gaj<Throwable, Object, CoroutineContext, Unit> gajVarInvoke = gajVar != null ? gajVar.invoke(this, aVarH.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = s0o.a;
                        x680Var = this;
                        if (unsafe4.compareAndSwapObject(x680Var, f, objectVolatile, aVarH)) {
                            zb6 zb6Var = (zb6) objectVolatile;
                            x680Var.e = obj2;
                            toe0 toe0VarI = zb6Var.i(Unit.a, gajVarInvoke);
                            if (toe0VarI == null) {
                                x680Var.e = b780.d;
                                return 2;
                            }
                            zb6Var.x(toe0VarI);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(x680Var, j) != objectVolatile) {
                            break;
                        }
                        this = x680Var;
                    }
                } else {
                    continue;
                }
            } else {
                x680Var = this;
                if (Intrinsics.g(objectVolatile, b780.b) || (objectVolatile instanceof a)) {
                    return 3;
                }
                if (Intrinsics.g(objectVolatile, b780.c)) {
                    return 2;
                }
                if (Intrinsics.g(objectVolatile, b780.a)) {
                    List listC = kotlin.collections.a.c(obj);
                    do {
                        unsafe2 = s0o.a;
                        if (unsafe2.compareAndSwapObject(x680Var, f, objectVolatile, listC)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(x680Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        ogf.a(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListJ0 = CollectionsKt.j0((Collection) objectVolatile, obj);
                    do {
                        unsafe = s0o.a;
                        if (unsafe.compareAndSwapObject(x680Var, f, objectVolatile, arrayListJ0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(x680Var, j) == objectVolatile);
                }
            }
            this = x680Var;
        }
    }
}
