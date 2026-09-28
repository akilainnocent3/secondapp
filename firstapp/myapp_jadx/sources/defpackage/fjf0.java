package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class fjf0 {
    public final Function1<String, Boolean> a;
    public final Function1<String, UiText> b;
    public final ytw c;
    public final ytw d;
    public final ytw e;
    public final ytw f;
    public final or60 g;
    public final b77 h;

    @c0d(c = "com.sporty.android.compose.ui.state.TextFieldState$isValidFlow$2", f = "TextFieldState.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<ijf0, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = fjf0.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ijf0 ijf0Var, v1b<? super Boolean> v1bVar) {
            return ((a) create(ijf0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ijf0 ijf0Var = (ijf0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return fjf0.this.a.invoke(ijf0Var.a.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fjf0(Function1<? super String, Boolean> function1, Function1<? super String, ? extends UiText> function2) {
        function1.getClass();
        this.a = function1;
        this.b = function2;
        this.c = m.b(new ijf0("", 0L, 6));
        Boolean bool = Boolean.FALSE;
        this.d = m.b(bool);
        this.e = m.b(bool);
        this.f = m.b(bool);
        this.g = n95.c(new vjb(this, 1));
        this.h = r0i.d(n95.c(new wjb(this, 2)), new a(null));
    }

    public final ijf0 a() {
        return (ijf0) ((x5a0) this.c).getValue();
    }

    public final boolean b() {
        return !this.a.invoke(a().a.b).booleanValue() && ((Boolean) ((x5a0) this.f).getValue()).booleanValue();
    }

    public fjf0() {
        this(3, (Function1) null);
    }

    public /* synthetic */ fjf0(int i, Function1 function1) {
        this((Function1<? super String, Boolean>) ((i & 1) != 0 ? new x9g(2) : function1), new ri70(1));
    }
}
