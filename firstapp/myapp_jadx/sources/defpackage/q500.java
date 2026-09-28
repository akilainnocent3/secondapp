package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum q500 implements csm<q500> {
    CONTROL("0"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_A("1"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_B("2");

    public final String a;

    q500(String str) {
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
