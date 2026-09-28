package defpackage;

import com.sportybet.android.data.GetInsureBetResult;

/* JADX INFO: loaded from: classes7.dex */
public final class suo implements tuo {
    public final ruo a;
    public final GetInsureBetResult b;

    public suo(ruo ruoVar, GetInsureBetResult getInsureBetResult) {
        this.a = ruoVar;
        this.b = getInsureBetResult;
    }

    @Override // defpackage.tuo
    public final ruo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suo)) {
            return false;
        }
        suo suoVar = (suo) obj;
        return this.a.equals(suoVar.a) && this.b.equals(suoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsureBetQuoteResult(request=" + this.a + ", result=" + this.b + ")";
    }
}
