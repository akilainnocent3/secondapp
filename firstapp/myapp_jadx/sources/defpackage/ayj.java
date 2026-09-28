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
public final /* synthetic */ class ayj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ayj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        dcb0 dcb0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b01.b bVar = (b01.b) obj;
                bVar.getClass();
                ((ytw) obj2).setValue(Boolean.valueOf(bVar instanceof b01.b.d));
                return Unit.a;
            case 1:
                b3u b3uVar = (b3u) obj2;
                ((use) obj).getClass();
                b3uVar.P1(new igm.n(true));
                return new ivt.d(b3uVar);
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = b8b0.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        b8b0Var.y0().c.l(b8b0Var.getViewLifecycleOwner());
                        dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                        if (dcb0Var2 != null) {
                            dcb0Var2.M.P();
                        }
                        b8b0Var.h0 = promotionGiftsResponse;
                        List<GiftItem> entityList = promotionGiftsResponse.getEntityList();
                        if (entityList == null || entityList.isEmpty()) {
                            dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
                            if (dcb0Var3 != null) {
                                dcb0Var3.d.setChipList(b8b0Var.Y);
                            }
                        } else {
                            dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                            if (dcb0Var4 != null) {
                                BetChipContainer betChipContainer = dcb0Var4.d;
                                ArrayList<Double> arrayList = b8b0Var.Y;
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
                    dcb0 dcb0Var5 = (dcb0) b8b0Var.b;
                    if (dcb0Var5 != null) {
                        dcb0Var5.M.P();
                    }
                    ArrayList<Double> arrayList3 = b8b0Var.Y;
                    if (arrayList3 != null && (dcb0Var = (dcb0) b8b0Var.b) != null) {
                        dcb0Var.d.setChipList(arrayList3);
                    }
                }
                return Unit.a;
        }
    }
}
