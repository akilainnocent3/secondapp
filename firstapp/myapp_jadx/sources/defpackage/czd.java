package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class czd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ czd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dzd dzdVar = (dzd) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ku90<a> ku90Var = dzdVar.f;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.common_payment_providers__tenn_e_wallet_introduction__NG);
                Integer numValueOf = Integer.valueOf(djf.a(dzdVar.H0, zBooleanValue));
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__ok);
                ku90Var.getClass();
                ku90Var.a(new a.k(resourceUiText, numValueOf, resourceUiText2));
                break;
            default:
                i2i0 i2i0Var = (i2i0) obj2;
                if (i2i0Var.f != null) {
                    e activity = i2i0Var.getActivity();
                    if (activity != null) {
                        int[] iArr = new int[2];
                        i2i0Var.f.C.getLocationOnScreen(iArr);
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i2 = (int) ((displayMetrics.heightPixels / activity.getResources().getDisplayMetrics().density) + 0.5f);
                        int i3 = (int) ((iArr[1] / activity.getResources().getDisplayMetrics().density) + 0.5f);
                        int height = (int) ((i2i0Var.f.y.getHeight() / activity.getResources().getDisplayMetrics().density) + 0.5f);
                        int i4 = (i2 - i3) - 150;
                        if (height > 90) {
                            ujh0 ujh0Var = i2i0Var.f;
                            if (i4 > height) {
                                ScrollView scrollView = ujh0Var.i;
                                int iB = zch0.b(activity.getResources(), height);
                                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scrollView.getLayoutParams();
                                ((ViewGroup.MarginLayoutParams) layoutParams).height = iB;
                                scrollView.setLayoutParams(layoutParams);
                            } else {
                                ScrollView scrollView2 = ujh0Var.i;
                                int iB2 = zch0.b(activity.getResources(), i4);
                                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) scrollView2.getLayoutParams();
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = iB2;
                                scrollView2.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
