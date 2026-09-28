package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.DateInputKt$DateInputTextField$4$1", f = "DateInput.kt", l = {233}, m = "invokeSuspend")
public final class usc extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b5i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usc(b5i b5iVar, v1b<? super usc> v1bVar) {
        super(2, v1bVar);
        this.b = b5iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new usc(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((usc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        b5i b5iVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (b5iVar != null) {
                this.a = 1;
                if (hkd.b(300L, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a(LhMGMAwwhzjwfz.cKq);
            return null;
        }
        uj50.b(obj);
        b5i.b(b5iVar);
        return Unit.a;
    }
}
