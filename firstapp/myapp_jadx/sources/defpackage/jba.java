package defpackage;

import com.sportybet.android.instantwin.presentation.ticketdetail.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jba implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jba(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 15) {
                    function1.invoke(str);
                }
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((Function1) obj2).invoke(new b.h(str2));
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                ((l560) obj2).z0(str3);
                break;
        }
        return Unit.a;
    }
}
