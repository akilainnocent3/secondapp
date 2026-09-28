package com.sportygames.spinmatch.model.response;

import com.appsflyer.internal.m;
import com.appsflyer.internal.w;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.lsv;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.u8;
import defpackage.uqe0;
import defpackage.ux5;
import defpackage.wxa;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002XYB·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\t\u0010G\u001a\u00020\rHÆ\u0003J\t\u0010H\u001a\u00020\rHÆ\u0003J\t\u0010I\u001a\u00020\rHÆ\u0003J\u001d\u0010J\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010L\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010O\u001a\u00020\u001aHÆ\u0003J\t\u0010P\u001a\u00020\u001aHÆ\u0003Jà\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\u001a2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0005HÖ\u0001J\t\u0010W\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010'\u001a\u0004\b)\u0010&R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010$\u001a\u0004\b8\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010=R\u001a\u0010\u001b\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010=\"\u0004\b>\u0010?¨\u0006Z"}, d2 = {"Lcom/sportygames/spinmatch/model/response/BetHistoryItem;", "Lcom/sportygames/commons/models/BetHistoryBase;", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "", "stakeAmount", "", "giftAmount", "payoutAmount", "actualDebitedAmount", "actualCreditedAmount", "wheel1Draw", "Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;", "wheel2Draw", AnalyticsParam.EVENT_PARAM_RESULT, "individualBetDetails", "Ljava/util/ArrayList;", "Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails;", "Lkotlin/collections/ArrayList;", "ticketId", "countryCode", "", "currency", "createdAt", "isFreeSpinRound", "", "isExpanded", "<init>", "(JLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()J", "setId", "(J)V", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftAmount", "getPayoutAmount", "getActualDebitedAmount", "getActualCreditedAmount", "getWheel1Draw", "()Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;", "setWheel1Draw", "(Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;)V", "getWheel2Draw", "setWheel2Draw", "getResult", "setResult", "getIndividualBetDetails", "()Ljava/util/ArrayList;", "setIndividualBetDetails", "(Ljava/util/ArrayList;)V", "getTicketId", "getCountryCode", "()Ljava/lang/String;", "getCurrency", "getCreatedAt", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(JLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/sportygames/spinmatch/model/response/BetHistoryItem;", "equals", "other", "", "hashCode", "toString", "Wheel1Draw", "IndividualBetDetails", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements BetHistoryBase {
    public static final int $stable = 8;
    private final Double actualCreditedAmount;
    private final Double actualDebitedAmount;
    private final String countryCode;
    private final String createdAt;
    private final String currency;
    private final Double giftAmount;
    private long id;
    private ArrayList<IndividualBetDetails> individualBetDetails;
    private boolean isExpanded;
    private final boolean isFreeSpinRound;
    private final Double payoutAmount;
    private Wheel1Draw result;
    private final Double stakeAmount;
    private final Integer ticketId;
    private final Integer userId;
    private Wheel1Draw wheel1Draw;
    private Wheel1Draw wheel2Draw;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006)"}, d2 = {"Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails;", "", AnalyticsParam.EVENT_PARAM_ID, "", "roundId", "", "betConfig", "Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails$BetConfig;", "stakeAmount", "", "payoutAmount", "winStatus", "<init>", "(ILjava/lang/String;Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails$BetConfig;DLjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getRoundId", "()Ljava/lang/String;", "getBetConfig", "()Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails$BetConfig;", "setBetConfig", "(Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails$BetConfig;)V", "getStakeAmount", "()D", "setStakeAmount", "(D)V", "getPayoutAmount", "getWinStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "BetConfig", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndividualBetDetails {
        public static final int $stable = 8;
        private BetConfig betConfig;
        private final int id;
        private final String payoutAmount;
        private final String roundId;
        private double stakeAmount;
        private final String winStatus;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001d¨\u0006,"}, d2 = {"Lcom/sportygames/spinmatch/model/response/BetHistoryItem$IndividualBetDetails$BetConfig;", "", AnalyticsParam.EVENT_PARAM_ID, "", "payout", "", "colour", "", "colourCode", "payoutDescription", "orderedPosition", "onWheel", "", "isFreeSpin", "isActive", "<init>", "(IDLjava/lang/String;ILjava/lang/String;IZZZ)V", "getId", "()I", "getPayout", "()D", "getColour", "()Ljava/lang/String;", "getColourCode", "setColourCode", "(I)V", "getPayoutDescription", "getOrderedPosition", "getOnWheel", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BetConfig {
            public static final int $stable = 8;
            private final String colour;
            private int colourCode;
            private final int id;
            private final boolean isActive;
            private final boolean isFreeSpin;
            private final boolean onWheel;
            private final int orderedPosition;
            private final double payout;
            private final String payoutDescription;

            public BetConfig(int i, double d, String str, int i2, String str2, int i3, boolean z, boolean z2, boolean z3) {
                str.getClass();
                str2.getClass();
                this.id = i;
                this.payout = d;
                this.colour = str;
                this.colourCode = i2;
                this.payoutDescription = str2;
                this.orderedPosition = i3;
                this.onWheel = z;
                this.isFreeSpin = z2;
                this.isActive = z3;
            }

            public static /* synthetic */ BetConfig copy$default(BetConfig betConfig, int i, double d, String str, int i2, String str2, int i3, boolean z, boolean z2, boolean z3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = betConfig.id;
                }
                if ((i4 & 2) != 0) {
                    d = betConfig.payout;
                }
                if ((i4 & 4) != 0) {
                    str = betConfig.colour;
                }
                if ((i4 & 8) != 0) {
                    i2 = betConfig.colourCode;
                }
                if ((i4 & 16) != 0) {
                    str2 = betConfig.payoutDescription;
                }
                if ((i4 & 32) != 0) {
                    i3 = betConfig.orderedPosition;
                }
                if ((i4 & 64) != 0) {
                    z = betConfig.onWheel;
                }
                if ((i4 & 128) != 0) {
                    z2 = betConfig.isFreeSpin;
                }
                if ((i4 & 256) != 0) {
                    z3 = betConfig.isActive;
                }
                boolean z4 = z2;
                boolean z5 = z3;
                boolean z6 = z;
                String str3 = str2;
                String str4 = str;
                return betConfig.copy(i, d, str4, i2, str3, i3, z6, z4, z5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final double getPayout() {
                return this.payout;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getColour() {
                return this.colour;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final int getColourCode() {
                return this.colourCode;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getPayoutDescription() {
                return this.payoutDescription;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final int getOrderedPosition() {
                return this.orderedPosition;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final boolean getOnWheel() {
                return this.onWheel;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final boolean getIsFreeSpin() {
                return this.isFreeSpin;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final boolean getIsActive() {
                return this.isActive;
            }

            public final BetConfig copy(int id, double payout, String colour, int colourCode, String payoutDescription, int orderedPosition, boolean onWheel, boolean isFreeSpin, boolean isActive) {
                colour.getClass();
                payoutDescription.getClass();
                return new BetConfig(id, payout, colour, colourCode, payoutDescription, orderedPosition, onWheel, isFreeSpin, isActive);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BetConfig)) {
                    return false;
                }
                BetConfig betConfig = (BetConfig) other;
                return this.id == betConfig.id && Double.compare(this.payout, betConfig.payout) == 0 && Intrinsics.g(this.colour, betConfig.colour) && this.colourCode == betConfig.colourCode && Intrinsics.g(this.payoutDescription, betConfig.payoutDescription) && this.orderedPosition == betConfig.orderedPosition && this.onWheel == betConfig.onWheel && this.isFreeSpin == betConfig.isFreeSpin && this.isActive == betConfig.isActive;
            }

            public final String getColour() {
                return this.colour;
            }

            public final int getColourCode() {
                return this.colourCode;
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

            public int hashCode() {
                return Boolean.hashCode(this.isActive) + mtg0.a(mtg0.a(gpp.a(this.orderedPosition, gmf0.a(gpp.a(this.colourCode, gmf0.a(nrg0.a(Integer.hashCode(this.id) * 31, 31, this.payout), 31, this.colour), 31), 31, this.payoutDescription), 31), 31, this.onWheel), 31, this.isFreeSpin);
            }

            public final boolean isActive() {
                return this.isActive;
            }

            public final boolean isFreeSpin() {
                return this.isFreeSpin;
            }

            public final void setColourCode(int i) {
                this.colourCode = i;
            }

            public String toString() {
                int i = this.id;
                double d = this.payout;
                String str = this.colour;
                int i2 = this.colourCode;
                String str2 = this.payoutDescription;
                int i3 = this.orderedPosition;
                boolean z = this.onWheel;
                boolean z2 = this.isFreeSpin;
                boolean z3 = this.isActive;
                StringBuilder sb = new StringBuilder("BetConfig(id=");
                sb.append(i);
                sb.append(", payout=");
                sb.append(d);
                sb.append(", colour=");
                sb.append(str);
                sb.append(", colourCode=");
                sb.append(i2);
                sb.append(", payoutDescription=");
                sb.append(str2);
                sb.append(", orderedPosition=");
                sb.append(i3);
                u8.a(", onWheel=", ", isFreeSpin=", sb, z, z2);
                return w.a(sb, ", isActive=", z3, ")");
            }
        }

        public IndividualBetDetails(int i, String str, BetConfig betConfig, double d, String str2, String str3) {
            str.getClass();
            betConfig.getClass();
            str2.getClass();
            str3.getClass();
            this.id = i;
            this.roundId = str;
            this.betConfig = betConfig;
            this.stakeAmount = d;
            this.payoutAmount = str2;
            this.winStatus = str3;
        }

        public static /* synthetic */ IndividualBetDetails copy$default(IndividualBetDetails individualBetDetails, int i, String str, BetConfig betConfig, double d, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = individualBetDetails.id;
            }
            if ((i2 & 2) != 0) {
                str = individualBetDetails.roundId;
            }
            if ((i2 & 4) != 0) {
                betConfig = individualBetDetails.betConfig;
            }
            if ((i2 & 8) != 0) {
                d = individualBetDetails.stakeAmount;
            }
            if ((i2 & 16) != 0) {
                str2 = individualBetDetails.payoutAmount;
            }
            if ((i2 & 32) != 0) {
                str3 = individualBetDetails.winStatus;
            }
            double d2 = d;
            BetConfig betConfig2 = betConfig;
            return individualBetDetails.copy(i, str, betConfig2, d2, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRoundId() {
            return this.roundId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BetConfig getBetConfig() {
            return this.betConfig;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final double getStakeAmount() {
            return this.stakeAmount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPayoutAmount() {
            return this.payoutAmount;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getWinStatus() {
            return this.winStatus;
        }

        public final IndividualBetDetails copy(int id, String roundId, BetConfig betConfig, double stakeAmount, String payoutAmount, String winStatus) {
            roundId.getClass();
            betConfig.getClass();
            payoutAmount.getClass();
            winStatus.getClass();
            return new IndividualBetDetails(id, roundId, betConfig, stakeAmount, payoutAmount, winStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndividualBetDetails)) {
                return false;
            }
            IndividualBetDetails individualBetDetails = (IndividualBetDetails) other;
            return this.id == individualBetDetails.id && Intrinsics.g(this.roundId, individualBetDetails.roundId) && Intrinsics.g(this.betConfig, individualBetDetails.betConfig) && Double.compare(this.stakeAmount, individualBetDetails.stakeAmount) == 0 && Intrinsics.g(this.payoutAmount, individualBetDetails.payoutAmount) && Intrinsics.g(this.winStatus, individualBetDetails.winStatus);
        }

        public final BetConfig getBetConfig() {
            return this.betConfig;
        }

        public final int getId() {
            return this.id;
        }

        public final String getPayoutAmount() {
            return this.payoutAmount;
        }

        public final String getRoundId() {
            return this.roundId;
        }

        public final double getStakeAmount() {
            return this.stakeAmount;
        }

        public final String getWinStatus() {
            return this.winStatus;
        }

        public int hashCode() {
            return this.winStatus.hashCode() + gmf0.a(nrg0.a((this.betConfig.hashCode() + gmf0.a(Integer.hashCode(this.id) * 31, 31, this.roundId)) * 31, 31, this.stakeAmount), 31, this.payoutAmount);
        }

        public final void setBetConfig(BetConfig betConfig) {
            betConfig.getClass();
            this.betConfig = betConfig;
        }

        public final void setStakeAmount(double d) {
            this.stakeAmount = d;
        }

        public String toString() {
            int i = this.id;
            String str = this.roundId;
            BetConfig betConfig = this.betConfig;
            double d = this.stakeAmount;
            String str2 = this.payoutAmount;
            String str3 = this.winStatus;
            StringBuilder sbA = uqe0.a(i, "IndividualBetDetails(id=", ", roundId=", str, ", betConfig=");
            sbA.append(betConfig);
            sbA.append(", stakeAmount=");
            sbA.append(d);
            hxa.c(sbA, ", payoutAmount=", str2, ", winStatus=", str3);
            sbA.append(")");
            return sbA.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/sportygames/spinmatch/model/response/BetHistoryItem$Wheel1Draw;", "", "payout", "", "colour", "payoutDescription", "colourCode", "", "isFreeSpin", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getPayout", "()Ljava/lang/String;", "getColour", "getPayoutDescription", "getColourCode", "()I", "setColourCode", "(I)V", "()Z", "setFreeSpin", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wheel1Draw {
        public static final int $stable = 8;
        private final String colour;
        private int colourCode;
        private boolean isFreeSpin;
        private final String payout;
        private final String payoutDescription;

        public Wheel1Draw(String str, String str2, String str3, int i, boolean z) {
            m.a(str, str2, str3);
            this.payout = str;
            this.colour = str2;
            this.payoutDescription = str3;
            this.colourCode = i;
            this.isFreeSpin = z;
        }

        public static /* synthetic */ Wheel1Draw copy$default(Wheel1Draw wheel1Draw, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = wheel1Draw.payout;
            }
            if ((i2 & 2) != 0) {
                str2 = wheel1Draw.colour;
            }
            if ((i2 & 4) != 0) {
                str3 = wheel1Draw.payoutDescription;
            }
            if ((i2 & 8) != 0) {
                i = wheel1Draw.colourCode;
            }
            if ((i2 & 16) != 0) {
                z = wheel1Draw.isFreeSpin;
            }
            boolean z2 = z;
            String str4 = str3;
            return wheel1Draw.copy(str, str2, str4, i, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayout() {
            return this.payout;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getColour() {
            return this.colour;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPayoutDescription() {
            return this.payoutDescription;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getColourCode() {
            return this.colourCode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsFreeSpin() {
            return this.isFreeSpin;
        }

        public final Wheel1Draw copy(String payout, String colour, String payoutDescription, int colourCode, boolean isFreeSpin) {
            payout.getClass();
            colour.getClass();
            payoutDescription.getClass();
            return new Wheel1Draw(payout, colour, payoutDescription, colourCode, isFreeSpin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wheel1Draw)) {
                return false;
            }
            Wheel1Draw wheel1Draw = (Wheel1Draw) other;
            return Intrinsics.g(this.payout, wheel1Draw.payout) && Intrinsics.g(this.colour, wheel1Draw.colour) && Intrinsics.g(this.payoutDescription, wheel1Draw.payoutDescription) && this.colourCode == wheel1Draw.colourCode && this.isFreeSpin == wheel1Draw.isFreeSpin;
        }

        public final String getColour() {
            return this.colour;
        }

        public final int getColourCode() {
            return this.colourCode;
        }

        public final String getPayout() {
            return this.payout;
        }

        public final String getPayoutDescription() {
            return this.payoutDescription;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFreeSpin) + gpp.a(this.colourCode, gmf0.a(gmf0.a(this.payout.hashCode() * 31, 31, this.colour), 31, this.payoutDescription), 31);
        }

        public final boolean isFreeSpin() {
            return this.isFreeSpin;
        }

        public final void setColourCode(int i) {
            this.colourCode = i;
        }

        public final void setFreeSpin(boolean z) {
            this.isFreeSpin = z;
        }

        public String toString() {
            String str = this.payout;
            String str2 = this.colour;
            String str3 = this.payoutDescription;
            int i = this.colourCode;
            boolean z = this.isFreeSpin;
            StringBuilder sbA = ux5.a("Wheel1Draw(payout=", str, ", colour=", str2, ", payoutDescription=");
            wxa.b(i, str3, ", colourCode=", ", isFreeSpin=", sbA);
            return mq0.a(sbA, z, ")");
        }
    }

    public BetHistoryItem(long j, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Wheel1Draw wheel1Draw, Wheel1Draw wheel1Draw2, Wheel1Draw wheel1Draw3, ArrayList<IndividualBetDetails> arrayList, Integer num2, String str, String str2, String str3, boolean z, boolean z2) {
        wheel1Draw.getClass();
        wheel1Draw2.getClass();
        wheel1Draw3.getClass();
        this.id = j;
        this.userId = num;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.payoutAmount = d3;
        this.actualDebitedAmount = d4;
        this.actualCreditedAmount = d5;
        this.wheel1Draw = wheel1Draw;
        this.wheel2Draw = wheel1Draw2;
        this.result = wheel1Draw3;
        this.individualBetDetails = arrayList;
        this.ticketId = num2;
        this.countryCode = str;
        this.currency = str2;
        this.createdAt = str3;
        this.isFreeSpinRound = z;
        this.isExpanded = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetHistoryItem copy$default(BetHistoryItem betHistoryItem, long j, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Wheel1Draw wheel1Draw, Wheel1Draw wheel1Draw2, Wheel1Draw wheel1Draw3, ArrayList arrayList, Integer num2, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        long j2 = (i & 1) != 0 ? betHistoryItem.id : j;
        Integer num3 = (i & 2) != 0 ? betHistoryItem.userId : num;
        Double d6 = (i & 4) != 0 ? betHistoryItem.stakeAmount : d;
        Double d7 = (i & 8) != 0 ? betHistoryItem.giftAmount : d2;
        Double d8 = (i & 16) != 0 ? betHistoryItem.payoutAmount : d3;
        Double d9 = (i & 32) != 0 ? betHistoryItem.actualDebitedAmount : d4;
        Double d10 = (i & 64) != 0 ? betHistoryItem.actualCreditedAmount : d5;
        Wheel1Draw wheel1Draw4 = (i & 128) != 0 ? betHistoryItem.wheel1Draw : wheel1Draw;
        Wheel1Draw wheel1Draw5 = (i & 256) != 0 ? betHistoryItem.wheel2Draw : wheel1Draw2;
        Wheel1Draw wheel1Draw6 = (i & 512) != 0 ? betHistoryItem.result : wheel1Draw3;
        ArrayList arrayList2 = (i & 1024) != 0 ? betHistoryItem.individualBetDetails : arrayList;
        Integer num4 = (i & 2048) != 0 ? betHistoryItem.ticketId : num2;
        String str4 = (i & 4096) != 0 ? betHistoryItem.countryCode : str;
        long j3 = j2;
        String str5 = (i & 8192) != 0 ? betHistoryItem.currency : str2;
        String str6 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryItem.createdAt : str3;
        boolean z5 = (i & 32768) != 0 ? betHistoryItem.isFreeSpinRound : z;
        if ((i & 65536) != 0) {
            z4 = z5;
            z3 = betHistoryItem.isExpanded;
        } else {
            z3 = z2;
            z4 = z5;
        }
        return betHistoryItem.copy(j3, num3, d6, d7, d8, d9, d10, wheel1Draw4, wheel1Draw5, wheel1Draw6, arrayList2, num4, str4, str5, str6, z4, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Wheel1Draw getResult() {
        return this.result;
    }

    public final ArrayList<IndividualBetDetails> component11() {
        return this.individualBetDetails;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsFreeSpinRound() {
        return this.isFreeSpinRound;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Wheel1Draw getWheel1Draw() {
        return this.wheel1Draw;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Wheel1Draw getWheel2Draw() {
        return this.wheel2Draw;
    }

    public final BetHistoryItem copy(long id, Integer userId, Double stakeAmount, Double giftAmount, Double payoutAmount, Double actualDebitedAmount, Double actualCreditedAmount, Wheel1Draw wheel1Draw, Wheel1Draw wheel2Draw, Wheel1Draw result, ArrayList<IndividualBetDetails> individualBetDetails, Integer ticketId, String countryCode, String currency, String createdAt, boolean isFreeSpinRound, boolean isExpanded) {
        wheel1Draw.getClass();
        wheel2Draw.getClass();
        result.getClass();
        return new BetHistoryItem(id, userId, stakeAmount, giftAmount, payoutAmount, actualDebitedAmount, actualCreditedAmount, wheel1Draw, wheel2Draw, result, individualBetDetails, ticketId, countryCode, currency, createdAt, isFreeSpinRound, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryItem)) {
            return false;
        }
        BetHistoryItem betHistoryItem = (BetHistoryItem) other;
        return this.id == betHistoryItem.id && Intrinsics.g(this.userId, betHistoryItem.userId) && Intrinsics.g(this.stakeAmount, betHistoryItem.stakeAmount) && Intrinsics.g(this.giftAmount, betHistoryItem.giftAmount) && Intrinsics.g(this.payoutAmount, betHistoryItem.payoutAmount) && Intrinsics.g(this.actualDebitedAmount, betHistoryItem.actualDebitedAmount) && Intrinsics.g(this.actualCreditedAmount, betHistoryItem.actualCreditedAmount) && Intrinsics.g(this.wheel1Draw, betHistoryItem.wheel1Draw) && Intrinsics.g(this.wheel2Draw, betHistoryItem.wheel2Draw) && Intrinsics.g(this.result, betHistoryItem.result) && Intrinsics.g(this.individualBetDetails, betHistoryItem.individualBetDetails) && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && Intrinsics.g(this.countryCode, betHistoryItem.countryCode) && Intrinsics.g(this.currency, betHistoryItem.currency) && Intrinsics.g(this.createdAt, betHistoryItem.createdAt) && this.isFreeSpinRound == betHistoryItem.isFreeSpinRound && this.isExpanded == betHistoryItem.isExpanded;
    }

    public final Double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    public final Double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final ArrayList<IndividualBetDetails> getIndividualBetDetails() {
        return this.individualBetDetails;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Wheel1Draw getResult() {
        return this.result;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Integer getTicketId() {
        return this.ticketId;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final Wheel1Draw getWheel1Draw() {
        return this.wheel1Draw;
    }

    public final Wheel1Draw getWheel2Draw() {
        return this.wheel2Draw;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        Integer num = this.userId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.stakeAmount;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.giftAmount;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.payoutAmount;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.actualDebitedAmount;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.actualCreditedAmount;
        int iHashCode7 = (this.result.hashCode() + ((this.wheel2Draw.hashCode() + ((this.wheel1Draw.hashCode() + ((iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31)) * 31)) * 31)) * 31;
        ArrayList<IndividualBetDetails> arrayList = this.individualBetDetails;
        int iHashCode8 = (iHashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num2 = this.ticketId;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.countryCode;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdAt;
        return Boolean.hashCode(this.isExpanded) + mtg0.a((iHashCode11 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.isFreeSpinRound);
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public boolean isExpanded() {
        return this.isExpanded;
    }

    public final boolean isFreeSpinRound() {
        return this.isFreeSpinRound;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public final void setIndividualBetDetails(ArrayList<IndividualBetDetails> arrayList) {
        this.individualBetDetails = arrayList;
    }

    public final void setResult(Wheel1Draw wheel1Draw) {
        wheel1Draw.getClass();
        this.result = wheel1Draw;
    }

    public final void setWheel1Draw(Wheel1Draw wheel1Draw) {
        wheel1Draw.getClass();
        this.wheel1Draw = wheel1Draw;
    }

    public final void setWheel2Draw(Wheel1Draw wheel1Draw) {
        wheel1Draw.getClass();
        this.wheel2Draw = wheel1Draw;
    }

    public String toString() {
        long j = this.id;
        Integer num = this.userId;
        Double d = this.stakeAmount;
        Double d2 = this.giftAmount;
        Double d3 = this.payoutAmount;
        Double d4 = this.actualDebitedAmount;
        Double d5 = this.actualCreditedAmount;
        Wheel1Draw wheel1Draw = this.wheel1Draw;
        Wheel1Draw wheel1Draw2 = this.wheel2Draw;
        Wheel1Draw wheel1Draw3 = this.result;
        ArrayList<IndividualBetDetails> arrayList = this.individualBetDetails;
        Integer num2 = this.ticketId;
        String str = this.countryCode;
        String str2 = this.currency;
        String str3 = this.createdAt;
        boolean z = this.isFreeSpinRound;
        boolean z2 = this.isExpanded;
        StringBuilder sb = new StringBuilder("BetHistoryItem(id=");
        sb.append(j);
        sb.append(", userId=");
        sb.append(num);
        lsv.a(d, d2, ", stakeAmount=", ", giftAmount=", sb);
        lsv.a(d3, d4, ", payoutAmount=", ", actualDebitedAmount=", sb);
        sb.append(", actualCreditedAmount=");
        sb.append(d5);
        sb.append(", wheel1Draw=");
        sb.append(wheel1Draw);
        sb.append(", wheel2Draw=");
        sb.append(wheel1Draw2);
        sb.append(", result=");
        sb.append(wheel1Draw3);
        sb.append(", individualBetDetails=");
        sb.append(arrayList);
        sb.append(", ticketId=");
        sb.append(num2);
        hxa.c(sb, ", countryCode=", str, ", currency=", str2);
        sb.append(", createdAt=");
        sb.append(str3);
        sb.append(", isFreeSpinRound=");
        sb.append(z);
        return w.a(sb, ", isExpanded=", z2, ")");
    }
}
