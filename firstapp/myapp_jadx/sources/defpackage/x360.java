package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.e;
import com.google.android.material.button.MaterialButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x360 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x360(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        eo80 eo80Var;
        ro80 binding;
        moa0 binding2;
        moa0 binding3;
        qo80 binding4;
        ro80 binding5;
        eo80 eo80Var2;
        eo80 eo80Var3;
        eo80 eo80Var4;
        String name;
        qo80 binding6;
        eo80 eo80Var5;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l560 l560Var = (l560) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = l560.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    eo80 eo80Var6 = l560Var.l0;
                    if (eo80Var6 != null && (binding6 = eo80Var6.V.getBinding()) != null) {
                        binding6.f.setText(l560Var.getString(R.string.rush_name));
                    }
                    SharedPreferences sharedPreferences = l560Var.O;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_sound", true)) : null;
                    SharedPreferences sharedPreferences2 = l560Var.O;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("rush_music", true)) : null;
                    Context context = l560Var.getContext();
                    if (context != null) {
                        eo80 eo80Var7 = l560Var.l0;
                        if (eo80Var7 != null) {
                            eo80Var7.o0.F(context, "rush");
                        }
                        e activity = l560Var.getActivity();
                        if (activity != null && (eo80Var4 = l560Var.l0) != null) {
                            ProgressMeterComponent progressMeterComponent = eo80Var4.o0;
                            String[] stringArray = context.getResources().getStringArray(R.array.rush_images_array);
                            stringArray.getClass();
                            GameDetails gameDetails = l560Var.S;
                            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                                name = "";
                            }
                            int i3 = ProgressMeterComponent.N;
                            progressMeterComponent.G(activity, stringArray, name, true);
                        }
                    }
                    Context context2 = l560Var.getContext();
                    if (context2 != null && (eo80Var3 = l560Var.l0) != null) {
                        ProgressMeterComponent progressMeterComponent2 = eo80Var3.o0;
                        String string = l560Var.getString(R.string.rush_name);
                        string.getClass();
                        progressMeterComponent2.setSoundManager("Rush/", string, boolValueOf, boolValueOf2, rk60.b.i, l560Var.S, context2);
                    }
                    if (l560Var.getContext() != null && (eo80Var2 = l560Var.l0) != null) {
                        eo80Var2.o0.H(l560Var.E0());
                    }
                    eo80 eo80Var8 = l560Var.l0;
                    TextView textView = (eo80Var8 == null || (binding5 = eo80Var8.W.getBinding()) == null) ? null : binding5.y;
                    eo80 eo80Var9 = l560Var.l0;
                    TextView textView2 = eo80Var9 != null ? eo80Var9.s0 : null;
                    TextView textView3 = eo80Var9 != null ? eo80Var9.H0 : null;
                    TextView textView4 = eo80Var9 != null ? eo80Var9.t0 : null;
                    TextView textView5 = eo80Var9 != null ? eo80Var9.K0 : null;
                    MaterialButton materialButton = eo80Var9 != null ? eo80Var9.m0 : null;
                    TextView textView6 = eo80Var9 != null ? eo80Var9.z0 : null;
                    TextView textView7 = eo80Var9 != null ? eo80Var9.x0 : null;
                    TextView textView8 = eo80Var9 != null ? eo80Var9.y0 : null;
                    TextView textView9 = eo80Var9 != null ? eo80Var9.w0 : null;
                    TextView textView10 = eo80Var9 != null ? eo80Var9.l0 : null;
                    TextView textView11 = eo80Var9 != null ? eo80Var9.G0 : null;
                    TextView textView12 = (eo80Var9 == null || (binding4 = eo80Var9.V.getBinding()) == null) ? null : binding4.f;
                    TextView textView13 = textView;
                    eo80 eo80Var10 = l560Var.l0;
                    AppCompatTextView appCompatTextView = (eo80Var10 == null || (binding3 = eo80Var10.Y.getBinding()) == null) ? null : binding3.b;
                    eo80 eo80Var11 = l560Var.l0;
                    TextView textView14 = (eo80Var11 == null || (binding2 = eo80Var11.Y.getBinding()) == null) ? null : binding2.d;
                    eo80 eo80Var12 = l560Var.l0;
                    op5.r(op5Var, b.f(textView13, textView2, textView3, textView4, textView5, materialButton, textView6, textView7, textView8, textView9, textView10, textView11, textView12, appCompatTextView, textView14, (eo80Var12 == null || (binding = eo80Var12.W.getBinding()) == null) ? null : binding.B), null, 6);
                    eo80 eo80Var13 = l560Var.l0;
                    if (eo80Var13 != null) {
                        TextView textView15 = eo80Var13.F0;
                        String strValueOf = String.valueOf(textView15.getTag());
                        eo80 eo80Var14 = l560Var.l0;
                        textView15.setText(op5.c(op5Var, strValueOf, String.valueOf(eo80Var14 != null ? eo80Var14.F0.getText() : null)).concat(" "));
                    }
                    eo80 eo80Var15 = l560Var.l0;
                    if (eo80Var15 != null) {
                        eo80Var15.o0.P();
                    }
                    Context context3 = l560Var.getContext();
                    if (context3 != null && (eo80Var = l560Var.l0) != null) {
                        eo80Var.o0.F(context3, "rush");
                    }
                } else if (i2 == 2) {
                    l560Var.o0();
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    eo80 eo80Var16 = l560Var.l0;
                    if (eo80Var16 != null) {
                        eo80Var16.o0.P();
                    }
                    Context context4 = l560Var.getContext();
                    if (context4 != null && (eo80Var5 = l560Var.l0) != null) {
                        eo80Var5.o0.F(context4, "rush");
                    }
                }
                return Unit.a;
            default:
                ((goa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                return Unit.a;
        }
    }
}
