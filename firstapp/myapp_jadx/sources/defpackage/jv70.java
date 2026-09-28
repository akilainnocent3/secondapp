package defpackage;

import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.views.fragment.SearchFragment$UIElementController$focusSearchEditText$1$1", f = "SearchFragment.kt", l = {192}, m = "invokeSuspend", v = 1)
public final class jv70 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hv70.d b;
    public final /* synthetic */ EditText c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv70(hv70.d dVar, EditText editText, v1b<? super jv70> v1bVar) {
        super(2, v1bVar);
        this.b = dVar;
        this.c = editText;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jv70(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jv70) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(200L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        hv70.b bVar = this.b.g;
        if (bVar != null && hv70.this.getContext() != null) {
            bVar.a.showSoftInput(this.c, 1);
        }
        return Unit.a;
    }
}
