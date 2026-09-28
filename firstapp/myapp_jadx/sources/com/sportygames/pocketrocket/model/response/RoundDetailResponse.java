package com.sportygames.pocketrocket.model.response;

import defpackage.cv7;
import defpackage.dy5;
import defpackage.ffp;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u000223B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0006HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse;", "", "roundId", "", "startTime", "totalBets", "", "highestStake", "highestStakeRocketType", "highestCashoutRocketType", "highestCashoutCoefficient", "", "rocketTypeBetsMap", "Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeBetsMap;", "rocketTypeCoefficientMap", "Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeCoefficientMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeBetsMap;Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeCoefficientMap;)V", "getRoundId", "()Ljava/lang/String;", "getStartTime", "getTotalBets", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHighestStake", "getHighestStakeRocketType", "getHighestCashoutRocketType", "getHighestCashoutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRocketTypeBetsMap", "()Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeBetsMap;", "getRocketTypeCoefficientMap", "()Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeCoefficientMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeBetsMap;Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeCoefficientMap;)Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse;", "equals", "", "other", "hashCode", "toString", "RocketTypeBetsMap", "RocketTypeCoefficientMap", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundDetailResponse {
    public static final int $stable = 0;
    private final Double highestCashoutCoefficient;
    private final String highestCashoutRocketType;
    private final Integer highestStake;
    private final String highestStakeRocketType;
    private final RocketTypeBetsMap rocketTypeBetsMap;
    private final RocketTypeCoefficientMap rocketTypeCoefficientMap;
    private final String roundId;
    private final String startTime;
    private final Integer totalBets;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeBetsMap;", "", "RED", "", "BLUE", "PURPLE", "<init>", "(III)V", "getRED", "()I", "getBLUE", "getPURPLE", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RocketTypeBetsMap {
        public static final int $stable = 0;
        private final int BLUE;
        private final int PURPLE;
        private final int RED;

        public RocketTypeBetsMap(int i, int i2, int i3) {
            this.RED = i;
            this.BLUE = i2;
            this.PURPLE = i3;
        }

        public static /* synthetic */ RocketTypeBetsMap copy$default(RocketTypeBetsMap rocketTypeBetsMap, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = rocketTypeBetsMap.RED;
            }
            if ((i4 & 2) != 0) {
                i2 = rocketTypeBetsMap.BLUE;
            }
            if ((i4 & 4) != 0) {
                i3 = rocketTypeBetsMap.PURPLE;
            }
            return rocketTypeBetsMap.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRED() {
            return this.RED;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBLUE() {
            return this.BLUE;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPURPLE() {
            return this.PURPLE;
        }

        public final RocketTypeBetsMap copy(int RED, int BLUE, int PURPLE) {
            return new RocketTypeBetsMap(RED, BLUE, PURPLE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RocketTypeBetsMap)) {
                return false;
            }
            RocketTypeBetsMap rocketTypeBetsMap = (RocketTypeBetsMap) other;
            return this.RED == rocketTypeBetsMap.RED && this.BLUE == rocketTypeBetsMap.BLUE && this.PURPLE == rocketTypeBetsMap.PURPLE;
        }

        public final int getBLUE() {
            return this.BLUE;
        }

        public final int getPURPLE() {
            return this.PURPLE;
        }

        public final int getRED() {
            return this.RED;
        }

        public int hashCode() {
            return Integer.hashCode(this.PURPLE) + gpp.a(this.BLUE, Integer.hashCode(this.RED) * 31, 31);
        }

        public String toString() {
            return zk1.a(this.PURPLE, ")", dy5.a("RocketTypeBetsMap(RED=", this.RED, this.BLUE, ", BLUE=", ", PURPLE="));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse$RocketTypeCoefficientMap;", "", "RED", "", "BLUE", "PURPLE", "<init>", "(DDD)V", "getRED", "()D", "getBLUE", "getPURPLE", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RocketTypeCoefficientMap {
        public static final int $stable = 0;
        private final double BLUE;
        private final double PURPLE;
        private final double RED;

        public RocketTypeCoefficientMap(double d, double d2, double d3) {
            this.RED = d;
            this.BLUE = d2;
            this.PURPLE = d3;
        }

        public static /* synthetic */ RocketTypeCoefficientMap copy$default(RocketTypeCoefficientMap rocketTypeCoefficientMap, double d, double d2, double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = rocketTypeCoefficientMap.RED;
            }
            double d4 = d;
            if ((i & 2) != 0) {
                d2 = rocketTypeCoefficientMap.BLUE;
            }
            double d5 = d2;
            if ((i & 4) != 0) {
                d3 = rocketTypeCoefficientMap.PURPLE;
            }
            return rocketTypeCoefficientMap.copy(d4, d5, d3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getRED() {
            return this.RED;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getBLUE() {
            return this.BLUE;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getPURPLE() {
            return this.PURPLE;
        }

        public final RocketTypeCoefficientMap copy(double RED, double BLUE, double PURPLE) {
            return new RocketTypeCoefficientMap(RED, BLUE, PURPLE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RocketTypeCoefficientMap)) {
                return false;
            }
            RocketTypeCoefficientMap rocketTypeCoefficientMap = (RocketTypeCoefficientMap) other;
            return Double.compare(this.RED, rocketTypeCoefficientMap.RED) == 0 && Double.compare(this.BLUE, rocketTypeCoefficientMap.BLUE) == 0 && Double.compare(this.PURPLE, rocketTypeCoefficientMap.PURPLE) == 0;
        }

        public final double getBLUE() {
            return this.BLUE;
        }

        public final double getPURPLE() {
            return this.PURPLE;
        }

        public final double getRED() {
            return this.RED;
        }

        public int hashCode() {
            return Double.hashCode(this.PURPLE) + nrg0.a(Double.hashCode(this.RED) * 31, 31, this.BLUE);
        }

        public String toString() {
            double d = this.RED;
            double d2 = this.BLUE;
            double d3 = this.PURPLE;
            StringBuilder sbA = ffp.a(d, "RocketTypeCoefficientMap(RED=", ", BLUE=");
            sbA.append(d2);
            sbA.append(", PURPLE=");
            sbA.append(d3);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public RoundDetailResponse(String str, String str2, Integer num, Integer num2, String str3, String str4, Double d, RocketTypeBetsMap rocketTypeBetsMap, RocketTypeCoefficientMap rocketTypeCoefficientMap) {
        str.getClass();
        this.roundId = str;
        this.startTime = str2;
        this.totalBets = num;
        this.highestStake = num2;
        this.highestStakeRocketType = str3;
        this.highestCashoutRocketType = str4;
        this.highestCashoutCoefficient = d;
        this.rocketTypeBetsMap = rocketTypeBetsMap;
        this.rocketTypeCoefficientMap = rocketTypeCoefficientMap;
    }

    public static /* synthetic */ RoundDetailResponse copy$default(RoundDetailResponse roundDetailResponse, String str, String str2, Integer num, Integer num2, String str3, String str4, Double d, RocketTypeBetsMap rocketTypeBetsMap, RocketTypeCoefficientMap rocketTypeCoefficientMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roundDetailResponse.roundId;
        }
        if ((i & 2) != 0) {
            str2 = roundDetailResponse.startTime;
        }
        if ((i & 4) != 0) {
            num = roundDetailResponse.totalBets;
        }
        if ((i & 8) != 0) {
            num2 = roundDetailResponse.highestStake;
        }
        if ((i & 16) != 0) {
            str3 = roundDetailResponse.highestStakeRocketType;
        }
        if ((i & 32) != 0) {
            str4 = roundDetailResponse.highestCashoutRocketType;
        }
        if ((i & 64) != 0) {
            d = roundDetailResponse.highestCashoutCoefficient;
        }
        if ((i & 128) != 0) {
            rocketTypeBetsMap = roundDetailResponse.rocketTypeBetsMap;
        }
        if ((i & 256) != 0) {
            rocketTypeCoefficientMap = roundDetailResponse.rocketTypeCoefficientMap;
        }
        RocketTypeBetsMap rocketTypeBetsMap2 = rocketTypeBetsMap;
        RocketTypeCoefficientMap rocketTypeCoefficientMap2 = rocketTypeCoefficientMap;
        String str5 = str4;
        Double d2 = d;
        String str6 = str3;
        Integer num3 = num;
        return roundDetailResponse.copy(str, str2, num3, num2, str6, str5, d2, rocketTypeBetsMap2, rocketTypeCoefficientMap2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalBets() {
        return this.totalBets;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHighestStake() {
        return this.highestStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHighestStakeRocketType() {
        return this.highestStakeRocketType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHighestCashoutRocketType() {
        return this.highestCashoutRocketType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getHighestCashoutCoefficient() {
        return this.highestCashoutCoefficient;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RocketTypeBetsMap getRocketTypeBetsMap() {
        return this.rocketTypeBetsMap;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RocketTypeCoefficientMap getRocketTypeCoefficientMap() {
        return this.rocketTypeCoefficientMap;
    }

    public final RoundDetailResponse copy(String roundId, String startTime, Integer totalBets, Integer highestStake, String highestStakeRocketType, String highestCashoutRocketType, Double highestCashoutCoefficient, RocketTypeBetsMap rocketTypeBetsMap, RocketTypeCoefficientMap rocketTypeCoefficientMap) {
        roundId.getClass();
        return new RoundDetailResponse(roundId, startTime, totalBets, highestStake, highestStakeRocketType, highestCashoutRocketType, highestCashoutCoefficient, rocketTypeBetsMap, rocketTypeCoefficientMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundDetailResponse)) {
            return false;
        }
        RoundDetailResponse roundDetailResponse = (RoundDetailResponse) other;
        return Intrinsics.g(this.roundId, roundDetailResponse.roundId) && Intrinsics.g(this.startTime, roundDetailResponse.startTime) && Intrinsics.g(this.totalBets, roundDetailResponse.totalBets) && Intrinsics.g(this.highestStake, roundDetailResponse.highestStake) && Intrinsics.g(this.highestStakeRocketType, roundDetailResponse.highestStakeRocketType) && Intrinsics.g(this.highestCashoutRocketType, roundDetailResponse.highestCashoutRocketType) && Intrinsics.g(this.highestCashoutCoefficient, roundDetailResponse.highestCashoutCoefficient) && Intrinsics.g(this.rocketTypeBetsMap, roundDetailResponse.rocketTypeBetsMap) && Intrinsics.g(this.rocketTypeCoefficientMap, roundDetailResponse.rocketTypeCoefficientMap);
    }

    public final Double getHighestCashoutCoefficient() {
        return this.highestCashoutCoefficient;
    }

    public final String getHighestCashoutRocketType() {
        return this.highestCashoutRocketType;
    }

    public final Integer getHighestStake() {
        return this.highestStake;
    }

    public final String getHighestStakeRocketType() {
        return this.highestStakeRocketType;
    }

    public final RocketTypeBetsMap getRocketTypeBetsMap() {
        return this.rocketTypeBetsMap;
    }

    public final RocketTypeCoefficientMap getRocketTypeCoefficientMap() {
        return this.rocketTypeCoefficientMap;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final Integer getTotalBets() {
        return this.totalBets;
    }

    public int hashCode() {
        int iHashCode = this.roundId.hashCode() * 31;
        String str = this.startTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalBets;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.highestStake;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.highestStakeRocketType;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highestCashoutRocketType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.highestCashoutCoefficient;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        RocketTypeBetsMap rocketTypeBetsMap = this.rocketTypeBetsMap;
        int iHashCode8 = (iHashCode7 + (rocketTypeBetsMap == null ? 0 : rocketTypeBetsMap.hashCode())) * 31;
        RocketTypeCoefficientMap rocketTypeCoefficientMap = this.rocketTypeCoefficientMap;
        return iHashCode8 + (rocketTypeCoefficientMap != null ? rocketTypeCoefficientMap.hashCode() : 0);
    }

    public String toString() {
        String str = this.roundId;
        String str2 = this.startTime;
        Integer num = this.totalBets;
        Integer num2 = this.highestStake;
        String str3 = this.highestStakeRocketType;
        String str4 = this.highestCashoutRocketType;
        Double d = this.highestCashoutCoefficient;
        RocketTypeBetsMap rocketTypeBetsMap = this.rocketTypeBetsMap;
        RocketTypeCoefficientMap rocketTypeCoefficientMap = this.rocketTypeCoefficientMap;
        StringBuilder sbA = ux5.a("RoundDetailResponse(roundId=", str, ", startTime=", str2, ", totalBets=");
        cv7.a(sbA, num, ", highestStake=", num2, ", highestStakeRocketType=");
        hxa.c(sbA, str3, ", highestCashoutRocketType=", str4, ", highestCashoutCoefficient=");
        sbA.append(d);
        sbA.append(", rocketTypeBetsMap=");
        sbA.append(rocketTypeBetsMap);
        sbA.append(", rocketTypeCoefficientMap=");
        sbA.append(rocketTypeCoefficientMap);
        sbA.append(")");
        return sbA.toString();
    }
}
