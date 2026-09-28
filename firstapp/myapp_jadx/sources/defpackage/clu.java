package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$preloadTutorialImages$1", f = "MainViewModel.kt", l = {698}, m = "invokeSuspend", v = 2)
public final class clu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ oku b;

    @c0d(c = "com.sportybet.android.home.MainViewModel$preloadTutorialImages$1$2", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z);
        }
    }

    public static final class b implements lyh<Boolean> {
        public final /* synthetic */ vl50 a;

        @c0d(c = "com.sportybet.android.home.MainViewModel$preloadTutorialImages$1$invokeSuspend$$inlined$map$1", f = "MainViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: clu$b$b, reason: collision with other inner class name */
        public static final class C0176b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: clu$b$b$a */
            @c0d(c = "com.sportybet.android.home.MainViewModel$preloadTutorialImages$1$invokeSuspend$$inlined$map$1$2", f = "MainViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0176b.this.emit(null, this);
                }
            }

            public C0176b(myh myhVar) {
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
                Object obj3 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(BOConfigParam.RemixBetEnabled);
                    Object configValue = response != null ? response.getConfigValue() : null;
                    dq7 dq7VarA = jq40.a(Boolean.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            obj3 = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            obj3 = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            obj3 = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (configValue instanceof Boolean) {
                                obj3 = configValue;
                            }
                            obj3 = (Boolean) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (configValue instanceof Boolean) {
                            obj3 = (Boolean) configValue;
                        } else if ((configValue instanceof String) && (boolR0 = StringsKt.r0((String) configValue)) != null) {
                            obj3 = boolR0;
                        }
                    } else if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (configValue instanceof Boolean) {
                            obj3 = configValue;
                        }
                        obj3 = (Boolean) obj3;
                    }
                    Boolean boolValueOf = Boolean.valueOf(Intrinsics.g(obj3, Boolean.TRUE));
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

        public b(vl50 vl50Var) {
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
                C0176b c0176b = new C0176b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0176b, aVar) == y5bVar) {
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
    public clu(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.b = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new clu(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((clu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        oku okuVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            b bVar = new b(bm50.f(okuVar.y.a(pu0.b.a)));
            a aVar = new a(2, null);
            this.a = 1;
            obj = s0i.b(bVar, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((Boolean) obj).getClass();
        okuVar.N.a(R.string.bet_history__remix_bet_tutorial_img_1, R.string.bet_history__remix_bet_tutorial_img_2);
        return Unit.a;
    }
}
