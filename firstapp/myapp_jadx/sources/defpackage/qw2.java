package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qw2 implements pdd0 {
    public final String a = "tournament_page__groups_bet_now__click";

    public qw2(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qw2) && Intrinsics.g(this.a, ((qw2) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("BetNowGroupsClick(name=", this.a, ")");
    }
}
