package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.d;
import defpackage.fkd0;
import defpackage.goh;
import defpackage.gwr;
import defpackage.osw;

/* JADX INFO: loaded from: classes.dex */
public final class a implements gwr {
    public osw a;
    public osw b;

    @Override // defpackage.gwr
    public final d a(float f) {
        return new ParentSizeElement(f, this.a);
    }

    @Override // defpackage.gwr
    public final d c(d dVar, goh gohVar, fkd0 fkd0Var, goh gohVar2) {
        return dVar.n(new LazyLayoutAnimateItemElement(gohVar, fkd0Var, gohVar2));
    }
}
