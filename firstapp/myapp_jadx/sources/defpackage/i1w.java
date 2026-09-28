package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class i1w extends tje0 implements gaj<v5b, Float, v1b<? super Unit>, Object> {
    public /* synthetic */ float a;
    public final /* synthetic */ Function1<Float, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1w(Function1<? super Float, Unit> function1, v1b<? super i1w> v1bVar) {
        super(3, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, Float f, v1b<? super Unit> v1bVar) {
        float fFloatValue = f.floatValue();
        i1w i1wVar = new i1w(this.b, v1bVar);
        i1wVar.a = fFloatValue;
        return i1wVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(new Float(this.a));
        return Unit.a;
    }
}
