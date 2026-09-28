package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.HomeNotification;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oem implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oem(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List<String> list = dfm.v2;
                ((HomeNotification.Show) obj).getActionCallback().invoke();
                break;
            default:
                z640 z640Var = (z640) obj;
                Integer numA = z640.a(z640Var);
                if (numA != null) {
                    z640Var.y.invoke(numA);
                }
                break;
        }
    }
}
