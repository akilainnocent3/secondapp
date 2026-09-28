package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.data.local.SocShareCodeDetailEntity;
import com.sportybet.android.social.data.local.SocShareCodeEntity;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.entity.SocialMineType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lel00;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class el00 extends c82 {
    public final wwd0 A;
    public final wwd0 B;
    public final b390 C;
    public final k1i D;
    public final wwd0 E;
    public final v340 F;
    public final vu60 d;
    public final vha0 e;
    public final oia0 f;
    public final q8a0 i;
    public final psm v;
    public final rdd0 w;
    public final v340 y;
    public final wuw<z7a0> z;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodeList$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<kqz<kl00>, Map<String, ? extends il00>, Set<? extends String>, v1b<? super kqz<kl00>>, Object> {
        public /* synthetic */ kqz a;
        public /* synthetic */ Map b;
        public /* synthetic */ Set c;

        /* JADX INFO: renamed from: el00$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodeList$1$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0523a extends tje0 implements Function2<kl00, v1b<? super kl00>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ Map<String, il00> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0523a(Map<String, il00> map, v1b<? super C0523a> v1bVar) {
                super(2, v1bVar);
                this.b = map;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0523a c0523a = new C0523a(this.b, v1bVar);
                c0523a.a = obj;
                return c0523a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kl00 kl00Var, v1b<? super kl00> v1bVar) {
                return ((C0523a) create(kl00Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                bv7 bv7Var;
                bv7 bv7Var2;
                bv7 bv7Var3;
                kl00 kl00Var = (kl00) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                il00 il00Var = this.b.get(kl00Var.a);
                if (il00Var == null || (bv7Var = il00Var.b) == null) {
                    bv7Var = bv7.b.a;
                }
                bv7 bv7Var4 = bv7Var;
                if (il00Var == null || (bv7Var2 = il00Var.c) == null) {
                    bv7Var2 = bv7.b.a;
                }
                bv7 bv7Var5 = bv7Var2;
                if (il00Var == null || (bv7Var3 = il00Var.d) == null) {
                    bv7Var3 = bv7.b.a;
                }
                return kl00.a(kl00Var, null, bv7Var4, bv7Var5, bv7Var3, 16383);
            }
        }

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodeList$1$2", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<kl00, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ Set<String> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Set<String> set, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = set;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(this.b, v1bVar);
                bVar.a = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kl00 kl00Var, v1b<? super Boolean> v1bVar) {
                return ((b) create(kl00Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                kl00 kl00Var = (kl00) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(!this.b.contains(kl00Var.a));
            }
        }

        @Override // defpackage.iaj
        public final Object d(kqz<kl00> kqzVar, Map<String, ? extends il00> map, Set<? extends String> set, v1b<? super kqz<kl00>> v1bVar) {
            a aVar = new a(4, v1bVar);
            aVar.a = kqzVar;
            aVar.b = map;
            aVar.c = set;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kqz kqzVar = this.a;
            Map map = this.b;
            Set set = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return vqz.a(vqz.b(kqzVar, new C0523a(map, null)), new b(set, null));
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodePagingList$1", f = "PersonalCodeViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super SocialRouter$PersonalSocial.Data>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ el00 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, el00 el00Var) {
            super(2, v1bVar);
            this.c = el00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.c);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super SocialRouter$PersonalSocial.Data> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Object value = this.c.y.a.getValue();
                this.b = null;
                this.a = 1;
                if (myhVar.emit(value, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodePagingList$3$1$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<SocShareCodeEntity, v1b<? super kl00>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ SocialRouter$PersonalSocial.Data b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SocialRouter$PersonalSocial.Data data, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = data;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SocShareCodeEntity socShareCodeEntity, v1b<? super kl00> v1bVar) {
            return ((c) create(socShareCodeEntity, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SocShareCodeEntity socShareCodeEntity = (SocShareCodeEntity) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            SocialRouter$PersonalSocial.Data data = this.b;
            String username = data.getUsername();
            CountryCodeName region = data.getRegion();
            dja0 userType = data.getUserType();
            socShareCodeEntity.getClass();
            username.getClass();
            userType.getClass();
            String shareCode = socShareCodeEntity.getShareCode();
            double totalOdds = socShareCodeEntity.getTotalOdds();
            int foldsAmount = socShareCodeEntity.getFoldsAmount();
            String userId = socShareCodeEntity.getUserId();
            long deadline = socShareCodeEntity.getDeadline();
            long createTime = socShareCodeEntity.getCreateTime();
            List<SocShareCodeDetailEntity> shareCodeDetail = socShareCodeEntity.getShareCodeDetail();
            ArrayList arrayList = new ArrayList(l48.r(shareCodeDetail, 10));
            for (SocShareCodeDetailEntity socShareCodeDetailEntity : shareCodeDetail) {
                socShareCodeDetailEntity.getClass();
                arrayList.add(new jl00(socShareCodeDetailEntity.getEventId(), b3.T(socShareCodeDetailEntity.getEventId()), socShareCodeDetailEntity.getStartTime(), socShareCodeDetailEntity.getEndTime(), socShareCodeDetailEntity.getHomeTeamName(), socShareCodeDetailEntity.getAwayTeamName(), socShareCodeDetailEntity.getMarketId(), socShareCodeDetailEntity.getMarketDescription(), socShareCodeDetailEntity.getOutcomeId(), socShareCodeDetailEntity.getOutcomeDescription(), socShareCodeDetailEntity.getOdds(), socShareCodeDetailEntity.getSportId(), socShareCodeDetailEntity.getTournamentId(), socShareCodeDetailEntity.getTournamentIcon(), socShareCodeDetailEntity.getTournamentName(), null));
            }
            String note = socShareCodeEntity.getNote();
            z320 popularityLevel = socShareCodeEntity.getPopularityLevel();
            boolean zIsCreatorCode = socShareCodeEntity.isCreatorCode();
            String str = (115200 & 4096) != 0 ? null : note;
            bv7.b bVar = bv7.b.a;
            shareCode.getClass();
            userId.getClass();
            bVar.getClass();
            String avatarUrl = (130559 & 512) != 0 ? null : data.getAvatarUrl();
            bv7.b bVar2 = (130559 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? bVar : null;
            bv7.b bVar3 = (32768 & 130559) != 0 ? bVar : null;
            bv7.b bVar4 = (65536 & 130559) != 0 ? bVar : null;
            bVar2.getClass();
            bVar3.getClass();
            bVar4.getClass();
            return new kl00(shareCode, totalOdds, foldsAmount, userId, deadline, createTime, username, popularityLevel, zIsCreatorCode, avatarUrl, region, userType, str, arrayList, bVar2, bVar3, bVar4);
        }
    }

    public static final class d implements lyh<kqz<kl00>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ SocialRouter$PersonalSocial.Data b;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodePagingList$lambda$1$$inlined$map$1", f = "PersonalCodeViewModel.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ SocialRouter$PersonalSocial.Data b;

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$shareCodePagingList$lambda$1$$inlined$map$1$2", f = "PersonalCodeViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, SocialRouter$PersonalSocial.Data data) {
                this.a = myhVar;
                this.b = data;
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
                    kqz kqzVarB = vqz.b((kqz) obj, new c(this.b, null));
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

        public d(lyh lyhVar, SocialRouter$PersonalSocial.Data data) {
            this.a = lyhVar;
            this.b = data;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqz<kl00>> myhVar, v1b v1bVar) {
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

    public static final class e implements lyh<SocialRouter$PersonalSocial.Data> {
        public final /* synthetic */ xzh a;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$special$$inlined$filter$1", f = "PersonalCodeViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$special$$inlined$filter$1$2", f = "PersonalCodeViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    if (!StringsKt.U(((SocialRouter$PersonalSocial.Data) obj).getUsername())) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
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

        public e(xzh xzhVar) {
            this.a = xzhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super SocialRouter$PersonalSocial.Data> myhVar, v1b v1bVar) {
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

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$special$$inlined$flatMapLatest$1", f = "PersonalCodeViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super kqz<kl00>>, SocialRouter$PersonalSocial.Data, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ el00 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v1b v1bVar, el00 el00Var) {
            super(3, v1bVar);
            this.d = el00Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super kqz<kl00>> myhVar, SocialRouter$PersonalSocial.Data data, v1b<? super Unit> v1bVar) {
            f fVar = new f(v1bVar, this.d);
            fVar.b = myhVar;
            fVar.c = data;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                SocialRouter$PersonalSocial.Data data = (SocialRouter$PersonalSocial.Data) this.c;
                vha0 vha0Var = this.d.e;
                String username = data.getUsername();
                boolean z = data.getMineType() == SocialMineType.MINE;
                vha0Var.getClass();
                username.getClass();
                d dVar = new d(vha0Var.a.m(new y7a0(username, z)), data);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, dVar, this) == y5bVar) {
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

    public el00(vu60 vu60Var, vha0 vha0Var, oia0 oia0Var, q8a0 q8a0Var, psm psmVar, rdd0 rdd0Var) {
        vu60Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.d = vu60Var;
        this.e = vha0Var;
        this.f = oia0Var;
        this.i = q8a0Var;
        this.v = psmVar;
        this.w = rdd0Var;
        SocialRouter$PersonalSocial.Data.INSTANCE.getClass();
        this.y = vu60Var.d(SocialRouter$PersonalSocial.Data.EMPTY, "arg_personal_social_data");
        this.z = new wuw<>();
        wwd0 wwd0VarA = xwd0.a(new LinkedHashMap());
        this.A = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(t3g.a);
        this.B = wwd0VarA2;
        b390 b390VarB = d390.b(0, 1, pb5.b, 1);
        this.C = b390VarB;
        this.D = r1i.a(rs5.a(r0i.f(new e(new xzh(b390VarB, new b(null, this))), new f(null, this)), o8i0.d(this)), wwd0VarA, wwd0VarA2, new a(4, null));
        wwd0 wwd0VarA3 = xwd0.a(qm00.c.a);
        this.E = wwd0VarA3;
        this.F = e1i.b(wwd0VarA3);
    }

    public final void A1(SocialRouter$PersonalSocial.Data data, boolean z, boolean z2) {
        data.getClass();
        this.d.e(data, "arg_personal_social_data");
        if (z) {
            if (z2) {
                this.B.setValue(t3g.a);
            }
            this.C.a(data);
        }
    }

    public final Unit x1(String str, boolean z, bv7 bv7Var) {
        String str2;
        il00 il00Var;
        if (z) {
            qm00 qm00Var = (qm00) this.F.a.getValue();
            if (qm00Var instanceof qm00.a) {
                qm00.a aVar = new qm00.a(kl00.a(((qm00.a) qm00Var).a, null, null, null, bv7Var, Settings.DEFAULT_INITIAL_WINDOW_SIZE));
                wwd0 wwd0Var = this.E;
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
                Unit unit = Unit.a;
                if (unit == y5b.a) {
                    return unit;
                }
            }
            return Unit.a;
        }
        wwd0 wwd0Var2 = this.A;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var2.getValue());
        il00 il00Var2 = (il00) linkedHashMapM.get(str);
        if (il00Var2 != null) {
            il00Var = il00.a(il00Var2, null, null, bv7Var, 7);
            str2 = str;
        } else {
            str2 = str;
            il00Var = new il00(str2, null, null, bv7Var, 6);
        }
        linkedHashMapM.put(str2, il00Var);
        wwd0Var2.getClass();
        wwd0Var2.k(null, linkedHashMapM);
        return Unit.a;
    }

    public final Unit y1(String str, boolean z, bv7 bv7Var) {
        String str2;
        il00 il00Var;
        if (z) {
            qm00 qm00Var = (qm00) this.F.a.getValue();
            if (qm00Var instanceof qm00.a) {
                qm00.a aVar = new qm00.a(kl00.a(((qm00.a) qm00Var).a, null, null, bv7Var, null, 98303));
                wwd0 wwd0Var = this.E;
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
                Unit unit = Unit.a;
                if (unit == y5b.a) {
                    return unit;
                }
            }
            return Unit.a;
        }
        wwd0 wwd0Var2 = this.A;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var2.getValue());
        il00 il00Var2 = (il00) linkedHashMapM.get(str);
        if (il00Var2 != null) {
            il00Var = il00.a(il00Var2, null, bv7Var, null, 11);
            str2 = str;
        } else {
            str2 = str;
            il00Var = new il00(str2, null, bv7Var, null, 10);
        }
        linkedHashMapM.put(str2, il00Var);
        wwd0Var2.getClass();
        wwd0Var2.k(null, linkedHashMapM);
        return Unit.a;
    }

    public final Unit z1(String str, boolean z, bv7 bv7Var) {
        String str2;
        il00 il00Var;
        if (z) {
            qm00 qm00Var = (qm00) this.F.a.getValue();
            if (qm00Var instanceof qm00.a) {
                qm00.a aVar = new qm00.a(kl00.a(((qm00.a) qm00Var).a, null, bv7Var, null, null, 114687));
                wwd0 wwd0Var = this.E;
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
                Unit unit = Unit.a;
                if (unit == y5b.a) {
                    return unit;
                }
            }
            return Unit.a;
        }
        wwd0 wwd0Var2 = this.A;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var2.getValue());
        il00 il00Var2 = (il00) linkedHashMapM.get(str);
        if (il00Var2 != null) {
            il00Var = il00.a(il00Var2, bv7Var, null, null, 13);
            str2 = str;
        } else {
            str2 = str;
            il00Var = new il00(str2, bv7Var, null, null, 12);
        }
        linkedHashMapM.put(str2, il00Var);
        wwd0Var2.getClass();
        wwd0Var2.k(null, linkedHashMapM);
        return Unit.a;
    }
}
