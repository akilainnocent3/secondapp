package defpackage;

import com.sportybet.model.cashOut.STVPlayerDataSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qp10 {
    public final STVPlayerDataSource a;
    public final int b;

    public qp10(STVPlayerDataSource sTVPlayerDataSource, int i) {
        sTVPlayerDataSource.getClass();
        this.a = sTVPlayerDataSource;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp10)) {
            return false;
        }
        qp10 qp10Var = (qp10) obj;
        return Intrinsics.g(this.a, qp10Var.a) && this.b == qp10Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerDataSourceEvent(playerDataSource=" + this.a + ", position=" + this.b + ")";
    }
}
