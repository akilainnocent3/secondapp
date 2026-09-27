package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class C5346ra extends D2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5421ua f98229b;

    public C5346ra(int i10) {
        this(i10, null);
    }

    public int b(@Nullable Object obj) {
        return 0;
    }

    public C5346ra(int i10, @Nullable InterfaceC5421ua interfaceC5421ua) {
        super(i10);
        this.f98229b = interfaceC5421ua;
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC5421ua
    @NonNull
    public final Nn a(@Nullable List<Object> list) {
        int iB;
        int i10 = 0;
        if (list == null || (list.size() <= this.f95720a && this.f98229b == null)) {
            iB = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            iB = 0;
            int i11 = 0;
            for (Object obj : list) {
                if (i11 < this.f95720a) {
                    InterfaceC5421ua interfaceC5421ua = this.f98229b;
                    if (interfaceC5421ua != null) {
                        Nn nnA = interfaceC5421ua.a(obj);
                        Object obj2 = nnA.f96249a;
                        iB += nnA.f96250b.getBytesTruncated();
                        mo.a(obj, nnA.f96249a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i10++;
                    iB += b(obj);
                }
                i11++;
            }
            list = arrayList;
        }
        return new Nn(list, new C5266o4(i10, iB));
    }

    @Nullable
    @k.h1
    public final InterfaceC5421ua b() {
        return this.f98229b;
    }
}
