package defpackage;

import com.sportybet.android.social.data.local.SocialFollowerEntity;
import com.sportybet.android.social.data.local.SocialFollowingEntity;
import com.sportybet.android.social.domain.SocialRouter$SocialNetwork;
import com.sportybet.android.social.domain.entity.SocialMineType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx8a0;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x8a0 extends c82 {
    public final wwd0 A;
    public final wwd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public final wwd0 F;
    public final v340 G;
    public final k1i H;
    public final k1i I;
    public final wuw<bba0> J;
    public lyh<? extends bba0> K;
    public final vu60 d;
    public final ufa0 e;
    public final uqm f;
    public final vga0 i;
    public final bnh0 v;
    public final iym w;
    public final v340 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$followerList$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<kqz<d9a0>, Map<String, ? extends y7i>, ijf0, v1b<? super kqz<d9a0>>, Object> {
        public /* synthetic */ kqz a;
        public /* synthetic */ Map b;
        public /* synthetic */ ijf0 c;

        public a(v1b<? super a> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(kqz<d9a0> kqzVar, Map<String, ? extends y7i> map, ijf0 ijf0Var, v1b<? super kqz<d9a0>> v1bVar) {
            a aVar = x8a0.this.new a(v1bVar);
            aVar.a = kqzVar;
            aVar.b = map;
            aVar.c = ijf0Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kqz kqzVar = this.a;
            Map map = this.b;
            ijf0 ijf0Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return vqz.a(vqz.b(kqzVar, new a9a0(map, null)), new b9a0(ijf0Var, null));
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$followerPagingList$1$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<SocialFollowerEntity, v1b<? super d9a0>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = x8a0.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SocialFollowerEntity socialFollowerEntity, v1b<? super d9a0> v1bVar) {
            return ((b) create(socialFollowerEntity, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SocialFollowerEntity socialFollowerEntity = (SocialFollowerEntity) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new d9a0(socialFollowerEntity.getNickname(), socialFollowerEntity.getAvatarUrl(), Intrinsics.g(socialFollowerEntity.getNickname(), x8a0.this.f.getLastNickName()), socialFollowerEntity.isFollowed(), laa0.a(socialFollowerEntity.getUserType()), null, null, null, 2016);
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$followingList$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements iaj<kqz<d9a0>, Map<String, ? extends y7i>, ijf0, v1b<? super kqz<d9a0>>, Object> {
        public /* synthetic */ kqz a;
        public /* synthetic */ Map b;
        public /* synthetic */ ijf0 c;

        public c(v1b<? super c> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(kqz<d9a0> kqzVar, Map<String, ? extends y7i> map, ijf0 ijf0Var, v1b<? super kqz<d9a0>> v1bVar) {
            c cVar = x8a0.this.new c(v1bVar);
            cVar.a = kqzVar;
            cVar.b = map;
            cVar.c = ijf0Var;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kqz kqzVar = this.a;
            Map map = this.b;
            ijf0 ijf0Var = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return vqz.a(vqz.b(kqzVar, new a9a0(map, null)), new b9a0(ijf0Var, null));
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$followingPagingList$1$1", f = "SocialFollowViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<SocialFollowingEntity, v1b<? super d9a0>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = x8a0.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SocialFollowingEntity socialFollowingEntity, v1b<? super d9a0> v1bVar) {
            return ((d) create(socialFollowingEntity, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SocialFollowingEntity socialFollowingEntity = (SocialFollowingEntity) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new d9a0(socialFollowingEntity.getNickname(), socialFollowingEntity.getAvatarUrl(), Intrinsics.g(socialFollowingEntity.getNickname(), x8a0.this.f.getLastNickName()), socialFollowingEntity.isFollowed(), laa0.a(socialFollowingEntity.getUserType()), null, null, null, 2016);
        }
    }

    public static final class e implements lyh<kqz<d9a0>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ x8a0 b;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$special$$inlined$map$1", f = "SocialFollowViewModel.kt", l = {109}, m = "collect", v = 2)
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

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ x8a0 b;

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$special$$inlined$map$1$2", f = "SocialFollowViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, x8a0 x8a0Var) {
                this.a = myhVar;
                this.b = x8a0Var;
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
                    kqz kqzVarB = vqz.b((kqz) obj, this.b.new b(null));
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

        public e(lyh lyhVar, x8a0 x8a0Var) {
            this.a = lyhVar;
            this.b = x8a0Var;
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

    public static final class f implements lyh<kqz<d9a0>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ x8a0 b;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$special$$inlined$map$2", f = "SocialFollowViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ x8a0 b;

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialFollowViewModel$special$$inlined$map$2$2", f = "SocialFollowViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, x8a0 x8a0Var) {
                this.a = myhVar;
                this.b = x8a0Var;
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
                    kqz kqzVarB = vqz.b((kqz) obj, this.b.new d(null));
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

        public f(lyh lyhVar, x8a0 x8a0Var) {
            this.a = lyhVar;
            this.b = x8a0Var;
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

    public x8a0(vu60 vu60Var, ufa0 ufa0Var, uqm uqmVar, vga0 vga0Var, bnh0 bnh0Var, iym iymVar) {
        vga0 vga0Var2 = ufa0Var.a;
        vu60Var.getClass();
        uqmVar.getClass();
        vga0Var.getClass();
        bnh0Var.getClass();
        iymVar.getClass();
        this.d = vu60Var;
        this.e = ufa0Var;
        this.f = uqmVar;
        this.i = vga0Var;
        this.v = bnh0Var;
        this.w = iymVar;
        ej5.c(o8i0.d(this), null, null, new y8a0(this, null), 3);
        SocialRouter$SocialNetwork.Data.INSTANCE.getClass();
        v340 v340VarD = vu60Var.d(SocialRouter$SocialNetwork.Data.EMPTY, "arg_social_network_data");
        this.y = v340VarD;
        wwd0 wwd0VarA = xwd0.a(new LinkedHashMap());
        this.z = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new LinkedHashMap());
        this.A = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(new ijf0("", 0L, 6));
        this.B = wwd0VarA3;
        this.C = e1i.b(wwd0VarA3);
        n1a0 n1a0Var = n1a0.c;
        wwd0 wwd0VarA4 = xwd0.a(n1a0Var);
        this.D = wwd0VarA4;
        this.E = e1i.b(wwd0VarA4);
        wwd0 wwd0VarA5 = xwd0.a(n1a0Var);
        this.F = wwd0VarA5;
        this.G = e1i.b(wwd0VarA5);
        uwd0<T> uwd0Var = v340VarD.a;
        String username = ((SocialRouter$SocialNetwork.Data) uwd0Var.getValue()).getUsername();
        SocialMineType mineType = ((SocialRouter$SocialNetwork.Data) uwd0Var.getValue()).getMineType();
        SocialMineType socialMineType = SocialMineType.MINE;
        boolean z = mineType == socialMineType;
        username.getClass();
        this.H = r1i.a(rs5.a(new e(vga0Var2.q(new v8a0(username, z)), this), o8i0.d(this)), wwd0VarA, wwd0VarA3, new a(null));
        String username2 = ((SocialRouter$SocialNetwork.Data) uwd0Var.getValue()).getUsername();
        boolean z2 = ((SocialRouter$SocialNetwork.Data) uwd0Var.getValue()).getMineType() == socialMineType;
        username2.getClass();
        this.I = r1i.a(rs5.a(new f(vga0Var2.u(new v8a0(username2, z2)), this), o8i0.d(this)), wwd0VarA2, wwd0VarA3, new c(null));
        this.J = new wuw<>();
        this.K = i2g.a;
    }

    public final Unit x1(String str, y7i y7iVar) {
        wwd0 wwd0Var = this.z;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var.getValue());
        linkedHashMapM.put(str, y7iVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashMapM);
        return Unit.a;
    }

    public final Unit y1(String str, y7i y7iVar) {
        wwd0 wwd0Var = this.A;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var.getValue());
        linkedHashMapM.put(str, y7iVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashMapM);
        return Unit.a;
    }
}
