package defpackage;

import com.sportygames.commons.models.GiftItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zv60 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ zv60(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (Intrinsics.g(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) kx60.b.b.invoke(obj2);
                Object obj3 = list.get(0);
                String str = obj3 != null ? (String) obj3 : null;
                str.getClass();
                return new nk0((List<? extends nk0.d<? extends nk0.a>>) list2, str);
            default:
                GiftItem giftItem = (GiftItem) obj;
                giftItem.getClass();
                return Boolean.valueOf(giftItem.getCurBal() < 1.0d);
        }
    }
}
