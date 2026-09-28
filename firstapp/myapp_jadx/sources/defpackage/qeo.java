package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qeo {
    public final qcn<jeo> a;
    public final UiText b;

    /* JADX WARN: Multi-variable type inference failed */
    public qeo(qcn<? extends jeo> qcnVar, UiText uiText) {
        qcnVar.getClass();
        uiText.getClass();
        this.a = qcnVar;
        this.b = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeo)) {
            return false;
        }
        qeo qeoVar = (qeo) obj;
        return Intrinsics.g(this.a, qeoVar.a) && Intrinsics.g(this.b, qeoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantWinFootballScoreInfoState(items=" + this.a + ", fullTimeScoreUiText=" + this.b + ")";
    }
}
