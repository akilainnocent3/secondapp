package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class v100 implements lyh<List<? extends BigDecimal>> {
    public final /* synthetic */ vl50 a;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getAmountQuickAddingValues$$inlined$mapNotNull$1", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
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
            return v100.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getAmountQuickAddingValues$$inlined$mapNotNull$1$2", f = "PayConfigRepositoryImpl.kt", l = {89}, m = "emit", v = 2)
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

        /* JADX WARN: Code duplicated, block: B:103:0x0136  */
        /* JADX WARN: Code duplicated, block: B:105:0x013c  */
        /* JADX WARN: Code duplicated, block: B:107:0x0146 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x005e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0074  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            BigDecimal[] bigDecimalArr;
            List listS;
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
                BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(qg4.AmountQuickAddingValuesParam.a);
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(BigDecimal[].class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (!(configValue instanceof Integer)) {
                        if (!(configValue instanceof String) || (configValue = StringsKt.toIntOrNull((String) configValue)) == null) {
                            bigDecimalArr = null;
                        } else if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        listS = bigDecimalArr != null ? ay0.S(bigDecimalArr) : null;
                        if (listS != null) {
                            aVar.b = 1;
                            if (this.a.emit(listS, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (!(configValue instanceof BigDecimal[])) {
                        configValue = null;
                    }
                    bigDecimalArr = (BigDecimal[]) configValue;
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (!(configValue instanceof Long)) {
                        if (!(configValue instanceof String) || (configValue = StringsKt.s0((String) configValue)) == null) {
                            bigDecimalArr = null;
                        } else if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        if (bigDecimalArr != null) {
                        }
                        if (listS != null) {
                            aVar.b = 1;
                            if (this.a.emit(listS, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (!(configValue instanceof BigDecimal[])) {
                        configValue = null;
                    }
                    bigDecimalArr = (BigDecimal[]) configValue;
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (!(configValue instanceof Float)) {
                        if (!(configValue instanceof String) || (configValue = kotlin.text.b.i((String) configValue)) == null) {
                            bigDecimalArr = null;
                        } else if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        if (bigDecimalArr != null) {
                        }
                        if (listS != null) {
                            aVar.b = 1;
                            if (this.a.emit(listS, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (!(configValue instanceof BigDecimal[])) {
                        configValue = null;
                    }
                    bigDecimalArr = (BigDecimal[]) configValue;
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (!(configValue instanceof Double)) {
                        if (!(configValue instanceof String) || (configValue = kotlin.text.b.h((String) configValue)) == null) {
                            bigDecimalArr = null;
                        } else if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        if (bigDecimalArr != null) {
                        }
                        if (listS != null) {
                            aVar.b = 1;
                            if (this.a.emit(listS, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (!(configValue instanceof BigDecimal[])) {
                        configValue = null;
                    }
                    bigDecimalArr = (BigDecimal[]) configValue;
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (!(configValue instanceof Boolean)) {
                        if (!(configValue instanceof String) || (configValue = StringsKt.r0((String) configValue)) == null) {
                            bigDecimalArr = null;
                        } else if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        if (bigDecimalArr != null) {
                        }
                        if (listS != null) {
                            aVar.b = 1;
                            if (this.a.emit(listS, aVar) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else if (!(configValue instanceof BigDecimal[])) {
                        configValue = null;
                    }
                    bigDecimalArr = (BigDecimal[]) configValue;
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue == null || (configValue = configValue.toString()) == null) {
                        bigDecimalArr = null;
                    } else {
                        if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        bigDecimalArr = (BigDecimal[]) configValue;
                    }
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (configValue != null) {
                        if (!(configValue instanceof BigDecimal[])) {
                            configValue = null;
                        }
                        bigDecimalArr = (BigDecimal[]) configValue;
                    } else {
                        bigDecimalArr = null;
                    }
                    if (bigDecimalArr != null) {
                    }
                    if (listS != null) {
                        aVar.b = 1;
                        if (this.a.emit(listS, aVar) == y5bVar) {
                            return y5bVar;
                        }
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

    public v100(vl50 vl50Var) {
        this.a = vl50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends BigDecimal>> myhVar, v1b v1bVar) {
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
