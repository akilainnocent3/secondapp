package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.SourceType;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import defpackage.b3;
import defpackage.efe0;
import defpackage.g650;
import defpackage.hp0;
import defpackage.itf0;
import defpackage.kgb0;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.mhg;
import defpackage.nhg;
import defpackage.ohg;
import defpackage.qag;
import defpackage.sa8;
import defpackage.shg;
import defpackage.tru;
import defpackage.vpu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.sportybet.plugin.realsports.data.Event.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Event[] newArray(int i) {
            return new Event[i];
        }
    };
    private static final String TAG = "Event";

    @SerializedName("audioLiveChannel")
    private boolean audioLiveChannel;
    public String awayTeamIcon;
    public String awayTeamId;
    public String awayTeamName;
    public String bookingStatus;
    public String categoryId;
    public String categoryName;
    public boolean changeFlag;
    public int commentsNum;
    public long elapsedStartTimeBeforeBind;

    @SerializedName("giftGrabActivityResultVO")
    public GiftGrabActivityResult enableGiftGrab;
    public long estimateStartTime;
    public long estimateStopTime;
    public String eventId;
    public String eventPeriod;
    public EventSource eventSource;
    public boolean forceUpdateTime;
    public String gameId;
    public List<String> gameScore;
    public boolean haveSameSelection;
    public String homeTeamIcon;
    public String homeTeamId;
    public String homeTeamName;
    public boolean liveChannel;

    @SerializedName("marketHotTags")
    public MarketHotTags marketHotTags;
    public List<Market> markets;
    public String matchStatus;
    public boolean matchTrackerNotAllowed;
    public boolean oddsBoost;
    public String overTimeScore;
    public String parentBetBuilderMarketId;
    public String period;
    public String playedSeconds;
    public String pointScore;
    public String productStatus;
    public List<String> regularTimeScore;
    public String remainingTimeInPeriod;
    public String score;
    public String setScore;
    public boolean socialMediaLiveChannel;
    public HashMap<String, String> specifierMap;
    public Sport sport;
    public int status;
    public boolean topTeam;
    public int topicId;
    public int totalMarketSize;
    public Tournament tournament;
    public boolean webViewLiveChannel;

    public Event(Parcel parcel) {
        this.audioLiveChannel = false;
        this.haveSameSelection = false;
        this.specifierMap = new HashMap<>();
        this.tournament = (Tournament) parcel.readParcelable(Tournament.class.getClassLoader());
        this.eventId = parcel.readString();
        this.gameId = parcel.readString();
        this.estimateStartTime = parcel.readLong();
        this.estimateStopTime = parcel.readLong();
        this.score = parcel.readString();
        this.playedSeconds = parcel.readString();
        this.eventPeriod = parcel.readString();
        this.homeTeamId = parcel.readString();
        this.homeTeamName = parcel.readString();
        this.awayTeamId = parcel.readString();
        this.awayTeamName = parcel.readString();
        this.sport = (Sport) parcel.readParcelable(Sport.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.markets = arrayList;
        parcel.readList(arrayList, Market.class.getClassLoader());
        this.totalMarketSize = parcel.readInt();
        this.forceUpdateTime = parcel.readByte() != 0;
        this.topTeam = parcel.readByte() != 0;
        this.oddsBoost = parcel.readByte() != 0;
        this.categoryName = parcel.readString();
        this.categoryId = parcel.readString();
        this.elapsedStartTimeBeforeBind = parcel.readLong();
        this.enableGiftGrab = (GiftGrabActivityResult) parcel.readParcelable(GiftGrabActivityResult.class.getClassLoader());
        this.matchTrackerNotAllowed = parcel.readByte() != 0;
        this.eventSource = (EventSource) parcel.readParcelable(EventSource.class.getClassLoader());
        this.productStatus = parcel.readString();
        this.homeTeamIcon = parcel.readString();
        this.awayTeamIcon = parcel.readString();
        this.status = parcel.readInt();
        this.remainingTimeInPeriod = parcel.readString();
        this.period = parcel.readString();
        this.setScore = parcel.readString();
        this.changeFlag = parcel.readByte() != 0;
        this.gameScore = parcel.createStringArrayList();
        this.regularTimeScore = parcel.createStringArrayList();
        this.overTimeScore = parcel.readString();
        this.pointScore = parcel.readString();
        this.liveChannel = parcel.readByte() != 0;
        this.socialMediaLiveChannel = parcel.readByte() != 0;
        this.webViewLiveChannel = parcel.readByte() != 0;
        this.audioLiveChannel = parcel.readByte() != 0;
        this.matchStatus = parcel.readString();
        this.commentsNum = parcel.readInt();
        this.topicId = parcel.readInt();
        this.bookingStatus = parcel.readString();
        this.haveSameSelection = parcel.readByte() != 0;
        this.specifierMap = (HashMap) parcel.readSerializable();
        this.parentBetBuilderMarketId = parcel.readString();
        this.marketHotTags = (MarketHotTags) parcel.readParcelable(MarketHotTags.class.getClassLoader());
    }

    private boolean isBetRadarPreferred() {
        SourceType sourceType = SourceType.BET_RADAR;
        return sourceType.equals(b3.N(this.eventId)) || sourceType.equals(this.eventSource.getSourceType(false));
    }

    private boolean isFootball() {
        Sport sport = this.sport;
        return sport != null && "sr:sport:1".equals(sport.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addJokerOutcomes$7(Outcome outcome) {
        return outcome.isActive == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getMarketOddsTopic$4(TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getMarketOddsTopic$5(String str, TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        topicInfo.setProductId(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getMarketOddsTopic$6(String str, String str2, TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        topicInfo.setProductId(str);
        topicInfo.setMarketId(str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getMarketStatusTopic$1(TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getMarketStatusTopic$2(String str, TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        topicInfo.setProductId(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getMarketStatusTopic$3(String str, String str2, TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        topicInfo.setProductId(str);
        topicInfo.setMarketId(str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getTopic$0(TopicInfo topicInfo) {
        topicInfo.setSportId(sa8.a(this.sport.id));
        topicInfo.setCategoryId(sa8.a(this.sport.category.id));
        topicInfo.setTournamentId(this.sport.category.tournament.id);
        topicInfo.setEventId(this.eventId);
        return null;
    }

    private String resolveBetRadarSourceId() {
        SourceType sourceType = SourceType.BET_RADAR;
        boolean zEquals = sourceType.equals(b3.N(this.eventId));
        boolean zEquals2 = sourceType.equals(this.eventSource.getSourceType(false));
        if (zEquals) {
            return (!zEquals2 || this.eventSource.getSourceId(false) == null) ? sa8.a(this.eventId) : this.eventSource.getSourceId(false);
        }
        return this.eventSource.getSourceId(false);
    }

    public void addJokerOutcomes(Map<String, Pair<Outcome, String>> map) {
        List<Market> list = this.markets;
        if (list == null) {
            return;
        }
        for (Market market : list) {
            Pair<Outcome, String> pair = map.get(market.id);
            if (market.outcomes != null && pair != null) {
                Outcome outcome = pair.a;
                String str = pair.b;
                String str2 = market.specifier;
                if (str2 == null || str == null || str2.matches(str)) {
                    if (market.outcomes.stream().allMatch(new ohg())) {
                        outcome.isActive = 1;
                    } else {
                        outcome.isActive = 0;
                    }
                    market.jokerOutcome = outcome;
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.eventId, ((Event) obj).eventId);
    }

    public Market getMarket(String str, String str2) {
        List<Market> list = this.markets;
        if (list == null) {
            return null;
        }
        for (Market market : list) {
            if (str.equals(market.id) || tru.h(market, str)) {
                if (str2 == null || str2.equals(market.specifier)) {
                    return market;
                }
            }
        }
        return null;
    }

    public List<Market> getMarketList(String str) {
        ArrayList arrayList = new ArrayList();
        for (Market market : this.markets) {
            if (str.equals(market.id) || tru.h(market, str)) {
                if (market.showOutcomeByStatus()) {
                    arrayList.add(market);
                }
            }
        }
        return arrayList;
    }

    public String getMarketOddsTopic() {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new nhg(this, 0));
    }

    public String getMarketStatusTopic() {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new mhg(this, 0));
    }

    public String getSelectedSpecifier(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        String str3;
        if (this.specifierMap.get(str) != null) {
            return this.specifierMap.get(str);
        }
        if (this.markets == null) {
            return null;
        }
        boolean zEquals = str2.equals("near_odds");
        boolean zEquals2 = str2.equals("far_odds");
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal3) == 0 || bigDecimal2.compareTo(bigDecimal3) == 0) {
            str3 = str;
        } else {
            str3 = str;
            Market marketD = vpu.d(this.markets, str3, bigDecimal, bigDecimal2, zEquals, zEquals2);
            if (marketD != null) {
                this.specifierMap.put(str3, marketD.specifier);
                return marketD.specifier;
            }
        }
        if (getSpecifierList(str3).contains(str2)) {
            this.specifierMap.put(str3, str2);
            return str2;
        }
        if (zEquals || zEquals2) {
            for (Market market : this.markets) {
                if (str3.equals(market.id) && ((market.isNearOdds() && zEquals) || (market.isFarOdds() && zEquals2))) {
                    this.specifierMap.put(str3, market.specifier);
                    return market.specifier;
                }
            }
        }
        for (Market market2 : this.markets) {
            if (str3.equals(market2.id) && market2.isFavorite()) {
                this.specifierMap.put(str3, market2.specifier);
                return market2.specifier;
            }
        }
        for (Market market3 : this.markets) {
            if (str3.equals(market3.id) || tru.h(market3, str3)) {
                if (market3.showOutcomeByStatus()) {
                    this.specifierMap.put(str3, market3.specifier);
                    return market3.specifier;
                }
            }
        }
        return null;
    }

    public String getSourceId() {
        if (this.eventSource == null) {
            return sa8.a(this.eventId);
        }
        if (isBetRadarPreferred()) {
            return resolveBetRadarSourceId();
        }
        String sourceId = this.eventSource.getSourceId(isLiveOrFinished());
        return sourceId != null ? sourceId : sa8.a(this.eventId);
    }

    public List<String> getSpecifierList(String str) {
        ArrayList arrayList = new ArrayList();
        List<Market> list = this.markets;
        if (list != null) {
            for (Market market : list) {
                if (str.equals(market.id) || tru.h(market, str)) {
                    if (market.showOutcomeByStatus()) {
                        arrayList.add(market.specifier);
                    }
                }
            }
        }
        return arrayList;
    }

    public String getTopic() {
        return TopicInfoKt.generateTopicString(TopicType.EVENT_STATUS, new shg(this, 0));
    }

    public boolean hasAnyOutcomeInOddsRange(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        for (Market market : this.markets) {
            if (Objects.equals(market.id, str) && market.status == 0 && market.hasAnyOutcomeInOddsRange(bigDecimal, bigDecimal2)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAudioStream() {
        return this.audioLiveChannel;
    }

    public boolean hasBetRadarStream() {
        return this.liveChannel;
    }

    public boolean hasGift() {
        GiftGrabActivityResult giftGrabActivityResult = this.enableGiftGrab;
        if (giftGrabActivityResult != null) {
            return giftGrabActivityResult.enabled;
        }
        return false;
    }

    public boolean hasLiveOrSettledMarket() {
        List<Market> list = this.markets;
        if (list == null) {
            return false;
        }
        for (Market market : list) {
            if (market != null && market.product != 3) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLiveStream() {
        return hasBetRadarStream() || hasMediaLiveChannel() || hasWebViewLiveChannel();
    }

    public boolean hasMediaLiveChannel() {
        return this.socialMediaLiveChannel;
    }

    public boolean hasWebViewLiveChannel() {
        if (!this.webViewLiveChannel) {
            return false;
        }
        hp0 hp0Var = hp0.A;
        hp0Var.getClass();
        return ((g650) qag.a(hp0Var, g650.class)).Q().b("live_streaming_enable_web_view_live_channel_2");
    }

    public int hashCode() {
        String str = this.eventId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isBetBuilderChild() {
        return !TextUtils.isEmpty(this.parentBetBuilderMarketId);
    }

    public boolean isBetBuilderParent() {
        List<Market> list = this.markets;
        return (list == null || list.isEmpty() || !this.markets.get(0).id.contains("bb")) ? false : true;
    }

    public boolean isLiveOrFinished() {
        int i = this.status;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public boolean isVirtualSoccer() {
        return "sr:sport:202120001".equals(this.sport.id);
    }

    public void removeSelectSpecifier(String str) {
        this.specifierMap.remove(str);
    }

    public void setNoLiveStream() {
        this.webViewLiveChannel = false;
        this.socialMediaLiveChannel = false;
        this.liveChannel = false;
    }

    public void setSelectSpecifier(String str, String str2) {
        this.specifierMap.put(str, str2);
    }

    public boolean showLiveTracker() {
        if (b3.S(this.eventId)) {
            mfb0 mfb0VarE = lfb0.d().e(this.sport.id);
            return (mfb0VarE == null || !mfb0VarE.h() || this.matchTrackerNotAllowed) ? false : true;
        }
        EventSource eventSource = this.eventSource;
        if (eventSource == null) {
            return false;
        }
        SourceType sourceType = eventSource.getSourceType(true);
        if (sourceType == SourceType.BET_GENIUS) {
            return kgb0.i(this.sport.id);
        }
        if (sourceType == SourceType.BET_RADAR) {
            mfb0 mfb0VarE2 = lfb0.d().e(this.sport.id);
            return mfb0VarE2 != null && mfb0VarE2.h();
        }
        if (sourceType == SourceType.LSPORTS) {
            return isFootball();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean showStats(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.eventId
            boolean r0 = defpackage.b3.S(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            lfb0 r0 = defpackage.lfb0.d()
            com.sportybet.plugin.realsports.data.Sport r3 = r4.sport
            java.lang.String r3 = r3.id
            mfb0 r0 = r0.e(r3)
            if (r0 == 0) goto L29
            if (r5 == 0) goto L21
            boolean r5 = r0.e()
            if (r5 == 0) goto L29
            goto L27
        L21:
            boolean r5 = r0.s()
            if (r5 == 0) goto L29
        L27:
            r5 = r1
            goto L2a
        L29:
            r5 = r2
        L2a:
            nkd0 r0 = nkd0.a.a
            boolean r0 = r0.a(r4)
            if (r5 == 0) goto L39
            if (r0 != 0) goto L39
            boolean r4 = r4.matchTrackerNotAllowed
            if (r4 != 0) goto L39
            return r1
        L39:
            return r2
        L3a:
            com.sporty.android.book.domain.entity.EventSource r0 = r4.eventSource
            if (r0 != 0) goto L3f
            return r2
        L3f:
            com.sporty.android.book.domain.entity.SourceType r0 = r0.getSourceType(r5)
            com.sporty.android.book.domain.entity.SourceType r3 = com.sporty.android.book.domain.entity.SourceType.BET_RADAR
            if (r0 != r3) goto L66
            lfb0 r0 = defpackage.lfb0.d()
            com.sportybet.plugin.realsports.data.Sport r4 = r4.sport
            java.lang.String r4 = r4.id
            mfb0 r4 = r0.e(r4)
            if (r4 == 0) goto L65
            if (r5 == 0) goto L5e
            boolean r4 = r4.e()
            if (r4 == 0) goto L65
            goto L64
        L5e:
            boolean r4 = r4.s()
            if (r4 == 0) goto L65
        L64:
            return r1
        L65:
            return r2
        L66:
            com.sporty.android.book.domain.entity.SourceType r5 = com.sporty.android.book.domain.entity.SourceType.LSPORTS
            if (r0 != r5) goto L6f
            boolean r4 = r4.isFootball()
            return r4
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.realsports.data.Event.showStats(boolean):boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("eventId:");
        sb.append(this.eventId);
        sb.append(", home team: ");
        sb.append(this.homeTeamName);
        if (this.markets != null) {
            sb.append(", total markets: ");
            sb.append(this.markets.size());
            for (Market market : this.markets) {
                sb.append(", [marketId: ");
                sb.append(market.id);
                sb.append(", status: ");
                sb.append(market.status);
                sb.append(", desc: ");
                sb.append(market.desc);
                if (market.outcomes != null) {
                    for (int i = 0; i < market.outcomes.size(); i++) {
                        Outcome outcome = market.outcomes.get(i);
                        StringBuilder sbA = efe0.a(i, ", outcome_", ": ");
                        sbA.append(outcome.odds);
                        sbA.append("/");
                        sbA.append(outcome.probability);
                        sbA.append("/");
                        sbA.append(outcome.isActive);
                        sb.append(sbA.toString());
                    }
                }
                sb.append("]");
            }
        } else {
            sb.append(", no markets");
        }
        sb.append(", productStatus: ");
        sb.append(this.productStatus);
        return sb.toString();
    }

    public boolean update(JSONObject jSONObject) {
        List<Market> list;
        boolean z;
        boolean z2 = false;
        this.forceUpdateTime = false;
        try {
            String strOptString = jSONObject.optString("topic");
            if (!TextUtils.isEmpty(strOptString)) {
                String[] strArrSplit = strOptString.split("\\^");
                if (strArrSplit.length == 5 && this.eventId.equals(strArrSplit[3])) {
                    int iOptInt = jSONObject.optInt("betStatus");
                    if ((iOptInt == 1 || iOptInt == 2) && (list = this.markets) != null) {
                        z = false;
                        for (Market market : list) {
                            try {
                                if (market.status < iOptInt) {
                                    market.status = iOptInt;
                                    z = true;
                                }
                            } catch (Exception e) {
                                e = e;
                                z2 = z;
                                e.printStackTrace();
                                return z2;
                            }
                        }
                    } else {
                        z = false;
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("eventGameScores");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        this.gameScore = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.gameScore.add(jSONArrayOptJSONArray.optString(i));
                        }
                    }
                    String strOptString2 = jSONObject.optString("eventMatchPeriod");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        this.period = strOptString2;
                    }
                    String strOptString3 = jSONObject.optString("eventMatchStatus");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        this.matchStatus = strOptString3;
                    }
                    String strOptString4 = jSONObject.optString("eventPlayedTime");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        this.playedSeconds = strOptString4;
                        String str = TAG;
                        itf0.a aVar = itf0.a;
                        aVar.q(str);
                        aVar.g("playedSeconds-->%s", this.playedSeconds);
                        this.forceUpdateTime = true;
                        this.elapsedStartTimeBeforeBind = SystemClock.elapsedRealtime();
                    }
                    String strOptString5 = jSONObject.optString("eventPointScore");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        this.pointScore = strOptString5;
                    }
                    String strOptString6 = jSONObject.optString("eventRemainingTimeInPeriod");
                    if (!TextUtils.isEmpty(strOptString6)) {
                        this.remainingTimeInPeriod = strOptString6;
                    }
                    String strOptString7 = jSONObject.optString("eventScore");
                    if (!TextUtils.isEmpty(strOptString7)) {
                        this.setScore = strOptString7;
                    }
                    int iOptInt2 = jSONObject.optInt("eventStatus", -1);
                    if (iOptInt2 > -1) {
                        this.status = iOptInt2;
                    }
                    String strOptString8 = jSONObject.optString("fixtureHomeTeamName");
                    if (!TextUtils.isEmpty(strOptString8)) {
                        this.homeTeamName = strOptString8;
                    }
                    String strOptString9 = jSONObject.optString("fixtureAwayTeamName");
                    if (!TextUtils.isEmpty(strOptString9)) {
                        this.awayTeamName = strOptString9;
                    }
                    long jOptLong = jSONObject.optLong("fixtureStartTime", -1L);
                    if (jOptLong > -1) {
                        this.estimateStartTime = jOptLong;
                    }
                    if (iOptInt2 == 1 || iOptInt2 == 2) {
                        this.totalMarketSize = jSONObject.optInt("bmLiveCount", 0);
                    } else {
                        this.totalMarketSize = jSONObject.optInt("bmLcooCount", 0);
                    }
                    String strOptString10 = jSONObject.optString("productStatus");
                    if (!TextUtils.isEmpty(strOptString10)) {
                        this.productStatus = strOptString10;
                    }
                    return z;
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.tournament, i);
        parcel.writeString(this.eventId);
        parcel.writeString(this.gameId);
        parcel.writeLong(this.estimateStartTime);
        parcel.writeLong(this.estimateStopTime);
        parcel.writeString(this.score);
        parcel.writeString(this.playedSeconds);
        parcel.writeString(this.eventPeriod);
        parcel.writeString(this.homeTeamId);
        parcel.writeString(this.homeTeamName);
        parcel.writeString(this.awayTeamId);
        parcel.writeString(this.awayTeamName);
        parcel.writeParcelable(this.sport, i);
        parcel.writeList(this.markets);
        parcel.writeInt(this.totalMarketSize);
        parcel.writeByte(this.forceUpdateTime ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.topTeam ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.oddsBoost ? (byte) 1 : (byte) 0);
        parcel.writeString(this.categoryName);
        parcel.writeString(this.categoryId);
        parcel.writeLong(this.elapsedStartTimeBeforeBind);
        parcel.writeParcelable(this.enableGiftGrab, i);
        parcel.writeByte(this.matchTrackerNotAllowed ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.eventSource, i);
        parcel.writeString(this.productStatus);
        parcel.writeString(this.homeTeamIcon);
        parcel.writeString(this.awayTeamIcon);
        parcel.writeInt(this.status);
        parcel.writeString(this.remainingTimeInPeriod);
        parcel.writeString(this.period);
        parcel.writeString(this.setScore);
        parcel.writeByte(this.changeFlag ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.gameScore);
        parcel.writeStringList(this.regularTimeScore);
        parcel.writeString(this.overTimeScore);
        parcel.writeString(this.pointScore);
        parcel.writeByte(this.liveChannel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.socialMediaLiveChannel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.webViewLiveChannel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.audioLiveChannel ? (byte) 1 : (byte) 0);
        parcel.writeString(this.matchStatus);
        parcel.writeInt(this.commentsNum);
        parcel.writeInt(this.topicId);
        parcel.writeString(this.bookingStatus);
        parcel.writeByte(this.haveSameSelection ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.specifierMap);
        parcel.writeString(this.parentBetBuilderMarketId);
        parcel.writeParcelable(this.marketHotTags, i);
    }

    public String getMarketOddsTopic(final String str) {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: qhg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.lambda$getMarketOddsTopic$5(str, (TopicInfo) obj);
            }
        });
    }

    public String getMarketStatusTopic(final String str) {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new Function1() { // from class: phg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.lambda$getMarketStatusTopic$2(str, (TopicInfo) obj);
            }
        });
    }

    public String getMarketOddsTopic(final String str, final String str2) {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: rhg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.lambda$getMarketOddsTopic$6(str, str2, (TopicInfo) obj);
            }
        });
    }

    public String getMarketStatusTopic(final String str, final String str2) {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new Function1() { // from class: lhg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.lambda$getMarketStatusTopic$3(str, str2, (TopicInfo) obj);
            }
        });
    }

    public static class GiftGrabActivityResult implements Parcelable {
        public static final Parcelable.Creator<GiftGrabActivityResult> CREATOR = new Parcelable.Creator<GiftGrabActivityResult>() { // from class: com.sportybet.plugin.realsports.data.Event.GiftGrabActivityResult.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GiftGrabActivityResult createFromParcel(Parcel parcel) {
                return new GiftGrabActivityResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GiftGrabActivityResult[] newArray(int i) {
                return new GiftGrabActivityResult[i];
            }
        };

        @SerializedName("customMessage")
        public String customMessage;

        @SerializedName("activityEnabled")
        public boolean enabled;

        public GiftGrabActivityResult(Parcel parcel) {
            this.enabled = parcel.readByte() != 0;
            this.customMessage = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.enabled ? (byte) 1 : (byte) 0);
            parcel.writeString(this.customMessage);
        }

        public GiftGrabActivityResult() {
        }
    }

    public List<String> getSpecifierList(List<Market> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Market> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().specifier);
            }
        }
        return arrayList;
    }

    public boolean showStats() {
        return showStats(isLiveOrFinished());
    }

    public String getSelectedSpecifier(String str, String str2) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return getSelectedSpecifier(str, str2, bigDecimal, bigDecimal);
    }

    public boolean update(String str) {
        if (str == null) {
            return false;
        }
        try {
            return update(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Event() {
        this.audioLiveChannel = false;
        this.haveSameSelection = false;
        this.specifierMap = new HashMap<>();
    }

    public Event(Event event) {
        this.audioLiveChannel = false;
        this.haveSameSelection = false;
        this.specifierMap = new HashMap<>();
        this.tournament = event.tournament;
        this.eventId = event.eventId;
        this.gameId = event.gameId;
        this.estimateStartTime = event.estimateStartTime;
        this.estimateStopTime = event.estimateStopTime;
        this.score = event.score;
        this.playedSeconds = event.playedSeconds;
        this.eventPeriod = event.eventPeriod;
        this.homeTeamId = event.homeTeamId;
        this.homeTeamName = event.homeTeamName;
        this.awayTeamId = event.awayTeamId;
        this.awayTeamName = event.awayTeamName;
        this.sport = event.sport;
        this.markets = event.markets;
        this.totalMarketSize = event.totalMarketSize;
        this.status = event.status;
        this.forceUpdateTime = event.forceUpdateTime;
        this.categoryId = event.categoryId;
        this.categoryName = event.categoryName;
        this.elapsedStartTimeBeforeBind = event.elapsedStartTimeBeforeBind;
        this.remainingTimeInPeriod = event.remainingTimeInPeriod;
        this.period = event.period;
        this.setScore = event.setScore;
        this.changeFlag = event.changeFlag;
        this.gameScore = event.gameScore;
        this.liveChannel = event.liveChannel;
        this.socialMediaLiveChannel = event.socialMediaLiveChannel;
        this.webViewLiveChannel = event.webViewLiveChannel;
        this.audioLiveChannel = event.audioLiveChannel;
        this.matchStatus = event.matchStatus;
        this.commentsNum = event.commentsNum;
        this.topicId = event.topicId;
        this.homeTeamIcon = event.homeTeamIcon;
        this.awayTeamIcon = event.awayTeamIcon;
        this.specifierMap = event.specifierMap;
        this.oddsBoost = event.oddsBoost;
        this.marketHotTags = event.marketHotTags;
        this.topTeam = event.topTeam;
        this.bookingStatus = event.bookingStatus;
        this.regularTimeScore = event.regularTimeScore;
        this.overTimeScore = event.overTimeScore;
        this.pointScore = event.pointScore;
        this.haveSameSelection = event.haveSameSelection;
        this.productStatus = event.productStatus;
        this.matchTrackerNotAllowed = event.matchTrackerNotAllowed;
        this.eventSource = event.eventSource;
        this.enableGiftGrab = event.enableGiftGrab;
        this.parentBetBuilderMarketId = event.parentBetBuilderMarketId;
    }
}
