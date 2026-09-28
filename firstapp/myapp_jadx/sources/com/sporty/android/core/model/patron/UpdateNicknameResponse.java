package com.sporty.android.core.model.patron;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/patron/UpdateNicknameResponse;", "", "suggestedNicknames", "", "", "<init>", "(Ljava/util/List;)V", "getSuggestedNicknames", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpdateNicknameResponse {

    @SerializedName("suggestedNicknames")
    private final List<String> suggestedNicknames;

    public /* synthetic */ UpdateNicknameResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateNicknameResponse copy$default(UpdateNicknameResponse updateNicknameResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateNicknameResponse.suggestedNicknames;
        }
        return updateNicknameResponse.copy(list);
    }

    public final List<String> component1() {
        return this.suggestedNicknames;
    }

    public final UpdateNicknameResponse copy(List<String> suggestedNicknames) {
        return new UpdateNicknameResponse(suggestedNicknames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateNicknameResponse) && Intrinsics.g(this.suggestedNicknames, ((UpdateNicknameResponse) other).suggestedNicknames);
    }

    public final List<String> getSuggestedNicknames() {
        return this.suggestedNicknames;
    }

    public int hashCode() {
        List<String> list = this.suggestedNicknames;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a("UpdateNicknameResponse(suggestedNicknames=", ")", this.suggestedNicknames);
    }

    public UpdateNicknameResponse(List<String> list) {
        this.suggestedNicknames = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateNicknameResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
