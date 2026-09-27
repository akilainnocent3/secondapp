package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zk f158884e = new zk(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f158888d;

    public zk(int i10, int i11, int i12) {
        this.f158885a = i10;
        this.f158886b = i11;
        this.f158887c = i12;
        this.f158888d = ib3.e(i12) ? ib3.b(i12, i11) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f158885a + ", channelCount=" + this.f158886b + ", encoding=" + this.f158887c + fw.b.f85385l;
    }
}
