package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class rpj implements jtm {
    public final ktm a;
    public final yym b;
    public final ltm c;
    public boolean d;
    public boolean e;

    public rpj(ktm ktmVar, yym yymVar, ltm ltmVar) {
        ktmVar.getClass();
        yymVar.getClass();
        ltmVar.getClass();
        this.a = ktmVar;
        this.b = yymVar;
        this.c = ltmVar;
    }

    @Override // defpackage.jtm
    public final Long a(lpj lpjVar) {
        if (lpjVar instanceof lpj.c.d) {
            return new Long(400L);
        }
        if (!(lpjVar instanceof lpj.b.g)) {
            return null;
        }
        return this.c.b(((lpj.b.g) lpjVar).a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0334  */
    /* JADX WARN: Code duplicated, block: B:107:0x036f  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x04de  */
    /* JADX WARN: Code duplicated, block: B:162:0x0525  */
    /* JADX WARN: Code duplicated, block: B:166:0x0583  */
    /* JADX WARN: Code duplicated, block: B:169:0x0598  */
    /* JADX WARN: Code duplicated, block: B:170:0x059b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0384 -> B:112:0x038c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x03ad -> B:116:0x03b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0583 -> B:167:0x0594). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jtm
    public final java.lang.Object b(defpackage.pye r36, defpackage.x1b r37) {
        /*
            Method dump skipped, instruction units count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpj.b(pye, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, x1b x1bVar) {
        opj opjVar;
        up10 up10Var;
        if (x1bVar instanceof opj) {
            opjVar = (opj) x1bVar;
            int i = opjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                opjVar.d = i - Integer.MIN_VALUE;
            } else {
                opjVar = new opj(this, x1bVar);
            }
        } else {
            opjVar = new opj(this, x1bVar);
        }
        Object objH = opjVar.b;
        Object obj = y5b.a;
        int i2 = opjVar.d;
        if (i2 == 0) {
            uj50.b(objH);
            opjVar.a = j;
            opjVar.d = 1;
            objH = this.a.h();
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = opjVar.a;
            uj50.b(objH);
        }
        mpj mpjVar = (mpj) objH;
        if (mpjVar == null || (up10Var = mpjVar.e.get(new Long(j))) == null) {
            return null;
        }
        return up10Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, x1b x1bVar) {
        ppj ppjVar;
        up10 up10Var;
        if (x1bVar instanceof ppj) {
            ppjVar = (ppj) x1bVar;
            int i = ppjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ppjVar.d = i - Integer.MIN_VALUE;
            } else {
                ppjVar = new ppj(this, x1bVar);
            }
        } else {
            ppjVar = new ppj(this, x1bVar);
        }
        Object objH = ppjVar.b;
        Object obj = y5b.a;
        int i2 = ppjVar.d;
        if (i2 == 0) {
            uj50.b(objH);
            ppjVar.a = j;
            ppjVar.d = 1;
            objH = this.a.h();
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ppjVar.a;
            uj50.b(objH);
        }
        mpj mpjVar = (mpj) objH;
        return Boolean.valueOf((mpjVar == null || (up10Var = mpjVar.e.get(new Long(j))) == null) ? false : up10Var.b);
    }

    @Override // defpackage.jtm
    public final void reset() {
        this.e = false;
        this.d = false;
    }
}
