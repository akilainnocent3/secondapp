package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.components.BetConfig;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wkp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wkp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [r9b0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchPlaceBetResponse matchPlaceBetResponse;
        fo80 fo80Var;
        vz50 binding;
        ConstraintLayout constraintLayout;
        Context context;
        ResultWrapper.GenericError error;
        Integer code;
        Integer code2;
        kk2 binding2;
        kk2 binding3;
        int i = this.a;
        boolean z = false;
        Object obj2 = this.b;
        int i2 = 2;
        switch (i) {
            case 0:
                final KeWithdrawActivity keWithdrawActivity = (KeWithdrawActivity) obj2;
                lk50 lk50Var = (lk50) obj;
                int i3 = KeWithdrawActivity.Z;
                if (lk50Var instanceof lk50.c) {
                    final WithDrawInfo withDrawInfo = (WithDrawInfo) ((lk50.c) lk50Var).a;
                    try {
                        if (withDrawInfo == null) {
                            keWithdrawActivity.K.setText(keWithdrawActivity.getCMSString(R.string.app_common__no_cash, new Object[0]));
                        } else {
                            keWithdrawActivity.Q.setVisibility(withDrawInfo.hasInfo ? 0 : 8);
                            if (withDrawInfo.hasInfo) {
                                BigDecimal bigDecimalDivide = new BigDecimal(withDrawInfo.maxWithdrawAmount).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP);
                                keWithdrawActivity.M = bigDecimalDivide;
                                keWithdrawActivity.K.setText(bjb0.Y(bigDecimalDivide));
                                keWithdrawActivity.L.setOnClickListener(new View.OnClickListener() { // from class: nkp
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = KeWithdrawActivity.Z;
                                        f00 f00Var = vgb0.a;
                                        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.CONTENT_TYPE, "click_balance_info_button")};
                                        HashMap map = new HashMap(1);
                                        Map.Entry entry = entryArr[0];
                                        Object key = entry.getKey();
                                        if (w1k.a(key, entry, map, key) != null) {
                                            hb5.a(wga.a(key, "duplicate key: "));
                                            return;
                                        }
                                        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                                        mapUnmodifiableMap.getClass();
                                        vgb0.c("sporty_withdraw", mapUnmodifiableMap, false);
                                        ua00.a(keWithdrawActivity.getSupportFragmentManager(), withDrawInfo.message);
                                    }
                                });
                            } else {
                                keWithdrawActivity.K.setText(keWithdrawActivity.getCMSString(R.string.app_common__no_cash, new Object[0]));
                            }
                        }
                    } catch (Exception e) {
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_COMMON);
                        aVar.g("Exception = %s", e.toString());
                    }
                    break;
                }
                return null;
            default:
                final kab0 kab0Var = (kab0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i4 = kab0.a.a[loadingState.getStatus().ordinal()];
                int i5 = 1;
                if (i4 == 1) {
                    fo80 fo80Var2 = kab0Var.c;
                    if (fo80Var2 != null) {
                        fo80Var2.T.setVisibility(8);
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (matchPlaceBetResponse = (MatchPlaceBetResponse) hTTPResponse.getData()) != null && (fo80Var = kab0Var.c) != null) {
                        fo80Var.c0.setPlaceBetResponse(matchPlaceBetResponse, kab0Var.v0());
                    }
                    j1b j1bVar = kab0Var.a;
                    pfd pfdVar = fse.a;
                    ej5.c(j1bVar, gku.a, null, new qab0(kab0Var, loadingState, null), 2);
                    CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
                    Pair pair = new Pair(JsPluginCommon.GAMES_BET_PLACED_IS_REBET_ARGUMENT, Boolean.valueOf(kab0Var.i0));
                    GameDetails gameDetails = kab0Var.b;
                    Pair pair2 = new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null);
                    Pair pair3 = new Pair("isFBG", Boolean.valueOf(kab0Var.j0));
                    Pair pair4 = new Pair("isPartialFBG", Boolean.valueOf(kab0Var.k0));
                    SharedPreferences sharedPreferences = kab0Var.D;
                    casinoLogger.logEventToCasino("BetPlaced", vj5.a(pair, pair2, pair3, pair4, new Pair("isOneTapBet", sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin_match_one_tap", false)) : null), new Pair("Platform", "ANDROID")));
                } else if (i4 == 2) {
                    fo80 fo80Var3 = kab0Var.c;
                    if (fo80Var3 != null) {
                        fo80Var3.T.setVisibility(0);
                    }
                    fo80 fo80Var4 = kab0Var.c;
                    if (fo80Var4 != null) {
                        fo80Var4.i.setVisibility(4);
                    }
                    fo80 fo80Var5 = kab0Var.c;
                    if (fo80Var5 != null) {
                        fo80Var5.d.setVisibility(4);
                    }
                    fo80 fo80Var6 = kab0Var.c;
                    if (fo80Var6 != null && (binding = fo80Var6.Q.getBinding()) != null && (constraintLayout = binding.i) != null) {
                        constraintLayout.setVisibility(4);
                    }
                    fo80 fo80Var7 = kab0Var.c;
                    if (fo80Var7 != null) {
                        fo80Var7.C.setVisibility(4);
                    }
                    fo80 fo80Var8 = kab0Var.c;
                    if (fo80Var8 != null) {
                        fo80Var8.P.setVisibility(4);
                    }
                    fo80 fo80Var9 = kab0Var.c;
                    if (fo80Var9 != null) {
                        fo80Var9.M.setVisibility(4);
                    }
                    fo80 fo80Var10 = kab0Var.c;
                    if (fo80Var10 != null) {
                        fo80Var10.G.setBackImageVisible(8);
                    }
                } else {
                    if (i4 != 3) {
                        uhc.a();
                        return null;
                    }
                    fo80 fo80Var11 = kab0Var.c;
                    if (fo80Var11 != null) {
                        fo80Var11.c.setChipAlpha(1.0f);
                    }
                    fo80 fo80Var12 = kab0Var.c;
                    if (fo80Var12 != null) {
                        fo80Var12.T.setVisibility(8);
                    }
                    fo80 fo80Var13 = kab0Var.c;
                    if (fo80Var13 != null) {
                        fo80Var13.G.setBackImageVisible(0);
                    }
                    if (kab0Var.getActivity() != null && (context = kab0Var.getContext()) != null) {
                        kab0Var.w0().y1();
                        if (kab0Var.j0) {
                            fo80 fo80Var14 = kab0Var.c;
                            if (fo80Var14 != null) {
                                fo80Var14.i.F(false);
                            }
                            kab0Var.n0();
                            kab0Var.G0();
                        }
                        nbb0 nbb0VarW0 = kab0Var.w0();
                        nbb0VarW0.c = null;
                        nbb0VarW0.b = null;
                        if (loadingState.getError() != null) {
                            Integer code3 = loadingState.getError().getCode();
                            if (code3 != null && code3.intValue() == 403) {
                                fo80 fo80Var15 = kab0Var.c;
                                if (fo80Var15 != null) {
                                    fo80Var15.i.setVisibility(0);
                                }
                                fo80 fo80Var16 = kab0Var.c;
                                if (fo80Var16 != null) {
                                    fo80Var16.d.setVisibility(0);
                                }
                                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            } else {
                                e activity = kab0Var.getActivity();
                                if (activity != null) {
                                    fo80 fo80Var17 = kab0Var.c;
                                    if (fo80Var17 != null) {
                                        fo80Var17.i.setVisibility(0);
                                    }
                                    fo80 fo80Var18 = kab0Var.c;
                                    if (fo80Var18 != null) {
                                        fo80Var18.d.setVisibility(0);
                                    }
                                    fo80 fo80Var19 = kab0Var.c;
                                    if (fo80Var19 != null) {
                                        fo80Var19.i.I(false);
                                    }
                                    kab0Var.o0();
                                    fo80 fo80Var20 = kab0Var.c;
                                    if (fo80Var20 != null && (binding3 = fo80Var20.i.getBinding()) != null) {
                                        binding3.e.setText("--");
                                    }
                                    fo80 fo80Var21 = kab0Var.c;
                                    if (fo80Var21 != null && (binding2 = fo80Var21.i.getBinding()) != null) {
                                        binding2.c.setText("--");
                                    }
                                    kab0Var.z0(true);
                                    ResultWrapper.GenericError error2 = loadingState.getError();
                                    if ((error2 == null || (code2 = error2.getCode()) == null || code2.intValue() != 123450) && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 123451)) {
                                        t8b0 t8b0Var = t8b0.e;
                                        kab0Var.v0();
                                        jcg.d(t8b0Var, activity, "Spin Match", loadingState.getError(), new e02(kab0Var, 4), null, null, 0, context.getColor(R.color.try_again_color), null, new f02(i2, loadingState, kab0Var), new Function0() { // from class: r9b0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                kab0 kab0Var2 = kab0Var;
                                                kab0Var2.N = true;
                                                kab0Var2.w0().x1();
                                                fo80 fo80Var22 = kab0Var2.c;
                                                if (fo80Var22 != null) {
                                                    BetConfig betConfig = fo80Var22.c;
                                                    Set<Integer> setKeySet = kab0Var2.f.keySet();
                                                    setKeySet.getClass();
                                                    betConfig.G(CollectionsKt.A0(setKeySet));
                                                }
                                                kab0Var2.f.clear();
                                                return Unit.a;
                                            }
                                        }, new Function1() { // from class: s9b0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                String str = (String) obj3;
                                                str.getClass();
                                                kab0Var.r0(str);
                                                return Unit.a;
                                            }
                                        }, new o02(kab0Var, i5), 13792);
                                    } else {
                                        e activity2 = kab0Var.getActivity();
                                        GameMainActivity gameMainActivity = activity2 instanceof GameMainActivity ? (GameMainActivity) activity2 : null;
                                        if (gameMainActivity != null) {
                                            Integer code4 = loadingState.getError().getCode();
                                            if (code4 != null && code4.intValue() == 123450) {
                                                z = true;
                                            }
                                            gameMainActivity.b2(z);
                                        }
                                    }
                                }
                            }
                        } else {
                            fo80 fo80Var22 = kab0Var.c;
                            if (fo80Var22 != null) {
                                fo80Var22.i.setVisibility(0);
                            }
                            fo80 fo80Var23 = kab0Var.c;
                            if (fo80Var23 != null) {
                                fo80Var23.d.setVisibility(0);
                            }
                            kab0Var.z0(true);
                            kab0Var.K0(context, loadingState.getError());
                        }
                    }
                }
                return Unit.a;
        }
    }
}
