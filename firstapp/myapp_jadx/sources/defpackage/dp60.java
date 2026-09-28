package defpackage;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dp60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dp60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        AppCompatImageView chat;
        dcb0 dcb0Var;
        AppCompatImageView chat2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((osw) obj2).k((int) (((jxo) obj).a & 4294967295L));
                break;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                if (((LoadingState) obj).getStatus() != Status.RUNNING) {
                    fm1 fm1Var = (fm1) b8b0Var.a;
                    if (fm1Var != null ? fm1Var.c : false) {
                        SharedPreferences sharedPreferences = b8b0Var.Z;
                        z = true;
                        if (sharedPreferences != null) {
                            z = sharedPreferences.getBoolean("SPIN_DA_BOTTLE_SPECIAL_THEME", true);
                        }
                    } else {
                        SharedPreferences.Editor editor = b8b0Var.X;
                        if (editor != null) {
                            editor.remove("SPIN_DA_BOTTLE_SPECIAL_THEME");
                        }
                        SharedPreferences.Editor editor2 = b8b0Var.X;
                        if (editor2 != null) {
                            editor2.apply();
                        }
                        z = false;
                    }
                    if (z) {
                        b8b0Var.p0 = "sg_spin_da_bottle_special_theme";
                        dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                        if (dcb0Var2 != null) {
                            dcb0Var2.P.setBackgroundColor(-49872);
                        }
                        dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
                        if (dcb0Var3 != null) {
                            dcb0Var3.i.a.setProgressTintList(ColorStateList.valueOf(-51915));
                        }
                        dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                        if (dcb0Var4 != null) {
                            dcb0Var4.d.setColorByColor(-6270892);
                        }
                        dcb0 dcb0Var5 = (dcb0) b8b0Var.b;
                        if (dcb0Var5 != null) {
                            dcb0Var5.F.setHeaderColor(-8505538);
                        }
                        dcb0 dcb0Var6 = (dcb0) b8b0Var.b;
                        if (dcb0Var6 != null) {
                            dcb0Var6.F.setBodyColor(-9948864);
                        }
                        dcb0 dcb0Var7 = (dcb0) b8b0Var.b;
                        if (dcb0Var7 != null && (chat2 = dcb0Var7.C.getChat()) != null) {
                            chat2.setImageTintList(ColorStateList.valueOf(-1));
                        }
                    } else {
                        b8b0Var.p0 = "sg_spin_da_bottle";
                        dcb0 dcb0Var8 = (dcb0) b8b0Var.b;
                        if (dcb0Var8 != null) {
                            dcb0Var8.P.setBackgroundColor(b8b0Var.requireContext().getColor(R.color.even_color));
                        }
                        dcb0 dcb0Var9 = (dcb0) b8b0Var.b;
                        if (dcb0Var9 != null) {
                            dcb0Var9.i.a.setProgressTintList(ColorStateList.valueOf(-24477));
                        }
                        dcb0 dcb0Var10 = (dcb0) b8b0Var.b;
                        if (dcb0Var10 != null) {
                            dcb0Var10.d.setColor(R.color.chip_bg_bottle);
                        }
                        dcb0 dcb0Var11 = (dcb0) b8b0Var.b;
                        if (dcb0Var11 != null) {
                            dcb0Var11.F.setHeaderColor(b8b0Var.requireContext().getColor(R.color.spin_ham_menu_header_color));
                        }
                        dcb0 dcb0Var12 = (dcb0) b8b0Var.b;
                        if (dcb0Var12 != null) {
                            dcb0Var12.F.setBodyColor(b8b0Var.requireContext().getColor(R.color.spin_ham_menu_bg_color));
                        }
                        dcb0 dcb0Var13 = (dcb0) b8b0Var.b;
                        if (dcb0Var13 != null && (chat = dcb0Var13.C.getChat()) != null) {
                            chat.setImageTintList(ColorStateList.valueOf(-16743151));
                        }
                    }
                    ArrayList arrayListC0 = CollectionsKt.C0(b8b0Var.q0);
                    arrayListC0.add(0, b8b0Var.p0);
                    if (b8b0Var.getContext() != null && (dcb0Var = (dcb0) b8b0Var.b) != null) {
                        dcb0Var.M.E(b8b0Var.m0, new ArrayList<>(arrayListC0), b8b0Var.p0, b8b0Var.t0);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
