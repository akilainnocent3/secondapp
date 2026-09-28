package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/patron/NicknameAvailabilityResponse;", "", "available", "", "suggestedNicknames", "", "", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSuggestedNicknames", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/sporty/android/core/model/patron/NicknameAvailabilityResponse;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NicknameAvailabilityResponse {

    @SerializedName("available")
    private final Boolean available;

    @SerializedName("suggestedNicknames")
    private final List<String> suggestedNicknames;

    public /* synthetic */ NicknameAvailabilityResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NicknameAvailabilityResponse copy$default(NicknameAvailabilityResponse nicknameAvailabilityResponse, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = nicknameAvailabilityResponse.available;
        }
        if ((i & 2) != 0) {
            list = nicknameAvailabilityResponse.suggestedNicknames;
        }
        return nicknameAvailabilityResponse.copy(bool, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAvailable() {
        return this.available;
    }

    public final List<String> component2() {
        return this.suggestedNicknames;
    }

    public final NicknameAvailabilityResponse copy(Boolean available, List<String> suggestedNicknames) {
        return new NicknameAvailabilityResponse(available, suggestedNicknames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NicknameAvailabilityResponse)) {
            return false;
        }
        NicknameAvailabilityResponse nicknameAvailabilityResponse = (NicknameAvailabilityResponse) other;
        return Intrinsics.g(this.available, nicknameAvailabilityResponse.available) && Intrinsics.g(this.suggestedNicknames, nicknameAvailabilityResponse.suggestedNicknames);
    }

    public final Boolean getAvailable() {
        return this.available;
    }

    public final List<String> getSuggestedNicknames() {
        return this.suggestedNicknames;
    }

    public int hashCode() {
        Boolean bool = this.available;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.suggestedNicknames;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "NicknameAvailabilityResponse(available=" + this.available + ", suggestedNicknames=" + this.suggestedNicknames + ")";
    }

    public NicknameAvailabilityResponse(Boolean bool, List<String> list) {
        this.available = bool;
        this.suggestedNicknames = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NicknameAvailabilityResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
