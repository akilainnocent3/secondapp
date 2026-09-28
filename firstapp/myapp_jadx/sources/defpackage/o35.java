package defpackage;

import com.sporty.android.core.model.config.BoreDrawItem;
import com.sporty.android.core.model.config.BoreDrawSelectionEligibilityDto;
import com.sporty.android.core.model.config.BoreDrawSport;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class o35 implements lyh<BoreDrawConfig> {
    public final /* synthetic */ vl50 a;

    @c0d(c = "com.sportybet.delegate.BoreDrawDelegateImpl$fetchBoreDrawConfigFlow$$inlined$map$1", f = "BoreDrawDelegateImpl.kt", l = {109}, m = "collect", v = 2)
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
            return o35.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.delegate.BoreDrawDelegateImpl$fetchBoreDrawConfigFlow$$inlined$map$1$2", f = "BoreDrawDelegateImpl.kt", l = {50}, m = "emit", v = 2)
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

        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:80:0x010a  */
        /* JADX WARN: Code duplicated, block: B:85:0x0121 A[RETURN] */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            BoreDrawSelectionEligibilityDto boreDrawSelectionEligibilityDto;
            BoreDrawConfig boreDrawConfig;
            BoreDrawSport sport;
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                        aVar.b = 1;
                        if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                    aVar.b = 1;
                    if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                    aVar.b = 1;
                    if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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
                    aVar.b = 1;
                    if (this.a.emit(boreDrawConfig, aVar) == y5bVar) {
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

    public o35(vl50 vl50Var) {
        this.a = vl50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super BoreDrawConfig> myhVar, v1b v1bVar) {
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
