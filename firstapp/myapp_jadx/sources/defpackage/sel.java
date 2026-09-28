package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum sel implements gyo.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int a;

    sel(int i) {
        this.a = i;
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
