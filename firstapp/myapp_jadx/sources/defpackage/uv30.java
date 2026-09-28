package defpackage;

import com.sportygames.compose.chat.data.model.NextRainResponse;
import com.sportygames.compose.chat.data.model.RainClaimInfoResponse;
import com.sportygames.compose.chat.data.model.RainDetailInfoResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class uv30 {
    public final ek50<NextRainResponse> a;
    public final ek50<RainClaimInfoResponse> b;
    public final ek50<RainDetailInfoResponse> c;

    public uv30(Object obj) {
        ek50.a aVar = ek50.a.a;
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv30)) {
            return false;
        }
        uv30 uv30Var = (uv30) obj;
        return Intrinsics.g(this.a, uv30Var.a) && Intrinsics.g(this.b, uv30Var.b) && Intrinsics.g(this.c, uv30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RainUiState(nextRainState=" + this.a + ", rainClaimInfoState=" + this.b + ", rainDetailInfoState=" + this.c + ')';
    }
}
