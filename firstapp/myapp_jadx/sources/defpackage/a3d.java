package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a3d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        ArrayList arrayList;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((y3d.a) obj).c.a);
                break;
            default:
                int i2 = MultiMakerActivity.E;
                tjw tjwVarZ1 = ((MultiMakerActivity) obj2).z1();
                boolean z = ((kiw) ((ytw) obj).getValue()).d.f;
                wwd0 wwd0Var = tjwVarZ1.M;
                do {
                    value = wwd0Var.getValue();
                    List list = (List) value;
                    arrayList = new ArrayList(l48.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(MultiMakerItem.a((MultiMakerItem) it.next(), null, null, null, z, false, 23));
                    }
                } while (!wwd0Var.g(value, arrayList));
                wwd0 wwd0Var2 = tjwVarZ1.T;
                Boolean bool = Boolean.FALSE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
                wwd0 wwd0Var3 = tjwVarZ1.P;
                wwd0Var3.getClass();
                wwd0Var3.k(null, bool);
                break;
        }
        return Unit.a;
    }
}
