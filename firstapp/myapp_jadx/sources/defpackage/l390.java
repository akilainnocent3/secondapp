package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class l390 extends tje0 implements Function2<Object, v1b<? super Boolean>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l390(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Boolean> v1bVar) {
        ((l390) create(obj, v1bVar)).invokeSuspend(Unit.a);
        return Boolean.TRUE;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.TRUE;
    }
}
