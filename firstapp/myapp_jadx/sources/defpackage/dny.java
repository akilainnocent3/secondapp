package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dny extends qlr implements Function1<sr1, Unit> {
    public final /* synthetic */ iny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dny(iny inyVar) {
        super(1);
        this.a = inyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(sr1 sr1Var) {
        cny cnyVarPrevious;
        sr1 sr1Var2 = sr1Var;
        sr1Var2.getClass();
        iny inyVar = this.a;
        cny cnyVar = inyVar.c;
        if (cnyVar == null) {
            gx0<cny> gx0Var = inyVar.b;
            ListIterator<cny> listIterator = gx0Var.listIterator(gx0Var.getB());
            do {
                if (!listIterator.hasPrevious()) {
                    cnyVarPrevious = null;
                    break;
                }
                cnyVarPrevious = listIterator.previous();
            } while (!cnyVarPrevious.a);
            cnyVar = cnyVarPrevious;
        }
        if (cnyVar != null) {
            cnyVar.c(sr1Var2);
        }
        return Unit.a;
    }
}
