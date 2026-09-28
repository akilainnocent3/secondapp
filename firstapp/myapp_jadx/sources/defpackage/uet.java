package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public class uet {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public /* synthetic */ class a extends b630 {
        @Override // defpackage.lhp
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    static {
        Unsafe unsafe = s0o.a;
        a = unsafe.objectFieldOffset(uet.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(uet.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(uet.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(uet uetVar, int i) {
        uet uetVar2;
        uet uetVar3;
        while (true) {
            uet uetVarH = this.h();
            if (uetVarH instanceof qgs) {
                return (((qgs) uetVarH).d & i) == 0 && uetVarH.c(uetVar, i);
            }
            Unsafe unsafe = s0o.a;
            unsafe.putObjectVolatile(uetVar, b, uetVarH);
            long j = a;
            unsafe.putObjectVolatile(uetVar, j, this);
            while (true) {
                Unsafe unsafe2 = s0o.a;
                uetVar2 = this;
                uetVar3 = uetVar;
                if (unsafe2.compareAndSwapObject(uetVarH, a, uetVar2, uetVar3)) {
                    uetVar3.e(uetVar2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(uetVarH, j) != uetVar2) {
                    break;
                }
                this = uetVar2;
                uetVar = uetVar3;
            }
            this = uetVar2;
            uetVar = uetVar3;
        }
    }

    public final uet d() {
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = b;
            uet uetVar = (uet) unsafe.getObjectVolatile(this, j);
            uet uetVar2 = null;
            uet uetVar3 = uetVar;
            while (true) {
                if (uetVar3 == null) {
                    throw new ClassCastException();
                }
                Unsafe unsafe2 = s0o.a;
                long j2 = a;
                Object objectVolatile = unsafe2.getObjectVolatile(uetVar3, j2);
                if (objectVolatile == this) {
                    if (uetVar != uetVar3) {
                        while (true) {
                            Unsafe unsafe3 = s0o.a;
                            uet uetVar4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(uetVar4, b, uetVar, uetVar3);
                            uet uetVar5 = uetVar;
                            this = uetVar4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != uetVar5) {
                                    break;
                                }
                                this = this;
                                uetVar = uetVar5;
                            }
                        }
                    }
                    return uetVar3;
                }
                uetVar = uetVar;
                this = this;
                if (this.i()) {
                    return null;
                }
                if (!(objectVolatile instanceof k750)) {
                    objectVolatile.getClass();
                    uetVar2 = uetVar3;
                    uetVar3 = (uet) objectVolatile;
                } else if (uetVar2 != null) {
                    uet uetVar6 = ((k750) objectVolatile).a;
                    while (true) {
                        uet uetVar7 = uetVar3;
                        Unsafe unsafe4 = s0o.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(uetVar2, a, uetVar7, uetVar6);
                        uetVar3 = uetVar7;
                        if (zCompareAndSwapObject2) {
                            uetVar3 = uetVar2;
                            uetVar2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(uetVar2, j2) != uetVar3) {
                            break;
                        }
                    }
                } else {
                    if (uetVar3 == null) {
                        throw new ClassCastException();
                    }
                    uetVar3 = (uet) unsafe2.getObjectVolatile(uetVar3, j);
                }
            }
            this = this;
        }
    }

    public final void e(uet uetVar) {
        uet uetVar2;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = b;
            uet uetVar3 = (uet) unsafe.getObjectVolatile(uetVar, j);
            if (this.f() != uetVar) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = s0o.a;
                uetVar2 = this;
                uet uetVar4 = uetVar;
                if (unsafe2.compareAndSwapObject(uetVar4, b, uetVar3, uetVar2)) {
                    if (uetVar2.i()) {
                        uetVar4.d();
                        return;
                    }
                    return;
                } else {
                    uetVar = uetVar4;
                    if (unsafe2.getObjectVolatile(uetVar4, j) != uetVar3) {
                        break;
                    } else {
                        this = uetVar2;
                    }
                }
            }
            this = uetVar2;
        }
    }

    public final Object f() {
        return s0o.a.getObjectVolatile(this, a);
    }

    public final uet g() {
        Object objF = f();
        k750 k750Var = objF instanceof k750 ? (k750) objF : null;
        if (k750Var != null) {
            return k750Var.a;
        }
        objF.getClass();
        return (uet) objF;
    }

    public final uet h() {
        uet uetVarD = d();
        if (uetVarD != null) {
            return uetVarD;
        }
        Unsafe unsafe = s0o.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            uet uetVar = (uet) objectVolatile;
            if (!uetVar.i()) {
                return uetVar;
            }
            objectVolatile = s0o.a.getObjectVolatile(uetVar, j);
        }
    }

    public boolean i() {
        return f() instanceof k750;
    }

    public String toString() {
        return new a(this, x2d.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + x2d.b(this);
    }
}
