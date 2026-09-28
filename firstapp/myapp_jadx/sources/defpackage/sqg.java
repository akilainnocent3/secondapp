package defpackage;

import com.sporty.android.book.presentation.eventsorting.EventSortDirection;
import com.sporty.android.book.presentation.eventsorting.EventSortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sqg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sqg(haj hajVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function2) hajVar).invoke((EventSortType) obj2, ((EventSortDirection) obj).toggle());
                break;
            default:
                ytw ytwVar = (ytw) obj2;
                xsw xswVar = (xsw) obj;
                ((Function0) hajVar).invoke();
                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    ytwVar.setValue(Boolean.TRUE);
                    xswVar.K(System.currentTimeMillis() / 1000);
                }
                break;
        }
        return Unit.a;
    }
}
