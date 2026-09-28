package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rbm {
    public final AssetsInfo a;
    public final int b;
    public final boolean c;

    public rbm(AssetsInfo assetsInfo, int i, boolean z) {
        this.a = assetsInfo;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbm)) {
            return false;
        }
        rbm rbmVar = (rbm) obj;
        return Intrinsics.g(this.a, rbmVar.a) && this.b == rbmVar.b && this.c == rbmVar.c;
    }

    public final int hashCode() {
        AssetsInfo assetsInfo = this.a;
        return Boolean.hashCode(this.c) + gpp.a(this.b, (assetsInfo == null ? 0 : assetsInfo.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeBalanceUiState(assetsInfo=");
        sb.append(this.a);
        sb.append(", cert=");
        sb.append(this.b);
        sb.append(", showBalance=");
        return mq0.a(sb, this.c, ")");
    }
}
