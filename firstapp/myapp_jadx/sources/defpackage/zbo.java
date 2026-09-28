package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.ntespm.socket.TopicInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zbo implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zbo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pco pcoVar = (pco) obj;
                pcoVar.getClass();
                ((Function1) obj2).invoke(new a.c(pcoVar));
                break;
            default:
                ((TopicInfo) obj).setSportId((String) obj2);
                break;
        }
        return Unit.a;
    }
}
