package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum ddf0 implements csm<ddf0> {
    V1("0"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("1"),
    /* JADX INFO: Fake field, exist only in values array */
    V3("2");

    public final String a;

    ddf0(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return V1;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
