package defpackage;

import android.content.Context;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherocompose.components.RangeComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ak8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zk8 zk8Var = (zk8) obj;
                int id = view.getId();
                if (id == R.id.cancel) {
                    zk8Var.dismiss();
                    return;
                }
                if (id != R.id.confirm || (context = zk8Var.getContext()) == null) {
                    return;
                }
                if ((vox.d(context) ? context : null) != null) {
                    el8 el8Var = (el8) zk8Var.H.getValue();
                    el8Var.y1(el8Var.x1(false));
                    return;
                }
                return;
            default:
                RangeComponent rangeComponent = (RangeComponent) obj;
                int i2 = RangeComponent.g0;
                rangeComponent.o();
                SHKeypadContainer sHKeypadContainer = rangeComponent.W;
                if (sHKeypadContainer != null) {
                    sHKeypadContainer.performClick();
                    return;
                } else {
                    Intrinsics.n("rangeKeypad");
                    throw null;
                }
        }
    }
}
