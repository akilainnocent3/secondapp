package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qww {
    public final /* synthetic */ lww.h a;

    public final void a(boolean z, c6g0 c6g0Var) {
        lww lwwVar = this.a.y;
        ArrayList arrayList = lwwVar.y;
        int iIndexOf = arrayList.indexOf(c6g0Var);
        if (iIndexOf == -1) {
            return;
        }
        if (z) {
            List<ing> list = c6g0Var.f;
            if (!c6g0Var.e || list.isEmpty()) {
                if (list.isEmpty()) {
                    c6g0Var.e = true;
                    c6g0Var.w = true;
                } else {
                    int size = list.size();
                    if (!c6g0Var.e) {
                        int i = iIndexOf + 1;
                        arrayList.addAll(i, c6g0Var.f);
                        c6g0Var.e = true;
                        lwwVar.notifyItemRangeInserted(i, size);
                    }
                }
            }
            c6g0Var.y = 2;
        } else {
            c6g0Var.y = 3;
        }
        lwwVar.notifyItemChanged(iIndexOf);
    }
}
