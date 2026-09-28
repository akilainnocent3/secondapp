package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ds3 {
    public final TaxConfigs a;
    public final AccountInfo b;
    public final String c;
    public final AssetsInfo d;

    public ds3(TaxConfigs taxConfigs, AccountInfo accountInfo, String str, AssetsInfo assetsInfo) {
        taxConfigs.getClass();
        this.a = taxConfigs;
        this.b = accountInfo;
        this.c = str;
        this.d = assetsInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds3)) {
            return false;
        }
        ds3 ds3Var = (ds3) obj;
        return Intrinsics.g(this.a, ds3Var.a) && Intrinsics.g(this.b, ds3Var.b) && Intrinsics.g(this.c, ds3Var.c) && Intrinsics.g(this.d, ds3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        AccountInfo accountInfo = this.b;
        int iHashCode2 = (iHashCode + (accountInfo == null ? 0 : accountInfo.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AssetsInfo assetsInfo = this.d;
        return iHashCode3 + (assetsInfo != null ? assetsInfo.hashCode() : 0);
    }

    public final String toString() {
        return "BetslipPrerequisites(taxConfigs=" + this.a + ", accountInfo=" + this.b + ", accountUserId=" + this.c + ", assetsInfo=" + this.d + ")";
    }
}
