package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wfb0 {
    public final pmn a;
    public final pmn b;
    public final pmn c;
    public final qcn<UiText> d;

    /* JADX WARN: Multi-variable type inference failed */
    public wfb0(pmn pmnVar, pmn pmnVar2, pmn pmnVar3, qcn<? extends UiText> qcnVar) {
        qcnVar.getClass();
        this.a = pmnVar;
        this.b = pmnVar2;
        this.c = pmnVar3;
        this.d = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb0)) {
            return false;
        }
        wfb0 wfb0Var = (wfb0) obj;
        return this.a.equals(wfb0Var.a) && this.b.equals(wfb0Var.b) && this.c.equals(wfb0Var.c) && Intrinsics.g(this.d, wfb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportsLimitsUIModel(dailyInput=" + this.a + ", weeklyInput=" + this.b + ", monthlyInput=" + this.c + ", minMaxStakeInformation=" + this.d + ")";
    }
}
