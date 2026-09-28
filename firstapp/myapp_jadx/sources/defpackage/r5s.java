package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r5s<K, V> {
    public final v5b a;
    public final znz.c b;
    public final wqz<K, V> c;
    public final k5b d;
    public final k5b e;
    public final u1b f;
    public final a<K> g;
    public final AtomicBoolean h;
    public final s5s i;

    public interface a<K> {
        K c();

        K e();
    }

    public r5s(v5b v5bVar, znz.c cVar, wqz wqzVar, k5b k5bVar, k5b k5bVar2, u1b u1bVar, a aVar) {
        cVar.getClass();
        wqzVar.getClass();
        k5bVar.getClass();
        k5bVar2.getClass();
        this.a = v5bVar;
        this.b = cVar;
        this.c = wqzVar;
        this.d = k5bVar;
        this.e = k5bVar2;
        this.f = u1bVar;
        this.g = aVar;
        this.h = new AtomicBoolean(false);
        this.i = new s5s(this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6 A[PHI: r17
      0x00a6: PHI (r17v1 boolean) = (r17v0 boolean), (r4v0 boolean) binds: [B:50:0x00fa, B:33:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(kxs kxsVar, wqz.b.c<K, V> cVar) {
        boolean z;
        boolean z2;
        if (this.h.get()) {
            return;
        }
        u1b u1bVar = this.f;
        boolean z3 = u1bVar.H;
        r5s<K, V> r5sVar = u1bVar.I;
        int i = u1bVar.f;
        znz.c cVar2 = u1bVar.e;
        cVar.getClass();
        List<V> list = cVar.a;
        hoz<T> hozVar = u1bVar.d;
        ArrayList arrayList = hozVar.a;
        int i2 = hozVar.b;
        boolean z4 = hozVar.i + i2 > (hozVar.f / 2) + i2;
        if (z3) {
            cVar2.getClass();
            if (hozVar.f + list.size() <= Integer.MAX_VALUE || arrayList.size() <= 1 || hozVar.f < i) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        kxs kxsVar2 = kxs.b;
        kxs kxsVar3 = kxs.c;
        if (kxsVar == kxsVar3) {
            if (!z || z4) {
                int size = list.size();
                if (size != 0) {
                    arrayList.add(cVar);
                    hozVar.f += size;
                    int iMin = Math.min(hozVar.c, size);
                    int i3 = size - iMin;
                    if (iMin != 0) {
                        hozVar.c -= iMin;
                    }
                    int i4 = (hozVar.b + hozVar.f) - size;
                    u1bVar.k(i4, iMin);
                    u1bVar.l(i4 + iMin, i3);
                }
                int size2 = u1bVar.B - list.size();
                u1bVar.B = size2;
                if (size2 > 0 && !list.isEmpty()) {
                    z2 = true;
                }
            } else {
                u1bVar.B = 0;
                z3 = z3;
            }
            z2 = false;
        } else {
            z3 = z3;
            if (kxsVar != kxsVar2) {
                z9l.a(kxsVar, "unexpected result type ");
                return;
            }
            if (z && z4) {
                u1bVar.A = 0;
            } else {
                int size3 = list.size();
                if (size3 != 0) {
                    arrayList.add(0, cVar);
                    hozVar.f += size3;
                    int iMin2 = Math.min(hozVar.b, size3);
                    int i5 = size3 - iMin2;
                    if (iMin2 != 0) {
                        hozVar.b -= iMin2;
                    }
                    hozVar.d -= i5;
                    u1bVar.k(hozVar.b, iMin2);
                    u1bVar.l(0, i5);
                    u1bVar.E += i5;
                    u1bVar.F += i5;
                }
                int size4 = u1bVar.A - list.size();
                u1bVar.A = size4;
                if (size4 > 0 && !list.isEmpty()) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        hxs.c cVar3 = hxs.c.c;
        if (z3) {
            if (z4) {
                if (!(r5sVar.i.b instanceof hxs.b)) {
                    boolean z5 = u1bVar.G;
                    cVar2.getClass();
                    int i6 = 0;
                    while (hozVar.i(i, 0)) {
                        int size5 = ((wqz.b.c) arrayList.remove(0)).a.size();
                        i6 += size5;
                        hozVar.f -= size5;
                    }
                    int i7 = hozVar.i - i6;
                    hozVar.i = i7 < 0 ? 0 : i7;
                    if (i6 > 0) {
                        if (z5) {
                            int i8 = hozVar.b;
                            hozVar.b = i8 + i6;
                            u1bVar.k(i8, i6);
                        } else {
                            hozVar.d += i6;
                            u1bVar.n(hozVar.b, i6);
                        }
                    }
                    if (i6 > 0) {
                        r5sVar.i.b(kxsVar2, cVar3);
                    }
                }
            } else if (!(r5sVar.i.c instanceof hxs.b)) {
                boolean z6 = u1bVar.G;
                cVar2.getClass();
                int i9 = 0;
                while (hozVar.i(i, arrayList.size() - 1)) {
                    int size6 = ((wqz.b.c) arrayList.remove(arrayList.size() - 1)).a.size();
                    i9 += size6;
                    hozVar.f -= size6;
                }
                int i10 = hozVar.i;
                int i11 = hozVar.f;
                int i12 = i11 - 1;
                if (i10 > i12) {
                    i10 = i12;
                }
                hozVar.i = i10;
                if (i9 > 0) {
                    int i13 = hozVar.b + i11;
                    if (z6) {
                        hozVar.c += i9;
                        u1bVar.k(i13, i9);
                    } else {
                        u1bVar.n(i13, i9);
                    }
                }
                if (i9 > 0) {
                    r5sVar.i.b(kxsVar3, cVar3);
                }
            }
        }
        if (!z2) {
            if (list.isEmpty()) {
                cVar3 = hxs.c.b;
            }
            this.i.b(kxsVar, cVar3);
            return;
        }
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 1) {
            c();
        } else if (iOrdinal == 2) {
            b();
        } else {
            ib5.a("Can only fetch more during append/prepend");
        }
    }

    public final void b() {
        K kC = this.g.c();
        kxs kxsVar = kxs.c;
        if (kC == null) {
            wqz.b.c<K, V> cVar = wqz.b.c.f;
            cVar.getClass();
            a(kxsVar, cVar);
        } else {
            this.i.b(kxsVar, hxs.b.b);
            znz.c cVar2 = this.b;
            ej5.c(this.a, this.e, null, new t5s(this, new wqz.a.C1262a(cVar2.a, kC, cVar2.c), kxsVar, null), 2);
        }
    }

    public final void c() {
        K kE = this.g.e();
        kxs kxsVar = kxs.b;
        if (kE == null) {
            wqz.b.c<K, V> cVar = wqz.b.c.f;
            cVar.getClass();
            a(kxsVar, cVar);
        } else {
            this.i.b(kxsVar, hxs.b.b);
            znz.c cVar2 = this.b;
            ej5.c(this.a, this.e, null, new t5s(this, new wqz.a.b(cVar2.a, kE, cVar2.c), kxsVar, null), 2);
        }
    }
}
