package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.protobuf.Reader;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spin2win.components.Spin2WinButtonBoard;
import com.sportygames.spin2win.components.Spin2WinNumberBoard;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import com.sportygames.spin2win.model.response.GameDetailsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bj6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ bj6(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<String> allBetAmountList;
        List<String> allBetAmountList2;
        Integer maxBetCount;
        List<String> allBetAmountList3;
        Object value;
        ArrayList arrayListC0;
        List<String> allBetAmountList4;
        List<String> allBetAmountList5;
        LocalGameDetailsEntity localGameDetailsEntity;
        Double dValueOf;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                b bVar = (b) fragment;
                bVar.D0().q();
                bVar.P0(p0z.c);
                break;
            default:
                a1b0 a1b0Var = (a1b0) fragment;
                LocalGameDetailsEntity localGameDetailsEntity2 = a1b0Var.L;
                ArrayList arrayList = a1b0Var.J;
                if (localGameDetailsEntity2 != null && (allBetAmountList = localGameDetailsEntity2.getAllBetAmountList()) != null && !allBetAmountList.isEmpty()) {
                    ypa0 ypa0VarZ0 = a1b0Var.z0();
                    Context context = a1b0Var.getContext();
                    String string = context != null ? context.getString(R.string.sg_spin2win_sound_chip_bet_less) : null;
                    if (string == null) {
                        string = "";
                    }
                    ypa0VarZ0.A1(0L, string);
                    LocalGameDetailsEntity localGameDetailsEntity3 = a1b0Var.L;
                    if (localGameDetailsEntity3 != null && (allBetAmountList5 = localGameDetailsEntity3.getAllBetAmountList()) != null && (localGameDetailsEntity = a1b0Var.L) != null) {
                        Double betAmount = localGameDetailsEntity.getBetAmount();
                        if (betAmount != null) {
                            double dDoubleValue = betAmount.doubleValue();
                            String str = (String) CollectionsKt.b0(allBetAmountList5);
                            dValueOf = Double.valueOf(dDoubleValue - (str != null ? Double.parseDouble(str) : 0.0d));
                        } else {
                            dValueOf = Double.valueOf(0.0d);
                        }
                        localGameDetailsEntity.setBetAmount(dValueOf);
                    }
                    LocalGameDetailsEntity localGameDetailsEntity4 = a1b0Var.L;
                    if (localGameDetailsEntity4 != null && (allBetAmountList4 = localGameDetailsEntity4.getAllBetAmountList()) != null) {
                        if (allBetAmountList4.isEmpty()) {
                            allBetAmountList4 = null;
                        }
                        if (allBetAmountList4 != null) {
                            try {
                                zi50.a aVar = zi50.b;
                                allBetAmountList4.remove(allBetAmountList4.size() - 1);
                            } catch (Throwable unused) {
                                zi50.a aVar2 = zi50.b;
                            }
                        }
                    }
                    LocalGameDetailsEntity localGameDetailsEntity5 = a1b0Var.L;
                    if (localGameDetailsEntity5 != null && (allBetAmountList3 = localGameDetailsEntity5.getAllBetAmountList()) != null && allBetAmountList3.isEmpty()) {
                        v4b0 v4b0VarW0 = a1b0Var.w0();
                        LocalGameDetailsEntity localGameDetailsEntity6 = a1b0Var.L;
                        v4b0VarW0.f.remove(new v4b0.a(localGameDetailsEntity6 != null ? localGameDetailsEntity6.getCategory() : null, localGameDetailsEntity6 != null ? localGameDetailsEntity6.getValue() : null, localGameDetailsEntity6 != null ? localGameDetailsEntity6.getBetType() : null));
                        wwd0 wwd0Var = v4b0VarW0.e;
                        qcn qcnVar = (qcn) v4b0VarW0.B.a.getValue();
                        wwd0Var.getClass();
                        qcnVar.getClass();
                        z3b0 z3b0VarA = ls6.a(new z3b0(0), Reader.READ_DONE, qcnVar, localGameDetailsEntity6);
                        if (z3b0VarA != null) {
                            do {
                                value = wwd0Var.getValue();
                                arrayListC0 = CollectionsKt.C0(((z3b0) value).a);
                                Iterator<Integer> it = z3b0VarA.a.iterator();
                                while (it.hasNext()) {
                                    arrayListC0.remove(Integer.valueOf(it.next().intValue()));
                                }
                            } while (!wwd0Var.g(value, new z3b0(a4h.f(arrayListC0))));
                        }
                    }
                    LocalGameDetailsEntity localGameDetailsEntity7 = a1b0Var.L;
                    if (localGameDetailsEntity7 != null && arrayList != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            LocalGameDetailsEntity localGameDetailsEntity8 = (LocalGameDetailsEntity) obj;
                            if (Intrinsics.g(localGameDetailsEntity8.getCategory(), localGameDetailsEntity7.getCategory()) && Intrinsics.g(localGameDetailsEntity8.getBetTypeId(), localGameDetailsEntity7.getBetTypeId()) && Intrinsics.g(localGameDetailsEntity8.getLocalizedTitle(), localGameDetailsEntity7.getLocalizedTitle())) {
                                arrayList2.add(obj);
                            }
                        }
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            i3++;
                            LocalGameDetailsEntity localGameDetailsEntity9 = (LocalGameDetailsEntity) obj2;
                            localGameDetailsEntity9.setAllBetAmountList(localGameDetailsEntity7.getAllBetAmountList());
                            localGameDetailsEntity9.setBetAmount(localGameDetailsEntity7.getBetAmount());
                        }
                    }
                    LocalGameDetailsEntity localGameDetailsEntity10 = a1b0Var.L;
                    boolean zG = Intrinsics.g(localGameDetailsEntity10 != null ? localGameDetailsEntity10.getCategory() : null, "NUMBER");
                    wxi wxiVar = a1b0Var.v;
                    if (zG) {
                        if (wxiVar != null) {
                            Spin2WinNumberBoard spin2WinNumberBoard = wxiVar.J;
                            LocalGameDetailsEntity localGameDetailsEntity11 = a1b0Var.L;
                            GameDetailsResponse gameDetailsResponse = a1b0Var.T;
                            ArrayList<Double> betChipList = gameDetailsResponse != null ? gameDetailsResponse.getBetChipList() : null;
                            int i4 = Spin2WinNumberBoard.K;
                            spin2WinNumberBoard.Q(localGameDetailsEntity11, betChipList, AnalyticsParam.DATA_NORMAL);
                        }
                    } else if (wxiVar != null) {
                        Spin2WinButtonBoard spin2WinButtonBoard = wxiVar.i;
                        LocalGameDetailsEntity localGameDetailsEntity12 = a1b0Var.L;
                        GameDetailsResponse gameDetailsResponse2 = a1b0Var.T;
                        ArrayList<Double> betChipList2 = gameDetailsResponse2 != null ? gameDetailsResponse2.getBetChipList() : null;
                        int i5 = Spin2WinButtonBoard.J;
                        spin2WinButtonBoard.N(localGameDetailsEntity12, betChipList2, AnalyticsParam.DATA_NORMAL);
                    }
                    LocalGameDetailsEntity localGameDetailsEntity13 = a1b0Var.L;
                    if (localGameDetailsEntity13 == null || (allBetAmountList2 = localGameDetailsEntity13.getAllBetAmountList()) == null || !allBetAmountList2.isEmpty()) {
                        a1b0Var.X0();
                    } else {
                        wxi wxiVar2 = a1b0Var.v;
                        if (wxiVar2 != null) {
                            wxiVar2.a0.setEnabled(false);
                        }
                        wxi wxiVar3 = a1b0Var.v;
                        if (wxiVar3 != null) {
                            wxiVar3.a0.setAlpha(0.5f);
                        }
                        GameDetailsResponse gameDetailsResponse3 = a1b0Var.T;
                        if (gameDetailsResponse3 != null) {
                            Integer maxBetCount2 = gameDetailsResponse3.getMaxBetCount();
                            gameDetailsResponse3.setMaxBetCount(Integer.valueOf((maxBetCount2 != null ? maxBetCount2.intValue() : 0) + 1));
                        }
                        v4b0 v4b0VarW1 = a1b0Var.w0();
                        GameDetailsResponse gameDetailsResponse4 = a1b0Var.T;
                        v4b0VarW1.c = Integer.valueOf((gameDetailsResponse4 == null || (maxBetCount = gameDetailsResponse4.getMaxBetCount()) == null) ? 0 : maxBetCount.intValue());
                        if (a1b0Var.E0()) {
                            wxi wxiVar4 = a1b0Var.v;
                            if (wxiVar4 != null) {
                                wxiVar4.v.setEnabled(false);
                            }
                            wxi wxiVar5 = a1b0Var.v;
                            if (wxiVar5 != null) {
                                wxiVar5.v.setAlpha(0.5f);
                            }
                            wxi wxiVar6 = a1b0Var.v;
                            if (wxiVar6 != null) {
                                wxiVar6.O.setEnabled(false);
                            }
                            wxi wxiVar7 = a1b0Var.v;
                            if (wxiVar7 != null) {
                                wxiVar7.O.setAlpha(0.5f);
                            }
                            wxi wxiVar8 = a1b0Var.v;
                            if (wxiVar8 != null) {
                                wxiVar8.P.setVisibility(8);
                            }
                            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                            wxi wxiVar9 = a1b0Var.v;
                            bVar2.f(wxiVar9 != null ? wxiVar9.O : null);
                            wxi wxiVar10 = a1b0Var.v;
                            int id = wxiVar10 != null ? wxiVar10.W.getId() : 0;
                            wxi wxiVar11 = a1b0Var.v;
                            bVar2.g(id, 4, wxiVar11 != null ? wxiVar11.O.getId() : 0, 4);
                            wxi wxiVar12 = a1b0Var.v;
                            bVar2.b(wxiVar12 != null ? wxiVar12.O : null);
                        } else {
                            a1b0Var.X0();
                        }
                    }
                    a1b0Var.V0(a1b0Var.L);
                    GameDetails gameDetails = a1b0Var.i;
                    wz.a("UndoClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    if (!a1b0Var.a0) {
                        boolean zE0 = a1b0Var.E0();
                        wxi wxiVar13 = a1b0Var.v;
                        if (!zE0) {
                            if (wxiVar13 != null) {
                                wxiVar13.c.E(false);
                            }
                        } else if (wxiVar13 != null) {
                            wxiVar13.c.E(true);
                        }
                    } else {
                        GameDetails gameDetails2 = a1b0Var.i;
                        String name = gameDetails2 != null ? gameDetails2.getName() : null;
                        wz.a("FBGRemoved", name != null ? name : "", new String[0]);
                        a1b0Var.K0();
                        wxi wxiVar14 = a1b0Var.v;
                        if (wxiVar14 != null) {
                            wxiVar14.c.E(true);
                        }
                        a1b0.U0(a1b0Var, arrayList);
                    }
                    break;
                }
                break;
        }
    }
}
