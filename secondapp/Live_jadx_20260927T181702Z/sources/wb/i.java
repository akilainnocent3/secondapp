package wb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements a<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f142651a = "IntegerArrayPool";

    @Override // wb.a
    public int b() {
        return 4;
    }

    @Override // wb.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int a(int[] iArr) {
        return iArr.length;
    }

    @Override // wb.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }

    @Override // wb.a
    public String getTag() {
        return f142651a;
    }
}
