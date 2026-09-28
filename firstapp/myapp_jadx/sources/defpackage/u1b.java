package defpackage;

import com.google.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public class u1b<K, V> extends znz<V> {
    public static final /* synthetic */ int J = 0;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public final boolean H;
    public final r5s<K, V> I;
    public final wqz<K, V> y;
    public final K z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
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
    public u1b(k5b k5bVar, k5b k5bVar2, v5b v5bVar, znz.c cVar, wqz.b.c cVar2, wqz wqzVar, Object obj) {
        super(wqzVar, v5bVar, k5bVar, new hoz(), cVar);
        wqzVar.getClass();
        v5bVar.getClass();
        k5bVar.getClass();
        k5bVar2.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.y = wqzVar;
        this.z = obj;
        this.E = Reader.READ_DONE;
        this.F = Integer.MIN_VALUE;
        boolean z = false;
        this.H = false;
        this.I = new r5s<>(v5bVar, cVar, wqzVar, k5bVar, k5bVar2, this, this.d);
        boolean z2 = cVar.c;
        hoz<T> hozVar = this.d;
        int i = cVar2.d;
        if (!z2) {
            hozVar.h(0, cVar2, 0, i != Integer.MIN_VALUE ? i : 0, this, false);
            return;
        }
        int i2 = i != Integer.MIN_VALUE ? i : 0;
        int i3 = cVar2.e;
        int i4 = i3 != Integer.MIN_VALUE ? i3 : 0;
        if (i != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE) {
            z = true;
        }
        hozVar.h(i2, cVar2, i4, 0, this, z);
    }

    @Override // defpackage.znz
    public final void c(Function2<? super kxs, ? super hxs, Unit> function2) {
        function2.getClass();
        s5s s5sVar = this.I.i;
        s5sVar.getClass();
        function2.invoke(kxs.a, s5sVar.a);
        function2.invoke(kxs.b, s5sVar.b);
        function2.invoke(kxs.c, s5sVar.c);
    }

    @Override // defpackage.znz
    public final K d() {
        xqz<K, V> xqzVar;
        K kB;
        znz.c cVar = this.e;
        cVar.getClass();
        hoz<T> hozVar = this.d;
        ArrayList arrayList = hozVar.a;
        if (arrayList.isEmpty()) {
            xqzVar = null;
        } else {
            List listA0 = CollectionsKt.A0(arrayList);
            listA0.getClass();
            xqzVar = new xqz<>(listA0, Integer.valueOf(hozVar.b + hozVar.i), new iqz(cVar.a, cVar.b, cVar.c, cVar.d, Reader.READ_DONE, 32), hozVar.b);
        }
        return (xqzVar == null || (kB = this.y.b(xqzVar)) == null) ? this.z : kB;
    }

    @Override // defpackage.znz
    public final wqz<K, V> e() {
        return this.y;
    }

    @Override // defpackage.znz
    public final boolean f() {
        return this.I.h.get();
    }

    @Override // defpackage.znz
    public final void j(int i) {
        znz.c cVar = this.e;
        int i2 = cVar.b;
        hoz<T> hozVar = this.d;
        int i3 = hozVar.b;
        int i4 = i2 - (i - i3);
        int i5 = ((i2 + i) + 1) - (i3 + hozVar.f);
        int iMax = Math.max(i4, this.A);
        this.A = iMax;
        r5s<K, V> r5sVar = this.I;
        if (iMax > 0) {
            hxs hxsVar = r5sVar.i.b;
            if ((hxsVar instanceof hxs.c) && !hxsVar.a) {
                r5sVar.c();
            }
        }
        int iMax2 = Math.max(i5, this.B);
        this.B = iMax2;
        if (iMax2 > 0) {
            hxs hxsVar2 = r5sVar.i.c;
            if ((hxsVar2 instanceof hxs.c) && !hxsVar2.a) {
                r5sVar.b();
            }
        }
        this.E = Math.min(this.E, i);
        int iMax3 = Math.max(this.F, i);
        this.F = iMax3;
        boolean z = this.C && this.E <= cVar.b;
        boolean z2 = this.D && iMax3 >= (hozVar.a() - 1) - cVar.b;
        if (z || z2) {
            if (z) {
                this.C = false;
            }
            if (z2) {
                this.D = false;
            }
            ej5.c(this.b, this.c, null, new t1b(this, z, z2, null), 2);
        }
    }

    @Override // defpackage.znz
    public final void m(hxs hxsVar) {
        hxsVar.getClass();
        this.I.i.b(kxs.a, hxsVar);
    }

    public final void n(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it = CollectionsKt.m0(this.i).iterator();
        while (it.hasNext()) {
            znz.a aVar = (znz.a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.c(i, i2);
            }
        }
    }
}
