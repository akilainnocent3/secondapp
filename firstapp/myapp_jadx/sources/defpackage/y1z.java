package defpackage;

import androidx.compose.runtime.h;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class y1z implements u1z {
    public final /* synthetic */ u1z a;
    public final /* synthetic */ h b;

    public y1z(u1z u1zVar, h hVar) {
        this.a = u1zVar;
        this.b = hVar;
    }

    @Override // defpackage.u1z
    public final List<mka> b(Integer num) {
        List<mka> listB = this.a.b(null);
        h hVar = this.b;
        int i = hVar.v;
        return i < 0 ? listB : CollectionsKt.i0(listB, lka.a(hVar, num, i, Integer.valueOf(hVar.E(hVar.b, i))));
    }
}
