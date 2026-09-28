package defpackage;

import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class j01<T> {
    public final androidx.recyclerview.widget.b a;
    public final c<T> b;
    public final CopyOnWriteArrayList<b<T>> c = new CopyOnWriteArrayList<>();
    public znz<T> d;
    public znz<T> e;
    public int f;
    public final l01 g;
    public final k01 h;
    public final CopyOnWriteArrayList i;
    public final m01 j;

    public static final class a<T> implements b<T> {
        public final foz a;

        public a(foz fozVar) {
            this.a = fozVar;
        }

        @Override // j01.b
        public final void a(znz<T> znzVar, znz<T> znzVar2) {
            this.a.invoke(znzVar, znzVar2);
        }
    }

    @fae
    public interface b<T> {
        void a(znz<T> znzVar, znz<T> znzVar2);
    }

    @fae
    public j01(goz gozVar, qpe qpeVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        l01 l01Var = new l01(this);
        this.g = l01Var;
        this.h = new k01(2, l01Var, znz.d.class, "setState", "setState(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
        this.i = new CopyOnWriteArrayList();
        this.j = new m01(this);
        this.a = new androidx.recyclerview.widget.b(gozVar);
        synchronized (c.a.a) {
            try {
                executorServiceNewFixedThreadPool = c.a.b;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    c.a.b = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b = new c<>(executorServiceNewFixedThreadPool, qpeVar);
    }

    public final znz<T> a() {
        znz<T> znzVar = this.e;
        return znzVar == null ? this.d : znzVar;
    }

    public final T b(int i) {
        znz<T> znzVar = this.e;
        znz<T> znzVar2 = this.d;
        if (znzVar != null) {
            return znzVar.d.get(i);
        }
        if (znzVar2 != null) {
            znzVar2.i(i);
            return znzVar2.d.get(i);
        }
        mae0.a("Item count is zero, getItem() call is invalid");
        return null;
    }

    public final nis c() {
        androidx.recyclerview.widget.b bVar = this.a;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("updateCallback");
        throw null;
    }

    public final void d(znz znzVar, znz znzVar2) {
        Iterator<b<T>> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(znzVar, znzVar2);
        }
    }

    public final void e(final znz<T> znzVar) {
        final int i = this.f + 1;
        this.f = i;
        znz<T> znzVar2 = this.d;
        if (znzVar == znzVar2) {
            return;
        }
        k01 k01Var = this.h;
        m01 m01Var = this.j;
        if (znzVar2 != null && (znzVar instanceof khn)) {
            m01Var.getClass();
            p48.A(znzVar2.i, new doz(m01Var));
            k01Var.getClass();
            p48.A(znzVar2.v, new eoz(k01Var));
            kxs kxsVar = kxs.a;
            hxs.b bVar = hxs.b.b;
            l01 l01Var = this.g;
            l01Var.b(kxsVar, bVar);
            l01Var.b(kxs.b, new hxs.c(false));
            l01Var.b(kxs.c, new hxs.c(false));
            return;
        }
        znz<T> znzVarA = a();
        znz<T> znzVar3 = null;
        if (znzVar == null) {
            znz<T> znzVarA2 = a();
            int iA = znzVarA2 != null ? znzVarA2.d.a() : 0;
            if (znzVar2 != null) {
                m01Var.getClass();
                p48.A(znzVar2.i, new doz(m01Var));
                k01Var.getClass();
                p48.A(znzVar2.v, new eoz(k01Var));
                this.d = null;
            } else if (this.e != null) {
                this.e = null;
            }
            ((androidx.recyclerview.widget.b) c()).onRemoved(0, iA);
            d(znzVarA, null);
            return;
        }
        if (a() == null) {
            this.d = znzVar;
            k01Var.getClass();
            ArrayList arrayList = znzVar.v;
            p48.A(arrayList, boz.a);
            arrayList.add(new WeakReference(k01Var));
            znzVar.c(k01Var);
            znzVar.a(m01Var);
            ((androidx.recyclerview.widget.b) c()).onInserted(0, znzVar.d.a());
            d(null, znzVar);
            return;
        }
        znz<T> z5a0Var = this.d;
        if (z5a0Var != null) {
            m01Var.getClass();
            p48.A(z5a0Var.i, new doz(m01Var));
            k01Var.getClass();
            p48.A(z5a0Var.v, new eoz(k01Var));
            if (!z5a0Var.h()) {
                z5a0Var = new z5a0(z5a0Var);
            }
            this.e = z5a0Var;
            this.d = null;
        } else {
            znzVar3 = z5a0Var;
        }
        final znz<T> znzVar4 = this.e;
        if (znzVar4 == null || znzVar3 != null) {
            ib5.a("must be in snapshot state to diff");
            return;
        }
        final znz<T> z5a0Var2 = znzVar.h() ? znzVar : new z5a0(znzVar);
        final fk40 fk40Var = new fk40();
        znzVar.a(fk40Var);
        this.b.a.execute(new Runnable() { // from class: h01
            @Override // java.lang.Runnable
            public final void run() {
                final znz znzVar5 = znzVar4;
                mi10 mi10Var = znzVar5.d;
                final znz znzVar6 = z5a0Var2;
                mi10 mi10Var2 = znzVar6.d;
                final j01 j01Var = this;
                n.e<T> eVar = j01Var.b.b;
                eVar.getClass();
                final li10 li10VarA = ni10.a(mi10Var, mi10Var2, eVar);
                final int i2 = i;
                final znz znzVar7 = znzVar;
                final fk40 fk40Var2 = fk40Var;
                fw0.X().Z(new Runnable() { // from class: i01
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
                    @Override // java.lang.Runnable
                    public final void run() {
                        j01 j01Var2 = j01Var;
                        if (j01Var2.f == i2) {
                            hoz<T> hozVar = znzVar5.d;
                            int i3 = hozVar.b + hozVar.i;
                            m01 m01Var2 = j01Var2.j;
                            znz<T> znzVar8 = znzVar7;
                            znzVar8.getClass();
                            mi10 mi10Var3 = znzVar6.d;
                            znz znzVar9 = j01Var2.e;
                            if (znzVar9 != null) {
                                mi10 mi10Var4 = znzVar9.d;
                                if (j01Var2.d == null) {
                                    j01Var2.d = znzVar8;
                                    Function2<? super kxs, ? super hxs, Unit> function2 = j01Var2.h;
                                    function2.getClass();
                                    ArrayList arrayList2 = znzVar8.v;
                                    p48.A(arrayList2, boz.a);
                                    arrayList2.add(new WeakReference(function2));
                                    znzVar8.c(function2);
                                    j01Var2.e = null;
                                    nis nisVarC = j01Var2.c();
                                    li10 li10Var = li10VarA;
                                    ni10.b(mi10Var4, nisVarC, mi10Var3, li10Var);
                                    m01Var2.getClass();
                                    ArrayList arrayList3 = fk40Var2.a;
                                    kotlin.ranges.c cVarL = f.l(3, f.n(0, arrayList3.size()));
                                    int i4 = cVarL.a;
                                    int i5 = cVarL.b;
                                    int i6 = cVarL.c;
                                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                                        while (true) {
                                            int iIntValue = ((Number) arrayList3.get(i4)).intValue();
                                            if (iIntValue == 0) {
                                                m01Var2.a(((Number) arrayList3.get(i4 + 1)).intValue(), ((Number) arrayList3.get(i4 + 2)).intValue());
                                            } else if (iIntValue == 1) {
                                                m01Var2.b(((Number) arrayList3.get(i4 + 1)).intValue(), ((Number) arrayList3.get(i4 + 2)).intValue());
                                            } else {
                                                if (iIntValue != 2) {
                                                    ib5.a("Unexpected recording value");
                                                    return;
                                                }
                                                m01Var2.c(((Number) arrayList3.get(i4 + 1)).intValue(), ((Number) arrayList3.get(i4 + 2)).intValue());
                                            }
                                            if (i4 == i5) {
                                                break;
                                            } else {
                                                i4 += i6;
                                            }
                                        }
                                    }
                                    arrayList3.clear();
                                    znzVar8.a(m01Var2);
                                    if (!znzVar8.isEmpty()) {
                                        znzVar8.i(f.e(ni10.c(mi10Var4, li10Var, mi10Var3, i3), 0, znzVar8.d.a() - 1));
                                    }
                                    j01Var2.d(znzVar9, j01Var2.d);
                                    return;
                                }
                            }
                            ib5.a("must be in snapshot state to apply diff");
                        }
                    }
                });
            }
        });
    }
}
