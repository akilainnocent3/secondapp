package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GetIntegrityVerdictUseCase$invoke$2", f = "GetIntegrityVerdictUseCase.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class i7k extends tje0 implements Function1<v1b<? super g7k.a>, Object> {
    public int a;
    public final /* synthetic */ g7k b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7k(g7k g7kVar, String str, v1b<? super i7k> v1bVar) {
        super(1, v1bVar);
        this.b = g7kVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new i7k(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super g7k.a> v1bVar) {
        return ((i7k) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objB = this.b.b(this.c, this);
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
