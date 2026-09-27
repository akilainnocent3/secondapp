package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public final class s3 implements t2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10208e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10209f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f10210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f10212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10213d;

    public s3(v2 defaultInstance, String info, Object[] objects) {
        this.f10210a = defaultInstance;
        this.f10211b = info;
        this.f10212c = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.f10213d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = info.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f10213d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public Object[] a() {
        return this.f10212c;
    }

    public String b() {
        return this.f10211b;
    }

    @Override // androidx.datastore.preferences.protobuf.t2
    public v2 getDefaultInstance() {
        return this.f10210a;
    }

    @Override // androidx.datastore.preferences.protobuf.t2
    public o3 getSyntax() {
        int i10 = this.f10213d;
        if ((i10 & 1) != 0) {
            return o3.PROTO2;
        }
        return (i10 & 4) == 4 ? o3.EDITIONS : o3.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.t2
    public boolean isMessageSetWireFormat() {
        return (this.f10213d & 2) == 2;
    }
}
