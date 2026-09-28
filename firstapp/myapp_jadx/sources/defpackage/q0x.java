package defpackage;

import com.sportybet.android.social.presentation.creation.a;
import com.sportybet.android.social.presentation.creation.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q0x implements Function1 {
    public final /* synthetic */ a a;
    public final /* synthetic */ List b;

    public /* synthetic */ q0x(a aVar, List list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a.C0351a c0351a = a.D;
        str.getClass();
        b.c cVar = b.c.a;
        a aVar = this.a;
        aVar.p0(cVar);
        aVar.A = true;
        try {
            aVar.m0().d.setText(str);
            aVar.m0().d.setSelection(str.length());
            aVar.A = false;
            d1x d1xVarN0 = aVar.n0();
            List list = this.b;
            list.getClass();
            ej5.c(o8i0.d(d1xVarN0), null, null, new c1x(d1xVarN0, str, list, null), 3);
            return Unit.a;
        } catch (Throwable th) {
            aVar.A = false;
            throw th;
        }
    }
}
