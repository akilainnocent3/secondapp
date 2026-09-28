package androidx.compose.foundation.layout;

import defpackage.gnn;
import defpackage.ht;
import defpackage.m75;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m75 {
    public static final d a = new d();

    @Override // defpackage.m75
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, ht htVar) {
        return dVar.n(new BoxChildDataElement(htVar, false, gnn.a));
    }

    @Override // defpackage.m75
    public final androidx.compose.ui.d f(androidx.compose.ui.d dVar) {
        return dVar.n(new BoxChildDataElement(ht.a.e, true, gnn.a));
    }
}
