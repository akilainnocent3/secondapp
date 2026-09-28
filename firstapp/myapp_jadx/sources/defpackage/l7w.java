package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.MovingCloudsKt$MovingClouds$2$2$1", f = "MovingClouds.kt", l = {88, 91}, m = "invokeSuspend", v = 1)
public final class l7w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<Float> A;
    public final /* synthetic */ ytw<Float> B;
    public final /* synthetic */ ytw<Float> C;
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public int f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float v;
    public final /* synthetic */ int w;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7w(boolean z, float f, int i, float f2, float f3, ytw<Float> ytwVar, ytw<Float> ytwVar2, ytw<Float> ytwVar3, v1b<? super l7w> v1bVar) {
        super(2, v1bVar);
        this.i = z;
        this.v = f;
        this.w = i;
        this.y = f2;
        this.z = f3;
        this.A = ytwVar;
        this.B = ytwVar2;
        this.C = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l7w(this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l7w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (r15 == r0) goto L19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a3 -> B:20:0x00a6). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
