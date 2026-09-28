package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class rp1 implements foy {
    public boolean b;
    public final ArrayList c = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, bc6, java.lang.Object] */
    public final Object a(x1b x1bVar) {
        qp1 qp1Var;
        dq40 dq40Var;
        if (x1bVar instanceof qp1) {
            qp1Var = (qp1) x1bVar;
            int i = qp1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qp1Var.d = i - Integer.MIN_VALUE;
            } else {
                qp1Var = new qp1(this, x1bVar);
            }
        } else {
            qp1Var = new qp1(this, x1bVar);
        }
        Object obj = qp1Var.b;
        y5b y5bVar = y5b.a;
        int i2 = qp1Var.d;
        ArrayList arrayList = this.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                if (!this.b) {
                    dq40Var = new dq40();
                    qp1Var.a = dq40Var;
                    qp1Var.d = 1;
                    ?? bc6Var = new bc6(1, yzo.b(qp1Var));
                    bc6Var.q();
                    dq40Var.a = bc6Var;
                    arrayList.add(bc6Var);
                    if (bc6Var.o() == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = qp1Var.a;
            uj50.b(obj);
            this = dq40Var.a;
            y8h0.a(arrayList).remove(this);
            return Unit.a;
        } catch (Throwable th) {
            y8h0.a(arrayList).remove(this.a);
            throw th;
        }
    }

    @Override // defpackage.foy
    public final void x() {
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v1b v1bVar = (v1b) arrayList.get(i);
            zi50.a aVar = zi50.b;
            v1bVar.resumeWith(Unit.a);
        }
        arrayList.clear();
    }
}
