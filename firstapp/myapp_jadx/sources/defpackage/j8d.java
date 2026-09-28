package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class j8d implements gv5 {
    public static final int a(kzr kzrVar) {
        List<zyr> listK = kzrVar.k();
        int size = listK.size();
        int iA = 0;
        for (int i = 0; i < size; i++) {
            iA += listK.get(i).a();
        }
        return kzrVar.j() + (iA / listK.size());
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
        izw.c(null);
    }

    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        izw.c(null);
    }
}
