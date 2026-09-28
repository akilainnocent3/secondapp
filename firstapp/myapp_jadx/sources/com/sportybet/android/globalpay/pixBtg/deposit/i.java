package com.sportybet.android.globalpay.pixBtg.deposit;

import defpackage.a4h;
import defpackage.af10;
import defpackage.c0d;
import defpackage.ch30;
import defpackage.f910;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.m2g;
import defpackage.pjd;
import defpackage.s0i;
import defpackage.tje0;
import defpackage.u100;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.w75;
import defpackage.y5b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadQuickInputValues$1", f = "PixBtgDepositViewModel.kt", l = {560, 563}, m = "invokeSuspend", v = 2)
public final class i extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, v1b<? super i> v1bVar) {
        super(1, v1bVar);
        this.c = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new i(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((i) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0065 A[SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Iterable<BigDecimal> iterable;
        boolean z;
        ArrayList arrayList;
        Integer numValueOf;
        af10 af10Var;
        boolean z2;
        y5b y5bVar = y5b.a;
        int i2 = this.b;
        g gVar = this.c;
        if (i2 == 0) {
            uj50.b(obj);
            pjd pjdVar = gVar.N;
            this.b = 1;
            obj = pjdVar.q(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            uj50.b(obj);
        }
        iterable = (List) obj;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ch30 ch30Var = gVar.d;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        ch30Var.getClass();
        iterable.getClass();
        arrayList = new ArrayList();
        for (BigDecimal bigDecimal : iterable) {
            try {
                numValueOf = Integer.valueOf(bigDecimal.intValueExact());
            } catch (ArithmeticException e) {
                itf0.a.p(e, "Skipping invalid quick input value: " + bigDecimal, new Object[0]);
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                String strValueOf = String.valueOf(iIntValue);
                if (z || iIntValue != 100) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                af10Var = new af10(iIntValue, strValueOf, z2);
            } else {
                af10Var = null;
            }
            if (af10Var != null) {
                arrayList.add(af10Var);
            }
        }
        gVar.I1(new f910(a4h.f(arrayList), 0));
        return Unit.a;
        int i3 = obj == w75.VARIANT_1 ? 1 : 0;
        u100 u100VarQ = gVar.c.Q();
        this.a = i3;
        this.b = 2;
        Object objC = s0i.c(u100VarQ, this);
        if (objC != y5bVar) {
            int i4 = i3;
            obj = objC;
            i = i4;
            iterable = (List) obj;
            if (iterable == null) {
                iterable = m2g.a;
            }
            ch30 ch30Var2 = gVar.d;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            ch30Var2.getClass();
            iterable.getClass();
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                numValueOf = Integer.valueOf(bigDecimal.intValueExact());
                if (numValueOf != null) {
                    int iIntValue2 = numValueOf.intValue();
                    String strValueOf2 = String.valueOf(iIntValue2);
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    af10Var = new af10(iIntValue2, strValueOf2, z2);
                } else {
                    af10Var = null;
                }
                if (af10Var != null) {
                    arrayList.add(af10Var);
                }
            }
            gVar.I1(new f910(a4h.f(arrayList), 0));
            return Unit.a;
        }
        return y5bVar;
    }
}
