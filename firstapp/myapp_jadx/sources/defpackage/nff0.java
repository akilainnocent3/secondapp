package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {60}, m = "invokeSuspend")
public final class nff0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o5c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nff0(o5c o5cVar, v1b<? super nff0> v1bVar) {
        super(2, v1bVar);
        this.b = o5cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nff0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nff0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            o5c o5cVar = this.b;
            o5cVar.getClass();
            Object objD = w5b.d(new n5c(o5cVar, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
