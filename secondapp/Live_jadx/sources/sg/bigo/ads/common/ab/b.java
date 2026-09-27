package sg.bigo.ads.common.ab;

import k.k;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f132879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f132880b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f132881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k
    public final int f132882d;

    private b(int i10, int i11, @k int i12) {
        this.f132879a = i10;
        this.f132881c = i11;
        this.f132882d = i12;
    }

    public static b a(int i10, int i11, @k int i12) {
        return new b(i10, i11, i12);
    }
}
