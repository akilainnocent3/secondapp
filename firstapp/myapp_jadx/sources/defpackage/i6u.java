package defpackage;

import android.os.SystemClock;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNCountryDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNCountryResponseDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNFavoritesListDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNLotteryDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNLotteryResponseDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class i6u {
    public final c5u a;
    public final rdd0 b;
    public final i5u c;
    public final wwd0 d;
    public final v340 e;
    public final ts5 f;
    public final ts5<qcn<g7q>> g;
    public final ts5 h;
    public final ts5 i;
    public final ts5<qcn<dsq>> j;
    public final ts5 k;

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$_favoritesResource$1", f = "LuckyNumberRepository.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super qcn<? extends g7q>>, Object> {
        public i6u a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return i6u.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super qcn<? extends g7q>> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            i6u i6uVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                i6u i6uVar2 = i6u.this;
                c5u c5uVar = i6uVar2.a;
                this.a = i6uVar2;
                this.b = 1;
                Object objW = c5uVar.w(this);
                if (objW == y5bVar) {
                    return y5bVar;
                }
                obj = objW;
                i6uVar = i6uVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i6uVar = this.a;
                uj50.b(obj);
            }
            List<String> lotteryIds = ((LNFavoritesListDTO) n52.b((BaseResponse) obj)).getLotteryIds();
            i6uVar.getClass();
            ArrayList arrayList = new ArrayList(l48.r(lotteryIds, 10));
            int i2 = 0;
            for (Object obj2 : lotteryIds) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                arrayList.add(new g7q.a((String) obj2, i2));
                i2 = i3;
            }
            return a4h.b(o5u.a(arrayList, i6uVar.b, "sportyNumbers/api/v1/lotteries/favorites", "", new f6u()));
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$_lotteriesResource$1", f = "LuckyNumberRepository.kt", l = {69, 73}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function1<v1b<? super qcn<? extends dsq>>, Object> {
        public long a;
        public long b;
        public i6u c;
        public LNLotteryResponseDTO d;
        public int e;

        public b(v1b<? super b> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return i6u.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super qcn<? extends dsq>> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0087  */
        /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00de A[LOOP:1: B:25:0x00d8->B:27:0x00de, LOOP_END] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            long j;
            Object objA2;
            long j2;
            LNLotteryResponseDTO lNLotteryResponseDTO;
            i6u i6uVar;
            long jLongValue;
            ArrayList arrayList;
            int i;
            Iterator it;
            long serverTime;
            long drawTime;
            ArrayList arrayList2;
            y5b y5bVar = y5b.a;
            int i2 = this.e;
            i6u i6uVar2 = i6u.this;
            if (i2 == 0) {
                uj50.b(obj);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c5u c5uVar = i6uVar2.a;
                this.a = jElapsedRealtime;
                this.e = 1;
                objA = c5uVar.a(this);
                if (objA != y5bVar) {
                    j = jElapsedRealtime;
                }
                return y5bVar;
            }
            if (i2 == 1) {
                j = this.a;
                uj50.b(obj);
                objA = obj;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j3 = this.b;
                lNLotteryResponseDTO = this.d;
                i6u i6uVar3 = this.c;
                uj50.b(obj);
                j2 = j3;
                i6uVar = i6uVar3;
                objA2 = obj;
            }
            jLongValue = ((Number) objA2).longValue();
            i6uVar.getClass();
            List<LNLotteryDTO> lotteries = lNLotteryResponseDTO.getLotteries();
            i = 10;
            arrayList = new ArrayList(l48.r(lotteries, 10));
            it = lotteries.iterator();
            while (it.hasNext()) {
                LNLotteryDTO lNLotteryDTO = (LNLotteryDTO) it.next();
                serverTime = lNLotteryResponseDTO.getServerTime();
                String id = lNLotteryDTO.getId();
                String name = lNLotteryDTO.getName();
                String categoryIsoCode = lNLotteryDTO.getCategoryIsoCode();
                String id2 = lNLotteryDTO.getDrawSummary().getId();
                long drawTime2 = lNLotteryDTO.getDrawSummary().getDrawTime();
                String logoUrl = lNLotteryDTO.getLogoUrl();
                drawTime = lNLotteryDTO.getDrawSummary().getDrawTime() - serverTime;
                if (drawTime < 0) {
                    drawTime = 0;
                }
                long j4 = (drawTime + j2) - jLongValue;
                List<fsq> lotteryStreams = lNLotteryDTO.getLotteryStreams();
                arrayList2 = new ArrayList(l48.r(lotteryStreams, i));
                for (fsq fsqVar : lotteryStreams) {
                    arrayList2.add(new esq(fsqVar.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String(), fsqVar.getTitle(), i6u.d(fsqVar.getStartTime(), serverTime, j2), i6u.d(fsqVar.getEndTime(), serverTime, j2)));
                    it = it;
                    lNLotteryResponseDTO = lNLotteryResponseDTO;
                    jLongValue = jLongValue;
                }
                arrayList.add(new dsq(id, categoryIsoCode, logoUrl, name, id2, drawTime2, j4, a4h.f(arrayList2)));
                i = 10;
            }
            return a4h.f(o5u.a(arrayList, i6uVar.b, "sportyNumbers/api/v1/lotteries", "", new e6u(0)));
            LNLotteryResponseDTO lNLotteryResponseDTO2 = (LNLotteryResponseDTO) n52.b((BaseResponse) objA);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.c = i6uVar2;
            this.d = lNLotteryResponseDTO2;
            this.a = j;
            this.b = jElapsedRealtime2;
            this.e = 2;
            objA2 = i6uVar2.a(jElapsedRealtime2, j, this);
            if (objA2 != y5bVar) {
                j2 = jElapsedRealtime2;
                lNLotteryResponseDTO = lNLotteryResponseDTO2;
                i6uVar = i6uVar2;
                jLongValue = ((Number) objA2).longValue();
                i6uVar.getClass();
                List<LNLotteryDTO> lotteries2 = lNLotteryResponseDTO.getLotteries();
                i = 10;
                arrayList = new ArrayList(l48.r(lotteries2, 10));
                it = lotteries2.iterator();
                while (it.hasNext()) {
                    LNLotteryDTO lNLotteryDTO2 = (LNLotteryDTO) it.next();
                    serverTime = lNLotteryResponseDTO.getServerTime();
                    String id3 = lNLotteryDTO2.getId();
                    String name2 = lNLotteryDTO2.getName();
                    String categoryIsoCode2 = lNLotteryDTO2.getCategoryIsoCode();
                    String id4 = lNLotteryDTO2.getDrawSummary().getId();
                    long drawTime3 = lNLotteryDTO2.getDrawSummary().getDrawTime();
                    String logoUrl2 = lNLotteryDTO2.getLogoUrl();
                    drawTime = lNLotteryDTO2.getDrawSummary().getDrawTime() - serverTime;
                    if (drawTime < 0) {
                        drawTime = 0;
                    }
                    long j5 = (drawTime + j2) - jLongValue;
                    List<fsq> lotteryStreams2 = lNLotteryDTO2.getLotteryStreams();
                    arrayList2 = new ArrayList(l48.r(lotteryStreams2, i));
                    while (r23.hasNext()) {
                        arrayList2.add(new esq(fsqVar.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_ID java.lang.String(), fsqVar.getTitle(), i6u.d(fsqVar.getStartTime(), serverTime, j2), i6u.d(fsqVar.getEndTime(), serverTime, j2)));
                        it = it;
                        lNLotteryResponseDTO = lNLotteryResponseDTO;
                        jLongValue = jLongValue;
                    }
                    arrayList.add(new dsq(id3, categoryIsoCode2, logoUrl2, name2, id4, drawTime3, j5, a4h.f(arrayList2)));
                    i = 10;
                }
                return a4h.f(o5u.a(arrayList, i6uVar.b, "sportyNumbers/api/v1/lotteries", "", new e6u(0)));
            }
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$countriesResource$1", f = "LuckyNumberRepository.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function1<v1b<? super scn<String, ? extends r4q>>, Object> {
        public i6u a;
        public int b;

        public c(v1b<? super c> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return i6u.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super scn<String, ? extends r4q>> v1bVar) {
            return ((c) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            i6u i6uVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                i6u i6uVar2 = i6u.this;
                c5u c5uVar = i6uVar2.a;
                this.a = i6uVar2;
                this.b = 1;
                Object objT = c5uVar.t(this);
                if (objT == y5bVar) {
                    return y5bVar;
                }
                obj = objT;
                i6uVar = i6uVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i6uVar = this.a;
                uj50.b(obj);
            }
            LNCountryResponseDTO lNCountryResponseDTO = (LNCountryResponseDTO) n52.b((BaseResponse) obj);
            i6uVar.getClass();
            List<LNCountryDTO> countries = lNCountryResponseDTO.getCountries();
            int iA = jpu.a(l48.r(countries, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (LNCountryDTO lNCountryDTO : countries) {
                linkedHashMap.put(lNCountryDTO.getIsoCode(), new r4q(lNCountryDTO.getIsoCode(), lNCountryDTO.getName(), lNCountryDTO.getFlagUrl(), lNCountryDTO.getBackgroundUrl()));
            }
            return a4h.g(linkedHashMap);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$lobbyConfig$1", f = "LuckyNumberRepository.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function1<v1b<? super avq>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return i6u.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super avq> v1bVar) {
            return ((d) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            or60 or60Var = new or60(new h5u(i6u.this.c, null));
            this.a = 1;
            Object objA = s0i.a(or60Var, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    public i6u(c5u c5uVar, rdd0 rdd0Var, i5u i5uVar) {
        c5uVar.getClass();
        rdd0Var.getClass();
        this.a = c5uVar;
        this.b = rdd0Var;
        this.c = i5uVar;
        wwd0 wwd0VarA = xwd0.a(-1L);
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        this.f = new ts5(new d(null));
        ts5<qcn<g7q>> ts5Var = new ts5<>(new s6u(this, new a(null), null));
        this.g = ts5Var;
        this.h = ts5Var;
        this.i = new ts5(new s6u(this, new c(null), null));
        ts5<qcn<dsq>> ts5Var2 = new ts5<>(new b(null));
        this.j = ts5Var2;
        this.k = ts5Var2;
    }

    public static lhr d(long j, long j2, long j3) {
        long j4 = j - j2;
        if (j4 < 0) {
            j4 = 0;
        }
        return new lhr(j, j4 + j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, long j2, x1b x1bVar) {
        k6u k6uVar;
        if (x1bVar instanceof k6u) {
            k6uVar = (k6u) x1bVar;
            int i = k6uVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k6uVar.d = i - Integer.MIN_VALUE;
            } else {
                k6uVar = new k6u(this, x1bVar);
            }
        } else {
            k6uVar = new k6u(this, x1bVar);
        }
        Object obj = k6uVar.b;
        y5b y5bVar = y5b.a;
        int i2 = k6uVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Long l = k6uVar.a;
            uj50.b(obj);
            return l;
        }
        uj50.b(obj);
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        Long l2 = new Long(j3);
        long jLongValue = l2.longValue();
        wwd0 wwd0Var = this.d;
        if (((Number) wwd0Var.getValue()).longValue() < 0) {
            Long l3 = new Long(jLongValue);
            k6uVar.a = l2;
            k6uVar.d = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, l3);
            if (Unit.a == y5bVar) {
                return y5bVar;
            }
        }
        return l2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        l6u l6uVar;
        if (x1bVar instanceof l6u) {
            l6uVar = (l6u) x1bVar;
            int i = l6uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6uVar.c = i - Integer.MIN_VALUE;
            } else {
                l6uVar = new l6u(this, x1bVar);
            }
        } else {
            l6uVar = new l6u(this, x1bVar);
        }
        Object obj = l6uVar.a;
        y5b y5bVar = y5b.a;
        int i2 = l6uVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            or60 or60VarA = this.f.a();
            l6uVar.c = 1;
            if (s0i.a(or60VarA, l6uVar) == y5bVar) {
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

    public final or60 c(Function2 function2) {
        return new or60(new t6u(this, function2, null));
    }
}
