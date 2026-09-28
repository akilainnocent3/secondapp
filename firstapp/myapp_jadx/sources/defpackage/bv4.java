package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.vault.modal.BonusVaultProgressSectionKt$SupportedGamesSection$2$1", f = "BonusVaultProgressSection.kt", l = {}, m = "invokeSuspend", v = 1)
public final class bv4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ List<String> a;
    public final /* synthetic */ Function0<Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv4(List<String> list, Function0<Unit> function0, v1b<? super bv4> v1bVar) {
        super(2, v1bVar);
        this.a = list;
        this.b = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bv4(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bv4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a.isEmpty()) {
            this.b.invoke();
        }
        return Unit.a;
    }
}
