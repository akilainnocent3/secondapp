package com.sportygames.pocketrocket.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.pr0;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006)"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/GameSocektResponse;", "", "roundId", "", "info", "Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info;", "hasEnded", "", "millisLeft", "", "totalMillis", "messageType", "", "commonMultiplier", "<init>", "(JLcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info;ZIILjava/lang/String;Ljava/lang/String;)V", "getRoundId", "()J", "getInfo", "()Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info;", "getHasEnded", "()Z", "getMillisLeft", "()I", "getTotalMillis", "getMessageType", "()Ljava/lang/String;", "getCommonMultiplier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Info", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameSocektResponse {
    public static final int $stable = 0;
    private final String commonMultiplier;
    private final boolean hasEnded;
    private final Info info;
    private final String messageType;
    private final int millisLeft;
    private final long roundId;
    private final int totalMillis;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info;", "", "RED", "Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info$InfoDetails;", "BLUE", "PURPLE", "<init>", "(Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info$InfoDetails;Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info$InfoDetails;Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info$InfoDetails;)V", "getRED", "()Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info$InfoDetails;", "getBLUE", "getPURPLE", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InfoDetails", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info {
        public static final int $stable = 0;
        private final InfoDetails BLUE;
        private final InfoDetails PURPLE;
        private final InfoDetails RED;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/GameSocektResponse$Info$InfoDetails;", "", "multiplier", "", AnalyticsParam.EVENT_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMultiplier", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoDetails {
            public static final int $stable = 0;
            private final String multiplier;
            private final String status;

            public InfoDetails(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.multiplier = str;
                this.status = str2;
            }

            public static /* synthetic */ InfoDetails copy$default(InfoDetails infoDetails, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = infoDetails.multiplier;
                }
                if ((i & 2) != 0) {
                    str2 = infoDetails.status;
                }
                return infoDetails.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMultiplier() {
                return this.multiplier;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            public final InfoDetails copy(String multiplier, String status) {
                multiplier.getClass();
                status.getClass();
                return new InfoDetails(multiplier, status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InfoDetails)) {
                    return false;
                }
                InfoDetails infoDetails = (InfoDetails) other;
                return Intrinsics.g(this.multiplier, infoDetails.multiplier) && Intrinsics.g(this.status, infoDetails.status);
            }

            public final String getMultiplier() {
                return this.multiplier;
            }

            public final String getStatus() {
                return this.status;
            }

            public int hashCode() {
                return this.status.hashCode() + (this.multiplier.hashCode() * 31);
            }

            public String toString() {
                return tx5.a("InfoDetails(multiplier=", this.multiplier, ", status=", this.status, ")");
            }
        }

        public Info(InfoDetails infoDetails, InfoDetails infoDetails2, InfoDetails infoDetails3) {
            infoDetails.getClass();
            infoDetails2.getClass();
            infoDetails3.getClass();
            this.RED = infoDetails;
            this.BLUE = infoDetails2;
            this.PURPLE = infoDetails3;
        }

        public static /* synthetic */ Info copy$default(Info info, InfoDetails infoDetails, InfoDetails infoDetails2, InfoDetails infoDetails3, int i, Object obj) {
            if ((i & 1) != 0) {
                infoDetails = info.RED;
            }
            if ((i & 2) != 0) {
                infoDetails2 = info.BLUE;
            }
            if ((i & 4) != 0) {
                infoDetails3 = info.PURPLE;
            }
            return info.copy(infoDetails, infoDetails2, infoDetails3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InfoDetails getRED() {
            return this.RED;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InfoDetails getBLUE() {
            return this.BLUE;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final InfoDetails getPURPLE() {
            return this.PURPLE;
        }

        public final Info copy(InfoDetails RED, InfoDetails BLUE, InfoDetails PURPLE) {
            RED.getClass();
            BLUE.getClass();
            PURPLE.getClass();
            return new Info(RED, BLUE, PURPLE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.g(this.RED, info.RED) && Intrinsics.g(this.BLUE, info.BLUE) && Intrinsics.g(this.PURPLE, info.PURPLE);
        }

        public final InfoDetails getBLUE() {
            return this.BLUE;
        }

        public final InfoDetails getPURPLE() {
            return this.PURPLE;
        }

        public final InfoDetails getRED() {
            return this.RED;
        }

        public int hashCode() {
            return this.PURPLE.hashCode() + ((this.BLUE.hashCode() + (this.RED.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Info(RED=" + this.RED + ", BLUE=" + this.BLUE + ", PURPLE=" + this.PURPLE + ")";
        }
    }

    public GameSocektResponse(long j, Info info, boolean z, int i, int i2, String str, String str2) {
        info.getClass();
        str.getClass();
        str2.getClass();
        this.roundId = j;
        this.info = info;
        this.hasEnded = z;
        this.millisLeft = i;
        this.totalMillis = i2;
        this.messageType = str;
        this.commonMultiplier = str2;
    }

    public static /* synthetic */ GameSocektResponse copy$default(GameSocektResponse gameSocektResponse, long j, Info info, boolean z, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = gameSocektResponse.roundId;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            info = gameSocektResponse.info;
        }
        Info info2 = info;
        if ((i3 & 4) != 0) {
            z = gameSocektResponse.hasEnded;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i = gameSocektResponse.millisLeft;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = gameSocektResponse.totalMillis;
        }
        return gameSocektResponse.copy(j2, info2, z2, i4, i2, (i3 & 32) != 0 ? gameSocektResponse.messageType : str, (i3 & 64) != 0 ? gameSocektResponse.commonMultiplier : str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Info getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasEnded() {
        return this.hasEnded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMillisLeft() {
        return this.millisLeft;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalMillis() {
        return this.totalMillis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCommonMultiplier() {
        return this.commonMultiplier;
    }

    public final GameSocektResponse copy(long roundId, Info info, boolean hasEnded, int millisLeft, int totalMillis, String messageType, String commonMultiplier) {
        info.getClass();
        messageType.getClass();
        commonMultiplier.getClass();
        return new GameSocektResponse(roundId, info, hasEnded, millisLeft, totalMillis, messageType, commonMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameSocektResponse)) {
            return false;
        }
        GameSocektResponse gameSocektResponse = (GameSocektResponse) other;
        return this.roundId == gameSocektResponse.roundId && Intrinsics.g(this.info, gameSocektResponse.info) && this.hasEnded == gameSocektResponse.hasEnded && this.millisLeft == gameSocektResponse.millisLeft && this.totalMillis == gameSocektResponse.totalMillis && Intrinsics.g(this.messageType, gameSocektResponse.messageType) && Intrinsics.g(this.commonMultiplier, gameSocektResponse.commonMultiplier);
    }

    public final String getCommonMultiplier() {
        return this.commonMultiplier;
    }

    public final boolean getHasEnded() {
        return this.hasEnded;
    }

    public final Info getInfo() {
        return this.info;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final int getMillisLeft() {
        return this.millisLeft;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final int getTotalMillis() {
        return this.totalMillis;
    }

    public int hashCode() {
        return this.commonMultiplier.hashCode() + gmf0.a(gpp.a(this.totalMillis, gpp.a(this.millisLeft, mtg0.a((this.info.hashCode() + (Long.hashCode(this.roundId) * 31)) * 31, 31, this.hasEnded), 31), 31), 31, this.messageType);
    }

    public String toString() {
        long j = this.roundId;
        Info info = this.info;
        boolean z = this.hasEnded;
        int i = this.millisLeft;
        int i2 = this.totalMillis;
        String str = this.messageType;
        String str2 = this.commonMultiplier;
        StringBuilder sb = new StringBuilder("GameSocektResponse(roundId=");
        sb.append(j);
        sb.append(", info=");
        sb.append(info);
        sb.append(", hasEnded=");
        sb.append(z);
        sb.append(", millisLeft=");
        sb.append(i);
        sb.append(", totalMillis=");
        sb.append(i2);
        sb.append(", messageType=");
        sb.append(str);
        return pr0.a(sb, ", commonMultiplier=", str2, ")");
    }
}
