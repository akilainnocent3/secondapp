package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.social.data.local.CreatorCreditEntity;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le1c;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e1c extends c82 {
    public final x2c d;
    public final a0c.a e;
    public final t340 f;
    public final b390 i;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditViewModel$creatorCreditPagingFlow$1", f = "CreatorCreditViewModel.kt", l = {43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ mgb0 d;
        public final /* synthetic */ ysm e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mgb0 mgb0Var, ysm ysmVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = mgb0Var;
            this.e = ysmVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            if (r8 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L27;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2a
                if (r2 == r5) goto L24
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L18
                defpackage.uj50.b(r8)
                goto L6b
            L18:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r6
            L1e:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L5a
            L24:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3c
            L2a:
                defpackage.uj50.b(r8)
                r7.c = r6
                r7.a = r0
                r7.b = r5
                mgb0 r8 = r7.d
                java.lang.Object r8 = r8.getUserId(r7)
                if (r8 != r1) goto L3c
                goto L6a
            L3c:
                r2 = r8
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                if (r2 <= 0) goto L46
                goto L47
            L46:
                r8 = r6
            L47:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L5e
                r7.c = r6
                r7.a = r0
                r7.b = r4
                ysm r8 = r7.e
                java.lang.Object r8 = r8.d(r7)
                if (r8 != r1) goto L5a
                goto L6a
            L5a:
                ysm$a r8 = (ysm.a) r8
                java.lang.String r8 = r8.a
            L5e:
                r7.c = r6
                r7.a = r6
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L6b
            L6a:
                return r1
            L6b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e1c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditViewModel$creatorCreditPagingFlow$3$1", f = "CreatorCreditViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<CreatorCreditEntity, v1b<? super b1c>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreatorCreditEntity creatorCreditEntity, v1b<? super b1c> v1bVar) {
            return ((b) create(creatorCreditEntity, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            b1c.a aVar;
            CreatorCreditEntity creatorCreditEntity = (CreatorCreditEntity) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            creatorCreditEntity.getClass();
            String batchId = creatorCreditEntity.getBatchId();
            long claimedAmount = creatorCreditEntity.getClaimedAmount();
            String currency = creatorCreditEntity.getCurrency();
            String strA = p2c.a(creatorCreditEntity.getClaimedAmount(), creatorCreditEntity.getCurrency());
            Date date = new Date(creatorCreditEntity.getLastClaimedTime());
            Locale locale = Locale.getDefault();
            locale.getClass();
            String strL = bwf0.l(date, "dd MMM, yyyy", locale, 2, 0);
            long potentialReward = creatorCreditEntity.getPotentialReward();
            long startTime = creatorCreditEntity.getStartTime();
            long endTime = creatorCreditEntity.getEndTime();
            int status = creatorCreditEntity.getStatus();
            if (status == 1) {
                aVar = b1c.a.b;
            } else if (status == 2) {
                aVar = b1c.a.c;
            } else if (status != 3) {
                aVar = b1c.a.e;
            } else {
                aVar = creatorCreditEntity.getPotentialReward() > 0 ? b1c.a.d : b1c.a.a;
            }
            return new b1c(batchId, claimedAmount, currency, strA, endTime, strL, potentialReward, startTime, aVar, creatorCreditEntity.getUserId(), p2c.b(creatorCreditEntity.getStartTime(), creatorCreditEntity.getEndTime()), "");
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditViewModel$special$$inlined$flatMapLatest$1", f = "CreatorCreditViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super kqz<CreatorCreditEntity>>, String, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ e1c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, e1c e1cVar) {
            super(3, v1bVar);
            this.d = e1cVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super kqz<CreatorCreditEntity>> myhVar, String str, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = str;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                lyh<kqz<CreatorCreditEntity>> lyhVarE = this.d.d.e((String) this.c);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, lyhVarE, this) == y5bVar) {
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

    public static final class d implements lyh<kqz<b1c>> {
        public final /* synthetic */ b77 a;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditViewModel$special$$inlined$map$1", f = "CreatorCreditViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditViewModel$special$$inlined$map$1$2", f = "CreatorCreditViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    kqz kqzVarB = vqz.b((kqz) obj, new b(2, null));
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

        public d(b77 b77Var) {
            this.a = b77Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqz<b1c>> myhVar, v1b v1bVar) {
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

    public e1c(x2c x2cVar, ysm ysmVar, vu60 vu60Var, mgb0 mgb0Var) {
        vu60Var.getClass();
        x2cVar.getClass();
        ysmVar.getClass();
        mgb0Var.getClass();
        this.d = x2cVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.e = (a0c.a) fnf.a(vu60Var, jq40.a(a0c.a.class), o2gVar);
        this.f = rs5.a(new d(r0i.f(new or60(new a(mgb0Var, ysmVar, null)), new c(null, this))), o8i0.d(this));
        this.i = d390.b(0, 0, null, 7);
    }
}
