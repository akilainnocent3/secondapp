package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkd50;", "Lihb0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kd50 extends ihb0 {
    public static final long F;
    public static final /* synthetic */ int G = 0;
    public final String A;
    public final String B;
    public final wwd0 C;
    public final ku90<ub50> D;
    public final t340 E;
    public final hd50 d;
    public final ri7 e;
    public final rdd0 f;
    public final mgb0 i;
    public final xq00 v;
    public final oyf w;
    public final qb50 y;
    public final String z;

    @c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordViewModel$handleAction$7", f = "ResetPasswordViewModel.kt", l = {119, 120}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return kd50.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r4.B1(r5) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 2
                r3 = 1
                kd50 r4 = defpackage.kd50.this
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                defpackage.uj50.b(r6)
                goto L36
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L2b
            L1d:
                defpackage.uj50.b(r6)
                r5.a = r3
                int r6 = defpackage.kd50.G
                java.lang.Object r6 = r4.A1(r5)
                if (r6 != r0) goto L2b
                goto L35
            L2b:
                r5.a = r2
                int r6 = defpackage.kd50.G
                java.lang.Object r5 = r4.B1(r5)
                if (r5 != r0) goto L36
            L35:
                return r0
            L36:
                ku90<ub50> r5 = r4.D
                ub50$b r6 = ub50.b.a
                r5.a(r6)
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kd50.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        b.a aVar = b.b;
        F = c.g(1.5d, rgf.SECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd50(hd50 hd50Var, ri7 ri7Var, rdd0 rdd0Var, vu60 vu60Var, mgb0 mgb0Var, xq00 xq00Var, oyf oyfVar) {
        super(0);
        ri7Var.getClass();
        rdd0Var.getClass();
        vu60Var.getClass();
        mgb0Var.getClass();
        xq00Var.getClass();
        oyfVar.getClass();
        this.d = hd50Var;
        this.e = ri7Var;
        this.f = rdd0Var;
        this.i = mgb0Var;
        this.v = xq00Var;
        this.w = oyfVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        qb50 qb50Var = (qb50) fnf.a(vu60Var, jq40.a(qb50.class), o2gVar);
        this.y = qb50Var;
        String str = qb50Var.a;
        if (str.length() == 0 && (str = (String) vu60Var.b("mobile")) == null) {
            str = "";
        }
        this.z = str;
        String str2 = qb50Var.b;
        if (str2.length() == 0 && (str2 = (String) vu60Var.b("token")) == null) {
            str2 = "";
        }
        this.A = str2;
        String str3 = (String) vu60Var.b("triggered_event");
        this.B = str3 != null ? str3 : "";
        this.C = xwd0.a(new dd50(0));
        ku90<ub50> ku90Var = new ku90<>();
        this.D = ku90Var;
        this.E = e1i.a(ku90Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(x1b x1bVar) {
        nd50 nd50Var;
        if (x1bVar instanceof nd50) {
            nd50Var = (nd50) x1bVar;
            int i = nd50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nd50Var.c = i - Integer.MIN_VALUE;
            } else {
                nd50Var = new nd50(this, x1bVar);
            }
        } else {
            nd50Var = new nd50(this, x1bVar);
        }
        Object objIsTwoFactorAuthEnabled = nd50Var.a;
        y5b y5bVar = y5b.a;
        int i2 = nd50Var.c;
        if (i2 == 0) {
            uj50.b(objIsTwoFactorAuthEnabled);
            if (Intrinsics.g(this.B, AnalyticsParam.FORCE_LOGOUT)) {
                nd50Var.c = 1;
                objIsTwoFactorAuthEnabled = this.i.isTwoFactorAuthEnabled(nd50Var);
                if (objIsTwoFactorAuthEnabled != y5bVar) {
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objIsTwoFactorAuthEnabled);
                return objIsTwoFactorAuthEnabled;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objIsTwoFactorAuthEnabled);
        if (!((Boolean) objIsTwoFactorAuthEnabled).booleanValue()) {
            mr00 mr00Var = mr00.NewDeviceLogin;
            Boolean bool = Boolean.TRUE;
            nd50Var.c = 2;
            Object objPutBoolean = this.v.a.putBoolean("show_two_fa_prompt", bool, nd50Var);
            return objPutBoolean == y5bVar ? y5bVar : objPutBoolean;
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B1(x1b x1bVar) {
        od50 od50Var;
        if (x1bVar instanceof od50) {
            od50Var = (od50) x1bVar;
            int i = od50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                od50Var.c = i - Integer.MIN_VALUE;
            } else {
                od50Var = new od50(this, x1bVar);
            }
        } else {
            od50Var = new od50(this, x1bVar);
        }
        Object objD = od50Var.a;
        y5b y5bVar = y5b.a;
        int i2 = od50Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            pd50 pd50Var = new pd50(this, null);
            od50Var.c = 1;
            objD = vxf0.d(F, pd50Var, od50Var);
            if (objD != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objD);
                return objD;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objD);
        if (!Intrinsics.g((Boolean) objD, Boolean.FALSE)) {
            return Unit.a;
        }
        mr00 mr00Var = mr00.NewDeviceLogin;
        Boolean bool = Boolean.TRUE;
        od50Var.c = 2;
        Object objPutBoolean = this.v.a.putBoolean("show_add_email_prompt", bool, od50Var);
        return objPutBoolean == y5bVar ? y5bVar : objPutBoolean;
    }

    public final void z1(rb50 rb50Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        rb50Var.getClass();
        wwd0 wwd0Var = this.C;
        dd50 dd50Var = (dd50) wwd0Var.getValue();
        boolean z = rb50Var instanceof rb50.b;
        ku90<ub50> ku90Var = this.D;
        if (z) {
            ku90Var.a(new ub50.c(this.A, dd50Var.a.a.b));
            return;
        }
        if (rb50Var.equals(rb50.f.a)) {
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, dd50.a((dd50) value6, null, !dd50Var.b, null, null, null, 29)));
            return;
        }
        if (rb50Var instanceof rb50.e) {
            ijf0 ijf0Var = ((rb50.e) rb50Var).a;
            if (!StringsKt.U(ijf0Var.a.b)) {
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, dd50.a((dd50) value5, null, false, uxs.ENABLE, null, null, 27)));
            }
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, dd50.a((dd50) value4, ijf0Var, false, null, vch0.a, null, 22)));
            return;
        }
        if (rb50Var.equals(rb50.a.a)) {
            do {
                value3 = wwd0Var.getValue();
                StringUiText stringUiText = vch0.a;
            } while (!wwd0Var.g(value3, dd50.a((dd50) value3, null, false, null, null, new sb50.a(new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again), rb50.d.a), 15)));
        } else if (rb50Var.equals(rb50.d.a)) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, dd50.a((dd50) value2, null, false, null, null, sb50.b.a, 15)));
        } else if (rb50Var.equals(rb50.c.a)) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, dd50.a((dd50) value, null, false, null, null, sb50.b.a, 15)));
            ku90Var.a(ub50.b.a);
        } else if (rb50Var.equals(rb50.g.a)) {
            ej5.c(o8i0.d(this), null, null, new a(null), 3);
        } else {
            uhc.a();
        }
    }
}
