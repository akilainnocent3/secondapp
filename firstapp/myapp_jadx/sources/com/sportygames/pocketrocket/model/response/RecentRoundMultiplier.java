package com.sportygames.pocketrocket.model.response;

import com.appsflyer.internal.b0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ffp;
import defpackage.gmf0;
import defpackage.nrg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier;", "", "limit", "", "coefficients", "", "Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients;", "data", "<init>", "(ILjava/util/List;Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients;)V", "getLimit", "()I", "getCoefficients", "()Ljava/util/List;", "getData", "()Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Coefficients", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentRoundMultiplier {
    public static final int $stable = 8;
    private final List<Coefficients> coefficients;
    private final Coefficients data;
    private final int limit;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients;", "", AnalyticsParam.EVENT_PARAM_ID, "", "endTime", "", "houseCoefficients", "Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients$HouseCoefficients;", "<init>", "(JLjava/lang/String;Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients$HouseCoefficients;)V", "getId", "()J", "getEndTime", "()Ljava/lang/String;", "getHouseCoefficients", "()Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients$HouseCoefficients;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "HouseCoefficients", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Coefficients {
        public static final int $stable = 0;
        private final String endTime;
        private final HouseCoefficients houseCoefficients;
        private final long id;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier$Coefficients$HouseCoefficients;", "", "RED", "", "BLUE", "PURPLE", "<init>", "(DDD)V", "getRED", "()D", "getBLUE", "getPURPLE", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HouseCoefficients {
            public static final int $stable = 0;
            private final double BLUE;
            private final double PURPLE;
            private final double RED;

            public HouseCoefficients(double d, double d2, double d3) {
                this.RED = d;
                this.BLUE = d2;
                this.PURPLE = d3;
            }

            public static /* synthetic */ HouseCoefficients copy$default(HouseCoefficients houseCoefficients, double d, double d2, double d3, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = houseCoefficients.RED;
                }
                double d4 = d;
                if ((i & 2) != 0) {
                    d2 = houseCoefficients.BLUE;
                }
                double d5 = d2;
                if ((i & 4) != 0) {
                    d3 = houseCoefficients.PURPLE;
                }
                return houseCoefficients.copy(d4, d5, d3);
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

            public final HouseCoefficients copy(double RED, double BLUE, double PURPLE) {
                return new HouseCoefficients(RED, BLUE, PURPLE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HouseCoefficients)) {
                    return false;
                }
                HouseCoefficients houseCoefficients = (HouseCoefficients) other;
                return Double.compare(this.RED, houseCoefficients.RED) == 0 && Double.compare(this.BLUE, houseCoefficients.BLUE) == 0 && Double.compare(this.PURPLE, houseCoefficients.PURPLE) == 0;
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
                StringBuilder sbA = ffp.a(d, "HouseCoefficients(RED=", ", BLUE=");
                sbA.append(d2);
                sbA.append(", PURPLE=");
                sbA.append(d3);
                sbA.append(")");
                return sbA.toString();
            }
        }

        public Coefficients(long j, String str, HouseCoefficients houseCoefficients) {
            str.getClass();
            this.id = j;
            this.endTime = str;
            this.houseCoefficients = houseCoefficients;
        }

        public static /* synthetic */ Coefficients copy$default(Coefficients coefficients, long j, String str, HouseCoefficients houseCoefficients, int i, Object obj) {
            if ((i & 1) != 0) {
                j = coefficients.id;
            }
            if ((i & 2) != 0) {
                str = coefficients.endTime;
            }
            if ((i & 4) != 0) {
                houseCoefficients = coefficients.houseCoefficients;
            }
            return coefficients.copy(j, str, houseCoefficients);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HouseCoefficients getHouseCoefficients() {
            return this.houseCoefficients;
        }

        public final Coefficients copy(long id, String endTime, HouseCoefficients houseCoefficients) {
            endTime.getClass();
            return new Coefficients(id, endTime, houseCoefficients);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coefficients)) {
                return false;
            }
            Coefficients coefficients = (Coefficients) other;
            return this.id == coefficients.id && Intrinsics.g(this.endTime, coefficients.endTime) && Intrinsics.g(this.houseCoefficients, coefficients.houseCoefficients);
        }

        public final String getEndTime() {
            return this.endTime;
        }

        public final HouseCoefficients getHouseCoefficients() {
            return this.houseCoefficients;
        }

        public final long getId() {
            return this.id;
        }

        public int hashCode() {
            int iA = gmf0.a(Long.hashCode(this.id) * 31, 31, this.endTime);
            HouseCoefficients houseCoefficients = this.houseCoefficients;
            return iA + (houseCoefficients == null ? 0 : houseCoefficients.hashCode());
        }

        public String toString() {
            long j = this.id;
            String str = this.endTime;
            HouseCoefficients houseCoefficients = this.houseCoefficients;
            StringBuilder sbA = b0.a(j, "Coefficients(id=", ", endTime=", str);
            sbA.append(", houseCoefficients=");
            sbA.append(houseCoefficients);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public RecentRoundMultiplier(int i, List<Coefficients> list, Coefficients coefficients) {
        this.limit = i;
        this.coefficients = list;
        this.data = coefficients;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentRoundMultiplier copy$default(RecentRoundMultiplier recentRoundMultiplier, int i, List list, Coefficients coefficients, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentRoundMultiplier.limit;
        }
        if ((i2 & 2) != 0) {
            list = recentRoundMultiplier.coefficients;
        }
        if ((i2 & 4) != 0) {
            coefficients = recentRoundMultiplier.data;
        }
        return recentRoundMultiplier.copy(i, list, coefficients);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<Coefficients> component2() {
        return this.coefficients;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Coefficients getData() {
        return this.data;
    }

    public final RecentRoundMultiplier copy(int limit, List<Coefficients> coefficients, Coefficients data) {
        return new RecentRoundMultiplier(limit, coefficients, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentRoundMultiplier)) {
            return false;
        }
        RecentRoundMultiplier recentRoundMultiplier = (RecentRoundMultiplier) other;
        return this.limit == recentRoundMultiplier.limit && Intrinsics.g(this.coefficients, recentRoundMultiplier.coefficients) && Intrinsics.g(this.data, recentRoundMultiplier.data);
    }

    public final List<Coefficients> getCoefficients() {
        return this.coefficients;
    }

    public final Coefficients getData() {
        return this.data;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.limit) * 31;
        List<Coefficients> list = this.coefficients;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Coefficients coefficients = this.data;
        return iHashCode2 + (coefficients != null ? coefficients.hashCode() : 0);
    }

    public String toString() {
        return "RecentRoundMultiplier(limit=" + this.limit + ", coefficients=" + this.coefficients + ", data=" + this.data + ")";
    }
}
