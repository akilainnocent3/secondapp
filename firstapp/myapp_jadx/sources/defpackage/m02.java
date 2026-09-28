package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.model.event.InsufficientFundsCallbackType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m02 extends k72 implements u290 {
    public final /* synthetic */ u290 Z;
    public final eth0 a0;
    public final rdd0 b0;
    public final uqm c0;
    public final cbg d0;
    public final log0 e0;
    public final boolean f0;
    public final ArrayList g0;
    public final ku90<z7e> h0;
    public final ku90 i0;
    public final mpe0 j0;
    public final v340 k0;

    public static final class a implements lyh<lod> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ m02 b;

        /* JADX INFO: renamed from: m02$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel$depositAmountValidationFlow_delegate$lambda$0$$inlined$map$1", f = "BaseDepositViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0845a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0845a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ m02 b;

            /* JADX INFO: renamed from: m02$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel$depositAmountValidationFlow_delegate$lambda$0$$inlined$map$1$2", f = "BaseDepositViewModel.kt", l = {51, 50}, m = "emit", v = 2)
            public static final class C0846a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;

                public C0846a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, m02 m02Var) {
                this.a = myhVar;
                this.b = m02Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
            
                if (r6.emit(r8, r0) == r1) goto L21;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, defpackage.v1b r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof m02.a.b.C0846a
                    if (r0 == 0) goto L13
                    r0 = r8
                    m02$a$b$a r0 = (m02.a.b.C0846a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    m02$a$b$a r0 = new m02$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L37
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L2b
                    defpackage.uj50.b(r8)
                    goto L5a
                L2b:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r6)
                    return r5
                L31:
                    myh r6 = r0.d
                    defpackage.uj50.b(r8)
                    goto L4f
                L37:
                    defpackage.uj50.b(r8)
                    xyx r7 = (defpackage.xyx) r7
                    m02 r8 = r6.b
                    eth0 r8 = r8.a0
                    java.math.BigDecimal r7 = r7.c
                    myh r6 = r6.a
                    r0.d = r6
                    r0.b = r4
                    java.lang.Object r8 = r8.a(r7, r0)
                    if (r8 != r1) goto L4f
                    goto L59
                L4f:
                    r0.d = r5
                    r0.b = r3
                    java.lang.Object r6 = r6.emit(r8, r0)
                    if (r6 != r1) goto L5a
                L59:
                    return r1
                L5a:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: m02.a.b.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public a(g1i g1iVar, m02 m02Var) {
            this.a = g1iVar;
            this.b = m02Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lod> myhVar, v1b v1bVar) {
            C0845a c0845a;
            if (v1bVar instanceof C0845a) {
                c0845a = (C0845a) v1bVar;
                int i = c0845a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0845a.b = i - Integer.MIN_VALUE;
                } else {
                    c0845a = new C0845a(v1bVar);
                }
            } else {
                c0845a = new C0845a(v1bVar);
            }
            Object obj = c0845a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0845a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0845a.b = 1;
                if (this.a.collect(bVar, c0845a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<uw> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel$special$$inlined$map$1", f = "BaseDepositViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: m02$b$b, reason: collision with other inner class name */
        public static final class C0847b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: m02$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel$special$$inlined$map$1$2", f = "BaseDepositViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0847b.this.emit(null, this);
                }
            }

            public C0847b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    List list = (List) obj;
                    uw uwVar = new uw(list, !list.isEmpty());
                    aVar.b = 1;
                    if (this.a.emit(uwVar, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uw> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C0847b c0847b = new C0847b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0847b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(uyx uyxVar, eth0 eth0Var, rdd0 rdd0Var, uy0 uy0Var, d100 d100Var, lyz lyzVar, wl wlVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, u290 u290Var, cbg cbgVar, vu60 vu60Var) {
        super(uyxVar, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var);
        rdd0Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        u290Var.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.Z = u290Var;
        this.a0 = eth0Var;
        this.b0 = rdd0Var;
        this.c0 = uqmVar;
        this.d0 = cbgVar;
        this.e0 = log0.a;
        Boolean bool = (Boolean) vu60Var.b("EXTRA_FROM_GAME");
        int i = 0;
        this.f0 = bool != null ? bool.booleanValue() : false;
        this.g0 = new ArrayList();
        ku90<z7e> ku90Var = new ku90<>();
        this.h0 = ku90Var;
        this.i0 = ku90Var;
        this.j0 = hwr.b(new k02(this, i));
        this.k0 = e1i.e(new f1i(new b(d100Var.Q())), o8i0.d(this), q490.a.a, new uw(0));
        xwd0.a(xi7.b.a);
    }

    @Override // defpackage.k72
    /* JADX INFO: renamed from: C1 */
    public log0 getM0() {
        return this.e0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G1(String str, Function1 function1, x1b x1bVar) {
        l02 l02Var;
        if (x1bVar instanceof l02) {
            l02Var = (l02) x1bVar;
            int i = l02Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l02Var.d = i - Integer.MIN_VALUE;
            } else {
                l02Var = new l02(this, x1bVar);
            }
        } else {
            l02Var = new l02(this, x1bVar);
        }
        Object objInvoke = l02Var.b;
        y5b y5bVar = y5b.a;
        int i2 = l02Var.d;
        if (i2 == 0) {
            uj50.b(objInvoke);
            l02Var.a = str;
            l02Var.d = 1;
            objInvoke = function1.invoke(l02Var);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = l02Var.a;
            uj50.b(objInvoke);
        }
        ds dsVar = (ds) objInvoke;
        if (dsVar instanceof ds.c) {
            str.getClass();
            this.g0.add(str);
        }
        dsVar.getClass();
        return Boolean.valueOf(dsVar instanceof ds.a);
    }

    public final lyh<lod> H1() {
        return (lyh) this.j0.getValue();
    }

    public final wzd I1() {
        return this.f0 ? wzd.a.a : wzd.b.a;
    }

    @Override // defpackage.k72
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public abstract a300 B1();

    public final void K1() {
        this.g0.clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L1(xi7 xi7Var, x1b x1bVar) throws Throwable {
        q02 q02Var;
        if (x1bVar instanceof q02) {
            q02Var = (q02) x1bVar;
            int i = q02Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q02Var.c = i - Integer.MIN_VALUE;
            } else {
                q02Var = new q02(this, x1bVar);
            }
        } else {
            q02Var = new q02(this, x1bVar);
        }
        Object objO = q02Var.a;
        y5b y5bVar = y5b.a;
        int i2 = q02Var.c;
        rdd0 rdd0Var = this.b0;
        if (i2 == 0) {
            uj50.b(objO);
            if (!(xi7Var instanceof xi7.a)) {
                return ds.b.a;
            }
            rdd0Var.a(new knd("insufficient_fund"), k00.d);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__avoid_deposit_issues);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__insufficient_balance_notification_content);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_payment__i_have_checked_my_payment_details);
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__top_up_now);
            ResourceUiText resourceUiText5 = new ResourceUiText(R.string.common_functions__return);
            q02Var.c = 1;
            bc6 bc6Var = new bc6(1, yzo.b(q02Var));
            bc6Var.q();
            this.h0.a(new z7e.g(resourceUiText, resourceUiText2, resourceUiText3, resourceUiText4, resourceUiText5, new d8e(bc6Var)));
            objO = bc6Var.o();
            if (objO == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objO);
        }
        InsufficientFundsCallbackType insufficientFundsCallbackType = (InsufficientFundsCallbackType) objO;
        if (Intrinsics.g(insufficientFundsCallbackType, InsufficientFundsCallbackType.Positive.a)) {
            rdd0Var.a(new jnd("insufficient_fund", "primary", "common_functions__top_up_now"), k00.d);
        } else if (Intrinsics.g(insufficientFundsCallbackType, InsufficientFundsCallbackType.Negative.a)) {
            rdd0Var.a(new jnd("insufficient_fund", "secondary", "common_functions__return"), k00.d);
        }
        return !(insufficientFundsCallbackType instanceof InsufficientFundsCallbackType.Positive) ? ds.a.a : ds.c.a;
    }

    public final void M1() {
        this.b0.a(new ond(0), k00.d);
    }

    @Override // defpackage.u290
    public uwd0<String> x0() {
        return this.Z.x0();
    }
}
