package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t4j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final u6j u6jVar = (u6j) obj;
                u6jVar.o0(new Function0() { // from class: s5j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        u6j u6jVar2 = u6jVar;
                        ajh ajhVarL1 = u6jVar2.l1();
                        if (ajhVarL1 != null) {
                            ajhVarL1.A.c.setScaleY(1.0f);
                        }
                        ajh ajhVarL2 = u6jVar2.l1();
                        if (ajhVarL2 != null) {
                            ajhVarL2.B.c.setScaleY(1.0f);
                        }
                        ajh ajhVarL3 = u6jVar2.l1();
                        if (ajhVarL3 != null) {
                            ajhVarL3.z.c.setScaleY(1.0f);
                        }
                        return Unit.a;
                    }
                });
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(a.h.C0256a.a);
                return Unit.a;
            default:
                ((rx50) obj).a.finish();
                return null;
        }
    }
}
