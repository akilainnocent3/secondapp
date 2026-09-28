package com.sportybet.android.social.data.remote.entity;

import com.appsflyer.internal.h;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/AliasRootCodeReplaceRequest;", "", AnalyticsParam.EVENT_PARAM_ID, "", EventKeys.ERROR_CODE, "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AliasRootCodeReplaceRequest {
    public static final int $stable = 0;
    private final String code;
    private final int id;

    public AliasRootCodeReplaceRequest(int i, String str) {
        str.getClass();
        this.id = i;
        this.code = str;
    }

    public static /* synthetic */ AliasRootCodeReplaceRequest copy$default(AliasRootCodeReplaceRequest aliasRootCodeReplaceRequest, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aliasRootCodeReplaceRequest.id;
        }
        if ((i2 & 2) != 0) {
            str = aliasRootCodeReplaceRequest.code;
        }
        return aliasRootCodeReplaceRequest.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final AliasRootCodeReplaceRequest copy(int id, String code) {
        code.getClass();
        return new AliasRootCodeReplaceRequest(id, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasRootCodeReplaceRequest)) {
            return false;
        }
        AliasRootCodeReplaceRequest aliasRootCodeReplaceRequest = (AliasRootCodeReplaceRequest) other;
        return this.id == aliasRootCodeReplaceRequest.id && Intrinsics.g(this.code, aliasRootCodeReplaceRequest.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.code.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public String toString() {
        return h.a(this.id, "AliasRootCodeReplaceRequest(id=", ", code=", this.code, ")");
    }
}
