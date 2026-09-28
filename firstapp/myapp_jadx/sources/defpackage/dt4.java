package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.vault.BonusVaultDialogViewModel$onGameClick$1", f = "BonusVaultDialogViewModel.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class dt4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nt4 b;
    public final /* synthetic */ et4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt4(nt4 nt4Var, et4 et4Var, v1b<? super dt4> v1bVar) {
        super(2, v1bVar);
        this.b = nt4Var;
        this.c = et4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dt4(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dt4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            nt4 nt4Var = this.b;
            vt4 vt4Var = nt4Var.c;
            if (vt4Var == vt4.d || vt4Var == vt4.c) {
                b390 b390Var = this.c.c;
                this.a = 1;
                if (b390Var.emit(nt4Var, this) == y5bVar) {
                    return y5bVar;
                }
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
