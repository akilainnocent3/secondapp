package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class c200 implements lyh<List<? extends String>> {
    public final /* synthetic */ vl50 a;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getPayMethodToolTipsEnabled$$inlined$mapNotNull$1", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
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
            return c200.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getPayMethodToolTipsEnabled$$inlined$mapNotNull$1$2", f = "PayConfigRepositoryImpl.kt", l = {89}, m = "emit", v = 2)
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

        /* JADX WARN: Code duplicated, block: B:25:0x005f  */
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
            String string;
            List listSplit$default;
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
            String str = null;
            if (i2 == 0) {
                uj50.b(obj2);
                BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(qg4.EWalletToolTipEnabledParam.a);
                String configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(String.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        if (configValue instanceof String) {
                            str = configValue;
                        }
                        str = str;
                    } else if (configValue instanceof String) {
                        StringsKt.toIntOrNull(configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (configValue instanceof Long) {
                        if (configValue instanceof String) {
                            str = configValue;
                        }
                        str = str;
                    } else if (configValue instanceof String) {
                        StringsKt.s0(configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (configValue instanceof Float) {
                        if (configValue instanceof String) {
                            str = configValue;
                        }
                        str = str;
                    } else if (configValue instanceof String) {
                        kotlin.text.b.i(configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (configValue instanceof Double) {
                        if (configValue instanceof String) {
                            str = configValue;
                        }
                        str = str;
                    } else if (configValue instanceof String) {
                        kotlin.text.b.h(configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (configValue instanceof Boolean) {
                        if (configValue instanceof String) {
                            str = configValue;
                        }
                        str = str;
                    } else if (configValue instanceof String) {
                        StringsKt.r0(configValue);
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null && (string = configValue.toString()) != null) {
                        str = string;
                    }
                } else if (configValue != null) {
                    if (configValue instanceof String) {
                        str = configValue;
                    }
                    str = str;
                }
                if (str == null || (listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null)) == null) {
                    listSplit$default = m2g.a;
                }
                if (listSplit$default != null) {
                    aVar.b = 1;
                    if (this.a.emit(listSplit$default, aVar) == y5bVar) {
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

    public c200(vl50 vl50Var) {
        this.a = vl50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends String>> myhVar, v1b v1bVar) {
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
