package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class quo implements tuo {
    public final ruo a;

    public quo(ruo ruoVar) {
        this.a = ruoVar;
    }

    @Override // defpackage.tuo
    public final ruo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof quo) && this.a.equals(((quo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InsureBetQuoteLoading(request=" + this.a + ")";
    }
}
