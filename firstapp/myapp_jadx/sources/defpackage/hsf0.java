package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1$1$2", f = "TierMenu.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hsf0 extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ boolean a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hsf0 hsf0Var = new hsf0(2, v1bVar);
        hsf0Var.a = ((Boolean) obj).booleanValue();
        return hsf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((hsf0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!z);
    }
}
