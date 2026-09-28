package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class tlu implements mlu {
    public final rdd0 a;
    public et7 b;
    public vtw<com.sporty.android.common.uievent.a> c;
    public vtw<z7e> d;
    public final wwd0 e;
    public final wwd0 f;
    public jvd0 i;
    public final v340 v;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.MaintenanceTimerManagerImpl", f = "MaintenanceTimerManager.kt", l = {125}, m = "resolveMaintenanceAlert", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return tlu.this.M(null, this);
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.MaintenanceTimerManagerImpl", f = "MaintenanceTimerManager.kt", l = {192, 199}, m = "resolveMaintenanceAlertWithPayBill", v = 2)
    public static final class b extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public b(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return tlu.this.f0(null, false, null, this);
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.MaintenanceTimerManagerImpl$updateMaintenanceFinishEpochMillis$1", f = "MaintenanceTimerManager.kt", l = {115}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ tlu c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, tlu tluVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = j;
            this.c = tluVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(this.b, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.c.e.setValue(null);
            return Unit.a;
        }
    }

    public tlu(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.e = xwd0.a(null);
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.f = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
    }

    @Override // defpackage.mlu
    public final void C0(vtw vtwVar, vtw vtwVar2, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        this.c = vtwVar;
        this.d = vtwVar2;
        this.b = et7Var;
        g1i g1iVar = new g1i(new rlu(this.e), new slu(this, null));
        et7 et7Var2 = this.b;
        if (et7Var2 != null) {
            kzh.d(g1iVar, et7Var2);
        } else {
            Intrinsics.n("scope");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mlu
    public final Object M(DepositDropAlertStatus depositDropAlertStatus, v1b<? super ds> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object objA = aVar.a;
        Object obj = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            DepositDropAlertStatus.MaintenanceAlert maintenanceAlert = depositDropAlertStatus instanceof DepositDropAlertStatus.MaintenanceAlert ? (DepositDropAlertStatus.MaintenanceAlert) depositDropAlertStatus : null;
            if (maintenanceAlert == null) {
                return ds.b.a;
            }
            aVar.c = 1;
            objA = a(maintenanceAlert, aVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        return ((Boolean) objA).booleanValue() ? ds.c.a : ds.a.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(DepositDropAlertStatus.MaintenanceAlert maintenanceAlert, x1b x1bVar) {
        qlu qluVar;
        Object resourceUiText;
        if (x1bVar instanceof qlu) {
            qluVar = (qlu) x1bVar;
            int i = qluVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qluVar.c = i - Integer.MIN_VALUE;
            } else {
                qluVar = new qlu(this, x1bVar);
            }
        } else {
            qluVar = new qlu(this, x1bVar);
        }
        qlu qluVar2 = qluVar;
        Object objF = qluVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = qluVar2.c;
        rdd0 rdd0Var = this.a;
        if (i2 == 0) {
            uj50.b(objF);
            if (this.c == null) {
                return Boolean.FALSE;
            }
            String strA = hod.a(maintenanceAlert.b);
            if (StringsKt.U(strA)) {
                resourceUiText = strA;
                resourceUiText = null;
            }
            if (resourceUiText == null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.page_payment__to_be_announced);
            }
            rdd0Var.a(new knd("system_maintenance"), k00.d);
            vtw<com.sporty.android.common.uievent.a> vtwVar = this.c;
            if (vtwVar == null) {
                Intrinsics.n("commonUiEventFlow");
                throw null;
            }
            StringUiText stringUiText2 = vch0.a;
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__provider_maintenance_dialog_title);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_payment__provider_maintenance_dialog_content, ay0.S(new Object[]{resourceUiText}));
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.page_payment__use_alternative);
            ResourceUiText resourceUiText5 = new ResourceUiText(R.string.common_functions__proceed_anyway);
            Integer num = new Integer(R.style.Widget_Payment_PendingRequest_AlertDialog);
            qluVar2.c = 1;
            objF = com.sporty.android.common.uievent.b.f(vtwVar, resourceUiText2, resourceUiText3, null, resourceUiText4, resourceUiText5, num, null, qluVar2, 164);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) objF;
        if (Intrinsics.g(alertDialogCallbackType, AlertDialogCallbackType.Negative.a)) {
            rdd0Var.a(new jnd("system_maintenance", "secondary", "common_functions__proceed_anyway"), k00.d);
        } else if (Intrinsics.g(alertDialogCallbackType, AlertDialogCallbackType.Positive.a)) {
            rdd0Var.a(new jnd("system_maintenance", "primary", "page_payment__use_alternative"), k00.d);
        }
        alertDialogCallbackType.getClass();
        return Boolean.valueOf(alertDialogCallbackType instanceof AlertDialogCallbackType.Negative);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r10 == r1) goto L54;
     */
    @Override // defpackage.mlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus r7, boolean r8, defpackage.x000 r9, defpackage.v1b<? super defpackage.z000> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlu.f0(com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus, boolean, x000, v1b):java.lang.Object");
    }

    @Override // defpackage.mlu
    public final void q1(Long l) {
        if (l == null || this.b == null) {
            return;
        }
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.i = null;
        long jLongValue = l.longValue() - System.currentTimeMillis();
        wwd0 wwd0Var = this.e;
        if (jLongValue <= 0) {
            wwd0Var.setValue(null);
            return;
        }
        wwd0Var.k(null, l);
        et7 et7Var = this.b;
        if (et7Var != null) {
            this.i = ej5.c(et7Var, null, null, new c(jLongValue, this, null), 3);
        } else {
            Intrinsics.n("scope");
            throw null;
        }
    }

    @Override // defpackage.mlu
    public final uwd0<Boolean> r0() {
        return this.v;
    }
}
