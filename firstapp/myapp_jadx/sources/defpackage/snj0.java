package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsnj0;", "Lo82;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class snj0 extends o82 {
    public static final /* synthetic */ int z0 = 0;
    public final vh7 h0;
    public final d100 i0;
    public final sr10 j0;
    public final b700 k0;
    public final jtz l0;
    public final y300.c m0;
    public final wwd0 n0;
    public final wwd0 o0;
    public final ku90<onj0> p0;
    public final ku90 q0;
    public final wwd0 r0;
    public final List<lyh<lk50<Object>>> s0;
    public final k1i t0;
    public final wwd0 u0;
    public final wwd0 v0;
    public final wwd0 w0;
    public final wwd0 x0;
    public final v340 y0;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawPartnerViewModel$withdrawAmountValidationFlow$1", f = "WithdrawPartnerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<xyx, lk50<? extends AssetsInfo>, lk50<? extends ltz>, v1b<? super xhj0>, Object> {
        public /* synthetic */ xyx a;
        public /* synthetic */ lk50 b;
        public /* synthetic */ lk50 c;

        public a(v1b<? super a> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(xyx xyxVar, lk50<? extends AssetsInfo> lk50Var, lk50<? extends ltz> lk50Var2, v1b<? super xhj0> v1bVar) {
            a aVar = snj0.this.new a(v1bVar);
            aVar.a = xyxVar;
            aVar.b = lk50Var;
            aVar.c = lk50Var2;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ltz ltzVar;
            AssetsInfo assetsInfo;
            y300.c cVar = snj0.this.m0;
            xyx xyxVar = this.a;
            lk50 lk50Var = this.b;
            lk50 lk50Var2 = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BigDecimal bigDecimal = xyxVar.c;
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (Intrinsics.g(bigDecimal, bigDecimal2)) {
                return xhj0.d.a;
            }
            cVar.getClass();
            BigDecimal bigDecimal3 = (BigDecimal) y300.c.n().getUpper();
            cVar.getClass();
            BigDecimal bigDecimal4 = (BigDecimal) y300.c.n().getLower();
            if (bigDecimal3 == null || bigDecimal4 == null) {
                itf0.a.d("The upper and lower local limits have not been initialized yet.", new Object[0]);
                return xhj0.j.a;
            }
            lk50.c cVar2 = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            BigDecimal bigDecimalB = (cVar2 == null || (assetsInfo = (AssetsInfo) cVar2.a) == null) ? null : ty0.b(assetsInfo);
            if (bigDecimal.compareTo(bigDecimal3) > 0) {
                return new xhj0.g(bigDecimal3);
            }
            if (bigDecimal.compareTo(bigDecimal4) < 0) {
                return new xhj0.h(bigDecimal4);
            }
            if (bigDecimalB == null) {
                bigDecimal2.getClass();
                return new xhj0.e(bigDecimal2);
            }
            lk50.c cVar3 = lk50Var2 instanceof lk50.c ? (lk50.c) lk50Var2 : null;
            if (cVar3 == null || (ltzVar = (ltz) cVar3.a) == null) {
                return xhj0.j.a;
            }
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(ltzVar.a);
            bigDecimalMultiply.getClass();
            BigDecimal bigDecimalMin = bigDecimalMultiply.setScale(2, RoundingMode.HALF_UP).min(ltzVar.b);
            bigDecimalMin.getClass();
            return bigDecimal.compareTo(bigDecimalB.subtract(bigDecimalMin)) > 0 ? new xhj0.a(bigDecimal, bigDecimalMin) : xhj0.i.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawPartnerViewModel$withdrawableStateFlow$1", f = "WithdrawPartnerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<xhj0, itz, v1b<? super Boolean>, Object> {
        public /* synthetic */ xhj0 a;
        public /* synthetic */ itz b;

        @Override // defpackage.gaj
        public final Object invoke(xhj0 xhj0Var, itz itzVar, v1b<? super Boolean> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = xhj0Var;
            bVar.b = itzVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xhj0 xhj0Var = this.a;
            itz itzVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(Intrinsics.g(xhj0Var, xhj0.i.a) && Intrinsics.g(itzVar, itz.c.a));
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawPartnerViewModel$withdrawableStateFlow$2", f = "WithdrawPartnerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = snj0.this.new c(v1bVar);
            cVar.a = ((Boolean) obj).booleanValue();
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((c) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = snj0.this.n0;
            if (wwd0Var.getValue() instanceof c330.a) {
                bkj0.a(z, null, wwd0Var, null);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snj0(uyx uyxVar, juh0 juh0Var, vh7 vh7Var, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, psm psmVar, mgb0 mgb0Var, b700 b700Var, shj0 shj0Var, jtz jtzVar) {
        super(uyxVar, juh0Var, uy0Var, sr10Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, shj0Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        b700Var.getClass();
        jtzVar.getClass();
        this.h0 = vh7Var;
        this.i0 = d100Var;
        this.j0 = sr10Var;
        this.k0 = b700Var;
        this.l0 = jtzVar;
        this.m0 = new y300.c(psmVar.getCountryCode());
        wwd0 wwd0VarA = zjj0.a(null, false);
        this.n0 = wwd0VarA;
        this.o0 = wwd0VarA;
        ku90<onj0> ku90Var = new ku90<>();
        this.p0 = ku90Var;
        this.q0 = ku90Var;
        this.r0 = xwd0.a(-1);
        this.s0 = kotlin.collections.b.k(this.P, d100Var.a(pu0.b.a));
        k1i k1iVarA = r1i.a(this.T, this.P, d100Var.R(), new a(null));
        this.t0 = k1iVarA;
        wwd0 wwd0VarA2 = xwd0.a("");
        this.u0 = wwd0VarA2;
        this.v0 = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(itz.a.a);
        this.w0 = wwd0VarA3;
        this.x0 = wwd0VarA3;
        this.y0 = e1i.e(new g1i(new n1i(k1iVarA, wwd0VarA3, new b(3, null)), new c(null)), o8i0.d(this), q490.a.a, Boolean.FALSE);
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.s0;
    }

    @Override // defpackage.k72
    public final y200 B1() {
        return this.m0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return kotlin.collections.a.c(ej5.c(o8i0.d(this), null, null, new qnj0(this, null), 3));
    }

    @Override // defpackage.o82
    public final uwd0 G1() {
        return this.r0;
    }

    @Override // defpackage.o82
    public final lyh<xhj0> H1() {
        return this.t0;
    }

    @Override // defpackage.o82
    public final jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new rnj0(this, null), 3);
    }
}
