package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum i4j0 implements csm<i4j0> {
    Hidden("0"),
    Show("1");

    public final String a;

    i4j0(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return Hidden;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
