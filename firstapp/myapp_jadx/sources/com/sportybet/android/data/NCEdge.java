package com.sportybet.android.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/android/data/NCEdge;", "", "node", "Lcom/sportybet/android/data/NCMessage;", "cursor", "", "<init>", "(Lcom/sportybet/android/data/NCMessage;Ljava/lang/String;)V", "getNode", "()Lcom/sportybet/android/data/NCMessage;", "getCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NCEdge {
    public static final int $stable = NCMessage.$stable;
    private final String cursor;
    private final NCMessage node;

    public /* synthetic */ NCEdge(NCMessage nCMessage, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new NCMessage(0, null, null, 7, null) : nCMessage, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ NCEdge copy$default(NCEdge nCEdge, NCMessage nCMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nCMessage = nCEdge.node;
        }
        if ((i & 2) != 0) {
            str = nCEdge.cursor;
        }
        return nCEdge.copy(nCMessage, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NCMessage getNode() {
        return this.node;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final NCEdge copy(NCMessage node, String cursor) {
        node.getClass();
        cursor.getClass();
        return new NCEdge(node, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NCEdge)) {
            return false;
        }
        NCEdge nCEdge = (NCEdge) other;
        return Intrinsics.g(this.node, nCEdge.node) && Intrinsics.g(this.cursor, nCEdge.cursor);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final NCMessage getNode() {
        return this.node;
    }

    public int hashCode() {
        return this.cursor.hashCode() + (this.node.hashCode() * 31);
    }

    public String toString() {
        return "NCEdge(node=" + this.node + ", cursor=" + this.cursor + ")";
    }

    public NCEdge(NCMessage nCMessage, String str) {
        nCMessage.getClass();
        str.getClass();
        this.node = nCMessage;
        this.cursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NCEdge() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
