package defpackage;

import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.usecase.CashOutSocketUseCase$subscribeSocket$2", f = "CashOutSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wm6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ List<BetSelection> a;
    public final /* synthetic */ sm6 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wm6(List<? extends BetSelection> list, sm6 sm6Var, boolean z, v1b<? super wm6> v1bVar) {
        super(2, v1bVar);
        this.a = list;
        this.b = sm6Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wm6(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wm6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final String str;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (final BetSelection betSelection : this.a) {
            sm6 sm6Var = this.b;
            ConcurrentHashMap.KeySetView keySetView = sm6Var.d;
            yo6 yo6Var = sm6Var.a;
            ConcurrentHashMap.KeySetView keySetView2 = sm6Var.e;
            if (!keySetView.contains(betSelection.id)) {
                boolean z = yo6Var.d().k;
                List<String> list = dz2.a;
                boolean zT = b3.T(betSelection.eventId);
                int i = betSelection.eventStatus;
                boolean z2 = true;
                boolean z3 = i == 0;
                if (i != 1 && ((int) betSelection.product) != 1) {
                    z2 = false;
                }
                String str2 = "1";
                if (z) {
                    if (zT) {
                        str = "3";
                    } else {
                        if (!z2) {
                            str2 = "~";
                        }
                        str = str2;
                    }
                } else if (zT || z3) {
                    str = "3";
                } else {
                    str = str2;
                }
                ConcurrentHashMap.KeySetView keySetView3 = sm6Var.d;
                String str3 = betSelection.id;
                str3.getClass();
                keySetView3.add(str3);
                final String strA = sa8.a(betSelection.sportId);
                final String strA2 = sa8.a(betSelection.categoryId);
                keySetView2.add(TopicInfoKt.generateTopicString(TopicType.EVENT_STATUS, new Function1() { // from class: um6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        TopicInfo topicInfo = (TopicInfo) obj2;
                        topicInfo.setSportId(strA);
                        topicInfo.setCategoryId(strA2);
                        BetSelection betSelection2 = betSelection;
                        topicInfo.setTournamentId(betSelection2.tournamentId);
                        topicInfo.setEventId(betSelection2.eventId);
                        topicInfo.setProductId(str);
                        return Unit.a;
                    }
                }));
                TopicType topicType = TopicType.MARKET_STATUS_V2;
                final String str4 = betSelection.marketId;
                final String str5 = betSelection.specifier;
                String strGenerateTopicString = TopicInfoKt.generateTopicString(topicType, new Function1() { // from class: rm6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        TopicInfo topicInfo = (TopicInfo) obj2;
                        topicInfo.getClass();
                        topicInfo.setSportId(strA);
                        topicInfo.setCategoryId(strA2);
                        BetSelection betSelection2 = betSelection;
                        topicInfo.setTournamentId(betSelection2.tournamentId);
                        topicInfo.setEventId(betSelection2.eventId);
                        topicInfo.setMarketId(str4);
                        topicInfo.setProductId(str);
                        String str6 = str5;
                        if (str6 != null && str6.length() != 0) {
                            topicInfo.setMarketSpecifiers(str6);
                        }
                        return Unit.a;
                    }
                });
                boolean z4 = this.c;
                if (!z4) {
                    keySetView2.add(strGenerateTopicString);
                }
                TopicType topicType2 = yo6Var.d().j ? TopicType.ODDS_STATUS : TopicType.MARKET_ODDS;
                final String str6 = betSelection.marketId;
                final String str7 = betSelection.specifier;
                String strGenerateTopicString2 = TopicInfoKt.generateTopicString(topicType2, new Function1() { // from class: rm6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        TopicInfo topicInfo = (TopicInfo) obj2;
                        topicInfo.getClass();
                        topicInfo.setSportId(strA);
                        topicInfo.setCategoryId(strA2);
                        BetSelection betSelection2 = betSelection;
                        topicInfo.setTournamentId(betSelection2.tournamentId);
                        topicInfo.setEventId(betSelection2.eventId);
                        topicInfo.setMarketId(str6);
                        topicInfo.setProductId(str);
                        String str8 = str7;
                        if (str8 != null && str8.length() != 0) {
                            topicInfo.setMarketSpecifiers(str8);
                        }
                        return Unit.a;
                    }
                });
                if (!z4) {
                    keySetView2.add(strGenerateTopicString2);
                }
                List<String> list2 = betSelection.additionMarketIdList;
                list2.getClass();
                for (final String str8 : list2) {
                    final String str9 = "~";
                    String strGenerateTopicString3 = TopicInfoKt.generateTopicString(topicType2, new Function1() { // from class: rm6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            TopicInfo topicInfo = (TopicInfo) obj2;
                            topicInfo.getClass();
                            topicInfo.setSportId(strA);
                            topicInfo.setCategoryId(strA2);
                            BetSelection betSelection2 = betSelection;
                            topicInfo.setTournamentId(betSelection2.tournamentId);
                            topicInfo.setEventId(betSelection2.eventId);
                            topicInfo.setMarketId(str8);
                            topicInfo.setProductId(str);
                            String str10 = str9;
                            if (str10 != null && str10.length() != 0) {
                                topicInfo.setMarketSpecifiers(str10);
                            }
                            return Unit.a;
                        }
                    });
                    if (!z4) {
                        keySetView2.add(strGenerateTopicString3);
                    }
                    final String str10 = "~";
                    String strGenerateTopicString4 = TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS_V2, new Function1() { // from class: rm6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            TopicInfo topicInfo = (TopicInfo) obj2;
                            topicInfo.getClass();
                            topicInfo.setSportId(strA);
                            topicInfo.setCategoryId(strA2);
                            BetSelection betSelection2 = betSelection;
                            topicInfo.setTournamentId(betSelection2.tournamentId);
                            topicInfo.setEventId(betSelection2.eventId);
                            topicInfo.setMarketId(str8);
                            topicInfo.setProductId(str);
                            String str11 = str10;
                            if (str11 != null && str11.length() != 0) {
                                topicInfo.setMarketSpecifiers(str11);
                            }
                            return Unit.a;
                        }
                    });
                    if (!z4) {
                        keySetView2.add(strGenerateTopicString4);
                    }
                }
                keySetView2.add(TopicInfoKt.generateTopicString(TopicType.BO_CONFIG_UPDATE, new vm6(0)));
                TopicType topicType3 = TopicType.CASH_OUT_STATUS;
                final String str11 = betSelection.marketId;
                final String str12 = betSelection.specifier;
                String strGenerateTopicString5 = TopicInfoKt.generateTopicString(topicType3, new Function1() { // from class: rm6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        TopicInfo topicInfo = (TopicInfo) obj2;
                        topicInfo.getClass();
                        topicInfo.setSportId(strA);
                        topicInfo.setCategoryId(strA2);
                        BetSelection betSelection2 = betSelection;
                        topicInfo.setTournamentId(betSelection2.tournamentId);
                        topicInfo.setEventId(betSelection2.eventId);
                        topicInfo.setMarketId(str11);
                        topicInfo.setProductId(str);
                        String str13 = str12;
                        if (str13 != null && str13.length() != 0) {
                            topicInfo.setMarketSpecifiers(str13);
                        }
                        return Unit.a;
                    }
                });
                if (z4) {
                    keySetView2.add(strGenerateTopicString5);
                }
            }
        }
        return Unit.a;
    }
}
