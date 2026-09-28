package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawalBaseFragmentLegacy$observeBankTrade$$inlined$collectWithLifecycle$default$1", f = "WithdrawalBaseFragmentLegacy.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class dsj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lsj0 b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ lsj0 d;

    @c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawalBaseFragmentLegacy$observeBankTrade$$inlined$collectWithLifecycle$default$1$1", f = "WithdrawalBaseFragmentLegacy.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ lsj0 d;

        /* JADX INFO: renamed from: dsj0$a$a, reason: collision with other inner class name */
        public static final class C0504a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ lsj0 b;

            public C0504a(v5b v5bVar, lsj0 lsj0Var) {
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
                    ProgressButton progressButtonL2 = lsj0Var.l1();
                    if (progressButtonL2 != null) {
                        progressButtonL2.setLoading(false);
                    }
                    lsj0Var.t1();
                    lsj0Var.m1().f.g.setValue(null);
                } else {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    ProgressButton progressButtonL3 = lsj0Var.l1();
                    if (progressButtonL3 != null) {
                        progressButtonL3.setLoading(false);
                    }
                    lsj0Var.m1().f.g.setValue(null);
                    int i = ((BankTradeData) ((lk50.c) lk50Var).a).status;
                    if (i == 10) {
                        c000.p0(lsj0Var, sn5.d(lsj0Var, R.string.page_payment__pending_request, new Object[0]), sn5.d(lsj0Var, R.string.page_payment__your_withdrawal_request_has_been_submitted_tip_pix, new Object[0]), null, new re7(1), null, null, 116);
                    } else if (i != 20) {
                        lsj0Var.t1();
                    } else {
                        String str = lsj0Var.X;
                        if (str != null) {
                            lsj0Var.u1(str, null);
                        }
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1i f1iVar, v1b v1bVar, lsj0 lsj0Var) {
            super(2, v1bVar);
            this.c = f1iVar;
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
                C0504a c0504a = new C0504a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0504a, this) == y5bVar) {
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
    public dsj0(lsj0 lsj0Var, f1i f1iVar, v1b v1bVar, lsj0 lsj0Var2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = lsj0Var;
        this.c = f1iVar;
        this.d = lsj0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new dsj0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dsj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
