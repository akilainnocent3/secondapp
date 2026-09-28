package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dnu {
    public final List<aoe0.b> a;
    public final boolean b;

    public dnu(List<aoe0.b> list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnu)) {
            return false;
        }
        dnu dnuVar = (dnu) obj;
        return Intrinsics.g(this.a, dnuVar.a) && this.b == dnuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ManageAccountUiState(savedAssets=" + this.a + ", isSavedAssetsAtLimit=" + this.b + ")";
    }

    public dnu() {
        this(0);
    }

    public dnu(int i) {
        this(m2g.a, false);
    }
}
