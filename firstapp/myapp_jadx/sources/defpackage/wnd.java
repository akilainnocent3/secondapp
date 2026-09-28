package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class wnd implements pdd0 {
    public final String a = "ftd__homepage_deposit__click";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnd) && this.a.equals(((wnd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("FtdHomepageDepositClickViewEvent(name=", this.a, ")");
    }
}
