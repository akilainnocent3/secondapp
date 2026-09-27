package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46443c;

    public d0(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f46441a = str;
        this.f46442b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f46443c = bArr;
    }
}
