package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((pj) obj).dismissAllowingStateLoss();
                break;
            default:
                rih0 rih0Var = ((zih0) obj).e;
                if (rih0Var != null) {
                    rih0Var.a();
                }
                break;
        }
    }
}
