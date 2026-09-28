package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tbg0 implements pdd0 {
    public final String a = "home_page__tournament_panel__click";

    public tbg0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbg0) && Intrinsics.g(this.a, ((tbg0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("TournamentPageEntryClick(name=", this.a, ")");
    }
}
