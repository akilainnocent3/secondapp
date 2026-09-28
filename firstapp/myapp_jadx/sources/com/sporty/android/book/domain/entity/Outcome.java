package com.sporty.android.book.domain.entity;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/book/domain/entity/Outcome;", "", AnalyticsParam.EVENT_PARAM_ID, "", "odds", "probability", "isActive", "", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOdds", "getProbability", "()I", "getDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Outcome {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String desc;
    private final String id;
    private final int isActive;
    private final String odds;
    private final String probability;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/book/domain/entity/Outcome$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/Outcome;", AnalyticsParam.EVENT_PARAM_ID, "", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Outcome mock(String id) {
            id.getClass();
            return new Outcome(id, "3.15", "0.29040", 1, "Draw");
        }

        private Companion() {
        }
    }

    public Outcome(String str, String str2, String str3, int i, String str4) {
        m.a(str, str2, str4);
        this.id = str;
        this.odds = str2;
        this.probability = str3;
        this.isActive = i;
        this.desc = str4;
    }

    public static /* synthetic */ Outcome copy$default(Outcome outcome, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = outcome.id;
        }
        if ((i2 & 2) != 0) {
            str2 = outcome.odds;
        }
        if ((i2 & 4) != 0) {
            str3 = outcome.probability;
        }
        if ((i2 & 8) != 0) {
            i = outcome.isActive;
        }
        if ((i2 & 16) != 0) {
            str4 = outcome.desc;
        }
        String str5 = str4;
        String str6 = str3;
        return outcome.copy(str, str2, str6, i, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final Outcome copy(String id, String odds, String probability, int isActive, String desc) {
        id.getClass();
        odds.getClass();
        desc.getClass();
        return new Outcome(id, odds, probability, isActive, desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Outcome)) {
            return false;
        }
        Outcome outcome = (Outcome) other;
        return Intrinsics.g(this.id, outcome.id) && Intrinsics.g(this.odds, outcome.odds) && Intrinsics.g(this.probability, outcome.probability) && this.isActive == outcome.isActive && Intrinsics.g(this.desc, outcome.desc);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getProbability() {
        return this.probability;
    }

    public int hashCode() {
        int iA = gmf0.a(this.id.hashCode() * 31, 31, this.odds);
        String str = this.probability;
        return this.desc.hashCode() + gpp.a(this.isActive, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final int isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.odds;
        String str3 = this.probability;
        int i = this.isActive;
        String str4 = this.desc;
        StringBuilder sbA = ux5.a("Outcome(id=", str, ", odds=", str2, ", probability=");
        wxa.b(i, str3, ", isActive=", ", desc=", sbA);
        return uf80.a(sbA, str4, ")");
    }
}
