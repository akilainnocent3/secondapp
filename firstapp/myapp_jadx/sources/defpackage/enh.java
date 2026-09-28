package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;
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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class enh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ enh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xo40 xo40Var;
        qo80 binding;
        qo80 binding2;
        qo80 binding3;
        qo80 binding4;
        xo40 xo40Var2;
        xo40 xo40Var3;
        xo40 xo40Var4;
        String string;
        qo80 binding5;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return FilterTabLayout.F((FilterTabLayout) obj2, (UiText) obj);
            default:
                nn40 nn40Var = (nn40) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState.getStatus() == Status.SUCCESS) {
                    xo40 xo40Var5 = (xo40) nn40Var.b;
                    if (xo40Var5 != null && (binding5 = xo40Var5.G.getBinding()) != null) {
                        binding5.f.setText(nn40Var.getString(R.string.redblack_name));
                    }
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    SharedPreferences sharedPreferences = nn40Var.Q;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SOUND", true)) : null;
                    SharedPreferences sharedPreferences2 = nn40Var.Q;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("MUSIC", true)) : null;
                    Context context = nn40Var.getContext();
                    if (context != null) {
                        xo40 xo40Var6 = (xo40) nn40Var.b;
                        if (xo40Var6 != null) {
                            xo40Var6.V.F(context, "red-black");
                        }
                        e activity = nn40Var.getActivity();
                        if (activity != null && (xo40Var4 = (xo40) nn40Var.b) != null) {
                            ProgressMeterComponent progressMeterComponent = xo40Var4.V;
                            String[] stringArray = context.getResources().getStringArray(R.array.red_black_images_array);
                            stringArray.getClass();
                            GameDetails gameDetails = nn40Var.H;
                            if (gameDetails == null || (string = gameDetails.getName()) == null) {
                                string = nn40Var.getString(R.string.redblack_name);
                                string.getClass();
                            }
                            int i2 = ProgressMeterComponent.N;
                            progressMeterComponent.G(activity, stringArray, string, true);
                        }
                    }
                    Context context2 = nn40Var.getContext();
                    if (context2 != null && (xo40Var3 = (xo40) nn40Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent2 = xo40Var3.V;
                        String string2 = nn40Var.getString(R.string.redblack_name);
                        string2.getClass();
                        progressMeterComponent2.setSoundManager("Black/", string2, boolValueOf, boolValueOf2, rk60.b.c, nn40Var.H, context2);
                    }
                    if (nn40Var.getContext() != null && (xo40Var2 = (xo40) nn40Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent3 = xo40Var2.V;
                        ypa0 ypa0Var = nn40Var.z;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        progressMeterComponent3.H(ypa0Var);
                    }
                    xo40 xo40Var7 = (xo40) nn40Var.b;
                    TextView textView = xo40Var7 != null ? xo40Var7.D.getTextView() : null;
                    xo40 xo40Var8 = (xo40) nn40Var.b;
                    TextView textView2 = xo40Var8 != null ? xo40Var8.i : null;
                    TextView textView3 = xo40Var8 != null ? xo40Var8.W : null;
                    TextView textView4 = xo40Var8 != null ? xo40Var8.O : null;
                    TextView textView5 = xo40Var8 != null ? xo40Var8.d : null;
                    AppCompatTextView appCompatTextView = xo40Var8 != null ? xo40Var8.Q : null;
                    TextView betText = xo40Var8 != null ? xo40Var8.e.getBetText() : null;
                    xo40 xo40Var9 = (xo40) nn40Var.b;
                    TextView textView6 = (xo40Var9 == null || (binding4 = xo40Var9.G.getBinding()) == null) ? null : binding4.f;
                    xo40 xo40Var10 = (xo40) nn40Var.b;
                    op5.r(op5Var, b.f(textView, textView2, textView3, textView4, textView5, appCompatTextView, betText, textView6, xo40Var10 != null ? xo40Var10.d : null, xo40Var10 != null ? xo40Var10.M : null, xo40Var10 != null ? xo40Var10.C : null), null, 6);
                    xo40 xo40Var11 = (xo40) nn40Var.b;
                    if (xo40Var11 != null && (binding = xo40Var11.G.getBinding()) != null) {
                        TextView textView7 = binding.c;
                        xo40 xo40Var12 = (xo40) nn40Var.b;
                        String strValueOf = String.valueOf((xo40Var12 == null || (binding3 = xo40Var12.G.getBinding()) == null) ? null : binding3.c.getTag());
                        xo40 xo40Var13 = (xo40) nn40Var.b;
                        textView7.setText("+ ".concat(op5.c(op5Var, strValueOf, String.valueOf((xo40Var13 == null || (binding2 = xo40Var13.G.getBinding()) == null) ? null : binding2.c.getText()))));
                    }
                    xo40 xo40Var14 = (xo40) nn40Var.b;
                    if (xo40Var14 != null) {
                        TextView textView8 = xo40Var14.b;
                        String strValueOf2 = String.valueOf(textView8.getTag());
                        xo40 xo40Var15 = (xo40) nn40Var.b;
                        textView8.setText("+ ".concat(op5.c(op5Var, strValueOf2, String.valueOf(xo40Var15 != null ? xo40Var15.b.getText() : null))));
                    }
                    xo40 xo40Var16 = (xo40) nn40Var.b;
                    if (xo40Var16 != null) {
                        xo40Var16.V.P();
                    }
                    nn40Var.E0();
                } else if (loadingState.getStatus() == Status.FAILED) {
                    xo40 xo40Var17 = (xo40) nn40Var.b;
                    if (xo40Var17 != null) {
                        xo40Var17.V.P();
                    }
                    Context context3 = nn40Var.getContext();
                    if (context3 != null && (xo40Var = (xo40) nn40Var.b) != null) {
                        xo40Var.V.F(context3, "red-black");
                    }
                }
                return Unit.a;
        }
    }
}
