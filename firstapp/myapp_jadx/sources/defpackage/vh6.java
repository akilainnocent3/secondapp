package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vh6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wxi wxiVar;
        String name;
        wxi wxiVar2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pl6 pl6Var = (pl6) obj;
                pl6Var.getClass();
                ((xh6) obj2).l(pl6Var);
                return Unit.a;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = a1b0.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    Context context = a1b0Var.getContext();
                    String str = "";
                    if (context != null) {
                        SharedPreferences sharedPreferences = a1b0Var.y;
                        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("spin2win_sound", true)) : null;
                        SharedPreferences sharedPreferences2 = a1b0Var.y;
                        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("spin2win_music", true)) : null;
                        wxi wxiVar3 = a1b0Var.v;
                        if (wxiVar3 != null) {
                            ProgressMeterComponent progressMeterComponent = wxiVar3.M;
                            GameDetails gameDetails = a1b0Var.i;
                            String name2 = gameDetails != null ? gameDetails.getName() : null;
                            progressMeterComponent.setSoundManager("Spin2Win/", name2 == null ? "" : name2, boolValueOf, boolValueOf2, rk60.b.y, a1b0Var.i, context);
                        }
                        wxi wxiVar4 = a1b0Var.v;
                        if (wxiVar4 != null) {
                            wxiVar4.M.H(a1b0Var.z0());
                        }
                    }
                    wxi wxiVar5 = a1b0Var.v;
                    op5.r(op5Var, b.f(wxiVar5 != null ? wxiVar5.T : null), null, 6);
                    wxi wxiVar6 = a1b0Var.v;
                    if (wxiVar6 != null) {
                        wxiVar6.M.P();
                    }
                    Context context2 = a1b0Var.getContext();
                    if (context2 != null) {
                        wxi wxiVar7 = a1b0Var.v;
                        if (wxiVar7 != null) {
                            wxiVar7.M.F(context2, "spin-to-win");
                        }
                        e activity = a1b0Var.getActivity();
                        if (activity != null && (wxiVar = a1b0Var.v) != null) {
                            ProgressMeterComponent progressMeterComponent2 = wxiVar.M;
                            String[] stringArray = context2.getResources().getStringArray(R.array.spin2win_array);
                            stringArray.getClass();
                            GameDetails gameDetails2 = a1b0Var.i;
                            if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                                str = name;
                            }
                            int i3 = ProgressMeterComponent.N;
                            progressMeterComponent2.G(activity, stringArray, str, true);
                        }
                    }
                } else if (i2 == 2) {
                    wxi wxiVar8 = a1b0Var.v;
                    if (wxiVar8 != null) {
                        wxiVar8.M.P();
                    }
                    Context context3 = a1b0Var.getContext();
                    if (context3 != null && (wxiVar2 = a1b0Var.v) != null) {
                        wxiVar2.M.F(context3, "spin-to-win");
                    }
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
