package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprHttpErrorThrowable;
import com.sporty.android.core.model.patron.GooglePlayAvailableData;
import kotlin.Unit;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class rni0 implements lyh<Boolean> {
    public final /* synthetic */ lyh a;

    @c0d(c = "com.sportybet.android.geo.usecase.VisitorAnalyticsUseCaseImpl$getGooglePlayAvailableData$$inlined$map$1", f = "VisitorAnalyticsUseCaseImpl.kt", l = {109}, m = "collect", v = 2)
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
            return rni0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.geo.usecase.VisitorAnalyticsUseCaseImpl$getGooglePlayAvailableData$$inlined$map$1$2", f = "VisitorAnalyticsUseCaseImpl.kt", l = {50}, m = "emit", v = 2)
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
        public final Object emit(Object obj, v1b v1bVar) throws SprHttpErrorThrowable {
            a aVar;
            Boolean boolValueOf;
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
                bi50 bi50Var = (bi50) obj;
                T t = bi50Var.b;
                Response response = bi50Var.a;
                BaseResponse baseResponse = (BaseResponse) t;
                if (response.getIsSuccessful() && baseResponse != null) {
                    boolValueOf = Boolean.valueOf(((GooglePlayAvailableData) n52.b(baseResponse)).getAvailable());
                } else {
                    if (response.code() != 451) {
                        int iCode = response.code();
                        String strMessage = response.message();
                        strMessage.getClass();
                        throw new SprHttpErrorThrowable(iCode, strMessage);
                    }
                    boolValueOf = Boolean.FALSE;
                }
                aVar.b = 1;
                if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

    public rni0(lyh lyhVar) {
        this.a = lyhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
