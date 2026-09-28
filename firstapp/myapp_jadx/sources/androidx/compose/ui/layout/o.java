package androidx.compose.ui.layout;

import defpackage.mo50;
import defpackage.qlr;
import defpackage.x5a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends qlr implements Function0<Unit> {
    public final /* synthetic */ k.b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k.b bVar) {
        super(0);
        this.a = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        mo50 mo50Var;
        k.b bVar = this.a;
        if (!((Boolean) ((x5a0) bVar.g).getValue()).booleanValue() && (mo50Var = bVar.c) != null) {
            mo50Var.deactivate();
        }
        return Unit.a;
    }
}
