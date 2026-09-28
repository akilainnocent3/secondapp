package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gja implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gja(ytw ytwVar, mz1 mz1Var, ytw ytwVar2, String str, int i) {
        this.c = ytwVar;
        this.e = mz1Var;
        this.d = ytwVar2;
        this.f = str;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                lja.b((ytw) this.c, (mz1) this.e, (ytw) this.d, (String) this.f, (a) obj, qj40.a(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e1p.c((List) this.c, (d) this.d, (imf0) this.e, (Function1) this.f, (a) obj, qj40.a(this.b | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gja(List list, d dVar, imf0 imf0Var, Function1 function1, int i) {
        this.c = list;
        this.d = dVar;
        this.e = imf0Var;
        this.f = function1;
        this.b = i;
    }
}
