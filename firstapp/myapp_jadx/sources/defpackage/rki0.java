package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public enum rki0 implements csm<rki0> {
    SPORTY("0"),
    NEW("1");

    public final String a;

    rki0(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return SPORTY;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
