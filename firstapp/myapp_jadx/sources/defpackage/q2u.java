package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$tryLaunchLoyaltyPromote$1", f = "LoyaltyUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q2u extends tje0 implements Function2<Boolean, v1b<? super lyh<? extends Boolean>>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ u2u b;

    public static final class a implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: q2u$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$tryLaunchLoyaltyPromote$1$invokeSuspend$$inlined$map$1", f = "LoyaltyUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C0997a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0997a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: q2u$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$tryLaunchLoyaltyPromote$1$invokeSuspend$$inlined$map$1$2", f = "LoyaltyUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C0998a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0998a(v1b v1bVar) {
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
                C0998a c0998a;
                if (v1bVar instanceof C0998a) {
                    c0998a = (C0998a) v1bVar;
                    int i = c0998a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0998a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0998a = new C0998a(v1bVar);
                    }
                } else {
                    c0998a = new C0998a(v1bVar);
                }
                Object obj2 = c0998a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0998a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0998a.b = 1;
                    if (this.a.emit(objB, c0998a) == y5bVar) {
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
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            C0997a c0997a;
            if (v1bVar instanceof C0997a) {
                c0997a = (C0997a) v1bVar;
                int i = c0997a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0997a.b = i - Integer.MIN_VALUE;
                } else {
                    c0997a = new C0997a(v1bVar);
                }
            } else {
                c0997a = new C0997a(v1bVar);
            }
            Object obj = c0997a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0997a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0997a.b = 1;
                if (this.a.collect(bVar, c0997a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a(ACKxwYRsuWyGz.KWvKmiPAa);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2u(v1b v1bVar, u2u u2uVar) {
        super(2, v1bVar);
        this.b = u2uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q2u q2uVar = new q2u(v1bVar, this.b);
        q2uVar.a = ((Boolean) obj).booleanValue();
        return q2uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super lyh<? extends Boolean>> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((q2u) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return z ? new a(this.b.b.n()) : new gzh(Boolean.FALSE);
    }
}
