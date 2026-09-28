package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ksa0 implements pdd0 {
    public final String a = "home_page__tournament_panel_specials_discover__click";

    public ksa0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksa0) && Intrinsics.g(this.a, ((ksa0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SpecialsDiscoverMoreClick(name=", this.a, ")");
    }
}
