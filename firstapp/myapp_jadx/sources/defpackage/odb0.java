package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.feature.splash.SplashViewModel$checkIsFirstTimeLaunch$1", f = "SplashViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 43}, m = "invokeSuspend", v = 2)
public final class odb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public tb5 a;
    public int b;
    public final /* synthetic */ rdb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odb0(rdb0 rdb0Var, v1b<? super odb0> v1bVar) {
        super(2, v1bVar);
        this.c = rdb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new odb0(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((odb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r1.j(r6, r7) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)
            goto L42
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            tb5 r1 = r6.a
            defpackage.uj50.b(r7)
            goto L37
        L1d:
            defpackage.uj50.b(r7)
            rdb0 r7 = r6.c
            tb5 r1 = r7.v
            m2l r7 = r7.a
            cfd[] r5 = defpackage.cfd.b
            r6.a = r1
            r6.b = r4
            zed r7 = r7.a
            java.lang.String r5 = "isFirst"
            java.lang.Object r7 = r7.getBoolean(r5, r4, r6)
            if (r7 != r0) goto L37
            goto L41
        L37:
            r6.a = r2
            r6.b = r3
            java.lang.Object r6 = r1.j(r6, r7)
            if (r6 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
