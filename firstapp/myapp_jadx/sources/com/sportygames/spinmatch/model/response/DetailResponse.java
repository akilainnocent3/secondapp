package com.sportygames.spinmatch.model.response;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nl;
import defpackage.nrg0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003-./B\u0087\u0001\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u0005\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005HÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J\u0099\u0001\u0010'\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u00052\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u00052\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0010HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0003j\b\u0012\u0004\u0012\u00020\t`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u00060"}, d2 = {"Lcom/sportygames/spinmatch/model/response/DetailResponse;", "", "betChipList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "maxBetConfigList", "Lcom/sportygames/spinmatch/model/response/DetailResponse$MaxBetConfigList;", "betConfigList", "Lcom/sportygames/spinmatch/model/response/DetailResponse$BetConfigList;", "betDetails", "Lcom/sportygames/spinmatch/model/response/DetailResponse$BetDetails;", "minStakeAmount", "isNextRoundFreeSpin", "", "wheel1ImageUrl", "", "wheel2ImageUrl", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;DZLjava/lang/String;Ljava/lang/String;)V", "getBetChipList", "()Ljava/util/ArrayList;", "getMaxBetConfigList", "getBetConfigList", "getBetDetails", "getMinStakeAmount", "()D", "()Z", "getWheel1ImageUrl", "()Ljava/lang/String;", "getWheel2ImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "MaxBetConfigList", "BetDetails", "BetConfigList", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailResponse {
    public static final int $stable = 8;
    private final ArrayList<Double> betChipList;
    private final ArrayList<BetConfigList> betConfigList;
    private final ArrayList<BetDetails> betDetails;
    private final boolean isNextRoundFreeSpin;
    private final ArrayList<MaxBetConfigList> maxBetConfigList;
    private final double minStakeAmount;
    private final String wheel1ImageUrl;
    private final String wheel2ImageUrl;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/sportygames/spinmatch/model/response/DetailResponse$BetConfigList;", "", "payout", "", AnalyticsParam.EVENT_PARAM_ID, "", "colour", "", "payoutDescription", "orderedPosition", "onWheel", "", "isFreeSpin", "position", "isActive", "colorCode", "<init>", "(DILjava/lang/String;Ljava/lang/String;IZZLjava/lang/String;ZI)V", "getPayout", "()D", "getId", "()I", "getColour", "()Ljava/lang/String;", "getPayoutDescription", "getOrderedPosition", "getOnWheel", "()Z", "getPosition", "getColorCode", "setColorCode", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BetConfigList {
        public static final int $stable = 8;
        private int colorCode;
        private final String colour;
        private final int id;
        private final boolean isActive;
        private final boolean isFreeSpin;
        private final boolean onWheel;
        private final int orderedPosition;
        private final double payout;
        private final String payoutDescription;
        private final String position;

        public BetConfigList(double d, int i, String str, String str2, int i2, boolean z, boolean z2, String str3, boolean z3, int i3) {
            m.a(str, str2, str3);
            this.payout = d;
            this.id = i;
            this.colour = str;
            this.payoutDescription = str2;
            this.orderedPosition = i2;
            this.onWheel = z;
            this.isFreeSpin = z2;
            this.position = str3;
            this.isActive = z3;
            this.colorCode = i3;
        }

        public static /* synthetic */ BetConfigList copy$default(BetConfigList betConfigList, double d, int i, String str, String str2, int i2, boolean z, boolean z2, String str3, boolean z3, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                d = betConfigList.payout;
            }
            double d2 = d;
            if ((i4 & 2) != 0) {
                i = betConfigList.id;
            }
            return betConfigList.copy(d2, i, (i4 & 4) != 0 ? betConfigList.colour : str, (i4 & 8) != 0 ? betConfigList.payoutDescription : str2, (i4 & 16) != 0 ? betConfigList.orderedPosition : i2, (i4 & 32) != 0 ? betConfigList.onWheel : z, (i4 & 64) != 0 ? betConfigList.isFreeSpin : z2, (i4 & 128) != 0 ? betConfigList.position : str3, (i4 & 256) != 0 ? betConfigList.isActive : z3, (i4 & 512) != 0 ? betConfigList.colorCode : i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getPayout() {
            return this.payout;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getColorCode() {
            return this.colorCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getColour() {
            return this.colour;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPayoutDescription() {
            return this.payoutDescription;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getOrderedPosition() {
            return this.orderedPosition;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getOnWheel() {
            return this.onWheel;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsFreeSpin() {
            return this.isFreeSpin;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final BetConfigList copy(double payout, int id, String colour, String payoutDescription, int orderedPosition, boolean onWheel, boolean isFreeSpin, String position, boolean isActive, int colorCode) {
            colour.getClass();
            payoutDescription.getClass();
            position.getClass();
            return new BetConfigList(payout, id, colour, payoutDescription, orderedPosition, onWheel, isFreeSpin, position, isActive, colorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetConfigList)) {
                return false;
            }
            BetConfigList betConfigList = (BetConfigList) other;
            return Double.compare(this.payout, betConfigList.payout) == 0 && this.id == betConfigList.id && Intrinsics.g(this.colour, betConfigList.colour) && Intrinsics.g(this.payoutDescription, betConfigList.payoutDescription) && this.orderedPosition == betConfigList.orderedPosition && this.onWheel == betConfigList.onWheel && this.isFreeSpin == betConfigList.isFreeSpin && Intrinsics.g(this.position, betConfigList.position) && this.isActive == betConfigList.isActive && this.colorCode == betConfigList.colorCode;
        }

        public final int getColorCode() {
            return this.colorCode;
        }

        public final String getColour() {
            return this.colour;
        }

        public final int getId() {
            return this.id;
        }

        public final boolean getOnWheel() {
            return this.onWheel;
        }

        public final int getOrderedPosition() {
            return this.orderedPosition;
        }

        public final double getPayout() {
            return this.payout;
        }

        public final String getPayoutDescription() {
            return this.payoutDescription;
        }

        public final String getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Integer.hashCode(this.colorCode) + mtg0.a(gmf0.a(mtg0.a(mtg0.a(gpp.a(this.orderedPosition, gmf0.a(gmf0.a(gpp.a(this.id, Double.hashCode(this.payout) * 31, 31), 31, this.colour), 31, this.payoutDescription), 31), 31, this.onWheel), 31, this.isFreeSpin), 31, this.position), 31, this.isActive);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isFreeSpin() {
            return this.isFreeSpin;
        }

        public final void setColorCode(int i) {
            this.colorCode = i;
        }

        public String toString() {
            double d = this.payout;
            int i = this.id;
            String str = this.colour;
            String str2 = this.payoutDescription;
            int i2 = this.orderedPosition;
            boolean z = this.onWheel;
            boolean z2 = this.isFreeSpin;
            String str3 = this.position;
            boolean z3 = this.isActive;
            int i3 = this.colorCode;
            StringBuilder sb = new StringBuilder("BetConfigList(payout=");
            sb.append(d);
            sb.append(", id=");
            sb.append(i);
            hxa.c(sb, ", colour=", str, ", payoutDescription=", str2);
            sb.append(", orderedPosition=");
            sb.append(i2);
            sb.append(", onWheel=");
            sb.append(z);
            sb.append(", isFreeSpin=");
            sb.append(z2);
            sb.append(", position=");
            sb.append(str3);
            sb.append(", isActive=");
            sb.append(z3);
            sb.append(", colorCode=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/spinmatch/model/response/DetailResponse$BetDetails;", "", "stakeAmount", "", "betConfigId", "", "<init>", "(DI)V", "getStakeAmount", "()D", "getBetConfigId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BetDetails {
        public static final int $stable = 0;
        private final int betConfigId;
        private final double stakeAmount;

        public BetDetails(double d, int i) {
            this.stakeAmount = d;
            this.betConfigId = i;
        }

        public static /* synthetic */ BetDetails copy$default(BetDetails betDetails, double d, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = betDetails.stakeAmount;
            }
            if ((i2 & 2) != 0) {
                i = betDetails.betConfigId;
            }
            return betDetails.copy(d, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getStakeAmount() {
            return this.stakeAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBetConfigId() {
            return this.betConfigId;
        }

        public final BetDetails copy(double stakeAmount, int betConfigId) {
            return new BetDetails(stakeAmount, betConfigId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetDetails)) {
                return false;
            }
            BetDetails betDetails = (BetDetails) other;
            return Double.compare(this.stakeAmount, betDetails.stakeAmount) == 0 && this.betConfigId == betDetails.betConfigId;
        }

        public final int getBetConfigId() {
            return this.betConfigId;
        }

        public final double getStakeAmount() {
            return this.stakeAmount;
        }

        public int hashCode() {
            return Integer.hashCode(this.betConfigId) + (Double.hashCode(this.stakeAmount) * 31);
        }

        public String toString() {
            return "BetDetails(stakeAmount=" + this.stakeAmount + ", betConfigId=" + this.betConfigId + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/spinmatch/model/response/DetailResponse$MaxBetConfigList;", "", "maxStakeAmount", "", "betConfigId", "", "<init>", "(DI)V", "getMaxStakeAmount", "()D", "getBetConfigId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaxBetConfigList {
        public static final int $stable = 0;
        private final int betConfigId;
        private final double maxStakeAmount;

        public MaxBetConfigList(double d, int i) {
            this.maxStakeAmount = d;
            this.betConfigId = i;
        }

        public static /* synthetic */ MaxBetConfigList copy$default(MaxBetConfigList maxBetConfigList, double d, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = maxBetConfigList.maxStakeAmount;
            }
            if ((i2 & 2) != 0) {
                i = maxBetConfigList.betConfigId;
            }
            return maxBetConfigList.copy(d, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getMaxStakeAmount() {
            return this.maxStakeAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBetConfigId() {
            return this.betConfigId;
        }

        public final MaxBetConfigList copy(double maxStakeAmount, int betConfigId) {
            return new MaxBetConfigList(maxStakeAmount, betConfigId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MaxBetConfigList)) {
                return false;
            }
            MaxBetConfigList maxBetConfigList = (MaxBetConfigList) other;
            return Double.compare(this.maxStakeAmount, maxBetConfigList.maxStakeAmount) == 0 && this.betConfigId == maxBetConfigList.betConfigId;
        }

        public final int getBetConfigId() {
            return this.betConfigId;
        }

        public final double getMaxStakeAmount() {
            return this.maxStakeAmount;
        }

        public int hashCode() {
            return Integer.hashCode(this.betConfigId) + (Double.hashCode(this.maxStakeAmount) * 31);
        }

        public String toString() {
            return "MaxBetConfigList(maxStakeAmount=" + this.maxStakeAmount + ", betConfigId=" + this.betConfigId + ")";
        }
    }

    public DetailResponse(ArrayList<Double> arrayList, ArrayList<MaxBetConfigList> arrayList2, ArrayList<BetConfigList> arrayList3, ArrayList<BetDetails> arrayList4, double d, boolean z, String str, String str2) {
        arrayList.getClass();
        arrayList2.getClass();
        arrayList3.getClass();
        arrayList4.getClass();
        str.getClass();
        str2.getClass();
        this.betChipList = arrayList;
        this.maxBetConfigList = arrayList2;
        this.betConfigList = arrayList3;
        this.betDetails = arrayList4;
        this.minStakeAmount = d;
        this.isNextRoundFreeSpin = z;
        this.wheel1ImageUrl = str;
        this.wheel2ImageUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailResponse copy$default(DetailResponse detailResponse, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, double d, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = detailResponse.betChipList;
        }
        if ((i & 2) != 0) {
            arrayList2 = detailResponse.maxBetConfigList;
        }
        if ((i & 4) != 0) {
            arrayList3 = detailResponse.betConfigList;
        }
        if ((i & 8) != 0) {
            arrayList4 = detailResponse.betDetails;
        }
        if ((i & 16) != 0) {
            d = detailResponse.minStakeAmount;
        }
        if ((i & 32) != 0) {
            z = detailResponse.isNextRoundFreeSpin;
        }
        if ((i & 64) != 0) {
            str = detailResponse.wheel1ImageUrl;
        }
        if ((i & 128) != 0) {
            str2 = detailResponse.wheel2ImageUrl;
        }
        String str3 = str2;
        boolean z2 = z;
        double d2 = d;
        ArrayList arrayList5 = arrayList3;
        ArrayList arrayList6 = arrayList4;
        return detailResponse.copy(arrayList, arrayList2, arrayList5, arrayList6, d2, z2, str, str3);
    }

    public final ArrayList<Double> component1() {
        return this.betChipList;
    }

    public final ArrayList<MaxBetConfigList> component2() {
        return this.maxBetConfigList;
    }

    public final ArrayList<BetConfigList> component3() {
        return this.betConfigList;
    }

    public final ArrayList<BetDetails> component4() {
        return this.betDetails;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMinStakeAmount() {
        return this.minStakeAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsNextRoundFreeSpin() {
        return this.isNextRoundFreeSpin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWheel1ImageUrl() {
        return this.wheel1ImageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWheel2ImageUrl() {
        return this.wheel2ImageUrl;
    }

    public final DetailResponse copy(ArrayList<Double> betChipList, ArrayList<MaxBetConfigList> maxBetConfigList, ArrayList<BetConfigList> betConfigList, ArrayList<BetDetails> betDetails, double minStakeAmount, boolean isNextRoundFreeSpin, String wheel1ImageUrl, String wheel2ImageUrl) {
        betChipList.getClass();
        maxBetConfigList.getClass();
        betConfigList.getClass();
        betDetails.getClass();
        wheel1ImageUrl.getClass();
        wheel2ImageUrl.getClass();
        return new DetailResponse(betChipList, maxBetConfigList, betConfigList, betDetails, minStakeAmount, isNextRoundFreeSpin, wheel1ImageUrl, wheel2ImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailResponse)) {
            return false;
        }
        DetailResponse detailResponse = (DetailResponse) other;
        return Intrinsics.g(this.betChipList, detailResponse.betChipList) && Intrinsics.g(this.maxBetConfigList, detailResponse.maxBetConfigList) && Intrinsics.g(this.betConfigList, detailResponse.betConfigList) && Intrinsics.g(this.betDetails, detailResponse.betDetails) && Double.compare(this.minStakeAmount, detailResponse.minStakeAmount) == 0 && this.isNextRoundFreeSpin == detailResponse.isNextRoundFreeSpin && Intrinsics.g(this.wheel1ImageUrl, detailResponse.wheel1ImageUrl) && Intrinsics.g(this.wheel2ImageUrl, detailResponse.wheel2ImageUrl);
    }

    public final ArrayList<Double> getBetChipList() {
        return this.betChipList;
    }

    public final ArrayList<BetConfigList> getBetConfigList() {
        return this.betConfigList;
    }

    public final ArrayList<BetDetails> getBetDetails() {
        return this.betDetails;
    }

    public final ArrayList<MaxBetConfigList> getMaxBetConfigList() {
        return this.maxBetConfigList;
    }

    public final double getMinStakeAmount() {
        return this.minStakeAmount;
    }

    public final String getWheel1ImageUrl() {
        return this.wheel1ImageUrl;
    }

    public final String getWheel2ImageUrl() {
        return this.wheel2ImageUrl;
    }

    public int hashCode() {
        return this.wheel2ImageUrl.hashCode() + gmf0.a(mtg0.a(nrg0.a(nl.a(this.betDetails, nl.a(this.betConfigList, nl.a(this.maxBetConfigList, this.betChipList.hashCode() * 31, 31), 31), 31), 31, this.minStakeAmount), 31, this.isNextRoundFreeSpin), 31, this.wheel1ImageUrl);
    }

    public final boolean isNextRoundFreeSpin() {
        return this.isNextRoundFreeSpin;
    }

    public String toString() {
        ArrayList<Double> arrayList = this.betChipList;
        ArrayList<MaxBetConfigList> arrayList2 = this.maxBetConfigList;
        ArrayList<BetConfigList> arrayList3 = this.betConfigList;
        ArrayList<BetDetails> arrayList4 = this.betDetails;
        double d = this.minStakeAmount;
        boolean z = this.isNextRoundFreeSpin;
        String str = this.wheel1ImageUrl;
        String str2 = this.wheel2ImageUrl;
        StringBuilder sb = new StringBuilder("DetailResponse(betChipList=");
        sb.append(arrayList);
        sb.append(", maxBetConfigList=");
        sb.append(arrayList2);
        sb.append(", betConfigList=");
        sb.append(arrayList3);
        sb.append(", betDetails=");
        sb.append(arrayList4);
        sb.append(", minStakeAmount=");
        sb.append(d);
        sb.append(", isNextRoundFreeSpin=");
        sb.append(z);
        hxa.c(sb, ", wheel1ImageUrl=", str, ", wheel2ImageUrl=", str2);
        sb.append(")");
        return sb.toString();
    }
}
