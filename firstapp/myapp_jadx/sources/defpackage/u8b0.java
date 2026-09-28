package defpackage;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u8b0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u8b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList<DetailResponse.BetConfigList> arrayList;
        ArrayList<Double> arrayList2;
        AppCompatImageView redMark;
        String name;
        DetailResponse detailResponse;
        AppCompatImageView redMark2;
        DetailResponse detailResponse2;
        f6j0 binding;
        f6j0 binding2;
        DetailResponse detailResponse3;
        fo80 fo80Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kab0 kab0Var = (kab0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = kab0.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse == null || (detailResponse3 = (DetailResponse) hTTPResponse.getData()) == null || (arrayList = detailResponse3.getBetConfigList()) == null) {
                        arrayList = new ArrayList<>();
                    }
                    kab0Var.y = arrayList;
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    kab0Var.z = hTTPResponse2 != null ? (DetailResponse) hTTPResponse2.getData() : null;
                    fo80 fo80Var2 = kab0Var.c;
                    if (fo80Var2 != null && (binding2 = fo80Var2.c0.getBinding()) != null) {
                        binding2.w.setVisibility(8);
                    }
                    fo80 fo80Var3 = kab0Var.c;
                    if (fo80Var3 != null && (binding = fo80Var3.c0.getBinding()) != null) {
                        binding.y.setVisibility(0);
                    }
                    double d = kab0Var.M;
                    DetailResponse detailResponse4 = kab0Var.z;
                    kab0Var.H0(d, detailResponse4 != null ? detailResponse4.getMinStakeAmount() : 0.0d);
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse3 == null || (detailResponse2 = (DetailResponse) hTTPResponse3.getData()) == null || (arrayList2 = detailResponse2.getBetChipList()) == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    kab0Var.w = arrayList2;
                    p48.A(kab0Var.y, new t9b0());
                    ArrayList<DetailResponse.BetConfigList> arrayList3 = kab0Var.y;
                    if (arrayList3.size() > 1) {
                        o48.v(new rab0(), arrayList3);
                    }
                    if (kab0Var.O) {
                        fo80 fo80Var4 = kab0Var.c;
                        if (fo80Var4 != null) {
                            fo80Var4.c.setBetConfigList(kab0Var.y, kab0Var.v0());
                        }
                        kab0Var.O = false;
                    }
                    double d2 = kab0Var.M;
                    DetailResponse detailResponse5 = kab0Var.z;
                    double minStakeAmount = detailResponse5 != null ? detailResponse5.getMinStakeAmount() : 0.0d;
                    fo80 fo80Var5 = kab0Var.c;
                    if (d2 < minStakeAmount) {
                        if (fo80Var5 != null && (redMark2 = fo80Var5.G.getRedMark()) != null) {
                            redMark2.setVisibility(0);
                        }
                        fo80 fo80Var6 = kab0Var.c;
                        if (fo80Var6 != null) {
                            fo80Var6.F.F(R.drawable.hamberger_add_more_red);
                        }
                    } else {
                        if (fo80Var5 != null && (redMark = fo80Var5.G.getRedMark()) != null) {
                            redMark.setVisibility(8);
                        }
                        fo80 fo80Var7 = kab0Var.c;
                        if (fo80Var7 != null) {
                            fo80Var7.F.F(R.drawable.hamberger_add_money_spin_match_bg);
                        }
                    }
                    HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse4 == null || (detailResponse = (DetailResponse) hTTPResponse4.getData()) == null || !detailResponse.isNextRoundFreeSpin()) {
                        fo80 fo80Var8 = kab0Var.c;
                        if (fo80Var8 != null) {
                            fo80Var8.M.setVisibility(8);
                        }
                    } else {
                        fo80 fo80Var9 = kab0Var.c;
                        if (fo80Var9 != null) {
                            fo80Var9.C.setVisibility(0);
                        }
                        fo80 fo80Var10 = kab0Var.c;
                        if (fo80Var10 != null) {
                            fo80Var10.M.setVisibility(0);
                        }
                        fo80 fo80Var11 = kab0Var.c;
                        if (fo80Var11 != null) {
                            fo80Var11.i.setVisibility(4);
                        }
                        ej5.c(kab0Var.a, null, null, new nab0(kab0Var, loadingState, null), 3);
                    }
                    GameDetails gameDetails = kab0Var.b;
                    if (gameDetails != null && (name = gameDetails.getName()) != null) {
                        nbb0 nbb0VarW0 = kab0Var.w0();
                        ej5.c(o8i0.d(nbb0VarW0), null, null, new obb0(nbb0VarW0, name, null), 3);
                    }
                    if (kab0Var.T) {
                        kab0Var.w0().y1();
                    } else {
                        kab0Var.T = true;
                        fo80 fo80Var12 = kab0Var.c;
                        if (fo80Var12 != null) {
                            fo80Var12.N.P();
                        }
                    }
                    if (kab0Var.C) {
                        nbb0 nbb0VarW1 = kab0Var.w0();
                        ej5.c(o8i0.d(nbb0VarW1), null, null, new rbb0(nbb0VarW1, null), 3);
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    Context context = kab0Var.getContext();
                    if (context != null) {
                        if (!kab0Var.T && (fo80Var = kab0Var.c) != null) {
                            fo80Var.N.O(100);
                        }
                        kab0Var.K0(context, loadingState.getError());
                    }
                }
                return Unit.a;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new qve0.z(ijf0Var));
                return Unit.a;
        }
    }
}
