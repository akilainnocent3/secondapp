package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.MovingImageKt$MovingImage$2$1$1", f = "MovingImage.kt", l = {59, 62}, m = "invokeSuspend", v = 1)
public final class q7w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float i;
    public final /* synthetic */ Function0<Unit> v;
    public final /* synthetic */ ytw<Float> w;
    public final /* synthetic */ ytw<Float> y;
    public final /* synthetic */ ytw<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7w(float f, boolean z, int i, float f2, float f3, Function0 function0, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, v1b v1bVar) {
        super(2, v1bVar);
        this.c = f;
        this.d = z;
        this.e = i;
        this.f = f2;
        this.i = f3;
        this.v = function0;
        this.w = ytwVar;
        this.y = ytwVar2;
        this.z = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q7w(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q7w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fe  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r12 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r12 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:19:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
