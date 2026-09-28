package defpackage;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes4.dex */
public final class dai0 implements eai0.b {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BottomAppBar.c d;

    public dai0(boolean z, boolean z2, boolean z3, BottomAppBar.c cVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = cVar;
    }

    @Override // eai0.b
    public final l8j0 a(View view, l8j0 l8j0Var, eai0.c cVar) {
        if (this.a) {
            cVar.d = l8j0Var.a() + cVar.d;
        }
        boolean zE = eai0.e(view);
        if (this.b) {
            if (zE) {
                cVar.c = l8j0Var.b() + cVar.c;
            } else {
                cVar.a = l8j0Var.b() + cVar.a;
            }
        }
        if (this.c) {
            if (zE) {
                cVar.a = l8j0Var.c() + cVar.a;
            } else {
                cVar.c = l8j0Var.c() + cVar.c;
            }
        }
        view.setPaddingRelative(cVar.a, cVar.b, cVar.c, cVar.d);
        this.d.a(view, l8j0Var, cVar);
        return l8j0Var;
    }
}
