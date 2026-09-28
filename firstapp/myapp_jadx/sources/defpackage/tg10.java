package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tg10 {
    public final BaseResponse<OrderWithFailUpdate> a;
    public final ng10 b;

    public tg10(BaseResponse<OrderWithFailUpdate> baseResponse, ng10 ng10Var) {
        this.a = baseResponse;
        this.b = ng10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tg10) {
            tg10 tg10Var = (tg10) obj;
            return Intrinsics.g(this.a, tg10Var.a) && this.b == tg10Var.b;
        }
        return false;
    }

    public final int hashCode() {
        BaseResponse<OrderWithFailUpdate> baseResponse = this.a;
        return this.b.hashCode() + ((baseResponse == null ? 0 : baseResponse.hashCode()) * 31);
    }

    public final String toString() {
        return "PlaceBetResult(response=" + this.a + ", attempt=" + this.b + ")";
    }
}
