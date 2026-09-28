package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutrightTournament;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutrightTournament {
    public static final int $stable = 0;
    private final String eventId;
    private final String name;

    public OutrightTournament(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.eventId = str;
        this.name = str2;
    }

    public static /* synthetic */ OutrightTournament copy$default(OutrightTournament outrightTournament, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outrightTournament.eventId;
        }
        if ((i & 2) != 0) {
            str2 = outrightTournament.name;
        }
        return outrightTournament.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final OutrightTournament copy(String eventId, String name) {
        eventId.getClass();
        name.getClass();
        return new OutrightTournament(eventId, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutrightTournament)) {
            return false;
        }
        OutrightTournament outrightTournament = (OutrightTournament) other;
        return Intrinsics.g(this.eventId, outrightTournament.eventId) && Intrinsics.g(this.name, outrightTournament.name);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.eventId.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("OutrightTournament(eventId=", this.eventId, ", name=", this.name, ")");
    }
}
