package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w020 extends qlr implements Function1<MotionEvent, Unit> {
    public final /* synthetic */ v020 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w020(v020 v020Var) {
        super(1);
        this.a = v020Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        Function1<? super MotionEvent, Boolean> function1 = this.a.b;
        if (function1 != null) {
            function1.invoke(motionEvent2);
            return Unit.a;
        }
        Intrinsics.n("onTouchEvent");
        throw null;
    }
}
