package defpackage;

import com.sportybet.android.codehub.ui.CodeHubActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.ui.CodeHubActivity$initializeTabs$8", f = "CodeHubActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pw7 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ CodeHubActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw7(CodeHubActivity codeHubActivity, v1b<? super pw7> v1bVar) {
        super(2, v1bVar);
        this.b = codeHubActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pw7 pw7Var = new pw7(this.b, v1bVar);
        pw7Var.a = ((Boolean) obj).booleanValue();
        return pw7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((pw7) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        CodeHubActivity codeHubActivity = this.b;
        if (z) {
            int i = CodeHubActivity.v;
            codeHubActivity.B1().c.setVisibility(0);
        } else {
            int i2 = CodeHubActivity.v;
            codeHubActivity.B1().c.setVisibility(8);
        }
        return Unit.a;
    }
}
