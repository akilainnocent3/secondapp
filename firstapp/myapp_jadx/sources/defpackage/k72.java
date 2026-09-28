package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.patron.DocumentAudit;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k72 extends j8i0 {
    public final ku90<tng0> A;
    public final ku90 B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final ku90<pdd0> K;
    public final ku90<pdd0> L;
    public final mpe0 M;
    public final mpe0 N;
    public final v340 O;
    public final v340 P;
    public final v340 Q;
    public final wwd0 R;
    public xyx S;
    public final g1i T;
    public final wwd0 U;
    public final wwd0 V;
    public final wwd0 W;
    public final f1i X;
    public final v340 Y;
    public final uyx a;
    public final d100 b;
    public final wl c;
    public final psm d;
    public final mgb0 e;
    public final ku90<com.sporty.android.common.uievent.a> f;
    public final ku90 i;
    public final ku90<spg0> v;
    public final ku90 w;
    public final ku90<m480> y;
    public final ku90 z;

    public static final class a implements lyh<vw<BigDecimal>> {
        public final /* synthetic */ vl50 a;
        public final /* synthetic */ k72 b;

        /* JADX INFO: renamed from: k72$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$amountMinHintFlow_delegate$lambda$0$$inlined$filter$1", f = "BaseTradingViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0751a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0751a(v1b v1bVar) {
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
            public final /* synthetic */ k72 b;

            /* JADX INFO: renamed from: k72$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$amountMinHintFlow_delegate$lambda$0$$inlined$filter$1$2", f = "BaseTradingViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0752a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0752a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, k72 k72Var) {
                this.a = myhVar;
                this.b = k72Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0752a c0752a;
                if (v1bVar instanceof C0752a) {
                    c0752a = (C0752a) v1bVar;
                    int i = c0752a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0752a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0752a = new C0752a(v1bVar);
                    }
                } else {
                    c0752a = new C0752a(v1bVar);
                }
                Object obj2 = c0752a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0752a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (this.b.B1().f()) {
                        c0752a.b = 1;
                        if (this.a.emit(obj, c0752a) == y5bVar) {
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

        public a(vl50 vl50Var, k72 k72Var) {
            this.a = vl50Var;
            this.b = k72Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super vw<BigDecimal>> myhVar, v1b v1bVar) {
            C0751a c0751a;
            if (v1bVar instanceof C0751a) {
                c0751a = (C0751a) v1bVar;
                int i = c0751a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0751a.b = i - Integer.MIN_VALUE;
                } else {
                    c0751a = new C0751a(v1bVar);
                }
            } else {
                c0751a = new C0751a(v1bVar);
            }
            Object obj = c0751a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0751a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0751a.b = 1;
                if (this.a.collect(bVar, c0751a) == y5bVar) {
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

    public static final class b implements lyh<BigDecimal> {
        public final /* synthetic */ a a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$amountMinHintFlow_delegate$lambda$0$$inlined$map$1", f = "BaseTradingViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: k72$b$b, reason: collision with other inner class name */
        public static final class C0753b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: k72$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$amountMinHintFlow_delegate$lambda$0$$inlined$map$1$2", f = "BaseTradingViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0753b.this.emit(null, this);
                }
            }

            public C0753b(myh myhVar) {
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
                    T t = ((vw) obj).a;
                    aVar.b = 1;
                    if (this.a.emit(t, aVar) == y5bVar) {
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

        public b(a aVar) {
            this.a = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BigDecimal> myhVar, v1b v1bVar) {
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
                C0753b c0753b = new C0753b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0753b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$nameConfirmStatusStateFlow$2", f = "BaseTradingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<ncx, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = k72.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ncx ncxVar, v1b<? super Unit> v1bVar) {
            return ((c) create(ncxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ncx ncxVar = (ncx) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (ncxVar.c && Intrinsics.g(ncxVar.a, lcx.e.a)) {
                k72 k72Var = k72.this;
                ku90<com.sporty.android.common.uievent.a> ku90Var = k72Var.f;
                StringUiText stringUiText = vch0.a;
                gi8.c(ku90Var, null, new ResourceUiText(R.string.page_payment__you_deposit_request_has_been_submitted_tip), null, null, new o72(k72Var, 0), 29);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$normalizedAmountFlow$2", f = "BaseTradingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<xyx, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = k72.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xyx xyxVar, v1b<? super Unit> v1bVar) {
            return ((d) create(xyxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            xyx xyxVar = (xyx) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xyxVar.getClass();
            k72.this.S = xyxVar;
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$refresh$1", f = "BaseTradingViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return k72.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            k72 k72Var = k72.this;
            wwd0 wwd0Var = k72Var.E;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0Var.setValue(tzs.b.a);
                List<c9p> listE1 = k72Var.E1();
                this.a = 1;
                if (up1.c(listE1, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wwd0Var.setValue(tzs.a.a);
            return Unit.a;
        }
    }

    public static final class f implements lyh<PayHintData> {
        public final /* synthetic */ vl50 a;
        public final /* synthetic */ k72 b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$1", f = "BaseTradingViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return f.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ k72 b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$1$2", f = "BaseTradingViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, k72 k72Var) {
                this.a = myhVar;
                this.b = k72Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
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
                PayHintData payHintData = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    for (T t : ((PayHintData.PayHintEntity) obj).entityList) {
                        if (Intrinsics.g(((PayHintData) t).methodId, this.b.B1().g())) {
                            payHintData = t;
                            break;
                        }
                    }
                    aVar.b = 1;
                    if (this.a.emit(payHintData, aVar) == y5bVar) {
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

        public f(vl50 vl50Var, k72 k72Var) {
            this.a = vl50Var;
            this.b = k72Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super PayHintData> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public static final class g implements lyh<BigDecimal> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$2", f = "BaseTradingViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return g.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$2$2", f = "BaseTradingViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
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
                    BigDecimal bigDecimalB = ty0.b((AssetsInfo) obj);
                    aVar.b = 1;
                    if (this.a.emit(bigDecimalB, aVar) == y5bVar) {
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

        public g(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BigDecimal> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public static final class h implements lyh<xyx> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ k72 b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$3", f = "BaseTradingViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return h.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ k72 b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$3$2", f = "BaseTradingViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, k72 k72Var) {
                this.a = myhVar;
                this.b = k72Var;
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
                    this.b.a.getClass();
                    xyx xyxVarA = uyx.a((String) obj);
                    aVar.b = 1;
                    if (this.a.emit(xyxVarA, aVar) == y5bVar) {
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

        public h(wwd0 wwd0Var, k72 k72Var) {
            this.a = wwd0Var;
            this.b = k72Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super xyx> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    public static final class i implements lyh<ncx> {
        public final /* synthetic */ vl50 a;
        public final /* synthetic */ k72 b;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$4", f = "BaseTradingViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return i.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ k72 b;

            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.BaseTradingViewModel$special$$inlined$map$4$2", f = "BaseTradingViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, k72 k72Var) {
                this.a = myhVar;
                this.b = k72Var;
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
                    NameConfirmationStatus nameConfirmationStatus = (NameConfirmationStatus) obj;
                    k72 k72Var = this.b;
                    CountryCodeName countryCode = k72Var.d.getCountryCode();
                    Integer num = new Integer(nameConfirmationStatus.status);
                    DocumentAudit documentAudit = nameConfirmationStatus.documentAudit;
                    ncx ncxVarB = qcx.b(countryCode, num, documentAudit != null ? new Integer(documentAudit.status) : null, k72Var.B1());
                    aVar.b = 1;
                    if (this.a.emit(ncxVarB, aVar) == y5bVar) {
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

        public i(vl50 vl50Var, k72 k72Var) {
            this.a = vl50Var;
            this.b = k72Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super ncx> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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

    public k72(uyx uyxVar, uy0 uy0Var, d100 d100Var, lyz lyzVar, wl wlVar, psm psmVar, mgb0 mgb0Var) {
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        this.a = uyxVar;
        this.b = d100Var;
        this.c = wlVar;
        this.d = psmVar;
        this.e = mgb0Var;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = ku90Var;
        ku90<spg0> ku90Var2 = new ku90<>();
        this.v = ku90Var2;
        this.w = ku90Var2;
        ku90<m480> ku90Var3 = new ku90<>();
        this.y = ku90Var3;
        this.z = ku90Var3;
        ku90<tng0> ku90Var4 = new ku90<>();
        this.A = ku90Var4;
        this.B = ku90Var4;
        wwd0 wwd0VarA = xwd0.a(wgn.b.a);
        this.C = wwd0VarA;
        this.D = wwd0VarA;
        tzs.a aVar = tzs.a.a;
        wwd0 wwd0VarA2 = xwd0.a(aVar);
        this.E = wwd0VarA2;
        this.F = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(aVar);
        this.G = wwd0VarA3;
        this.H = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(aVar);
        this.I = wwd0VarA4;
        this.J = wwd0VarA4;
        ku90<pdd0> ku90Var5 = new ku90<>();
        this.K = ku90Var5;
        this.L = ku90Var5;
        int i2 = 0;
        this.M = hwr.b(new i72(this, i2));
        this.N = hwr.b(new Function0() { // from class: j72
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                k72 k72Var = this.a;
                return new k72.b(new k72.a(bm50.f(k72Var.b.H(k72Var.getT0())), k72Var));
            }
        });
        this.O = e1i.e(new f(bm50.f(d100Var.h()), this), o8i0.d(this), q490.a.b, null);
        pu0.b bVar = pu0.b.a;
        lyh<lk50<AssetsInfo>> lyhVarH = uy0Var.h(bVar);
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar2 = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarH, et7VarD, kwd0Var, bVar2);
        this.P = v340VarE;
        this.Q = e1i.e(new g(bm50.f(v340VarE)), o8i0.d(this), kwd0Var, null);
        wwd0 wwd0VarA5 = xwd0.a("");
        this.R = wwd0VarA5;
        this.S = xyx.d;
        this.T = new g1i(new h(wwd0VarA5, this), new d(null));
        wwd0 wwd0VarA6 = xwd0.a(new wne0(15, null));
        this.U = wwd0VarA6;
        this.V = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(null);
        this.W = wwd0VarA7;
        this.X = new f1i(wwd0VarA7);
        this.Y = e1i.e(new g1i(new i(bm50.f(lyzVar.j0(bVar)), this), new c(null)), o8i0.d(this), kwd0Var, new ncx(i2));
    }

    public abstract List<lyh<lk50<Object>>> A1();

    public abstract y200 B1();

    /* JADX INFO: renamed from: C1 */
    public abstract log0 getT0();

    public void D1() {
        kzh.d(new g1i(new l72((lyh[]) CollectionsKt.A0(A1()).toArray(new lyh[0])), new m72(this, null)), o8i0.d(this));
        E1();
        ej5.c(o8i0.d(this), null, null, new n72(this, null), 3);
    }

    public abstract List<c9p> E1();

    public final c9p F1() {
        return ej5.c(o8i0.d(this), null, null, new e(null), 3);
    }

    public final void x1(String str) {
        str.getClass();
        wwd0 wwd0Var = this.R;
        wwd0Var.getClass();
        wwd0Var.k(null, str);
    }

    public lyh<BigDecimal> y1() {
        return (lyh) this.N.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i41 z1() {
        AssetsInfo assetsInfo;
        Object value = this.P.a.getValue();
        lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
        if (cVar == null || (assetsInfo = (AssetsInfo) cVar.a) == null) {
            return null;
        }
        return k41.a(assetsInfo);
    }
}
