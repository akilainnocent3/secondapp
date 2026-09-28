package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum etm implements csm<etm> {
    CONTROL("0"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_1("1"),
    /* JADX INFO: Fake field, exist only in values array */
    VARIANT_2("2");

    public final String a;

    etm(String str) {
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
