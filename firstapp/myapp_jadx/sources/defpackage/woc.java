package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum woc implements c6y {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);

    public final int a;

    woc(int i) {
        this.a = i;
    }

    @Override // defpackage.c6y
    public final int getNumber() {
        return this.a;
    }
}
