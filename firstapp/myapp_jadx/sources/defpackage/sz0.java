package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend")
public final class sz0 extends tje0 implements Function1<v1b<? super Object>, Object> {
    public int a;
    public final /* synthetic */ vz0 b;
    public final /* synthetic */ z7i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(vz0 vz0Var, z7i z7iVar, v1b<? super sz0> v1bVar) {
        super(1, v1bVar);
        this.b = vz0Var;
        this.c = z7iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new sz0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Object> v1bVar) {
        return ((sz0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            Object objC = this.b.c(this.c, this);
            return objC == y5bVar ? y5bVar : objC;
        }
        if (i == 1) {
            uj50.b(obj);
            return obj;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
