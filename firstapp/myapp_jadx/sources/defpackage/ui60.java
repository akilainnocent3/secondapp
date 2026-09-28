package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.c;
import com.sportybet.plugin.webcontainer.fragments.WebViewBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ui60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ ui60(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                xi60 xi60Var = (xi60) cVar;
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("FBGModalClosed", krh0.e(str), new String[0]);
                xi60Var.dismiss();
                Function0<Unit> function0 = xi60Var.e;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                ((WebViewBottomSheetFragment) cVar).dismissAllowingStateLoss();
                break;
        }
    }
}
