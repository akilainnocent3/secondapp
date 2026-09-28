package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qf10 implements pf10 {
    public final l610 a;

    public static final class a implements lyh<BaseResponse<BankTradeResponse>> {
        public final /* synthetic */ or60 a;

        /* JADX INFO: renamed from: qf10$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.globalpay.repository.PixRepoImpl$getQrInformation$$inlined$filter$1", f = "PixRepoImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C1010a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1010a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: qf10$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.globalpay.repository.PixRepoImpl$getQrInformation$$inlined$filter$1$2", f = "PixRepoImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C1011a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1011a(v1b v1bVar) {
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
                C1011a c1011a;
                if (v1bVar instanceof C1011a) {
                    c1011a = (C1011a) v1bVar;
                    int i = c1011a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1011a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1011a = new C1011a(v1bVar);
                    }
                } else {
                    c1011a = new C1011a(v1bVar);
                }
                Object obj2 = c1011a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1011a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (((BaseResponse) obj).hasData()) {
                        c1011a.b = 1;
                        if (this.a.emit(obj, c1011a) == y5bVar) {
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

        public a(or60 or60Var) {
            this.a = or60Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BaseResponse<BankTradeResponse>> myhVar, v1b v1bVar) {
            C1010a c1010a;
            if (v1bVar instanceof C1010a) {
                c1010a = (C1010a) v1bVar;
                int i = c1010a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1010a.b = i - Integer.MIN_VALUE;
                } else {
                    c1010a = new C1010a(v1bVar);
                }
            } else {
                c1010a = new C1010a(v1bVar);
            }
            Object obj = c1010a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1010a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1010a.b = 1;
                if (this.a.collect(bVar, c1010a) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.globalpay.repository.PixRepoImpl$getQrInformation$1", f = "PixRepoImpl.kt", l = {15, 15}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<BankTradeResponse>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = qf10.this.new b(this.e, this.f, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<BankTradeResponse>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
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
                goto L4f
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L39
            L21:
                defpackage.uj50.b(r7)
                qf10 r7 = defpackage.qf10.this
                l610 r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.String r4 = r6.f
                java.lang.Object r7 = r7.a(r2, r4, r6)
                if (r7 != r1) goto L39
                goto L4e
            L39:
                com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                if (r7 != 0) goto L42
                com.sporty.android.common.network.data.BaseResponse r7 = new com.sporty.android.common.network.data.BaseResponse
                r7.<init>()
            L42:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L4f
            L4e:
                return r1
            L4f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qf10.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public qf10(l610 l610Var) {
        this.a = l610Var;
    }

    @Override // defpackage.pf10
    public final lyh<BaseResponse<BankTradeResponse>> a(String str, String str2) {
        str.getClass();
        str2.getClass();
        a aVar = new a(new or60(new b(str, str2, null)));
        pfd pfdVar = fse.a;
        return ozh.c(aVar, odd.b);
    }
}
