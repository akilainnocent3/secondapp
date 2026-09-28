package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class deb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ deb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                fgbVar.U1 = fgb.a.b;
                fgbVar.V1();
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(a.b.C0339a.a);
                return Unit.a;
            default:
                String u = ((lsj0) obj).getJ0();
                u.getClass();
                return sg8.a(Integer.parseInt(u));
        }
    }
}
