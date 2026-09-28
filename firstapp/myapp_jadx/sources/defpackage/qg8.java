package defpackage;

import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqg8;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qg8 extends j8i0 {
    public final ssw A;
    public final ssw<vhg<emj0>> B;
    public final ssw C;
    public final ssw<cx> D;
    public final ssw E;
    public final ssw<String> F;
    public final ssw G;
    public final ssw<Boolean> H;
    public final ssw I;
    public final jlv J;
    public final ssw<List<String>> K;
    public final ssw<List<String>> L;
    public BigDecimal M;
    public final ssw<kmj0> N;
    public final ssw O;
    public final ssw<xu1> P;
    public final ssw Q;
    public final ssw<c0w> R;
    public final ssw S;
    public List<? extends wqe> T;
    public final ssw<vhg<wqe>> U;
    public final ssw V;
    public final ssw<ct.b> W;
    public final ssw<ct.a> X;
    public final jlv Y;
    public final wwd0 Z;
    public final g77 a;
    public final v340 a0;
    public final x8 b;
    public BigDecimal b0;
    public final uy0 c;
    public BigDecimal c0;
    public final xj8 d;
    public List<Range> d0;
    public final xqe e;
    public BigDecimal e0;
    public final ha00 f;
    public i41 f0;
    public final v340 g0;
    public final v340 h0;
    public final d100 i;
    public final phj0 v;
    public String w;
    public String y;
    public final ssw<o77> z;

    @c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawViewModel$refreshChannelAndHint$1", f = "CommonMobileMoneyWithdrawViewModel.kt", l = {212, 234}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return qg8.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        
            if (r11 == r3) goto L26;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qg8.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawViewModel$showWithdrawDropAlertFlow$1", f = "CommonMobileMoneyWithdrawViewModel.kt", l = {149}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<PaymentChannel, v1b<? super WithdrawAlertHintStatus>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = qg8.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentChannel paymentChannel, v1b<? super WithdrawAlertHintStatus> v1bVar) {
            return ((c) create(paymentChannel, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            PaymentChannel paymentChannel = (PaymentChannel) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            phj0 phj0Var = qg8.this.v;
            at.c cVar = new at.c(paymentChannel != null ? paymentChannel.getChannelShowName() : null, paymentChannel != null ? new Integer(paymentChannel.getPayChId()) : null, paymentChannel != null ? paymentChannel.getChannelSendName() : null);
            this.b = null;
            this.a = 1;
            Object objC = phj0Var.c(cVar, this);
            return objC == y5bVar ? y5bVar : objC;
        }
    }

    public qg8(g77 g77Var, x8 x8Var, uy0 uy0Var, xj8 xj8Var, xqe xqeVar, ha00 ha00Var, shj0 shj0Var, psm psmVar, d100 d100Var, phj0 phj0Var) {
        g77Var.getClass();
        x8Var.getClass();
        uy0Var.getClass();
        xj8Var.getClass();
        xqeVar.getClass();
        psmVar.getClass();
        d100Var.getClass();
        this.a = g77Var;
        this.b = x8Var;
        this.c = uy0Var;
        this.d = xj8Var;
        this.e = xqeVar;
        this.f = ha00Var;
        this.i = d100Var;
        this.v = phj0Var;
        y300.b bVar = new y300.b(psmVar.getCountryCode());
        ssw<o77> sswVar = new ssw<>();
        this.z = sswVar;
        this.A = sswVar;
        ssw<vhg<emj0>> sswVar2 = new ssw<>();
        this.B = sswVar2;
        this.C = sswVar2;
        ssw<cx> sswVar3 = new ssw<>(new cx());
        this.D = sswVar3;
        this.E = sswVar3;
        ssw<String> sswVar4 = new ssw<>();
        this.F = sswVar4;
        this.G = sswVar4;
        ssw<Boolean> sswVar5 = new ssw<>();
        this.H = sswVar5;
        this.I = sswVar5;
        jlv jlvVar = new jlv();
        jlvVar.m(Boolean.FALSE);
        jlvVar.n(sswVar3, new b(new jg8(jlvVar, 0)));
        this.J = jlvVar;
        ssw<List<String>> sswVar6 = new ssw<>();
        this.K = sswVar6;
        this.L = sswVar6;
        ssw<kmj0> sswVar7 = new ssw<>();
        this.N = sswVar7;
        this.O = sswVar7;
        ssw<xu1> sswVar8 = new ssw<>();
        this.P = sswVar8;
        this.Q = sswVar8;
        ssw<c0w> sswVar9 = new ssw<>(c0w.b.a);
        this.R = sswVar9;
        this.S = sswVar9;
        this.T = m2g.a;
        ssw<vhg<wqe>> sswVar10 = new ssw<>();
        this.U = sswVar10;
        this.V = sswVar10;
        ssw<ct.b> sswVar11 = new ssw<>();
        this.W = sswVar11;
        ssw<ct.a> sswVar12 = new ssw<>();
        this.X = sswVar12;
        final jlv jlvVar2 = new jlv();
        jlvVar2.n(sswVar11, new b(new Function1() { // from class: kg8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ct ctVar = (ct.b) obj;
                ct.a aVarD = this.X.d();
                if (ctVar == null && (aVarD == null || Intrinsics.g(aVarD.a, m7l.c.a))) {
                    ctVar = null;
                } else if (aVarD != null && !Intrinsics.g(aVarD.a, m7l.c.a)) {
                    ctVar = aVarD;
                }
                jlvVar2.m(ctVar);
                return Unit.a;
            }
        }));
        jlvVar2.n(sswVar12, new b(new Function1() { // from class: lg8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                ct.a aVar = (ct.a) obj;
                ct.b bVarD = this.W.d();
                if (bVarD == null && (aVar == null || Intrinsics.g(aVar.a, m7l.c.a))) {
                    obj2 = null;
                } else if (aVar == null || Intrinsics.g(aVar.a, m7l.c.a)) {
                    obj2 = aVar;
                    obj2 = bVarD;
                }
                obj2 = aVar;
                jlvVar2.m(obj2);
                return Unit.a;
            }
        }));
        this.Y = jlvVar2;
        wwd0 wwd0VarA = xwd0.a(null);
        this.Z = wwd0VarA;
        WithdrawAlertHintStatus.Gone gone = WithdrawAlertHintStatus.Gone.a;
        this.a0 = e1i.e(nb4.b(wwd0VarA, gone, new c(null)), o8i0.d(this), q490.a.b, gone);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.b0 = bigDecimal;
        this.c0 = bigDecimal;
        this.d0 = new ArrayList();
        bigDecimal.getClass();
        this.e0 = bigDecimal;
        this.f0 = i41.d.a;
        v340 v340VarE = e1i.e(new f1i(shj0Var.a(bVar)), o8i0.d(this), q490.a.a, new vw(BigDecimal.valueOf(0L), BigDecimal.valueOf(0L)));
        this.g0 = v340VarE;
        this.h0 = v340VarE;
    }

    public final void x1() {
        Object next;
        PaymentChannel paymentChannel = (PaymentChannel) this.Z.getValue();
        if (paymentChannel != null) {
            Iterator<T> it = this.T.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    ((wqe) next).getClass();
                }
            } while (paymentChannel.getPayChId() != 0);
            wqe wqeVar = (wqe) next;
            if (wqeVar != null) {
                this.U.m(new vhg<>(wqeVar));
            }
        }
    }

    public final void y1() {
        c0w.b bVar = c0w.b.a;
        ssw<c0w> sswVar = this.R;
        sswVar.m(bVar);
        v8 accountInfo = this.b.getAccountInfo();
        if ((accountInfo != null ? accountInfo.a : null) != null) {
            ej5.c(o8i0.d(this), null, null, new a(null), 3);
        } else {
            this.P.m(xu1.c);
            sswVar.m(new c0w.a(1));
        }
    }
}
