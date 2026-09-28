package defpackage;

import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d060 extends BaseNode {
    public final String a;
    public final TicketInRound b;

    public d060(String str, TicketInRound ticketInRound) {
        this.a = str;
        this.b = ticketInRound;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d060)) {
            return false;
        }
        d060 d060Var = (d060) obj;
        return Intrinsics.g(this.a, d060Var.a) && Intrinsics.g(this.b, d060Var.b);
    }

    @Override // com.chad.library.adapter.base.entity.node.BaseNode
    public final List<BaseNode> getChildNode() {
        List<BaseNode> list = Collections.EMPTY_LIST;
        list.getClass();
        return list;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TicketInRound ticketInRound = this.b;
        return iHashCode + (ticketInRound != null ? ticketInRound.hashCode() : 0);
    }

    public final String toString() {
        return "RoundTicketSummaryItem(sportId=" + this.a + ", ticket=" + this.b + ")";
    }
}
