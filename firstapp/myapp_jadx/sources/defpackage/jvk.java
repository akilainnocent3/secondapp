package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.giftselector.GiftSelectorStateHandlerImpl$init$1", f = "GiftSelectorStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jvk extends tje0 implements jaj<List<? extends GiftDetails>, List<? extends GiftDetails>, List<? extends GiftDetails>, GiftDetails, v1b<? super Unit>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;
    public /* synthetic */ GiftDetails d;
    public final /* synthetic */ kvk e;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Boolean.valueOf(((eok) t2).j).compareTo(Boolean.valueOf(((eok) t).j));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvk(v1b v1bVar, kvk kvkVar) {
        super(5, v1bVar);
        this.e = kvkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<GiftDetails> list = this.a;
        List list2 = this.b;
        List list3 = this.c;
        GiftDetails giftDetails = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        kvk kvkVar = this.e;
        String strB = kvkVar.a.B();
        wwd0 wwd0Var = kvkVar.b;
        do {
            value = wwd0Var.getValue();
            arrayList = new ArrayList();
            for (GiftDetails giftDetails2 : list) {
                eok eokVarB = sjk.b(giftDetails2, strB, Intrinsics.g(giftDetails2.getGiftId(), giftDetails != null ? giftDetails.getGiftId() : null), xik.a);
                if (eokVarB != null) {
                    arrayList.add(eokVarB);
                }
            }
        } while (!wwd0Var.g(value, CollectionsKt.r0(arrayList, new a())));
        wwd0 wwd0Var2 = kvkVar.c;
        do {
            value2 = wwd0Var2.getValue();
            arrayList2 = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                eok eokVarB2 = sjk.b((GiftDetails) it.next(), strB, false, xik.c);
                if (eokVarB2 != null) {
                    arrayList2.add(eokVarB2);
                }
            }
            arrayList3 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                eok eokVarB3 = sjk.b((GiftDetails) it2.next(), strB, false, xik.b);
                if (eokVarB3 != null) {
                    arrayList3.add(eokVarB3);
                }
            }
        } while (!wwd0Var2.g(value2, CollectionsKt.i0(arrayList3, arrayList2)));
        return Unit.a;
    }

    @Override // defpackage.jaj
    public final Object l(List<? extends GiftDetails> list, List<? extends GiftDetails> list2, List<? extends GiftDetails> list3, GiftDetails giftDetails, v1b<? super Unit> v1bVar) {
        jvk jvkVar = new jvk(v1bVar, this.e);
        jvkVar.a = list;
        jvkVar.b = list2;
        jvkVar.c = list3;
        jvkVar.d = giftDetails;
        return jvkVar.invokeSuspend(Unit.a);
    }
}
