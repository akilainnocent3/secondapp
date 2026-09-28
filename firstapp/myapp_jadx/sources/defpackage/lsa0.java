package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lsa0 implements pdd0 {
    public final String a = "home_page__tournament_panel_specials_tab__view";

    public lsa0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsa0) && Intrinsics.g(this.a, ((lsa0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SpecialsTabView(name=", this.a, ")");
    }
}
