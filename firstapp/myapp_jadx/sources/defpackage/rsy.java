package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum rsy implements csm<rsy> {
    CONTROL("0"),
    VARIANT("1");

    public final String a;

    rsy(String str) {
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
