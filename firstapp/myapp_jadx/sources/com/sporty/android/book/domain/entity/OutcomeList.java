package com.sporty.android.book.domain.entity;

import androidx.transition.nfj.CaBJCMnsV;
import defpackage.om2;
import defpackage.tag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/book/domain/entity/OutcomeList;", "", "kind", "Lcom/sporty/android/book/domain/entity/OutcomeList$Kind;", "ids", "", "", "<init>", "(Lcom/sporty/android/book/domain/entity/OutcomeList$Kind;Ljava/util/List;)V", "getKind", "()Lcom/sporty/android/book/domain/entity/OutcomeList$Kind;", "getIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Kind", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutcomeList {
    public static final int $stable = 8;
    private final List<String> ids;
    private final Kind kind;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0010\b\u0004\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007j\u0010\b\b\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/book/domain/entity/OutcomeList$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOW", "Lcom/google/gson/annotations/SerializedName;", "value", "allow", "DENY", "deny", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Kind {
        ALLOW,
        DENY;

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());

        public static tag<Kind> getEntries() {
            return $ENTRIES;
        }
    }

    public OutcomeList(Kind kind, List<String> list) {
        kind.getClass();
        list.getClass();
        this.kind = kind;
        this.ids = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutcomeList copy$default(OutcomeList outcomeList, Kind kind, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            kind = outcomeList.kind;
        }
        if ((i & 2) != 0) {
            list = outcomeList.ids;
        }
        return outcomeList.copy(kind, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Kind getKind() {
        return this.kind;
    }

    public final List<String> component2() {
        return this.ids;
    }

    public final OutcomeList copy(Kind kind, List<String> ids) {
        kind.getClass();
        ids.getClass();
        return new OutcomeList(kind, ids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutcomeList)) {
            return false;
        }
        OutcomeList outcomeList = (OutcomeList) other;
        return this.kind == outcomeList.kind && Intrinsics.g(this.ids, outcomeList.ids);
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final Kind getKind() {
        return this.kind;
    }

    public int hashCode() {
        return this.ids.hashCode() + (this.kind.hashCode() * 31);
    }

    public String toString() {
        return CaBJCMnsV.PlaHPoful + this.kind + ", ids=" + this.ids + ")";
    }
}
