package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltch;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tch extends j8i0 {
    public final ku90<wz80> A;
    public final t340 B;
    public final ku90<x53.k> C;
    public final t340 D;
    public final wwd0 E;
    public boolean F;
    public final f G;
    public final g H;
    public aj40 I;
    public sch J;
    public boolean K;
    public boolean L;
    public String M;
    public final wwd0 N;
    public final v340 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final wwd0 R;
    public final v340 S;
    public final h T;
    public final v340 U;
    public final v340 V;
    public final wwd0 W;
    public final e X;
    public final xo20 a;
    public final pws b;
    public final x4k c;
    public final s05 d;
    public final lq1 e;
    public final rdd0 f;
    public final jrm i;
    public final ku90<com.sporty.android.common.uievent.a> v;
    public final t340 w;
    public final ku90<mws> y;
    public final t340 z;

    public static final /* synthetic */ class a extends pf implements iaj<String, String, String, v1b<? super ox4>, Object> {
        public static final a v = new a(4, ox4.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 4);

        @Override // defpackage.iaj
        public final Object d(String str, String str2, String str3, v1b<? super ox4> v1bVar) {
            return new ox4(str, str2, str3);
        }
    }

    public static final class b implements Function1<List<? extends BookingCodeInfoDto>, List<? extends gz4>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends gz4> invoke(List<? extends BookingCodeInfoDto> list) {
            List<? extends BookingCodeInfoDto> list2 = list;
            list2.getClass();
            tch tchVar = tch.this;
            return kz4.e(list2, tchVar.J, tchVar.K, tchVar.L, 0, null, this.b, this.c, this.d, 116);
        }
    }

    @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$recommendedCodeHeaderUiStateFlow$1", f = "FeaturedCodesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements jaj<Boolean, lk50<? extends List<? extends BookingCodeInfoDto>>, Long, krv, v1b<? super jj40>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ lk50 b;
        public /* synthetic */ krv c;
        public final /* synthetic */ tch d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, tch tchVar) {
            super(5, v1bVar);
            this.d = tchVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ResourceUiText resourceUiText;
            boolean z = this.a;
            lk50 lk50Var = this.b;
            krv krvVar = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            tch tchVar = this.d;
            aj40 aj40Var = tchVar.I;
            if (!(aj40Var instanceof aj40.a)) {
                return new jj40.b(false, null, null, false, 31);
            }
            if (lk50Var instanceof lk50.a) {
                aj40.a aVar = (aj40.a) aj40Var;
                boolean z2 = aVar.a;
                Integer num = aVar.b;
                o2s o2sVar = num != null ? new o2s(num.intValue()) : null;
                Throwable th = ((lk50.a) lk50Var).a;
                return new jj40.a(z2, o2sVar, null, vch0.f(th instanceof SprThrowable ? vch0.d(((SprThrowable) th).getE()) : vch0.b, new Integer(R.color.text_type1_primary)), false, false, 100);
            }
            boolean z3 = krvVar instanceof krv.c;
            if (!(krvVar instanceof krv.a) && z3) {
                z = tchVar.F;
            }
            if (z) {
                aj40.a aVar2 = (aj40.a) aj40Var;
                boolean z4 = aVar2.a;
                Integer num2 = aVar2.b;
                return new jj40.b(z4, num2 != null ? new o2s(num2.intValue()) : null, null, z3, 20);
            }
            aj40.a aVar3 = (aj40.a) aj40Var;
            boolean z5 = aVar3.a;
            Integer num3 = aVar3.b;
            o2s o2sVar2 = num3 != null ? new o2s(num3.intValue()) : null;
            if (z3) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.component_betslip__view_recommended_codes);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.cashout__recommended_code);
            }
            return new jj40.a(z5, o2sVar2, resourceUiText, null, false, z3, 88);
        }

        @Override // defpackage.jaj
        public final Object l(Boolean bool, lk50<? extends List<? extends BookingCodeInfoDto>> lk50Var, Long l, krv krvVar, v1b<? super jj40> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            l.longValue();
            c cVar = new c(v1bVar, this.d);
            cVar.a = zBooleanValue;
            cVar.b = lk50Var;
            cVar.c = krvVar;
            return cVar.invokeSuspend(Unit.a);
        }
    }

    public static final class d implements lyh<lk50<? extends List<? extends gz4>>> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ tch b;

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$combine$1", f = "FeaturedCodesViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$combine$1$3", f = "FeaturedCodesViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super lk50<? extends List<? extends gz4>>>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ tch d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v1b v1bVar, tch tchVar) {
                super(3, v1bVar);
                this.d = tchVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super lk50<? extends List<? extends gz4>>> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(v1bVar, this.d);
                cVar.b = myhVar;
                cVar.c = objArr;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Object[] objArr = this.c;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    lk50 lk50VarL = bm50.l((lk50) obj2, this.d.new b((String) objArr[1], (String) objArr[2], (String) objArr[3]));
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(lk50VarL, this) == y5bVar) {
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

        public d(lyh[] lyhVarArr, tch tchVar) {
            this.a = lyhVarArr;
            this.b = tchVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends List<? extends gz4>>> myhVar, v1b v1bVar) {
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
                lyh[] lyhVarArr = this.a;
                b bVar = new b(lyhVarArr);
                c cVar = new c(null, this.b);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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

    public static final class e implements lyh<gz4> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ tch b;

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$combine$2", f = "FeaturedCodesViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return e.this.collect(null, this);
            }
        }

        public static final class b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.a.length];
            }
        }

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$combine$2$3", f = "FeaturedCodesViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements gaj<myh<? super gz4>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ tch d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v1b v1bVar, tch tchVar) {
                super(3, v1bVar);
                this.d = tchVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super gz4> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                c cVar = new c(v1bVar, this.d);
                cVar.b = myhVar;
                cVar.c = objArr;
                return cVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Object[] objArr = this.c;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    String str = (String) objArr[1];
                    String str2 = (String) objArr[2];
                    String str3 = (String) objArr[3];
                    Object obj3 = objArr[4];
                    obj3.getClass();
                    BookingCodeInfoDto bookingCodeInfoDto = (BookingCodeInfoDto) ((List) obj2).get(((Integer) obj3).intValue());
                    tch tchVar = this.d;
                    gz4 gz4VarD = kz4.d(bookingCodeInfoDto, tchVar.K, tchVar.L, 0, str, str2, str3, 58);
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(gz4VarD, this) == y5bVar) {
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

        public e(lyh[] lyhVarArr, tch tchVar) {
            this.a = lyhVarArr;
            this.b = tchVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super gz4> myhVar, v1b v1bVar) {
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
                lyh[] lyhVarArr = this.a;
                b bVar = new b(lyhVarArr);
                c cVar = new c(null, this.b);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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

    public static final class f implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$map$1", f = "FeaturedCodesViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$map$1$2", f = "FeaturedCodesViewModel.kt", l = {50}, m = "emit", v = 2)
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

            /* JADX WARN: Code duplicated, block: B:25:0x005d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                Boolean boolR0;
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
                Boolean bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                Object obj3 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(BOConfigParam.IsFeaturedCodeEnabled);
                    Object configValue = response != null ? response.getConfigValue() : null;
                    dq7 dq7VarA = jq40.a(Boolean.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (configValue instanceof Boolean) {
                            bool = (Boolean) configValue;
                        } else if ((configValue instanceof String) && (boolR0 = StringsKt.r0((String) configValue)) != null) {
                            bool = boolR0;
                        }
                    } else if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (configValue instanceof Boolean) {
                            obj3 = configValue;
                        }
                        bool = (Boolean) obj3;
                    }
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public f(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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

    public static final class g implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$map$2", f = "FeaturedCodesViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$map$2$2", f = "FeaturedCodesViewModel.kt", l = {50}, m = "emit", v = 2)
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

            /* JADX WARN: Code duplicated, block: B:25:0x005d  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                Boolean boolR0;
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
                Boolean bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                obj = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                bool = null;
                Object obj3 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(BOConfigParam.IsPostBetUpsellEnabled);
                    Object configValue = response != null ? response.getConfigValue() : null;
                    dq7 dq7VarA = jq40.a(Boolean.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            bool = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (configValue instanceof Boolean) {
                            bool = (Boolean) configValue;
                        } else if ((configValue instanceof String) && (boolR0 = StringsKt.r0((String) configValue)) != null) {
                            bool = boolR0;
                        }
                    } else if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (configValue instanceof Boolean) {
                            obj3 = configValue;
                        }
                        bool = (Boolean) obj3;
                    }
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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

    public static final class h implements lyh<jj40> {
        public final /* synthetic */ v340 a;

        @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$map$3", f = "FeaturedCodesViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.FeaturedCodesViewModel$special$$inlined$map$3$2", f = "FeaturedCodesViewModel.kt", l = {50}, m = "emit", v = 2)
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

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
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
                Object aVar2;
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
                    if (((Boolean) obj).booleanValue()) {
                        o2s o2sVar = new o2s(R.drawable.spr_sports_hot, new fx90.b(16));
                        StringUiText stringUiText = vch0.a;
                        aVar2 = new jj40.b(true, o2sVar, new ResourceUiText(R.string.component_betslip__featured_games), false, 24);
                    } else {
                        o2s o2sVar2 = new o2s(R.drawable.spr_sports_hot, new fx90.b(16));
                        StringUiText stringUiText2 = vch0.a;
                        aVar2 = new jj40.a(true, o2sVar2, new ResourceUiText(R.string.component_betslip__featured_games), null, true, false, 32);
                    }
                    aVar.b = 1;
                    if (this.a.emit(aVar2, aVar) == y5bVar) {
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

        public h(v340 v340Var) {
            this.a = v340Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super jj40> myhVar, v1b v1bVar) {
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
                if (this.a.a.collect(bVar, aVar) == y5bVar) {
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

    public tch(xo20 xo20Var, pws pwsVar, x4k x4kVar, s05 s05Var, lq1 lq1Var, m2l m2lVar, rdd0 rdd0Var, jrm jrmVar) {
        s05Var.getClass();
        lq1Var.getClass();
        m2lVar.getClass();
        rdd0Var.getClass();
        jrmVar.getClass();
        this.a = xo20Var;
        this.b = pwsVar;
        this.c = x4kVar;
        this.d = s05Var;
        this.e = lq1Var;
        this.f = rdd0Var;
        this.i = jrmVar;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
        ku90<mws> ku90Var2 = new ku90<>();
        this.y = ku90Var2;
        this.z = e1i.a(ku90Var2);
        ku90<wz80> ku90Var3 = new ku90<>();
        this.A = ku90Var3;
        this.B = e1i.a(ku90Var3);
        ku90<x53.k> ku90Var4 = new ku90<>();
        this.C = ku90Var4;
        this.D = e1i.a(ku90Var4);
        wwd0 wwd0VarA = xwd0.a(krv.a.a);
        this.E = wwd0VarA;
        pu0.b bVar = pu0.b.a;
        this.G = new f(bm50.f(lq1Var.a(bVar)));
        this.H = new g(bm50.f(lq1Var.a(bVar)));
        this.I = aj40.b.a;
        this.J = sch.b;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.N = wwd0VarA2;
        lyh<lk50<List<BookingCodeInfoDto>>> lyhVarA = s05Var.a(bVar);
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar2 = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarA, et7VarD, kwd0Var, bVar2);
        this.O = v340VarE;
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.P = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.Q = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(null);
        this.R = wwd0VarA5;
        lyh<String> stringByFlow = m2lVar.getStringByFlow("ODDS_FORMAT", "DECIMAL");
        this.S = e1i.e(r1i.a(wwd0VarA3, wwd0VarA4, wwd0VarA5, a.v), o8i0.d(this), kwd0Var, new ox4(null, null, null));
        zed.h hVarG = s05Var.g();
        et7 et7VarD2 = o8i0.d(this);
        Boolean bool = Boolean.TRUE;
        v340 v340VarE2 = e1i.e(hVarG, et7VarD2, kwd0Var, bool);
        this.T = new h(e1i.e(s05Var.h(), o8i0.d(this), kwd0Var, bool));
        this.U = e1i.e(r1i.b(v340VarE2, v340VarE, new f1i(wwd0VarA2), wwd0VarA, new c(null, this)), o8i0.d(this), kwd0Var, new jj40.b(false, null, null, false, 31));
        this.V = e1i.e(new d(new lyh[]{v340VarE, wwd0VarA3, wwd0VarA4, wwd0VarA5, new f1i(wwd0VarA2), stringByFlow}, this), o8i0.d(this), kwd0Var, bVar2);
        wwd0 wwd0VarA6 = xwd0.a(0);
        this.W = wwd0VarA6;
        this.X = new e(new lyh[]{bm50.f(v340VarE), wwd0VarA3, wwd0VarA4, wwd0VarA5, wwd0VarA6, new f1i(wwd0VarA2), stringByFlow}, this);
    }

    public final void A1(aj40 aj40Var, sch schVar, boolean z, boolean z2, String str) {
        wwd0 wwd0Var;
        Object value;
        aj40Var.getClass();
        this.I = aj40Var;
        this.J = schVar;
        this.K = z;
        this.L = z2;
        this.M = str;
        do {
            wwd0Var = this.N;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, Long.valueOf(System.currentTimeMillis())));
    }

    public final void B1(ez4 ez4Var) {
        if (ez4Var instanceof ez4.c) {
            ej5.c(o8i0.d(this), null, null, new wch(this, ((ez4.c) ez4Var).a, null), 3);
        } else if (ez4Var instanceof ez4.a) {
            ej5.c(o8i0.d(this), null, null, new uch(this, ((ez4.a) ez4Var).a, null), 3);
        } else if (!(ez4Var instanceof ez4.b)) {
            Unit unit = Unit.a;
        } else {
            ej5.c(o8i0.d(this), null, null, new vch(this, ((ez4.b) ez4Var).a, null), 3);
        }
    }

    public final jvd0 C1() {
        return ej5.c(o8i0.d(this), null, null, new ych(null, this), 3);
    }

    public final void D1(boolean z) {
        List list;
        wwd0 wwd0Var;
        Object value;
        int i;
        Object value2 = this.O.a.getValue();
        lk50.c cVar = value2 instanceof lk50.c ? (lk50.c) value2 : null;
        if (cVar == null || (list = (List) cVar.a) == null) {
            return;
        }
        int size = list.size();
        do {
            wwd0Var = this.W;
            value = wwd0Var.getValue();
            int iIntValue = ((Number) value).intValue();
            i = size - 1;
            if (iIntValue < i) {
                i = iIntValue + 1;
            } else if (z) {
                StringUiText stringUiText = vch0.a;
                com.sporty.android.common.uievent.b.i(this.v, new ResourceUiText(R.string.component_betslip__max_code_amount_reached), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
        } while (!wwd0Var.g(value, Integer.valueOf(i)));
    }

    public final jvd0 x1() {
        lyh<lk50<List<BookingCodeInfoDto>>> lyhVarA = this.d.a(pu0.c.a);
        zu7.a aVar = zu7.a;
        return kzh.d(lyhVarA, zu7.a());
    }

    public final g08 y1() {
        Object bVar;
        String str = this.M;
        if (str != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = g08.valueOf(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            g08 g08Var = (g08) bVar;
            if (g08Var != null) {
                return g08Var;
            }
        }
        return g08.UNKNOWN;
    }

    public final BookingCodeInfoDto z1() {
        List list;
        Object value = this.O.a.getValue();
        lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
        if (cVar == null || (list = (List) cVar.a) == null) {
            return null;
        }
        return (BookingCodeInfoDto) CollectionsKt.V(((Number) this.W.getValue()).intValue(), list);
    }
}
