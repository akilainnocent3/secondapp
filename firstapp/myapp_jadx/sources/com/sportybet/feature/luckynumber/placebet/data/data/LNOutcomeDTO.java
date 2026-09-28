package com.sportybet.feature.luckynumber.placebet.data.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNOutcomeDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "title", "odds", "prob", "active", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getOdds", "getProb", "getActive", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNOutcomeDTO {
    public static final int $stable = 0;
    private final boolean active;
    private final String id;
    private final String odds;
    private final String prob;
    private final String title;

    public LNOutcomeDTO(String str, String str2, String str3, String str4, boolean z) {
        wd7.a(str, str2, str3, str4);
        this.id = str;
        this.title = str2;
        this.odds = str3;
        this.prob = str4;
        this.active = z;
    }

    public static /* synthetic */ LNOutcomeDTO copy$default(LNOutcomeDTO lNOutcomeDTO, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNOutcomeDTO.id;
        }
        if ((i & 2) != 0) {
            str2 = lNOutcomeDTO.title;
        }
        if ((i & 4) != 0) {
            str3 = lNOutcomeDTO.odds;
        }
        if ((i & 8) != 0) {
            str4 = lNOutcomeDTO.prob;
        }
        if ((i & 16) != 0) {
            z = lNOutcomeDTO.active;
        }
        boolean z2 = z;
        String str5 = str3;
        return lNOutcomeDTO.copy(str, str2, str5, str4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProb() {
        return this.prob;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final LNOutcomeDTO copy(String id, String title, String odds, String prob, boolean active) {
        id.getClass();
        title.getClass();
        odds.getClass();
        prob.getClass();
        return new LNOutcomeDTO(id, title, odds, prob, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNOutcomeDTO)) {
            return false;
        }
        LNOutcomeDTO lNOutcomeDTO = (LNOutcomeDTO) other;
        return Intrinsics.g(this.id, lNOutcomeDTO.id) && Intrinsics.g(this.title, lNOutcomeDTO.title) && Intrinsics.g(this.odds, lNOutcomeDTO.odds) && Intrinsics.g(this.prob, lNOutcomeDTO.prob) && this.active == lNOutcomeDTO.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getProb() {
        return this.prob;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.active) + gmf0.a(gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.title), 31, this.odds), 31, this.prob);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.odds;
        String str4 = this.prob;
        boolean z = this.active;
        StringBuilder sbA = ux5.a("LNOutcomeDTO(id=", str, ", title=", str2, ", odds=");
        hxa.c(sbA, str3, ", prob=", str4, ", active=");
        return mq0.a(sbA, z, ")");
    }
}
