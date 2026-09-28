package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hfg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((fgg) obj2).t0(str);
                return Unit.a;
            case 1:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new pcq.d(ijf0Var));
                return Unit.a;
            case 2:
                final hfs hfsVar = (hfs) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.f(szrVar, 3, null, new op8(962172648, new iaj() { // from class: sgz
                    @Override // defpackage.iaj
                    public final Object d(Object obj3, Object obj4, Object obj5, Object obj6) {
                        ((Integer) obj4).getClass();
                        a aVar = (a) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        ((gwr) obj3).getClass();
                        if (aVar.q(iIntValue & 1, (iIntValue & 129) != 128)) {
                            ugz.a(hfsVar, aVar, 0);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 6);
                return Unit.a;
            default:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((Function1) ((ytw) obj2).getValue()).invoke(f)).floatValue());
        }
    }
}
