package y8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f146431b;

    e(long j10) {
        this.f146431b = j10;
    }

    public static e e(long j10) {
        e[] eVarArrValues = values();
        for (int i10 = 0; i10 < eVarArrValues.length; i10++) {
            if (eVarArrValues[i10].g() == j10) {
                return eVarArrValues[i10];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j10);
    }

    public long g() {
        return this.f146431b;
    }
}
