package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SearchData;
import com.sportybet.plugin.realsports.data.SearchRequestData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getLiveSearchResult$1", f = "SearchViewModel.kt", l = {69, 75}, m = "invokeSuspend", v = 2)
public final class x180 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n280 b;
    public final /* synthetic */ SearchRequestData c;

    @c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getLiveSearchResult$1$2", f = "SearchViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super lk50<? extends List<? extends Event>>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends List<? extends Event>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.b = myhVar;
            aVar.c = th;
            return aVar.invokeSuspend(Unit.a);
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

    public static final class b<T> implements myh {
        public final /* synthetic */ n280 a;

        public b(n280 n280Var) {
            this.a = n280Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.d.m((lk50) obj);
            return Unit.a;
        }
    }

    public static final class c implements lyh<lk50<? extends List<? extends Event>>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getLiveSearchResult$1$invokeSuspend$$inlined$map$1", f = "SearchViewModel.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getLiveSearchResult$1$invokeSuspend$$inlined$map$1$2", f = "SearchViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    lk50.c cVar = new lk50.c(((SearchData) ((BaseResponse) obj).data).events);
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

        public c(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends List<? extends Event>>> myhVar, v1b v1bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x180(n280 n280Var, SearchRequestData searchRequestData, v1b<? super x180> v1bVar) {
        super(2, v1bVar);
        this.b = n280Var;
        this.c = searchRequestData;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x180(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x180) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r2.collect(r7, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            r4 = 1
            n280 r5 = r6.b
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L4f
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            defpackage.uj50.b(r7)
            goto L29
        L1d:
            defpackage.uj50.b(r7)
            r6.a = r4
            java.lang.Object r7 = r5.x1(r6)
            if (r7 != r0) goto L29
            goto L4e
        L29:
            h940 r7 = r5.a
            com.sportybet.plugin.realsports.data.SearchRequestData r1 = r6.c
            lyh r7 = r7.g(r1)
            x180$c r1 = new x180$c
            r1.<init>(r7)
            x180$a r7 = new x180$a
            r4 = 3
            r7.<init>(r4, r2)
            yzh r2 = new yzh
            r2.<init>(r1, r7)
            x180$b r7 = new x180$b
            r7.<init>(r5)
            r6.a = r3
            java.lang.Object r6 = r2.collect(r7, r6)
            if (r6 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x180.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
