package androidx.work;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class OverwritingInputMerger extends n {
    @Override // androidx.work.n
    @NonNull
    public e b(@NonNull List<e> inputs) {
        e.a aVar = new e.a();
        HashMap map = new HashMap();
        Iterator<e> it = inputs.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().x());
        }
        aVar.d(map);
        return aVar.a();
    }
}
