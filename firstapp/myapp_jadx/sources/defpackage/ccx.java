package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class ccx implements pdd0 {
    public final boolean a;

    public ccx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("is_ftd", Boolean.valueOf(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccx) && this.a == ((ccx) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "deposit__submit_success_snackbar__view";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("DepositSubmitSuccessSnackbarViewEvent(isFtd=", ")", this.a);
    }
}
