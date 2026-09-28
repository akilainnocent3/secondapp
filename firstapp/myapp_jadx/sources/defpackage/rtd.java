package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$initSavedCards$1", f = "DepositCardViewModel.kt", l = {450}, m = "invokeSuspend", v = 2)
public final class rtd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtd(tud tudVar, v1b<? super rtd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rtd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rtd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        AssetData.CardsBean cardsBean;
        Object obj2;
        AssetData assetData;
        List<AssetData.CardsBean> cards;
        y5b y5bVar = y5b.a;
        int i = this.a;
        tud tudVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            g1i g1iVarG = tudVar.s0.G(pu0.c.a);
            this.a = 1;
            obj = bm50.p(g1iVarG, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (assetData = (AssetData) cVar.a) == null || (cards = assetData.getCards()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : cards) {
                if (!Intrinsics.g(((AssetData.CardsBean) obj3).isExpired(), Boolean.TRUE)) {
                    arrayList.add(obj3);
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            do {
                if (i2 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                i2++;
            } while (!Intrinsics.g(((AssetData.CardsBean) obj2).isDefault(), Boolean.TRUE));
            cardsBean = (AssetData.CardsBean) obj2;
            if (cardsBean == null) {
                if (arrayList != null) {
                    cardsBean = (AssetData.CardsBean) CollectionsKt.firstOrNull(arrayList);
                } else {
                    cardsBean = null;
                }
            }
        } else if (arrayList != null) {
            cardsBean = (AssetData.CardsBean) CollectionsKt.firstOrNull(arrayList);
        } else {
            cardsBean = null;
        }
        tudVar.G0.setValue(cardsBean);
        tudVar.R1(null);
        return Unit.a;
    }
}
