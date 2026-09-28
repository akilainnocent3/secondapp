package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetItemKt$NoteOnBetItem$uiStateFlow$1$1", f = "NoteOnBetItem.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rzx extends tje0 implements Function2<UIState<? extends uzx.a>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1<String, Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rzx(String str, Function1<? super String, Unit> function1, v1b<? super rzx> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rzx rzxVar = new rzx(this.b, this.c, v1bVar);
        rzxVar.a = obj;
        return rzxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UIState<? extends uzx.a> uIState, v1b<? super Unit> v1bVar) {
        return ((rzx) create(uIState, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Function1<String, Unit> function1;
        UIState uIState = (UIState) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (uIState instanceof UIState.Success) {
            UIState.Success success = (UIState.Success) uIState;
            if (!Intrinsics.g(((uzx.a) success.getData()).a, this.b) && (function1 = this.c) != null) {
                String str = ((uzx.a) success.getData()).a;
                str.getClass();
                function1.invoke(str);
            }
        }
        return Unit.a;
    }
}
