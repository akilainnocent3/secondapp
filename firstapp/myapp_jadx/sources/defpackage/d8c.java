package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeDialogKt$CustomCodeEditSheetContent$1$1", f = "CustomCodeDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d8c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ ytw<ijf0> e;
    public final /* synthetic */ ytw<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8c(boolean z, boolean z2, String str, ytw<Boolean> ytwVar, ytw<ijf0> ytwVar2, ytw<Boolean> ytwVar3, v1b<? super d8c> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = ytwVar;
        this.e = ytwVar2;
        this.f = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d8c(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d8c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = this.b;
        boolean z2 = this.a;
        this.d.setValue(Boolean.valueOf(z2 ? false : z));
        this.f.setValue(Boolean.valueOf(z2 || z || Intrinsics.g(this.e.getValue().a.b, this.c)));
        return Unit.a;
    }
}
