package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingCreateAndSettleResult;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingCurrentRoundResult;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingDetail;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingDetailRound;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingInfo;
import com.sportybet.android.instantwin.newtork.model.response.doubleornothing.NetworkDoubleOrNothingNextRoundState;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rkt {
    public static final Object a = new Object();

    public static final x0f a(NetworkDoubleOrNothingCreateAndSettleResult networkDoubleOrNothingCreateAndSettleResult) {
        y0f y0fVar;
        String challengeId = networkDoubleOrNothingCreateAndSettleResult.getChallengeId();
        if (challengeId == null) {
            challengeId = "";
        }
        int roundNumber = networkDoubleOrNothingCreateAndSettleResult.getRoundNumber();
        int maxRounds = networkDoubleOrNothingCreateAndSettleResult.getMaxRounds();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkDoubleOrNothingCreateAndSettleResult.getOdds());
        bigDecimalValueOf.getClass();
        NetworkDoubleOrNothingCurrentRoundResult currentRoundResult = networkDoubleOrNothingCreateAndSettleResult.getCurrentRoundResult();
        a3f a3fVar = null;
        if (currentRoundResult != null) {
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(currentRoundResult.getRoundBalance());
            bigDecimalValueOf2.getClass();
            y0fVar = new y0f(bigDecimalValueOf2);
        } else {
            y0fVar = null;
        }
        NetworkDoubleOrNothingNextRoundState nextRoundState = networkDoubleOrNothingCreateAndSettleResult.getNextRoundState();
        if (nextRoundState != null) {
            int roundNumber2 = nextRoundState.getRoundNumber();
            BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(nextRoundState.getBaseAmount());
            bigDecimalValueOf3.getClass();
            BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(nextRoundState.getMinStake());
            bigDecimalValueOf4.getClass();
            BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(nextRoundState.getMaxStake());
            bigDecimalValueOf5.getClass();
            a3fVar = new a3f(roundNumber2, bigDecimalValueOf3, bigDecimalValueOf4, bigDecimalValueOf5, nextRoundState.getCountdownDuration(), nextRoundState.getKickCountdownDuration());
        }
        return new x0f(challengeId, roundNumber, maxRounds, bigDecimalValueOf, y0fVar, a3fVar);
    }

    public static final z0f b(NetworkDoubleOrNothingDetail networkDoubleOrNothingDetail) {
        List list;
        l4f l4fVar;
        String sourceBetId = networkDoubleOrNothingDetail.getSourceBetId();
        String str = sourceBetId == null ? "" : sourceBetId;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkDoubleOrNothingDetail.getSourceBetWinningAmount());
        bigDecimalValueOf.getClass();
        int maxRounds = networkDoubleOrNothingDetail.getMaxRounds();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkDoubleOrNothingDetail.getOdds());
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkDoubleOrNothingDetail.getTotalReturn());
        bigDecimalValueOf3.getClass();
        long createTime = networkDoubleOrNothingDetail.getCreateTime();
        List<NetworkDoubleOrNothingDetailRound> rounds = networkDoubleOrNothingDetail.getRounds();
        if (rounds != null) {
            ArrayList arrayList = new ArrayList(l48.r(rounds, 10));
            for (NetworkDoubleOrNothingDetailRound networkDoubleOrNothingDetailRound : rounds) {
                int roundNumber = networkDoubleOrNothingDetailRound.getRoundNumber();
                String ticketNumber = networkDoubleOrNothingDetailRound.getTicketNumber();
                if (ticketNumber == null) {
                    ticketNumber = "";
                }
                int result = networkDoubleOrNothingDetailRound.getResult();
                if (result == 1) {
                    l4fVar = l4f.a;
                } else {
                    if (result != 2) {
                        fa30.a(result, "Unknown DoubleOrNothing round status: ");
                        return null;
                    }
                    l4fVar = l4f.b;
                }
                l4f l4fVar2 = l4fVar;
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkDoubleOrNothingDetailRound.getBaseAmount());
                bigDecimalValueOf4.getClass();
                BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(networkDoubleOrNothingDetailRound.getCashout());
                bigDecimalValueOf5.getClass();
                BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(networkDoubleOrNothingDetailRound.getStake());
                bigDecimalValueOf6.getClass();
                BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(networkDoubleOrNothingDetailRound.getRoundBalance());
                bigDecimalValueOf7.getClass();
                arrayList.add(new a1f(roundNumber, ticketNumber, l4fVar2, bigDecimalValueOf4, bigDecimalValueOf5, bigDecimalValueOf6, bigDecimalValueOf7));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (list == null) {
            list = m2g.a;
        }
        return new z0f(str, bigDecimalValueOf, maxRounds, bigDecimalValueOf2, bigDecimalValueOf3, createTime, list);
    }

    public static final w1f c(NetworkDoubleOrNothingInfo networkDoubleOrNothingInfo) {
        String challengeId = networkDoubleOrNothingInfo.getChallengeId();
        if (challengeId == null) {
            challengeId = "";
        }
        int currentRoundNumber = networkDoubleOrNothingInfo.getCurrentRoundNumber();
        int maxRounds = networkDoubleOrNothingInfo.getMaxRounds();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(networkDoubleOrNothingInfo.getOdds());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(networkDoubleOrNothingInfo.getBaseAmount());
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(networkDoubleOrNothingInfo.getMinStake());
        bigDecimalValueOf3.getClass();
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(networkDoubleOrNothingInfo.getMaxStake());
        bigDecimalValueOf4.getClass();
        return new w1f(challengeId, currentRoundNumber, maxRounds, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, bigDecimalValueOf4, networkDoubleOrNothingInfo.getCountdownDuration(), networkDoubleOrNothingInfo.getKickCountdownDuration());
    }
}
