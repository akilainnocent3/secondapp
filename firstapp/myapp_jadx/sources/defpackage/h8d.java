package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import com.sporty.android.platform.features.luckywheel.LuckyWheelActivity;
import com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusActivity;
import com.sporty.android.platform.features.security.newdevicelogin.securityaction.SecurityActionActivity;
import com.sporty.android.sportymedia.ui.SportyMediaActivity;
import com.sportybet.android.account.AccountActivationActivity;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.android.activity.AboutUsActivity;
import com.sportybet.android.activity.BirthVerifyActivity;
import com.sportybet.android.activity.BirthVerifySuccessActivity;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.codehub.ui.CodeHubActivity;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.android.game.activity.SportyGameLobbyDummyActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity;
import com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity;
import com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyActivity;
import com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventActivity;
import com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballActivity;
import com.sportybet.android.instantwin.router.VirtualGameInput;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.penalty.SportyPenaltyInput;
import com.sportybet.android.instantwin.router.racingevent.InstantRacingEventInput;
import com.sportybet.android.instantwin.router.scheduledfootball.ScheduledFootballInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import com.sportybet.android.instantwin.router.virtuallobby.VirtualLobbyInput;
import com.sportybet.android.limits.base.limitBase.LimitsActivity;
import com.sportybet.android.limits.reached.ReachedLimitsActivity;
import com.sportybet.android.livegame.LiveGameActivity;
import com.sportybet.android.luckynumber.LuckyNumberWebView;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.openbet.presentation.activity.OpenBetActivity;
import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import com.sportybet.android.router.Sender;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.user.ChangeUserInfoActivity;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportybet.android.user.selfexclusion.SelfExclusionActivity;
import com.sportybet.android.verifybet.VerifyBetActivity;
import com.sportybet.android.virtual.presentation.activity.VirtualGameActivity;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import com.sportybet.feature.gift.gift.presentation.GiftActivity;
import com.sportybet.feature.horseracing.view.HorseRacingActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.loyalty.impl.bettingstreak.BettingStreakActivity;
import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import com.sportybet.feature.luckynumber.luncher.LuckyNumberLuncherActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import com.sportybet.feature.profile.ProfileActivity;
import com.sportybet.feature.recap.presentation.RecapActivity;
import com.sportybet.feature.settings.NotificationSettingsActivity;
import com.sportybet.feature.settings.SettingsActivity;
import com.sportybet.feature.timeAlertReached.TimeAlertReachedActivity;
import com.sportybet.feature.worldcup.WorldCupActivity;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;
import com.sportybet.plugin.jackpot.activities.RJackpotBetHistoryActivity;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.activities.JackpotPlaceBetActivity;
import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.activities.ResultsActivity;
import com.sportybet.plugin.realsports.activities.SportySimPromotionDialogActivity;
import com.sportybet.plugin.realsports.activities.TransactionSearchActivity;
import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.live.data.FilterOrigin;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.searchv2.SearchActivity;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import com.sportybet.plugin.sportypicks.ui.SportyPicksActivity;
import com.sportybet.plugin.swipebet.activities.SwipeBetActivity;
import com.sportybet.plugin.swipebet.activities.SwipeBetSettingActivity;
import com.sportybet.tech.uibus.UIRouter;
import com.twilio.voice.EventKeys;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public class h8d implements UIRouter {
    public static final Set<String> t;
    public final Context a;
    public final psm b;
    public final d0n c;
    public final u2u d;
    public final uqm e;
    public final m0d f;
    public final j800 g;
    public final str<fbh0> h;
    public final bnh0 i;
    public final yi5 j;
    public final lch k;
    public final xxz l;
    public final cbg m;
    public final nsm n;
    public final a3k0 o;
    public final avz p;
    public su5<BaseResponse<xdp>> q;
    public WeakReference<Activity> r;
    public ProgressDialog s;

    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            b = iArr;
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[CountryCodeName.NIGERIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[wae.values().length];
            a = iArr2;
            try {
                wae.a aVar = wae.b;
                iArr2[111] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr3 = a;
                wae.a aVar2 = wae.b;
                iArr3[110] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr4 = a;
                wae.a aVar3 = wae.b;
                iArr4[20] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr5 = a;
                wae.a aVar4 = wae.b;
                iArr5[55] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr6 = a;
                wae.a aVar5 = wae.b;
                iArr6[10] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr7 = a;
                wae.a aVar6 = wae.b;
                iArr7[2] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr8 = a;
                wae.a aVar7 = wae.b;
                iArr8[58] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr9 = a;
                wae.a aVar8 = wae.b;
                iArr9[0] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr10 = a;
                wae.a aVar9 = wae.b;
                iArr10[59] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr11 = a;
                wae.a aVar10 = wae.b;
                iArr11[22] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr12 = a;
                wae.a aVar11 = wae.b;
                iArr12[60] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr13 = a;
                wae.a aVar12 = wae.b;
                iArr13[1] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr14 = a;
                wae.a aVar13 = wae.b;
                iArr14[39] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr15 = a;
                wae.a aVar14 = wae.b;
                iArr15[61] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr16 = a;
                wae.a aVar15 = wae.b;
                iArr16[7] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                int[] iArr17 = a;
                wae.a aVar16 = wae.b;
                iArr17[62] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                int[] iArr18 = a;
                wae.a aVar17 = wae.b;
                iArr18[63] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr19 = a;
                wae.a aVar18 = wae.b;
                iArr19[64] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr20 = a;
                wae.a aVar19 = wae.b;
                iArr20[65] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr21 = a;
                wae.a aVar20 = wae.b;
                iArr21[66] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr22 = a;
                wae.a aVar21 = wae.b;
                iArr22[72] = 21;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr23 = a;
                wae.a aVar22 = wae.b;
                iArr23[57] = 22;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                int[] iArr24 = a;
                wae.a aVar23 = wae.b;
                iArr24[56] = 23;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                int[] iArr25 = a;
                wae.a aVar24 = wae.b;
                iArr25[23] = 24;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                int[] iArr26 = a;
                wae.a aVar25 = wae.b;
                iArr26[11] = 25;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                int[] iArr27 = a;
                wae.a aVar26 = wae.b;
                iArr27[19] = 26;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                int[] iArr28 = a;
                wae.a aVar27 = wae.b;
                iArr28[5] = 27;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                int[] iArr29 = a;
                wae.a aVar28 = wae.b;
                iArr29[6] = 28;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                int[] iArr30 = a;
                wae.a aVar29 = wae.b;
                iArr30[12] = 29;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                int[] iArr31 = a;
                wae.a aVar30 = wae.b;
                iArr31[3] = 30;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                int[] iArr32 = a;
                wae.a aVar31 = wae.b;
                iArr32[21] = 31;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                int[] iArr33 = a;
                wae.a aVar32 = wae.b;
                iArr33[13] = 32;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                int[] iArr34 = a;
                wae.a aVar33 = wae.b;
                iArr34[14] = 33;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                int[] iArr35 = a;
                wae.a aVar34 = wae.b;
                iArr35[26] = 34;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                int[] iArr36 = a;
                wae.a aVar35 = wae.b;
                iArr36[28] = 35;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                int[] iArr37 = a;
                wae.a aVar36 = wae.b;
                iArr37[120] = 36;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                int[] iArr38 = a;
                wae.a aVar37 = wae.b;
                iArr38[16] = 37;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                int[] iArr39 = a;
                wae.a aVar38 = wae.b;
                iArr39[15] = 38;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                int[] iArr40 = a;
                wae.a aVar39 = wae.b;
                iArr40[8] = 39;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                int[] iArr41 = a;
                wae.a aVar40 = wae.b;
                iArr41[25] = 40;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                int[] iArr42 = a;
                wae.a aVar41 = wae.b;
                iArr42[29] = 41;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                int[] iArr43 = a;
                wae.a aVar42 = wae.b;
                iArr43[30] = 42;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                int[] iArr44 = a;
                wae.a aVar43 = wae.b;
                iArr44[31] = 43;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                int[] iArr45 = a;
                wae.a aVar44 = wae.b;
                iArr45[32] = 44;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                int[] iArr46 = a;
                wae.a aVar45 = wae.b;
                iArr46[33] = 45;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                int[] iArr47 = a;
                wae.a aVar46 = wae.b;
                iArr47[34] = 46;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                int[] iArr48 = a;
                wae.a aVar47 = wae.b;
                iArr48[35] = 47;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                int[] iArr49 = a;
                wae.a aVar48 = wae.b;
                iArr49[36] = 48;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                int[] iArr50 = a;
                wae.a aVar49 = wae.b;
                iArr50[37] = 49;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                int[] iArr51 = a;
                wae.a aVar50 = wae.b;
                iArr51[38] = 50;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                int[] iArr52 = a;
                wae.a aVar51 = wae.b;
                iArr52[40] = 51;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                int[] iArr53 = a;
                wae.a aVar52 = wae.b;
                iArr53[42] = 52;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                int[] iArr54 = a;
                wae.a aVar53 = wae.b;
                iArr54[41] = 53;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                int[] iArr55 = a;
                wae.a aVar54 = wae.b;
                iArr55[43] = 54;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                int[] iArr56 = a;
                wae.a aVar55 = wae.b;
                iArr56[44] = 55;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                int[] iArr57 = a;
                wae.a aVar56 = wae.b;
                iArr57[45] = 56;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                int[] iArr58 = a;
                wae.a aVar57 = wae.b;
                iArr58[46] = 57;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                int[] iArr59 = a;
                wae.a aVar58 = wae.b;
                iArr59[47] = 58;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                int[] iArr60 = a;
                wae.a aVar59 = wae.b;
                iArr60[48] = 59;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                int[] iArr61 = a;
                wae.a aVar60 = wae.b;
                iArr61[51] = 60;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                int[] iArr62 = a;
                wae.a aVar61 = wae.b;
                iArr62[49] = 61;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                int[] iArr63 = a;
                wae.a aVar62 = wae.b;
                iArr63[50] = 62;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                int[] iArr64 = a;
                wae.a aVar63 = wae.b;
                iArr64[52] = 63;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                int[] iArr65 = a;
                wae.a aVar64 = wae.b;
                iArr65[53] = 64;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                int[] iArr66 = a;
                wae.a aVar65 = wae.b;
                iArr66[54] = 65;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                int[] iArr67 = a;
                wae.a aVar66 = wae.b;
                iArr67[67] = 66;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                int[] iArr68 = a;
                wae.a aVar67 = wae.b;
                iArr68[70] = 67;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                int[] iArr69 = a;
                wae.a aVar68 = wae.b;
                iArr69[71] = 68;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                int[] iArr70 = a;
                wae.a aVar69 = wae.b;
                iArr70[73] = 69;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                int[] iArr71 = a;
                wae.a aVar70 = wae.b;
                iArr71[74] = 70;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                int[] iArr72 = a;
                wae.a aVar71 = wae.b;
                iArr72[75] = 71;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                int[] iArr73 = a;
                wae.a aVar72 = wae.b;
                iArr73[76] = 72;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                int[] iArr74 = a;
                wae.a aVar73 = wae.b;
                iArr74[77] = 73;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                int[] iArr75 = a;
                wae.a aVar74 = wae.b;
                iArr75[79] = 74;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                int[] iArr76 = a;
                wae.a aVar75 = wae.b;
                iArr76[18] = 75;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                int[] iArr77 = a;
                wae.a aVar76 = wae.b;
                iArr77[4] = 76;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                int[] iArr78 = a;
                wae.a aVar77 = wae.b;
                iArr78[27] = 77;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                int[] iArr79 = a;
                wae.a aVar78 = wae.b;
                iArr79[83] = 78;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                int[] iArr80 = a;
                wae.a aVar79 = wae.b;
                iArr80[84] = 79;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                int[] iArr81 = a;
                wae.a aVar80 = wae.b;
                iArr81[85] = 80;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                int[] iArr82 = a;
                wae.a aVar81 = wae.b;
                iArr82[82] = 81;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                int[] iArr83 = a;
                wae.a aVar82 = wae.b;
                iArr83[78] = 82;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                int[] iArr84 = a;
                wae.a aVar83 = wae.b;
                iArr84[86] = 83;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                int[] iArr85 = a;
                wae.a aVar84 = wae.b;
                iArr85[88] = 84;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                int[] iArr86 = a;
                wae.a aVar85 = wae.b;
                iArr86[90] = 85;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                int[] iArr87 = a;
                wae.a aVar86 = wae.b;
                iArr87[89] = 86;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                int[] iArr88 = a;
                wae.a aVar87 = wae.b;
                iArr88[91] = 87;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                int[] iArr89 = a;
                wae.a aVar88 = wae.b;
                iArr89[92] = 88;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                int[] iArr90 = a;
                wae.a aVar89 = wae.b;
                iArr90[93] = 89;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                int[] iArr91 = a;
                wae.a aVar90 = wae.b;
                iArr91[94] = 90;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                int[] iArr92 = a;
                wae.a aVar91 = wae.b;
                iArr92[95] = 91;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                int[] iArr93 = a;
                wae.a aVar92 = wae.b;
                iArr93[97] = 92;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                int[] iArr94 = a;
                wae.a aVar93 = wae.b;
                iArr94[98] = 93;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                int[] iArr95 = a;
                wae.a aVar94 = wae.b;
                iArr95[96] = 94;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                int[] iArr96 = a;
                wae.a aVar95 = wae.b;
                iArr96[80] = 95;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                int[] iArr97 = a;
                wae.a aVar96 = wae.b;
                iArr97[99] = 96;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                int[] iArr98 = a;
                wae.a aVar97 = wae.b;
                iArr98[101] = 97;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                int[] iArr99 = a;
                wae.a aVar98 = wae.b;
                iArr99[102] = 98;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                int[] iArr100 = a;
                wae.a aVar99 = wae.b;
                iArr100[103] = 99;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                int[] iArr101 = a;
                wae.a aVar100 = wae.b;
                iArr101[104] = 100;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                int[] iArr102 = a;
                wae.a aVar101 = wae.b;
                iArr102[105] = 101;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                int[] iArr103 = a;
                wae.a aVar102 = wae.b;
                iArr103[106] = 102;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                int[] iArr104 = a;
                wae.a aVar103 = wae.b;
                iArr104[107] = 103;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                int[] iArr105 = a;
                wae.a aVar104 = wae.b;
                iArr105[109] = 104;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                int[] iArr106 = a;
                wae.a aVar105 = wae.b;
                iArr106[108] = 105;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                int[] iArr107 = a;
                wae.a aVar106 = wae.b;
                iArr107[112] = 106;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                int[] iArr108 = a;
                wae.a aVar107 = wae.b;
                iArr108[113] = 107;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                int[] iArr109 = a;
                wae.a aVar108 = wae.b;
                iArr109[24] = 108;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                int[] iArr110 = a;
                wae.a aVar109 = wae.b;
                iArr110[114] = 109;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                int[] iArr111 = a;
                wae.a aVar110 = wae.b;
                iArr111[81] = 110;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                int[] iArr112 = a;
                wae.a aVar111 = wae.b;
                iArr112[115] = 111;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                int[] iArr113 = a;
                wae.a aVar112 = wae.b;
                iArr113[116] = 112;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                int[] iArr114 = a;
                wae.a aVar113 = wae.b;
                iArr114[117] = 113;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                int[] iArr115 = a;
                wae.a aVar114 = wae.b;
                iArr115[118] = 114;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                int[] iArr116 = a;
                wae.a aVar115 = wae.b;
                iArr116[119] = 115;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                int[] iArr117 = a;
                wae.a aVar116 = wae.b;
                iArr117[121] = 116;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                int[] iArr118 = a;
                wae.a aVar117 = wae.b;
                iArr118[100] = 117;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                int[] iArr119 = a;
                wae.a aVar118 = wae.b;
                iArr119[17] = 118;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                int[] iArr120 = a;
                wae.a aVar119 = wae.b;
                iArr120[69] = 119;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                int[] iArr121 = a;
                wae.a aVar120 = wae.b;
                iArr121[68] = 120;
            } catch (NoSuchFieldError unused122) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class b implements tit {
        public final /* synthetic */ Bundle a;

        public b(Bundle bundle) {
            this.a = bundle;
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            Context context = h8d.this.a;
            if (account == null) {
                return;
            }
            int i = aqg0.a.c.a;
            Bundle bundle = this.a;
            boolean z2 = false;
            if (bundle != null) {
                z2 = bundle.getBoolean(AnalyticsEvent.DEPOSIT, false);
                i = bundle.getInt("key_param_tx_category", i);
            }
            int i2 = TxListActivity.K;
            Intent intent = new Intent(context, (Class<?>) TxListActivity.class);
            intent.putExtra("parameter", z2);
            intent.putExtra("key_param_tx_category", i);
            yrh0.s(context, intent, true);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class c implements tit {
        public final /* synthetic */ Bundle a;

        public c(Bundle bundle) {
            this.a = bundle;
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            Context context = h8d.this.a;
            if (account != null) {
                Intent intent = new Intent(context, (Class<?>) RJackpotBetHistoryActivity.class);
                Bundle bundle = this.a;
                if (bundle != null) {
                    intent.putExtra("tab_index", bundle.getInt("tab_index", 10));
                }
                yrh0.s(context, intent, true);
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class d implements tit {
        public final /* synthetic */ Bundle a;

        public d(Bundle bundle) {
            this.a = bundle;
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            Context context = h8d.this.a;
            if (account != null) {
                Intent intent = new Intent(context, (Class<?>) com.sportybet.plugin.realsports.activities.RJackpotBetHistoryActivity.class);
                Bundle bundle = this.a;
                if (bundle != null) {
                    intent.putExtra("tab_index", bundle.getInt("tab_index", 10));
                }
                yrh0.s(context, intent, true);
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class e implements tit {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Uri b;

        public e(Bundle bundle, Uri uri) {
            this.a = bundle;
            this.b = uri;
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            Context context = h8d.this.a;
            if (account != null) {
                Bundle bundle = this.a;
                String string = bundle != null ? bundle.getString("tradeId") : null;
                Uri uri = this.b;
                String queryParameter = uri.getQueryParameter("tradeId");
                if (queryParameter != null) {
                    string = queryParameter;
                }
                String queryParameter2 = uri.getQueryParameter("isHistory");
                int i = queryParameter2 == null ? 0 : Integer.parseInt(queryParameter2);
                if (string == null) {
                    return;
                }
                d8b d8bVar = c1h0.a;
                yrh0.s(context, c1h0.a(i, context, string), true);
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class f implements tit {

        public class a extends SimpleResponseWrapper<xdp> {
            public a(Activity activity) {
                super(activity);
            }

            @Override // com.sportybet.android.data.SimpleResponseWrapper
            public final void onFailure(Throwable th) {
                super.onFailure(th);
                h8d h8dVar = h8d.this;
                String strB = sn5.b(h8dVar.r.get(), R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                String strB2 = sn5.b(h8dVar.r.get(), R.string.common_functions__ok, new Object[0]);
                wie wieVar = new wie();
                wieVar.a = strB;
                wieVar.c = "Cancel";
                wieVar.b = strB2;
                wieVar.f = false;
                wieVar.e = true;
                wieVar.w = null;
                wieVar.v = null;
                wieVar.i = false;
                wieVar.d = "title";
                wieVar.z = R.color.text_type1_secondary;
                wieVar.y = R.color.brand_secondary;
                wieVar.A = R.color.text_type1_primary;
                wieVar.B = 0;
                wieVar.C = 1;
                wieVar.D = false;
                wieVar.E = true;
                wieVar.F = false;
                wieVar.show(((fq0) h8dVar.r.get()).getSupportFragmentManager(), "bvnApiCallFailFragment");
            }

            @Override // com.sportybet.android.data.CallbackWrapper
            public final void onResponseComplete() {
                h8d h8dVar = h8d.this;
                h8dVar.q = null;
                ProgressDialog progressDialog = h8dVar.s;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }

            @Override // com.sportybet.android.data.SimpleResponseWrapper
            public final void onSuccess(xdp xdpVar) {
                h8d h8dVar = h8d.this;
                int iA = lal.a(xdpVar, AnalyticsParam.EVENT_PARAM_RESULT, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS);
                if (iA != 103) {
                    Intent intent = new Intent(h8dVar.r.get(), (Class<?>) BirthVerifyActivity.class);
                    intent.putExtra("bvn_result_code", iA);
                    h8dVar.r.get().startActivity(intent);
                } else {
                    Intent intent2 = new Intent(h8dVar.r.get(), (Class<?>) BirthVerifySuccessActivity.class);
                    intent2.putExtra("bvn_success_code", HttpStatusCodesKt.HTTP_EARLY_HINTS);
                    h8dVar.r.get().startActivity(intent2);
                }
            }
        }

        public f() {
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            if (account == null) {
                return;
            }
            h8d h8dVar = h8d.this;
            su5<BaseResponse<xdp>> su5Var = h8dVar.q;
            if (su5Var != null) {
                su5Var.cancel();
            }
            if (!h8dVar.n.isConnected()) {
                zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(h8dVar.r.get(), R.style.BrandProgressDialogTheme);
            h8dVar.s = progressDialog;
            progressDialog.setMessage(sn5.b(h8dVar.r.get(), R.string.common_functions__loading_with_dot, new Object[0]));
            h8dVar.s.setIndeterminate(true);
            h8dVar.s.setCancelable(false);
            h8dVar.s.setCanceledOnTouchOutside(false);
            h8dVar.s.show();
            su5<BaseResponse<xdp>> su5VarA1 = h8dVar.l.A1();
            h8dVar.q = su5VarA1;
            su5VarA1.G(new a(h8dVar.r.get()));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("sportyTV");
        hashSet.add("home_banner");
        hashSet.add("me_banner");
        hashSet.add("tournament_banner");
        hashSet.add("prematch_banner");
        hashSet.add("live_event_banner");
        hashSet.add("invitation_popup");
        t = Collections.unmodifiableSet(hashSet);
    }

    public h8d(Context context, psm psmVar, d0n d0nVar, u2u u2uVar, uqm uqmVar, m0d m0dVar, j800 j800Var, str strVar, yi5 yi5Var, xxz xxzVar, bnh0 bnh0Var, lch lchVar, cbg cbgVar, nsm nsmVar, a3k0 a3k0Var, avz avzVar) {
        this.a = context;
        this.b = psmVar;
        this.c = d0nVar;
        this.d = u2uVar;
        this.e = uqmVar;
        this.f = m0dVar;
        this.g = j800Var;
        this.h = strVar;
        this.j = yi5Var;
        this.l = xxzVar;
        this.i = bnh0Var;
        this.k = lchVar;
        this.m = cbgVar;
        this.n = nsmVar;
        this.o = a3k0Var;
        this.p = avzVar;
    }

    public static void e(Context context, Uri uri, Sender sender) {
        String str;
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(uri.getEncodedQuery())) {
            for (String str2 : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        queryParameter = URLDecoder.decode(queryParameter, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                bundle.putString(str2, queryParameter);
            }
        }
        Intent intent = "featured_games".equals(bundle.getString("source")) ? new Intent(context, (Class<?>) SportyGameLobbyDummyActivity.class) : new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtras(bundle);
        sender.getClass();
        switch (dnj.a[sender.ordinal()]) {
            case 1:
                str = "direct_url";
                break;
            case 2:
            case 3:
                str = "homepage_top_banner";
                break;
            case 4:
                str = "homepage_sporty_banner";
                break;
            case 5:
                str = "homepage_popular_banner";
                break;
            case 6:
                str = "homepage_popup_banner";
                break;
            case 7:
                str = "homepage_featuredgames_section";
                break;
            case 8:
                str = "gift";
                break;
            default:
                str = "";
                break;
        }
        intent.putExtra("key - game sender", str);
        intent.setFlags(268435456);
        intent.putExtra("tab", 2);
        yrh0.s(context, intent, true);
    }

    public final Intent a() {
        uqm uqmVar = this.e;
        Account account = uqmVar.getAccount();
        if (account == null) {
            return null;
        }
        Intent intent = new Intent(this.a, (Class<?>) ProfileActivity.class);
        String phone = account.name;
        if (this.b.r()) {
            phone = uqmVar.getAccountInfo().getPhone();
        }
        intent.putExtra("account_number", phone);
        AccountInfo accountInfo = uqmVar.getAccountInfo();
        if (accountInfo != null) {
            intent.putExtra("first_name", accountInfo.getFirstName());
            intent.putExtra("last_name", accountInfo.getLastName());
            intent.putExtra("email", accountInfo.getEmail());
            intent.putExtra("date_of_birth", accountInfo.getBirthday());
            intent.putExtra("user_name", accountInfo.getNickname());
            intent.putExtra("avatar", accountInfo.getAvatar());
            intent.putExtra("state", accountInfo.getState());
            intent.putExtra("area", accountInfo.getArea());
            intent.putExtra("editableLastName", accountInfo.getEditableBirthday());
            intent.putExtra("editableFirstName", accountInfo.getEditableFirstName());
            intent.putExtra("editableFirstName", accountInfo.getEditableLastName());
        }
        return intent;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.e.getLastAccessToken());
    }

    public final void c() {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("tab", 0);
        intent.putExtra("tab_tag", "Home");
        yrh0.s(context, intent, true);
    }

    public final void d(Uri uri, Bundle bundle, Sender sender) {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) LuckyNumberLuncherActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("key-raw-query", uri.getEncodedQuery());
        intent.putExtra("lucky number web view intent", new Intent(context, (Class<?>) LuckyNumberWebView.class));
        if (sender != null) {
            intent.putExtra("lucky number sender", sender);
        }
        String queryParameter = uri.getQueryParameter("key-lucky-number-gif-id");
        if (queryParameter != null) {
            intent.putExtra("key-lucky-number-gif-id", queryParameter);
        }
        yrh0.s(context, intent, true);
    }

    public final void g() {
        WeakReference<Activity> weakReference = new WeakReference<>(oti.c().e());
        this.r = weakReference;
        if (weakReference.get() != null) {
            this.e.demandAccount(this.r.get(), new f());
        }
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean isGenericUri() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:536:0x0da0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sportybet.tech.uibus.UIRouter
    public boolean openUri(final Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        Intent intent;
        eag eagVar;
        String str3;
        bag bagVar;
        Intent intent2;
        String str4;
        String queryParameter;
        int i;
        Activity next;
        String str5;
        wae.b.getClass();
        final wae waeVarA = wae.a.a(str2);
        if (waeVarA == null) {
            return false;
        }
        switch (waeVarA.ordinal()) {
            case 0:
                Activity activityD = oti.c().d();
                if (activityD != null) {
                    Intent intent3 = new Intent(this.a, (Class<?>) MainActivity.class);
                    intent3.setFlags(268435456);
                    intent3.putExtra("tab", 4);
                    this.a.startActivity(intent3);
                    if (bundle != null) {
                        int i2 = bundle.getInt("key_param_tx_category", -1);
                        String string = bundle.getString("key_param_tx_category", null);
                        if (i2 == -1 && string != null) {
                            try {
                                bundle.putInt("key_param_tx_category", Integer.parseInt(string));
                            } catch (Throwable th) {
                                itf0.a aVar = itf0.a;
                                aVar.q(MyLog.TAG_UI_ROUTER);
                                aVar.o(th);
                            }
                        }
                    }
                    j800.a(activityD, bundle);
                    break;
                }
                return true;
            case 1:
                Activity activityD2 = oti.c().d();
                if (activityD2 != null) {
                    final String queryParameter2 = uri.getQueryParameter("tab");
                    this.e.demandAccount(activityD2, new tit() { // from class: s7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            if (account != null) {
                                Context context = this.a.a;
                                int i3 = GiftActivity.e;
                                Intent intent4 = new Intent(context, (Class<?>) GiftActivity.class);
                                String str6 = queryParameter2;
                                if (str6 != null && !StringsKt.U(str6)) {
                                    intent4.putExtra("tab", str6);
                                }
                                yrh0.s(context, intent4, true);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 2:
                yrh0.r(this.a, new Intent(this.a, (Class<?>) OpenBetActivity.class));
                return true;
            case 3:
                Intent intent4 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent4.setFlags(268435456);
                intent4.putExtra("tab", 3);
                intent4.putExtra("tab_index", 2);
                yrh0.r(this.a, intent4);
                return true;
            case 4:
                Activity activityE = oti.c().e();
                if (activityE != null) {
                    this.e.demandAccount(activityE, new c(bundle));
                    return true;
                }
                return true;
            case 5:
                Intent intent5 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent5.setFlags(268435456);
                intent5.putExtra("tab", 0);
                intent5.putExtra("tab_tag", "Home");
                if (bundle != null && bundle.containsKey("show_deposit_successful_message")) {
                    intent5.putExtra("show_deposit_successful_message", bundle.getBoolean("show_deposit_successful_message", false));
                }
                yrh0.r(this.a, intent5);
                return true;
            case 6:
                Intent intent6 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent6.setFlags(268435456);
                intent6.putExtra("tab", 1);
                yrh0.r(this.a, intent6);
                return true;
            case 7:
                yrh0.t(this.a, OfflineRequestListActivity.class, true);
                return true;
            case 8:
                f(uri);
                return true;
            case 9:
            case 87:
            default:
                return false;
            case 10:
                String queryParameter3 = uri.getQueryParameter(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID);
                if (TextUtils.isEmpty(queryParameter3)) {
                    return false;
                }
                String queryParameter4 = uri.getQueryParameter("eventType");
                if (TextUtils.isEmpty(queryParameter4)) {
                    return false;
                }
                String queryParameter5 = uri.getQueryParameter("marketId");
                String queryParameter6 = uri.getQueryParameter("specifier");
                String queryParameter7 = uri.getQueryParameter("shareCode");
                queryParameter4.getClass();
                switch (queryParameter4) {
                    case "prematch":
                        intent = new Intent(this.a, (Class<?>) PreMatchEventActivity.class);
                        intent.putExtra("EXTRA_EVENT_ID", queryParameter3);
                        intent.putExtra("EXTRA_MARKET_ID", queryParameter5);
                        intent.putExtra("EXTRA_MARKET_SPECIFIER", queryParameter6);
                        intent.putExtra("EXTRA_NAVI_TAB", PreMatchEventActivity.k2(uri.getQueryParameter("tab")));
                        intent.putExtra("EXTRA_BB_MODE", uri.getQueryParameter("bbMode"));
                        intent.putExtra("EXTRA_SHARE_CODE", queryParameter7);
                        break;
                    case "live":
                        intent = new Intent(this.a, (Class<?>) EventActivity.class);
                        intent.putExtra("EXTRA_EVENT_ID", queryParameter3);
                        intent.putExtra("EXTRA_SOURCE", 0);
                        intent.putExtra("EXTRA_OPEN_MATCH_TRACKER", "true".equals(uri.getQueryParameter("openMatchTracker")));
                        intent.putExtra("EXTRA_MARKET_ID", queryParameter5);
                        intent.putExtra("EXTRA_MARKET_SPECIFIER", queryParameter6);
                        break;
                    case "outright":
                        String queryParameter8 = uri.getQueryParameter("sportId");
                        intent = new Intent(this.a, (Class<?>) OutrightsActivity.class);
                        intent.putExtra("EXTRA_EVENT_ID", queryParameter3);
                        intent.putExtra("EXTRA_MARKET_ID", queryParameter5);
                        intent.putExtra("EXTRA_MARKET_SPECIFIER", queryParameter6);
                        intent.putExtra("key_sport_id", queryParameter8);
                        break;
                    default:
                        return false;
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                boolean zEquals = queryParameter4.equals("live");
                Context context = this.a;
                if (!zEquals) {
                    yrh0.r(context, intent);
                    return true;
                }
                int i3 = EventActivity.U0;
                EventActivity.a.a(context, intent);
                return true;
            case 11:
                if (bundle != null) {
                    this.g.b(bundle);
                    return true;
                }
                boolean zIsEmpty = uri.getPath().isEmpty();
                j800 j800Var = this.g;
                if (zIsEmpty) {
                    j800Var.b(null);
                    return true;
                }
                j800Var.d(uri);
                return true;
            case 12:
                Intent intent7 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent7.setFlags(268435456);
                intent7.putExtra("tab", 4);
                yrh0.r(this.a, intent7);
                return true;
            case 13:
                String languageCodeForBetRadar = this.e.getLanguageCodeForBetRadar();
                this.h.get().e(this.m.b().i + languageCodeForBetRadar);
                return true;
            case 14:
                this.h.get().c(bjb0.S("/m/promotions"), bundle);
                return true;
            case 15:
                String queryParameter9 = uri.getQueryParameter("SportyDeskEntry");
                snb0 snb0Var = snb0.SPORTY_GAMES;
                boolean zEquals2 = TextUtils.equals(queryParameter9, "sporty games");
                d0n d0nVar = this.c;
                Context context2 = this.a;
                if (zEquals2) {
                    d0nVar.b(context2, snb0Var);
                    return true;
                }
                d0nVar.b(context2, snb0.DEPP_LINK);
                return true;
            case 16:
                if (bundle != null) {
                    PartnerWithdrawRequestDetailsActivity.z1(this.a, bundle.getString("tradeId"));
                    return true;
                }
                return true;
            case 17:
                Intent intent8 = new Intent(this.a, (Class<?>) SportsMenuActivity.class);
                intent8.putExtra("key_sport_id", uri.getQueryParameter("key_sport_id"));
                yrh0.s(this.a, intent8, true);
                return true;
            case 18:
                Context context3 = this.a;
                int i4 = JackpotMainActivity.C;
                Intent intent9 = new Intent(context3, (Class<?>) JackpotMainActivity.class);
                if (sender == null) {
                    eagVar = eag.UNKNOWN;
                } else {
                    switch (JackpotMainActivity.c.a[sender.ordinal()]) {
                        case 1:
                            eagVar = eag.DEEPLINK;
                            break;
                        case 2:
                            eagVar = eag.AZ_MENU;
                            break;
                        case 3:
                            eagVar = eag.HOMEPAGE_SPORTY_STORY;
                            break;
                        case 4:
                            eagVar = eag.HOMEPAGE_TOP_BANNER;
                            break;
                        case 5:
                            eagVar = eag.HOME_BANNER;
                            break;
                        case 6:
                            eagVar = eag.HOMEPAGE_POPULAR_BANNER;
                            break;
                        case 7:
                            eagVar = eag.HOMEPAGE_POPUP_BANNER;
                            break;
                        case 8:
                            eagVar = eag.HOMEPAGE_FEATUREDGAMES_SECTION;
                            break;
                        case 9:
                            eagVar = eag.GIFT;
                            break;
                        case 10:
                            eagVar = eag.GAME_LOBBY;
                            break;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            eagVar = eag.UNKNOWN;
                            break;
                        default:
                            throw new IncompatibleClassChangeError();
                    }
                }
                intent9.putExtra("EXTRA_ENTRANCE", eagVar);
                yrh0.s(context3, intent9, true);
                return true;
            case 19:
                Intent intent10 = new Intent(this.a, (Class<?>) AboutUsActivity.class);
                intent10.setFlags(268435456);
                intent10.putExtra("show_new", !TextUtils.isEmpty(uri.getQueryParameter("show_new")));
                yrh0.r(this.a, intent10);
                return true;
            case 20:
                Intent intent11 = new Intent(this.a, (Class<?>) OpenBetActivity.class);
                if (bundle != null && bundle.containsKey("open_bets_entry_point")) {
                    intent11.putExtra("ARG_OPEN_BETS_FROM", bundle.getString("open_bets_entry_point"));
                }
                intent11.putExtra("EXTRA_TO_OPENBET", true);
                yrh0.r(this.a, intent11);
                return true;
            case 21:
                Intent intent12 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent12.setFlags(268435456);
                intent12.putExtra("tab", 3);
                intent12.putExtra("EXTRA_TO_OPENBET", true);
                yrh0.r(this.a, intent12);
                return true;
            case 22:
                String queryParameter10 = uri.getQueryParameter(AnalyticsParam.EVENT_PARAM_ID);
                if (!TextUtils.isEmpty(queryParameter10)) {
                    Intent intent13 = new Intent(this.a, (Class<?>) TransactionSearchActivity.class);
                    intent13.putExtra("ticketId", queryParameter10);
                    if (bundle != null) {
                        str3 = "EXTRA_ENTRANCE";
                        bagVar = (bag) sj5.b(bundle, str3, bag.class);
                    } else {
                        str3 = "EXTRA_ENTRANCE";
                        bagVar = null;
                    }
                    if (bagVar != null) {
                        intent13.putExtra(str3, bagVar);
                    }
                    yrh0.r(this.a, intent13);
                    return true;
                }
                return true;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                Activity activityD3 = oti.c().d();
                if (activityD3 != null) {
                    this.g.c(activityD3, bundle);
                    return true;
                }
                return true;
            case 24:
                Activity activityD4 = oti.c().d();
                if (activityD4 != null) {
                    this.e.demandAccount(activityD4, new tit() { // from class: u7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            Object next2;
                            Context context4 = this.a.a;
                            Uri uri2 = uri;
                            if ("create".equalsIgnoreCase(uri2.getQueryParameter("type"))) {
                                Intent intent14 = new Intent(context4, (Class<?>) BetslipActivity.class);
                                intent14.setFlags(268435456);
                                intent14.putExtra("extra_trigger_auto_bet_create", true);
                                context4.startActivity(intent14);
                                return;
                            }
                            int i5 = l91.Ongoing.a;
                            boolean booleanQueryParameter = uri2.getBooleanQueryParameter("hideTab", true);
                            String queryParameter11 = uri2.getQueryParameter(AnalyticsParam.EVENT_STATUS);
                            if (!TextUtils.isEmpty(queryParameter11)) {
                                try {
                                    l91.d.getClass();
                                    queryParameter11.getClass();
                                    Iterator<T> it = l91.z.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it.next();
                                    } while (!((l91) next2).c.equalsIgnoreCase(queryParameter11));
                                    l91 l91Var = (l91) next2;
                                    i5 = l91Var != null ? l91Var.a : l91.Ongoing.a;
                                } catch (NumberFormatException e2) {
                                    itf0.a aVar2 = itf0.a;
                                    aVar2.q(MyLog.TAG_UI_ROUTER);
                                    aVar2.o(e2);
                                }
                            }
                            Intent intent15 = new Intent(context4, (Class<?>) AutoBetActivity.class);
                            intent15.setFlags(268435456);
                            intent15.putExtra("extra_tab_index", 1);
                            intent15.putExtra("extra_show_only_bet_list", booleanQueryParameter);
                            intent15.putExtra("extra_initial_filter", i5);
                            context4.startActivity(intent15);
                        }
                    });
                    return true;
                }
                return true;
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
            case 29:
            case 30:
                return true;
            case RuntimeVersion.MINOR /* 26 */:
                Activity activityD5 = oti.c().d();
                if (activityD5 != null && !TextUtils.equals(activityD5.getClass().getSimpleName(), "AuthActivity")) {
                    this.e.demandAccount(activityD5, null);
                    return true;
                }
                return true;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Intent intent14 = new Intent(this.a, (Class<?>) HorseRacingActivity.class);
                intent14.putExtra("data_enable_default_action_bar", true);
                yrh0.s(this.a, intent14, true);
                return true;
            case 28:
                Activity activityD6 = oti.c().d();
                if (activityD6 != null && !TextUtils.equals(activityD6.getClass().getSimpleName(), "AuthActivity")) {
                    this.e.demandNewAccount(activityD6, null);
                    return true;
                }
                return true;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                String queryParameter11 = uri.getQueryParameter("sportId");
                String queryParameter12 = uri.getQueryParameter("leagueId");
                String queryParameter13 = uri.getQueryParameter("marketType");
                boolean booleanQueryParameter = uri.getBooleanQueryParameter("isBetBuilder", false);
                if (TextUtils.isEmpty(queryParameter11)) {
                    queryParameter11 = "sr:sport:1";
                }
                if (TextUtils.equals(queryParameter13, "betbuilder")) {
                    booleanQueryParameter = true;
                    queryParameter13 = null;
                }
                InstantWinInput instantWinInput = new InstantWinInput(queryParameter11, queryParameter12, queryParameter13, booleanQueryParameter);
                int i5 = InstantWinActivity.I;
                Intent intent15 = new Intent(this.a, (Class<?>) InstantWinActivity.class);
                intent15.putExtra("ARG_INPUT", instantWinInput);
                yrh0.r(this.a, intent15);
                return true;
            case 32:
                Intent intent16 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent16.setFlags(268435456);
                intent16.putExtra("select_bng_tab", true);
                intent16.putExtra("tab", 0);
                intent16.putExtra("tab_tag", "Sports");
                yrh0.r(this.a, intent16);
                return true;
            case 33:
                String queryParameter14 = uri.getQueryParameter("sportId");
                if (TextUtils.isEmpty(queryParameter14)) {
                    queryParameter14 = "sr:sport:1000";
                }
                InstantRacingEventInput instantRacingEventInput = new InstantRacingEventInput(queryParameter14);
                int i6 = InstantRacingEventActivity.w;
                Intent intent17 = new Intent(this.a, (Class<?>) InstantRacingEventActivity.class);
                intent17.setFlags(67108864);
                intent17.putExtra("ARG_INPUT", instantRacingEventInput);
                yrh0.r(this.a, intent17);
                return true;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                String queryParameter15 = uri.getQueryParameter("sportId");
                if (TextUtils.isEmpty(queryParameter15)) {
                    queryParameter15 = "sr:sport:10000";
                }
                ScheduledFootballInput scheduledFootballInput = new ScheduledFootballInput(queryParameter15);
                int i7 = ScheduledFootballActivity.v;
                yrh0.r(this.a, ScheduledFootballActivity.a.a(this.a, scheduledFootballInput));
                return true;
            case 35:
                String queryParameter16 = uri.getQueryParameter("sportId");
                boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("isBetBuilder", false);
                if (TextUtils.isEmpty(queryParameter16)) {
                    queryParameter16 = "sr:sport:3";
                }
                yrh0.r(this.a, SportyLegendsActivity.z1(this.a, new SportyLegendsInput(null, queryParameter16, booleanQueryParameter2)));
                return true;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                String queryParameter17 = uri.getQueryParameter("sportId");
                if (TextUtils.isEmpty(queryParameter17)) {
                    queryParameter17 = "sr:sport:1-2";
                }
                SportyPenaltyInput sportyPenaltyInput = new SportyPenaltyInput(queryParameter17);
                int i8 = SportyPenaltyActivity.w;
                Intent intent18 = new Intent(this.a, (Class<?>) SportyPenaltyActivity.class);
                intent18.setFlags(603979776);
                intent18.putExtra("ARG_INPUT", sportyPenaltyInput);
                yrh0.r(this.a, intent18);
                return true;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                if (!ActivityManager.isUserAMonkey()) {
                    String queryParameter18 = uri.getQueryParameter("linkUrl");
                    if (TextUtils.isEmpty(queryParameter18)) {
                        queryParameter18 = this.i.h("/m/virtual?v4=true");
                    }
                    VirtualGameInput virtualGameInput = new VirtualGameInput(queryParameter18, com.sportybet.core.domain.model.c.f.getId(), R.string.common_games__golden_virtuals);
                    Context context4 = this.a;
                    int i9 = VirtualGameActivity.C;
                    Intent intent19 = new Intent(context4, (Class<?>) VirtualGameActivity.class);
                    intent19.putExtra("ARG_INPUT", virtualGameInput);
                    yrh0.r(this.a, intent19);
                    return true;
                }
                return true;
            case 38:
                if (!ActivityManager.isUserAMonkey()) {
                    String queryParameter19 = uri.getQueryParameter("linkUrl");
                    if (TextUtils.isEmpty(queryParameter19)) {
                        queryParameter19 = this.i.h("/m/virtual");
                    }
                    VirtualGameInput virtualGameInput2 = new VirtualGameInput(queryParameter19, com.sportybet.core.domain.model.c.VirtualSportsGame.getId(), R.string.common_games__scheduled_virtuals);
                    Context context5 = this.a;
                    int i10 = VirtualGameActivity.C;
                    Intent intent20 = new Intent(context5, (Class<?>) VirtualGameActivity.class);
                    intent20.putExtra("ARG_INPUT", virtualGameInput2);
                    yrh0.r(this.a, intent20);
                    return true;
                }
                return true;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                yrh0.t(this.a, ResultsActivity.class, true);
                return true;
            case 40:
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                Intent intentA = a();
                if (intentA != null) {
                    yrh0.r(this.a, intentA);
                    return true;
                }
                return true;
            case 41:
                g();
                return true;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                yrh0.t(this.a, SelfExclusionActivity.class, true);
                return true;
            case 43:
                this.h.get().e(uri.getQueryParameter("linkUrl"));
                return true;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                Activity activityE2 = oti.c().e();
                if (activityE2 != null) {
                    String simpleName = activityE2.getClass().getSimpleName();
                    if (TextUtils.equals(simpleName, "WebViewActivity") || TextUtils.equals(simpleName, "LiveGameActivity") || TextUtils.equals(simpleName, "VirtualGameActivity")) {
                        activityE2.finish();
                        return true;
                    }
                }
                return true;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (!ActivityManager.isUserAMonkey()) {
                    String queryParameter20 = uri.getQueryParameter("gameUrl");
                    if (TextUtils.isEmpty(queryParameter20)) {
                        queryParameter20 = bjb0.S("/m/livegames");
                    }
                    Context context6 = this.a;
                    int i11 = LiveGameActivity.B;
                    Intent intent21 = new Intent(context6, (Class<?>) LiveGameActivity.class);
                    intent21.setFlags(268435456);
                    intent21.putExtra("URL", queryParameter20);
                    context6.startActivity(intent21);
                    return true;
                }
                return true;
            case 46:
            case 47:
                VirtualLobbyInput virtualLobbyInput = new VirtualLobbyInput(uri.getQueryParameter("tab"));
                Context context7 = this.a;
                int i12 = VirtualLobbyActivity.E;
                Intent intent22 = new Intent(context7, (Class<?>) VirtualLobbyActivity.class);
                intent22.putExtra("ARG_INPUT", virtualLobbyInput);
                yrh0.s(this.a, intent22, true);
                return true;
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                e(this.a, uri, sender);
                return true;
            case 55:
            case 61:
                Intent intent23 = new Intent(this.a, (Class<?>) PreMatchSportActivity.class);
                String queryParameter21 = uri.getQueryParameter("sportId");
                if (TextUtils.isEmpty(queryParameter21)) {
                    queryParameter21 = "sr:sport:1";
                }
                String queryParameter22 = uri.getQueryParameter("timeline");
                if (!TextUtils.isEmpty(queryParameter22) && !TextUtils.isEmpty(queryParameter22.trim())) {
                    try {
                        intent23.putExtra("key_sport_time", Long.parseLong(queryParameter22.trim()));
                        break;
                    } catch (Exception unused) {
                    }
                }
                String queryParameter23 = uri.getQueryParameter("betslipMode");
                if (!TextUtils.isEmpty(queryParameter23)) {
                    intent23.putExtra("key_bet_slip_mode", queryParameter23);
                }
                String queryParameter24 = uri.getQueryParameter(AnalyticsParam.EVENT_PATH);
                if (!TextUtils.isEmpty(queryParameter24)) {
                    intent23.putExtra("key_live_list_mode", queryParameter24);
                }
                String queryParameter25 = uri.getQueryParameter("marketId");
                if (!TextUtils.isEmpty(queryParameter25)) {
                    intent23.putExtra("key_market_id", queryParameter25);
                }
                String queryParameter26 = uri.getQueryParameter("tournamentId");
                if (!TextUtils.isEmpty(queryParameter26)) {
                    intent23.putStringArrayListExtra("key_tournament_ids", new ArrayList<>(Arrays.asList(queryParameter26.split(","))));
                }
                intent23.putExtra("key_sport_id", queryParameter21);
                yrh0.r(this.a, intent23);
                return true;
            case 56:
                Activity activityD7 = oti.c().d();
                if (activityD7 != null) {
                    this.e.demandAccount(activityD7, new d(bundle));
                    return true;
                }
                return true;
            case 57:
                yrh0.t(this.a, JackpotPlaceBetActivity.class, true);
                return true;
            case 58:
                Intent intent24 = new Intent(this.a, (Class<?>) LivePageActivity.class);
                FilterOrigin filterOriginByOriginName = FilterOrigin.INSTANCE.getFilterOriginByOriginName(uri.getQueryParameter("filterOrigin"));
                if (filterOriginByOriginName != null) {
                    intent24.putExtra("key_live_tab_filter_origin", filterOriginByOriginName);
                }
                yrh0.r(this.a, intent24);
                return true;
            case 59:
                Activity activityD8 = oti.c().d();
                if (activityD8 != null) {
                    this.e.demandAccount(activityD8, new e(bundle, uri));
                    return true;
                }
                return true;
            case 60:
                yrh0.t(this.a, TxFixStatusActivity.class, true);
                return true;
            case 62:
                Intent intent25 = new Intent(this.a, (Class<?>) CodeHubActivity.class);
                iz7 iz7Var = iz7.a;
                intent25.putExtra("tab_selection", "LOAD_CODES");
                yrh0.r(this.a, intent25);
                return true;
            case 63:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 65:
            case 66:
                this.h.get().e(bjb0.S("/m/my_accounts/sportycoins"));
                return true;
            case 67:
                Activity activityE3 = oti.c().e();
                Intent intent26 = new Intent(this.a, (Class<?>) MainActivity.class);
                intent26.setFlags(268435456);
                intent26.putExtra("tab", 4);
                this.a.startActivity(intent26);
                this.e.demandAccount(activityE3, new b(bundle));
                return true;
            case 68:
                hp0 hp0Var = hp0.A;
                if (vn20.c("swipe_bet", "pref_key_show_user_preference", false)) {
                    intent2 = new Intent(hp0Var, (Class<?>) SwipeBetActivity.class);
                    intent2.setFlags(335544320);
                } else {
                    Intent intent27 = new Intent(hp0Var, (Class<?>) SwipeBetSettingActivity.class);
                    intent27.setFlags(268435456);
                    vn20.g("swipe_bet", "pref_key_show_user_preference", true, true);
                    intent2 = intent27;
                }
                hp0Var.startActivity(intent2);
                return true;
            case 69:
                this.h.get().e(o7d.a(wae.a.a(uri.getQueryParameter("key_action"))));
                return true;
            case 70:
                if (b()) {
                    izw.b(null);
                    return true;
                }
                Activity activityE4 = oti.c().e();
                if (activityE4 != null) {
                    this.e.demandAccount(activityE4, new tit() { // from class: x7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            h8d h8dVar = this.a;
                            if (h8dVar.b()) {
                                h8dVar.e.refreshMyFavoriteSelectedSports(new dg9());
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 71:
                if (b()) {
                    izw.c(null);
                    return true;
                }
                Activity activityE5 = oti.c().e();
                if (activityE5 != null) {
                    this.e.demandAccount(activityE5, new tit() { // from class: v7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            h8d h8dVar = this.a;
                            if (h8dVar.b()) {
                                h8dVar.e.refreshMyFavoriteSelectedSports(new j8d());
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 72:
                yrh0.r(this.a, new Intent(this.a, (Class<?>) SportySimPromotionDialogActivity.class));
                return true;
            case 73:
                Context context8 = this.a;
                int i13 = AccountActivationActivity.z;
                Intent intentPutExtra = new Intent(context8, (Class<?>) AccountActivationActivity.class).putExtra("action", 55688);
                intentPutExtra.getClass();
                yrh0.s(context8, intentPutExtra, true);
                return true;
            case 74:
                Context context9 = this.a;
                int i14 = AccountActivationActivity.z;
                Intent intentPutExtra2 = new Intent(context9, (Class<?>) AccountActivationActivity.class).putExtra("action", 66799);
                intentPutExtra2.getClass();
                yrh0.s(context9, intentPutExtra2, true);
                return true;
            case 75:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("title_id", R.string.common_helps__title_t_and_c);
                this.h.get().c(bjb0.S("/m/help#/about/terms-and-conditions"), bundle2);
                return true;
            case 76:
                Bundle bundle3 = new Bundle();
                bundle3.putInt("title_id", R.string.common_helps__privacy);
                this.h.get().c(bjb0.S("/m/help#/about/privacy-policy"), bundle3);
                return true;
            case 77:
                this.g.d(Uri.parse("sportybet://deposit/pix"));
                return true;
            case 78:
                if (bundle != null && bundle.containsKey("launchUrl")) {
                    this.h.get().e(bundle.getString("launchUrl"));
                    return true;
                }
                return true;
            case 79:
                KycSource kycSource = KycSource.ANNOYING;
                if (bundle != null) {
                    String string2 = bundle.getString("kyc_source");
                    KycSource kycSourceFromValue = KycSource.fromValue(string2);
                    if (kycSourceFromValue != null) {
                        kycSource = kycSourceFromValue;
                    } else if (string2 != null) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_UI_ROUTER);
                        aVar2.n("unknown kyc_source '%s', falling back to %s", string2, kycSource.getValue());
                    }
                }
                Context context10 = this.a;
                int i15 = a.b[this.b.getCountryCode().ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        yrh0.t(context10, KYCActivity.class, true);
                        return true;
                    }
                    yrh0.t(context10, ConfirmAccountInfoActivity.class, true);
                    return true;
                }
                String str6 = "kyc_collect_token=;accessToken=" + this.e.getLastAccessToken();
                RegistrationKYCWebViewActivity.y.getClass();
                yrh0.s(context10, RegistrationKYCWebViewActivity.b.a(context10, kycSource, str6, false), true);
                return true;
            case 80:
                String str7 = "kyc_collect_token=;accessToken=" + this.e.getLastAccessToken();
                Context context11 = this.a;
                KycSource kycSource2 = KycSource.REGISTRATION;
                RegistrationKYCWebViewActivity.y.getClass();
                yrh0.s(this.a, RegistrationKYCWebViewActivity.b.a(context11, kycSource2, str7, false), true);
                return true;
            case 81:
                if (!this.b.n()) {
                    c();
                    return true;
                }
                Activity activityE6 = oti.c().e();
                if (activityE6 == null) {
                    activityE6 = oti.c().d();
                }
                if (activityE6 != null) {
                    this.e.demandAccount(activityE6, new tit() { // from class: w7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            if (account != null) {
                                h8d h8dVar = this.a;
                                h8dVar.l.p1().G(new k8d(h8dVar));
                            }
                        }
                    });
                    return true;
                }
                if (b()) {
                    this.l.p1().G(new k8d(this));
                    return true;
                }
                c();
                return true;
            case 82:
                Intent intent28 = new Intent(this.a, (Class<?>) MultiMakerActivity.class);
                if (bundle != null) {
                    intent28.putExtras(bundle);
                }
                yrh0.s(this.a, intent28, true);
                return true;
            case 83:
            case 84:
            case 85:
                if (waeVarA.a.equals(AnalyticsParam.SOCIAL_ACTION_TYPE_MEDIA)) {
                    str4 = "destination";
                    queryParameter = uri.getQueryParameter(str4);
                } else {
                    str4 = "destination";
                    queryParameter = waeVarA.a;
                }
                String str8 = queryParameter;
                String queryParameter27 = uri.getQueryParameter("from");
                String queryParameter28 = uri.getQueryParameter(AnalyticsParam.EVENT_PARAM_ID);
                String queryParameter29 = uri.getQueryParameter("type");
                boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("multiTab", true);
                Boolean boolValueOf = Boolean.valueOf(booleanQueryParameter3);
                boolean zIsEmpty2 = TextUtils.isEmpty(queryParameter28);
                String str9 = str4;
                Context context12 = this.a;
                if (zIsEmpty2) {
                    if ((!TextUtils.isEmpty(str8) && !str8.equals("tv-streams")) || b()) {
                        SportyMediaActivity.z1(context12, queryParameter27, str8, booleanQueryParameter3);
                        return true;
                    }
                    Activity activityD9 = oti.c().d();
                    if (activityD9 != null) {
                        this.e.demandAccount(activityD9, new i8d(this, context12, queryParameter27, str8, boolValueOf));
                        return true;
                    }
                    return true;
                }
                String str10 = waeVarA.a;
                int i16 = SportyMediaActivity.b;
                queryParameter28.getClass();
                queryParameter29.getClass();
                Intent intent29 = new Intent(context12, (Class<?>) SportyMediaActivity.class);
                if (!(context12 instanceof Activity)) {
                    intent29.setFlags(268435456);
                }
                intent29.putExtra("from", queryParameter27);
                intent29.putExtra(str9, str10);
                intent29.putExtra("articleId", queryParameter28);
                intent29.putExtra("articleType", queryParameter29);
                context12.startActivity(intent29);
                return true;
            case 86:
                Intent intent30 = new Intent(this.a, (Class<?>) CodeHubActivity.class);
                String string3 = bundle != null ? bundle.getString("tab_selection", "") : "";
                if (TextUtils.isEmpty(string3)) {
                    string3 = uri.getQueryParameter("tab_selection");
                }
                intent30.putExtra("tab_selection", string3 != null ? string3 : "");
                if (bundle != null) {
                    intent30.putExtra("action_load_booking_code_from", bundle.getString("action_load_booking_code_from"));
                }
                yrh0.s(this.a, intent30, true);
                return true;
            case 88:
                u2u u2uVar = this.d;
                Function1 function1 = new Function1() { // from class: a8d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context13 = this.a.a;
                        if (((Boolean) obj).booleanValue()) {
                            Uri uri2 = uri;
                            String queryParameter30 = uri2.getQueryParameter("tab");
                            String queryParameter31 = uri2.getQueryParameter("scrollToBetslip");
                            Intent intent31 = new Intent(context13, (Class<?>) LoyaltyActivity.class);
                            intent31.putExtra("tab", queryParameter30);
                            intent31.putExtra("scrollToBetslip", "true".equals(queryParameter31));
                            yrh0.s(context13, intent31, true);
                        }
                        return Unit.a;
                    }
                };
                zu7.a aVar3 = zu7.a;
                pfd pfdVar = fse.a;
                ej5.c(zu7.b(gku.a), null, null, new l2u(u2uVar, function1, null), 3);
                return true;
            case 89:
                String queryParameter30 = uri.getQueryParameter("user");
                String queryParameter31 = uri.getQueryParameter(EventKeys.ERROR_CODE);
                if (TextUtils.isEmpty(queryParameter30)) {
                    return false;
                }
                Context context13 = this.a;
                boolean z = !TextUtils.isEmpty(queryParameter31);
                int i17 = SocialActivity.b;
                yrh0.s(this.a, SocialActivity.a.a(context13, queryParameter30, false, queryParameter31, false, z, null), true);
                return true;
            case 90:
                String queryParameter32 = uri.getQueryParameter(EventKeys.ERROR_CODE);
                Intent intent31 = new Intent(this.a, (Class<?>) VerifyBetActivity.class);
                if (!TextUtils.isEmpty(queryParameter32)) {
                    intent31.putExtra(EventKeys.ERROR_CODE, queryParameter32);
                }
                yrh0.s(this.a, intent31, true);
                return true;
            case 91:
                String queryParameter33 = uri.getQueryParameter("key");
                Context context14 = this.a;
                int i18 = SearchActivity.c;
                Intent intent32 = new Intent(context14, (Class<?>) SearchActivity.class);
                if (queryParameter33 != null && !StringsKt.U(queryParameter33)) {
                    intent32.putExtra("key", queryParameter33);
                }
                yrh0.s(this.a, intent32, true);
                return true;
            case 92:
                Intent intent33 = new Intent(this.a, (Class<?>) SettingsActivity.class);
                intent33.putExtra("destination_in_settings", "bio_auth_entry_route");
                yrh0.s(this.a, intent33, true);
                return true;
            case 93:
                String queryParameter34 = uri.getQueryParameter("reached_limits_key");
                Intent intent34 = new Intent(this.a, (Class<?>) ReachedLimitsActivity.class);
                intent34.putExtra("reached_limits_key", queryParameter34);
                yrh0.s(this.a, intent34, true);
                return true;
            case 94:
                String queryParameter35 = uri.getQueryParameter("key_limit_type");
                Intent intent35 = new Intent(this.a, (Class<?>) LimitsActivity.class);
                intent35.putExtra("key_limit_type", queryParameter35);
                yrh0.s(this.a, intent35, true);
                return true;
            case 95:
                String queryParameter36 = uri.getQueryParameter(LastLoginDeviceInfo.KEY_DEVICE);
                String queryParameter37 = uri.getQueryParameter("platform");
                String queryParameter38 = uri.getQueryParameter("ip");
                String queryParameter39 = uri.getQueryParameter(LastLoginDeviceInfo.KEY_LOCATION);
                Intent intent36 = new Intent(this.a, (Class<?>) SecurityActionActivity.class);
                intent36.putExtra("device_info_from_notification", new LastLoginDeviceInfo(queryParameter36, queryParameter37, queryParameter38, queryParameter39, ""));
                yrh0.s(this.a, intent36, true);
                return true;
            case 96:
                yrh0.s(this.a, new Intent(this.a, (Class<?>) TimeAlertReachedActivity.class), true);
                return true;
            case 97:
                Intent intent37 = new Intent(this.a, (Class<?>) SettingsActivity.class);
                intent37.putExtra("destination_in_settings", "notification_settings_match_alert_route");
                yrh0.s(this.a, intent37, true);
                return true;
            case 98:
                yrh0.s(this.a, new Intent(this.a, (Class<?>) NotificationSettingsActivity.class), true);
                return true;
            case 99:
                Activity activityE7 = oti.c().e();
                if (activityE7 != null) {
                    MyFavoriteBaseActivity.z1(activityE7, MyFavoriteTypeEnum.DEFAULT_STAKE);
                    return true;
                }
                return true;
            case 100:
                if (!this.j.a().b()) {
                    return false;
                }
                Context context15 = this.a;
                yrh0.s(context15, this.f.a(context15), true);
                return true;
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                String queryParameter40 = uri.getQueryParameter("ORDER_ID");
                Intent intent38 = new Intent(this.a, (Class<?>) RSportsBetTicketDetailsActivity.class);
                if (TextUtils.isEmpty(queryParameter40)) {
                    return false;
                }
                intent38.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, queryParameter40);
                yrh0.s(this.a, intent38, true);
                return true;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                Activity activityD10 = oti.c().d();
                if (activityD10 != null) {
                    this.e.demandAccount(activityD10, new tit() { // from class: b8d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            if (account != null) {
                                yrh0.t(this.a.a, SettingsActivity.class, true);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 104:
                Activity activityD11 = oti.c().d();
                if (activityD11 != null) {
                    final Intent intent39 = new Intent(this.a, (Class<?>) SettingsActivity.class);
                    intent39.putExtra("destination_in_settings", "multi_factor_auth_route");
                    this.e.demandAccount(activityD11, new tit() { // from class: c8d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            if (account != null) {
                                yrh0.s(this.a.a, intent39, true);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 105:
                Activity activityD12 = oti.c().d();
                if (activityD12 != null) {
                    this.e.demandAccount(activityD12, new tit() { // from class: d8d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            if (account != null) {
                                Context context16 = this.a.a;
                                int i19 = NameUpdateWebViewActivity.e;
                                NameUpdateWebViewActivity.a.a(context16);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 106:
                Activity activityD13 = oti.c().d();
                if (activityD13 != null) {
                    this.e.demandAccount(activityD13, new tit() { // from class: e8d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            if (account != null) {
                                Context context16 = this.a.a;
                                int i19 = ProfileActivity.b;
                                Intent intent40 = new Intent(context16, (Class<?>) ProfileActivity.class);
                                intent40.putExtra("start_route", "dob_graph");
                                yrh0.s(context16, intent40, true);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 107:
                Activity activityD14 = oti.c().d();
                if (activityD14 != null) {
                    this.e.demandAccount(activityD14, new tit() { // from class: f8d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            if (account != null) {
                                yrh0.t(this.a.a, BettingStreakActivity.class, true);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 108:
                Activity activityD15 = oti.c().d();
                if (activityD15 != null) {
                    this.e.demandAccount(activityD15, new tit() { // from class: t7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            Context context16 = this.a.a;
                            if (account != null) {
                                Intent intent40 = new Intent(context16, (Class<?>) RecapActivity.class);
                                intent40.putExtra("recap_destination", waeVarA.name());
                                intent40.addFlags(268435456);
                                context16.startActivity(intent40);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 109:
                Activity activityD16 = oti.c().d();
                if (activityD16 != null) {
                    int i19 = VerifyPhoneForBonusActivity.e;
                    activityD16.startActivity(new Intent(activityD16, (Class<?>) VerifyPhoneForBonusActivity.class));
                    return true;
                }
                return true;
            case 110:
                d(uri, bundle, sender);
                return true;
            case 111:
                String queryParameter41 = uri.getQueryParameter("lotteryId");
                if (TextUtils.isEmpty(queryParameter41)) {
                    return false;
                }
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                queryParameter41.getClass();
                ArrayList arrayListC = n5u.c(new l5u.c(queryParameter41, (String) null, (String) null, 6));
                int size = arrayListC.size();
                int i20 = 0;
                while (i20 < size) {
                    Object obj = arrayListC.get(i20);
                    i20++;
                    Pair pair = (Pair) obj;
                    builderClearQuery.appendQueryParameter((String) pair.a, (String) pair.b);
                }
                String queryParameter42 = uri.getQueryParameter("key-lucky-number-gif-id");
                if (queryParameter42 != null) {
                    builderClearQuery.appendQueryParameter("key-lucky-number-gif-id", queryParameter42);
                }
                d(builderClearQuery.build(), bundle, sender);
                return true;
            case 112:
                String queryParameter43 = uri.getQueryParameter("luckyWheelTypeId");
                if (!TextUtils.isEmpty(queryParameter43)) {
                    try {
                        i = Integer.parseInt(queryParameter43);
                    } catch (NumberFormatException e2) {
                        itf0.a aVar4 = itf0.a;
                        aVar4.q(MyLog.TAG_UI_ROUTER);
                        aVar4.o(e2);
                        i = 0;
                    }
                    break;
                } else {
                    i = 0;
                }
                Context context16 = this.a;
                Integer numValueOf = Integer.valueOf(i);
                int i21 = LuckyWheelActivity.e;
                Intent intent40 = new Intent(context16, (Class<?>) LuckyWheelActivity.class);
                intent40.putExtra("KEY_LW_TYPE", numValueOf);
                yrh0.s(context16, intent40, true);
                return true;
            case 113:
                this.h.get().e(this.i.c(new String[]{"help/about/terms-and-conditions/anti-money-laundering"}, new HashMap(), null));
                return true;
            case 114:
                Context context17 = this.a;
                int i22 = SportyTvRedirectActivity.c;
                Intent intentA2 = SportyTvRedirectActivity.a.a(context17);
                intentA2.addFlags(268435456);
                this.a.startActivity(intentA2);
                return true;
            case 115:
                Activity activityD17 = oti.c().d();
                if (activityD17 != null) {
                    final String queryParameter44 = uri.getQueryParameter("source");
                    if (!this.e.isLogin() && t.contains(queryParameter44)) {
                        a3k0 a3k0Var = this.o;
                        a3k0Var.getClass();
                        a3k0Var.a = Long.valueOf(System.currentTimeMillis());
                    }
                    this.e.demandAccount(activityD17, new tit() { // from class: g8d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            Context context18 = this.a.a;
                            if (account != null) {
                                Intent intent41 = new Intent(context18, (Class<?>) WorldCupPassActivity.class);
                                String str11 = queryParameter44;
                                if (str11 != null) {
                                    intent41.putExtra("source", str11);
                                }
                                intent41.addFlags(268435456);
                                context18.startActivity(intent41);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 116:
                Context context18 = this.a;
                int i23 = ChallengeActivity.e;
                yrh0.s(context18, new Intent(context18, (Class<?>) ChallengeActivity.class), true);
                return true;
            case 117:
                Context context19 = this.a;
                int i24 = WorldCupActivity.b;
                yrh0.s(context19, new Intent(context19, (Class<?>) WorldCupActivity.class), true);
                return true;
            case 118:
                Activity activityD18 = oti.c().d();
                if (activityD18 != null) {
                    this.e.demandAccount(activityD18, new tit() { // from class: y7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            Context context20 = this.a.a;
                            if (account != null) {
                                Intent intent41 = new Intent(context20, (Class<?>) ChangeUserInfoActivity.class);
                                intent41.putExtra("title_property", 5);
                                yrh0.s(context20, intent41, true);
                            }
                        }
                    });
                    return true;
                }
                return true;
            case 119:
                Activity activityD19 = oti.c().d();
                if (activityD19 != null) {
                    this.e.demandAccount(activityD19, new tit() { // from class: z7d
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z2) {
                            h8d h8dVar;
                            Intent intentA3;
                            if (account == null || (intentA3 = (h8dVar = this.a).a()) == null) {
                                return;
                            }
                            intentA3.putExtra("auto_open_email_edit", true);
                            yrh0.s(h8dVar.a, intentA3, true);
                        }
                    });
                    return true;
                }
                return true;
            case 120:
                oti otiVarC = oti.c();
                synchronized (otiVarC.b) {
                    try {
                        Iterator<Activity> it = otiVarC.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (next.isFinishing() || next.isDestroyed()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (next instanceof androidx.fragment.app.e) {
                    String queryParameter45 = uri.getQueryParameter("mobile");
                    String queryParameter46 = uri.getQueryParameter("token");
                    boolean z2 = Boolean.parseBoolean(uri.getQueryParameter("isForced"));
                    boolean z3 = Boolean.parseBoolean(uri.getQueryParameter("isSkippable"));
                    String queryParameter47 = uri.getQueryParameter("triggeredEvent");
                    this.p.a(((androidx.fragment.app.e) next).getSupportFragmentManager(), queryParameter45 != null ? queryParameter45 : "", queryParameter46 != null ? queryParameter46 : "", z2, z3, queryParameter47 != null ? queryParameter47 : "");
                    return true;
                }
                return true;
            case 121:
                Activity activityD20 = oti.c().d();
                if (activityD20 != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    String queryParameter48 = uri.getQueryParameter("tournamentId");
                    if (!TextUtils.isEmpty(queryParameter48)) {
                        arrayList.addAll(Arrays.asList(queryParameter48.split(",")));
                    }
                    sender.getClass();
                    switch (n7d0.a[sender.ordinal()]) {
                        case 1:
                            str5 = "az_menu";
                            break;
                        case 2:
                            str5 = "story";
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            str5 = "home";
                            break;
                        case 7:
                            str5 = "open_bets";
                            break;
                        default:
                            str5 = null;
                            break;
                    }
                    int i25 = SportyPicksActivity.c;
                    Intent intent41 = new Intent(activityD20, (Class<?>) SportyPicksActivity.class);
                    if (!arrayList.isEmpty()) {
                        intent41.putStringArrayListExtra("key_tournament_ids", arrayList);
                    }
                    if (str5 != null) {
                        intent41.putExtra("key_source", str5);
                    }
                    activityD20.startActivity(intent41);
                    return true;
                }
                return true;
        }
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public int priority() {
        return 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sportybet.tech.uibus.UIRouter
    public boolean verifyUri(Uri uri, String str, String str2) {
        if (TextUtils.equals("sportybet", str)) {
            wae.b.getClass();
            wae waeVarA = wae.a.a(str2);
            if (waeVarA != null) {
                switch (waeVarA.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    case 24:
                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    case RuntimeVersion.MINOR /* 26 */:
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case 30:
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    case 35:
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 38:
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 40:
                    case 41:
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    case 43:
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                    case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                    case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                        return true;
                    case 17:
                        if (uri.getQueryParameter("key_sport_id") == null) {
                            return true;
                        }
                        lfb0 lfb0VarD = lfb0.d();
                        return lfb0VarD.d.containsKey(uri.getQueryParameter("key_sport_id"));
                    case 68:
                        if (this.a.getResources().getDisplayMetrics().widthPixels >= 720) {
                            return true;
                        }
                        break;
                    case 69:
                        if (uri.getQueryParameter("key_feature_id") != null && uri.getQueryParameter("key_action") != null) {
                            String queryParameter = uri.getQueryParameter("key_action");
                            if (this.k.a(uri.getQueryParameter("key_feature_id")) && this.h.get().h(false, o7d.b(wae.a.a(queryParameter), null))) {
                                return true;
                            }
                        }
                        break;
                    case 100:
                        return this.j.a().b();
                }
            }
        }
        return false;
    }

    public final void f(Uri uri) {
        String queryParameter = uri.getQueryParameter("imageUri");
        String queryParameter2 = uri.getQueryParameter("imageWithUserUri");
        String queryParameter3 = uri.getQueryParameter("linkUrl");
        String queryParameter4 = uri.getQueryParameter("hideCopy");
        String queryParameter5 = uri.getQueryParameter("quote");
        String queryParameter6 = uri.getQueryParameter("hashtag");
        String queryParameter7 = uri.getQueryParameter("type");
        String queryParameter8 = uri.getQueryParameter("orderId");
        String queryParameter9 = uri.getQueryParameter("shareCode");
        String queryParameter10 = uri.getQueryParameter("customCode");
        String queryParameter11 = uri.getQueryParameter("username");
        String queryParameter12 = uri.getQueryParameter("avatarUri");
        String queryParameter13 = uri.getQueryParameter("alreadyPublished");
        String queryParameter14 = uri.getQueryParameter("enableSocialButton");
        String queryParameter15 = uri.getQueryParameter("hasLiveOrSettledEvent");
        String str = LhMGMAwwhzjwfz.BNq;
        String queryParameter16 = uri.getQueryParameter(str);
        String queryParameter17 = uri.getQueryParameter("platforms");
        String queryParameter18 = uri.getQueryParameter("startDestination");
        String queryParameter19 = uri.getQueryParameter("source");
        String queryParameter20 = uri.getQueryParameter("isSingleBetBuilder");
        String queryParameter21 = uri.getQueryParameter("title");
        String queryParameter22 = uri.getQueryParameter("titleStyle");
        String queryParameter23 = uri.getQueryParameter("titleBottomPadding");
        String queryParameter24 = uri.getQueryParameter("userNote");
        String queryParameter25 = uri.getQueryParameter("showOffType");
        String queryParameter26 = uri.getQueryParameter("ticketDetailImageUri");
        String queryParameter27 = uri.getQueryParameter("winPopupImageUri");
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) ShareCodeActivity.class);
        if (!TextUtils.isEmpty(queryParameter)) {
            intent.putExtra("imageUri", queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            intent.putExtra("imageWithUserUri", queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter4)) {
            intent.putExtra("hideCopy", true);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            intent.putExtra("linkUrl", queryParameter3);
        }
        if (!TextUtils.isEmpty(queryParameter5)) {
            intent.putExtra("quote", queryParameter5);
        }
        if (!TextUtils.isEmpty(queryParameter6)) {
            intent.putExtra("hashtag", queryParameter6);
        }
        if (!TextUtils.isEmpty(queryParameter7)) {
            intent.putExtra("type", queryParameter7);
        }
        if (!TextUtils.isEmpty(queryParameter8)) {
            intent.putExtra("orderId", queryParameter8);
        }
        if (!TextUtils.isEmpty(queryParameter9)) {
            intent.putExtra("shareCode", queryParameter9);
        }
        if (!TextUtils.isEmpty(queryParameter10)) {
            intent.putExtra("customCode", queryParameter10);
        }
        if (!TextUtils.isEmpty(queryParameter11)) {
            intent.putExtra("username", queryParameter11);
        }
        if (!TextUtils.isEmpty(queryParameter12)) {
            intent.putExtra("avatarUri", queryParameter12);
        }
        if (!TextUtils.isEmpty(queryParameter14)) {
            intent.putExtra("enableSocialButton", Boolean.parseBoolean(queryParameter14));
        }
        if (!TextUtils.isEmpty(queryParameter13)) {
            intent.putExtra("alreadyPublished", Boolean.parseBoolean(queryParameter13));
        }
        if (!TextUtils.isEmpty(queryParameter15)) {
            intent.putExtra("hasLiveOrSettledEvent", Boolean.parseBoolean(queryParameter15));
        }
        if (!TextUtils.isEmpty(queryParameter16)) {
            intent.putExtra(str, queryParameter16);
        }
        if (!TextUtils.isEmpty(queryParameter17)) {
            intent.putExtra("platforms", queryParameter17);
        }
        if (!TextUtils.isEmpty(queryParameter18)) {
            intent.putExtra("startDestination", queryParameter18);
        }
        if (!TextUtils.isEmpty(queryParameter19)) {
            intent.putExtra("source", queryParameter19);
        }
        if (!TextUtils.isEmpty(queryParameter20)) {
            intent.putExtra("isSingleBetBuilder", Boolean.parseBoolean(queryParameter20));
        }
        if (!TextUtils.isEmpty(queryParameter21)) {
            intent.putExtra("title", queryParameter21);
        }
        if (!TextUtils.isEmpty(queryParameter22)) {
            intent.putExtra("titleStyle", Integer.parseInt(queryParameter22));
        }
        if (!TextUtils.isEmpty(queryParameter23)) {
            intent.putExtra("titleBottomPadding", Integer.parseInt(queryParameter23));
        }
        if (!TextUtils.isEmpty(queryParameter24)) {
            intent.putExtra("userNote", queryParameter24);
        }
        if (!TextUtils.isEmpty(queryParameter25)) {
            intent.putExtra("showOffType", queryParameter25);
        }
        if (!TextUtils.isEmpty(queryParameter26)) {
            intent.putExtra("ticketDetailImageUri", queryParameter26);
        }
        if (!TextUtils.isEmpty(queryParameter27)) {
            intent.putExtra("winPopupImageUri", queryParameter27);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
