package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.EventActivity;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.sportyherov2.remote.models.TopBets;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cjg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cjg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<TopBets> list;
        rv80 binding;
        pv80 binding2;
        rv80 binding3;
        pv80 binding4;
        rv80 binding5;
        pv80 binding6;
        rv80 binding7;
        pv80 binding8;
        rv80 binding9;
        pv80 binding10;
        rv80 binding11;
        pv80 binding12;
        rv80 binding13;
        pv80 binding14;
        rv80 binding15;
        rv80 binding16;
        rv80 binding17;
        rv80 binding18;
        rv80 binding19;
        rv80 binding20;
        pv80 binding21;
        rv80 binding22;
        pv80 binding23;
        rv80 binding24;
        pv80 binding25;
        rv80 binding26;
        pv80 binding27;
        rv80 binding28;
        pv80 binding29;
        rv80 binding30;
        rv80 binding31;
        pv80 binding32;
        rv80 binding33;
        pv80 binding34;
        rv80 binding35;
        pv80 binding36;
        rv80 binding37;
        pv80 binding38;
        rv80 binding39;
        rv80 binding40;
        rv80 binding41;
        rv80 binding42;
        rv80 binding43;
        rv80 binding44;
        rv80 binding45;
        pv80 binding46;
        rv80 binding47;
        pv80 binding48;
        rv80 binding49;
        pv80 binding50;
        rv80 binding51;
        pv80 binding52;
        rv80 binding53;
        pv80 binding54;
        rv80 binding55;
        pv80 binding56;
        rv80 binding57;
        pv80 binding58;
        rv80 binding59;
        rv80 binding60;
        rv80 binding61;
        rv80 binding62;
        rv80 binding63;
        rv80 binding64;
        pv80 binding65;
        rv80 binding66;
        pv80 binding67;
        rv80 binding68;
        rv80 binding69;
        rv80 binding70;
        rv80 binding71;
        rv80 binding72;
        rv80 binding73;
        rv80 binding74;
        rv80 binding75;
        w3c0 w3c0Var;
        rv80 binding76;
        rv80 binding77;
        pv80 binding78;
        rv80 binding79;
        pv80 binding80;
        rv80 binding81;
        pv80 binding82;
        rv80 binding83;
        rv80 binding84;
        rv80 binding85;
        rv80 binding86;
        pv80 binding87;
        rv80 binding88;
        rv80 binding89;
        rv80 binding90;
        rv80 binding91;
        rv80 binding92;
        rv80 binding93;
        w3c0 w3c0Var2;
        rv80 binding94;
        rv80 binding95;
        pv80 binding96;
        rv80 binding97;
        pv80 binding98;
        rv80 binding99;
        pv80 binding100;
        rv80 binding101;
        pv80 binding102;
        rv80 binding103;
        rv80 binding104;
        rv80 binding105;
        w3c0 w3c0Var3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj2;
                int i2 = EventActivity.U0;
                if (((Boolean) obj).booleanValue()) {
                    eventActivity.a2();
                }
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i3 = q1c0.b.a[loadingState.getStatus().ordinal()];
                if (i3 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        for (TopBets topBets : list) {
                            if (Intrinsics.g(SportyGamesManager.getInstance().getUserId(), topBets.getUserId())) {
                                if (topBets.getActualPayoutAmount() == null) {
                                    int betIndex = topBets.getBetIndex();
                                    B b = q1c0Var.b;
                                    if (betIndex == 1) {
                                        w3c0 w3c0Var4 = (w3c0) b;
                                        if (w3c0Var4 != null && (binding44 = w3c0Var4.j0.getBinding()) != null) {
                                            binding44.c.setRoundId(topBets.getRoundId());
                                            Unit unit = Unit.a;
                                        }
                                        w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                                        if (w3c0Var5 != null && (binding43 = w3c0Var5.j0.getBinding()) != null) {
                                            binding43.c.setBetAmount(topBets.getStakeAmount());
                                            Unit unit2 = Unit.a;
                                        }
                                        w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                                        if (w3c0Var6 != null && (binding42 = w3c0Var6.j0.getBinding()) != null) {
                                            binding42.c.setBetId(topBets.getBetId());
                                            Unit unit3 = Unit.a;
                                        }
                                        w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                                        if (w3c0Var7 != null && (binding41 = w3c0Var7.j0.getBinding()) != null) {
                                            binding41.c.setBetPlaced(true);
                                            Unit unit4 = Unit.a;
                                        }
                                        w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                                        if (w3c0Var8 != null && (binding40 = w3c0Var8.j0.getBinding()) != null) {
                                            binding40.c.setBetInProgress(false);
                                            Unit unit5 = Unit.a;
                                        }
                                        w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                                        if (w3c0Var9 != null && (binding39 = w3c0Var9.j0.getBinding()) != null) {
                                            binding39.c.setCashoutDone(false);
                                            Unit unit6 = Unit.a;
                                        }
                                        w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                                        if (w3c0Var10 != null && (binding37 = w3c0Var10.j0.getBinding()) != null && (binding38 = binding37.c.getBinding()) != null) {
                                            binding38.G.setVisibility(0);
                                            Unit unit7 = Unit.a;
                                        }
                                        w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                                        if (w3c0Var11 != null && (binding35 = w3c0Var11.j0.getBinding()) != null && (binding36 = binding35.c.getBinding()) != null) {
                                            binding36.y.setVisibility(8);
                                            Unit unit8 = Unit.a;
                                        }
                                        w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                                        if (w3c0Var12 != null && (binding33 = w3c0Var12.j0.getBinding()) != null && (binding34 = binding33.c.getBinding()) != null) {
                                            binding34.Q0.setVisibility(8);
                                            Unit unit9 = Unit.a;
                                        }
                                        w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                                        if (w3c0Var13 != null && (binding31 = w3c0Var13.j0.getBinding()) != null && (binding32 = binding31.c.getBinding()) != null) {
                                            binding32.R0.setVisibility(8);
                                            Unit unit10 = Unit.a;
                                        }
                                        w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                                        if (w3c0Var14 != null && (binding30 = w3c0Var14.j0.getBinding()) != null) {
                                            binding30.c.i(0.5f, false);
                                            Unit unit11 = Unit.a;
                                        }
                                        w3c0 w3c0Var15 = (w3c0) q1c0Var.b;
                                        if (w3c0Var15 != null && (binding28 = w3c0Var15.j0.getBinding()) != null && (binding29 = binding28.c.getBinding()) != null) {
                                            TextView textView = binding29.D0;
                                            TreeMap treeMap = pw.a;
                                            textView.setText(pw.n(topBets.getStakeAmount()));
                                            Unit unit12 = Unit.a;
                                        }
                                        w3c0 w3c0Var16 = (w3c0) q1c0Var.b;
                                        if (w3c0Var16 != null && (binding26 = w3c0Var16.j0.getBinding()) != null && (binding27 = binding26.c.getBinding()) != null) {
                                            TextView textView2 = binding27.J0;
                                            TreeMap treeMap2 = pw.a;
                                            Double startCoefficient = topBets.getStartCoefficient();
                                            textView2.setText(pw.n(startCoefficient != null ? startCoefficient.doubleValue() : 0.0d).concat("x"));
                                            Unit unit13 = Unit.a;
                                        }
                                        w3c0 w3c0Var17 = (w3c0) q1c0Var.b;
                                        if (w3c0Var17 != null && (binding24 = w3c0Var17.j0.getBinding()) != null && (binding25 = binding24.c.getBinding()) != null) {
                                            TextView textView3 = binding25.G0;
                                            TreeMap treeMap3 = pw.a;
                                            Double endCoefficient = topBets.getEndCoefficient();
                                            textView3.setText(pw.n(endCoefficient != null ? endCoefficient.doubleValue() : 0.0d).concat("x"));
                                            Unit unit14 = Unit.a;
                                        }
                                        Double giftAmount = topBets.getGiftAmount();
                                        GiftItem giftItem = giftAmount != null ? new GiftItem(giftAmount.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                        w3c0 w3c0Var18 = (w3c0) q1c0Var.b;
                                        if (w3c0Var18 != null && (binding22 = w3c0Var18.j0.getBinding()) != null && (binding23 = binding22.c.getBinding()) != null) {
                                            TextView textView4 = binding23.D0;
                                            TreeMap treeMap4 = pw.a;
                                            textView4.setText(pw.n(topBets.getStakeAmount()));
                                            Unit unit15 = Unit.a;
                                        }
                                        B b2 = q1c0Var.b;
                                        if (giftItem != null) {
                                            w3c0 w3c0Var19 = (w3c0) b2;
                                            if (w3c0Var19 != null && (binding20 = w3c0Var19.j0.getBinding()) != null && (binding21 = binding20.c.getBinding()) != null) {
                                                TextView textView5 = binding21.D0;
                                                TreeMap treeMap5 = pw.a;
                                                textView5.setText(pw.n(topBets.getGiftAmount().doubleValue()));
                                                Unit unit16 = Unit.a;
                                            }
                                            w3c0 w3c0Var20 = (w3c0) q1c0Var.b;
                                            if (w3c0Var20 != null && (binding19 = w3c0Var20.j0.getBinding()) != null) {
                                                binding19.c.setFBG(giftItem, true, topBets.getGiftAmount().doubleValue());
                                                Unit unit17 = Unit.a;
                                            }
                                            w3c0 w3c0Var21 = (w3c0) q1c0Var.b;
                                            if (w3c0Var21 != null && (binding18 = w3c0Var21.j0.getBinding()) != null) {
                                                binding18.d.u();
                                                Unit unit18 = Unit.a;
                                            }
                                            w3c0 w3c0Var22 = (w3c0) q1c0Var.b;
                                            if (w3c0Var22 != null && (binding17 = w3c0Var22.j0.getBinding()) != null) {
                                                binding17.c.setFbgRoundId(topBets.getRoundId());
                                                Unit unit19 = Unit.a;
                                            }
                                            q1c0Var.Q0(true);
                                            w5b.c(q1c0Var.T0, null);
                                            Unit unit20 = Unit.a;
                                        } else {
                                            w3c0 w3c0Var23 = (w3c0) b2;
                                            if (w3c0Var23 != null && (binding15 = w3c0Var23.j0.getBinding()) != null) {
                                                binding15.c.setUserInputAmount(topBets.getStakeAmount());
                                                Unit unit21 = Unit.a;
                                            }
                                            w3c0 w3c0Var24 = (w3c0) q1c0Var.b;
                                            if (w3c0Var24 != null && (binding13 = w3c0Var24.j0.getBinding()) != null && (binding14 = binding13.c.getBinding()) != null) {
                                                binding14.G.setVisibility(0);
                                                Unit unit22 = Unit.a;
                                            }
                                            w3c0 w3c0Var25 = (w3c0) q1c0Var.b;
                                            if (w3c0Var25 != null && (binding11 = w3c0Var25.j0.getBinding()) != null && (binding12 = binding11.c.getBinding()) != null) {
                                                binding12.y.setVisibility(8);
                                                Unit unit23 = Unit.a;
                                            }
                                            w3c0 w3c0Var26 = (w3c0) q1c0Var.b;
                                            if (w3c0Var26 != null && (binding9 = w3c0Var26.j0.getBinding()) != null && (binding10 = binding9.c.getBinding()) != null) {
                                                binding10.Q0.setVisibility(8);
                                                Unit unit24 = Unit.a;
                                            }
                                            w3c0 w3c0Var27 = (w3c0) q1c0Var.b;
                                            if (w3c0Var27 != null && (binding7 = w3c0Var27.j0.getBinding()) != null && (binding8 = binding7.c.getBinding()) != null) {
                                                binding8.R0.setVisibility(8);
                                                Unit unit25 = Unit.a;
                                            }
                                            w3c0 w3c0Var28 = (w3c0) q1c0Var.b;
                                            if (w3c0Var28 != null && (binding5 = w3c0Var28.j0.getBinding()) != null && (binding6 = binding5.c.getBinding()) != null) {
                                                TextView textView6 = binding6.D0;
                                                TreeMap treeMap6 = pw.a;
                                                textView6.setText(pw.n(topBets.getStakeAmount()));
                                                Unit unit26 = Unit.a;
                                            }
                                            w3c0 w3c0Var29 = (w3c0) q1c0Var.b;
                                            if (w3c0Var29 != null && (binding3 = w3c0Var29.j0.getBinding()) != null && (binding4 = binding3.c.getBinding()) != null) {
                                                TextView textView7 = binding4.J0;
                                                TreeMap treeMap7 = pw.a;
                                                Double startCoefficient2 = topBets.getStartCoefficient();
                                                textView7.setText(pw.n(startCoefficient2 != null ? startCoefficient2.doubleValue() : 0.0d).concat("x"));
                                                Unit unit27 = Unit.a;
                                            }
                                            w3c0 w3c0Var30 = (w3c0) q1c0Var.b;
                                            if (w3c0Var30 != null && (binding = w3c0Var30.j0.getBinding()) != null && (binding2 = binding.c.getBinding()) != null) {
                                                TextView textView8 = binding2.G0;
                                                TreeMap treeMap8 = pw.a;
                                                Double endCoefficient2 = topBets.getEndCoefficient();
                                                textView8.setText(pw.n(endCoefficient2 != null ? endCoefficient2.doubleValue() : 0.0d).concat("x"));
                                                Unit unit28 = Unit.a;
                                            }
                                            Unit unit29 = Unit.a;
                                        }
                                        op5 op5Var = op5.a;
                                        String string = q1c0Var.getString(R.string.place_bet_cms);
                                        string.getClass();
                                        String string2 = q1c0Var.getString(R.string.place_bet_text_sh);
                                        string2.getClass();
                                        op5Var.getClass();
                                        op5.b(string, string2, null);
                                        op5.i(q1c0Var.G.get(0).getCurrency());
                                        TreeMap treeMap9 = pw.a;
                                        pw.j(topBets.getStakeAmount());
                                        w3c0 w3c0Var31 = (w3c0) q1c0Var.b;
                                        if (w3c0Var31 != null && (binding16 = w3c0Var31.j0.getBinding()) != null) {
                                            binding16.c.B(topBets);
                                        }
                                    } else {
                                        w3c0 w3c0Var32 = (w3c0) b;
                                        if (w3c0Var32 != null && (binding75 = w3c0Var32.j0.getBinding()) != null) {
                                            binding75.d.setRoundId(topBets.getRoundId());
                                            Unit unit30 = Unit.a;
                                        }
                                        w3c0 w3c0Var33 = (w3c0) q1c0Var.b;
                                        if (w3c0Var33 != null && (binding74 = w3c0Var33.j0.getBinding()) != null) {
                                            binding74.d.setBetAmount(topBets.getStakeAmount());
                                            Unit unit31 = Unit.a;
                                        }
                                        w3c0 w3c0Var34 = (w3c0) q1c0Var.b;
                                        if (w3c0Var34 != null && (binding73 = w3c0Var34.j0.getBinding()) != null) {
                                            binding73.d.setBetId(topBets.getBetId());
                                            Unit unit32 = Unit.a;
                                        }
                                        w3c0 w3c0Var35 = (w3c0) q1c0Var.b;
                                        if (w3c0Var35 != null && (binding72 = w3c0Var35.j0.getBinding()) != null) {
                                            binding72.d.setBetPlaced(true);
                                            Unit unit33 = Unit.a;
                                        }
                                        w3c0 w3c0Var36 = (w3c0) q1c0Var.b;
                                        if (w3c0Var36 != null && (binding71 = w3c0Var36.j0.getBinding()) != null) {
                                            binding71.d.setBetInProgress(false);
                                            Unit unit34 = Unit.a;
                                        }
                                        w3c0 w3c0Var37 = (w3c0) q1c0Var.b;
                                        if (w3c0Var37 != null && (binding70 = w3c0Var37.j0.getBinding()) != null) {
                                            binding70.d.setCashoutDone(false);
                                            Unit unit35 = Unit.a;
                                        }
                                        w3c0 w3c0Var38 = (w3c0) q1c0Var.b;
                                        if (w3c0Var38 != null && (binding69 = w3c0Var38.j0.getBinding()) != null) {
                                            binding69.d.m();
                                            Unit unit36 = Unit.a;
                                        }
                                        w3c0 w3c0Var39 = (w3c0) q1c0Var.b;
                                        if (w3c0Var39 != null && (binding68 = w3c0Var39.j0.getBinding()) != null) {
                                            binding68.d.i(0.5f, false);
                                            Unit unit37 = Unit.a;
                                        }
                                        Double giftAmount2 = topBets.getGiftAmount();
                                        GiftItem giftItem2 = giftAmount2 != null ? new GiftItem(giftAmount2.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                        w3c0 w3c0Var40 = (w3c0) q1c0Var.b;
                                        if (w3c0Var40 != null && (binding66 = w3c0Var40.j0.getBinding()) != null && (binding67 = binding66.d.getBinding()) != null) {
                                            TextView textView9 = binding67.D0;
                                            TreeMap treeMap10 = pw.a;
                                            textView9.setText(pw.n(topBets.getStakeAmount()));
                                            Unit unit38 = Unit.a;
                                        }
                                        B b3 = q1c0Var.b;
                                        if (giftItem2 != null) {
                                            w3c0 w3c0Var41 = (w3c0) b3;
                                            if (w3c0Var41 != null && (binding64 = w3c0Var41.j0.getBinding()) != null && (binding65 = binding64.d.getBinding()) != null) {
                                                TextView textView10 = binding65.D0;
                                                TreeMap treeMap11 = pw.a;
                                                textView10.setText(pw.n(topBets.getGiftAmount().doubleValue()));
                                                Unit unit39 = Unit.a;
                                            }
                                            w3c0 w3c0Var42 = (w3c0) q1c0Var.b;
                                            if (w3c0Var42 != null && (binding63 = w3c0Var42.j0.getBinding()) != null) {
                                                binding63.d.setFbgRoundId(topBets.getRoundId());
                                                Unit unit40 = Unit.a;
                                            }
                                            w3c0 w3c0Var43 = (w3c0) q1c0Var.b;
                                            if (w3c0Var43 != null && (binding62 = w3c0Var43.j0.getBinding()) != null) {
                                                binding62.d.setFBG(giftItem2, true, topBets.getGiftAmount().doubleValue());
                                                Unit unit41 = Unit.a;
                                            }
                                            w3c0 w3c0Var44 = (w3c0) q1c0Var.b;
                                            if (w3c0Var44 != null && (binding61 = w3c0Var44.j0.getBinding()) != null) {
                                                binding61.c.u();
                                                Unit unit42 = Unit.a;
                                            }
                                            q1c0Var.Q0(true);
                                            Unit unit43 = Unit.a;
                                        } else {
                                            w3c0 w3c0Var45 = (w3c0) b3;
                                            if (w3c0Var45 != null && (binding59 = w3c0Var45.j0.getBinding()) != null) {
                                                binding59.d.setUserInputAmount(topBets.getStakeAmount());
                                                Unit unit44 = Unit.a;
                                            }
                                            w3c0 w3c0Var46 = (w3c0) q1c0Var.b;
                                            if (w3c0Var46 != null && (binding57 = w3c0Var46.j0.getBinding()) != null && (binding58 = binding57.d.getBinding()) != null) {
                                                binding58.G.setVisibility(0);
                                                Unit unit45 = Unit.a;
                                            }
                                            w3c0 w3c0Var47 = (w3c0) q1c0Var.b;
                                            if (w3c0Var47 != null && (binding55 = w3c0Var47.j0.getBinding()) != null && (binding56 = binding55.d.getBinding()) != null) {
                                                binding56.y.setVisibility(8);
                                                Unit unit46 = Unit.a;
                                            }
                                            w3c0 w3c0Var48 = (w3c0) q1c0Var.b;
                                            if (w3c0Var48 != null && (binding53 = w3c0Var48.j0.getBinding()) != null && (binding54 = binding53.d.getBinding()) != null) {
                                                binding54.Q0.setVisibility(8);
                                                Unit unit47 = Unit.a;
                                            }
                                            w3c0 w3c0Var49 = (w3c0) q1c0Var.b;
                                            if (w3c0Var49 != null && (binding51 = w3c0Var49.j0.getBinding()) != null && (binding52 = binding51.d.getBinding()) != null) {
                                                binding52.R0.setVisibility(8);
                                                Unit unit48 = Unit.a;
                                            }
                                            w3c0 w3c0Var50 = (w3c0) q1c0Var.b;
                                            if (w3c0Var50 != null && (binding49 = w3c0Var50.j0.getBinding()) != null && (binding50 = binding49.d.getBinding()) != null) {
                                                TextView textView11 = binding50.D0;
                                                TreeMap treeMap12 = pw.a;
                                                textView11.setText(pw.n(topBets.getStakeAmount()));
                                                Unit unit49 = Unit.a;
                                            }
                                            w3c0 w3c0Var51 = (w3c0) q1c0Var.b;
                                            if (w3c0Var51 != null && (binding47 = w3c0Var51.j0.getBinding()) != null && (binding48 = binding47.d.getBinding()) != null) {
                                                TextView textView12 = binding48.J0;
                                                TreeMap treeMap13 = pw.a;
                                                Double startCoefficient3 = topBets.getStartCoefficient();
                                                textView12.setText(pw.n(startCoefficient3 != null ? startCoefficient3.doubleValue() : 0.0d).concat("x"));
                                                Unit unit50 = Unit.a;
                                            }
                                            w3c0 w3c0Var52 = (w3c0) q1c0Var.b;
                                            if (w3c0Var52 != null && (binding45 = w3c0Var52.j0.getBinding()) != null && (binding46 = binding45.d.getBinding()) != null) {
                                                TextView textView13 = binding46.G0;
                                                TreeMap treeMap14 = pw.a;
                                                Double endCoefficient3 = topBets.getEndCoefficient();
                                                textView13.setText(pw.n(endCoefficient3 != null ? endCoefficient3.doubleValue() : 0.0d).concat("x"));
                                                Unit unit51 = Unit.a;
                                            }
                                            Unit unit52 = Unit.a;
                                        }
                                        w3c0 w3c0Var53 = (w3c0) q1c0Var.b;
                                        if (w3c0Var53 != null && (binding60 = w3c0Var53.j0.getBinding()) != null) {
                                            binding60.d.B(topBets);
                                        }
                                    }
                                } else {
                                    q1c0Var.r0();
                                    if (topBets.getBetIndex() == 1) {
                                        w3c0 w3c0Var54 = (w3c0) q1c0Var.b;
                                        if (w3c0Var54 != null && (binding90 = w3c0Var54.j0.getBinding()) != null) {
                                            binding90.c.setCashoutDone(true);
                                            Unit unit53 = Unit.a;
                                        }
                                        w3c0 w3c0Var55 = (w3c0) q1c0Var.b;
                                        if (w3c0Var55 != null && (binding89 = w3c0Var55.j0.getBinding()) != null) {
                                            binding89.c.setBetPlaced(false);
                                            Unit unit54 = Unit.a;
                                        }
                                        w3c0 w3c0Var56 = (w3c0) q1c0Var.b;
                                        if (w3c0Var56 != null && (binding88 = w3c0Var56.j0.getBinding()) != null) {
                                            binding88.c.setBetIsPlaced(false);
                                            Unit unit55 = Unit.a;
                                        }
                                        w3c0 w3c0Var57 = (w3c0) q1c0Var.b;
                                        if (w3c0Var57 != null && (binding86 = w3c0Var57.j0.getBinding()) != null && (binding87 = binding86.c.getBinding()) != null) {
                                            binding87.X.setClickable(true);
                                            Unit unit56 = Unit.a;
                                        }
                                        w3c0 w3c0Var58 = (w3c0) q1c0Var.b;
                                        if (w3c0Var58 != null && (binding85 = w3c0Var58.j0.getBinding()) != null) {
                                            binding85.c.i(1.0f, true);
                                            Unit unit57 = Unit.a;
                                        }
                                        w3c0 w3c0Var59 = (w3c0) q1c0Var.b;
                                        if (w3c0Var59 != null && (binding84 = w3c0Var59.j0.getBinding()) != null) {
                                            binding84.c.m();
                                            Unit unit58 = Unit.a;
                                        }
                                        w3c0 w3c0Var60 = (w3c0) q1c0Var.b;
                                        if (w3c0Var60 != null && (binding83 = w3c0Var60.j0.getBinding()) != null) {
                                            binding83.c.k();
                                            Unit unit59 = Unit.a;
                                        }
                                        w3c0 w3c0Var61 = (w3c0) q1c0Var.b;
                                        if (w3c0Var61 != null && (binding81 = w3c0Var61.j0.getBinding()) != null && (binding82 = binding81.c.getBinding()) != null) {
                                            binding82.X.setAlpha(1.0f);
                                            Unit unit60 = Unit.a;
                                        }
                                        w3c0 w3c0Var62 = (w3c0) q1c0Var.b;
                                        if (w3c0Var62 != null && (binding79 = w3c0Var62.j0.getBinding()) != null && (binding80 = binding79.c.getBinding()) != null) {
                                            binding80.v.setAlpha(1.0f);
                                            Unit unit61 = Unit.a;
                                        }
                                        w3c0 w3c0Var63 = (w3c0) q1c0Var.b;
                                        if (w3c0Var63 != null && (binding77 = w3c0Var63.j0.getBinding()) != null && (binding78 = binding77.c.getBinding()) != null) {
                                            binding78.w.setAlpha(1.0f);
                                            Unit unit62 = Unit.a;
                                        }
                                        Context context = q1c0Var.getContext();
                                        if (context != null) {
                                            if (q1c0Var.x0 || q1c0Var.g2() || q1c0Var.H1()) {
                                                Intent intent = new Intent("custom-event-name");
                                                intent.putExtra("number", "1");
                                                intent.putExtra("enable button", true);
                                                fdt.a(context).c(intent);
                                            }
                                            Unit unit63 = Unit.a;
                                        }
                                        if (topBets.getGiftAmount() != null && (w3c0Var = (w3c0) q1c0Var.b) != null && (binding76 = w3c0Var.j0.getBinding()) != null) {
                                            binding76.c.u();
                                            Unit unit64 = Unit.a;
                                        }
                                    } else {
                                        if (q1c0Var.h0 != null) {
                                            w3c0 w3c0Var64 = (w3c0) q1c0Var.b;
                                            if (w3c0Var64 != null && (binding105 = w3c0Var64.j0.getBinding()) != null) {
                                                binding105.d.setCashoutDone(true);
                                                Unit unit65 = Unit.a;
                                            }
                                            w3c0 w3c0Var65 = (w3c0) q1c0Var.b;
                                            if (w3c0Var65 != null && (binding104 = w3c0Var65.j0.getBinding()) != null) {
                                                binding104.d.setBetPlaced(false);
                                                Unit unit66 = Unit.a;
                                            }
                                            w3c0 w3c0Var66 = (w3c0) q1c0Var.b;
                                            if (w3c0Var66 != null && (binding103 = w3c0Var66.j0.getBinding()) != null) {
                                                binding103.d.setBetIsPlaced(false);
                                                Unit unit67 = Unit.a;
                                            }
                                            w3c0 w3c0Var67 = (w3c0) q1c0Var.b;
                                            if (w3c0Var67 != null && (binding101 = w3c0Var67.j0.getBinding()) != null && (binding102 = binding101.d.getBinding()) != null) {
                                                binding102.X.setClickable(true);
                                                Unit unit68 = Unit.a;
                                            }
                                            w3c0 w3c0Var68 = (w3c0) q1c0Var.b;
                                            if (w3c0Var68 != null && (binding99 = w3c0Var68.j0.getBinding()) != null && (binding100 = binding99.d.getBinding()) != null) {
                                                binding100.X.setAlpha(1.0f);
                                                Unit unit69 = Unit.a;
                                            }
                                            w3c0 w3c0Var69 = (w3c0) q1c0Var.b;
                                            if (w3c0Var69 != null && (binding97 = w3c0Var69.j0.getBinding()) != null && (binding98 = binding97.d.getBinding()) != null) {
                                                binding98.v.setAlpha(1.0f);
                                                Unit unit70 = Unit.a;
                                            }
                                            w3c0 w3c0Var70 = (w3c0) q1c0Var.b;
                                            if (w3c0Var70 != null && (binding95 = w3c0Var70.j0.getBinding()) != null && (binding96 = binding95.d.getBinding()) != null) {
                                                binding96.w.setAlpha(1.0f);
                                                Unit unit71 = Unit.a;
                                            }
                                            if (topBets.getGiftAmount() != null && (w3c0Var2 = (w3c0) q1c0Var.b) != null && (binding94 = w3c0Var2.j0.getBinding()) != null) {
                                                binding94.d.u();
                                                Unit unit72 = Unit.a;
                                            }
                                            w3c0 w3c0Var71 = (w3c0) q1c0Var.b;
                                            if (w3c0Var71 != null && (binding93 = w3c0Var71.j0.getBinding()) != null) {
                                                binding93.d.m();
                                                Unit unit73 = Unit.a;
                                            }
                                            w3c0 w3c0Var72 = (w3c0) q1c0Var.b;
                                            if (w3c0Var72 != null && (binding92 = w3c0Var72.j0.getBinding()) != null) {
                                                binding92.d.k();
                                                Unit unit74 = Unit.a;
                                            }
                                            w3c0 w3c0Var73 = (w3c0) q1c0Var.b;
                                            if (w3c0Var73 != null && (binding91 = w3c0Var73.j0.getBinding()) != null) {
                                                binding91.d.i(1.0f, true);
                                                Unit unit75 = Unit.a;
                                            }
                                        }
                                        Unit unit76 = Unit.a;
                                    }
                                }
                            }
                        }
                        Unit unit77 = Unit.a;
                    }
                } else if (i3 == 2) {
                    if (!q1c0Var.e1 && (w3c0Var3 = (w3c0) q1c0Var.b) != null) {
                        w3c0Var3.d0.P();
                        Unit unit78 = Unit.a;
                    }
                    Unit unit79 = Unit.a;
                } else {
                    if (i3 != 3) {
                        throw new uwx();
                    }
                    Unit unit80 = Unit.a;
                }
                return Unit.a;
        }
    }
}
