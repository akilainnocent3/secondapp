package defpackage;

import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckRequestDto;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class th30 {
    public final QuickLiabilityCheckRequestDto a;
    public final ArrayList b;

    public th30(QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto, ArrayList arrayList) {
        this.a = quickLiabilityCheckRequestDto;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th30)) {
            return false;
        }
        th30 th30Var = (th30) obj;
        return this.a.equals(th30Var.a) && this.b.equals(th30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuickLiabilityCheckRequest(body=" + this.a + ", selectionSnapshot=" + this.b + ")";
    }
}
