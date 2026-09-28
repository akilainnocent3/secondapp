package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.sportyherocompose.components.RangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k3d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k3d(RangeComponent rangeComponent) {
        this.a = 2;
        this.b = rangeComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w3d.e((d) obj3, (a) obj, qj40.a(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ewc0.a((d) obj3, (a) obj, qj40.a(1));
                break;
            default:
                GiftItem giftItem = (GiftItem) obj;
                double dDoubleValue = ((Double) obj2).doubleValue();
                giftItem.getClass();
                ((RangeComponent) obj3).setFBG(giftItem, false, dDoubleValue);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k3d(int i, int i2, d dVar) {
        this.a = i2;
        this.b = dVar;
    }
}
