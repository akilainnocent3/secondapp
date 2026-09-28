package defpackage;

import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.b;
import com.sportygames.newcms.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qq4 extends j8i0 {
    public final utm A;
    public String B;
    public boolean C;
    public boolean D;
    public dm8 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final v340 I;
    public final en20 a;
    public final gum b;
    public final gsm c;
    public final rrm d;
    public final uym e;
    public final ism f;
    public final d i;
    public final ntm v;
    public final dtm w;
    public final a0n y;
    public final otm z;

    public qq4(en20 en20Var, gum gumVar, gsm gsmVar, rrm rrmVar, uym uymVar, ism ismVar, d dVar, ntm ntmVar, dtm dtmVar, a0n a0nVar, otm otmVar, utm utmVar) {
        en20Var.getClass();
        gumVar.getClass();
        gsmVar.getClass();
        rrmVar.getClass();
        uymVar.getClass();
        ismVar.getClass();
        dVar.getClass();
        ntmVar.getClass();
        dtmVar.getClass();
        a0nVar.getClass();
        otmVar.getClass();
        utmVar.getClass();
        this.a = en20Var;
        this.b = gumVar;
        this.c = gsmVar;
        this.d = rrmVar;
        this.e = uymVar;
        this.f = ismVar;
        this.i = dVar;
        this.v = ntmVar;
        this.w = dtmVar;
        this.y = a0nVar;
        this.z = otmVar;
        this.A = utmVar;
        this.B = "";
        this.F = xwd0.a(new b(0));
        this.G = xwd0.a(txs.a);
        this.H = xwd0.a(yxx.a);
        this.I = e1i.e(en20Var.getBooleanByFlow("BONUS_CUP_SOUND_KEY", true), o8i0.d(this), q490.a.a, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(x1b x1bVar) {
        nq4 nq4Var;
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        if (x1bVar instanceof nq4) {
            nq4Var = (nq4) x1bVar;
            int i = nq4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq4Var.c = i - Integer.MIN_VALUE;
            } else {
                nq4Var = new nq4(this, x1bVar);
            }
        } else {
            nq4Var = new nq4(this, x1bVar);
        }
        Object obj = nq4Var.a;
        Object obj2 = y5b.a;
        int i2 = nq4Var.c;
        wwd0 wwd0Var = this.G;
        if (i2 == 0) {
            uj50.b(obj);
            this.E = em8.a();
            do {
                value = wwd0Var.getValue();
                objA = (pp4) value;
                eku ekuVar = objA instanceof eku ? (eku) objA : null;
                if (ekuVar != null) {
                    objA = eku.a(ekuVar, true, false, false, 508);
                }
            } while (!wwd0Var.g(value, objA));
            nq4Var.c = 1;
            if (y1(nq4Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        do {
            value2 = wwd0Var.getValue();
            objA2 = (pp4) value2;
            eku ekuVar2 = objA2 instanceof eku ? (eku) objA2 : null;
            if (ekuVar2 != null) {
                objA2 = eku.a(ekuVar2, false, false, false, 510);
            }
        } while (!wwd0Var.g(value2, objA2));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B1(x1b x1bVar) {
        pq4 pq4Var;
        dm8 dm8Var;
        if (x1bVar instanceof pq4) {
            pq4Var = (pq4) x1bVar;
            int i = pq4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq4Var.d = i - Integer.MIN_VALUE;
            } else {
                pq4Var = new pq4(this, x1bVar);
            }
        } else {
            pq4Var = new pq4(this, x1bVar);
        }
        Object obj = pq4Var.b;
        y5b y5bVar = y5b.a;
        int i2 = pq4Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            dm8 dm8Var2 = this.E;
            if (dm8Var2 == null) {
                return Unit.a;
            }
            pq4Var.a = dm8Var2;
            pq4Var.d = 1;
            if (dm8Var2.q(pq4Var) == y5bVar) {
                return y5bVar;
            }
            dm8Var = dm8Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dm8Var = pq4Var.a;
            uj50.b(obj);
        }
        if (Intrinsics.g(this.E, dm8Var)) {
            this.E = null;
        }
        return Unit.a;
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.f.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r7.b.a(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (kotlin.Unit.a == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(defpackage.x1b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.tp4
            if (r0 == 0) goto L13
            r0 = r8
            tp4 r0 = (defpackage.tp4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tp4 r0 = new tp4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L39
            if (r2 == r6) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            goto L31
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L31:
            defpackage.uj50.b(r8)
            goto L72
        L35:
            defpackage.uj50.b(r8)
            goto L47
        L39:
            defpackage.uj50.b(r8)
            r0.c = r6
            gsm r8 = r7.c
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L47
            goto L71
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L72
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5c
            r0.c = r5
            gum r7 = r7.b
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L72
            goto L71
        L5c:
            mmx r8 = new mmx
            java.lang.String r2 = r7.B
            r8.<init>(r2)
            r0.c = r4
            wwd0 r7 = r7.H
            r7.getClass()
            r7.k(r3, r8)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.x1(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (defpackage.hkd.b(1000, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.x1b r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.mq4
            if (r0 == 0) goto L13
            r0 = r9
            mq4 r0 = (defpackage.mq4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mq4 r0 = new mq4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            defpackage.uj50.b(r9)
            goto L71
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L36:
            defpackage.uj50.b(r9)
            goto L61
        L3a:
            defpackage.uj50.b(r9)
            goto L51
        L3e:
            defpackage.uj50.b(r9)
            ti4 r9 = defpackage.ti4.w0
            com.sportygames.newcms.CMSRes r9 = r9.q0
            r8.z1(r9)
            r0.c = r5
            java.lang.Object r9 = defpackage.hkd.b(r6, r0)
            if (r9 != r1) goto L51
            goto L70
        L51:
            ti4 r9 = defpackage.ti4.w0
            com.sportygames.newcms.CMSRes r9 = r9.r0
            r8.z1(r9)
            r0.c = r4
            java.lang.Object r9 = defpackage.hkd.b(r6, r0)
            if (r9 != r1) goto L61
            goto L70
        L61:
            ti4 r9 = defpackage.ti4.w0
            com.sportygames.newcms.CMSRes r9 = r9.s0
            r8.z1(r9)
            r0.c = r3
            java.lang.Object r8 = defpackage.hkd.b(r6, r0)
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq4.y1(x1b):java.lang.Object");
    }

    public final void z1(CMSRes cMSRes) {
        if (((Boolean) this.I.a.getValue()).booleanValue()) {
            ((b) this.F.getValue()).c(cMSRes);
        }
    }
}
