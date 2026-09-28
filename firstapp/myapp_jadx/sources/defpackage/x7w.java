package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.MovingStarsBackgroundKt$MovingStarsBackground$1$1", f = "MovingStarsBackground.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class x7w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public cq40 a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ytw<Float> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7w(float f, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = f;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x7w(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((x7w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final cq40 cq40Var;
        Function1 function1;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            cq40Var = new cq40();
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cq40Var = this.a;
            uj50.b(obj);
        }
        do {
            final float f = this.c;
            final ytw<Float> ytwVar = this.d;
            function1 = new Function1() { // from class: w7w
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long jLongValue = ((Long) obj2).longValue();
                    cq40 cq40Var2 = cq40Var;
                    long j = cq40Var2.a;
                    if (j != 0) {
                        ytw ytwVar2 = ytwVar;
                        ytwVar2.setValue(Float.valueOf((f * ((jLongValue - j) / 1.0E9f)) + ((Number) ytwVar2.getValue()).floatValue()));
                    }
                    cq40Var2.a = jLongValue;
                    return Unit.a;
                }
            };
            this.a = cq40Var;
            this.b = 1;
        } while (t4w.a(getContext()).P(function1, this) != y5bVar);
        return y5bVar;
    }
}
