package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferViewModel$initPayMethodConfig$1", f = "DepositBankTransferViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iqd extends tje0 implements iaj<Map<String, ? extends Boolean>, List<? extends String>, String, v1b<? super Unit>, Object> {
    public /* synthetic */ Map a;
    public /* synthetic */ List b;
    public /* synthetic */ String c;
    public final /* synthetic */ jqd d;

    public static final class a<T> implements Comparator {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String strJ = ((a300.a) t).j();
            List list = this.a;
            int iIndexOf = list.indexOf(strJ);
            int i = Reader.READ_DONE;
            if (iIndexOf == -1) {
                iIndexOf = Integer.MAX_VALUE;
            }
            Integer numValueOf = Integer.valueOf(iIndexOf);
            int iIndexOf2 = list.indexOf(((a300.a) t2).j());
            if (iIndexOf2 != -1) {
                i = iIndexOf2;
            }
            return numValueOf.compareTo(Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqd(jqd jqdVar, v1b<? super iqd> v1bVar) {
        super(4, v1bVar);
        this.d = jqdVar;
    }

    @Override // defpackage.iaj
    public final Object d(Map<String, ? extends Boolean> map, List<? extends String> list, String str, v1b<? super Unit> v1bVar) {
        iqd iqdVar = new iqd(this.d, v1bVar);
        iqdVar.a = map;
        iqdVar.b = list;
        iqdVar.c = str;
        return iqdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Map map = this.a;
        List list = this.b;
        String str = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jqd jqdVar = this.d;
        wwd0 wwd0Var = jqdVar.f;
        a300.a aVar = jqdVar.c;
        int i = 0;
        List listR0 = CollectionsKt.r0(b.k(new a300.a.b(aVar.a), new a300.a.C0004a(aVar.a)), new a(list));
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : listR0) {
            Boolean bool = (Boolean) map.get(((a300.a) obj3).b());
            if (bool != null ? bool.booleanValue() : true) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        do {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
        } while (!((a300.a) obj2).b().equals(str));
        a300.a aVar2 = (a300.a) obj2;
        if (aVar2 == null) {
            aVar2 = (a300.a) CollectionsKt.firstOrNull(arrayList);
        }
        z200 z200Var = new z200(arrayList, m2g.a, aVar2);
        if (wwd0Var.getValue() == null) {
            wwd0Var.setValue(aVar2);
        }
        wwd0 wwd0Var2 = jqdVar.d;
        wwd0Var2.getClass();
        wwd0Var2.k(null, z200Var);
        return Unit.a;
    }
}
