package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GenerateNonceUseCase$invoke$2", f = "GenerateNonceUseCase.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class e1k extends tje0 implements Function1<v1b<? super c1k.a>, Object> {
    public int a;
    public final /* synthetic */ c1k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1k(c1k c1kVar, v1b<? super e1k> v1bVar) {
        super(1, v1bVar);
        this.b = c1kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new e1k(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super c1k.a> v1bVar) {
        return ((e1k) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objB = this.b.b(this);
            return objB == y5bVar ? y5bVar : objB;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
