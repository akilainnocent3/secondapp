package yads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f158093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f158094e;

    public y11(int i10, ArrayList arrayList, int i11, c21 c21Var) {
        this.f158090a = i10;
        this.f158091b = arrayList;
        this.f158092c = i11;
        this.f158093d = c21Var;
        this.f158094e = null;
    }

    public y11(int i10, List list, byte[] bArr) {
        this.f158090a = i10;
        this.f158091b = list;
        this.f158092c = bArr.length;
        this.f158094e = bArr;
        this.f158093d = null;
    }
}
