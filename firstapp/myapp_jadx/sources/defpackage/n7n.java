package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum n7n implements csm<n7n> {
    CONTROL("0"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("1");

    public final String a;

    n7n(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return CONTROL;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
