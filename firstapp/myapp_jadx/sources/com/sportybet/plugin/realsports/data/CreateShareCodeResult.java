package com.sportybet.plugin.realsports.data;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/CreateShareCodeResult;", "", "response", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/plugin/realsports/data/Share;", "aliasCode", "", "<init>", "(Lcom/sporty/android/common/network/data/BaseResponse;Ljava/lang/String;)V", "getResponse", "()Lcom/sporty/android/common/network/data/BaseResponse;", "getAliasCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CreateShareCodeResult {
    public static final int $stable = 8;
    private final String aliasCode;
    private final BaseResponse<Share> response;

    public CreateShareCodeResult(BaseResponse<Share> baseResponse, String str) {
        baseResponse.getClass();
        str.getClass();
        this.response = baseResponse;
        this.aliasCode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateShareCodeResult copy$default(CreateShareCodeResult createShareCodeResult, BaseResponse baseResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            baseResponse = createShareCodeResult.response;
        }
        if ((i & 2) != 0) {
            str = createShareCodeResult.aliasCode;
        }
        return createShareCodeResult.copy(baseResponse, str);
    }

    public final BaseResponse<Share> component1() {
        return this.response;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final CreateShareCodeResult copy(BaseResponse<Share> response, String aliasCode) {
        response.getClass();
        aliasCode.getClass();
        return new CreateShareCodeResult(response, aliasCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateShareCodeResult)) {
            return false;
        }
        CreateShareCodeResult createShareCodeResult = (CreateShareCodeResult) other;
        return Intrinsics.g(this.response, createShareCodeResult.response) && Intrinsics.g(this.aliasCode, createShareCodeResult.aliasCode);
    }

    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final BaseResponse<Share> getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.aliasCode.hashCode() + (this.response.hashCode() * 31);
    }

    public String toString() {
        return "CreateShareCodeResult(response=" + this.response + ", aliasCode=" + this.aliasCode + ")";
    }
}
