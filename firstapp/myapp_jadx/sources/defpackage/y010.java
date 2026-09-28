package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.MultiplierResponse;
import com.sportygames.pingpong.remote.models.TopBets;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y010 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y010(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<TopBets> list;
        tj60 tj60Var;
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        String currency;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        v720 binding8;
        v720 binding9;
        v720 binding10;
        v720 binding11;
        List<DetailResponse> gameDetailsResponseList2;
        DetailResponse detailResponse2;
        String currency2;
        v720 binding12;
        v720 binding13;
        ixi ixiVar;
        v720 binding14;
        v720 binding15;
        v720 binding16;
        v720 binding17;
        v720 binding18;
        ixi ixiVar2;
        v720 binding19;
        v720 binding20;
        v720 binding21;
        v720 binding22;
        v720 binding23;
        v720 binding24;
        ixi ixiVar3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = m410.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        m410Var.D0 = false;
                        if (!m410Var.J0) {
                            ixi ixiVar4 = (ixi) m410Var.b;
                            if (ixiVar4 != null) {
                                ixiVar4.U.P();
                                Unit unit = Unit.a;
                            }
                            m410Var.J0 = true;
                        } else if (!m410Var.K0 && ((tj60Var = m410Var.Q) == null || !tj60Var.isShowing())) {
                            m410Var.Q0().x1();
                        }
                        m410Var.s1();
                        for (TopBets topBets : list) {
                            MultiplierResponse multiplierResponse = m410Var.U;
                            if (multiplierResponse == null || multiplierResponse.getRoundId() != topBets.getRoundId()) {
                                m410Var.o0.add(topBets);
                            } else {
                                ixi ixiVar5 = (ixi) m410Var.b;
                                if (ixiVar5 != null) {
                                    ixiVar5.V.c(topBets);
                                    Unit unit2 = Unit.a;
                                }
                            }
                            m410Var.D0 = false;
                            if (Intrinsics.g(SportyGamesManager.getInstance().getUserId(), topBets.getUserId())) {
                                if (topBets.getCashoutCoefficient() == null) {
                                    goa0 goa0Var = (goa0) m410Var.a;
                                    if (goa0Var != null) {
                                        goa0Var.A1(Integer.valueOf(topBets.getBetIndex()), String.valueOf(topBets.getRoundId()));
                                        Unit unit3 = Unit.a;
                                    }
                                    int betIndex = topBets.getBetIndex();
                                    B b = m410Var.b;
                                    String str = "";
                                    if (betIndex == 1) {
                                        ixi ixiVar6 = (ixi) b;
                                        if (ixiVar6 != null) {
                                            ixiVar6.b.setRoundId(topBets.getRoundId());
                                            Unit unit4 = Unit.a;
                                        }
                                        ixi ixiVar7 = (ixi) m410Var.b;
                                        if (ixiVar7 != null) {
                                            ixiVar7.b.setBetAmount(topBets.getStakeAmount());
                                            Unit unit5 = Unit.a;
                                        }
                                        ixi ixiVar8 = (ixi) m410Var.b;
                                        if (ixiVar8 != null) {
                                            ixiVar8.b.setBetId(topBets.getBetId());
                                            Unit unit6 = Unit.a;
                                        }
                                        ixi ixiVar9 = (ixi) m410Var.b;
                                        if (ixiVar9 != null) {
                                            ixiVar9.b.setBetPlaced(true);
                                            Unit unit7 = Unit.a;
                                        }
                                        ixi ixiVar10 = (ixi) m410Var.b;
                                        if (ixiVar10 != null) {
                                            ixiVar10.b.setBetPlacedV2(true);
                                            Unit unit8 = Unit.a;
                                        }
                                        ixi ixiVar11 = (ixi) m410Var.b;
                                        if (ixiVar11 != null) {
                                            ixiVar11.b.setBetInProgress(false);
                                            Unit unit9 = Unit.a;
                                        }
                                        ixi ixiVar12 = (ixi) m410Var.b;
                                        if (ixiVar12 != null) {
                                            ixiVar12.b.setCashoutDone(false);
                                            Unit unit10 = Unit.a;
                                        }
                                        ixi ixiVar13 = (ixi) m410Var.b;
                                        if (ixiVar13 != null && (binding7 = ixiVar13.b.getBinding()) != null) {
                                            TextView textView = binding7.b;
                                            TreeMap treeMap = pw.a;
                                            textView.setText(pw.n(topBets.getStakeAmount()));
                                            Unit unit11 = Unit.a;
                                        }
                                        Double giftAmount = topBets.getGiftAmount();
                                        GiftItem giftItem = giftAmount != null ? new GiftItem(giftAmount.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                        ixi ixiVar14 = (ixi) m410Var.b;
                                        if (ixiVar14 != null && (binding6 = ixiVar14.b.getBinding()) != null) {
                                            TextView textView2 = binding6.b;
                                            TreeMap treeMap2 = pw.a;
                                            textView2.setText(pw.n(topBets.getStakeAmount()));
                                            Unit unit12 = Unit.a;
                                        }
                                        B b2 = m410Var.b;
                                        if (giftItem != null) {
                                            ixi ixiVar15 = (ixi) b2;
                                            if (ixiVar15 != null && (binding5 = ixiVar15.b.getBinding()) != null) {
                                                TextView textView3 = binding5.b;
                                                TreeMap treeMap3 = pw.a;
                                                textView3.setText(pw.n(topBets.getGiftAmount().doubleValue()));
                                                Unit unit13 = Unit.a;
                                            }
                                            ixi ixiVar16 = (ixi) m410Var.b;
                                            if (ixiVar16 != null) {
                                                ixiVar16.b.setFBG(giftItem, true, topBets.getGiftAmount().doubleValue());
                                                Unit unit14 = Unit.a;
                                            }
                                            ixi ixiVar17 = (ixi) m410Var.b;
                                            if (ixiVar17 != null) {
                                                ixiVar17.c.c();
                                                Unit unit15 = Unit.a;
                                            }
                                            ixi ixiVar18 = (ixi) m410Var.b;
                                            if (ixiVar18 != null) {
                                                ixiVar18.b.setFbgRoundId(topBets.getRoundId());
                                                Unit unit16 = Unit.a;
                                            }
                                            m410Var.E0();
                                            Unit unit17 = Unit.a;
                                        } else {
                                            ixi ixiVar19 = (ixi) b2;
                                            if (ixiVar19 != null) {
                                                ixiVar19.b.setUserInputAmount(topBets.getStakeAmount());
                                                Unit unit18 = Unit.a;
                                            }
                                            Unit unit19 = Unit.a;
                                        }
                                        op5 op5Var = op5.a;
                                        String string = m410Var.getString(R.string.place_bet_cms);
                                        string.getClass();
                                        String string2 = m410Var.getString(R.string.place_bet_text_sh);
                                        string2.getClass();
                                        op5Var.getClass();
                                        String strB = op5.b(string, string2, null);
                                        DetailResponseData detailResponseData = m410Var.w;
                                        if (detailResponseData != null && (gameDetailsResponseList = detailResponseData.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get(0)) != null && (currency = detailResponse.getCurrency()) != null) {
                                            str = currency;
                                        }
                                        String strI = op5.i(str);
                                        TreeMap treeMap4 = pw.a;
                                        StringBuilder sbA = ux5.a(strB, " ", strI, " ", pw.j(topBets.getStakeAmount()));
                                        sbA.append("?");
                                        String string3 = sbA.toString();
                                        ixi ixiVar20 = (ixi) m410Var.b;
                                        if (ixiVar20 != null && (binding4 = ixiVar20.b.getBinding()) != null) {
                                            binding4.Z.setText(string3);
                                        }
                                        m410Var.K = topBets.getRoundId();
                                        if (topBets.getAutoCashoutAt() != null) {
                                            m410Var.E = true;
                                            ixi ixiVar21 = (ixi) m410Var.b;
                                            if (ixiVar21 != null && (binding3 = ixiVar21.b.getBinding()) != null) {
                                                binding3.f.setStatus(true);
                                            }
                                            ixi ixiVar22 = (ixi) m410Var.b;
                                            if (ixiVar22 != null && (binding2 = ixiVar22.b.getBinding()) != null) {
                                                binding2.C.setVisibility(0);
                                            }
                                            ixi ixiVar23 = (ixi) m410Var.b;
                                            if (ixiVar23 != null && (binding = ixiVar23.b.getBinding()) != null) {
                                                binding.z.setText(topBets.getAutoCashoutAt());
                                            }
                                            ixi ixiVar24 = (ixi) m410Var.b;
                                            if (ixiVar24 != null) {
                                                ixiVar24.b.setCashoutCoeff(Double.parseDouble(topBets.getAutoCashoutAt()));
                                            }
                                        }
                                    } else {
                                        ixi ixiVar25 = (ixi) b;
                                        if (ixiVar25 != null) {
                                            ixiVar25.c.setRoundId(topBets.getRoundId());
                                            Unit unit20 = Unit.a;
                                        }
                                        ixi ixiVar26 = (ixi) m410Var.b;
                                        if (ixiVar26 != null) {
                                            ixiVar26.c.setBetAmount(topBets.getStakeAmount());
                                            Unit unit21 = Unit.a;
                                        }
                                        ixi ixiVar27 = (ixi) m410Var.b;
                                        if (ixiVar27 != null) {
                                            ixiVar27.c.setBetId(topBets.getBetId());
                                            Unit unit22 = Unit.a;
                                        }
                                        ixi ixiVar28 = (ixi) m410Var.b;
                                        if (ixiVar28 != null) {
                                            ixiVar28.c.setBetPlaced(true);
                                            Unit unit23 = Unit.a;
                                        }
                                        ixi ixiVar29 = (ixi) m410Var.b;
                                        if (ixiVar29 != null) {
                                            ixiVar29.c.setBetPlacedV2(true);
                                            Unit unit24 = Unit.a;
                                        }
                                        ixi ixiVar30 = (ixi) m410Var.b;
                                        if (ixiVar30 != null) {
                                            ixiVar30.c.setBetInProgress(false);
                                            Unit unit25 = Unit.a;
                                        }
                                        ixi ixiVar31 = (ixi) m410Var.b;
                                        if (ixiVar31 != null) {
                                            ixiVar31.c.setCashoutDone(false);
                                            Unit unit26 = Unit.a;
                                        }
                                        Double giftAmount2 = topBets.getGiftAmount();
                                        GiftItem giftItem2 = giftAmount2 != null ? new GiftItem(giftAmount2.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                        ixi ixiVar32 = (ixi) m410Var.b;
                                        if (ixiVar32 != null && (binding13 = ixiVar32.c.getBinding()) != null) {
                                            TextView textView4 = binding13.b;
                                            TreeMap treeMap5 = pw.a;
                                            textView4.setText(pw.n(topBets.getStakeAmount()));
                                            Unit unit27 = Unit.a;
                                        }
                                        B b3 = m410Var.b;
                                        if (giftItem2 != null) {
                                            ixi ixiVar33 = (ixi) b3;
                                            if (ixiVar33 != null && (binding12 = ixiVar33.c.getBinding()) != null) {
                                                TextView textView5 = binding12.b;
                                                TreeMap treeMap6 = pw.a;
                                                textView5.setText(pw.n(topBets.getGiftAmount().doubleValue()));
                                                Unit unit28 = Unit.a;
                                            }
                                            ixi ixiVar34 = (ixi) m410Var.b;
                                            if (ixiVar34 != null) {
                                                ixiVar34.c.setFbgRoundId(topBets.getRoundId());
                                                Unit unit29 = Unit.a;
                                            }
                                            ixi ixiVar35 = (ixi) m410Var.b;
                                            if (ixiVar35 != null) {
                                                ixiVar35.c.setFBG(giftItem2, true, topBets.getGiftAmount().doubleValue());
                                                Unit unit30 = Unit.a;
                                            }
                                            ixi ixiVar36 = (ixi) m410Var.b;
                                            if (ixiVar36 != null) {
                                                ixiVar36.b.c();
                                                Unit unit31 = Unit.a;
                                            }
                                            m410Var.E0();
                                            Unit unit32 = Unit.a;
                                        } else {
                                            ixi ixiVar37 = (ixi) b3;
                                            if (ixiVar37 != null) {
                                                ixiVar37.c.setUserInputAmount(topBets.getStakeAmount());
                                                Unit unit33 = Unit.a;
                                            }
                                            Unit unit34 = Unit.a;
                                        }
                                        op5 op5Var2 = op5.a;
                                        String string4 = m410Var.getString(R.string.place_bet_cms);
                                        string4.getClass();
                                        String string5 = m410Var.getString(R.string.place_bet_text_sh);
                                        string5.getClass();
                                        op5Var2.getClass();
                                        String strB2 = op5.b(string4, string5, null);
                                        DetailResponseData detailResponseData2 = m410Var.w;
                                        if (detailResponseData2 != null && (gameDetailsResponseList2 = detailResponseData2.getGameDetailsResponseList()) != null && (detailResponse2 = gameDetailsResponseList2.get(1)) != null && (currency2 = detailResponse2.getCurrency()) != null) {
                                            str = currency2;
                                        }
                                        String strI2 = op5.i(str);
                                        TreeMap treeMap7 = pw.a;
                                        StringBuilder sbA2 = ux5.a(strB2, " ", strI2, " ", pw.j(topBets.getStakeAmount()));
                                        sbA2.append("?");
                                        String string6 = sbA2.toString();
                                        ixi ixiVar38 = (ixi) m410Var.b;
                                        if (ixiVar38 != null && (binding11 = ixiVar38.c.getBinding()) != null) {
                                            binding11.Z.setText(string6);
                                        }
                                        m410Var.L = topBets.getRoundId();
                                        if (topBets.getAutoCashoutAt() != null) {
                                            m410Var.I = true;
                                            ixi ixiVar39 = (ixi) m410Var.b;
                                            if (ixiVar39 != null && (binding10 = ixiVar39.c.getBinding()) != null) {
                                                binding10.f.setStatus(true);
                                            }
                                            ixi ixiVar40 = (ixi) m410Var.b;
                                            if (ixiVar40 != null && (binding9 = ixiVar40.c.getBinding()) != null) {
                                                binding9.C.setVisibility(0);
                                            }
                                            ixi ixiVar41 = (ixi) m410Var.b;
                                            if (ixiVar41 != null && (binding8 = ixiVar41.c.getBinding()) != null) {
                                                binding8.z.setText(topBets.getAutoCashoutAt());
                                            }
                                            ixi ixiVar42 = (ixi) m410Var.b;
                                            if (ixiVar42 != null) {
                                                ixiVar42.c.setCashoutCoeff(Double.parseDouble(topBets.getAutoCashoutAt()));
                                            }
                                        }
                                    }
                                } else {
                                    m410Var.q0();
                                    goa0 goa0Var2 = (goa0) m410Var.a;
                                    if (goa0Var2 != null) {
                                        String strValueOf = String.valueOf(topBets.getRoundId());
                                        Long lValueOf = Long.valueOf(topBets.getBetId());
                                        strValueOf.getClass();
                                        goa0Var2.C.put(goa0.E1(lValueOf, strValueOf), Boolean.TRUE);
                                        Unit unit35 = Unit.a;
                                    }
                                    if (topBets.getBetIndex() == 1) {
                                        ixi ixiVar43 = (ixi) m410Var.b;
                                        if (ixiVar43 != null) {
                                            ixiVar43.b.setCashoutDone(true);
                                            Unit unit36 = Unit.a;
                                        }
                                        ixi ixiVar44 = (ixi) m410Var.b;
                                        if (ixiVar44 != null) {
                                            ixiVar44.b.setBetPlaced(false);
                                            Unit unit37 = Unit.a;
                                        }
                                        ixi ixiVar45 = (ixi) m410Var.b;
                                        if (ixiVar45 != null) {
                                            ixiVar45.b.setBetPlacedV2(false);
                                            Unit unit38 = Unit.a;
                                        }
                                        ixi ixiVar46 = (ixi) m410Var.b;
                                        if (ixiVar46 != null && (binding18 = ixiVar46.b.getBinding()) != null) {
                                            binding18.v.setClickable(true);
                                            Unit unit39 = Unit.a;
                                        }
                                        ixi ixiVar47 = (ixi) m410Var.b;
                                        if (ixiVar47 != null && (binding17 = ixiVar47.b.getBinding()) != null) {
                                            binding17.v.setAlpha(1.0f);
                                            Unit unit40 = Unit.a;
                                        }
                                        Context context = m410Var.getContext();
                                        String str2 = Chyeyik.NTSmYqJunZI;
                                        if (context != null) {
                                            if (m410Var.h0) {
                                                Intent intent = new Intent("custom-event-name");
                                                intent.putExtra(str2, "1");
                                                intent.putExtra("enable button", true);
                                                fdt.a(context).c(intent);
                                            }
                                            Unit unit41 = Unit.a;
                                        }
                                        if (m410Var.U != null && topBets.getAutoCashoutAt() != null) {
                                            double d = Double.parseDouble(topBets.getAutoCashoutAt());
                                            MultiplierResponse multiplierResponse2 = m410Var.U;
                                            if (multiplierResponse2 == null) {
                                                Intrinsics.n("multiplierResponse");
                                                throw null;
                                            }
                                            if (d >= Double.parseDouble(multiplierResponse2.getMultiplier())) {
                                                m410Var.E = true;
                                                ixi ixiVar48 = (ixi) m410Var.b;
                                                if (ixiVar48 != null && (binding16 = ixiVar48.b.getBinding()) != null) {
                                                    binding16.f.setStatus(true);
                                                    Unit unit42 = Unit.a;
                                                }
                                                ixi ixiVar49 = (ixi) m410Var.b;
                                                if (ixiVar49 != null && (binding15 = ixiVar49.b.getBinding()) != null) {
                                                    binding15.C.setVisibility(0);
                                                    Unit unit43 = Unit.a;
                                                }
                                                ixi ixiVar50 = (ixi) m410Var.b;
                                                if (ixiVar50 != null && (binding14 = ixiVar50.b.getBinding()) != null) {
                                                    binding14.z.setText(topBets.getAutoCashoutAt());
                                                    Unit unit44 = Unit.a;
                                                }
                                                Context context2 = m410Var.getContext();
                                                if (context2 != null) {
                                                    if (m410Var.h0) {
                                                        Intent intent2 = new Intent("custom-event-name");
                                                        intent2.putExtra(str2, "2");
                                                        intent2.putExtra("enable button", true);
                                                        fdt.a(context2).c(intent2);
                                                    }
                                                    Unit unit45 = Unit.a;
                                                }
                                            }
                                        }
                                        if (topBets.getGiftAmount() != null && (ixiVar = (ixi) m410Var.b) != null) {
                                            ixiVar.b.c();
                                            Unit unit46 = Unit.a;
                                        }
                                    } else {
                                        if (m410Var.U != null) {
                                            if (topBets.getAutoCashoutAt() != null) {
                                                double d2 = Double.parseDouble(topBets.getAutoCashoutAt());
                                                MultiplierResponse multiplierResponse3 = m410Var.U;
                                                if (multiplierResponse3 == null) {
                                                    Intrinsics.n("multiplierResponse");
                                                    throw null;
                                                }
                                                if (d2 >= Double.parseDouble(multiplierResponse3.getMultiplier())) {
                                                    m410Var.I = true;
                                                    ixi ixiVar51 = (ixi) m410Var.b;
                                                    if (ixiVar51 != null && (binding24 = ixiVar51.c.getBinding()) != null) {
                                                        binding24.f.setStatus(true);
                                                        Unit unit47 = Unit.a;
                                                    }
                                                    ixi ixiVar52 = (ixi) m410Var.b;
                                                    if (ixiVar52 != null && (binding23 = ixiVar52.c.getBinding()) != null) {
                                                        binding23.C.setVisibility(0);
                                                        Unit unit48 = Unit.a;
                                                    }
                                                    ixi ixiVar53 = (ixi) m410Var.b;
                                                    if (ixiVar53 != null && (binding22 = ixiVar53.c.getBinding()) != null) {
                                                        binding22.z.setText(topBets.getAutoCashoutAt());
                                                        Unit unit49 = Unit.a;
                                                    }
                                                }
                                            }
                                            ixi ixiVar54 = (ixi) m410Var.b;
                                            if (ixiVar54 != null) {
                                                ixiVar54.c.setCashoutDone(true);
                                                Unit unit50 = Unit.a;
                                            }
                                            ixi ixiVar55 = (ixi) m410Var.b;
                                            if (ixiVar55 != null) {
                                                ixiVar55.c.setBetPlaced(false);
                                                Unit unit51 = Unit.a;
                                            }
                                            ixi ixiVar56 = (ixi) m410Var.b;
                                            if (ixiVar56 != null) {
                                                ixiVar56.c.setBetPlacedV2(false);
                                                Unit unit52 = Unit.a;
                                            }
                                            ixi ixiVar57 = (ixi) m410Var.b;
                                            if (ixiVar57 != null && (binding21 = ixiVar57.c.getBinding()) != null) {
                                                binding21.v.setClickable(true);
                                                Unit unit53 = Unit.a;
                                            }
                                            ixi ixiVar58 = (ixi) m410Var.b;
                                            if (ixiVar58 != null && (binding20 = ixiVar58.c.getBinding()) != null) {
                                                binding20.v.setAlpha(1.0f);
                                                Unit unit54 = Unit.a;
                                            }
                                            ixi ixiVar59 = (ixi) m410Var.b;
                                            if (ixiVar59 != null && (binding19 = ixiVar59.c.getBinding()) != null) {
                                                binding19.B.setAlpha(1.0f);
                                                Unit unit55 = Unit.a;
                                            }
                                            if (topBets.getGiftAmount() != null && (ixiVar2 = (ixi) m410Var.b) != null) {
                                                ixiVar2.c.c();
                                                Unit unit56 = Unit.a;
                                            }
                                        }
                                        Unit unit57 = Unit.a;
                                    }
                                }
                            }
                        }
                        Unit unit58 = Unit.a;
                    }
                } else if (i2 == 2) {
                    Unit unit59 = Unit.a;
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    if (!m410Var.J0 && (ixiVar3 = (ixi) m410Var.b) != null) {
                        ixiVar3.U.P();
                        Unit unit60 = Unit.a;
                    }
                    Unit unit61 = Unit.a;
                }
                return Unit.a;
            default:
                x690 x690Var = (x690) obj;
                x690Var.getClass();
                ((Function1) obj2).invoke(new de90.k(x690Var));
                return Unit.a;
        }
    }
}
