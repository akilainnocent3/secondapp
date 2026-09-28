package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.assign.viewmodel.AssignedCustomCodeViewModel$onCopyCode$1", f = "AssignedCustomCodeViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class mz0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ oz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(oz0 oz0Var, v1b<? super mz0> v1bVar) {
        super(2, v1bVar);
        this.b = oz0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mz0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mz0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            oz0 oz0Var = this.b;
            b390 b390Var = oz0Var.c;
            gdc gdcVar = ((kz0) oz0Var.b.a.getValue()).c;
            if (gdcVar == null || (str = gdcVar.b) == null) {
                str = "";
            }
            qz0.a aVar = new qz0.a(str);
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
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
