package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n890 extends saj implements Function2<zyr, zyr, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(zyr zyrVar, zyr zyrVar2) {
        int i;
        zyr zyrVar3 = zyrVar;
        zyr zyrVar4 = zyrVar2;
        zyrVar3.getClass();
        zyrVar4.getClass();
        r890 r890Var = (r890) this.receiver;
        r890Var.getClass();
        wwd0 wwd0Var = r890Var.b;
        ArrayList arrayListC0 = CollectionsKt.C0((Collection) wwd0Var.getValue());
        int size = arrayListC0.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= size) {
                i3 = -1;
                break;
            }
            Object obj = arrayListC0.get(i4);
            i4++;
            int i5 = ((x590) obj).a;
            Object key = zyrVar3.getKey();
            if ((key instanceof Integer) && i5 == ((Number) key).intValue()) {
                break;
            }
            i3++;
        }
        int size2 = arrayListC0.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayListC0.get(i6);
            i6++;
            int i7 = ((x590) obj2).a;
            Object key2 = zyrVar4.getKey();
            if ((key2 instanceof Integer) && i7 == ((Number) key2).intValue()) {
                i = i2;
                break;
            }
            i2++;
        }
        arrayListC0.add(i, arrayListC0.remove(i3));
        wwd0Var.setValue(a4h.f(arrayListC0));
        return Unit.a;
    }
}
