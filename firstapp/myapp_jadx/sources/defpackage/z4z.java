package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.OtpApiStateDialogKt$OtpApiStateDialog$3$1", f = "OtpApiStateDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z4z extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function1<Object, Unit> a;
    public final /* synthetic */ j7z<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4z(Function1<Object, Unit> function1, j7z<Object> j7zVar, v1b<? super z4z> v1bVar) {
        super(2, v1bVar);
        this.a = function1;
        this.b = j7zVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z4z(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z4z) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke(((j7z.c) this.b).a);
        return Unit.a;
    }
}
