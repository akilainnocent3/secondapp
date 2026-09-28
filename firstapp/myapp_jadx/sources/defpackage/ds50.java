package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ds50 {
    public final ResourceUiText a;
    public final UiText b;
    public final String c;
    public final NonFtdRewardType d;
    public final boolean e;
    public final or50 f;

    public ds50(ResourceUiText resourceUiText, UiText uiText, String str, NonFtdRewardType nonFtdRewardType, boolean z, or50 or50Var) {
        nonFtdRewardType.getClass();
        or50Var.getClass();
        this.a = resourceUiText;
        this.b = uiText;
        this.c = str;
        this.d = nonFtdRewardType;
        this.e = z;
        this.f = or50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds50)) {
            return false;
        }
        ds50 ds50Var = (ds50) obj;
        return this.a.equals(ds50Var.a) && this.b.equals(ds50Var.b) && this.c.equals(ds50Var.c) && this.d == ds50Var.d && this.e == ds50Var.e && Intrinsics.g(this.f, ds50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a((this.d.hashCode() + gmf0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        return "RewardUiData(title=" + this.a + ", desc=" + this.b + ", imageUrl=" + this.c + ", type=" + this.d + ", unlocked=" + this.e + ", extra=" + this.f + ")";
    }
}
