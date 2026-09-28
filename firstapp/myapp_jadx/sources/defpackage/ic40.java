package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum ic40 implements csm<ic40> {
    CONTROL("0"),
    VARIANT("1");

    public final String a;

    ic40(String str) {
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
