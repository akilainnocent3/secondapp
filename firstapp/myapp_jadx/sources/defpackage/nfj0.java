package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum nfj0 implements csm<nfj0> {
    CONTROL("0"),
    /* JADX INFO: Fake field, exist only in values array */
    W_TICKET_DETAIL_W_TUTORIAL("1"),
    /* JADX INFO: Fake field, exist only in values array */
    W_TICKET_DETAIL_WO_TUTORIAL("2"),
    /* JADX INFO: Fake field, exist only in values array */
    WO_TICKET_DETAIL_W_TUTORIAL("3"),
    /* JADX INFO: Fake field, exist only in values array */
    WO_TICKET_DETAIL_WO_TUTORIAL("4");

    public final String a;

    nfj0(String str) {
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
