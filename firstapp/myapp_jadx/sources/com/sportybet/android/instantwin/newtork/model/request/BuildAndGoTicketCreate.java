package com.sportybet.android.instantwin.newtork.model.request;

import com.appsflyer.internal.v;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.kya0;
import defpackage.nrz;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0002:;B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J\u0098\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0014\u00106\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\fHÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(Ê\u0001\f\b=\u0012\b\b>\u0012\u0004\b\u0003\u0010\u0002¨\u0006<"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate;", "", "sportId", "", "roundId", "type", "selections", "", "Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate$Selection;", "bets", "Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate$Bet;", "bonusType", "", "supportMultiBetBonus", "", "bonusAmount", "giftId", "giftKind", "giftAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;IJ)V", "getSportId", "()Ljava/lang/String;", "getRoundId", "getType", "getSelections", "()Ljava/util/List;", "getBets", "getBonusType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSupportMultiBetBonus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBonusAmount", "getGiftId", "getGiftKind", "()I", "getGiftAmount", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;IJ)Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate;", "equals", "other", "hashCode", "toString", "Selection", "Bet", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BuildAndGoTicketCreate {
    public static final int $stable = 0;
    private final List<Bet> bets;
    private final Integer bonusAmount;
    private final Integer bonusType;
    private final long giftAmount;
    private final String giftId;
    private final int giftKind;
    private final String roundId;
    private final List<Selection> selections;
    private final String sportId;
    private final Boolean supportMultiBetBonus;
    private final String type;

    public /* synthetic */ BuildAndGoTicketCreate(String str, String str2, String str3, List list, List list2, Integer num, Boolean bool, Integer num2, String str4, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "sr:sport:1-1" : str, str2, (i2 & 4) != 0 ? SimulateBetConsts.BetslipType.SINGLE : str3, list, list2, (i2 & 32) != 0 ? 0 : num, (i2 & 64) != 0 ? Boolean.FALSE : bool, (i2 & 128) != 0 ? 0 : num2, str4, i, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildAndGoTicketCreate copy$default(BuildAndGoTicketCreate buildAndGoTicketCreate, String str, String str2, String str3, List list, List list2, Integer num, Boolean bool, Integer num2, String str4, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buildAndGoTicketCreate.sportId;
        }
        if ((i2 & 2) != 0) {
            str2 = buildAndGoTicketCreate.roundId;
        }
        if ((i2 & 4) != 0) {
            str3 = buildAndGoTicketCreate.type;
        }
        if ((i2 & 8) != 0) {
            list = buildAndGoTicketCreate.selections;
        }
        if ((i2 & 16) != 0) {
            list2 = buildAndGoTicketCreate.bets;
        }
        if ((i2 & 32) != 0) {
            num = buildAndGoTicketCreate.bonusType;
        }
        if ((i2 & 64) != 0) {
            bool = buildAndGoTicketCreate.supportMultiBetBonus;
        }
        if ((i2 & 128) != 0) {
            num2 = buildAndGoTicketCreate.bonusAmount;
        }
        if ((i2 & 256) != 0) {
            str4 = buildAndGoTicketCreate.giftId;
        }
        if ((i2 & 512) != 0) {
            i = buildAndGoTicketCreate.giftKind;
        }
        if ((i2 & 1024) != 0) {
            j = buildAndGoTicketCreate.giftAmount;
        }
        long j2 = j;
        String str5 = str4;
        int i3 = i;
        Boolean bool2 = bool;
        Integer num3 = num2;
        List list3 = list2;
        Integer num4 = num;
        return buildAndGoTicketCreate.copy(str, str2, str3, list, list3, num4, bool2, num3, str5, i3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<Selection> component4() {
        return this.selections;
    }

    public final List<Bet> component5() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getBonusType() {
        return this.bonusType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getSupportMultiBetBonus() {
        return this.supportMultiBetBonus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getBonusAmount() {
        return this.bonusAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    public final BuildAndGoTicketCreate copy(String sportId, String roundId, String type, List<Selection> selections, List<Bet> bets, Integer bonusType, Boolean supportMultiBetBonus, Integer bonusAmount, String giftId, int giftKind, long giftAmount) {
        giftId.getClass();
        return new BuildAndGoTicketCreate(sportId, roundId, type, selections, bets, bonusType, supportMultiBetBonus, bonusAmount, giftId, giftKind, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildAndGoTicketCreate)) {
            return false;
        }
        BuildAndGoTicketCreate buildAndGoTicketCreate = (BuildAndGoTicketCreate) other;
        return Intrinsics.g(this.sportId, buildAndGoTicketCreate.sportId) && Intrinsics.g(this.roundId, buildAndGoTicketCreate.roundId) && Intrinsics.g(this.type, buildAndGoTicketCreate.type) && Intrinsics.g(this.selections, buildAndGoTicketCreate.selections) && Intrinsics.g(this.bets, buildAndGoTicketCreate.bets) && Intrinsics.g(this.bonusType, buildAndGoTicketCreate.bonusType) && Intrinsics.g(this.supportMultiBetBonus, buildAndGoTicketCreate.supportMultiBetBonus) && Intrinsics.g(this.bonusAmount, buildAndGoTicketCreate.bonusAmount) && Intrinsics.g(this.giftId, buildAndGoTicketCreate.giftId) && this.giftKind == buildAndGoTicketCreate.giftKind && this.giftAmount == buildAndGoTicketCreate.giftAmount;
    }

    public final List<Bet> getBets() {
        return this.bets;
    }

    public final Integer getBonusAmount() {
        return this.bonusAmount;
    }

    public final Integer getBonusType() {
        return this.bonusType;
    }

    public final long getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final int getGiftKind() {
        return this.giftKind;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final List<Selection> getSelections() {
        return this.selections;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Boolean getSupportMultiBetBonus() {
        return this.supportMultiBetBonus;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.sportId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roundId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Selection> list = this.selections;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Bet> list2 = this.bets;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.bonusType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.supportMultiBetBonus;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.bonusAmount;
        return Long.hashCode(this.giftAmount) + gpp.a(this.giftKind, gmf0.a((iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.giftId), 31);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.roundId;
        String str3 = this.type;
        List<Selection> list = this.selections;
        List<Bet> list2 = this.bets;
        Integer num = this.bonusType;
        Boolean bool = this.supportMultiBetBonus;
        Integer num2 = this.bonusAmount;
        String str4 = this.giftId;
        int i = this.giftKind;
        long j = this.giftAmount;
        StringBuilder sbA = ux5.a("BuildAndGoTicketCreate(sportId=", str, ", roundId=", str2, ", type=");
        kya0.b(str3, ", selections=", ", bets=", sbA, list);
        sbA.append(list2);
        sbA.append(", bonusType=");
        sbA.append(num);
        sbA.append(", supportMultiBetBonus=");
        sbA.append(bool);
        sbA.append(", bonusAmount=");
        sbA.append(num2);
        sbA.append(", giftId=");
        wxa.b(i, str4, ", giftKind=", ", giftAmount=", sbA);
        return nrz.a(j, ")", sbA);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate$Selection;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getMarketId", "getOutcomeId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Selection {
        public static final int $stable = 0;
        private final String eventId;
        private final String marketId;
        private final String outcomeId;

        public Selection(String str, String str2, String str3) {
            this.eventId = str;
            this.marketId = str2;
            this.outcomeId = str3;
        }

        public static /* synthetic */ Selection copy$default(Selection selection, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selection.eventId;
            }
            if ((i & 2) != 0) {
                str2 = selection.marketId;
            }
            if ((i & 4) != 0) {
                str3 = selection.outcomeId;
            }
            return selection.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMarketId() {
            return this.marketId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOutcomeId() {
            return this.outcomeId;
        }

        public final Selection copy(String eventId, String marketId, String outcomeId) {
            return new Selection(eventId, marketId, outcomeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) other;
            return Intrinsics.g(this.eventId, selection.eventId) && Intrinsics.g(this.marketId, selection.marketId) && Intrinsics.g(this.outcomeId, selection.outcomeId);
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final String getMarketId() {
            return this.marketId;
        }

        public final String getOutcomeId() {
            return this.outcomeId;
        }

        public int hashCode() {
            String str = this.eventId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.marketId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.outcomeId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.eventId;
            String str2 = this.marketId;
            return uf80.a(ux5.a("Selection(eventId=", str, ", marketId=", str2, ", outcomeId="), this.outcomeId, ")");
        }

        public /* synthetic */ Selection(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "special-bb" : str2, str3);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\nÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate$Bet;", "", "selectedSystems", "", "stake", "", "selectionIndex", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V", "getSelectedSystems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStake", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSelectionIndex", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate$Bet;", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Bet {
        public static final int $stable = 0;
        private final Integer selectedSystems;
        private final Integer selectionIndex;
        private final Long stake;

        public /* synthetic */ Bet(Integer num, Long l, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 1 : num, l, (i & 4) != 0 ? 0 : num2);
        }

        public static /* synthetic */ Bet copy$default(Bet bet, Integer num, Long l, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = bet.selectedSystems;
            }
            if ((i & 2) != 0) {
                l = bet.stake;
            }
            if ((i & 4) != 0) {
                num2 = bet.selectionIndex;
            }
            return bet.copy(num, l, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getSelectedSystems() {
            return this.selectedSystems;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getStake() {
            return this.stake;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getSelectionIndex() {
            return this.selectionIndex;
        }

        public final Bet copy(Integer selectedSystems, Long stake, Integer selectionIndex) {
            return new Bet(selectedSystems, stake, selectionIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bet)) {
                return false;
            }
            Bet bet = (Bet) other;
            return Intrinsics.g(this.selectedSystems, bet.selectedSystems) && Intrinsics.g(this.stake, bet.stake) && Intrinsics.g(this.selectionIndex, bet.selectionIndex);
        }

        public final Integer getSelectedSystems() {
            return this.selectedSystems;
        }

        public final Integer getSelectionIndex() {
            return this.selectionIndex;
        }

        public final Long getStake() {
            return this.stake;
        }

        public int hashCode() {
            Integer num = this.selectedSystems;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l = this.stake;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Integer num2 = this.selectionIndex;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.selectedSystems;
            Long l = this.stake;
            Integer num2 = this.selectionIndex;
            StringBuilder sb = new StringBuilder("Bet(selectedSystems=");
            sb.append(num);
            sb.append(", stake=");
            sb.append(l);
            sb.append(", selectionIndex=");
            return v.a(sb, num2, ")");
        }

        public Bet(Integer num, Long l, Integer num2) {
            this.selectedSystems = num;
            this.stake = l;
            this.selectionIndex = num2;
        }
    }

    public BuildAndGoTicketCreate(String str, String str2, String str3, List<Selection> list, List<Bet> list2, Integer num, Boolean bool, Integer num2, String str4, int i, long j) {
        str4.getClass();
        this.sportId = str;
        this.roundId = str2;
        this.type = str3;
        this.selections = list;
        this.bets = list2;
        this.bonusType = num;
        this.supportMultiBetBonus = bool;
        this.bonusAmount = num2;
        this.giftId = str4;
        this.giftKind = i;
        this.giftAmount = j;
    }
}
