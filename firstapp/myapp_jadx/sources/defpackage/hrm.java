package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum hrm implements csm<hrm> {
    VARIANT_1("1"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_2("2"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_3("3");

    public final String a;

    hrm(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return VARIANT_1;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
