package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.GhKycDialogAnTestManager$resolveVariant$result$1", f = "GhKycDialogAnTestManager.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class ghk extends tje0 implements Function2<v5b, v1b<? super lk50<? extends xcj>>, Object> {
    public int a;
    public final /* synthetic */ hhk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghk(hhk hhkVar, v1b<? super ghk> v1bVar) {
        super(2, v1bVar);
        this.b = hhkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ghk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends xcj>> v1bVar) {
        return ((ghk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        sl50 sl50Var = new sl50(this.b.b.j(z76.z));
        this.a = 1;
        Object objC = s0i.c(sl50Var, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
