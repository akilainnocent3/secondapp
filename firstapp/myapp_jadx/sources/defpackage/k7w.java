package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.MovingCloudsKt$MovingClouds$2$1$1", f = "MovingClouds.kt", l = {67, 70}, m = "invokeSuspend", v = 1)
public final class k7w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public float a;
    public float b;
    public long c;
    public int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int i;
    public final /* synthetic */ float v;
    public final /* synthetic */ ytw<Float> w;
    public final /* synthetic */ ytw<Float> y;
    public final /* synthetic */ ytw<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7w(boolean z, float f, int i, float f2, ytw<Float> ytwVar, ytw<Float> ytwVar2, ytw<Float> ytwVar3, v1b<? super k7w> v1bVar) {
        super(2, v1bVar);
        this.e = z;
        this.f = f;
        this.i = i;
        this.v = f2;
        this.w = ytwVar;
        this.y = ytwVar2;
        this.z = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k7w(this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k7w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if (r15 == r0) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009f -> B:23:0x00a2). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
