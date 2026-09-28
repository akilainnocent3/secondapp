package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.codehub.ui.a;

/* JADX INFO: loaded from: classes5.dex */
public final class l1f0 {
    public final Fragment a;
    public final a b;

    public l1f0(Fragment fragment, a aVar) {
        this.a = fragment;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1f0)) {
            return false;
        }
        l1f0 l1f0Var = (l1f0) obj;
        return this.a.equals(l1f0Var.a) && this.b.equals(l1f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TabItem(fragment=" + this.a + ", title=" + this.b + ")";
    }
}
