package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j3q implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                tcf.m0(tcfVar, j58.b, 0L, 0L, ((Number) ((twd0) obj2).getValue()).floatValue() * 0.75f, null, 0, 118);
                return Unit.a;
            case 1:
                return ((c7z) obj2).z1().a.size() <= 1 ? o6z.b.a : o6z.m.a;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new b.v.c(str));
                return Unit.a;
        }
    }
}
