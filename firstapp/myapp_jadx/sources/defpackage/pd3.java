package defpackage;

import com.sportygames.common.ui.model.PromotionGiftsResponse;
import com.sportygames.wheelanddeal.model.WDBetResponseModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class pd3 {
    public final WDBetResponseModel a;
    public final uui0 b;
    public final PromotionGiftsResponse c;

    public pd3(WDBetResponseModel wDBetResponseModel, uui0 uui0Var, PromotionGiftsResponse promotionGiftsResponse) {
        wDBetResponseModel.getClass();
        uui0Var.getClass();
        promotionGiftsResponse.getClass();
        this.a = wDBetResponseModel;
        this.b = uui0Var;
        this.c = promotionGiftsResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd3)) {
            return false;
        }
        pd3 pd3Var = (pd3) obj;
        return Intrinsics.g(this.a, pd3Var.a) && Intrinsics.g(this.b, pd3Var.b) && Intrinsics.g(this.c, pd3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BetUpdateData(bet=" + this.a + ", userInfo=" + this.b + ", gift=" + this.c + ')';
    }
}
