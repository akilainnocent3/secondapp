package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ghr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ghr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(ler.a.a);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(b.a.m.a);
                return Unit.a;
            default:
                ex80 ex80Var = (ex80) obj;
                ytw ytwVar = ex80Var.c;
                if (((yw90) ((x5a0) ytwVar).getValue()).a == 9205357640488583168L || yw90.e(((yw90) ((x5a0) ytwVar).getValue()).a)) {
                    return null;
                }
                return ex80Var.a.b(((yw90) ((x5a0) ytwVar).getValue()).a);
        }
    }
}
