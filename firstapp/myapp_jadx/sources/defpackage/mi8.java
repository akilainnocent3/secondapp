package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mi8 implements md8.c, bjs.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ mi8(r21 r21Var) {
        this.a = r21Var;
    }

    @Override // md8.c
    public void b() {
        Function1<AlertDialogCallbackType, Unit> function1 = ((a.l) this.a).f;
        if (function1 != null) {
            function1.invoke(AlertDialogCallbackType.Positive.a);
        }
    }

    @Override // bjs.a
    public void invoke(Object obj) {
        ((so10.c) obj).N((r21) this.a);
    }

    public /* synthetic */ mi8(a.l lVar, e eVar) {
        this.a = lVar;
    }
}
