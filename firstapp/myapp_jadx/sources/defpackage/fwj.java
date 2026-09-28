package defpackage;

import android.view.View;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fwj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fwj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                phx phxVar = ((ywj) obj).H;
                if (phxVar != null) {
                    phxVar.j();
                }
                break;
            default:
                int i2 = SHKeypadContainer.F;
                ((Function1) obj).invoke(7);
                break;
        }
    }
}
