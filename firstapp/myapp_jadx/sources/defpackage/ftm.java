package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum ftm implements csm<ftm> {
    A("A"),
    B("B"),
    C("C");

    public final String a;

    ftm(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return A;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
