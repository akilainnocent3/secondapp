package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.android.firebase.FirebaseAgent$getLiveEventNotificationFeatureAvailable$1$1$1", f = "FirebaseAgent.kt", l = {}, m = "invokeSuspend", v = 2)
public final class roh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ubm a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roh(ubm ubmVar, boolean z, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ubmVar;
        this.b = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new roh(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((roh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke(Boolean.valueOf(this.b));
        return Unit.a;
    }
}
