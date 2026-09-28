package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sportybet.android.globalpay.data.FullSummaryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v1l implements u1l {
    public final s1l a;

    @c0d(c = "com.sportybet.android.globalpay.repository.GlobalPayRepoImpl$getFirstDepositState$1", f = "GlobalPayRepoImpl.kt", l = {59, 58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<DepositHistoryStatusData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = v1l.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<DepositHistoryStatusData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L4b
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L35
            L21:
                defpackage.uj50.b(r7)
                v1l r7 = defpackage.v1l.this
                s1l r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r1) goto L35
                goto L4a
            L35:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                if (r7 != 0) goto L3e
                com.sporty.android.common.network.data.BaseResponse r7 = new com.sporty.android.common.network.data.BaseResponse
                r7.<init>()
            L3e:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: v1l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements lyh<lk50<? extends BaseResponse<FullSummaryData>>> {
        public final /* synthetic */ or60 a;

        @c0d(c = "com.sportybet.android.globalpay.repository.GlobalPayRepoImpl$getFullSummaryAmount$$inlined$map$1", f = "GlobalPayRepoImpl.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: v1l$b$b, reason: collision with other inner class name */
        public static final class C1196b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: v1l$b$b$a */
            @c0d(c = "com.sportybet.android.globalpay.repository.GlobalPayRepoImpl$getFullSummaryAmount$$inlined$map$1$2", f = "GlobalPayRepoImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return C1196b.this.emit(null, this);
                }
            }

            public C1196b(myh myhVar) {
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
                    lk50.c cVar = new lk50.c((BaseResponse) obj);
                    aVar.b = 1;
                    if (this.a.emit(cVar, aVar) == y5bVar) {
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

        public b(or60 or60Var) {
            this.a = or60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends BaseResponse<FullSummaryData>>> myhVar, v1b v1bVar) {
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
                C1196b c1196b = new C1196b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1196b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.globalpay.repository.GlobalPayRepoImpl$getFullSummaryAmount$1", f = "GlobalPayRepoImpl.kt", l = {50, 49}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super BaseResponse<FullSummaryData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
            this.i = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = v1l.this.new c(this.e, this.f, this.i, v1bVar);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<FullSummaryData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L18;
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
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r8)
                goto L51
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L3b
            L21:
                defpackage.uj50.b(r8)
                v1l r8 = defpackage.v1l.this
                s1l r8 = r8.a
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r2 = r7.e
                java.lang.String r4 = r7.f
                boolean r6 = r7.i
                java.lang.Object r8 = r8.b(r2, r4, r6, r7)
                if (r8 != r1) goto L3b
                goto L50
            L3b:
                com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
                if (r8 != 0) goto L44
                com.sporty.android.common.network.data.BaseResponse r8 = new com.sporty.android.common.network.data.BaseResponse
                r8.<init>()
            L44:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L51
            L50:
                return r1
            L51:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: v1l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.repository.GlobalPayRepoImpl$getFullSummaryAmount$3", f = "GlobalPayRepoImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<FullSummaryData>>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends BaseResponse<FullSummaryData>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            d dVar = new d(3, v1bVar);
            dVar.b = myhVar;
            dVar.c = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            Throwable th = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                lk50.a aVarA = gtc0.a(th, obj);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(aVarA, this) == y5bVar) {
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

    public v1l(s1l s1lVar) {
        this.a = s1lVar;
    }

    @Override // defpackage.u1l
    public final lyh a(String[] strArr, String[] strArr2, String[] strArr3) {
        yzh yzhVar = new yzh(new w1l(new or60(new x1l(this, strArr, strArr2, strArr3, null))), new y1l(3, null));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVar, odd.b);
    }

    @Override // defpackage.u1l
    public final lyh<lk50<BaseResponse<DepositHistoryStatusData>>> b() {
        yzh yzhVarA = bm50.a(new or60(new a(null)));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVarA, odd.b);
    }

    @Override // defpackage.u1l
    public final lyh<lk50<BaseResponse<FullSummaryData>>> c(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        yzh yzhVar = new yzh(new b(new or60(new c(str, str2, z, null))), new d(3, null));
        pfd pfdVar = fse.a;
        return ozh.c(yzhVar, odd.b);
    }

    @Override // defpackage.u1l
    public final Object d(String str, fuh0 fuh0Var) {
        return this.a.c(str, fuh0Var);
    }
}
