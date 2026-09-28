package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.applaunch.FontScaleTrackingReporter$track$1", f = "FontScaleTrackingReporter.kt", l = {24, 30}, m = "invokeSuspend", v = 2)
public final class k9i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public float a;
    public int b;
    public final /* synthetic */ l9i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9i(l9i l9iVar, v1b<? super k9i> v1bVar) {
        super(2, v1bVar);
        this.c = l9iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k9i(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k9i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r1.a.putFloat("tracked_font_scale", new java.lang.Float(r3), r7) == r2) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            l9i r0 = r7.c
            zr0 r1 = r0.d
            y5b r2 = defpackage.y5b.a
            int r3 = r7.b
            java.lang.String r4 = "tracked_font_scale"
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L23
            if (r3 == r5) goto L1d
            if (r3 != r6) goto L16
            defpackage.uj50.b(r8)
            goto L75
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1d:
            float r3 = r7.a
            defpackage.uj50.b(r8)
            goto L45
        L23:
            defpackage.uj50.b(r8)
            i9i r8 = r0.b
            android.content.Context r8 = r8.a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            float r3 = r8.fontScale
            r7.a = r3
            r7.b = r5
            zed r8 = r1.a
            zn20$a r5 = defpackage.co20.c(r4)
            java.lang.Object r8 = r8.f(r5, r7)
            if (r8 != r2) goto L45
            goto L74
        L45:
            java.lang.Float r8 = (java.lang.Float) r8
            boolean r8 = kotlin.jvm.internal.Intrinsics.e(r8, r3)
            if (r8 == 0) goto L50
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L50:
            rdd0 r8 = r0.c
            j9i r0 = new j9i
            r0.<init>(r3)
            k00 r5 = defpackage.k00.d
            k00[] r5 = new defpackage.k00[]{r5}
            r8.a(r0, r5)
            r7.a = r3
            r7.b = r6
            r1.getClass()
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r3)
            zed r0 = r1.a
            java.lang.Object r7 = r0.putFloat(r4, r8, r7)
            if (r7 != r2) goto L75
        L74:
            return r2
        L75:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k9i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
