package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wc70 {
    public final fqo a;
    public final rb70 b;
    public final bb70 c;

    public wc70(fqo fqoVar, rb70 rb70Var, bb70 bb70Var) {
        bb70Var.getClass();
        this.a = fqoVar;
        this.b = rb70Var;
        this.c = bb70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc70)) {
            return false;
        }
        wc70 wc70Var = (wc70) obj;
        return this.a.equals(wc70Var.a) && this.b.equals(wc70Var.b) && Intrinsics.g(this.c, wc70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScheduledFootballOpenBetsUiState(topAppBarState=" + this.a + ", countRowState=" + this.b + ", contentStatus=" + this.c + ")";
    }
}
