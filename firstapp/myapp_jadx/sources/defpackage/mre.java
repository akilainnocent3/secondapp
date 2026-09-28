package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class mre extends eui {
    @Override // defpackage.eui, defpackage.blh
    public final uw90 sink(cxz cxzVar, boolean z) throws IOException {
        cxz cxzVarC = cxzVar.c();
        if (cxzVarC != null) {
            createDirectories(cxzVarC);
        }
        return super.sink(cxzVar, z);
    }
}
