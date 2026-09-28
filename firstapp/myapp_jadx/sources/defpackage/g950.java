package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg950;", "Landroidx/fragment/app/d;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g950 extends d {
    public static final /* synthetic */ ohp<Object>[] c = {new d630(0, g950.class, "binding", "getBinding()Lcom/sportybet/android/databinding/DialogReplaceBetslipBinding;")};
    public Function0<Unit> a;
    public final i6i0 b;

    public g950(xh3 xh3Var) {
        super(R.layout.dialog_replace_betslip);
        this.a = xh3Var;
        this.b = g5e.a(f950.a);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        zle zleVar = (zle) this.b.a(this, c[0]);
        zleVar.c.setOnClickListener(new View.OnClickListener() { // from class: d950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g950 g950Var = this.a;
                Function0<Unit> function0 = g950Var.a;
                if (function0 != null) {
                    function0.invoke();
                }
                g950Var.dismiss();
            }
        });
        zleVar.b.setOnClickListener(new View.OnClickListener() { // from class: e950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = g950.c;
                this.a.dismiss();
            }
        });
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), bqe.a(40.0f)));
    }

    public g950() {
        this(null);
    }
}
