package com.sportygames.commons.models;

import com.appsflyer.internal.b0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/commons/models/UserData;", "", AnalyticsParam.EVENT_PARAM_ID, "", "patronId", "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getPatronId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserData {
    public static final int $stable = 0;
    private final long id;
    private final String patronId;

    public UserData(long j, String str) {
        str.getClass();
        this.id = j;
        this.patronId = str;
    }

    public static /* synthetic */ UserData copy$default(UserData userData, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userData.id;
        }
        if ((i & 2) != 0) {
            str = userData.patronId;
        }
        return userData.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPatronId() {
        return this.patronId;
    }

    public final UserData copy(long id, String patronId) {
        patronId.getClass();
        return new UserData(id, patronId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return this.id == userData.id && Intrinsics.g(this.patronId, userData.patronId);
    }

    public final long getId() {
        return this.id;
    }

    public final String getPatronId() {
        return this.patronId;
    }

    public int hashCode() {
        return this.patronId.hashCode() + (Long.hashCode(this.id) * 31);
    }

    public String toString() {
        StringBuilder sbA = b0.a(this.id, "UserData(id=", ", patronId=", this.patronId);
        sbA.append(")");
        return sbA.toString();
    }
}
