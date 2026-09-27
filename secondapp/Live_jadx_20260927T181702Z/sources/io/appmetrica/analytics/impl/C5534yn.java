package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5534yn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cl f98687a;

    public C5534yn() {
        this(new Cl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4935b6 fromModel(@NonNull C5509xn c5509xn) {
        C4935b6 c4935b6 = new C4935b6();
        Integer num = c5509xn.f98626e;
        c4935b6.f97009e = num == null ? -1 : num.intValue();
        c4935b6.f97008d = c5509xn.f98625d;
        c4935b6.f97006b = c5509xn.f98623b;
        c4935b6.f97005a = c5509xn.f98622a;
        c4935b6.f97007c = c5509xn.f98624c;
        Cl cl2 = this.f98687a;
        List list = c5509xn.f98627f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new El((StackTraceElement) it.next()));
        }
        c4935b6.f97010f = cl2.fromModel(arrayList);
        return c4935b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5534yn(Cl cl2) {
        this.f98687a = cl2;
    }

    @NonNull
    public final C5509xn a(@NonNull C4935b6 c4935b6) {
        throw new UnsupportedOperationException();
    }
}
