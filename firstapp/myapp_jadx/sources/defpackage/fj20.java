package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class fj20 implements lyh<PreMatchWrappedData> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ PreMatchEventsRequestBody b;
    public final /* synthetic */ RegularMarketRule c;

    @c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getEventsWhenOnlySortByLeague$$inlined$map$1", f = "PreMatchSectionUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return fj20.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ PreMatchEventsRequestBody b;
        public final /* synthetic */ RegularMarketRule c;

        @c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getEventsWhenOnlySortByLeague$$inlined$map$1$2", f = "PreMatchSectionUseCase.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, PreMatchEventsRequestBody preMatchEventsRequestBody, RegularMarketRule regularMarketRule) {
            this.a = myhVar;
            this.b = preMatchEventsRequestBody;
            this.c = regularMarketRule;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
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
                Pair pair = (Pair) obj;
                BaseResponse baseResponse = (BaseResponse) pair.a;
                BaseResponse baseResponse2 = (BaseResponse) pair.b;
                PreMatchEventsRequestBody preMatchEventsRequestBody = this.b;
                PreMatchWrappedData preMatchWrappedDataD = vi20.d(baseResponse, baseResponse2, preMatchEventsRequestBody.getSportId(), preMatchEventsRequestBody.getOddsFilter(), this.c, true);
                aVar.b = 1;
                if (this.a.emit(preMatchWrappedDataD, aVar) == y5bVar) {
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

    public fj20(lyh lyhVar, PreMatchEventsRequestBody preMatchEventsRequestBody, RegularMarketRule regularMarketRule) {
        this.a = lyhVar;
        this.b = preMatchEventsRequestBody;
        this.c = regularMarketRule;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super PreMatchWrappedData> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c);
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
