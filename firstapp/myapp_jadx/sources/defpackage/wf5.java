package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wf5 {
    public final qcn<BetBuilderInRound> a;

    public wf5(qcn<BetBuilderInRound> qcnVar) {
        qcnVar.getClass();
        this.a = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf5) && Intrinsics.g(this.a, ((wf5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vf5.a(this.a, "BuildAndGoOddsItem(comboItems=", ")");
    }
}
