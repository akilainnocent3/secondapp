package defpackage;

import com.sportygames.commons.components.BetChipContainer;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x1w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        xo40 xo40Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                k0w k0wVar = (k0w) obj2;
                k0wVar.show();
                return new c2w(k0wVar);
            default:
                nn40 nn40Var = (nn40) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = nn40.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    nn40Var.z0().c.l(nn40Var.getViewLifecycleOwner());
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        nn40Var.f0 = promotionGiftsResponse;
                        xo40 xo40Var2 = (xo40) nn40Var.b;
                        if (xo40Var2 != null) {
                            xo40Var2.V.P();
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = nn40Var.f0;
                        List<GiftItem> entityList = promotionGiftsResponse2 != null ? promotionGiftsResponse2.getEntityList() : null;
                        if (entityList == null || entityList.isEmpty()) {
                            xo40 xo40Var3 = (xo40) nn40Var.b;
                            if (xo40Var3 != null) {
                                xo40Var3.f.setChipList(nn40Var.U);
                            }
                        } else {
                            xo40 xo40Var4 = (xo40) nn40Var.b;
                            if (xo40Var4 != null) {
                                BetChipContainer betChipContainer = xo40Var4.f;
                                ArrayList<Double> arrayList = nn40Var.U;
                                ArrayList<Double> arrayList2 = new ArrayList<>();
                                arrayList2.add(Double.valueOf(-1.0d));
                                if (arrayList != null) {
                                    arrayList2.addAll(arrayList);
                                }
                                betChipContainer.setChipList(arrayList2);
                            }
                        }
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    xo40 xo40Var5 = (xo40) nn40Var.b;
                    if (xo40Var5 != null) {
                        xo40Var5.V.P();
                    }
                    ArrayList<Double> arrayList3 = nn40Var.U;
                    if (arrayList3 != null && (xo40Var = (xo40) nn40Var.b) != null) {
                        xo40Var.f.setChipList(arrayList3);
                    }
                }
                return Unit.a;
        }
    }
}
