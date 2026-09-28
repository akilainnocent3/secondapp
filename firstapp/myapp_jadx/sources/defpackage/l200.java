package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class l200 implements lyh<List<? extends r5e>> {
    public final /* synthetic */ vl50 a;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$special$$inlined$mapNotNull$2", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
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
            return l200.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$special$$inlined$mapNotNull$2$2", f = "PayConfigRepositoryImpl.kt", l = {107}, m = "emit", v = 2)
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

        /* JADX WARN: Code duplicated, block: B:24:0x005e  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            String string;
            List<String> listSplit$default;
            T next;
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
            ArrayList arrayList = null;
            if (i2 == 0) {
                uj50.b(obj2);
                BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(qg4.DepositOthersOrderParam.a);
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(String.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        if (!(configValue instanceof String)) {
                            configValue = null;
                        }
                        string = configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                        string = null;
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (configValue instanceof Long) {
                        if (!(configValue instanceof String)) {
                            configValue = null;
                        }
                        string = configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                        string = null;
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (configValue instanceof Float) {
                        if (!(configValue instanceof String)) {
                            configValue = null;
                        }
                        string = configValue;
                    } else {
                        if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                        string = null;
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (configValue instanceof Double) {
                        if (!(configValue instanceof String)) {
                            configValue = null;
                        }
                        string = configValue;
                    } else {
                        if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                        string = null;
                    }
                } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue == null || (string = configValue.toString()) == null) {
                        }
                    } else if (configValue != null) {
                        if (!(configValue instanceof String)) {
                            configValue = null;
                        }
                        string = configValue;
                    }
                    string = null;
                } else if (configValue instanceof Boolean) {
                    if (!(configValue instanceof String)) {
                        configValue = null;
                    }
                    string = configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.r0((String) configValue);
                    }
                    string = null;
                }
                if (string != null && (listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{","}, false, 0, 6, null)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listSplit$default) {
                        r5e.b.getClass();
                        str.getClass();
                        Iterator<T> it = r5e.C.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (!((r5e) next).a.equals(str));
                        r5e r5eVar = next;
                        if (r5eVar != null) {
                            arrayList2.add(r5eVar);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList != null) {
                    aVar.b = 1;
                    if (this.a.emit(arrayList, aVar) == y5bVar) {
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

    public l200(vl50 vl50Var) {
        this.a = vl50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends r5e>> myhVar, v1b v1bVar) {
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
