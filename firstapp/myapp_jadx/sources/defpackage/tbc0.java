package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum tbc0 implements csm<tbc0> {
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL("control"),
    TEST("test");

    public final String a;

    tbc0(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return TEST;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
