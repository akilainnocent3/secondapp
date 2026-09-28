package com.sportybet.android.globalpay.pixBtg.deposit;

import com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData;
import defpackage.af10;
import defpackage.c0d;
import defpackage.ebk;
import defpackage.i910;
import defpackage.i9e;
import defpackage.ib5;
import defpackage.j910;
import defpackage.k00;
import defpackage.mgb0;
import defpackage.qe10;
import defpackage.qnd;
import defpackage.tje0;
import defpackage.uf00;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.whn;
import defpackage.wi80;
import defpackage.wvd;
import defpackage.ww;
import defpackage.x7e;
import defpackage.y5b;
import defpackage.ycv;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$makeDeposit$1", f = "PixBtgDepositViewModel.kt", l = {671, 693, 691, 709}, m = "invokeSuspend", v = 2)
public final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ww a;
    public g b;
    public whn c;
    public BrDepositHotButtonConversionData d;
    public g e;
    public i9e f;
    public boolean i;
    public int v;
    public final /* synthetic */ g w;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$makeDeposit$1$1$3", f = "PixBtgDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<qnd, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ g b;
        public final /* synthetic */ whn c;
        public final /* synthetic */ ww d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, whn whnVar, ww wwVar, boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = gVar;
            this.c = whnVar;
            this.d = wwVar;
            this.e = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qnd qndVar, v1b<? super Unit> v1bVar) {
            return ((a) create(qndVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qnd qndVar = (qnd) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g gVar = this.b;
            gVar.E.a(this.c.a, gVar.S, qnd.e(qndVar, null, null, null, this.d, Boolean.valueOf(this.e), null, 10239), wi80.b(k00.c));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, v1b<? super k> v1bVar) {
        super(2, v1bVar);
        this.w = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k(this.w, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dc  */
    /* JADX WARN: Type inference failed for: r2v18, types: [i9e, whn, ww] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData, com.sportybet.android.globalpay.pixBtg.deposit.g, whn, ww] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        uf00<af10> uf00Var;
        boolean z;
        Object objX1;
        ww wwVar;
        boolean z2;
        g gVar;
        Throwable th;
        Object next;
        BrDepositHotButtonConversionData brDepositHotButtonConversionData;
        g gVar2;
        Object userId;
        whn whnVar;
        g gVar3;
        i9e i9eVar;
        boolean z3;
        ?? r2;
        Object objA;
        BrDepositHotButtonConversionData brDepositHotButtonConversionData2;
        g gVar4;
        ?? r3;
        g gVar5;
        y5b y5bVar = y5b.a;
        int i = this.v;
        g gVar6 = this.w;
        Throwable th2 = null;
        if (i == 0) {
            uj50.b(obj);
            f.c cVarZ1 = gVar6.z1();
            ww wwVar2 = (cVarZ1 != null ? cVarZ1.e : null) != null ? ww.PRESET : ww.MANUAL;
            f.c cVarZ2 = gVar6.z1();
            if (cVarZ2 == null || ((uf00Var = cVarZ2.d) != null && uf00Var.isEmpty())) {
                z = false;
                break;
            }
            Iterator<af10> it = uf00Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                af10 next2 = it.next();
                int i2 = next2.a;
                Integer num = cVarZ2.e;
                if (num != null && i2 == num.intValue() && next2.c) {
                    z = true;
                    break;
                }
            }
            this.a = wwVar2;
            this.i = z;
            this.v = 1;
            objX1 = gVar6.x1(this);
            if (objX1 != y5bVar) {
                wwVar = wwVar2;
                z2 = z;
            }
            return y5bVar;
        }
        if (i == 1) {
            z2 = this.i;
            ww wwVar3 = this.a;
            uj50.b(obj);
            wwVar = wwVar3;
            objX1 = obj;
        } else {
            if (i == 2) {
                z2 = this.i;
                i9eVar = this.f;
                g gVar7 = this.e;
                BrDepositHotButtonConversionData brDepositHotButtonConversionData3 = this.d;
                whn whnVar2 = this.c;
                g gVar8 = this.b;
                wwVar = this.a;
                uj50.b(obj);
                brDepositHotButtonConversionData = brDepositHotButtonConversionData3;
                gVar2 = gVar7;
                th = null;
                gVar3 = gVar8;
                userId = obj;
                whnVar = whnVar2;
                z3 = z2;
                String str = (String) userId;
                String str2 = (String) gVar3.G.a.b("pix_btg_current_amount");
                wvd.c cVar = new wvd.c(str, str2 != null ? str2 : "", whnVar.a, whnVar.b);
                a aVar = new a(gVar3, whnVar, wwVar, z3, null);
                r2 = th;
                this.a = r2;
                this.b = gVar3;
                this.c = r2;
                this.d = brDepositHotButtonConversionData;
                this.e = gVar2;
                this.f = r2;
                this.i = z3;
                this.v = 3;
                objA = i9eVar.a(cVar, aVar, this);
                if (objA != y5bVar) {
                    brDepositHotButtonConversionData2 = brDepositHotButtonConversionData;
                    gVar4 = gVar3;
                    r3 = r2;
                    this.a = r3;
                    this.b = gVar4;
                    this.c = r3;
                    this.d = r3;
                    this.e = r3;
                    this.i = z3;
                    this.v = 4;
                    if (gVar2.C1((x7e) objA, brDepositHotButtonConversionData2, this) != y5bVar) {
                        gVar5 = gVar4;
                    }
                }
                return y5bVar;
            }
            if (i == 3) {
                boolean z4 = this.i;
                g gVar9 = this.e;
                brDepositHotButtonConversionData2 = this.d;
                gVar4 = this.b;
                uj50.b(obj);
                z3 = z4;
                gVar2 = gVar9;
                r3 = 0;
                objA = obj;
                this.a = r3;
                this.b = gVar4;
                this.c = r3;
                this.d = r3;
                this.e = r3;
                this.i = z3;
                this.v = 4;
                if (gVar2.C1((x7e) objA, brDepositHotButtonConversionData2, this) != y5bVar) {
                    gVar5 = gVar4;
                }
                return y5bVar;
            }
            if (i != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar5 = this.b;
            uj50.b(obj);
        }
        gVar5.H1(new j910());
        return Unit.a;
        whn whnVar3 = (whn) objX1;
        BrDepositHotButtonConversionData brDepositHotButtonConversionData4 = new BrDepositHotButtonConversionData(whnVar3.e, wwVar == ww.PRESET);
        qe10 qe10VarA1 = gVar6.A1();
        String str3 = (String) gVar6.G.a.b("pix_btg_current_amount");
        if (str3 == null) {
            str3 = "";
        }
        qe10VarA1.getClass();
        long jC = ycv.c(v4c.a.c(str3) * 10000.0d);
        ebk.a aVar2 = qe10VarA1.g;
        if (aVar2 == null) {
            Intrinsics.n("pendingDepositsResult");
            throw null;
        }
        Iterator<T> it2 = aVar2.a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                gVar = gVar6;
                th = th2;
                next = th;
                break;
            }
            next = it2.next();
            ebk.b bVar = (ebk.b) next;
            long jB = qe10VarA1.b(bVar);
            th = th2;
            ebk.a aVar3 = qe10VarA1.g;
            if (aVar3 == null) {
                Intrinsics.n("pendingDepositsResult");
                throw th;
            }
            gVar = gVar6;
            if (jB > aVar3.c && bVar.b == jC) {
                break;
            }
            th2 = th;
            gVar6 = gVar;
        }
        ebk.b bVar2 = (ebk.b) next;
        if (bVar2 != null) {
            gVar.y1(new c.e(bVar2.a, bVar2.e, String.valueOf(bVar2.b), whnVar3.b, brDepositHotButtonConversionData4));
            return Unit.a;
        }
        brDepositHotButtonConversionData = brDepositHotButtonConversionData4;
        gVar2 = gVar;
        gVar2.H1(new i910());
        i9e i9eVar2 = gVar2.w;
        mgb0 mgb0Var = gVar2.y;
        this.a = wwVar;
        this.b = gVar2;
        this.c = whnVar3;
        this.d = brDepositHotButtonConversionData;
        this.e = gVar2;
        this.f = i9eVar2;
        this.i = z2;
        this.v = 2;
        userId = mgb0Var.getUserId(this);
        if (userId != y5bVar) {
            whnVar = whnVar3;
            gVar3 = gVar2;
            i9eVar = i9eVar2;
            z3 = z2;
            String str4 = (String) userId;
            String str5 = (String) gVar3.G.a.b("pix_btg_current_amount");
            wvd.c cVar2 = new wvd.c(str4, str5 != null ? str5 : "", whnVar.a, whnVar.b);
            a aVar4 = new a(gVar3, whnVar, wwVar, z3, null);
            r2 = th;
            this.a = r2;
            this.b = gVar3;
            this.c = r2;
            this.d = brDepositHotButtonConversionData;
            this.e = gVar2;
            this.f = r2;
            this.i = z3;
            this.v = 3;
            objA = i9eVar.a(cVar2, aVar4, this);
            if (objA != y5bVar) {
                brDepositHotButtonConversionData2 = brDepositHotButtonConversionData;
                gVar4 = gVar3;
                r3 = r2;
                this.a = r3;
                this.b = gVar4;
                this.c = r3;
                this.d = r3;
                this.e = r3;
                this.i = z3;
                this.v = 4;
                if (gVar2.C1((x7e) objA, brDepositHotButtonConversionData2, this) != y5bVar) {
                    gVar5 = gVar4;
                    gVar5.H1(new j910());
                    return Unit.a;
                }
            }
        }
        return y5bVar;
    }
}
