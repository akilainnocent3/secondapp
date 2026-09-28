package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.a;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vn4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vn4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yn4.a aVar = (yn4.a) obj;
                aVar.getClass();
                return Boolean.valueOf(((LinkedHashSet) obj2).contains(Long.valueOf(aVar.a)));
            case 1:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new a.j.b(str));
                return Unit.a;
            default:
                qcn qcnVar = (qcn) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(qcnVar.size(), null, new o2d0(qcnVar), new op8(2039820996, new p2d0(qcnVar, qcnVar), true));
                return Unit.a;
        }
    }
}
