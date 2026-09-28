package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsv20;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sv20 extends j8i0 {
    public final lyz a;
    public final String b;
    public final ytw c;
    public final ytw d;
    public final wwd0 e;
    public final v340 f;
    public final b390 i;
    public final t340 v;
    public final v340 w;

    @c0d(c = "com.sportybet.feature.primaryphone.verifyidentity.PrimaryPhoneVerifyIdentityViewModel$confirmButtonStatus$1", f = "PrimaryPhoneVerifyIdentityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<d0i0, Boolean, Boolean, v1b<? super uxs>, Object> {
        public /* synthetic */ d0i0 a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(v1b<? super a> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(d0i0 d0i0Var, Boolean bool, Boolean bool2, v1b<? super uxs> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = sv20.this.new a(v1bVar);
            aVar.a = d0i0Var;
            aVar.b = zBooleanValue;
            aVar.c = zBooleanValue2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            d0i0 d0i0Var = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            sv20 sv20Var = sv20.this;
            ytw ytwVar = sv20Var.d;
            boolean z3 = false;
            if (!Intrinsics.g(sv20Var.b, SportyPinStatus.Enabled.getValue()) ? !(!z2 || Intrinsics.g(((zvz) ((x5a0) ytwVar).getValue()).a().a.b, d0i0Var.f)) : !(!z || !z2 || Intrinsics.g(((e010) ((x5a0) sv20Var.c).getValue()).a().a.b, d0i0Var.e) || Intrinsics.g(((zvz) ((x5a0) ytwVar).getValue()).a().a.b, d0i0Var.f))) {
                z3 = true;
            }
            if (d0i0Var.a) {
                return uxs.LOADING;
            }
            return z3 ? uxs.ENABLE : uxs.DISABLE;
        }
    }

    public sv20(lyz lyzVar, vu60 vu60Var) {
        lyzVar.getClass();
        vu60Var.getClass();
        this.a = lyzVar;
        Object objB = vu60Var.b("withdraw_pin_status");
        if (objB == null) {
            ib5.a("Required value was null.");
            throw null;
        }
        this.b = (String) objB;
        ytw ytwVarB = m.b(new e010());
        this.c = ytwVarB;
        ytw ytwVarB2 = m.b(new zvz());
        this.d = ytwVarB2;
        wwd0 wwd0VarA = xwd0.a(new d0i0(0));
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.i = b390VarB;
        this.v = e1i.a(b390VarB);
        this.w = e1i.e(r1i.a(wwd0VarA, ((e010) ((x5a0) ytwVarB).getValue()).h, ((zvz) ((x5a0) ytwVarB2).getValue()).h, new a(null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), uxs.DISABLE);
    }
}
