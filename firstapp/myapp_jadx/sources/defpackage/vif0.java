package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3", f = "TextFieldSelectionManager.android.kt", l = {}, m = "invokeSuspend")
public final class vif0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ iif0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vif0(iif0 iif0Var, v1b<? super vif0> v1bVar) {
        super(1, v1bVar);
        this.a = iif0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new vif0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((vif0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.n();
        return Unit.a;
    }
}
