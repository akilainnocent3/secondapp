package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum js40 implements csm<js40> {
    CURRENT("0"),
    COUNTDOWN("1"),
    LOYALTY("2"),
    /* JADX INFO: Fake field, exist only in values array */
    AF("3");

    public final String a;

    js40(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return CURRENT;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
