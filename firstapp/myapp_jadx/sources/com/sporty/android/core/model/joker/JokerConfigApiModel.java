package com.sporty.android.core.model.joker;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.ux5;
import defpackage.z620;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/joker/JokerConfigApiModel;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "enabled", "", "oddsKey", "", "eligibleMarkets", "", "Lcom/sporty/android/core/model/joker/JokerConfigApiModel$EligibleMarkets;", "<init>", "(Ljava/lang/String;ZDLjava/util/List;)V", "getEventId", "()Ljava/lang/String;", "getEnabled", "()Z", "getOddsKey", "()D", "getEligibleMarkets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "EligibleMarkets", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class JokerConfigApiModel {
    private final List<EligibleMarkets> eligibleMarkets;
    private final boolean enabled;
    private final String eventId;
    private final double oddsKey;

    public JokerConfigApiModel(String str, boolean z, double d, List<EligibleMarkets> list) {
        list.getClass();
        this.eventId = str;
        this.enabled = z;
        this.oddsKey = d;
        this.eligibleMarkets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JokerConfigApiModel copy$default(JokerConfigApiModel jokerConfigApiModel, String str, boolean z, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jokerConfigApiModel.eventId;
        }
        if ((i & 2) != 0) {
            z = jokerConfigApiModel.enabled;
        }
        if ((i & 4) != 0) {
            d = jokerConfigApiModel.oddsKey;
        }
        if ((i & 8) != 0) {
            list = jokerConfigApiModel.eligibleMarkets;
        }
        List list2 = list;
        return jokerConfigApiModel.copy(str, z, d, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getOddsKey() {
        return this.oddsKey;
    }

    public final List<EligibleMarkets> component4() {
        return this.eligibleMarkets;
    }

    public final JokerConfigApiModel copy(String eventId, boolean enabled, double oddsKey, List<EligibleMarkets> eligibleMarkets) {
        eligibleMarkets.getClass();
        return new JokerConfigApiModel(eventId, enabled, oddsKey, eligibleMarkets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JokerConfigApiModel)) {
            return false;
        }
        JokerConfigApiModel jokerConfigApiModel = (JokerConfigApiModel) other;
        return Intrinsics.g(this.eventId, jokerConfigApiModel.eventId) && this.enabled == jokerConfigApiModel.enabled && Double.compare(this.oddsKey, jokerConfigApiModel.oddsKey) == 0 && Intrinsics.g(this.eligibleMarkets, jokerConfigApiModel.eligibleMarkets);
    }

    public final List<EligibleMarkets> getEligibleMarkets() {
        return this.eligibleMarkets;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final double getOddsKey() {
        return this.oddsKey;
    }

    public int hashCode() {
        String str = this.eventId;
        return this.eligibleMarkets.hashCode() + nrg0.a(mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.enabled), 31, this.oddsKey);
    }

    public String toString() {
        String str = this.eventId;
        boolean z = this.enabled;
        double d = this.oddsKey;
        List<EligibleMarkets> list = this.eligibleMarkets;
        StringBuilder sbA = z620.a("JokerConfigApiModel(eventId=", str, ", enabled=", sgwpmp.IBWmIgoMZzaoUaC, z);
        sbA.append(d);
        sbA.append(", eligibleMarkets=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ JokerConfigApiModel(String str, boolean z, double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, z, d, list);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/joker/JokerConfigApiModel$EligibleMarkets;", "", "marketId", "", "marketName", "numberOfOutcomes", "", "excludeSpecifierRegex", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getMarketId", "()Ljava/lang/String;", "getMarketName", "getNumberOfOutcomes", "()I", "getExcludeSpecifierRegex", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class EligibleMarkets {
        private final String excludeSpecifierRegex;
        private final String marketId;
        private final String marketName;
        private final int numberOfOutcomes;

        public EligibleMarkets(String str, String str2, int i, String str3) {
            str.getClass();
            str2.getClass();
            this.marketId = str;
            this.marketName = str2;
            this.numberOfOutcomes = i;
            this.excludeSpecifierRegex = str3;
        }

        public static /* synthetic */ EligibleMarkets copy$default(EligibleMarkets eligibleMarkets, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = eligibleMarkets.marketId;
            }
            if ((i2 & 2) != 0) {
                str2 = eligibleMarkets.marketName;
            }
            if ((i2 & 4) != 0) {
                i = eligibleMarkets.numberOfOutcomes;
            }
            if ((i2 & 8) != 0) {
                str3 = eligibleMarkets.excludeSpecifierRegex;
            }
            return eligibleMarkets.copy(str, str2, i, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMarketId() {
            return this.marketId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMarketName() {
            return this.marketName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getNumberOfOutcomes() {
            return this.numberOfOutcomes;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getExcludeSpecifierRegex() {
            return this.excludeSpecifierRegex;
        }

        public final EligibleMarkets copy(String marketId, String marketName, int numberOfOutcomes, String excludeSpecifierRegex) {
            marketId.getClass();
            marketName.getClass();
            return new EligibleMarkets(marketId, marketName, numberOfOutcomes, excludeSpecifierRegex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EligibleMarkets)) {
                return false;
            }
            EligibleMarkets eligibleMarkets = (EligibleMarkets) other;
            return Intrinsics.g(this.marketId, eligibleMarkets.marketId) && Intrinsics.g(this.marketName, eligibleMarkets.marketName) && this.numberOfOutcomes == eligibleMarkets.numberOfOutcomes && Intrinsics.g(this.excludeSpecifierRegex, eligibleMarkets.excludeSpecifierRegex);
        }

        public final String getExcludeSpecifierRegex() {
            return this.excludeSpecifierRegex;
        }

        public final String getMarketId() {
            return this.marketId;
        }

        public final String getMarketName() {
            return this.marketName;
        }

        public final int getNumberOfOutcomes() {
            return this.numberOfOutcomes;
        }

        public int hashCode() {
            int iA = gpp.a(this.numberOfOutcomes, gmf0.a(this.marketId.hashCode() * 31, 31, this.marketName), 31);
            String str = this.excludeSpecifierRegex;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.marketId;
            String str2 = this.marketName;
            int i = this.numberOfOutcomes;
            String str3 = this.excludeSpecifierRegex;
            StringBuilder sbA = ux5.a("EligibleMarkets(marketId=", str, ", marketName=", str2, ", numberOfOutcomes=");
            sbA.append(i);
            sbA.append(", excludeSpecifierRegex=");
            sbA.append(str3);
            sbA.append(")");
            return sbA.toString();
        }

        public /* synthetic */ EligibleMarkets(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, (i2 & 8) != 0 ? null : str3);
        }
    }
}
