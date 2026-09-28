package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum m0e implements csm<m0e> {
    CURRENT("0"),
    CATEGORY("1"),
    CATEGORY_LABEL("2"),
    LABEL("3");

    public final String a;

    m0e(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return CURRENT;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
