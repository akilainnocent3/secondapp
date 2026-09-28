package defpackage;

import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxlj0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xlj0 extends j8i0 {
    public final psm a;
    public final wwd0 b;
    public final wwd0 c;
    public final v340 d;
    public final wwd0 e;
    public final wwd0 f;
    public final ku90<Unit> i;
    public final ku90 v;
    public final ku90<Unit> w;
    public final ku90 y;

    public static final class a implements lyh<WithdrawAlertHintStatus> {
        public final /* synthetic */ wwd0 a;

        /* JADX INFO: renamed from: xlj0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawConfirmViewModel$special$$inlined$mapNotNull$1", f = "WithdrawConfirmViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1297a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1297a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: xlj0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawConfirmViewModel$special$$inlined$mapNotNull$1$2", f = "WithdrawConfirmViewModel.kt", l = {52}, m = "emit", v = 2)
            public static final class C1298a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1298a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1298a c1298a;
                if (v1bVar instanceof C1298a) {
                    c1298a = (C1298a) v1bVar;
                    int i = c1298a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1298a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1298a = new C1298a(v1bVar);
                    }
                } else {
                    c1298a = new C1298a(v1bVar);
                }
                Object obj2 = c1298a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1298a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WithdrawConfirmation withdrawConfirmation = (WithdrawConfirmation) obj;
                    WithdrawConfirmation.a aVar = withdrawConfirmation instanceof WithdrawConfirmation.a ? (WithdrawConfirmation.a) withdrawConfirmation : null;
                    WithdrawAlertHintStatus i3 = aVar != null ? aVar.getI() : null;
                    if (i3 != null) {
                        c1298a.b = 1;
                        if (this.a.emit(i3, c1298a) == y5bVar) {
                            return y5bVar;
                        }
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

        public a(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super WithdrawAlertHintStatus> myhVar, v1b v1bVar) throws Throwable {
            C1297a c1297a;
            if (v1bVar instanceof C1297a) {
                c1297a = (C1297a) v1bVar;
                int i = c1297a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1297a.b = i - Integer.MIN_VALUE;
                } else {
                    c1297a = new C1297a(v1bVar);
                }
            } else {
                c1297a = new C1297a(v1bVar);
            }
            Object obj = c1297a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1297a.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            c1297a.b = 1;
            this.a.collect(bVar, c1297a);
            return y5bVar;
        }
    }

    public xlj0(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.b = wwd0VarA;
        this.c = wwd0VarA;
        this.d = e1i.e(new a(wwd0VarA), o8i0.d(this), q490.a.b, WithdrawAlertHintStatus.Gone.a);
        wwd0 wwd0VarA2 = xwd0.a(tzs.a.a);
        this.e = wwd0VarA2;
        this.f = wwd0VarA2;
        ku90<Unit> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = ku90Var;
        ku90<Unit> ku90Var2 = new ku90<>();
        this.w = ku90Var2;
        this.y = ku90Var2;
    }
}
