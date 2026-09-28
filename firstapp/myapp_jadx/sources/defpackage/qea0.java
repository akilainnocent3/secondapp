package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.remote.entity.SocialFollowData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onQueryChanged$4", f = "SocialNetworkSearchViewModel.kt", l = {159}, m = "invokeSuspend", v = 2)
public final class qea0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rea0 b;
    public final /* synthetic */ String c;

    public static final class a extends wqz<Integer, SocialFollowData> {
        public final /* synthetic */ rea0 b;
        public final /* synthetic */ String c;

        public a(rea0 rea0Var, String str) {
            this.b = rea0Var;
            this.c = str;
        }

        @Override // defpackage.wqz
        public final Integer b(xqz<Integer, SocialFollowData> xqzVar) {
            Integer num;
            Integer num2;
            Integer num3 = xqzVar.b;
            if (num3 == null) {
                return null;
            }
            int iIntValue = num3.intValue();
            wqz.b.c<Integer, SocialFollowData> cVarA = xqzVar.a(iIntValue);
            if (cVarA != null && (num2 = cVarA.b) != null) {
                return Integer.valueOf(num2.intValue() + 1);
            }
            wqz.b.c<Integer, SocialFollowData> cVarA2 = xqzVar.a(iIntValue);
            if (cVarA2 == null || (num = cVarA2.c) == null) {
                return null;
            }
            return Integer.valueOf(num.intValue() - 1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.wqz
        public final Object d(wqz.a aVar, x1b x1bVar) {
            pea0 pea0Var;
            int i;
            if (x1bVar instanceof pea0) {
                pea0Var = (pea0) x1bVar;
                int i2 = pea0Var.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pea0Var.d = i2 - Integer.MIN_VALUE;
                } else {
                    pea0Var = new pea0(this, x1bVar);
                }
            } else {
                pea0Var = new pea0(this, x1bVar);
            }
            Object objA = pea0Var.b;
            y5b y5bVar = y5b.a;
            int i3 = pea0Var.d;
            Integer num = null;
            try {
                if (i3 == 0) {
                    uj50.b(objA);
                    Integer num2 = (Integer) aVar.a();
                    int iIntValue = num2 != null ? num2.intValue() : 0;
                    lyh lyhVarE = this.b.e.e(iIntValue, this.c);
                    pea0Var.a = iIntValue;
                    pea0Var.d = 1;
                    objA = s0i.a(lyhVarE, pea0Var);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                    i = iIntValue;
                } else {
                    if (i3 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = pea0Var.a;
                    uj50.b(objA);
                }
                List list = (List) ((BaseResponse) objA).data;
                if (list == null) {
                    list = m2g.a;
                }
                List list2 = list;
                Integer num3 = i == 1 ? null : new Integer(i - 1);
                if (list2.size() >= 20) {
                    num = new Integer(i + 1);
                }
                return new wqz.b.c(list2, num3, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
            } catch (Throwable th) {
                return new wqz.b.a(th);
            }
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onQueryChanged$4$2$1", f = "SocialNetworkSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<SocialFollowData, v1b<? super d9a0>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ rea0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rea0 rea0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = rea0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SocialFollowData socialFollowData, v1b<? super d9a0> v1bVar) {
            return ((b) create(socialFollowData, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            dja0 dja0VarA;
            SocialFollowData socialFollowData = (SocialFollowData) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String nickname = socialFollowData.getNickname();
            String avatar = socialFollowData.getAvatar();
            String strE = avatar != null ? this.b.f.e(avatar) : "";
            boolean zIsFollowed = socialFollowData.isFollowed();
            String userType = socialFollowData.getUserType();
            if (userType == null || (dja0VarA = laa0.a(userType)) == null) {
                dja0VarA = dja0.b;
            }
            return new d9a0(nickname, strE, false, zIsFollowed, dja0VarA, socialFollowData.isFollowed() ? y7i.a.a : y7i.c.a, new Integer(socialFollowData.getFollowersCount()), null, 1920);
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onQueryChanged$4$3", f = "SocialNetworkSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<kqz<d9a0>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ rea0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(rea0 rea0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = rea0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kqz<d9a0> kqzVar, v1b<? super Unit> v1bVar) {
            return ((c) create(kqzVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            kqz kqzVar = (kqz) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            rea0 rea0Var = this.b;
            rea0Var.v.setValue(kqzVar);
            wwd0 wwd0Var = rea0Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, mea0.a((mea0) value, null, null, null, false, 47)));
            return Unit.a;
        }
    }

    public static final class d implements lyh<kqz<d9a0>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ rea0 b;

        @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onQueryChanged$4$invokeSuspend$$inlined$map$1", f = "SocialNetworkSearchViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ rea0 b;

            @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onQueryChanged$4$invokeSuspend$$inlined$map$1$2", f = "SocialNetworkSearchViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, rea0 rea0Var) {
                this.a = myhVar;
                this.b = rea0Var;
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
                    kqz kqzVarB = vqz.b((kqz) obj, new b(this.b, null));
                    aVar.b = 1;
                    if (this.a.emit(kqzVarB, aVar) == y5bVar) {
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

        public d(lyh lyhVar, rea0 rea0Var) {
            this.a = lyhVar;
            this.b = rea0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqz<d9a0>> myhVar, v1b v1bVar) {
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
    public qea0(rea0 rea0Var, String str, v1b<? super qea0> v1bVar) {
        super(2, v1bVar);
        this.b = rea0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qea0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qea0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            iqz iqzVar = new iqz(20, 0, false, 0, 0, 62);
            rea0 rea0Var = this.b;
            t340 t340VarA = rs5.a(new d(new ymz(new joz(new tus(1, rea0Var, this.c), null), iqzVar, null).e, rea0Var), o8i0.d(rea0Var));
            c cVar = new c(rea0Var, null);
            this.a = 1;
            if (kzh.b(t340VarA, cVar, this) == y5bVar) {
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
