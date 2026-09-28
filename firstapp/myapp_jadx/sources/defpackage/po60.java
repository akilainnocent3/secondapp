package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class po60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ po60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dcb0 dcb0Var;
        dcb0 dcb0Var2;
        String name;
        qo80 binding;
        qo80 binding2;
        qo80 binding3;
        qo80 binding4;
        dcb0 dcb0Var3;
        rk60 soundManager;
        qo80 binding5;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((osw) obj2).k((int) (((jxo) obj).a & 4294967295L));
                return Unit.a;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                Status status = loadingState.getStatus();
                Status status2 = Status.SUCCESS;
                String str = UccrWswQGaIj.ndMCzd;
                if (status == status2) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                    if (dcb0Var4 != null && (binding5 = dcb0Var4.F.getBinding()) != null) {
                        binding5.f.setText(b8b0Var.getString(R.string.bottle_name));
                    }
                    SharedPreferences sharedPreferences = b8b0Var.Z;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPIN_DA_BOTTLE_SOUND", true)) : null;
                    SharedPreferences sharedPreferences2 = b8b0Var.Z;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPIN_DA_BOTTLE_MUSIC", true)) : null;
                    Context context = b8b0Var.getContext();
                    if (context != null) {
                        dcb0 dcb0Var5 = (dcb0) b8b0Var.b;
                        if (dcb0Var5 != null) {
                            dcb0Var5.M.setSoundManager("Bottle/", b8b0Var.p0, boolValueOf, boolValueOf2, rk60.b.e, b8b0Var.y, context);
                        }
                        dcb0 dcb0Var6 = (dcb0) b8b0Var.b;
                        if (dcb0Var6 != null && (soundManager = dcb0Var6.M.getSoundManager()) != null) {
                            ypa0 ypa0Var = b8b0Var.J;
                            if (ypa0Var == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            ypa0.E1(ypa0Var, soundManager);
                        }
                    }
                    if (b8b0Var.getContext() != null && (dcb0Var3 = (dcb0) b8b0Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent = dcb0Var3.M;
                        ypa0 ypa0Var2 = b8b0Var.J;
                        if (ypa0Var2 == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        progressMeterComponent.H(ypa0Var2);
                    }
                    dcb0 dcb0Var7 = (dcb0) b8b0Var.b;
                    TextView textView = dcb0Var7 != null ? dcb0Var7.C.getTextView() : null;
                    dcb0 dcb0Var8 = (dcb0) b8b0Var.b;
                    TextView textView2 = dcb0Var8 != null ? dcb0Var8.R : null;
                    TextView textView3 = dcb0Var8 != null ? dcb0Var8.w : null;
                    TextView textView4 = dcb0Var8 != null ? dcb0Var8.K : null;
                    TextView textView5 = dcb0Var8 != null ? dcb0Var8.L : null;
                    TextView textView6 = dcb0Var8 != null ? dcb0Var8.N : null;
                    TextView textView7 = dcb0Var8 != null ? dcb0Var8.I : null;
                    TextView textView8 = (dcb0Var8 == null || (binding4 = dcb0Var8.F.getBinding()) == null) ? null : binding4.f;
                    dcb0 dcb0Var9 = (dcb0) b8b0Var.b;
                    TextView betText = dcb0Var9 != null ? dcb0Var9.c.getBetText() : null;
                    dcb0 dcb0Var10 = (dcb0) b8b0Var.b;
                    op5.r(op5Var, b.f(textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, betText, dcb0Var10 != null ? dcb0Var10.A : null), null, 4);
                    dcb0 dcb0Var11 = (dcb0) b8b0Var.b;
                    if (dcb0Var11 != null && (binding = dcb0Var11.F.getBinding()) != null) {
                        TextView textView9 = binding.c;
                        dcb0 dcb0Var12 = (dcb0) b8b0Var.b;
                        String strValueOf = String.valueOf((dcb0Var12 == null || (binding3 = dcb0Var12.F.getBinding()) == null) ? null : binding3.c.getTag());
                        dcb0 dcb0Var13 = (dcb0) b8b0Var.b;
                        textView9.setText("+ ".concat(op5.c(op5Var, strValueOf, String.valueOf((dcb0Var13 == null || (binding2 = dcb0Var13.F.getBinding()) == null) ? null : binding2.c.getText()))));
                    }
                    dcb0 dcb0Var14 = (dcb0) b8b0Var.b;
                    if (dcb0Var14 != null) {
                        TextView textView10 = dcb0Var14.b;
                        String strValueOf2 = String.valueOf(textView10.getTag());
                        dcb0 dcb0Var15 = (dcb0) b8b0Var.b;
                        textView10.setText("+ ".concat(op5.c(op5Var, strValueOf2, String.valueOf(dcb0Var15 != null ? dcb0Var15.b.getText() : null))));
                    }
                    dcb0 dcb0Var16 = (dcb0) b8b0Var.b;
                    if (dcb0Var16 != null) {
                        dcb0Var16.M.P();
                    }
                    Context context2 = b8b0Var.getContext();
                    if (context2 != null) {
                        dcb0 dcb0Var17 = (dcb0) b8b0Var.b;
                        if (dcb0Var17 != null) {
                            dcb0Var17.M.F(context2, str);
                        }
                        e activity = b8b0Var.getActivity();
                        if (activity != null && (dcb0Var2 = (dcb0) b8b0Var.b) != null) {
                            ProgressMeterComponent progressMeterComponent2 = dcb0Var2.M;
                            String[] stringArray = context2.getResources().getStringArray(R.array.spin_da_bottle_array);
                            stringArray.getClass();
                            GameDetails gameDetails = b8b0Var.y;
                            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                                name = "";
                            }
                            int i2 = ProgressMeterComponent.N;
                            progressMeterComponent2.G(activity, stringArray, name, true);
                        }
                    }
                } else if (loadingState.getStatus() == Status.FAILED) {
                    dcb0 dcb0Var18 = (dcb0) b8b0Var.b;
                    if (dcb0Var18 != null) {
                        dcb0Var18.M.P();
                    }
                    Context context3 = b8b0Var.getContext();
                    if (context3 != null && (dcb0Var = (dcb0) b8b0Var.b) != null) {
                        dcb0Var.M.F(context3, str);
                    }
                }
                return Unit.a;
        }
    }
}
