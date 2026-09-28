package defpackage;

import com.sporty.android.core.model.config.BoreDrawItem;
import com.sporty.android.core.model.config.BoreDrawSelectionEligibilityDto;
import com.sporty.android.core.model.config.BoreDrawSport;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class p35 implements n35 {
    public final lq1 a;
    public final str<k5b> b;
    public final mpe0 c;
    public final r5b d;

    public static final class a implements lyh<BoreDrawConfig> {
        public final /* synthetic */ vl50 a;

        /* JADX INFO: renamed from: p35$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.delegate.BoreDrawDelegateImpl$special$$inlined$map$1", f = "BoreDrawDelegateImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C0960a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0960a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: p35$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.delegate.BoreDrawDelegateImpl$special$$inlined$map$1$2", f = "BoreDrawDelegateImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C0961a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0961a(v1b v1bVar) {
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

            /* JADX WARN: Code duplicated, block: B:24:0x005c  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code duplicated, block: B:80:0x010a  */
            /* JADX WARN: Code duplicated, block: B:85:0x0121 A[RETURN] */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0961a c0961a;
                BoreDrawSelectionEligibilityDto boreDrawSelectionEligibilityDto;
                BoreDrawConfig boreDrawConfig;
                BoreDrawSport sport;
                if (v1bVar instanceof C0961a) {
                    c0961a = (C0961a) v1bVar;
                    int i = c0961a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0961a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0961a = new C0961a(v1bVar);
                    }
                } else {
                    c0961a = new C0961a(v1bVar);
                }
                Object obj2 = c0961a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0961a.b;
                List<BoreDrawItem> items = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(BOConfigParam.BoreDrawSelectionEligibility);
                    Object configValue = response != null ? response.getConfigValue() : null;
                    dq7 dq7VarA = jq40.a(BoreDrawSelectionEligibilityDto.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                                configValue = null;
                            }
                            boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                            if (boreDrawSelectionEligibilityDto != null && (sport = boreDrawSelectionEligibilityDto.getSport()) != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (configValue instanceof String) {
                                StringsKt.toIntOrNull((String) configValue);
                            }
                            boreDrawSelectionEligibilityDto = null;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                                configValue = null;
                            }
                            boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (configValue instanceof String) {
                                StringsKt.s0((String) configValue);
                            }
                            boreDrawSelectionEligibilityDto = null;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                                configValue = null;
                            }
                            boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (configValue instanceof String) {
                                kotlin.text.b.i((String) configValue);
                            }
                            boreDrawSelectionEligibilityDto = null;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                                configValue = null;
                            }
                            boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        } else {
                            if (configValue instanceof String) {
                                kotlin.text.b.h((String) configValue);
                            }
                            boreDrawSelectionEligibilityDto = null;
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (!dq7VarA.equals(jq40.a(String.class))) {
                            if (configValue != null) {
                                if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                                    configValue = null;
                                }
                                boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                            }
                            if (boreDrawSelectionEligibilityDto != null) {
                                items = sport.getItems();
                            }
                            boreDrawConfig = new BoreDrawConfig(items);
                            c0961a.b = 1;
                            if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                                return y5bVar;
                            }
                        } else if (configValue != null) {
                            configValue.toString();
                        }
                        boreDrawSelectionEligibilityDto = null;
                        if (boreDrawSelectionEligibilityDto != null) {
                            items = sport.getItems();
                        }
                        boreDrawConfig = new BoreDrawConfig(items);
                        c0961a.b = 1;
                        if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                            return y5bVar;
                        }
                    } else if (configValue instanceof Boolean) {
                        if (!(configValue instanceof BoreDrawSelectionEligibilityDto)) {
                            configValue = null;
                        }
                        boreDrawSelectionEligibilityDto = (BoreDrawSelectionEligibilityDto) configValue;
                        if (boreDrawSelectionEligibilityDto != null) {
                            items = sport.getItems();
                        }
                        boreDrawConfig = new BoreDrawConfig(items);
                        c0961a.b = 1;
                        if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.r0((String) configValue);
                        }
                        boreDrawSelectionEligibilityDto = null;
                        if (boreDrawSelectionEligibilityDto != null) {
                            items = sport.getItems();
                        }
                        boreDrawConfig = new BoreDrawConfig(items);
                        c0961a.b = 1;
                        if (this.a.emit(boreDrawConfig, c0961a) == y5bVar) {
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

        public a(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BoreDrawConfig> myhVar, v1b v1bVar) {
            C0960a c0960a;
            if (v1bVar instanceof C0960a) {
                c0960a = (C0960a) v1bVar;
                int i = c0960a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0960a.b = i - Integer.MIN_VALUE;
                } else {
                    c0960a = new C0960a(v1bVar);
                }
            } else {
                c0960a = new C0960a(v1bVar);
            }
            Object obj = c0960a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0960a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0960a.b = 1;
                if (this.a.collect(bVar, c0960a) == y5bVar) {
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

    public p35(lq1 lq1Var, @Dispatcher(sportyDispatcher = SportyDispatchers.Main) str<k5b> strVar) {
        lq1Var.getClass();
        strVar.getClass();
        this.a = lq1Var;
        this.b = strVar;
        mpe0 mpe0VarB = hwr.b(new xvn(this, 2));
        this.c = mpe0VarB;
        this.d = i2i.c(e1i.e(new a(bm50.f(lq1Var.a(pu0.b.a))), (v5b) mpe0VarB.getValue(), q490.a.b, new BoreDrawConfig(null, 1, null)), null, 3);
    }

    @Override // defpackage.n35
    public final void Q0() {
        kzh.d(new o35(bm50.f(this.a.a(pu0.c.a))), (v5b) this.c.getValue());
    }

    @Override // defpackage.n35
    public final njs<BoreDrawConfig> X0() {
        return this.d;
    }
}
