package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum rnv implements csm<rnv> {
    Control("0"),
    /* JADX INFO: Fake field, exist only in values array */
    VariantA("VariantA");

    public final String a;

    rnv(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return Control;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
