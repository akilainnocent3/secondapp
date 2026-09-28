package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.autobet.AutoBet;
import com.sporty.android.core.model.autobet.AutoBetListData;
import com.sporty.android.core.model.autobet.AutoBetSelection;
import com.sporty.android.core.model.autobet.LatestHistory;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.realsports.betslip.widget.e;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfb1;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fb1 extends j8i0 {
    public final cg50 A;
    public final da50 B;
    public final m91 C;
    public final ide0 D;
    public final rdd0 E;
    public final qa30 F;
    public final BetSlipDataStore G;
    public int H;
    public double I;
    public double J;
    public double K;
    public double L;
    public int M;
    public BigDecimal N;
    public String O;
    public l91 P;
    public jvd0 Q;
    public final wwd0 R;
    public final v340 S;
    public final wwd0 T;
    public final v340 U;
    public final wwd0 V;
    public final v340 W;
    public final wwd0 X;
    public final v340 Y;
    public final wwd0 Z;
    public final odd a;
    public final v340 a0;
    public final jrm b;
    public final b390 b0;
    public final b5k c;
    public final t340 c0;
    public final x2k d;
    public final v340 d0;
    public final vvs e;
    public final v340 e0;
    public final ukh0 f;
    public OrderBetType f0;
    public final vjh0 i;
    public final cth0 v;
    public final uy0 w;
    public final ia50 y;
    public final wrn z;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ fb1 b;
        public final /* synthetic */ l91 c;
        public final /* synthetic */ int d;

        /* JADX INFO: renamed from: fb1$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$loadAutoBetList$$inlined$handleApiResult$default$1", f = "AutoBetViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0556a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0556a(v1b v1bVar) {
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
            public final /* synthetic */ fb1 b;
            public final /* synthetic */ l91 c;
            public final /* synthetic */ int d;

            /* JADX INFO: renamed from: fb1$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$loadAutoBetList$$inlined$handleApiResult$default$1$2", f = "AutoBetViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0557a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0557a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, fb1 fb1Var, l91 l91Var, int i) {
                this.a = myhVar;
                this.b = fb1Var;
                this.c = l91Var;
                this.d = i;
            }

            /* JADX WARN: Code duplicated, block: B:108:0x0202 A[PHI: r1
              0x0202: PHI (r1v46 java.lang.String) = (r1v44 java.lang.String), (r1v77 java.lang.String) binds: [B:116:0x021a, B:106:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:126:0x0242  */
            /* JADX WARN: Code duplicated, block: B:131:0x025e  */
            /* JADX WARN: Code duplicated, block: B:174:0x02e8  */
            /* JADX WARN: Code duplicated, block: B:191:0x0363  */
            /* JADX WARN: Code duplicated, block: B:7:0x001d  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0557a c0557a;
                List<String> listPutIfAbsent;
                UiText stringUiText;
                UiText uiText;
                UiText stringUiText2;
                String tournamentName;
                String str;
                String triggerOdds;
                String minOdds;
                String maxOdds;
                UiText uiText2;
                UiText resourceUiText;
                String orderId;
                LatestHistory latestHistory;
                String outcomeId;
                String marketId;
                String eventId;
                String str2;
                fb1 fb1Var = this.b;
                ide0 ide0Var = fb1Var.D;
                wwd0 wwd0Var = fb1Var.X;
                if (v1bVar instanceof C0557a) {
                    c0557a = (C0557a) v1bVar;
                    int i = c0557a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0557a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0557a = new C0557a(v1bVar);
                    }
                } else {
                    c0557a = new C0557a(v1bVar);
                }
                Object obj2 = c0557a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0557a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        AutoBetListData autoBetListData = (AutoBetListData) ((lk50.c) lk50Var).a;
                        if (autoBetListData.getAutoBets().isEmpty()) {
                            ide0Var.c();
                            wwd0Var.setValue(t91.a.a);
                        } else {
                            int total = autoBetListData.getTotal() > 0 ? (autoBetListData.getTotal() + 9) / 10 : 1;
                            int i3 = fb1Var.M;
                            l91 l91Var = this.c;
                            int i4 = l91Var.a;
                            List<AutoBet> autoBets = autoBetListData.getAutoBets();
                            ArrayList arrayList = new ArrayList(l48.r(autoBets, 10));
                            Iterator<T> it = autoBets.iterator();
                            while (it.hasNext()) {
                                AutoBet autoBet = (AutoBet) it.next();
                                m91 m91Var = fb1Var.C;
                                m91Var.getClass();
                                autoBet.getClass();
                                AutoBetSelection autoBetSelection = (AutoBetSelection) CollectionsKt.firstOrNull(autoBet.getSelections());
                                String settingId = autoBet.getSettingId();
                                l91.a aVar = l91.d;
                                int status = autoBet.getStatus();
                                aVar.getClass();
                                l91 l91VarA = l91.a.a(status);
                                AutoBetListData autoBetListData2 = autoBetListData;
                                fb1 fb1Var2 = fb1Var;
                                OrderBetType orderBetTypeFromValue = OrderBetType.INSTANCE.fromValue(autoBet.getOrderType());
                                int status2 = autoBet.getStatus();
                                l91 l91Var2 = l91.Ongoing;
                                Iterator<T> it2 = it;
                                if (status2 == l91Var2.a) {
                                    uiText = l91Var2.b;
                                } else {
                                    l91 l91Var3 = l91.Completed;
                                    if (status2 == l91Var3.a) {
                                        stringUiText = l91Var3.b;
                                    } else {
                                        l91 l91Var4 = l91.Expired;
                                        if (status2 == l91Var4.a) {
                                            stringUiText = l91Var4.b;
                                        } else {
                                            l91 l91Var5 = l91.Failed;
                                            stringUiText = status2 == l91Var5.a ? l91Var5.b : new StringUiText("");
                                        }
                                    }
                                    uiText = stringUiText;
                                }
                                int orderType = autoBet.getOrderType();
                                if (orderType == OrderBetType.SINGLE.getValue()) {
                                    StringUiText stringUiText3 = vch0.a;
                                    stringUiText2 = new ResourceUiText(R.string.component_betslip__single);
                                } else if (orderType == OrderBetType.MULTIPLE.getValue()) {
                                    StringUiText stringUiText4 = vch0.a;
                                    stringUiText2 = new ResourceUiText(R.string.component_betslip__multiple);
                                } else {
                                    stringUiText2 = new StringUiText("");
                                }
                                UiText uiText3 = stringUiText2;
                                int size = autoBet.getSelections().size();
                                if (autoBetSelection == null) {
                                    tournamentName = null;
                                } else if (b3.T(autoBetSelection.getEventId()) || b3.U(autoBetSelection.getEventId())) {
                                    tournamentName = autoBetSelection.getTournamentName();
                                    if (tournamentName == null) {
                                        tournamentName = "";
                                    }
                                } else {
                                    String homeTeamName = autoBetSelection.getHomeTeamName();
                                    if (homeTeamName == null) {
                                        homeTeamName = "";
                                    }
                                    String awayTeamName = autoBetSelection.getAwayTeamName();
                                    if (awayTeamName == null) {
                                        awayTeamName = "";
                                    }
                                    tournamentName = tug.a(homeTeamName, " vs ", awayTeamName);
                                }
                                String str3 = tournamentName == null ? "" : tournamentName;
                                String strA = e.a(autoBetSelection != null ? autoBetSelection.getMarketId() : null, autoBetSelection != null ? autoBetSelection.getOutcomeId() : null, autoBetSelection != null ? autoBetSelection.getMarketDesc() : null);
                                String outcomeDesc = autoBetSelection != null ? autoBetSelection.getOutcomeDesc() : null;
                                String str4 = outcomeDesc == null ? "" : outcomeDesc;
                                mfb0 mfb0VarE = m91Var.a.e(autoBetSelection != null ? autoBetSelection.getSportId() : null);
                                String strA2 = mfb0VarE != null ? mfb0VarE.a() : null;
                                String strY = bjb0.Y(new BigDecimal(autoBet.getStake()));
                                int status3 = autoBet.getStatus();
                                if (status3 == l91Var2.a) {
                                    Integer numValueOf = autoBetSelection != null ? Integer.valueOf(autoBetSelection.getMarketStatus()) : null;
                                    if (numValueOf != null && numValueOf.intValue() == 0) {
                                        Double dH = kotlin.text.b.h(autoBetSelection.getCurrentOdds());
                                        str2 = "--";
                                        if (dH != null) {
                                            triggerOdds = gky.a.b(dH.doubleValue(), true);
                                            if (triggerOdds != null) {
                                                str = triggerOdds;
                                            }
                                        }
                                    } else {
                                        str2 = "--";
                                    }
                                    str = str2;
                                } else {
                                    if (status3 == l91.Completed.a) {
                                        LatestHistory latestHistory2 = autoBet.getLatestHistory();
                                        triggerOdds = latestHistory2 != null ? latestHistory2.getTriggerOdds() : null;
                                        if (triggerOdds != null) {
                                            str = triggerOdds;
                                        }
                                    } else if (status3 != l91.Expired.a) {
                                        int i5 = l91.Failed.a;
                                    }
                                    str = "";
                                }
                                Double dH2 = kotlin.text.b.h(autoBet.getMinOdds());
                                if (dH2 != null) {
                                    minOdds = gky.a.b(dH2.doubleValue(), true);
                                    if (minOdds == null) {
                                        minOdds = autoBet.getMinOdds();
                                    }
                                } else {
                                    minOdds = autoBet.getMinOdds();
                                }
                                Double dH3 = kotlin.text.b.h(autoBet.getMaxOdds());
                                if (dH3 != null) {
                                    maxOdds = gky.a.b(dH3.doubleValue(), true);
                                    if (maxOdds == null) {
                                        maxOdds = autoBet.getMaxOdds();
                                    }
                                } else {
                                    maxOdds = autoBet.getMaxOdds();
                                }
                                String strA3 = oxc.a(minOdds, "~", maxOdds);
                                String str5 = (autoBetSelection == null || (eventId = autoBetSelection.getEventId()) == null) ? "" : eventId;
                                String str6 = (autoBetSelection == null || (marketId = autoBetSelection.getMarketId()) == null) ? "" : marketId;
                                String specifier = autoBetSelection != null ? autoBetSelection.getSpecifier() : null;
                                String str7 = (autoBetSelection == null || (outcomeId = autoBetSelection.getOutcomeId()) == null) ? "" : outcomeId;
                                int status4 = autoBet.getStatus();
                                if (status4 == l91.Failed.a) {
                                    LatestHistory latestHistory3 = autoBet.getLatestHistory();
                                    String failedReason = latestHistory3 != null ? latestHistory3.getFailedReason() : null;
                                    resourceUiText = new StringUiText(failedReason == null ? "" : failedReason);
                                } else {
                                    if (status4 == l91.Expired.a) {
                                        StringUiText stringUiText5 = vch0.a;
                                        resourceUiText = new ResourceUiText(R.string.component_betslip__auto_bet_expired_target_odds_not_met);
                                    } else {
                                        uiText2 = null;
                                    }
                                    if (autoBet.getStatus() == l91.Completed.a || (latestHistory = autoBet.getLatestHistory()) == null) {
                                        orderId = null;
                                    } else {
                                        orderId = latestHistory.getOrderId();
                                    }
                                    arrayList.add(new i91(settingId, l91VarA, orderBetTypeFromValue, uiText, uiText3, size, str3, strA, str4, strA2, strY, str, strA3, uiText2, false, str5, str6, specifier, str7, orderId));
                                    autoBetListData = autoBetListData2;
                                    fb1Var = fb1Var2;
                                    it = it2;
                                    total = total;
                                }
                                uiText2 = resourceUiText;
                                if (autoBet.getStatus() == l91.Completed.a) {
                                    orderId = null;
                                } else {
                                    orderId = null;
                                }
                                arrayList.add(new i91(settingId, l91VarA, orderBetTypeFromValue, uiText, uiText3, size, str3, strA, str4, strA2, strY, str, strA3, uiText2, false, str5, str6, specifier, str7, orderId));
                                autoBetListData = autoBetListData2;
                                fb1Var = fb1Var2;
                                it = it2;
                                total = total;
                            }
                            AutoBetListData autoBetListData3 = autoBetListData;
                            t91.e eVar = new t91.e(this.d, total, i4, i3, arrayList);
                            wwd0Var.getClass();
                            wwd0Var.k(null, eVar);
                            if (l91Var == l91.Ongoing) {
                                List<AutoBet> autoBets2 = autoBetListData3.getAutoBets();
                                ISocketPushManager iSocketPushManager = ide0Var.a;
                                fde0 fde0Var = ide0Var.h;
                                ede0 ede0Var = ide0Var.g;
                                ConcurrentHashMap<Topic, Subscriber> concurrentHashMap = ide0Var.d;
                                autoBets2.getClass();
                                ide0Var.c();
                                ConcurrentHashMap<String, List<String>> concurrentHashMap2 = ide0Var.e;
                                concurrentHashMap2.clear();
                                ConcurrentHashMap<String, String> concurrentHashMap3 = ide0Var.f;
                                concurrentHashMap3.clear();
                                for (AutoBet autoBet2 : autoBets2) {
                                    final AutoBetSelection autoBetSelection2 = (AutoBetSelection) CollectionsKt.firstOrNull(autoBet2.getSelections());
                                    if (autoBetSelection2 != null) {
                                        final String specifier2 = autoBetSelection2.getSpecifier();
                                        if (specifier2 == null) {
                                            specifier2 = "~";
                                        } else {
                                            if (specifier2.length() <= 0) {
                                                specifier2 = null;
                                            }
                                            if (specifier2 == null) {
                                                specifier2 = "~";
                                            }
                                        }
                                        String strB = ide0.b(autoBetSelection2.getEventId(), autoBetSelection2.getMarketId(), specifier2);
                                        List<String> arrayList2 = concurrentHashMap2.get(strB);
                                        if (arrayList2 == null && (listPutIfAbsent = concurrentHashMap2.putIfAbsent(strB, (arrayList2 = new ArrayList<>()))) != null) {
                                            arrayList2 = listPutIfAbsent;
                                        }
                                        arrayList2.add(autoBet2.getSettingId());
                                        concurrentHashMap3.put(autoBet2.getSettingId(), autoBetSelection2.getOutcomeId());
                                        String strGenerateTopicString = TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new Function1() { // from class: gde0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                TopicInfo topicInfo = (TopicInfo) obj3;
                                                topicInfo.getClass();
                                                AutoBetSelection autoBetSelection3 = autoBetSelection2;
                                                topicInfo.setSportId(sa8.a(autoBetSelection3.getSportId()));
                                                String categoryId = autoBetSelection3.getCategoryId();
                                                if (categoryId != null) {
                                                    topicInfo.setCategoryId(sa8.a(categoryId));
                                                }
                                                String tournamentId = autoBetSelection3.getTournamentId();
                                                if (tournamentId != null) {
                                                    topicInfo.setTournamentId(tournamentId);
                                                }
                                                topicInfo.setEventId(autoBetSelection3.getEventId());
                                                topicInfo.setProductId(autoBetSelection3.getProductId());
                                                topicInfo.setMarketId(autoBetSelection3.getMarketId());
                                                topicInfo.setMarketSpecifiers(specifier2);
                                                return Unit.a;
                                            }
                                        });
                                        String strGenerateTopicString2 = TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: hde0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                TopicInfo topicInfo = (TopicInfo) obj3;
                                                topicInfo.getClass();
                                                AutoBetSelection autoBetSelection3 = autoBetSelection2;
                                                topicInfo.setSportId(sa8.a(autoBetSelection3.getSportId()));
                                                String categoryId = autoBetSelection3.getCategoryId();
                                                if (categoryId != null) {
                                                    topicInfo.setCategoryId(sa8.a(categoryId));
                                                }
                                                String tournamentId = autoBetSelection3.getTournamentId();
                                                if (tournamentId != null) {
                                                    topicInfo.setTournamentId(tournamentId);
                                                }
                                                topicInfo.setEventId(autoBetSelection3.getEventId());
                                                topicInfo.setProductId(autoBetSelection3.getProductId());
                                                topicInfo.setMarketId(autoBetSelection3.getMarketId());
                                                topicInfo.setMarketSpecifiers(specifier2);
                                                return Unit.a;
                                            }
                                        });
                                        GroupTopic groupTopic = new GroupTopic(strGenerateTopicString);
                                        GroupTopic groupTopic2 = new GroupTopic(strGenerateTopicString2);
                                        concurrentHashMap.put(groupTopic, ede0Var);
                                        concurrentHashMap.put(groupTopic2, fde0Var);
                                        iSocketPushManager.subscribeTopic(groupTopic, ede0Var, true);
                                        iSocketPushManager.subscribeTopic(groupTopic2, fde0Var, true);
                                    }
                                }
                            } else {
                                ide0Var.c();
                            }
                        }
                    } else if (lk50Var instanceof lk50.a) {
                        wwd0Var.setValue(t91.b.a);
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        wwd0Var.setValue(t91.d.a);
                    }
                    Unit unit = Unit.a;
                    c0557a.b = 1;
                    if (this.a.emit(unit, c0557a) == y5bVar) {
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

        public a(yzh yzhVar, fb1 fb1Var, l91 l91Var, int i) {
            this.a = yzhVar;
            this.b = fb1Var;
            this.c = l91Var;
            this.d = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C0556a c0556a;
            if (v1bVar instanceof C0556a) {
                c0556a = (C0556a) v1bVar;
                int i = c0556a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0556a.b = i - Integer.MIN_VALUE;
                } else {
                    c0556a = new C0556a(v1bVar);
                }
            } else {
                c0556a = new C0556a(v1bVar);
            }
            Object obj = c0556a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0556a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b, this.c, this.d);
                c0556a.b = 1;
                if (this.a.collect(bVar, c0556a) == y5bVar) {
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

    public fb1(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, jrm jrmVar, b5k b5kVar, x2k x2kVar, vvs vvsVar, ukh0 ukh0Var, vjh0 vjh0Var, cth0 cth0Var, uy0 uy0Var, ia50 ia50Var, wrn wrnVar, cg50 cg50Var, da50 da50Var, m91 m91Var, ide0 ide0Var, rdd0 rdd0Var, qa30 qa30Var, BetSlipDataStore betSlipDataStore) {
        jrmVar.getClass();
        uy0Var.getClass();
        rdd0Var.getClass();
        qa30Var.getClass();
        betSlipDataStore.getClass();
        this.a = oddVar;
        this.b = jrmVar;
        this.c = b5kVar;
        this.d = x2kVar;
        this.e = vvsVar;
        this.f = ukh0Var;
        this.i = vjh0Var;
        this.v = cth0Var;
        this.w = uy0Var;
        this.y = ia50Var;
        this.z = wrnVar;
        this.A = cg50Var;
        this.B = da50Var;
        this.C = m91Var;
        this.D = ide0Var;
        this.E = rdd0Var;
        this.F = qa30Var;
        this.G = betSlipDataStore;
        this.H = 30;
        this.I = 100.0d;
        this.J = 1.01d;
        this.K = 10.0d;
        this.L = 10.0d;
        this.M = 10;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this.N = bigDecimal;
        this.O = "";
        l91 l91Var = l91.Ongoing;
        this.P = l91Var;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.R = wwd0VarA;
        this.S = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.T = wwd0VarA2;
        this.U = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(twb.e.a);
        this.V = wwd0VarA3;
        this.W = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(t91.c.a);
        this.X = wwd0VarA4;
        this.Y = e1i.b(wwd0VarA4);
        wwd0 wwd0VarA5 = xwd0.a(l91Var);
        this.Z = wwd0VarA5;
        this.a0 = e1i.b(wwd0VarA5);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.b0 = b390VarB;
        this.c0 = e1i.a(b390VarB);
        n1i n1iVar = new n1i(wwd0VarA3, wwd0VarA4, new eb1(3, null));
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.d0 = e1i.e(n1iVar, et7VarD, kwd0Var, bool);
        this.e0 = e1i.e(new ub1(wwd0VarA3), o8i0.d(this), kwd0Var, bool);
        this.f0 = OrderBetType.SINGLE;
    }

    public static twb.a E1(twb.a aVar) {
        uxs uxsVar = aVar.p;
        kmn kmnVar = aVar.j;
        uxs uxsVar2 = uxs.LOADING;
        if (uxsVar != uxsVar2) {
            xln xlnVar = kmnVar.a;
            xln xlnVar2 = kmnVar.c;
            xln xlnVar3 = kmnVar.b;
            uxsVar2 = (xlnVar.a.length() <= 0 || kmnVar.a.b || xlnVar3.a.length() <= 0 || xlnVar3.b || xlnVar2.a.length() <= 0 || xlnVar2.b || !aVar.l || !Intrinsics.g(aVar.i, m980.a.a)) ? uxs.DISABLE : uxs.ENABLE;
        }
        return twb.a.a(aVar, null, null, null, null, false, false, false, null, uxsVar2, 32767);
    }

    public final void A1(l91 l91Var) {
        l91Var.getClass();
        wwd0 wwd0Var = this.Z;
        wwd0Var.getClass();
        wwd0Var.k(null, l91Var);
        if (l91Var == this.P && (this.X.getValue() instanceof t91.e)) {
            return;
        }
        z1(l91Var, 1);
    }

    public final void B1() {
        OrderBetType orderBetType = this.f0;
        if (orderBetType == null) {
            orderBetType = OrderBetType.SINGLE;
        }
        OrderBetType orderBetType2 = orderBetType;
        b5k b5kVar = this.c;
        b5kVar.getClass();
        orderBetType2.getClass();
        this.V.setValue((b5k.a.a[orderBetType2.ordinal()] == 1 ? b5kVar.a : b5kVar.b).a(orderBetType2, this.b.U(), this.H, this.O, this.L));
    }

    public final void C1(Function1<? super twb.a, twb.a> function1) {
        wwd0 wwd0Var;
        Object value;
        Object obj;
        do {
            wwd0Var = this.V;
            value = wwd0Var.getValue();
            obj = (twb) value;
            if (obj instanceof twb.a) {
                obj = (twb) function1.invoke(obj);
            }
        } while (!wwd0Var.g(value, obj));
    }

    public final void D1(Function1<? super t91.e, t91.e> function1) {
        wwd0 wwd0Var;
        Object value;
        Object obj;
        do {
            wwd0Var = this.X;
            value = wwd0Var.getValue();
            obj = (t91) value;
            if (obj instanceof t91.e) {
                obj = (t91) function1.invoke(obj);
            }
        } while (!wwd0Var.g(value, obj));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.D.c();
    }

    public final void x1() {
        BigDecimal bigDecimalB;
        uy0 uy0Var = this.w;
        AssetsInfo assetsInfoC = uy0Var.c();
        if (assetsInfoC == null || (bigDecimalB = ty0.b(assetsInfoC)) == null) {
            bigDecimalB = BigDecimal.ZERO;
            bigDecimalB.getClass();
        }
        this.N = bigDecimalB;
        AssetsInfo assetsInfoC2 = uy0Var.c();
        this.O = bjb0.U(assetsInfoC2 != null ? assetsInfoC2.balance : 0L, Locale.US);
    }

    public final vjh0.b y1() {
        return new vjh0.b(this.J, this.I, this.L, this.K, this.N);
    }

    public final void z1(l91 l91Var, int i) {
        this.P = l91Var;
        jvd0 jvd0Var = this.Q;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        int i2 = l91Var.a;
        z2k z2kVar = this.B.a;
        lyh lyhVarC = ozh.c(new or60(new y2k(z2kVar, i, i2, null)), z2kVar.a);
        StringUiText stringUiText = vch0.a;
        this.Q = kzh.d(ozh.c(new a(bm50.b(lyhVarC, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), this, l91Var, i), this.a), o8i0.d(this));
    }
}
