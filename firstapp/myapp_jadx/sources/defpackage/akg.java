package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class akg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ akg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<xvf0, Unit> function1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = EventActivity.U0;
                ((EventActivity) obj).C1();
                break;
            default:
                exf0 exf0Var = (exf0) obj;
                Object tag = view.getTag();
                if (!(tag instanceof xvf0)) {
                    tag = null;
                }
                xvf0 xvf0Var = (xvf0) tag;
                if (xvf0Var != null && (function1 = exf0Var.b) != null) {
                    function1.invoke(xvf0Var);
                    break;
                }
                break;
        }
    }
}
