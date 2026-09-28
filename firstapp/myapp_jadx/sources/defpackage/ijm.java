package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ijm implements lyh<Boolean> {
    public final /* synthetic */ vl50 a;

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$special$$inlined$map$2", f = "HomeViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return ijm.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$special$$inlined$map$2$2", f = "HomeViewModel.kt", l = {50}, m = "emit", v = 2)
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
                BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(BOConfigParam.GamesForYouEnabled);
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

    public ijm(vl50 vl50Var) {
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
