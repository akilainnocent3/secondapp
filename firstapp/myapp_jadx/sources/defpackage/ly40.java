package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sporty.android.common.uievent.a;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ly40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ly40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                a aVar = (a) obj;
                aVar.getClass();
                if (aVar instanceof a.n) {
                    Toast.makeText(context, ((a.n) aVar).a.e(context), 0).show();
                }
                break;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new b.s.C0300b(zrd0Var));
                break;
        }
        return Unit.a;
    }
}
