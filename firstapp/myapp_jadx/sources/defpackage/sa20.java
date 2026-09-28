package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum sa20 implements csm<sa20> {
    THREE_FIVE_SELECTIONS("0"),
    SIX_FIVE_SELECTIONS("1");

    public final String a;

    sa20(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return THREE_FIVE_SELECTIONS;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
