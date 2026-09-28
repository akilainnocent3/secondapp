package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.VersionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.VersionUpdateDialogViewModel$setSkippedVersion$1", f = "VersionUpdateDialogViewModel.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class k2i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ VersionData b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ m2i0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2i0(VersionData versionData, Function0<Unit> function0, m2i0 m2i0Var, v1b<? super k2i0> v1bVar) {
        super(2, v1bVar);
        this.b = versionData;
        this.c = function0;
        this.d = m2i0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k2i0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k2i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String version = this.b.getVersion();
            if (version != null) {
                du0 du0Var = this.d.a;
                wm20 wm20VarA = du0Var.d.a(du0Var, du0.e[2]);
                this.a = 1;
                if (wm20VarA.g(this, version) == y5bVar) {
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
        this.c.invoke();
        return Unit.a;
    }
}
