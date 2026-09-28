package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum y370 implements csm<y370> {
    CONTROL("control"),
    TEST("test");

    public final String a;

    y370(String str) {
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
