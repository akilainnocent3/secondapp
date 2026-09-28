package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.LiveEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSortType;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getEventsWhenOnlySortByLeague$1", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gj20 extends tje0 implements Function2<BaseResponse<PreMatchSportsData>, v1b<? super lyh<? extends Pair<? extends BaseResponse<PreMatchSportsData>, ? extends BaseResponse<PreMatchSportsData>>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchEventsRequestBody b;
    public final /* synthetic */ tj20 c;

    public static final class a implements lyh<Pair<? extends BaseResponse<PreMatchSportsData>, ? extends BaseResponse<PreMatchSportsData>>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ BaseResponse b;

        /* JADX INFO: renamed from: gj20$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getEventsWhenOnlySortByLeague$1$invokeSuspend$$inlined$map$1", f = "PreMatchSectionUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C0598a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0598a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: gj20$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getEventsWhenOnlySortByLeague$1$invokeSuspend$$inlined$map$1$2", f = "PreMatchSectionUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C0599a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0599a(v1b v1bVar) {
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
                C0599a c0599a;
                if (v1bVar instanceof C0599a) {
                    c0599a = (C0599a) v1bVar;
                    int i = c0599a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0599a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0599a = new C0599a(v1bVar);
                    }
                } else {
                    c0599a = new C0599a(v1bVar);
                }
                Object obj2 = c0599a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0599a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Pair pair = new Pair((BaseResponse) obj, this.b);
                    c0599a.b = 1;
                    if (this.a.emit(pair, c0599a) == y5bVar) {
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
        public final Object collect(myh<? super Pair<? extends BaseResponse<PreMatchSportsData>, ? extends BaseResponse<PreMatchSportsData>>> myhVar, v1b v1bVar) {
            C0598a c0598a;
            if (v1bVar instanceof C0598a) {
                c0598a = (C0598a) v1bVar;
                int i = c0598a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0598a.b = i - Integer.MIN_VALUE;
                } else {
                    c0598a = new C0598a(v1bVar);
                }
            } else {
                c0598a = new C0598a(v1bVar);
            }
            Object obj = c0598a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0598a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0598a.b = 1;
                if (this.a.collect(bVar, c0598a) == y5bVar) {
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
    public gj20(PreMatchEventsRequestBody preMatchEventsRequestBody, tj20 tj20Var, v1b<? super gj20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchEventsRequestBody;
        this.c = tj20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gj20 gj20Var = new gj20(this.b, this.c, v1bVar);
        gj20Var.a = obj;
        return gj20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<PreMatchSportsData> baseResponse, v1b<? super lyh<? extends Pair<? extends BaseResponse<PreMatchSportsData>, ? extends BaseResponse<PreMatchSportsData>>>> v1bVar) {
        return ((gj20) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List listC;
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        PreMatchSportsData preMatchSportsData = (PreMatchSportsData) n52.b(baseResponse);
        String sportId = this.b.getSportId();
        int value = PreMatchSortType.LEAGUE.getValue();
        List<Tournament> list = preMatchSportsData.tournaments;
        list.getClass();
        Tournament tournament = (Tournament) CollectionsKt.firstOrNull(list);
        if (tournament == null || (listC = kotlin.collections.a.c(kotlin.collections.a.c(tournament.id))) == null) {
            listC = kotlin.collections.a.c(m2g.a);
        }
        LiveEventsRequestBody liveEventsRequestBody = new LiveEventsRequestBody(sportId, value, 1, listC, null, null, false, false, 240, null);
        tj20 tj20Var = this.c;
        h940 h940Var = tj20Var.a;
        String json = tj20Var.a().toJson(liveEventsRequestBody);
        json.getClass();
        return new a(h940Var.n(1, json), baseResponse);
    }
}
