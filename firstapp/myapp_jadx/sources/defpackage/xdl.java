package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum xdl implements csm<xdl> {
    DISABLED("0"),
    ENABLED("1");

    public final String a;

    xdl(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return DISABLED;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
