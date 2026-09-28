package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w9e extends k8i0 {
    public final ha00 b;
    public final d100 c;
    public final uy0 d;
    public final dak e;
    public final jak f;
    public final wwd0 g;
    public final f1i h;
    public final wwd0 i;
    public final v340 j;
    public final wwd0 k;
    public final v340 l;
    public final String m;
    public pjd n;
    public KycLimitData o;
    public FullSummaryData p;

    @c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl$getBankTrade$1", f = "DepositWithdrawDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return w9e.this.new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final w9e w9eVar = w9e.this;
            w9eVar.g.setValue(lk50.b.a);
            w9eVar.b.a(w9eVar.a(), this.b, new Function1() { // from class: v9e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    lk50 lk50Var = (lk50) obj2;
                    boolean z = lk50Var instanceof lk50.c;
                    w9e w9eVar2 = w9eVar;
                    if (z) {
                        w9eVar2.g.k(null, new lk50.c(((BaseResponse) ((lk50.c) lk50Var).a).data));
                    } else if (lk50Var instanceof lk50.a) {
                        w9eVar2.g.k(null, new lk50.a(new Throwable()));
                    } else if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    return Unit.a;
                }
            });
            return Unit.a;
        }
    }

    public w9e(ha00 ha00Var, d100 d100Var, uy0 uy0Var, dak dakVar, jak jakVar) {
        v4c v4cVar = v4c.a;
        d100Var.getClass();
        uy0Var.getClass();
        this.b = ha00Var;
        this.c = d100Var;
        this.d = uy0Var;
        this.e = dakVar;
        this.f = jakVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.g = wwd0VarA;
        this.h = new f1i(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.i = wwd0VarA2;
        this.j = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(m2g.a);
        this.k = wwd0VarA3;
        this.l = e1i.b(wwd0VarA3);
        this.m = v4cVar.f();
    }

    public final void b(String str) {
        str.getClass();
        ej5.c(a(), null, null, new a(str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r7 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, defpackage.x1b r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.x9e
            if (r0 == 0) goto L13
            r0 = r9
            x9e r0 = (defpackage.x9e) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            x9e r0 = new x9e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.uj50.b(r9)
            zi50 r9 = (defpackage.zi50) r9
            java.lang.Object r7 = r9.a
            goto L61
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L35:
            java.lang.String r8 = r0.b
            dak r7 = r0.a
            defpackage.uj50.b(r9)
            goto L52
        L3d:
            defpackage.uj50.b(r9)
            dak r9 = r7.e
            r0.a = r9
            r0.b = r8
            r0.e = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L4f
            goto L60
        L4f:
            r6 = r9
            r9 = r7
            r7 = r6
        L52:
            java.util.List r9 = (java.util.List) r9
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.io.Serializable r7 = r7.a(r0, r8, r9)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            java.lang.Throwable r8 = defpackage.zi50.a(r7)
            if (r8 == 0) goto L71
            itf0$a r9 = defpackage.itf0.a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Failed to load Pay Hint description lines"
            r9.f(r8, r1, r0)
        L71:
            boolean r8 = r7 instanceof zi50.b
            if (r8 == 0) goto L76
            goto L77
        L76:
            r5 = r7
        L77:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L7e
            m2g r7 = defpackage.m2g.a
            return r7
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.c(java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r7 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.x1b r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.y9e
            if (r0 == 0) goto L13
            r0 = r7
            y9e r0 = (defpackage.y9e) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            y9e r0 = new y9e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r7)
            goto L6d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            defpackage.uj50.b(r7)
            goto L45
        L35:
            defpackage.uj50.b(r7)
            pjd r7 = r6.n
            if (r7 == 0) goto L50
            r0.c = r5
            java.lang.Object r7 = r7.q(r0)
            if (r7 != r1) goto L45
            goto L6c
        L45:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L50
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L50
            goto L60
        L50:
            v5b r7 = r6.a()
            z9e r2 = new z9e
            r2.<init>(r6, r3)
            r5 = 3
            pjd r7 = defpackage.ej5.a(r7, r3, r2, r5)
            r6.n = r7
        L60:
            pjd r6 = r6.n
            if (r6 == 0) goto L70
            r0.c = r4
            java.lang.Object r7 = r6.q(r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r3 = r7
            java.util.List r3 = (java.util.List) r3
        L70:
            if (r3 != 0) goto L75
            m2g r6 = defpackage.m2g.a
            return r6
        L75:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9e.d(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, x1b x1bVar) throws Throwable {
        aae aaeVar;
        Object objPrevious;
        if (x1bVar instanceof aae) {
            aaeVar = (aae) x1bVar;
            int i = aaeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aaeVar.d = i - Integer.MIN_VALUE;
            } else {
                aaeVar = new aae(this, x1bVar);
            }
        } else {
            aaeVar = new aae(this, x1bVar);
        }
        Object objD = aaeVar.b;
        Object obj = y5b.a;
        int i2 = aaeVar.d;
        if (i2 == 0) {
            uj50.b(objD);
            if (str != null) {
                aaeVar.a = str;
                aaeVar.d = 1;
                objD = d(aaeVar);
                if (objD == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = aaeVar.a;
        uj50.b(objD);
        List list = (List) objD;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!Intrinsics.g(((PayHintData) objPrevious).methodId, str));
        PayHintData payHintData = (PayHintData) objPrevious;
        if (payHintData != null) {
            if (Intrinsics.g(payHintData.showDefaultAlert, Boolean.TRUE)) {
                return new ResourceUiText(R.string.page_payment__payment_alert_default);
            }
            String str2 = payHintData.alert;
            if (str2 != null && str2.length() != 0) {
                String str3 = payHintData.alert;
                if (str3 == null) {
                    str3 = "";
                }
                return new StringUiText(str3);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ga00 ga00Var, jak.a aVar, x1b x1bVar) {
        eae eaeVar;
        if (x1bVar instanceof eae) {
            eaeVar = (eae) x1bVar;
            int i = eaeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eaeVar.c = i - Integer.MIN_VALUE;
            } else {
                eaeVar = new eae(this, x1bVar);
            }
        } else {
            eaeVar = new eae(this, x1bVar);
        }
        Object objD = eaeVar.a;
        y5b y5bVar = y5b.a;
        int i2 = eaeVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            eaeVar.c = 1;
            objD = w5b.d(new kak(null, aVar, this.f, ga00Var), eaeVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        jak.b bVar = (jak.b) objD;
        Object obj = bVar.a;
        Object obj2 = bVar.b;
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_INT);
            aVar2.b(thA);
            Unit unit = Unit.a;
        }
        if (obj instanceof zi50.b) {
            obj = null;
        }
        this.p = (FullSummaryData) obj;
        Throwable thA2 = zi50.a(obj2);
        if (thA2 != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_INT);
            aVar3.b(thA2);
            Unit unit2 = Unit.a;
        }
        boolean z = obj2 instanceof zi50.b;
        this.o = (KycLimitData) (z ? null : obj2);
        return Boolean.valueOf(((bVar.a instanceof zi50.b) || z) ? false : true);
    }
}
