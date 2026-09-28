package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class no00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ no00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((Function2) obj2).invoke(str, null);
                return Unit.a;
            default:
                nn40 nn40Var = (nn40) obj2;
                ((View) obj).getClass();
                xo40 xo40Var = (xo40) nn40Var.b;
                if (xo40Var != null) {
                    xo40Var.M.setClickable(false);
                }
                View view = nn40Var.getView();
                if (view != null) {
                    view.clearFocus();
                }
                nn40Var.q0();
                Context context = nn40Var.getContext();
                if (context != null) {
                    FragmentManager supportFragmentManager = nn40Var.requireActivity().getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    a aVar = new a(supportFragmentManager);
                    if (nn40Var.z == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    op5 op5Var = op5.a;
                    String string = nn40Var.getString(R.string.end_round_error_cms);
                    string.getClass();
                    String string2 = nn40Var.getString(R.string.redblack_new_round_text);
                    string2.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, string2, null);
                    String string3 = nn40Var.getString(R.string.stay_btn_cms);
                    string3.getClass();
                    String string4 = nn40Var.getString(R.string.stay);
                    string4.getClass();
                    String strB2 = op5.b(string3, string4, null);
                    String string5 = nn40Var.getString(R.string.new_round_btn_cms);
                    string5.getClass();
                    String string6 = nn40Var.getString(R.string.new_round);
                    string6.getClass();
                    aVar.f(R.id.flContent, com.sportygames.commons.components.a.C0437a.a("Red-Black", "new round", strB, "", strB2, op5.b(string5, string6, null), new a44(nn40Var, 1), new em40(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288), null);
                    aVar.c("CONFIRM_DIALOG_FRAGMENT");
                    aVar.d();
                }
                return Unit.a;
        }
    }
}
