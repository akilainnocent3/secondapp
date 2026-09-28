package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {315}, m = "invokeSuspend")
public final class uz0 extends tje0 implements Function2<v5b, v1b<? super Object>, Object> {
    public int a;
    public final /* synthetic */ vz0 b;
    public final /* synthetic */ z7i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(vz0 vz0Var, z7i z7iVar, v1b<? super uz0> v1bVar) {
        super(2, v1bVar);
        this.b = vz0Var;
        this.c = z7iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uz0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Object> v1bVar) {
        return ((uz0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        k70 k70Var = this.b.e;
        this.a = 1;
        Object objA = k70Var.a(this.c, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
