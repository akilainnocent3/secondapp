package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f150980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f150981c;

    public j93(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f150979a = str;
        this.f150980b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f150981c = bArr;
    }
}
