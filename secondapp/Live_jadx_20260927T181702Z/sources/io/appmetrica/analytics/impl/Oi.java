package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Oi implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final so f96291a = new so();

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Revenue revenue) {
        ro roVar;
        so soVar = this.f96291a;
        Tf tf2 = new Tf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            roVar = new ro(tf2, true, "");
        } else {
            roVar = new ro(tf2, false, "Invalid quantity value " + num);
        }
        List<ro> listAsList = Arrays.asList(roVar);
        soVar.getClass();
        return soVar.a(listAsList);
    }
}
