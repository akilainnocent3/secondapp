package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.notesonbet.NoteOnBetViewModel$uiState$1", f = "NoteOnBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xzx extends tje0 implements Function2<myh<? super Map<String, ? extends UIState<? extends String>>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ uzx a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzx(uzx uzxVar, String str, String str2, v1b<? super xzx> v1bVar) {
        super(2, v1bVar);
        this.a = uzxVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xzx(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Map<String, ? extends UIState<? extends String>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((xzx) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uzx uzxVar = this.a;
        Map map = (Map) uzxVar.i.getValue();
        String str = this.b;
        UIState uIState = (UIState) map.get(str);
        String str2 = uIState != null ? (String) uIState.getData() : null;
        String str3 = this.c;
        if (!Intrinsics.g(str2, str3) || str3 == null) {
            uzxVar.x1(str, new UIState.Success(str3));
        }
        return Unit.a;
    }
}
