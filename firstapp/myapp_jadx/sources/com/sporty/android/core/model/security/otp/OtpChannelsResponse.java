package com.sporty.android.core.model.security.otp;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/security/otp/OtpChannelsResponse;", "", "availableOtpChannelIds", "", "", "prioritizedOtpChannelIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAvailableOtpChannelIds", "()Ljava/util/List;", "getPrioritizedOtpChannelIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OtpChannelsResponse {
    private final List<String> availableOtpChannelIds;
    private final List<String> prioritizedOtpChannelIds;

    public OtpChannelsResponse(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.availableOtpChannelIds = list;
        this.prioritizedOtpChannelIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtpChannelsResponse copy$default(OtpChannelsResponse otpChannelsResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = otpChannelsResponse.availableOtpChannelIds;
        }
        if ((i & 2) != 0) {
            list2 = otpChannelsResponse.prioritizedOtpChannelIds;
        }
        return otpChannelsResponse.copy(list, list2);
    }

    public final List<String> component1() {
        return this.availableOtpChannelIds;
    }

    public final List<String> component2() {
        return this.prioritizedOtpChannelIds;
    }

    public final OtpChannelsResponse copy(List<String> availableOtpChannelIds, List<String> prioritizedOtpChannelIds) {
        availableOtpChannelIds.getClass();
        prioritizedOtpChannelIds.getClass();
        return new OtpChannelsResponse(availableOtpChannelIds, prioritizedOtpChannelIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpChannelsResponse)) {
            return false;
        }
        OtpChannelsResponse otpChannelsResponse = (OtpChannelsResponse) other;
        return Intrinsics.g(this.availableOtpChannelIds, otpChannelsResponse.availableOtpChannelIds) && Intrinsics.g(this.prioritizedOtpChannelIds, otpChannelsResponse.prioritizedOtpChannelIds);
    }

    public final List<String> getAvailableOtpChannelIds() {
        return this.availableOtpChannelIds;
    }

    public final List<String> getPrioritizedOtpChannelIds() {
        return this.prioritizedOtpChannelIds;
    }

    public int hashCode() {
        return this.prioritizedOtpChannelIds.hashCode() + (this.availableOtpChannelIds.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("OtpChannelsResponse(availableOtpChannelIds=", ", prioritizedOtpChannelIds=", ")", this.availableOtpChannelIds, this.prioritizedOtpChannelIds);
    }
}
