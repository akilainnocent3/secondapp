package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum ie00 implements csm<ie00> {
    CONTROL("0"),
    VARIANT_1("1");

    public final String a;

    ie00(String str) {
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
