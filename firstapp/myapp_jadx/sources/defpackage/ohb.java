package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ohb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ohb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((x5a0) ((qhb) obj).b).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                return Boolean.valueOf(((h4q) ((ytw) obj).getValue()) == h4q.c);
            default:
                Function1 function1 = (Function1) obj;
                function1.invoke(b.v.C0331b.a);
                function1.invoke(b.InterfaceC0322b.c.a);
                return Unit.a;
        }
    }
}
