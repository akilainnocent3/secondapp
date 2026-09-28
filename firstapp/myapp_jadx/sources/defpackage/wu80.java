package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wu80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ wu80(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                ov80 ov80Var = (ov80) onCreateContextMenuListener;
                c6j0 c6j0Var = new c6j0(ov80Var.a);
                c6j0Var.a();
                ov80Var.z = c6j0Var;
                break;
            default:
                kqg0 kqg0Var = (kqg0) onCreateContextMenuListener;
                kqg0Var.dismiss();
                kc3 kc3Var = kqg0Var.c;
                if (kc3Var != null) {
                    kc3Var.invoke();
                }
                break;
        }
    }
}
