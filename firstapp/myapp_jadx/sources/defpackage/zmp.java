package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum zmp implements gyo.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int a;

    zmp(int i2) {
        this.a = i2;
    }

    @Override // gyo.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hb5.a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
