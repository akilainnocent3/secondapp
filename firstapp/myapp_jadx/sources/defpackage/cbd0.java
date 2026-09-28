package defpackage;

import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.sportysoccer.model.Balance;
import com.sportygames.sportysoccer.model.BodyCashOut;
import com.sportygames.sportysoccer.model.BodyGameResult;
import com.sportygames.sportysoccer.model.BodyLeaderBoard;
import com.sportygames.sportysoccer.model.FlickBall;
import com.sportygames.sportysoccer.model.GameConfig;
import com.sportygames.sportysoccer.model.GameData;
import com.sportygames.sportysoccer.model.GameProbability;
import com.sportygames.sportysoccer.model.GameSession;
import com.sportygames.sportysoccer.model.GameSessionBaseline;
import com.sportygames.sportysoccer.model.LeaderBoard;
import com.sportygames.sportysoccer.model.Login;
import com.sportygames.sportysoccer.model.OngoingGameSessionData;
import com.sportygames.sportysoccer.model.TutorialStatus;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes8.dex */
public interface cbd0 {
    public static final HashSet<String> a = new HashSet<>(Arrays.asList("/betamount/choices", "/session/check", "/session/generate", "/prob/pre-result", "/result/confirm", "/cashout/request/session", "/player/balance", "/player/tutorial/status", "/player/tutorial/pass", "/player/tutorial/reset", "/practice/leaderboard", "/session/baseline"));
    public static final HashSet<String> b = new HashSet<>(Arrays.asList("/prob/pre-result", "/result/confirm", "/cashout/request/session"));

    @gmz("/player/tutorial/pass")
    su5<Void> A();

    @sbj("/practice/leaderboard")
    su5<LeaderBoard> B(@db30("limit") int i);

    @sbj("/betamount/choices")
    su5<GameConfig> C();

    @sbj("/player/balance")
    su5<Balance> o();

    @sbj("/result/confirm")
    su5<GameData> p();

    @flz("/authenticate")
    su5<Login> q(@rhl("X-Auth-Token") String str, @db30("countryCode") String str2);

    @sbj("/session/check")
    su5<OngoingGameSessionData> r();

    @flz("/practice/leaderboard")
    su5<Void> s(@jh4 BodyLeaderBoard bodyLeaderBoard);

    @flz("/cashout/request/session")
    su5<Void> t(@jh4 BodyCashOut bodyCashOut);

    @flz("/result/confirm")
    su5<GameData> u(@jh4 BodyGameResult bodyGameResult);

    @sbj("/prob/pre-result")
    su5<GameProbability> v();

    @sbj("patron/s-soccer-account")
    su5<BaseResponse<FlickBall>> w(@rhl("Authorization") String str);

    @sbj("/player/tutorial/status")
    su5<TutorialStatus> x();

    @sbj("/session/baseline")
    su5<GameSessionBaseline> y();

    @sbj("/session/generate")
    su5<GameSession> z(@db30("betAmount") String str);
}
