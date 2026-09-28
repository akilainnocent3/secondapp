package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fmj0 {
    public final String a;

    public fmj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmj0) && Intrinsics.g(this.a, ((fmj0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return tug.a("WithdrawFailedDialogState(message=", this.a, UccrWswQGaIj.OJnHNPnqsbFl);
    }
}
