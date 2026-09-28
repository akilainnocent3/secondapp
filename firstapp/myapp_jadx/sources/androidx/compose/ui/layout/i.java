package androidx.compose.ui.layout;

import defpackage.esr;
import defpackage.vhv;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final Object a(vhv vhvVar) {
        Object objG = vhvVar.g();
        esr esrVar = objG instanceof esr ? (esr) objG : null;
        if (esrVar != null) {
            return esrVar.Y0();
        }
        return null;
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, Object obj) {
        return dVar.n(new LayoutIdElement(obj));
    }
}
