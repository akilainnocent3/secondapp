package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class afx {
    public final int a;
    public zix b = null;
    public Bundle c = null;

    public afx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afx)) {
            return false;
        }
        afx afxVar = (afx) obj;
        if (this.a != afxVar.a || !Intrinsics.g(this.b, afxVar.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = afxVar.c;
        if (Intrinsics.g(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !iv60.a(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        zix zixVar = this.b;
        int iHashCode2 = iHashCode + (zixVar != null ? zixVar.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null) {
            return iv60.b(bundle) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(afx.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
