package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qxa implements hx90, nsr {
    public long b = qsh0.a;
    public ArrayList c = new ArrayList();

    @c0d(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", l = {77}, m = "size")
    public static final class a extends x1b {
        public dq40 a;
        public /* synthetic */ Object b;
        public int d;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return qxa.this.d(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, bc6, java.lang.Object] */
    @Override // defpackage.hx90
    public final Object d(v1b<? super ww90> v1bVar) throws Throwable {
        a aVar;
        dq40 dq40Var;
        Throwable th;
        dqe aVar2;
        dqe aVar3;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object obj = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (kxa.l(this.b)) {
                dq40 dq40Var2 = new dq40();
                try {
                    aVar.a = dq40Var2;
                    aVar.d = 1;
                    ?? bc6Var = new bc6(1, yzo.b(aVar));
                    bc6Var.q();
                    dq40Var2.a = bc6Var;
                    this.c.add(bc6Var);
                    if (bc6Var.o() == y5bVar) {
                        return y5bVar;
                    }
                    dq40Var = dq40Var2;
                    ArrayList arrayList = this.c;
                    y8h0.a(arrayList).remove(dq40Var.a);
                } catch (Throwable th2) {
                    dq40Var = dq40Var2;
                    th = th2;
                    ArrayList arrayList2 = this.c;
                    y8h0.a(arrayList2).remove(dq40Var.a);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = aVar.a;
            try {
                uj50.b(obj);
                ArrayList arrayList3 = this.c;
                y8h0.a(arrayList3).remove(dq40Var.a);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.c;
                y8h0.a(arrayList4).remove(dq40Var.a);
                throw th;
            }
        }
        long j = this.b;
        int i3 = qsh0.b;
        int i4 = kxa.i(j);
        if (i4 != Integer.MAX_VALUE) {
            dqe.a.a(i4);
            aVar2 = new dqe.a(i4);
        } else {
            aVar2 = dqe.b.a;
        }
        int iH = kxa.h(j);
        if (iH != Integer.MAX_VALUE) {
            dqe.a.a(iH);
            aVar3 = new dqe.a(iH);
        } else {
            aVar3 = dqe.b.a;
        }
        return new ww90(aVar2, aVar3);
    }

    @Override // defpackage.nsr
    public final biv e(t tVar, vhv vhvVar, long j) {
        z(j);
        final y yVarD0 = vhvVar.d0(j);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: pxa
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((y.a) obj).s(yVarD0, 0, 0, 0.0f);
                return Unit.a;
            }
        });
    }

    public final void z(long j) {
        this.b = j;
        if (kxa.l(j)) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zi50.a aVar = zi50.b;
            ((v1b) obj).resumeWith(Unit.a);
        }
    }
}
