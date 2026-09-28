package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bma implements Function2 {
    public final /* synthetic */ a350 a;

    public /* synthetic */ bma(a350 a350Var) {
        this.a = a350Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        boolean z = obj2 instanceof uga;
        a350 a350Var = this.a;
        if (z) {
            uga ugaVar = (uga) obj2;
            stw<uga> stwVarA = a350Var.h;
            if (stwVarA == null) {
                stwVarA = hz60.a();
                a350Var.h = stwVarA;
            }
            stwVarA.k(ugaVar);
            a350Var.f.b(ugaVar);
        }
        if (obj2 instanceof k350) {
            a350Var.e((k350) obj2);
        }
        if (obj2 instanceof e) {
            ((e) obj2).c();
        }
        return Unit.a;
    }
}
