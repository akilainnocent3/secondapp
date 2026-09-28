package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$observeDepositResult$$inlined$collectWithLifecycle$default$1", f = "DepositBaseFragmentLegacy.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class drd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lrd b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ lrd d;

    @c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$observeDepositResult$$inlined$collectWithLifecycle$default$1$1", f = "DepositBaseFragmentLegacy.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ lrd d;

        /* JADX INFO: renamed from: drd$a$a, reason: collision with other inner class name */
        public static final class C0501a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ lrd b;

            public C0501a(v5b v5bVar, lrd lrdVar) {
                this.b = lrdVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                lk50<? extends x7e> lk50Var = (lk50) t;
                lrd lrdVar = this.b;
                lrdVar.v1(lk50Var);
                if (lk50Var instanceof lk50.b) {
                    ProgressButton progressButtonG1 = lrdVar.g1();
                    if (progressButtonG1 != null) {
                        progressButtonG1.setLoading(true);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    lrdVar.h1().F.setValue(null);
                    ProgressButton progressButtonG2 = lrdVar.g1();
                    if (progressButtonG2 != null) {
                        progressButtonG2.setLoading(false);
                    }
                    c000.p0(lrdVar, sn5.d(lrdVar, R.string.page_payment__deposit_failed, new Object[0]), sn5.d(lrdVar, R.string.common_feedback__something_went_wrong_tip, new Object[0]), null, erd.a, null, null, 116);
                } else {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    lrdVar.h1().F.setValue(null);
                    ProgressButton progressButtonG3 = lrdVar.g1();
                    if (progressButtonG3 != null) {
                        progressButtonG3.setLoading(false);
                    }
                    x7e x7eVar = (x7e) ((lk50.c) lk50Var).a;
                    if (x7eVar instanceof x7e.d.q) {
                        vgb0.a(AnalyticsEvent.DEPOSIT);
                        r9e r9eVarH1 = lrdVar.h1();
                        ej5.c(o8i0.d(r9eVarH1), null, null, new q9e(r9eVarH1, null), 3);
                        x7e.d.q qVar = (x7e.d.q) x7eVar;
                        lrd.z1(lrdVar, qVar.e, null, qVar.c, 26);
                    } else if (x7eVar instanceof x7e.b.d) {
                        x7e.b.d dVar = (x7e.b.d) x7eVar;
                        lrdVar.X = dVar.b;
                        lrdVar.M = dVar.d;
                        lrdVar.q1(dVar);
                    } else if (!lrdVar.p1(x7eVar)) {
                        String strD = sn5.d(lrdVar, R.string.page_payment__deposit_failed, new Object[0]);
                        String message = x7eVar.getMessage();
                        if (message == null) {
                            message = sn5.d(lrdVar, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                        }
                        c000.p0(lrdVar, strD, message, null, frd.a, null, null, 116);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, lrd lrdVar) {
            super(2, v1bVar);
            this.c = lyhVar;
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
                C0501a c0501a = new C0501a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0501a, this) == y5bVar) {
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
    public drd(lrd lrdVar, lyh lyhVar, v1b v1bVar, lrd lrdVar2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = lrdVar;
        this.c = lyhVar;
        this.d = lrdVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new drd(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((drd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
