package io.appmetrica.analytics.remotepermissions.impl;

import cv.g;
import fr.i0;
import fr.r0;
import fr.y1;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(@l a aVar) {
        f fVar = new f();
        Set set = aVar.f99001a;
        ArrayList arrayList = new ArrayList(i0.d0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(g.f77202b));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f99009a = (byte[][]) array;
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(@l f fVar) {
        Set setK;
        byte[][] bArr = fVar.f99009a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, g.f77202b));
            }
            setK = r0.f6(arrayList);
            if (setK == null) {
                setK = y1.k();
            }
        } else {
            setK = y1.k();
        }
        return new a(setK);
    }
}
