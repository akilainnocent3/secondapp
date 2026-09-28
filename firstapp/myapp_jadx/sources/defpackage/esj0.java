package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawalBaseFragmentLegacy$observeWithdrawResult$$inlined$collectWithLifecycle$default$1", f = "WithdrawalBaseFragmentLegacy.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class esj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lsj0 b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ lsj0 d;

    @c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawalBaseFragmentLegacy$observeWithdrawResult$$inlined$collectWithLifecycle$default$1$1", f = "WithdrawalBaseFragmentLegacy.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ lsj0 d;

        /* JADX INFO: renamed from: esj0$a$a, reason: collision with other inner class name */
        public static final class C0536a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ lsj0 b;

            public C0536a(v5b v5bVar, lsj0 lsj0Var) {
                this.b = lsj0Var;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                lk50 lk50Var = (lk50) t;
                boolean z = lk50Var instanceof lk50.b;
                lsj0 lsj0Var = this.b;
                if (z) {
                    ProgressButton progressButtonL1 = lsj0Var.l1();
                    if (progressButtonL1 != null) {
                        progressButtonL1.setLoading(true);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    lsj0Var.m1().C.setValue(null);
                    ProgressButton progressButtonL2 = lsj0Var.l1();
                    if (progressButtonL2 != null) {
                        progressButtonL2.setLoading(false);
                    }
                    lsj0Var.S0(r700.b, null);
                } else {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    ProgressButton progressButtonL3 = lsj0Var.l1();
                    if (progressButtonL3 != null) {
                        progressButtonL3.setLoading(false);
                    }
                    lsj0Var.m1().C.setValue(null);
                    xoj0 xoj0Var = (xoj0) ((lk50.c) lk50Var).a;
                    if (xoj0Var instanceof xoj0.d.j) {
                        xoj0.d.j jVar = (xoj0.d.j) xoj0Var;
                        String str = jVar.c;
                        lsj0Var.X = str;
                        int iOrdinal = jVar.b.ordinal();
                        if (iOrdinal == 0) {
                            lsj0Var.u1(str, null);
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            lsj0Var.n0(sn5.d(lsj0Var, R.string.page_payment__pending_request, new Object[0]), sn5.d(lsj0Var, R.string.common_payment_providers__pending_request_content, new Object[0]), c000.a.a);
                        }
                    } else if (xoj0Var instanceof xoj0.b.e) {
                        lsj0Var.X = ((xoj0.b.e) xoj0Var).c;
                    } else if (xoj0Var instanceof xoj0.d.h) {
                        lsj0Var.X = ((xoj0.d.h) xoj0Var).b;
                        lsj0Var.n0(sn5.d(lsj0Var, R.string.page_payment__pending_request, new Object[0]), sn5.d(lsj0Var, R.string.common_payment_providers__pending_request_content, new Object[0]), c000.a.a);
                    } else if (xoj0Var instanceof xoj0.d.f) {
                        lsj0Var.n0(sn5.d(lsj0Var, R.string.page_payment__pending_request, new Object[0]), sn5.d(lsj0Var, R.string.page_withdraw__your_account_is_under_review_to_ensure_safety_and_security, new Object[0]), c000.a.b);
                    } else if (xoj0Var instanceof xoj0.d.y) {
                        lsj0Var.U0(R.string.page_payment__you_will_need_tier_vnum_verification_for_this_withdraw_tip);
                    } else if (xoj0Var instanceof xoj0.d.z) {
                        lsj0Var.U0(R.string.page_payment__too_low_tier_for_period_withdraw_tip);
                    } else if (xoj0Var instanceof xoj0.d.a0) {
                        ble.e(lsj0Var.getContext(), lsj0Var.getParentFragmentManager(), null, R.string.page_payment__max_tier_must_wait_withdraw_tip);
                    } else if (xoj0Var instanceof xoj0.d.w) {
                        ble.e(lsj0Var.getContext(), lsj0Var.getParentFragmentManager(), null, R.string.page_payment__max_tier_lifetime_limit_withdraw_tip);
                    } else if (xoj0Var instanceof xoj0.b.a) {
                        String message = xoj0Var.getMessage();
                        if (message == null) {
                            message = sn5.d(lsj0Var, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                        }
                        c000.p0(lsj0Var, null, message, sn5.d(lsj0Var, R.string.common_functions__continue, new Object[0]), new fsj0(lsj0Var), sn5.d(lsj0Var, R.string.common_functions__cancel, new Object[0]), gsj0.a, 65);
                    } else if (xoj0Var instanceof xoj0.d.v) {
                        String strD = sn5.d(lsj0Var, R.string.page_withdraw__withdrawals_blocked, new Object[0]);
                        String strD2 = ((xoj0.d.v) xoj0Var).a;
                        if (strD2 == null) {
                            strD2 = sn5.d(lsj0Var, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                        }
                        lsj0Var.o0(strD, strD2, sn5.d(lsj0Var, R.string.common_functions__home, new Object[0]), new hsj0(lsj0Var), sn5.d(lsj0Var, R.string.self_exclusion__contact_customer_service, new Object[0]), new isj0(lsj0Var), false);
                    } else if (xoj0Var instanceof xoj0.d.t) {
                        String strD3 = sn5.d(lsj0Var, R.string.page_withdraw__withdrawals_blocked, new Object[0]);
                        String strD4 = ((xoj0.d.t) xoj0Var).a;
                        if (strD4 == null) {
                            strD4 = sn5.d(lsj0Var, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                        }
                        lsj0Var.o0(strD3, strD4, sn5.d(lsj0Var, R.string.common_functions__home, new Object[0]), new jsj0(lsj0Var), sn5.d(lsj0Var, R.string.common_functions__transactions, new Object[0]), new ksj0(lsj0Var), false);
                    } else {
                        r700 r700Var = r700.b;
                        String message2 = xoj0Var.getMessage();
                        if (message2 == null) {
                            message2 = sn5.d(lsj0Var, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                        }
                        lsj0Var.S0(r700Var, message2);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, lsj0 lsj0Var) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = lsj0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0536a c0536a = new C0536a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0536a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esj0(lsj0 lsj0Var, lyh lyhVar, v1b v1bVar, lsj0 lsj0Var2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = lsj0Var;
        this.c = lyhVar;
        this.d = lsj0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new esj0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((esj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
