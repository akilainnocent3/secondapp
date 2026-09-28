package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum uaz implements gyo.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    i(-1);

    public final int a;

    uaz(int i2) {
        this.a = i2;
    }

    public static uaz a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // gyo.a
    public final int getNumber() {
        if (this != i) {
            return this.a;
        }
        hb5.a("Can't get the number of an unknown enum value.");
        return 0;
    }
}
