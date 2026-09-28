package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.chat.remote.models.ClaimRainRequest;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.remote.models.SendMessageRequest;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.pingpong.remote.models.TopWinResponse;
import com.sportygames.sportyherov2.remote.models.BetHistoryItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0215  */
    /* JADX WARN: Code duplicated, block: B:117:0x021d  */
    /* JADX WARN: Code duplicated, block: B:119:0x022b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0235  */
    /* JADX WARN: Code duplicated, block: B:123:0x023a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0240  */
    /* JADX WARN: Code duplicated, block: B:127:0x0245  */
    /* JADX WARN: Code duplicated, block: B:128:0x024b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0250  */
    /* JADX WARN: Code duplicated, block: B:132:0x025a  */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:216:0x0406  */
    /* JADX WARN: Code duplicated, block: B:218:0x0414  */
    /* JADX WARN: Code duplicated, block: B:219:0x041e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0423  */
    /* JADX WARN: Code duplicated, block: B:223:0x0429  */
    /* JADX WARN: Code duplicated, block: B:226:0x042e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0434  */
    /* JADX WARN: Code duplicated, block: B:230:0x0439  */
    /* JADX WARN: Code duplicated, block: B:231:0x0443  */
    /* JADX WARN: Code duplicated, block: B:234:0x0450  */
    /* JADX WARN: Code duplicated, block: B:242:0x0484  */
    /* JADX WARN: Code duplicated, block: B:245:0x048a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0495  */
    /* JADX WARN: Code duplicated, block: B:249:0x049b  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:255:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:256:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:260:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:264:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:265:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:268:0x0501  */
    /* JADX WARN: Code duplicated, block: B:269:0x050b  */
    /* JADX WARN: Code duplicated, block: B:280:0x054c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0552  */
    /* JADX WARN: Code duplicated, block: B:284:0x055d  */
    /* JADX WARN: Code duplicated, block: B:290:0x0574  */
    /* JADX WARN: Code duplicated, block: B:293:0x057a  */
    /* JADX WARN: Code duplicated, block: B:294:0x0585  */
    /* JADX WARN: Code duplicated, block: B:297:0x058b  */
    /* JADX WARN: Code duplicated, block: B:298:0x0592  */
    /* JADX WARN: Code duplicated, block: B:301:0x0598  */
    /* JADX WARN: Code duplicated, block: B:302:0x059f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Editable text;
        SendMessageRequest.Json json;
        String stakeAmount;
        String roundId;
        String payoutAmount;
        Double cashOutCoefficient;
        String betId;
        String stakeAmount2;
        String roundId2;
        String payoutAmount2;
        Double cashOutCoefficient2;
        String betId2;
        String strA;
        String roundId3;
        String betId3;
        Editable text2;
        BetHistoryItem betHistoryItem;
        Long lValueOf;
        BetHistoryItem betHistoryItem2;
        String currency;
        BetHistoryItem betHistoryItem3;
        Double dValueOf;
        String nickName;
        String strA2;
        BetHistoryItem betHistoryItem4;
        Double dValueOf2;
        BetHistoryItem betHistoryItem5;
        Long lValueOf2;
        BetHistoryItem betHistoryItem6;
        Double dValueOf3;
        BetHistoryItem betHistoryItem7;
        Double targetCoefficient;
        BetHistoryItem betHistoryItem8;
        String sideBetType;
        String roundId4;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem9;
        Long lValueOf3;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem10;
        Double cashoutCoefficient;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem11;
        String currency2;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem12;
        Double dValueOf4;
        String nickName2;
        String strA3;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem13;
        Double dValueOf5;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem14;
        Long lValueOf4;
        com.sportygames.crash.remote.models.BetHistoryItem betHistoryItem15;
        Double dValueOf6;
        String roundId5;
        String strA4;
        String roundId6;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem16;
        Long lValueOf5;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem17;
        Double cashoutCoefficient2;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem18;
        String currency3;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem19;
        Double dValueOf7;
        String nickName3;
        String strA5;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem20;
        Double dValueOf8;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem21;
        Long lValueOf6;
        com.sportygames.pingpong.remote.models.BetHistoryItem betHistoryItem22;
        Double dValueOf9;
        String roundId7;
        String strA6;
        String roundId8;
        Editable text3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.i) ((tng0) obj2)).e;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(tradeAdditionalResult);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                break;
            case 1:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                ((View) obj).getClass();
                if (!TextUtils.isEmpty(chatActivity.L)) {
                    ha7 ha7Var = (ha7) chatActivity.a;
                    if (String.valueOf((ha7Var == null || (text3 = ha7Var.K.getText()) == null) ? null : StringsKt.t0(text3)).length() != 0) {
                        boolean zM = StringsKt.M(chatActivity.W, "ShareChat:", false);
                        B b = chatActivity.a;
                        if (zM) {
                            ha7 ha7Var2 = (ha7) b;
                            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.t0(String.valueOf(ha7Var2 != null ? ha7Var2.K.getText() : null)).toString(), new String[]{"]"}, false, 0, 6, null);
                            String str = listSplit$default.size() > 1 ? (String) listSplit$default.get(1) : "";
                            if (c.l(chatActivity.getIntent().getStringExtra("share_data_type"), "bet_history", false)) {
                                BetHistoryItem betHistoryItem23 = chatActivity.c0;
                                if (Intrinsics.g(betHistoryItem23 != null ? betHistoryItem23.getSideBetType() : null, "OVER")) {
                                    String userImage = SportyGamesManager.getInstance().getUserImage();
                                    betHistoryItem = chatActivity.c0;
                                    if (betHistoryItem != null) {
                                        lValueOf = Long.valueOf(betHistoryItem.getId());
                                    } else {
                                        lValueOf = null;
                                    }
                                    betHistoryItem2 = chatActivity.c0;
                                    if (betHistoryItem2 != null) {
                                        currency = betHistoryItem2.getCurrency();
                                    } else {
                                        currency = null;
                                    }
                                    betHistoryItem3 = chatActivity.c0;
                                    if (betHistoryItem3 != null) {
                                        dValueOf = Double.valueOf(betHistoryItem3.getHouseCoefficient());
                                    } else {
                                        dValueOf = null;
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    nickName = SportyGamesManager.getInstance().getNickName();
                                    if (nickName != null || nickName.length() == 0) {
                                        strA2 = "";
                                    } else {
                                        strA2 = nickName.length() == 1 ? tug.a(nickName, "***", nickName) : nickName.charAt(0) + "***" + nickName.charAt(nickName.length() - 1);
                                    }
                                    betHistoryItem4 = chatActivity.c0;
                                    if (betHistoryItem4 != null) {
                                        dValueOf2 = Double.valueOf(betHistoryItem4.getPayoutAmount());
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    betHistoryItem5 = chatActivity.c0;
                                    if (betHistoryItem5 != null || (roundId4 = betHistoryItem5.getRoundId()) == null) {
                                        lValueOf2 = null;
                                    } else {
                                        lValueOf2 = Long.valueOf(Long.parseLong(roundId4));
                                    }
                                    betHistoryItem6 = chatActivity.c0;
                                    if (betHistoryItem6 != null) {
                                        dValueOf3 = Double.valueOf(betHistoryItem6.getStakeAmount());
                                    } else {
                                        dValueOf3 = null;
                                    }
                                    betHistoryItem7 = chatActivity.c0;
                                    if (betHistoryItem7 != null) {
                                        targetCoefficient = betHistoryItem7.getTargetCoefficient();
                                    } else {
                                        targetCoefficient = null;
                                    }
                                    betHistoryItem8 = chatActivity.c0;
                                    if (betHistoryItem8 != null) {
                                        sideBetType = betHistoryItem8.getSideBetType();
                                    } else {
                                        sideBetType = null;
                                    }
                                    json = new SendMessageRequest.Json(userImage, lValueOf, null, currency, dValueOf, bool, str, strA2, dValueOf2, lValueOf2, dValueOf3, targetCoefficient, "over-under", sideBetType, null, null, null, 114688, null);
                                } else {
                                    BetHistoryItem betHistoryItem24 = chatActivity.c0;
                                    if (Intrinsics.g(betHistoryItem24 != null ? betHistoryItem24.getSideBetType() : null, "UNDER")) {
                                        String userImage2 = SportyGamesManager.getInstance().getUserImage();
                                        betHistoryItem = chatActivity.c0;
                                        if (betHistoryItem != null) {
                                            lValueOf = Long.valueOf(betHistoryItem.getId());
                                        } else {
                                            lValueOf = null;
                                        }
                                        betHistoryItem2 = chatActivity.c0;
                                        if (betHistoryItem2 != null) {
                                            currency = betHistoryItem2.getCurrency();
                                        } else {
                                            currency = null;
                                        }
                                        betHistoryItem3 = chatActivity.c0;
                                        if (betHistoryItem3 != null) {
                                            dValueOf = Double.valueOf(betHistoryItem3.getHouseCoefficient());
                                        } else {
                                            dValueOf = null;
                                        }
                                        Boolean bool2 = Boolean.FALSE;
                                        nickName = SportyGamesManager.getInstance().getNickName();
                                        if (nickName != null) {
                                            strA2 = "";
                                        } else {
                                            strA2 = "";
                                        }
                                        betHistoryItem4 = chatActivity.c0;
                                        if (betHistoryItem4 != null) {
                                            dValueOf2 = Double.valueOf(betHistoryItem4.getPayoutAmount());
                                        } else {
                                            dValueOf2 = null;
                                        }
                                        betHistoryItem5 = chatActivity.c0;
                                        if (betHistoryItem5 != null) {
                                            lValueOf2 = null;
                                        } else {
                                            lValueOf2 = null;
                                        }
                                        betHistoryItem6 = chatActivity.c0;
                                        if (betHistoryItem6 != null) {
                                            dValueOf3 = Double.valueOf(betHistoryItem6.getStakeAmount());
                                        } else {
                                            dValueOf3 = null;
                                        }
                                        betHistoryItem7 = chatActivity.c0;
                                        if (betHistoryItem7 != null) {
                                            targetCoefficient = betHistoryItem7.getTargetCoefficient();
                                        } else {
                                            targetCoefficient = null;
                                        }
                                        betHistoryItem8 = chatActivity.c0;
                                        if (betHistoryItem8 != null) {
                                            sideBetType = betHistoryItem8.getSideBetType();
                                        } else {
                                            sideBetType = null;
                                        }
                                        json = new SendMessageRequest.Json(userImage2, lValueOf, null, currency, dValueOf, bool2, str, strA2, dValueOf2, lValueOf2, dValueOf3, targetCoefficient, "over-under", sideBetType, null, null, null, 114688, null);
                                    } else {
                                        BetHistoryItem betHistoryItem25 = chatActivity.c0;
                                        if ((betHistoryItem25 != null ? betHistoryItem25.getStartCoefficient() : null) != null) {
                                            BetHistoryItem betHistoryItem26 = chatActivity.c0;
                                            if ((betHistoryItem26 != null ? betHistoryItem26.getEndCoefficient() : null) != null) {
                                                String userImage3 = SportyGamesManager.getInstance().getUserImage();
                                                BetHistoryItem betHistoryItem27 = chatActivity.c0;
                                                Long lValueOf7 = betHistoryItem27 != null ? Long.valueOf(betHistoryItem27.getId()) : null;
                                                BetHistoryItem betHistoryItem28 = chatActivity.c0;
                                                String currency4 = betHistoryItem28 != null ? betHistoryItem28.getCurrency() : null;
                                                BetHistoryItem betHistoryItem29 = chatActivity.c0;
                                                Double dValueOf10 = betHistoryItem29 != null ? Double.valueOf(betHistoryItem29.getHouseCoefficient()) : null;
                                                Boolean bool3 = Boolean.FALSE;
                                                String nickName4 = SportyGamesManager.getInstance().getNickName();
                                                if (nickName4 == null || nickName4.length() == 0) {
                                                    strA6 = "";
                                                } else {
                                                    strA6 = nickName4.length() == 1 ? tug.a(nickName4, "***", nickName4) : nickName4.charAt(0) + "***" + nickName4.charAt(nickName4.length() - 1);
                                                }
                                                BetHistoryItem betHistoryItem30 = chatActivity.c0;
                                                Double dValueOf11 = betHistoryItem30 != null ? Double.valueOf(betHistoryItem30.getPayoutAmount()) : null;
                                                BetHistoryItem betHistoryItem31 = chatActivity.c0;
                                                Long lValueOf8 = (betHistoryItem31 == null || (roundId8 = betHistoryItem31.getRoundId()) == null) ? null : Long.valueOf(Long.parseLong(roundId8));
                                                BetHistoryItem betHistoryItem32 = chatActivity.c0;
                                                Double dValueOf12 = betHistoryItem32 != null ? Double.valueOf(betHistoryItem32.getStakeAmount()) : null;
                                                BetHistoryItem betHistoryItem33 = chatActivity.c0;
                                                Double startCoefficient = betHistoryItem33 != null ? betHistoryItem33.getStartCoefficient() : null;
                                                BetHistoryItem betHistoryItem34 = chatActivity.c0;
                                                json = new SendMessageRequest.Json(userImage3, lValueOf7, null, currency4, dValueOf10, bool3, str, strA6, dValueOf11, lValueOf8, dValueOf12, null, "range", "RANGE", startCoefficient, betHistoryItem34 != null ? betHistoryItem34.getEndCoefficient() : null, null, 65536, null);
                                            } else if (c.l(chatActivity.d, "ping pong", true)) {
                                                String userImage4 = SportyGamesManager.getInstance().getUserImage();
                                                betHistoryItem16 = chatActivity.d0;
                                                if (betHistoryItem16 != null) {
                                                    lValueOf5 = Long.valueOf(betHistoryItem16.getId());
                                                } else {
                                                    lValueOf5 = null;
                                                }
                                                betHistoryItem17 = chatActivity.d0;
                                                if (betHistoryItem17 != null) {
                                                    cashoutCoefficient2 = betHistoryItem17.getCashoutCoefficient();
                                                } else {
                                                    cashoutCoefficient2 = null;
                                                }
                                                betHistoryItem18 = chatActivity.d0;
                                                if (betHistoryItem18 != null) {
                                                    currency3 = betHistoryItem18.getCurrency();
                                                } else {
                                                    currency3 = null;
                                                }
                                                betHistoryItem19 = chatActivity.d0;
                                                if (betHistoryItem19 != null) {
                                                    dValueOf7 = Double.valueOf(betHistoryItem19.getHouseCoefficient());
                                                } else {
                                                    dValueOf7 = null;
                                                }
                                                Boolean bool4 = Boolean.FALSE;
                                                nickName3 = SportyGamesManager.getInstance().getNickName();
                                                if (nickName3 != null) {
                                                    strA5 = "";
                                                } else {
                                                    strA5 = "";
                                                }
                                                betHistoryItem20 = chatActivity.d0;
                                                if (betHistoryItem20 != null) {
                                                    dValueOf8 = Double.valueOf(betHistoryItem20.getPayoutAmount());
                                                } else {
                                                    dValueOf8 = null;
                                                }
                                                betHistoryItem21 = chatActivity.d0;
                                                if (betHistoryItem21 != null) {
                                                    lValueOf6 = null;
                                                } else {
                                                    lValueOf6 = null;
                                                }
                                                betHistoryItem22 = chatActivity.d0;
                                                if (betHistoryItem22 != null) {
                                                    dValueOf9 = Double.valueOf(betHistoryItem22.getStakeAmount());
                                                } else {
                                                    dValueOf9 = null;
                                                }
                                                json = new SendMessageRequest.Json(userImage4, lValueOf5, cashoutCoefficient2, currency3, dValueOf7, bool4, str, strA5, dValueOf8, lValueOf6, dValueOf9, null, null, null, null, null, null, 129024, null);
                                            } else if (c.l(chatActivity.d, "sporty jet", true)) {
                                                String userImage5 = SportyGamesManager.getInstance().getUserImage();
                                                betHistoryItem9 = chatActivity.e0;
                                                if (betHistoryItem9 != null) {
                                                    lValueOf3 = Long.valueOf(betHistoryItem9.getId());
                                                } else {
                                                    lValueOf3 = null;
                                                }
                                                betHistoryItem10 = chatActivity.e0;
                                                if (betHistoryItem10 != null) {
                                                    cashoutCoefficient = betHistoryItem10.getCashoutCoefficient();
                                                } else {
                                                    cashoutCoefficient = null;
                                                }
                                                betHistoryItem11 = chatActivity.e0;
                                                if (betHistoryItem11 != null) {
                                                    currency2 = betHistoryItem11.getCurrency();
                                                } else {
                                                    currency2 = null;
                                                }
                                                betHistoryItem12 = chatActivity.e0;
                                                if (betHistoryItem12 != null) {
                                                    dValueOf4 = Double.valueOf(betHistoryItem12.getHouseCoefficient());
                                                } else {
                                                    dValueOf4 = null;
                                                }
                                                Boolean bool5 = Boolean.FALSE;
                                                nickName2 = SportyGamesManager.getInstance().getNickName();
                                                if (nickName2 != null) {
                                                    strA3 = "";
                                                } else {
                                                    strA3 = "";
                                                }
                                                betHistoryItem13 = chatActivity.e0;
                                                if (betHistoryItem13 != null) {
                                                    dValueOf5 = Double.valueOf(betHistoryItem13.getPayoutAmount());
                                                } else {
                                                    dValueOf5 = null;
                                                }
                                                betHistoryItem14 = chatActivity.e0;
                                                if (betHistoryItem14 != null) {
                                                    lValueOf4 = null;
                                                } else {
                                                    lValueOf4 = null;
                                                }
                                                betHistoryItem15 = chatActivity.e0;
                                                if (betHistoryItem15 != null) {
                                                    dValueOf6 = Double.valueOf(betHistoryItem15.getStakeAmount());
                                                } else {
                                                    dValueOf6 = null;
                                                }
                                                json = new SendMessageRequest.Json(userImage5, lValueOf3, cashoutCoefficient, currency2, dValueOf4, bool5, str, strA3, dValueOf5, lValueOf4, dValueOf6, null, null, null, null, null, null, 129024, null);
                                                chatActivity.e0 = null;
                                            } else {
                                                String userImage6 = SportyGamesManager.getInstance().getUserImage();
                                                betHistoryItem9 = chatActivity.e0;
                                                if (betHistoryItem9 != null) {
                                                    lValueOf3 = Long.valueOf(betHistoryItem9.getId());
                                                } else {
                                                    lValueOf3 = null;
                                                }
                                                betHistoryItem10 = chatActivity.e0;
                                                if (betHistoryItem10 != null) {
                                                    cashoutCoefficient = betHistoryItem10.getCashoutCoefficient();
                                                } else {
                                                    cashoutCoefficient = null;
                                                }
                                                betHistoryItem11 = chatActivity.e0;
                                                if (betHistoryItem11 != null) {
                                                    currency2 = betHistoryItem11.getCurrency();
                                                } else {
                                                    currency2 = null;
                                                }
                                                betHistoryItem12 = chatActivity.e0;
                                                if (betHistoryItem12 != null) {
                                                    dValueOf4 = Double.valueOf(betHistoryItem12.getHouseCoefficient());
                                                } else {
                                                    dValueOf4 = null;
                                                }
                                                Boolean bool6 = Boolean.FALSE;
                                                nickName2 = SportyGamesManager.getInstance().getNickName();
                                                if (nickName2 != null) {
                                                    strA3 = "";
                                                } else {
                                                    strA3 = "";
                                                }
                                                betHistoryItem13 = chatActivity.e0;
                                                if (betHistoryItem13 != null) {
                                                    dValueOf5 = Double.valueOf(betHistoryItem13.getPayoutAmount());
                                                } else {
                                                    dValueOf5 = null;
                                                }
                                                betHistoryItem14 = chatActivity.e0;
                                                if (betHistoryItem14 != null) {
                                                    lValueOf4 = null;
                                                } else {
                                                    lValueOf4 = null;
                                                }
                                                betHistoryItem15 = chatActivity.e0;
                                                if (betHistoryItem15 != null) {
                                                    dValueOf6 = Double.valueOf(betHistoryItem15.getStakeAmount());
                                                } else {
                                                    dValueOf6 = null;
                                                }
                                                json = new SendMessageRequest.Json(userImage6, lValueOf3, cashoutCoefficient, currency2, dValueOf4, bool6, str, strA3, dValueOf5, lValueOf4, dValueOf6, null, null, null, null, null, null, 129024, null);
                                                chatActivity.e0 = null;
                                            }
                                        } else if (c.l(chatActivity.d, "ping pong", true)) {
                                            String userImage7 = SportyGamesManager.getInstance().getUserImage();
                                            betHistoryItem16 = chatActivity.d0;
                                            if (betHistoryItem16 != null) {
                                                lValueOf5 = Long.valueOf(betHistoryItem16.getId());
                                            } else {
                                                lValueOf5 = null;
                                            }
                                            betHistoryItem17 = chatActivity.d0;
                                            if (betHistoryItem17 != null) {
                                                cashoutCoefficient2 = betHistoryItem17.getCashoutCoefficient();
                                            } else {
                                                cashoutCoefficient2 = null;
                                            }
                                            betHistoryItem18 = chatActivity.d0;
                                            if (betHistoryItem18 != null) {
                                                currency3 = betHistoryItem18.getCurrency();
                                            } else {
                                                currency3 = null;
                                            }
                                            betHistoryItem19 = chatActivity.d0;
                                            if (betHistoryItem19 != null) {
                                                dValueOf7 = Double.valueOf(betHistoryItem19.getHouseCoefficient());
                                            } else {
                                                dValueOf7 = null;
                                            }
                                            Boolean bool7 = Boolean.FALSE;
                                            nickName3 = SportyGamesManager.getInstance().getNickName();
                                            if (nickName3 != null || nickName3.length() == 0) {
                                                strA5 = "";
                                            } else {
                                                strA5 = nickName3.length() == 1 ? tug.a(nickName3, "***", nickName3) : nickName3.charAt(0) + "***" + nickName3.charAt(nickName3.length() - 1);
                                            }
                                            betHistoryItem20 = chatActivity.d0;
                                            if (betHistoryItem20 != null) {
                                                dValueOf8 = Double.valueOf(betHistoryItem20.getPayoutAmount());
                                            } else {
                                                dValueOf8 = null;
                                            }
                                            betHistoryItem21 = chatActivity.d0;
                                            if (betHistoryItem21 != null || (roundId7 = betHistoryItem21.getRoundId()) == null) {
                                                lValueOf6 = null;
                                            } else {
                                                lValueOf6 = Long.valueOf(Long.parseLong(roundId7));
                                            }
                                            betHistoryItem22 = chatActivity.d0;
                                            if (betHistoryItem22 != null) {
                                                dValueOf9 = Double.valueOf(betHistoryItem22.getStakeAmount());
                                            } else {
                                                dValueOf9 = null;
                                            }
                                            json = new SendMessageRequest.Json(userImage7, lValueOf5, cashoutCoefficient2, currency3, dValueOf7, bool7, str, strA5, dValueOf8, lValueOf6, dValueOf9, null, null, null, null, null, null, 129024, null);
                                        } else if (c.l(chatActivity.d, "sporty jet", true) || c.l(chatActivity.d, "galaxy go", true) || c.l(chatActivity.d, "one-punch", true) || c.l(chatActivity.d, "crazy rider", true) || c.l(chatActivity.d, UccrWswQGaIj.txmN, true) || c.l(chatActivity.d, "sporty kick", true) || c.l(chatActivity.d, "sporty cars", true)) {
                                            String userImage8 = SportyGamesManager.getInstance().getUserImage();
                                            betHistoryItem9 = chatActivity.e0;
                                            if (betHistoryItem9 != null) {
                                                lValueOf3 = Long.valueOf(betHistoryItem9.getId());
                                            } else {
                                                lValueOf3 = null;
                                            }
                                            betHistoryItem10 = chatActivity.e0;
                                            if (betHistoryItem10 != null) {
                                                cashoutCoefficient = betHistoryItem10.getCashoutCoefficient();
                                            } else {
                                                cashoutCoefficient = null;
                                            }
                                            betHistoryItem11 = chatActivity.e0;
                                            if (betHistoryItem11 != null) {
                                                currency2 = betHistoryItem11.getCurrency();
                                            } else {
                                                currency2 = null;
                                            }
                                            betHistoryItem12 = chatActivity.e0;
                                            if (betHistoryItem12 != null) {
                                                dValueOf4 = Double.valueOf(betHistoryItem12.getHouseCoefficient());
                                            } else {
                                                dValueOf4 = null;
                                            }
                                            Boolean bool8 = Boolean.FALSE;
                                            nickName2 = SportyGamesManager.getInstance().getNickName();
                                            if (nickName2 != null || nickName2.length() == 0) {
                                                strA3 = "";
                                            } else {
                                                strA3 = nickName2.length() == 1 ? tug.a(nickName2, "***", nickName2) : nickName2.charAt(0) + "***" + nickName2.charAt(nickName2.length() - 1);
                                            }
                                            betHistoryItem13 = chatActivity.e0;
                                            if (betHistoryItem13 != null) {
                                                dValueOf5 = Double.valueOf(betHistoryItem13.getPayoutAmount());
                                            } else {
                                                dValueOf5 = null;
                                            }
                                            betHistoryItem14 = chatActivity.e0;
                                            if (betHistoryItem14 != null || (roundId5 = betHistoryItem14.getRoundId()) == null) {
                                                lValueOf4 = null;
                                            } else {
                                                lValueOf4 = Long.valueOf(Long.parseLong(roundId5));
                                            }
                                            betHistoryItem15 = chatActivity.e0;
                                            if (betHistoryItem15 != null) {
                                                dValueOf6 = Double.valueOf(betHistoryItem15.getStakeAmount());
                                            } else {
                                                dValueOf6 = null;
                                            }
                                            json = new SendMessageRequest.Json(userImage8, lValueOf3, cashoutCoefficient, currency2, dValueOf4, bool8, str, strA3, dValueOf5, lValueOf4, dValueOf6, null, null, null, null, null, null, 129024, null);
                                            chatActivity.e0 = null;
                                        } else {
                                            String userImage9 = SportyGamesManager.getInstance().getUserImage();
                                            BetHistoryItem betHistoryItem35 = chatActivity.c0;
                                            Long lValueOf9 = betHistoryItem35 != null ? Long.valueOf(betHistoryItem35.getId()) : null;
                                            BetHistoryItem betHistoryItem36 = chatActivity.c0;
                                            Double cashoutCoefficient3 = betHistoryItem36 != null ? betHistoryItem36.getCashoutCoefficient() : null;
                                            BetHistoryItem betHistoryItem37 = chatActivity.c0;
                                            String currency5 = betHistoryItem37 != null ? betHistoryItem37.getCurrency() : null;
                                            BetHistoryItem betHistoryItem38 = chatActivity.c0;
                                            Double dValueOf13 = betHistoryItem38 != null ? Double.valueOf(betHistoryItem38.getHouseCoefficient()) : null;
                                            Boolean bool9 = Boolean.FALSE;
                                            String nickName5 = SportyGamesManager.getInstance().getNickName();
                                            if (nickName5 == null || nickName5.length() == 0) {
                                                strA4 = "";
                                            } else {
                                                strA4 = nickName5.length() == 1 ? tug.a(nickName5, "***", nickName5) : nickName5.charAt(0) + "***" + nickName5.charAt(nickName5.length() - 1);
                                            }
                                            BetHistoryItem betHistoryItem39 = chatActivity.c0;
                                            Double dValueOf14 = betHistoryItem39 != null ? Double.valueOf(betHistoryItem39.getPayoutAmount()) : null;
                                            BetHistoryItem betHistoryItem40 = chatActivity.c0;
                                            Long lValueOf10 = (betHistoryItem40 == null || (roundId6 = betHistoryItem40.getRoundId()) == null) ? null : Long.valueOf(Long.parseLong(roundId6));
                                            BetHistoryItem betHistoryItem41 = chatActivity.c0;
                                            json = new SendMessageRequest.Json(userImage9, lValueOf9, cashoutCoefficient3, currency5, dValueOf13, bool9, str, strA4, dValueOf14, lValueOf10, betHistoryItem41 != null ? Double.valueOf(betHistoryItem41.getStakeAmount()) : null, null, null, null, null, null, null, 129024, null);
                                        }
                                    }
                                }
                            } else if (c.l(chatActivity.getIntent().getStringExtra("share_data_type"), "bet_history_pocket", false)) {
                                String userImage10 = SportyGamesManager.getInstance().getUserImage();
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem42 = chatActivity.f0;
                                Long lValueOf11 = (betHistoryItem42 == null || (betId3 = betHistoryItem42.getBetId()) == null) ? null : Long.valueOf(Long.parseLong(betId3));
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem43 = chatActivity.f0;
                                Double cashoutCoefficient4 = betHistoryItem43 != null ? betHistoryItem43.getCashoutCoefficient() : null;
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem44 = chatActivity.f0;
                                String currency6 = betHistoryItem44 != null ? betHistoryItem44.getCurrency() : null;
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem45 = chatActivity.f0;
                                Double dValueOf15 = betHistoryItem45 != null ? Double.valueOf(betHistoryItem45.getHouseCoefficient()) : null;
                                Boolean bool10 = Boolean.FALSE;
                                String nickName6 = SportyGamesManager.getInstance().getNickName();
                                if (nickName6 == null || nickName6.length() == 0) {
                                    strA = "";
                                } else {
                                    strA = nickName6.length() == 1 ? tug.a(nickName6, "***", nickName6) : nickName6.charAt(0) + "***" + nickName6.charAt(nickName6.length() - 1);
                                }
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem46 = chatActivity.f0;
                                Double dValueOf16 = betHistoryItem46 != null ? Double.valueOf(betHistoryItem46.getPayoutAmount()) : null;
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem47 = chatActivity.f0;
                                Long lValueOf12 = (betHistoryItem47 == null || (roundId3 = betHistoryItem47.getRoundId()) == null) ? null : Long.valueOf(Long.parseLong(roundId3));
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem48 = chatActivity.f0;
                                Double dValueOf17 = betHistoryItem48 != null ? Double.valueOf(betHistoryItem48.getStakeAmount()) : null;
                                com.sportygames.pocketrocket.model.response.BetHistoryItem betHistoryItem49 = chatActivity.f0;
                                json = new SendMessageRequest.Json(userImage10, lValueOf11, cashoutCoefficient4, currency6, dValueOf15, bool10, str, strA, dValueOf16, lValueOf12, dValueOf17, null, null, null, null, null, betHistoryItem49 != null ? betHistoryItem49.getRocketType() : null, 63488, null);
                            } else if (c.l(chatActivity.d, "ping pong", true)) {
                                TopWinResponse topWinResponse = chatActivity.b0;
                                String avatarUrl = topWinResponse != null ? topWinResponse.getAvatarUrl() : null;
                                TopWinResponse topWinResponse2 = chatActivity.b0;
                                Long lValueOf13 = (topWinResponse2 == null || (betId2 = topWinResponse2.getBetId()) == null) ? null : Long.valueOf(Long.parseLong(betId2));
                                TopWinResponse topWinResponse3 = chatActivity.b0;
                                Double d = (topWinResponse3 == null || (cashOutCoefficient2 = topWinResponse3.getCashOutCoefficient()) == null) ? null : cashOutCoefficient2;
                                TopWinResponse topWinResponse4 = chatActivity.b0;
                                String currency7 = topWinResponse4 != null ? topWinResponse4.getCurrency() : null;
                                TopWinResponse topWinResponse5 = chatActivity.b0;
                                Double houseCoefficient = topWinResponse5 != null ? topWinResponse5.getHouseCoefficient() : null;
                                Boolean bool11 = Boolean.FALSE;
                                TopWinResponse topWinResponse6 = chatActivity.b0;
                                String nickName7 = topWinResponse6 != null ? topWinResponse6.getNickName() : null;
                                TopWinResponse topWinResponse7 = chatActivity.b0;
                                Double dValueOf18 = (topWinResponse7 == null || (payoutAmount2 = topWinResponse7.getPayoutAmount()) == null) ? null : Double.valueOf(Double.parseDouble(payoutAmount2));
                                TopWinResponse topWinResponse8 = chatActivity.b0;
                                Long lValueOf14 = (topWinResponse8 == null || (roundId2 = topWinResponse8.getRoundId()) == null) ? null : Long.valueOf(Long.parseLong(roundId2));
                                TopWinResponse topWinResponse9 = chatActivity.b0;
                                json = new SendMessageRequest.Json(avatarUrl, lValueOf13, d, currency7, houseCoefficient, bool11, str, nickName7, dValueOf18, lValueOf14, (topWinResponse9 == null || (stakeAmount2 = topWinResponse9.getStakeAmount()) == null) ? null : Double.valueOf(Double.parseDouble(stakeAmount2)), null, null, null, null, null, null, 129024, null);
                            } else {
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse10 = chatActivity.a0;
                                String avatarUrl2 = topWinResponse10 != null ? topWinResponse10.getAvatarUrl() : null;
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse11 = chatActivity.a0;
                                Long lValueOf15 = (topWinResponse11 == null || (betId = topWinResponse11.getBetId()) == null) ? null : Long.valueOf(Long.parseLong(betId));
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse12 = chatActivity.a0;
                                Double d2 = (topWinResponse12 == null || (cashOutCoefficient = topWinResponse12.getCashOutCoefficient()) == null) ? null : cashOutCoefficient;
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse13 = chatActivity.a0;
                                String currency8 = topWinResponse13 != null ? topWinResponse13.getCurrency() : null;
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse14 = chatActivity.a0;
                                Double houseCoefficient2 = topWinResponse14 != null ? topWinResponse14.getHouseCoefficient() : null;
                                Boolean bool12 = Boolean.FALSE;
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse15 = chatActivity.a0;
                                String nickName8 = topWinResponse15 != null ? topWinResponse15.getNickName() : null;
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse16 = chatActivity.a0;
                                Double dValueOf19 = (topWinResponse16 == null || (payoutAmount = topWinResponse16.getPayoutAmount()) == null) ? null : Double.valueOf(Double.parseDouble(payoutAmount));
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse17 = chatActivity.a0;
                                Long lValueOf16 = (topWinResponse17 == null || (roundId = topWinResponse17.getRoundId()) == null) ? null : Long.valueOf(Long.parseLong(roundId));
                                com.sportygames.sportyherov2.remote.models.TopWinResponse topWinResponse18 = chatActivity.a0;
                                json = new SendMessageRequest.Json(avatarUrl2, lValueOf15, d2, currency8, houseCoefficient2, bool12, str, nickName8, dValueOf19, lValueOf16, (topWinResponse18 == null || (stakeAmount = topWinResponse18.getStakeAmount()) == null) ? null : Double.valueOf(Double.parseDouble(stakeAmount)), null, null, null, null, null, null, 129024, null);
                            }
                            chatActivity.G1().y1(new SendMessageRequest(chatActivity.L, "JSON", null, null, json));
                            chatActivity.R1();
                            ha7 ha7Var3 = (ha7) chatActivity.a;
                            if (ha7Var3 != null && (text2 = ha7Var3.K.getText()) != null) {
                                text2.clear();
                            }
                            ha7 ha7Var4 = (ha7) chatActivity.a;
                            if (ha7Var4 != null) {
                                ha7Var4.D.setText("0/160");
                            }
                            chatActivity.W = "";
                            ha7 ha7Var5 = (ha7) chatActivity.a;
                            if (ha7Var5 != null) {
                                ha7Var5.K.requestFocus();
                            }
                        } else {
                            ha7 ha7Var6 = (ha7) b;
                            if (StringsKt.t0(String.valueOf(ha7Var6 != null ? ha7Var6.K.getText() : null)).toString().length() > 0) {
                                String str2 = chatActivity.L;
                                ha7 ha7Var7 = (ha7) chatActivity.a;
                                chatActivity.G1().y1(new SendMessageRequest(str2, "TEXT", String.valueOf(ha7Var7 != null ? ha7Var7.K.getText() : null), null, null));
                                chatActivity.R1();
                                ha7 ha7Var8 = (ha7) chatActivity.a;
                                if (ha7Var8 != null && (text = ha7Var8.K.getText()) != null) {
                                    text.clear();
                                }
                                chatActivity.W = "";
                                ha7 ha7Var9 = (ha7) chatActivity.a;
                                if (ha7Var9 != null) {
                                    ha7Var9.D.setText("0/160");
                                }
                            }
                        }
                    }
                }
                break;
            default:
                fgb fgbVar = (fgb) obj2;
                Map map = (Map) obj;
                if (map != null && !map.isEmpty()) {
                    Object obj3 = map.get("requestModel");
                    ClaimRainRequest claimRainRequest = obj3 instanceof ClaimRainRequest ? (ClaimRainRequest) obj3 : null;
                    String strValueOf = String.valueOf(claimRainRequest != null ? Integer.valueOf(claimRainRequest.getRainId()) : null);
                    if (strValueOf.length() != 0) {
                        loa0 loa0VarK1 = fgbVar.k1();
                        loa0VarK1.getClass();
                        usm usmVar = loa0VarK1.b;
                        brb brbVar = brb.y;
                        usm.g(usmVar, brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6), "{ \"rainId\": \"" + strValueOf + "\" }");
                    }
                }
                break;
        }
        return Unit.a;
    }
}
