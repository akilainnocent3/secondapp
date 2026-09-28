package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.CartesianProductUtils$cartesianProductSequence$2", f = "CartesianProductUtils.kt", l = {11}, m = "invokeSuspend", v = 2)
public final class qh6 extends ji50 implements Function2<wc80<? super List<Object>>, v1b<? super Unit>, Object> {
    public int[] b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ List<List<Object>> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qh6(List<? extends List<Object>> list, v1b<? super qh6> v1bVar) {
        super(2, v1bVar);
        this.e = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qh6 qh6Var = new qh6(this.e, v1bVar);
        qh6Var.d = obj;
        return qh6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super List<Object>> wc80Var, v1b<? super Unit> v1bVar) {
        return ((qh6) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int[] iArr;
        wc80 wc80Var = (wc80) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        int i2 = 0;
        List<List<Object>> list = this.e;
        if (i == 0) {
            uj50.b(obj);
            iArr = new int[list.size()];
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iArr = this.b;
            uj50.b(obj);
            iArr.getClass();
            int length = iArr.length - 1;
            while (length >= 0) {
                int i3 = iArr[length] + 1;
                iArr[length] = i3;
                if (i3 < list.get(length).size()) {
                    break;
                }
                iArr[length] = 0;
                length--;
            }
            if (length < 0) {
                return Unit.a;
            }
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (Object obj2 : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            arrayList.add(((List) obj2).get(iArr[i2]));
            i2 = i4;
        }
        this.d = wc80Var;
        this.b = iArr;
        this.c = 1;
        wc80Var.b(this, arrayList);
        y5b y5bVar2 = y5b.a;
        return y5bVar;
    }
}
