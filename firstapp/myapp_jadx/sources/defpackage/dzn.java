package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dzn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dzn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(new jxo(urrVar.a()));
                return Unit.a;
            default:
                String str = (String) obj2;
                shl shlVar = (shl) obj;
                shlVar.getClass();
                lw40 lw40Var = shlVar.f;
                List<kw40> list = lw40Var.a;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (kw40 kw40Var : list) {
                    boolean zG = Intrinsics.g(kw40Var.a, str);
                    String str2 = kw40Var.a;
                    String str3 = kw40Var.b;
                    String str4 = kw40Var.c;
                    boolean z = kw40Var.d;
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
                    arrayList.add(new kw40(str2, str3, str4, z, zG));
                }
                return shl.a(shlVar, null, null, null, lw40.a(lw40Var, a4h.f(arrayList), null, 6), 31);
        }
    }
}
