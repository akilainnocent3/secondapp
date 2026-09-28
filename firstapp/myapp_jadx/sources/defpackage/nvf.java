package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.NicknameAvailabilityResponse;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$observeUsernameAvailability$1", f = "EditUsernameViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class nvf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lvf b;

    public static final class a<T> implements myh {
        public final /* synthetic */ lvf a;

        public a(lvf lvfVar) {
            this.a = lvfVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            kvf kvfVar;
            ResourceUiText resourceUiText;
            kqh0 kqh0Var = (kqh0) obj;
            wwd0 wwd0Var = this.a.a;
            do {
                value = wwd0Var.getValue();
                kvfVar = (kvf) value;
                int iOrdinal = kqh0Var.ordinal();
                if (iOrdinal == 3) {
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.personal_page__username_already_taken_inline);
                } else if (iOrdinal != 4) {
                    resourceUiText = null;
                } else {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.personal_page__username_contains_restricted_words_inline);
                }
            } while (!wwd0Var.g(value, kvf.a(kvfVar, null, false, false, kqh0Var, resourceUiText, null, 0, 207)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$observeUsernameAvailability$1$invokeSuspend$$inlined$flatMapLatest$1", f = "EditUsernameViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super kqh0>, lvf.a, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ lvf d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, lvf lvfVar) {
            super(3, v1bVar);
            this.d = lvfVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super kqh0> myhVar, lvf.a aVar, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d);
            bVar.b = myhVar;
            bVar.c = aVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lyh gzhVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                lvf.a aVar = (lvf.a) this.c;
                if (aVar.b) {
                    lvf lvfVar = this.d;
                    uga0 uga0Var = lvfVar.f;
                    String str = aVar.a;
                    uga0Var.getClass();
                    str.getClass();
                    gzhVar = new d(bm50.a(uga0Var.a.r(str)), lvfVar);
                } else {
                    gzhVar = new gzh(kqh0.a);
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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

    public static final class c implements lyh<lvf.a> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$observeUsernameAvailability$1$invokeSuspend$$inlined$map$1", f = "EditUsernameViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$observeUsernameAvailability$1$invokeSuspend$$inlined$map$1$2", f = "EditUsernameViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    kvf kvfVar = (kvf) obj;
                    lvf.a aVar2 = new lvf.a(kvfVar.b.a.b, kvfVar.c && kvfVar.d);
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

        public c(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lvf.a> myhVar, v1b v1bVar) {
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

    public static final class d implements lyh<kqh0> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ lvf b;

        @c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$observeUsernameAvailability$1$invokeSuspend$lambda$1$$inlined$map$1", f = "EditUsernameViewModel.kt", l = {109}, m = "collect", v = 2)
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

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$observeUsernameAvailability$1$invokeSuspend$lambda$1$$inlined$map$1$2", f = "EditUsernameViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, lvf lvfVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0063  */
            /* JADX WARN: Code duplicated, block: B:29:0x0069  */
            /* JADX WARN: Code duplicated, block: B:30:0x006c  */
            /* JADX WARN: Code duplicated, block: B:32:0x0070  */
            /* JADX WARN: Code duplicated, block: B:34:0x0076  */
            /* JADX WARN: Code duplicated, block: B:37:0x0083  */
            /* JADX WARN: Code duplicated, block: B:38:0x0086  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                kqh0 kqh0Var;
                int i;
                NicknameAvailabilityResponse nicknameAvailabilityResponse;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i2 = aVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i3 = aVar.b;
                if (i3 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.b) {
                        kqh0Var = kqh0.b;
                    } else if (lk50Var instanceof lk50.c) {
                        BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                        if (baseResponse.bizCode != 10000) {
                            i = baseResponse.bizCode;
                            if (i == 11017) {
                                kqh0Var = kqh0.e;
                            } else if (i == 11011) {
                                kqh0Var = kqh0.d;
                            } else {
                                nicknameAvailabilityResponse = (NicknameAvailabilityResponse) baseResponse.data;
                                if (nicknameAvailabilityResponse != null ? Intrinsics.g(nicknameAvailabilityResponse.getAvailable(), Boolean.FALSE) : false) {
                                    kqh0Var = kqh0.d;
                                } else {
                                    kqh0Var = kqh0.f;
                                }
                            }
                        } else {
                            NicknameAvailabilityResponse nicknameAvailabilityResponse2 = (NicknameAvailabilityResponse) baseResponse.data;
                            if (nicknameAvailabilityResponse2 != null ? Intrinsics.g(nicknameAvailabilityResponse2.getAvailable(), Boolean.TRUE) : false) {
                                kqh0Var = kqh0.c;
                            } else {
                                i = baseResponse.bizCode;
                                if (i == 11017) {
                                    kqh0Var = kqh0.e;
                                } else if (i == 11011) {
                                    kqh0Var = kqh0.d;
                                } else {
                                    nicknameAvailabilityResponse = (NicknameAvailabilityResponse) baseResponse.data;
                                    if (nicknameAvailabilityResponse != null ? Intrinsics.g(nicknameAvailabilityResponse.getAvailable(), Boolean.FALSE) : false) {
                                        kqh0Var = kqh0.d;
                                    } else {
                                        kqh0Var = kqh0.f;
                                    }
                                }
                            }
                        }
                    } else {
                        if (!(lk50Var instanceof lk50.a)) {
                            uhc.a();
                            return null;
                        }
                        kqh0Var = kqh0.f;
                    }
                    aVar.b = 1;
                    if (this.a.emit(kqh0Var, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i3 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public d(yzh yzhVar, lvf lvfVar) {
            this.a = yzhVar;
            this.b = lvfVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqh0> myhVar, v1b v1bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvf(v1b v1bVar, lvf lvfVar) {
        super(2, v1bVar);
        this.b = lvfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nvf(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nvf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lvf lvfVar = this.b;
            b77 b77VarF = r0i.f(szh.a(uzh.b(new c(lvfVar.a)), 300L), new b(null, lvfVar));
            a aVar = new a(lvfVar);
            this.a = 1;
            if (b77VarF.collect(aVar, this) == y5bVar) {
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
