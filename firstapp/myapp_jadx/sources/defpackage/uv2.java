package defpackage;

import android.view.View;
import com.sportybet.android.codehub.ui.CodeHubActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uv2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uv2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cw2 cw2Var = (cw2) obj;
                cw2Var.b.invoke(new y43.a.n(cw2Var.getBindingAdapterPosition()));
                break;
            default:
                int i2 = CodeHubActivity.v;
                ((CodeHubActivity) obj).finish();
                break;
        }
    }
}
