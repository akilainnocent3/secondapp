package com.sportygames.featuredGames.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.cv7;
import defpackage.hxa;
import defpackage.nve;
import defpackage.oie;
import defpackage.pq6;
import defpackage.s27;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u008c\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/sportygames/featuredGames/model/FeaturedResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "", "widgetImageUrl", "position", "isVisible", "startTime", "giftAmount", "", "actualPaidAmount", "actualPayoutAmount", "gameList", "", "Lcom/sportygames/featuredGames/model/FeaturedResponse$GameList;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getWidgetImageUrl", "getPosition", "getStartTime", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getActualPaidAmount", "getActualPayoutAmount", "getGameList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;)Lcom/sportygames/featuredGames/model/FeaturedResponse;", "equals", "", "other", "hashCode", "toString", "GameList", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeaturedResponse {
    public static final int $stable = 8;
    private final Double actualPaidAmount;
    private final Double actualPayoutAmount;
    private final List<GameList> gameList;
    private final Double giftAmount;
    private final Integer id;
    private final String isVisible;
    private final String name;
    private final Integer position;
    private final String startTime;
    private final String widgetImageUrl;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Jr\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/sportygames/featuredGames/model/FeaturedResponse$GameList;", "", "name", "", "displayName", "gameId", "", "onlineUserCount", "deepLinkUrl", "widgetImageUrl", "imageUrl", "notificationList", "", "Lcom/sportygames/featuredGames/model/FeaturedResponse$GameList$NotificationList;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getGameId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnlineUserCount", "getDeepLinkUrl", "getWidgetImageUrl", "getImageUrl", "getNotificationList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sportygames/featuredGames/model/FeaturedResponse$GameList;", "equals", "", "other", "hashCode", "toString", "NotificationList", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GameList {
        public static final int $stable = 8;
        private final String deepLinkUrl;
        private final String displayName;
        private final Integer gameId;
        private final String imageUrl;
        private final String name;
        private final List<NotificationList> notificationList;
        private final Integer onlineUserCount;
        private final String widgetImageUrl;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportygames/featuredGames/model/FeaturedResponse$GameList$NotificationList;", "", "nickName", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "winAmount", "", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "getGameName", "getWinAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sportygames/featuredGames/model/FeaturedResponse$GameList$NotificationList;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NotificationList {
            public static final int $stable = 0;
            private final String currency;
            private final String gameName;
            private final String nickName;
            private final Integer winAmount;

            public NotificationList(String str, String str2, Integer num, String str3) {
                this.nickName = str;
                this.gameName = str2;
                this.winAmount = num;
                this.currency = str3;
            }

            public static /* synthetic */ NotificationList copy$default(NotificationList notificationList, String str, String str2, Integer num, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = notificationList.nickName;
                }
                if ((i & 2) != 0) {
                    str2 = notificationList.gameName;
                }
                if ((i & 4) != 0) {
                    num = notificationList.winAmount;
                }
                if ((i & 8) != 0) {
                    str3 = notificationList.currency;
                }
                return notificationList.copy(str, str2, num, str3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getNickName() {
                return this.nickName;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getGameName() {
                return this.gameName;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getWinAmount() {
                return this.winAmount;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final NotificationList copy(String nickName, String gameName, Integer winAmount, String currency) {
                return new NotificationList(nickName, gameName, winAmount, currency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotificationList)) {
                    return false;
                }
                NotificationList notificationList = (NotificationList) other;
                return Intrinsics.g(this.nickName, notificationList.nickName) && Intrinsics.g(this.gameName, notificationList.gameName) && Intrinsics.g(this.winAmount, notificationList.winAmount) && Intrinsics.g(this.currency, notificationList.currency);
            }

            public final String getCurrency() {
                return this.currency;
            }

            public final String getGameName() {
                return this.gameName;
            }

            public final String getNickName() {
                return this.nickName;
            }

            public final Integer getWinAmount() {
                return this.winAmount;
            }

            public int hashCode() {
                String str = this.nickName;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.gameName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.winAmount;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                String str3 = this.currency;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                String str = this.nickName;
                String str2 = this.gameName;
                Integer num = this.winAmount;
                String str3 = this.currency;
                StringBuilder sbA = ux5.a("NotificationList(nickName=", str, ", gameName=", str2, ", winAmount=");
                sbA.append(num);
                sbA.append(", currency=");
                sbA.append(str3);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public GameList(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, List<NotificationList> list) {
            list.getClass();
            this.name = str;
            this.displayName = str2;
            this.gameId = num;
            this.onlineUserCount = num2;
            this.deepLinkUrl = str3;
            this.widgetImageUrl = str4;
            this.imageUrl = str5;
            this.notificationList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GameList copy$default(GameList gameList, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gameList.name;
            }
            if ((i & 2) != 0) {
                str2 = gameList.displayName;
            }
            if ((i & 4) != 0) {
                num = gameList.gameId;
            }
            if ((i & 8) != 0) {
                num2 = gameList.onlineUserCount;
            }
            if ((i & 16) != 0) {
                str3 = gameList.deepLinkUrl;
            }
            if ((i & 32) != 0) {
                str4 = gameList.widgetImageUrl;
            }
            if ((i & 64) != 0) {
                str5 = gameList.imageUrl;
            }
            if ((i & 128) != 0) {
                list = gameList.notificationList;
            }
            String str6 = str5;
            List list2 = list;
            String str7 = str3;
            String str8 = str4;
            return gameList.copy(str, str2, num, num2, str7, str8, str6, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getGameId() {
            return this.gameId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getOnlineUserCount() {
            return this.onlineUserCount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getWidgetImageUrl() {
            return this.widgetImageUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final List<NotificationList> component8() {
            return this.notificationList;
        }

        public final GameList copy(String name, String displayName, Integer gameId, Integer onlineUserCount, String deepLinkUrl, String widgetImageUrl, String imageUrl, List<NotificationList> notificationList) {
            notificationList.getClass();
            return new GameList(name, displayName, gameId, onlineUserCount, deepLinkUrl, widgetImageUrl, imageUrl, notificationList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GameList)) {
                return false;
            }
            GameList gameList = (GameList) other;
            return Intrinsics.g(this.name, gameList.name) && Intrinsics.g(this.displayName, gameList.displayName) && Intrinsics.g(this.gameId, gameList.gameId) && Intrinsics.g(this.onlineUserCount, gameList.onlineUserCount) && Intrinsics.g(this.deepLinkUrl, gameList.deepLinkUrl) && Intrinsics.g(this.widgetImageUrl, gameList.widgetImageUrl) && Intrinsics.g(this.imageUrl, gameList.imageUrl) && Intrinsics.g(this.notificationList, gameList.notificationList);
        }

        public final String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final Integer getGameId() {
            return this.gameId;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getName() {
            return this.name;
        }

        public final List<NotificationList> getNotificationList() {
            return this.notificationList;
        }

        public final Integer getOnlineUserCount() {
            return this.onlineUserCount;
        }

        public final String getWidgetImageUrl() {
            return this.widgetImageUrl;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.displayName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.gameId;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.onlineUserCount;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.deepLinkUrl;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.widgetImageUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.imageUrl;
            return this.notificationList.hashCode() + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.name;
            String str2 = this.displayName;
            Integer num = this.gameId;
            Integer num2 = this.onlineUserCount;
            String str3 = this.deepLinkUrl;
            String str4 = this.widgetImageUrl;
            String str5 = this.imageUrl;
            List<NotificationList> list = this.notificationList;
            StringBuilder sbA = ux5.a("GameList(name=", str, ", displayName=", str2, ", gameId=");
            cv7.a(sbA, num, ", onlineUserCount=", num2, ", deepLinkUrl=");
            hxa.c(sbA, str3, ", widgetImageUrl=", str4, ", imageUrl=");
            return nve.a(str5, ", notificationList=", ")", sbA, list);
        }
    }

    public FeaturedResponse(Integer num, String str, String str2, Integer num2, String str3, String str4, Double d, Double d2, Double d3, List<GameList> list) {
        this.id = num;
        this.name = str;
        this.widgetImageUrl = str2;
        this.position = num2;
        this.isVisible = str3;
        this.startTime = str4;
        this.giftAmount = d;
        this.actualPaidAmount = d2;
        this.actualPayoutAmount = d3;
        this.gameList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeaturedResponse copy$default(FeaturedResponse featuredResponse, Integer num, String str, String str2, Integer num2, String str3, String str4, Double d, Double d2, Double d3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = featuredResponse.id;
        }
        if ((i & 2) != 0) {
            str = featuredResponse.name;
        }
        if ((i & 4) != 0) {
            str2 = featuredResponse.widgetImageUrl;
        }
        if ((i & 8) != 0) {
            num2 = featuredResponse.position;
        }
        if ((i & 16) != 0) {
            str3 = featuredResponse.isVisible;
        }
        if ((i & 32) != 0) {
            str4 = featuredResponse.startTime;
        }
        if ((i & 64) != 0) {
            d = featuredResponse.giftAmount;
        }
        if ((i & 128) != 0) {
            d2 = featuredResponse.actualPaidAmount;
        }
        if ((i & 256) != 0) {
            d3 = featuredResponse.actualPayoutAmount;
        }
        if ((i & 512) != 0) {
            list = featuredResponse.gameList;
        }
        Double d4 = d3;
        List list2 = list;
        Double d5 = d;
        Double d6 = d2;
        String str5 = str3;
        String str6 = str4;
        return featuredResponse.copy(num, str, str2, num2, str5, str6, d5, d6, d4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    public final List<GameList> component10() {
        return this.gameList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWidgetImageUrl() {
        return this.widgetImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getActualPaidAmount() {
        return this.actualPaidAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final FeaturedResponse copy(Integer id, String name, String widgetImageUrl, Integer position, String isVisible, String startTime, Double giftAmount, Double actualPaidAmount, Double actualPayoutAmount, List<GameList> gameList) {
        return new FeaturedResponse(id, name, widgetImageUrl, position, isVisible, startTime, giftAmount, actualPaidAmount, actualPayoutAmount, gameList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedResponse)) {
            return false;
        }
        FeaturedResponse featuredResponse = (FeaturedResponse) other;
        return Intrinsics.g(this.id, featuredResponse.id) && Intrinsics.g(this.name, featuredResponse.name) && Intrinsics.g(this.widgetImageUrl, featuredResponse.widgetImageUrl) && Intrinsics.g(this.position, featuredResponse.position) && Intrinsics.g(this.isVisible, featuredResponse.isVisible) && Intrinsics.g(this.startTime, featuredResponse.startTime) && Intrinsics.g(this.giftAmount, featuredResponse.giftAmount) && Intrinsics.g(this.actualPaidAmount, featuredResponse.actualPaidAmount) && Intrinsics.g(this.actualPayoutAmount, featuredResponse.actualPayoutAmount) && Intrinsics.g(this.gameList, featuredResponse.gameList);
    }

    public final Double getActualPaidAmount() {
        return this.actualPaidAmount;
    }

    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final List<GameList> getGameList() {
        return this.gameList;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getWidgetImageUrl() {
        return this.widgetImageUrl;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.widgetImageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.position;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.isVisible;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTime;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.actualPaidAmount;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.actualPayoutAmount;
        int iHashCode9 = (iHashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
        List<GameList> list = this.gameList;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String isVisible() {
        return this.isVisible;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.name;
        String str2 = this.widgetImageUrl;
        Integer num2 = this.position;
        String str3 = this.isVisible;
        String str4 = this.startTime;
        Double d = this.giftAmount;
        Double d2 = this.actualPaidAmount;
        Double d3 = this.actualPayoutAmount;
        List<GameList> list = this.gameList;
        StringBuilder sbA = pq6.a(num, "FeaturedResponse(id=", ", name=", str, ", widgetImageUrl=");
        oie.a(num2, str2, ", position=", ", isVisible=", sbA);
        hxa.c(sbA, str3, ", startTime=", str4, ", giftAmount=");
        s27.a(d, d2, ", actualPaidAmount=", ", actualPayoutAmount=", sbA);
        sbA.append(d3);
        sbA.append(", gameList=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
