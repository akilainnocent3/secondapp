package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcky;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cky extends j8i0 {
    public final zjy a;
    public final lq1 b;
    public final wwd0 c;
    public final v340 d;
    public final ssw<Boolean> e;
    public final ssw f;

    public static final class a implements Function1<BOConfigValueBundle, Boolean> {
        public final /* synthetic */ BOConfigParamDto a;

        public a(BOConfigParamDto bOConfigParamDto) {
            this.a = bOConfigParamDto;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BOConfigValueBundle bOConfigValueBundle) {
            Boolean boolR0;
            BOConfigValueBundle bOConfigValueBundle2 = bOConfigValueBundle;
            bOConfigValueBundle2.getClass();
            BOConfigValueWrapper response = bOConfigValueBundle2.getResponse(this.a);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Boolean.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    return (Boolean) (configValue instanceof Boolean ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                StringsKt.toIntOrNull((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    return (Boolean) (configValue instanceof Boolean ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                StringsKt.s0((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    return (Boolean) (configValue instanceof Boolean ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                kotlin.text.b.i((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    return (Boolean) (configValue instanceof Boolean ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                kotlin.text.b.h((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    return (Boolean) configValue;
                }
                if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                    return null;
                }
                return boolR0;
            }
            if (!dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    return (Boolean) (configValue instanceof Boolean ? configValue : null);
                }
                return null;
            }
            if (configValue == null) {
                return null;
            }
            configValue.toString();
            return null;
        }
    }

    @c0d(c = "com.sportybet.android.activity.oddsformat.OddsFormatViewModel$checkIfEnabled$1", f = "OddsFormatViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = cky.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(lk50Var instanceof lk50.c)) {
                return Unit.a;
            }
            ssw<Boolean> sswVar = cky.this.e;
            Boolean bool = (Boolean) ((lk50.c) lk50Var).a;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            sswVar.m(bool);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.activity.oddsformat.OddsFormatViewModel$checkIfEnabled$2", f = "OddsFormatViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lk50<? extends Boolean>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends Boolean>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.a = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a.a(a320.a("Odds Format BO Config Error: ", th), new Object[0]);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.activity.oddsformat.OddsFormatViewModel$onOddsFormatSelected$2", f = "OddsFormatViewModel.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ljy c;

        public static final class a<T> implements myh {
            public final /* synthetic */ cky a;
            public final /* synthetic */ ljy b;

            public a(cky ckyVar, ljy ljyVar) {
                this.a = ckyVar;
                this.b = ljyVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Object value;
                Object value2;
                Object value3;
                lk50 lk50Var = (lk50) obj;
                wwd0 wwd0Var = this.a.c;
                if (lk50Var instanceof lk50.c) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, xjy.a((xjy) value3, ((xjy) wwd0Var.getValue()).a.indexOf(this.b), false, null, 9)));
                } else if (lk50Var instanceof lk50.a) {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, xjy.a((xjy) value2, 0, false, ((lk50.a) lk50Var).b, 3)));
                } else {
                    if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                        uhc.a();
                        return null;
                    }
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, xjy.a((xjy) value, 0, true, null, 11)));
                }
                return Unit.a;
            }
        }

        public static final class b implements lyh<Unit> {
            public final /* synthetic */ g1i a;

            @c0d(c = "com.sportybet.android.activity.oddsformat.OddsFormatViewModel$onOddsFormatSelected$2$invokeSuspend$$inlined$map$1", f = "OddsFormatViewModel.kt", l = {109}, m = "collect", v = 2)
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

            /* JADX INFO: renamed from: cky$d$b$b, reason: collision with other inner class name */
            public static final class C0175b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: cky$d$b$b$a */
                @c0d(c = "com.sportybet.android.activity.oddsformat.OddsFormatViewModel$onOddsFormatSelected$2$invokeSuspend$$inlined$map$1$2", f = "OddsFormatViewModel.kt", l = {50}, m = "emit", v = 2)
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
                        return C0175b.this.emit(null, this);
                    }
                }

                public C0175b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
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
                        n52.c((BaseResponse) obj);
                        Unit unit = Unit.a;
                        aVar.b = 1;
                        if (this.a.emit(unit, aVar) == y5bVar) {
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

            public b(g1i g1iVar) {
                this.a = g1iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
                    C0175b c0175b = new C0175b(myhVar);
                    aVar.b = 1;
                    if (this.a.collect(c0175b, aVar) == y5bVar) {
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
        public d(ljy ljyVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = ljyVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return cky.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                cky ckyVar = cky.this;
                wwd0 wwd0Var = ckyVar.c;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, xjy.a((xjy) value, 0, true, null, 3)));
                zjy zjyVar = ckyVar.a;
                zjyVar.getClass();
                ljy ljyVar = this.c;
                ljyVar.getClass();
                yzh yzhVarA = bm50.a(new b(new g1i(zjyVar.b.A(ljyVar), new yjy(zjyVar, ljyVar, null))));
                a aVar = new a(ckyVar, ljyVar);
                this.a = 1;
                if (yzhVarA.collect(aVar, this) == y5bVar) {
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

    public cky(zjy zjyVar, lq1 lq1Var) {
        lq1Var.getClass();
        this.a = zjyVar;
        this.b = lq1Var;
        wwd0 wwd0VarA = xwd0.a(new xjy(ay0.S(ljy.values()), ay0.D(gky.b(zjyVar.a), ljy.values()), false, null));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        ssw<Boolean> sswVar = new ssw<>(Boolean.FALSE);
        this.e = sswVar;
        this.f = sswVar;
    }

    public final void x1() {
        BOConfigParamDto bOConfigParamDto = new BOConfigParamDto(BOConfigAppId.COMMON, BOConfigNamespace.CONFIG, "is_enable_odds_format", null, 8, null);
        kzh.d(new yzh(new g1i(new wl50(this.b.c(kotlin.collections.a.c(bOConfigParamDto)), new a(bOConfigParamDto)), new b(null)), new c(3, null)), o8i0.d(this));
    }

    public final boolean y1(ljy ljyVar, wjy wjyVar) {
        Object value;
        ljyVar.getClass();
        if (wjyVar != wjy.a) {
            ej5.c(o8i0.d(this), null, null, new d(ljyVar, null), 3);
            return true;
        }
        wwd0 wwd0Var = this.c;
        if (((xjy) wwd0Var.getValue()).b == ((xjy) wwd0Var.getValue()).a.indexOf(ljyVar)) {
            return false;
        }
        zjy zjyVar = this.a;
        zjyVar.getClass();
        gky.d(zjyVar.a, ljyVar);
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, xjy.a((xjy) value, ((xjy) wwd0Var.getValue()).a.indexOf(ljyVar), false, null, 13)));
        return true;
    }
}
