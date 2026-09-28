package defpackage;

import androidx.compose.material3.TabIndicatorModifier;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v2f0 implements k1f0 {
    public final ytw<List<z1f0>> a = m.b(m2g.a);
    public final /* synthetic */ goh<g7f> b;

    public v2f0(goh<g7f> gohVar) {
        this.b = gohVar;
    }

    @Override // defpackage.k1f0
    public final d a(int i, boolean z) {
        return new TabIndicatorModifier(this.a, i, z, this.b);
    }
}
