package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialProfileUseCase$updateVerifiedNickname$1", f = "SocialProfileUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tga0 extends tje0 implements Function2<BaseResponse<UpdateNicknameResponse>, v1b<? super lyh<? extends BaseResponse<UpdateNicknameResponse>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ uga0 c;

    public static final class a implements lyh<BaseResponse<UpdateNicknameResponse>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ BaseResponse b;

        /* JADX INFO: renamed from: tga0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.social.domain.usecase.SocialProfileUseCase$updateVerifiedNickname$1$invokeSuspend$$inlined$map$1", f = "SocialProfileUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C1136a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1136a(v1b v1bVar) {
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
            public final /* synthetic */ BaseResponse b;

            /* JADX INFO: renamed from: tga0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.social.domain.usecase.SocialProfileUseCase$updateVerifiedNickname$1$invokeSuspend$$inlined$map$1$2", f = "SocialProfileUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C1137a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1137a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, BaseResponse baseResponse) {
                this.a = myhVar;
                this.b = baseResponse;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1137a c1137a;
                if (v1bVar instanceof C1137a) {
                    c1137a = (C1137a) v1bVar;
                    int i = c1137a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1137a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1137a = new C1137a(v1bVar);
                    }
                } else {
                    c1137a = new C1137a(v1bVar);
                }
                Object obj2 = c1137a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1137a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    c1137a.b = 1;
                    if (this.a.emit(this.b, c1137a) == y5bVar) {
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

        public a(lyh lyhVar, BaseResponse baseResponse) {
            this.a = lyhVar;
            this.b = baseResponse;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BaseResponse<UpdateNicknameResponse>> myhVar, v1b v1bVar) {
            C1136a c1136a;
            if (v1bVar instanceof C1136a) {
                c1136a = (C1136a) v1bVar;
                int i = c1136a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1136a.b = i - Integer.MIN_VALUE;
                } else {
                    c1136a = new C1136a(v1bVar);
                }
            } else {
                c1136a = new C1136a(v1bVar);
            }
            Object obj = c1136a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1136a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1136a.b = 1;
                if (this.a.collect(bVar, c1136a) == y5bVar) {
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
    public tga0(String str, uga0 uga0Var, v1b<? super tga0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = uga0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tga0 tga0Var = new tga0(this.b, this.c, v1bVar);
        tga0Var.a = obj;
        return tga0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<UpdateNicknameResponse> baseResponse, v1b<? super lyh<? extends BaseResponse<UpdateNicknameResponse>>> v1bVar) {
        return ((tga0) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!baseResponse.isSuccessful() || (str = this.b) == null || str.length() == 0) {
            return new gzh(baseResponse);
        }
        uga0 uga0Var = this.c;
        uga0Var.f.d(AnalyticsEvent.SOCIAL_FOLLOW_CLICKED);
        return new a(uga0Var.b.b(str), baseResponse);
    }
}
