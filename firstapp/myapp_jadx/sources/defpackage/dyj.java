package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dyj implements pdd0 {
    public final String a = "home_page__tournament_panel_games_tab__view";

    public dyj(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyj) && Intrinsics.g(this.a, ((dyj) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("GamesTabView(name=", this.a, ")");
    }
}
