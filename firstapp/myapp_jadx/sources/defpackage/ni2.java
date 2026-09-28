package defpackage;

import com.sporty.android.book.domain.entity.Selection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ni2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ni2(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function1) hajVar).invoke((Selection) obj);
                break;
            default:
                ((Function1) ((chp) hajVar)).invoke(lvk.a.a);
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
