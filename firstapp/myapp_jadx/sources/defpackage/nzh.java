package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class nzh {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(or60 or60Var, ArrayList arrayList, x1b x1bVar) {
        lzh lzhVar;
        if (x1bVar instanceof lzh) {
            lzhVar = (lzh) x1bVar;
            int i = lzhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzhVar.c = i - Integer.MIN_VALUE;
            } else {
                lzhVar = new lzh(x1bVar);
            }
        } else {
            lzhVar = new lzh(x1bVar);
        }
        Object obj = lzhVar.b;
        Object obj2 = y5b.a;
        int i2 = lzhVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            mzh mzhVar = new mzh(arrayList);
            lzhVar.a = arrayList;
            lzhVar.c = 1;
            return or60Var.collect(mzhVar, lzhVar) == obj2 ? obj2 : arrayList;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList2 = lzhVar.a;
        uj50.b(obj);
        return arrayList2;
    }
}
