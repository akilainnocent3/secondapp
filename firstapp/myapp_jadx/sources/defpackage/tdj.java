package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tdj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ tdj(int i, int i2, haj hajVar, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(7);
                wdj.c(iA, (a) obj, (d) obj4, (Function0) obj3, (Function0) hajVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                mno.b((nno) obj4, (Function1) obj3, (op8) hajVar, (a) obj, qj40.a(385));
                break;
            default:
                ((Integer) obj2).getClass();
                tki0.a((mli0) obj4, (f) obj3, (Function1) hajVar, (a) obj, qj40.a(65));
                break;
        }
        return Unit.a;
    }
}
