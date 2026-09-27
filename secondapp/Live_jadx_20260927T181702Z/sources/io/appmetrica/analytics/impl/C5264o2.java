package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5264o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5284om fromModel(@NonNull C5239n2 c5239n2) {
        C5234mm c5234mm;
        C5284om c5284om = new C5284om();
        c5284om.f98086a = new C5259nm[c5239n2.f97933a.size()];
        for (int i10 = 0; i10 < c5239n2.f97933a.size(); i10++) {
            C5259nm c5259nm = new C5259nm();
            Pair pair = (Pair) c5239n2.f97933a.get(i10);
            c5259nm.f97996a = (String) pair.first;
            if (pair.second != null) {
                c5259nm.f97997b = new C5234mm();
                C5214m2 c5214m2 = (C5214m2) pair.second;
                if (c5214m2 == null) {
                    c5234mm = null;
                } else {
                    C5234mm c5234mm2 = new C5234mm();
                    c5234mm2.f97918a = c5214m2.f97865a;
                    c5234mm = c5234mm2;
                }
                c5259nm.f97997b = c5234mm;
            }
            c5284om.f98086a[i10] = c5259nm;
        }
        return c5284om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5239n2 toModel(@NonNull C5284om c5284om) {
        ArrayList arrayList = new ArrayList();
        for (C5259nm c5259nm : c5284om.f98086a) {
            String str = c5259nm.f97996a;
            C5234mm c5234mm = c5259nm.f97997b;
            arrayList.add(new Pair(str, c5234mm == null ? null : new C5214m2(c5234mm.f97918a)));
        }
        return new C5239n2(arrayList);
    }
}
