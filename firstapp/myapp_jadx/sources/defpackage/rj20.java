package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class rj20 implements lyh<PreMatchWrappedData> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ long b;
    public final /* synthetic */ PreMatchEventsRequestBody c;
    public final /* synthetic */ RegularMarketRule d;

    @c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getPreMatchEventsByOrder$$inlined$map$1", f = "PreMatchSectionUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return rj20.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ long b;
        public final /* synthetic */ PreMatchEventsRequestBody c;
        public final /* synthetic */ RegularMarketRule d;

        @c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getPreMatchEventsByOrder$$inlined$map$1$2", f = "PreMatchSectionUseCase.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, long j, PreMatchEventsRequestBody preMatchEventsRequestBody, RegularMarketRule regularMarketRule) {
            this.a = myhVar;
            this.b = j;
            this.c = preMatchEventsRequestBody;
            this.d = regularMarketRule;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            BigDecimal bigDecimalValueOf;
            BigDecimal bigDecimalValueOf2;
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
                BaseResponse baseResponse = (BaseResponse) obj;
                PreMatchEventsRequestBody preMatchEventsRequestBody = this.c;
                String sportId = preMatchEventsRequestBody.getSportId();
                PreMatchEventsRequestBody.OddsFilter oddsFilter = preMatchEventsRequestBody.getOddsFilter();
                baseResponse.getClass();
                sportId.getClass();
                RegularMarketRule regularMarketRule = this.d;
                regularMarketRule.getClass();
                PreMatchSportsData preMatchSportsData = (PreMatchSportsData) n52.b(baseResponse);
                if (oddsFilter == null || (bigDecimalValueOf = BigDecimal.valueOf(oddsFilter.getMin())) == null) {
                    bigDecimalValueOf = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal = bigDecimalValueOf;
                if (oddsFilter == null || (bigDecimalValueOf2 = BigDecimal.valueOf(oddsFilter.getMax())) == null) {
                    bigDecimalValueOf2 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal2 = bigDecimalValueOf2;
                List<Tournament> list = preMatchSportsData.tournaments;
                list.getClass();
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                long jLongValue = this.b;
                for (Tournament tournament : list) {
                    tournament.getClass();
                    bigDecimal.getClass();
                    bigDecimal2.getClass();
                    Pair<List<PreMatchEventData>, Long> pairC = vi20.c(tournament, sportId, regularMarketRule, bigDecimal, bigDecimal2, jLongValue);
                    List<PreMatchEventData> list2 = pairC.a;
                    jLongValue = pairC.b.longValue();
                    arrayList.add(list2);
                }
                PreMatchWrappedData preMatchWrappedData = new PreMatchWrappedData(l48.s(arrayList), preMatchSportsData.moreEvents, jLongValue, preMatchSportsData.lastIndex);
                aVar.b = 1;
                if (this.a.emit(preMatchWrappedData, aVar) == y5bVar) {
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

    public rj20(lyh lyhVar, long j, PreMatchEventsRequestBody preMatchEventsRequestBody, RegularMarketRule regularMarketRule) {
        this.a = lyhVar;
        this.b = j;
        this.c = preMatchEventsRequestBody;
        this.d = regularMarketRule;
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
            b bVar = new b(myhVar, this.b, this.c, this.d);
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
