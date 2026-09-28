package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v190 implements pdd0 {
    public final String a = "bet_history__show_off_ticket_image__click";

    public v190(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v190) && Intrinsics.g(this.a, ((v190) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ShareViewTicketImageClick(name=", this.a, ")");
    }
}
