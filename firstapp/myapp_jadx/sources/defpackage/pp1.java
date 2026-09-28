package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class pp1<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(pp1.class, "notCompletedCount$volatile");
    public final ojd<T>[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public final class a extends j9p {
        public static final /* synthetic */ long v = s0o.a.objectFieldOffset(a.class.getDeclaredField("_disposer$volatile"));
        private volatile /* synthetic */ Object _disposer$volatile;
        public final bc6 e;
        public wse f;

        public a(bc6 bc6Var) {
            this.e = bc6Var;
        }

        @Override // defpackage.j9p
        public final boolean k() {
            return false;
        }

        @Override // defpackage.j9p
        public final void l(Throwable th) {
            bc6 bc6Var = this.e;
            if (th != null) {
                bc6Var.getClass();
                toe0 toe0VarF = bc6Var.F(new dn8(th, false), null);
                if (toe0VarF != null) {
                    bc6Var.x(toe0VarF);
                    b bVar = (b) s0o.a.getObjectVolatile(this, v);
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = pp1.b;
            pp1<T> pp1Var = pp1.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(pp1Var) == 0) {
                ojd<T>[] ojdVarArr = pp1Var.a;
                ArrayList arrayList = new ArrayList(ojdVarArr.length);
                for (ojd<T> ojdVar : ojdVarArr) {
                    arrayList.add(ojdVar.getCompleted());
                }
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(arrayList);
            }
        }
    }

    public final class b implements ob6 {
        public final pp1<T>.a[] a;

        public b(a[] aVarArr) {
            this.a = aVarArr;
        }

        public final void a() {
            for (pp1<T>.a aVar : this.a) {
                wse wseVar = aVar.f;
                if (wseVar == null) {
                    Intrinsics.n("handle");
                    throw null;
                }
                wseVar.dispose();
            }
        }

        @Override // defpackage.ob6
        public final void b(Throwable th) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pp1(ojd<? extends T>[] ojdVarArr) {
        this.a = ojdVarArr;
        this.notCompletedCount$volatile = ojdVarArr.length;
    }

    public final Object a(v1b<? super List<? extends T>> v1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        ojd<T>[] ojdVarArr = this.a;
        int length = ojdVarArr.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            ojd<T> ojdVar = ojdVarArr[i];
            ojdVar.start();
            a aVar = new a(bc6Var);
            aVar.f = i9p.g(ojdVar, aVar);
            Unit unit = Unit.a;
            aVarArr[i] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            a aVar2 = aVarArr[i2];
            aVar2.getClass();
            s0o.a.putObjectVolatile(aVar2, a.v, bVar);
        }
        if (bc6Var.v()) {
            bVar.a();
        } else {
            bc6Var.u(bVar);
        }
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }
}
