package com.sportybet.android.instantwin.newtork.model.request;

import com.appsflyer.internal.a0;
import com.appsflyer.internal.m;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import defpackage.ai50;
import defpackage.dd3;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.kya0;
import defpackage.mtg0;
import defpackage.nrz;
import defpackage.q6a0;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wxa;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0003DEFB}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u0017HÆ\u0003J\u0099\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0014\u0010@\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010B\u001a\u00020\fHÖ\u0081\u0004J\n\u0010C\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( ¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(#¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R%\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R'\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R%\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R%\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R%\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R%\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR%\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R%\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101Ê\u0001\f\bH\u0012\b\bI\u0012\u0004\b\u0003\u0010\u0002¨\u0006G"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;", "", "sportId", "", "roundId", "betType", "selection", "", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Selection;", "bets", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet;", "flexibleFitSize", "", SimulateBetConsts.BetslipType.CUTBET, "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$CutBet;", "bonusType", "supportMultiBetBonus", "", "bonusAmount", "Ljava/math/BigDecimal;", "giftId", "giftKind", "giftAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$CutBet;IZLjava/math/BigDecimal;Ljava/lang/String;IJ)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRoundId", "getBetType", "type", "getSelection", "()Ljava/util/List;", "selections", "getBets", "getFlexibleFitSize", "()I", "getCutbet", "()Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$CutBet;", "getBonusType", "getSupportMultiBetBonus", "()Z", "getBonusAmount", "()Ljava/math/BigDecimal;", "getGiftId", "getGiftKind", "getGiftAmount", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "Selection", "Bet", "CutBet", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TicketParameter {
    public static final int $stable = 0;

    @SerializedName("type")
    private final String betType;

    @SerializedName("bets")
    private final List<Bet> bets;

    @SerializedName("bonusAmount")
    private final BigDecimal bonusAmount;

    @SerializedName("bonusType")
    private final int bonusType;

    @SerializedName(SimulateBetConsts.BetslipType.CUTBET)
    private final CutBet cutbet;

    @SerializedName("flexibleFitSize")
    private final int flexibleFitSize;

    @SerializedName("giftAmount")
    private final long giftAmount;

    @SerializedName("giftId")
    private final String giftId;

    @SerializedName("giftKind")
    private final int giftKind;

    @SerializedName("roundId")
    private final String roundId;

    @SerializedName("selections")
    private final List<Selection> selection;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("supportMultiBetBonus")
    private final boolean supportMultiBetBonus;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\f\rR\"\u0010\u0002\u001a\u00020\u00038'X¦\u0004z\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u00020\t8'X¦\u0004z\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet;", "", "selectedSystems", "", "getSelectedSystems", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "stake", "", "getStake", "()J", "Single", "NonSingle", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet$NonSingle;", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet$Single;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Bet {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet$NonSingle;", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet;", "selectedSystems", "", "stake", "", "<init>", "(IJ)V", "getSelectedSystems", "()I", "getStake", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class NonSingle implements Bet {
            public static final int $stable = 0;
            private final int selectedSystems;
            private final long stake;

            public NonSingle(int i, long j) {
                this.selectedSystems = i;
                this.stake = j;
            }

            public static /* synthetic */ NonSingle copy$default(NonSingle nonSingle, int i, long j, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = nonSingle.selectedSystems;
                }
                if ((i2 & 2) != 0) {
                    j = nonSingle.stake;
                }
                return nonSingle.copy(i, j);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getSelectedSystems() {
                return this.selectedSystems;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final long getStake() {
                return this.stake;
            }

            public final NonSingle copy(int selectedSystems, long stake) {
                return new NonSingle(selectedSystems, stake);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NonSingle)) {
                    return false;
                }
                NonSingle nonSingle = (NonSingle) other;
                return this.selectedSystems == nonSingle.selectedSystems && this.stake == nonSingle.stake;
            }

            @Override // com.sportybet.android.instantwin.newtork.model.request.TicketParameter.Bet
            public int getSelectedSystems() {
                return this.selectedSystems;
            }

            @Override // com.sportybet.android.instantwin.newtork.model.request.TicketParameter.Bet
            public long getStake() {
                return this.stake;
            }

            public int hashCode() {
                return Long.hashCode(this.stake) + (Integer.hashCode(this.selectedSystems) * 31);
            }

            public String toString() {
                StringBuilder sbA = a0.a("NonSingle(selectedSystems=", ", stake=", this.selectedSystems, this.stake);
                sbA.append(")");
                return sbA.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet$Single;", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Bet;", "selectedSystems", "", "stake", "", "selectionIndex", "<init>", "(IJI)V", "getSelectedSystems", "()I", "getStake", "()J", "getSelectionIndex", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Single implements Bet {
            public static final int $stable = 0;
            private final int selectedSystems;

            @SerializedName("selectionIndex")
            private final int selectionIndex;
            private final long stake;

            public Single(int i, long j, int i2) {
                this.selectedSystems = i;
                this.stake = j;
                this.selectionIndex = i2;
            }

            public static /* synthetic */ Single copy$default(Single single, int i, long j, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = single.selectedSystems;
                }
                if ((i3 & 2) != 0) {
                    j = single.stake;
                }
                if ((i3 & 4) != 0) {
                    i2 = single.selectionIndex;
                }
                return single.copy(i, j, i2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getSelectedSystems() {
                return this.selectedSystems;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final long getStake() {
                return this.stake;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getSelectionIndex() {
                return this.selectionIndex;
            }

            public final Single copy(int selectedSystems, long stake, int selectionIndex) {
                return new Single(selectedSystems, stake, selectionIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Single)) {
                    return false;
                }
                Single single = (Single) other;
                return this.selectedSystems == single.selectedSystems && this.stake == single.stake && this.selectionIndex == single.selectionIndex;
            }

            @Override // com.sportybet.android.instantwin.newtork.model.request.TicketParameter.Bet
            public int getSelectedSystems() {
                return this.selectedSystems;
            }

            public final int getSelectionIndex() {
                return this.selectionIndex;
            }

            @Override // com.sportybet.android.instantwin.newtork.model.request.TicketParameter.Bet
            public long getStake() {
                return this.stake;
            }

            public int hashCode() {
                return Integer.hashCode(this.selectionIndex) + f87.a(Integer.hashCode(this.selectedSystems) * 31, this.stake, 31);
            }

            public String toString() {
                int i = this.selectedSystems;
                long j = this.stake;
                int i2 = this.selectionIndex;
                StringBuilder sbA = a0.a("Single(selectedSystems=", ", stake=", i, j);
                sbA.append(", selectionIndex=");
                sbA.append(i2);
                sbA.append(")");
                return sbA.toString();
            }
        }

        @SerializedName("selectedSystems")
        int getSelectedSystems();

        @SerializedName("stake")
        long getStake();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$CutBet;", "", "cutbetWinningAmount", "", "allWinningAmount", "<init>", "(JJ)V", "getCutbetWinningAmount", "()J", "Lcom/google/gson/annotations/SerializedName;", "value", "getAllWinningAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CutBet {
        public static final int $stable = 0;

        @SerializedName("allWinningAmount")
        private final long allWinningAmount;

        @SerializedName("cutbetWinningAmount")
        private final long cutbetWinningAmount;

        public CutBet(long j, long j2) {
            this.cutbetWinningAmount = j;
            this.allWinningAmount = j2;
        }

        public static /* synthetic */ CutBet copy$default(CutBet cutBet, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cutBet.cutbetWinningAmount;
            }
            if ((i & 2) != 0) {
                j2 = cutBet.allWinningAmount;
            }
            return cutBet.copy(j, j2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCutbetWinningAmount() {
            return this.cutbetWinningAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getAllWinningAmount() {
            return this.allWinningAmount;
        }

        public final CutBet copy(long cutbetWinningAmount, long allWinningAmount) {
            return new CutBet(cutbetWinningAmount, allWinningAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CutBet)) {
                return false;
            }
            CutBet cutBet = (CutBet) other;
            return this.cutbetWinningAmount == cutBet.cutbetWinningAmount && this.allWinningAmount == cutBet.allWinningAmount;
        }

        public final long getAllWinningAmount() {
            return this.allWinningAmount;
        }

        public final long getCutbetWinningAmount() {
            return this.cutbetWinningAmount;
        }

        public int hashCode() {
            return Long.hashCode(this.allWinningAmount) + (Long.hashCode(this.cutbetWinningAmount) * 31);
        }

        public String toString() {
            return nrz.a(this.allWinningAmount, ")", q6a0.a(this.cutbetWinningAmount, "CutBet(cutbetWinningAmount=", ", allWinningAmount="));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter$Selection;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketId", "getOutcomeId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Selection {
        public static final int $stable = 0;

        @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
        private final String eventId;

        @SerializedName("marketId")
        private final String marketId;

        @SerializedName("outcomeId")
        private final String outcomeId;

        public Selection(String str, String str2, String str3) {
            m.a(str, str2, str3);
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
            eventId.getClass();
            marketId.getClass();
            outcomeId.getClass();
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
            return this.outcomeId.hashCode() + gmf0.a(this.eventId.hashCode() * 31, 31, this.marketId);
        }

        public String toString() {
            String str = this.eventId;
            String str2 = this.marketId;
            return uf80.a(ux5.a("Selection(eventId=", str, ", marketId=", str2, ", outcomeId="), this.outcomeId, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TicketParameter(String str, String str2, String str3, List<Selection> list, List<? extends Bet> list2, int i, CutBet cutBet, int i2, boolean z, BigDecimal bigDecimal, String str4, int i3, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        bigDecimal.getClass();
        str4.getClass();
        this.sportId = str;
        this.roundId = str2;
        this.betType = str3;
        this.selection = list;
        this.bets = list2;
        this.flexibleFitSize = i;
        this.cutbet = cutBet;
        this.bonusType = i2;
        this.supportMultiBetBonus = z;
        this.bonusAmount = bigDecimal;
        this.giftId = str4;
        this.giftKind = i3;
        this.giftAmount = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getBonusAmount() {
        return this.bonusAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    public final List<Selection> component4() {
        return this.selection;
    }

    public final List<Bet> component5() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CutBet getCutbet() {
        return this.cutbet;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBonusType() {
        return this.bonusType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSupportMultiBetBonus() {
        return this.supportMultiBetBonus;
    }

    public final TicketParameter copy(String sportId, String roundId, String betType, List<Selection> selection, List<? extends Bet> bets, int flexibleFitSize, CutBet cutbet, int bonusType, boolean supportMultiBetBonus, BigDecimal bonusAmount, String giftId, int giftKind, long giftAmount) {
        sportId.getClass();
        roundId.getClass();
        betType.getClass();
        selection.getClass();
        bets.getClass();
        bonusAmount.getClass();
        giftId.getClass();
        return new TicketParameter(sportId, roundId, betType, selection, bets, flexibleFitSize, cutbet, bonusType, supportMultiBetBonus, bonusAmount, giftId, giftKind, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketParameter)) {
            return false;
        }
        TicketParameter ticketParameter = (TicketParameter) other;
        return Intrinsics.g(this.sportId, ticketParameter.sportId) && Intrinsics.g(this.roundId, ticketParameter.roundId) && Intrinsics.g(this.betType, ticketParameter.betType) && Intrinsics.g(this.selection, ticketParameter.selection) && Intrinsics.g(this.bets, ticketParameter.bets) && this.flexibleFitSize == ticketParameter.flexibleFitSize && Intrinsics.g(this.cutbet, ticketParameter.cutbet) && this.bonusType == ticketParameter.bonusType && this.supportMultiBetBonus == ticketParameter.supportMultiBetBonus && Intrinsics.g(this.bonusAmount, ticketParameter.bonusAmount) && Intrinsics.g(this.giftId, ticketParameter.giftId) && this.giftKind == ticketParameter.giftKind && this.giftAmount == ticketParameter.giftAmount;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final List<Bet> getBets() {
        return this.bets;
    }

    public final BigDecimal getBonusAmount() {
        return this.bonusAmount;
    }

    public final int getBonusType() {
        return this.bonusType;
    }

    public final CutBet getCutbet() {
        return this.cutbet;
    }

    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
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

    public final List<Selection> getSelection() {
        return this.selection;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final boolean getSupportMultiBetBonus() {
        return this.supportMultiBetBonus;
    }

    public int hashCode() {
        int iA = gpp.a(this.flexibleFitSize, ai50.a(ai50.a(gmf0.a(gmf0.a(this.sportId.hashCode() * 31, 31, this.roundId), 31, this.betType), 31, this.selection), 31, this.bets), 31);
        CutBet cutBet = this.cutbet;
        return Long.hashCode(this.giftAmount) + gpp.a(this.giftKind, gmf0.a(dd3.a(this.bonusAmount, mtg0.a(gpp.a(this.bonusType, (iA + (cutBet == null ? 0 : cutBet.hashCode())) * 31, 31), 31, this.supportMultiBetBonus), 31), 31, this.giftId), 31);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.roundId;
        String str3 = this.betType;
        List<Selection> list = this.selection;
        List<Bet> list2 = this.bets;
        int i = this.flexibleFitSize;
        CutBet cutBet = this.cutbet;
        int i2 = this.bonusType;
        boolean z = this.supportMultiBetBonus;
        BigDecimal bigDecimal = this.bonusAmount;
        String str4 = this.giftId;
        int i3 = this.giftKind;
        long j = this.giftAmount;
        StringBuilder sbA = ux5.a("TicketParameter(sportId=", str, ", roundId=", str2, ", betType=");
        kya0.b(str3, ", selection=", ", bets=", sbA, list);
        sbA.append(list2);
        sbA.append(lTGEJfVytU.oxfvS);
        sbA.append(i);
        sbA.append(", cutbet=");
        sbA.append(cutBet);
        sbA.append(", bonusType=");
        sbA.append(i2);
        sbA.append(", supportMultiBetBonus=");
        sbA.append(z);
        sbA.append(", bonusAmount=");
        sbA.append(bigDecimal);
        sbA.append(", giftId=");
        wxa.b(i3, str4, ", giftKind=", ", giftAmount=", sbA);
        return nrz.a(j, ")", sbA);
    }
}
