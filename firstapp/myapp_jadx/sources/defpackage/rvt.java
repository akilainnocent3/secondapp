package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyHomeUseCase$getGuestBundle$1", f = "LoyaltyHomeUseCase.kt", l = {50, 51, 56}, m = "invokeSuspend", v = 2)
public final class rvt extends tje0 implements Function2<myh<? super oal>, v1b<? super Unit>, Object> {
    public LoyaltyTierConfig a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ svt d;

    public static final class a implements lyh<LoyaltyTierConfig> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: rvt$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyHomeUseCase$getGuestBundle$1$invokeSuspend$$inlined$map$1", f = "LoyaltyHomeUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C1066a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1066a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: rvt$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyHomeUseCase$getGuestBundle$1$invokeSuspend$$inlined$map$1$2", f = "LoyaltyHomeUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C1067a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1067a(v1b v1bVar) {
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
                C1067a c1067a;
                if (v1bVar instanceof C1067a) {
                    c1067a = (C1067a) v1bVar;
                    int i = c1067a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1067a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1067a = new C1067a(v1bVar);
                    }
                } else {
                    c1067a = new C1067a(v1bVar);
                }
                Object obj2 = c1067a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1067a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c1067a.b = 1;
                    if (this.a.emit(objB, c1067a) == y5bVar) {
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
        public final Object collect(myh<? super LoyaltyTierConfig> myhVar, v1b v1bVar) {
            C1066a c1066a;
            if (v1bVar instanceof C1066a) {
                c1066a = (C1066a) v1bVar;
                int i = c1066a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1066a.b = i - Integer.MIN_VALUE;
                } else {
                    c1066a = new C1066a(v1bVar);
                }
            } else {
                c1066a = new C1066a(v1bVar);
            }
            Object obj = c1066a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1066a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1066a.b = 1;
                if (this.a.collect(bVar, c1066a) == y5bVar) {
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
    public rvt(svt svtVar, v1b<? super rvt> v1bVar) {
        super(2, v1bVar);
        this.d = svtVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rvt rvtVar = new rvt(this.d, v1bVar);
        rvtVar.c = obj;
        return rvtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super oal> myhVar, v1b<? super Unit> v1bVar) {
        return ((rvt) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x0149  */
    /* JADX WARN: Code duplicated, block: B:46:0x0151  */
    /* JADX WARN: Code duplicated, block: B:48:0x0157  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0137, code lost:
    
        if (r1.emit(r9, r33) == r2) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
