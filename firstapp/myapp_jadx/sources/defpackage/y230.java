package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class y230 implements aiv {
    public static final y230 a = new y230();

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        list.getClass();
        vhv vhvVar = (vhv) CollectionsKt.firstOrNull(list);
        y yVarD0 = vhvVar != null ? vhvVar.d0(j) : null;
        return t.z1(tVar, yVarD0 != null ? yVarD0.a : 0, yVarD0 != null ? yVarD0.b : 0, new x230(yVarD0, 0));
    }
}
