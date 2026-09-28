package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum q85 implements csm<q85> {
    CONTROL("0"),
    /* JADX INFO: Fake field, exist only in values array */
    A("1"),
    B("2");

    public final String a;

    q85(String str) {
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
