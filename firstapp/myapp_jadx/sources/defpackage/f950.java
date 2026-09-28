package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f950 extends saj implements Function1<View, zle> {
    public static final f950 a = new f950(1, zle.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/DialogReplaceBetslipBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final zle invoke(View view) {
        View view2 = view;
        view2.getClass();
        int i = R.id.mm_btn_cancel;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.mm_btn_cancel, view2);
        if (appCompatTextView != null) {
            i = R.id.mm_btn_ok;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.mm_btn_ok, view2);
            if (appCompatTextView2 != null) {
                i = R.id.mm_to_betslip_message;
                if (((TextView) h5e.a(R.id.mm_to_betslip_message, view2)) != null) {
                    i = R.id.mm_to_betslip_title;
                    if (((TextView) h5e.a(R.id.mm_to_betslip_title, view2)) != null) {
                        return new zle((ConstraintLayout) view2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        return null;
    }
}
