package defpackage;

import androidx.fragment.app.e;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$observeBankTrade$$inlined$collectWithLifecycle$default$1", f = "DepositBaseFragmentLegacy.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class crd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lrd b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ lrd d;

    @c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$observeBankTrade$$inlined$collectWithLifecycle$default$1$1", f = "DepositBaseFragmentLegacy.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ lrd d;

        /* JADX INFO: renamed from: crd$a$a, reason: collision with other inner class name */
        public static final class C0456a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ lrd b;

            public C0456a(v5b v5bVar, lrd lrdVar) {
                this.b = lrdVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                lk50<? extends BankTradeData> lk50Var = (lk50) t;
                final lrd lrdVar = this.b;
                lrdVar.t1(lk50Var);
                if (lk50Var instanceof lk50.b) {
                    ProgressButton progressButtonG1 = lrdVar.g1();
                    if (progressButtonG1 != null) {
                        progressButtonG1.setLoading(true);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    lrdVar.h1().f.g.setValue(null);
                    ProgressButton progressButtonG2 = lrdVar.g1();
                    if (progressButtonG2 != null) {
                        progressButtonG2.setLoading(false);
                    }
                    lrdVar.S0(r700.a, null);
                } else {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    lrdVar.h1().f.g.setValue(null);
                    ProgressButton progressButtonG3 = lrdVar.g1();
                    if (progressButtonG3 != null) {
                        progressButtonG3.setLoading(false);
                    }
                    BankTradeData bankTradeData = (BankTradeData) ((lk50.c) lk50Var).a;
                    int i = bankTradeData.status;
                    if (i == 10) {
                        bankTradeData.getClass();
                        c000.p0(lrdVar, sn5.d(lrdVar, R.string.page_payment__pending_request, new Object[0]), sn5.d(lrdVar, R.string.page_payment__deposit_pending_nuvei, new Object[0]), null, new Function0() { // from class: qqd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                e activity = lrdVar.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                                return Unit.a;
                            }
                        }, sn5.d(lrdVar, R.string.common_functions__transactions, new Object[0]), new Function0() { // from class: rqd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                lrd lrdVar2 = lrdVar;
                                fbh0 fbh0Var = lrdVar2.R;
                                if (fbh0Var == null) {
                                    Intrinsics.n("uiRouterManager");
                                    throw null;
                                }
                                fbh0Var.e(o7d.a(wae.ME_TRANSACTIONS));
                                e activity = lrdVar2.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                                return Unit.a;
                            }
                        }, 68);
                    } else if (i == 20) {
                        vgb0.a(AnalyticsEvent.DEPOSIT);
                        r9e r9eVarH1 = lrdVar.h1();
                        ej5.c(o8i0.d(r9eVarH1), null, null, new q9e(r9eVarH1, null), 3);
                        lrd.z1(lrdVar, null, bankTradeData, null, 29);
                    } else if (i != 80) {
                        lrdVar.S0(r700.a, null);
                    } else {
                        bankTradeData.getClass();
                        lrdVar.z0(String.valueOf(bankTradeData.payAmount), ga00.DEPOSIT);
                        ble.d(lrdVar.requireContext(), lrdVar.getChildFragmentManager(), String.valueOf(lrdVar.N));
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1i f1iVar, v1b v1bVar, lrd lrdVar) {
            super(2, v1bVar);
            this.c = f1iVar;
            this.d = lrdVar;
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
                C0456a c0456a = new C0456a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0456a, this) == y5bVar) {
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
    public crd(lrd lrdVar, f1i f1iVar, v1b v1bVar, lrd lrdVar2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = lrdVar;
        this.c = f1iVar;
        this.d = lrdVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new crd(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((crd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
