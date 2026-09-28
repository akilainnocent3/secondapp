package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class sbs {
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, hbs, rbs] */
    public static final Object a(s9s s9sVar, x1b x1bVar) {
        qbs qbsVar;
        s9s s9sVar2;
        dq40 dq40Var;
        Throwable th;
        s9s s9sVar3;
        hbs hbsVar;
        hbs hbsVar2;
        if (x1bVar instanceof qbs) {
            qbsVar = (qbs) x1bVar;
            int i = qbsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbsVar.d = i - Integer.MIN_VALUE;
            } else {
                qbsVar = new qbs(x1bVar);
            }
        } else {
            qbsVar = new qbs(x1bVar);
        }
        Object obj = qbsVar.c;
        y5b y5bVar = y5b.a;
        int i2 = qbsVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = qbsVar.b;
            s9sVar2 = qbsVar.a;
            try {
                uj50.b(obj);
                s9sVar3 = s9sVar2;
                hbsVar2 = (hbs) dq40Var.a;
                if (hbsVar2 != null) {
                    s9sVar3.d(hbsVar2);
                }
                return Unit.a;
            } catch (Throwable th2) {
                th = th2;
                hbsVar = (hbs) dq40Var.a;
                if (hbsVar != null) {
                    s9sVar2.d(hbsVar);
                }
                throw th;
            }
        }
        uj50.b(obj);
        if (s9sVar.b().compareTo(s9s.b.d) >= 0) {
            return Unit.a;
        }
        dq40 dq40Var2 = new dq40();
        try {
            qbsVar.a = s9sVar;
            qbsVar.b = dq40Var2;
            qbsVar.d = 1;
            bc6 bc6Var = new bc6(1, yzo.b(qbsVar));
            bc6Var.q();
            ?? rbsVar = new rbs(bc6Var);
            dq40Var2.a = rbsVar;
            s9sVar.a(rbsVar);
            if (bc6Var.o() == y5bVar) {
                return y5bVar;
            }
            s9sVar3 = s9sVar;
            dq40Var = dq40Var2;
            hbsVar2 = (hbs) dq40Var.a;
            if (hbsVar2 != null) {
                s9sVar3.d(hbsVar2);
            }
            return Unit.a;
        } catch (Throwable th3) {
            s9sVar2 = s9sVar;
            dq40Var = dq40Var2;
            th = th3;
            hbsVar = (hbs) dq40Var.a;
            if (hbsVar != null) {
                s9sVar2.d(hbsVar);
            }
            throw th;
        }
    }
}
