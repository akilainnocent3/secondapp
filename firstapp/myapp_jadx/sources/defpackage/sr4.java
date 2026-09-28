package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.components.BonusNotificationKt$BonusNotificationCarousel$3$1", f = "BonusNotification.kt", l = {76, 79, 81}, m = "invokeSuspend", v = 1)
public final class sr4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ List<Object> d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ osw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr4(List<? extends Object> list, ytw<Boolean> ytwVar, osw oswVar, v1b<? super sr4> v1bVar) {
        super(2, v1bVar);
        this.d = list;
        this.e = ytwVar;
        this.f = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sr4(this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sr4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (defpackage.hkd.b(3000, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (defpackage.hkd.b(3000, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (defpackage.hkd.b(1000, r10) == r0) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:24:0x0069). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r10.c
            r2 = 3000(0xbb8, double:1.482E-320)
            osw r4 = r10.f
            java.util.List<java.lang.Object> r5 = r10.d
            r6 = 3
            r7 = 2
            ytw<java.lang.Boolean> r8 = r10.e
            r9 = 1
            if (r1 == 0) goto L2e
            if (r1 == r9) goto L2a
            if (r1 == r7) goto L22
            if (r1 != r6) goto L1b
            defpackage.uj50.b(r11)
            goto L76
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L22:
            int r1 = r10.b
            int r5 = r10.a
            defpackage.uj50.b(r11)
            goto L69
        L2a:
            defpackage.uj50.b(r11)
            goto L51
        L2e:
            defpackage.uj50.b(r11)
            boolean r11 = r5.isEmpty()
            if (r11 == 0) goto L3f
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.setValue(r10)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L3f:
            r11 = 0
            r4.k(r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r8.setValue(r11)
            r10.c = r9
            java.lang.Object r11 = defpackage.hkd.b(r2, r10)
            if (r11 != r0) goto L51
            goto L75
        L51:
            int r11 = r5.size()
            r1 = r11
            r5 = r9
        L57:
            if (r5 >= r1) goto L6b
            r4.k(r5)
            r10.a = r5
            r10.b = r1
            r10.c = r7
            java.lang.Object r11 = defpackage.hkd.b(r2, r10)
            if (r11 != r0) goto L69
            goto L75
        L69:
            int r5 = r5 + r9
            goto L57
        L6b:
            r10.c = r6
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.hkd.b(r1, r10)
            if (r10 != r0) goto L76
        L75:
            return r0
        L76:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.setValue(r10)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
