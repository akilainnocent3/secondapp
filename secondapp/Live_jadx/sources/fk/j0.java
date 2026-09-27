package fk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum j0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84838b;

    j0(int i10) {
        this.f84838b = i10;
    }

    public static j0 e(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int g() {
        return this.f84838b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f84838b);
    }
}
