package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2", f = "LimitOffsetPagingSource.kt", l = {154}, m = "invokeSuspend")
public final class td8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ud8<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td8(ud8<Object> ud8Var, v1b<? super td8> v1bVar) {
        super(2, v1bVar);
        this.b = ud8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new td8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((td8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ud8<Object> ud8Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            o0p o0pVarJ = ud8Var.d.j();
            String[] strArr = ud8Var.a;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.a = 1;
            obj = o0pVarJ.b.c(strArr2, o0pVarJ.e, o0pVarJ.f, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ud8Var.b.c();
        }
        return Unit.a;
    }
}
