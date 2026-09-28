package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum nrg implements c6y {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final int a;

    nrg(int i) {
        this.a = i;
    }

    @Override // defpackage.c6y
    public final int getNumber() {
        return this.a;
    }
}
