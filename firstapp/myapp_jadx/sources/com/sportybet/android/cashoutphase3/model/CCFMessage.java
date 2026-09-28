package com.sportybet.android.cashoutphase3.model;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/cashoutphase3/model/CCFMessage;", "", "", "type", "Lcom/sportybet/android/cashoutphase3/model/CCFMessage$a;", "data", "<init>", "(Ljava/lang/String;Lcom/sportybet/android/cashoutphase3/model/CCFMessage$a;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sportybet/android/cashoutphase3/model/CCFMessage$a;", "copy", "(Ljava/lang/String;Lcom/sportybet/android/cashoutphase3/model/CCFMessage$a;)Lcom/sportybet/android/cashoutphase3/model/CCFMessage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lcom/sportybet/android/cashoutphase3/model/CCFMessage$a;", "getData", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CCFMessage {
    public static final int $stable = 0;
    private final a data;
    private final String type;

    public static final class a {
    }

    public CCFMessage(String str, a aVar) {
        str.getClass();
        throw null;
    }

    public static /* synthetic */ CCFMessage copy$default(CCFMessage cCFMessage, String str, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cCFMessage.type;
        }
        if ((i & 2) != 0) {
            cCFMessage.getClass();
            aVar = null;
        }
        return cCFMessage.copy(str, aVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final a component2() {
        return null;
    }

    public final CCFMessage copy(String type, a data) {
        type.getClass();
        throw null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CCFMessage) && Intrinsics.g(this.type, ((CCFMessage) other).type);
    }

    public final a getData() {
        return null;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        this.type.hashCode();
        throw null;
    }

    public String toString() {
        return tug.a("CCFMessage(type=", this.type, ", data=null)");
    }
}
