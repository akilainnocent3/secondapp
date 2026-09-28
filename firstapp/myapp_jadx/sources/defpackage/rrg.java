package defpackage;

import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.plugin.realsports.data.BetBuilderMarket;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1", f = "EventUseCase.kt", l = {180, 182, 195}, m = "invokeSuspend", v = 2)
public final class rrg extends tje0 implements Function2<myh<? super List<? extends SimpleMarket>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ csg c;
    public final /* synthetic */ String d;

    public static final class a implements lyh<List<? extends BetBuilderMarket>> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: rrg$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1$invokeSuspend$$inlined$map$1", f = "EventUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C1059a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1059a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: rrg$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1$invokeSuspend$$inlined$map$1$2", f = "EventUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C1060a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1060a(v1b v1bVar) {
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
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
                C1060a c1060a;
                if (v1bVar instanceof C1060a) {
                    c1060a = (C1060a) v1bVar;
                    int i = c1060a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1060a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1060a = new C1060a(v1bVar);
                    }
                } else {
                    c1060a = new C1060a(v1bVar);
                }
                Object obj2 = c1060a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1060a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c1060a.b = 1;
                    if (this.a.emit(objB, c1060a) == y5bVar) {
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

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends BetBuilderMarket>> myhVar, v1b v1bVar) {
            C1059a c1059a;
            if (v1bVar instanceof C1059a) {
                c1059a = (C1059a) v1bVar;
                int i = c1059a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1059a.b = i - Integer.MIN_VALUE;
                } else {
                    c1059a = new C1059a(v1bVar);
                }
            } else {
                c1059a = new C1059a(v1bVar);
            }
            Object obj = c1059a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1059a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1059a.b = 1;
                if (this.a.collect(bVar, c1059a) == y5bVar) {
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

    public static final class b implements lyh<List<? extends SimpleMarket>> {
        public final /* synthetic */ a a;
        public final /* synthetic */ String b;

        @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1$invokeSuspend$$inlined$map$2", f = "EventUseCase.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: rrg$b$b, reason: collision with other inner class name */
        public static final class C1061b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ String b;

            /* JADX INFO: renamed from: rrg$b$b$a */
            @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1$invokeSuspend$$inlined$map$2$2", f = "EventUseCase.kt", l = {50}, m = "emit", v = 2)
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
                    return C1061b.this.emit(null, this);
                }
            }

            public C1061b(myh myhVar, String str) {
                this.a = myhVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
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
                if (i2 == 0) {
                    uj50.b(obj2);
                    Iterator<T> it = ((List) obj).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(((BetBuilderMarket) next).getSportId(), this.b));
                    BetBuilderMarket betBuilderMarket = next;
                    List<SimpleMarket> markets = betBuilderMarket != null ? betBuilderMarket.getMarkets() : null;
                    aVar.b = 1;
                    if (this.a.emit(markets, aVar) == y5bVar) {
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

        public b(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends SimpleMarket>> myhVar, v1b v1bVar) {
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
                C1061b c1061b = new C1061b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c1061b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1$remoteMarkets$3", f = "EventUseCase.kt", l = {187}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super List<? extends SimpleMarket>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super List<? extends SimpleMarket>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.b = null;
                this.a = 1;
                if (myhVar.emit(null, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchBetBuilderMarkets$1$remoteMarkets$4", f = "EventUseCase.kt", l = {190, 192}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<List<? extends SimpleMarket>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ csg c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(csg csgVar, String str, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = csgVar;
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.c, this.d, v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends SimpleMarket> list, v1b<? super Unit> v1bVar) {
            return ((d) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            if (r7.g(r6, r2, r0) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            if (r7.a(r2, r6) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            return r1;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.b
                java.util.List r0 = (java.util.List) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L11
                if (r2 != r4) goto L19
            L11:
                defpackage.uj50.b(r7)
                zi50 r7 = (defpackage.zi50) r7
                java.lang.Object r6 = r7.a
                goto L40
            L19:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1f:
                defpackage.uj50.b(r7)
                csg r7 = r6.c
                kmg r7 = r7.d
                java.lang.String r2 = r6.d
                if (r0 == 0) goto L35
                r6.b = r3
                r6.a = r5
                java.lang.Object r6 = r7.g(r6, r2, r0)
                if (r6 != r1) goto L40
                goto L3f
            L35:
                r6.b = r3
                r6.a = r4
                java.lang.Object r6 = r7.a(r2, r6)
                if (r6 != r1) goto L40
            L3f:
                return r1
            L40:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rrg.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrg(csg csgVar, String str, v1b<? super rrg> v1bVar) {
        super(2, v1bVar);
        this.c = csgVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rrg rrgVar = new rrg(this.c, this.d, v1bVar);
        rrgVar.b = obj;
        return rrgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends SimpleMarket>> myhVar, v1b<? super Unit> v1bVar) {
        return ((rrg) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r9 == r1) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 2
            r4 = 1
            csg r5 = r9.c
            r6 = 3
            java.lang.String r7 = r9.d
            r8 = 0
            if (r2 == 0) goto L2c
            if (r2 == r4) goto L24
            if (r2 == r3) goto L1f
            if (r2 != r6) goto L19
            goto L1f
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r8
        L1f:
            defpackage.uj50.b(r10)
            goto L90
        L24:
            defpackage.uj50.b(r10)
            zi50 r10 = (defpackage.zi50) r10
            java.lang.Object r10 = r10.a
            goto L3c
        L2c:
            defpackage.uj50.b(r10)
            kmg r10 = r5.d
            r9.b = r0
            r9.a = r4
            java.lang.Object r10 = r10.c(r7, r9)
            if (r10 != r1) goto L3c
            goto L8f
        L3c:
            zi50$a r2 = defpackage.zi50.b
            boolean r2 = r10 instanceof zi50.b
            if (r2 == 0) goto L43
            r10 = r8
        L43:
            er5 r10 = (defpackage.er5) r10
            if (r10 == 0) goto L54
            java.util.List<com.sporty.android.book.domain.entity.SimpleMarket> r10 = r10.b
            r9.b = r8
            r9.a = r3
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r1) goto L90
            goto L8f
        L54:
            e8h r10 = r5.a
            lyh r10 = r10.g(r7)
            rrg$a r2 = new rrg$a
            r2.<init>(r10)
            rrg$b r10 = new rrg$b
            r10.<init>(r2, r7)
            rrg$c r2 = new rrg$c
            r2.<init>(r6, r8)
            yzh r3 = new yzh
            r3.<init>(r10, r2)
            rrg$d r10 = new rrg$d
            r10.<init>(r5, r7, r8)
            r9.b = r8
            r9.a = r6
            defpackage.h99.a(r0)
            g1i$a r2 = new g1i$a
            r2.<init>(r0, r10)
            java.lang.Object r9 = r3.collect(r2, r9)
            if (r9 != r1) goto L86
            goto L88
        L86:
            kotlin.Unit r9 = kotlin.Unit.a
        L88:
            if (r9 != r1) goto L8b
            goto L8d
        L8b:
            kotlin.Unit r9 = kotlin.Unit.a
        L8d:
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
