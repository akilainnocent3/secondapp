package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class so implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable List<ro> list) {
        LinkedList linkedList = new LinkedList();
        boolean z10 = true;
        for (ro roVar : list) {
            if (!roVar.f98247a) {
                linkedList.add(roVar.f98248b);
                z10 = false;
            }
        }
        return z10 ? new ro(this, true, "") : new ro(this, false, TextUtils.join(", ", linkedList));
    }
}
