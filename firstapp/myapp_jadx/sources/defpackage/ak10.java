package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenu$2", f = "PlatformSelectionBehaviors.android.kt", l = {168}, m = "invokeSuspend")
public final class ak10 extends tje0 implements Function2<TextClassifier, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gk10 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak10(gk10 gk10Var, String str, long j, v1b v1bVar) {
        super(2, v1bVar);
        this.c = gk10Var;
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ak10 ak10Var = new ak10(this.c, this.d, this.e, v1bVar);
        ak10Var.b = obj;
        return ak10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextClassifier textClassifier, v1b<? super Unit> v1bVar) {
        return ((ak10) create(zj10.a(textClassifier), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            TextClassifier textClassifierA = zj10.a(this.b);
            this.a = 1;
            if (this.c.d(this.d, this.e, textClassifierA, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
