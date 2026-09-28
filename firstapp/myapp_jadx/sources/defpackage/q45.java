package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class q45 implements eai0.b {
    @Override // eai0.b
    public final l8j0 a(View view, l8j0 l8j0Var, eai0.c cVar) {
        cVar.d = l8j0Var.a() + cVar.d;
        boolean z = view.getLayoutDirection() == 1;
        int iB = l8j0Var.b();
        int iC = l8j0Var.c();
        int i = cVar.a + (z ? iC : iB);
        cVar.a = i;
        int i2 = cVar.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        cVar.c = i3;
        view.setPaddingRelative(i, cVar.b, i3, cVar.d);
        return l8j0Var;
    }
}
