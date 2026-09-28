package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.common.ui.model.PromotionGiftsResponse;
import com.sportygames.wheelanddeal.model.WDBetResponseModel;
import com.sportygames.wheelanddeal.model.WDUserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$bet$3", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class bvi0 extends tje0 implements Function2<WDBetResponseModel, v1b<? super lyh<? extends pd3>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yui0 b;
    public final /* synthetic */ lyh<PromotionGiftsResponse> c;

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$bet$3$2", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<uui0, PromotionGiftsResponse, v1b<? super pd3>, Object> {
        public /* synthetic */ uui0 a;
        public /* synthetic */ PromotionGiftsResponse b;
        public final /* synthetic */ WDBetResponseModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WDBetResponseModel wDBetResponseModel, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.c = wDBetResponseModel;
        }

        @Override // defpackage.gaj
        public final Object invoke(uui0 uui0Var, PromotionGiftsResponse promotionGiftsResponse, v1b<? super pd3> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.a = uui0Var;
            aVar.b = promotionGiftsResponse;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uui0 uui0Var = this.a;
            PromotionGiftsResponse promotionGiftsResponse = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new pd3(this.c, uui0Var, promotionGiftsResponse);
        }
    }

    public static final class b implements lyh<uui0> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ yui0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: bvi0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$bet$3$invokeSuspend$$inlined$map$1$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0144a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0144a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, yui0 yui0Var) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws vui0 {
                C0144a c0144a;
                if (v1bVar instanceof C0144a) {
                    c0144a = (C0144a) v1bVar;
                    int i = c0144a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0144a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0144a = new C0144a(v1bVar);
                    }
                } else {
                    c0144a = new C0144a(v1bVar);
                }
                Object obj2 = c0144a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0144a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WDUserModel wDUserModel = (WDUserModel) em50.b((HTTPResponse) obj);
                    if (!wDUserModel.getAvailable()) {
                        throw new vui0("The user is not available");
                    }
                    uui0 uui0Var = new uui0(wDUserModel.getCurrency(), wDUserModel.getBalance());
                    c0144a.b = 1;
                    if (this.a.emit(uui0Var, c0144a) == y5bVar) {
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

        public b(lyh lyhVar, yui0 yui0Var) {
            this.a = lyhVar;
            this.b = yui0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uui0> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvi0(yui0 yui0Var, lyh<PromotionGiftsResponse> lyhVar, v1b<? super bvi0> v1bVar) {
        super(2, v1bVar);
        this.b = yui0Var;
        this.c = lyhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bvi0 bvi0Var = new bvi0(this.b, this.c, v1bVar);
        bvi0Var.a = obj;
        return bvi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WDBetResponseModel wDBetResponseModel, v1b<? super lyh<? extends pd3>> v1bVar) {
        return ((bvi0) create(wDBetResponseModel, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WDBetResponseModel wDBetResponseModel = (WDBetResponseModel) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yui0 yui0Var = this.b;
        return new s78(this.c, new b(yui0Var.e.e(), yui0Var), new a(wDBetResponseModel, null));
    }
}
