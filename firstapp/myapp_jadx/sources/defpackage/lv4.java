package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 lv4[], still in use, count: 1, list:
  (r0v25 lv4[]) from 0x01a0: CONSTRUCTOR (r0v25 lv4[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:418) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class lv4 {
    BONUS_VAULT_TOAST_NEUTRAL_LEFT_IMAGE("bonus_vault_toast_neutral_left_image"),
    BONUS_VAULT_TOAST_NEUTRAL_RIGHT_IMAGE("bonus_vault_toast_neutral_right_image"),
    BONUS_VAULT_TOAST_MISSION_ACTIVATED("bonus_vault_game_mission_activated", "Game Mission Activated!"),
    BONUS_VAULT_TOAST_FINISH_THE_MISSION("bonus_vault_finish_mission_and_win_up_to", "Finish the mission and win up to {maxGiftValue}"),
    BONUS_VAULT_TOAST_ONE_BET_LEFT("bonus_vault_one_bet_left", "Only 1 bet left"),
    BONUS_VAULT_TOAST_ONE_BET_LEFT_SUBTITLE("bonus_vault_one_bet_left_subtitle", "Place it to unlock your reward"),
    BONUS_VAULT_TOAST_POSITIVE_LEFT_IMAGE("bonus_vault_toast_positive_left_image"),
    BONUS_VAULT_TOAST_POSITIVE_RIGHT_IMAGE("bonus_vault_toast_positive_right_image"),
    BONUS_VAULT_TOAST_MISSION_COMPLETE("bonus_vault_mission_complete", "Mission Complete!"),
    BONUS_VAULT_TOAST_MISSION_COMPLETE_SUBTITLE("bonus_vault_mission_complete_subtitle", "Go to your Vault to claim prize"),
    BONUS_VAULT_TOAST_REWARD_UNLOCKED("bonus_vault_reward_unlocked", "Reward unlocked!"),
    BONUS_VAULT_TOAST_REWARD_UNLOCKED_SUBTITLE("bonus_vault_reward_unlocked_subtitle", "Pick a game and win up to {maxGiftValue}"),
    BONUS_VAULT_TOAST_NEGATIVE_LEFT_IMAGE("bonus_vault_toast_negative_left_image"),
    BONUS_VAULT_TOAST_NEGATIVE_RIGHT_IMAGE("bonus_vault_toast_negative_right_image"),
    BONUS_VAULT_TOAST_MISSION_WAITING("bonus_vault_mission_waiting", "Mission Waiting!"),
    BONUS_VAULT_TOAST_MISSION_WAITING_SUBTITLE("bonus_vault_mission_waiting_subtitle", "Exclusive rewards to be won…"),
    BONUS_VAULT_TOAST_ALMOST_THERE("bonus_vault_almost_there", "Almost there!"),
    BONUS_VAULT_TOAST_BETS_LEFT_TO_UNLOCK_SUBTITLE("bonus_vault_bets_left_to_unlock_subtitle", "Only {betCountRemaining} bets left to unlock bonus game."),
    BONUS_VAULT_TOAST_CAMPAIGN_ENDING_SOON("bonus_vault_campaign_ending_soon", "Mission ends in {remainingTime}{timeUnit}"),
    BONUS_VAULT_TOAST_CAMPAIGN_ENDING_SUBTITLE("bonus_vault_campaign_ending_subtitle", "Don't lose your progress!"),
    BONUS_VAULT_TOAST_DONT_FORGET_YOUR_PRIZE("bonus_vault_dont_forget_prize", "Don't forget your prize"),
    BONUS_VAULT_TOAST_DONT_FORGET_YOUR_PRIZE_SUBTITLE("bonus_vault_dont_forget_prize_subtitle", "Only {remainingTime}{timeUnit} left to use it!"),
    BONUS_VAULT_TOAST_LEARN_MORE(qUnCRF.YJAKe, "Learn more"),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS_VAULT_TOAST_VIEW_PROGRESS("bonus_vault_view_progress", "View progress"),
    BONUS_VAULT_TOAST_ENTER_VAULT("bonus_vault_enter_vault", "Enter Vault");

    public static final /* synthetic */ uag Q;
    public final String a;
    public final String b;

    public lv4(String str, String str2) {
        super(str, i);
        this.a = str;
        this.b = str2;
    }

    public static lv4 valueOf(String str) {
        return (lv4) Enum.valueOf(lv4.class, str);
    }

    public static lv4[] values() {
        return (lv4[]) P.clone();
    }

    static {
        Q = new uag(lv4VarArr);
    }

    public /* synthetic */ lv4(String str) {
        this(str, "");
    }
}
