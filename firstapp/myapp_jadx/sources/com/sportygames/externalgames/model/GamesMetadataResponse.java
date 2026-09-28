package com.sportygames.externalgames.model;

import defpackage.cv7;
import defpackage.ux5;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/sportygames/externalgames/model/GamesMetadataResponse;", "", "gameList", "", "Lcom/sportygames/externalgames/model/GamesMetadataResponse$GameMetadata;", "total", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getGameList", "()Ljava/util/List;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/sportygames/externalgames/model/GamesMetadataResponse;", "equals", "", "other", "hashCode", "toString", "", "GameMetadata", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GamesMetadataResponse {
    public static final int $stable = 8;
    private final List<GameMetadata> gameList;
    private final Integer total;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u008c\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\b\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b \u0010\u0016¨\u00061"}, d2 = {"Lcom/sportygames/externalgames/model/GamesMetadataResponse$GameMetadata;", "", "name", "", "displayName", "gameId", "", "bizType", "isInHouseGame", "", "categoryIds", "", "providerId", "deepLinkUrl", "imageUrl", "onlineUserCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getGameId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBizType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCategoryIds", "()Ljava/util/List;", "getProviderId", "getDeepLinkUrl", "getImageUrl", "getOnlineUserCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sportygames/externalgames/model/GamesMetadataResponse$GameMetadata;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GameMetadata {
        public static final int $stable = 8;
        private final Integer bizType;
        private final List<Integer> categoryIds;
        private final String deepLinkUrl;
        private final String displayName;
        private final Integer gameId;
        private final String imageUrl;
        private final Boolean isInHouseGame;
        private final String name;
        private final Integer onlineUserCount;
        private final Integer providerId;

        public GameMetadata(String str, String str2, Integer num, Integer num2, Boolean bool, List<Integer> list, Integer num3, String str3, String str4, Integer num4) {
            this.name = str;
            this.displayName = str2;
            this.gameId = num;
            this.bizType = num2;
            this.isInHouseGame = bool;
            this.categoryIds = list;
            this.providerId = num3;
            this.deepLinkUrl = str3;
            this.imageUrl = str4;
            this.onlineUserCount = num4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GameMetadata copy$default(GameMetadata gameMetadata, String str, String str2, Integer num, Integer num2, Boolean bool, List list, Integer num3, String str3, String str4, Integer num4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gameMetadata.name;
            }
            if ((i & 2) != 0) {
                str2 = gameMetadata.displayName;
            }
            if ((i & 4) != 0) {
                num = gameMetadata.gameId;
            }
            if ((i & 8) != 0) {
                num2 = gameMetadata.bizType;
            }
            if ((i & 16) != 0) {
                bool = gameMetadata.isInHouseGame;
            }
            if ((i & 32) != 0) {
                list = gameMetadata.categoryIds;
            }
            if ((i & 64) != 0) {
                num3 = gameMetadata.providerId;
            }
            if ((i & 128) != 0) {
                str3 = gameMetadata.deepLinkUrl;
            }
            if ((i & 256) != 0) {
                str4 = gameMetadata.imageUrl;
            }
            if ((i & 512) != 0) {
                num4 = gameMetadata.onlineUserCount;
            }
            String str5 = str4;
            Integer num5 = num4;
            Integer num6 = num3;
            String str6 = str3;
            Boolean bool2 = bool;
            List list2 = list;
            return gameMetadata.copy(str, str2, num, num2, bool2, list2, num6, str6, str5, num5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Integer getOnlineUserCount() {
            return this.onlineUserCount;
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
        public final Integer getBizType() {
            return this.bizType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Boolean getIsInHouseGame() {
            return this.isInHouseGame;
        }

        public final List<Integer> component6() {
            return this.categoryIds;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getProviderId() {
            return this.providerId;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final GameMetadata copy(String name, String displayName, Integer gameId, Integer bizType, Boolean isInHouseGame, List<Integer> categoryIds, Integer providerId, String deepLinkUrl, String imageUrl, Integer onlineUserCount) {
            return new GameMetadata(name, displayName, gameId, bizType, isInHouseGame, categoryIds, providerId, deepLinkUrl, imageUrl, onlineUserCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GameMetadata)) {
                return false;
            }
            GameMetadata gameMetadata = (GameMetadata) other;
            return Intrinsics.g(this.name, gameMetadata.name) && Intrinsics.g(this.displayName, gameMetadata.displayName) && Intrinsics.g(this.gameId, gameMetadata.gameId) && Intrinsics.g(this.bizType, gameMetadata.bizType) && Intrinsics.g(this.isInHouseGame, gameMetadata.isInHouseGame) && Intrinsics.g(this.categoryIds, gameMetadata.categoryIds) && Intrinsics.g(this.providerId, gameMetadata.providerId) && Intrinsics.g(this.deepLinkUrl, gameMetadata.deepLinkUrl) && Intrinsics.g(this.imageUrl, gameMetadata.imageUrl) && Intrinsics.g(this.onlineUserCount, gameMetadata.onlineUserCount);
        }

        public final Integer getBizType() {
            return this.bizType;
        }

        public final List<Integer> getCategoryIds() {
            return this.categoryIds;
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

        public final Integer getOnlineUserCount() {
            return this.onlineUserCount;
        }

        public final Integer getProviderId() {
            return this.providerId;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.displayName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.gameId;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.bizType;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.isInHouseGame;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<Integer> list = this.categoryIds;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num3 = this.providerId;
            int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this.deepLinkUrl;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageUrl;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num4 = this.onlineUserCount;
            return iHashCode9 + (num4 != null ? num4.hashCode() : 0);
        }

        public final Boolean isInHouseGame() {
            return this.isInHouseGame;
        }

        public String toString() {
            String str = this.name;
            String str2 = this.displayName;
            Integer num = this.gameId;
            Integer num2 = this.bizType;
            Boolean bool = this.isInHouseGame;
            List<Integer> list = this.categoryIds;
            Integer num3 = this.providerId;
            String str3 = this.deepLinkUrl;
            String str4 = this.imageUrl;
            Integer num4 = this.onlineUserCount;
            StringBuilder sbA = ux5.a("GameMetadata(name=", str, ", displayName=", str2, ", gameId=");
            cv7.a(sbA, num, ", bizType=", num2, ", isInHouseGame=");
            sbA.append(bool);
            sbA.append(", categoryIds=");
            sbA.append(list);
            sbA.append(", providerId=");
            w03.a(num3, ", deepLinkUrl=", str3, ", imageUrl=", sbA);
            sbA.append(str4);
            sbA.append(", onlineUserCount=");
            sbA.append(num4);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public GamesMetadataResponse(List<GameMetadata> list, Integer num) {
        this.gameList = list;
        this.total = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GamesMetadataResponse copy$default(GamesMetadataResponse gamesMetadataResponse, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gamesMetadataResponse.gameList;
        }
        if ((i & 2) != 0) {
            num = gamesMetadataResponse.total;
        }
        return gamesMetadataResponse.copy(list, num);
    }

    public final List<GameMetadata> component1() {
        return this.gameList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    public final GamesMetadataResponse copy(List<GameMetadata> gameList, Integer total) {
        return new GamesMetadataResponse(gameList, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamesMetadataResponse)) {
            return false;
        }
        GamesMetadataResponse gamesMetadataResponse = (GamesMetadataResponse) other;
        return Intrinsics.g(this.gameList, gamesMetadataResponse.gameList) && Intrinsics.g(this.total, gamesMetadataResponse.total);
    }

    public final List<GameMetadata> getGameList() {
        return this.gameList;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<GameMetadata> list = this.gameList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.total;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GamesMetadataResponse(gameList=" + this.gameList + ", total=" + this.total + ")";
    }
}
