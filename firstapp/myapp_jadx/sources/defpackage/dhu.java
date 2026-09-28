package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dhu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ dhu(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                ((Function0) hajVar).invoke();
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((Function1) hajVar).invoke(new b.c0.C0325b(str, str2));
                break;
        }
        return Unit.a;
    }
}
