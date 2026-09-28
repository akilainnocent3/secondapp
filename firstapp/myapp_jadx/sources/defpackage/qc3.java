package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qc3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xc3 xc3Var = (xc3) obj;
                xc3Var.b.invoke(new y43.b.C1325b(xc3Var.getBindingAdapterPosition()));
                break;
            default:
                sh8.c().e(o7d.a((wae) obj));
                break;
        }
    }
}
