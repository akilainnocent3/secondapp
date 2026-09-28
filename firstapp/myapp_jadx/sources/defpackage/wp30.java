package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$RCPointerView$3$1", f = "RCPointerView.kt", l = {85, 89}, m = "invokeSuspend", v = 1)
public final class wp30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<Float> A;
    public long a;
    public float b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float i;
    public final /* synthetic */ Function1<Float, Unit> v;
    public final /* synthetic */ Function0<Unit> w;
    public final /* synthetic */ isw y;
    public final /* synthetic */ isw z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wp30(float f, float f2, float f3, Function1<? super Float, Unit> function1, Function0<Unit> function0, isw iswVar, isw iswVar2, ytw<Float> ytwVar, v1b<? super wp30> v1bVar) {
        super(2, v1bVar);
        this.e = f;
        this.f = f2;
        this.i = f3;
        this.v = function1;
        this.w = function0;
        this.y = iswVar;
        this.z = iswVar2;
        this.A = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wp30 wp30Var = new wp30(this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
        wp30Var.d = obj;
        return wp30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wp30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r3 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r7 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:19:0x006f). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
