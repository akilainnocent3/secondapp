package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1653}, m = "invokeSuspend")
public final class zvc extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ int c;
    public final /* synthetic */ IntRange d;
    public final /* synthetic */ iu5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvc(zzr zzrVar, int i, IntRange intRange, iu5 iu5Var, v1b<? super zvc> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = i;
        this.d = intRange;
        this.e = iu5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zvc(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zvc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            int i2 = (((this.c - this.d.a) * 12) + this.e.b) - 1;
            this.a = 1;
            uv60 uv60Var = zzr.x;
            if (this.b.k(i2, 0, this) == y5bVar) {
                return y5bVar;
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
