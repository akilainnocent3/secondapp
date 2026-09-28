package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wbg0 implements pdd0 {
    public final String a = xOgHBQVl.KCeNPDdPjoTaxIC;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbg0) && Intrinsics.g(this.a, ((wbg0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("TournamentPanelView(name=", this.a, ")");
    }

    public wbg0(int i) {
    }
}
