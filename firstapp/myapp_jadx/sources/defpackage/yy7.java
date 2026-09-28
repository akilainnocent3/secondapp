package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yy7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yy7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                az7 az7Var = (az7) obj;
                az7Var.r = az7Var.g;
                az7Var.s = az7Var.i;
                az7Var.t = cz7.a;
                gaj<iy7, Boolean, Boolean, Unit> gajVar = az7Var.j;
                iy7 iy7Var = az7Var.e;
                Boolean bool = Boolean.FALSE;
                gajVar.invoke(iy7Var, bool, bool);
                az7Var.e();
                return;
            default:
                e eVar = ((EventActivity) obj).E0;
                if (eVar != null) {
                    eVar.A1(true, false);
                    return;
                } else {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
        }
    }
}
