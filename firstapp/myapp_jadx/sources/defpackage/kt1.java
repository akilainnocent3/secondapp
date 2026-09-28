package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.BackgroundViewKt$GameScreenBackground$3$1", f = "BackgroundView.kt", l = {166, 168}, m = "invokeSuspend", v = 1)
public final class kt1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kt1(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kt1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0056 -> B:17:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 6000(0x1770, double:2.9644E-320)
            r4 = 2
            ytw<java.lang.Boolean> r5 = r7.c
            r6 = 1
            if (r1 == 0) goto L1f
            if (r1 == r6) goto L1b
            if (r1 != r4) goto L14
            defpackage.uj50.b(r8)
            goto L3d
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1b:
            defpackage.uj50.b(r8)
            goto L4b
        L1f:
            defpackage.uj50.b(r8)
            java.lang.String r8 = "ROUND_ONGOING"
            java.lang.String r1 = r7.b
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r1, r8)
            if (r8 != 0) goto L3d
            java.lang.String r8 = "ROUND_END_WAIT"
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r1, r8)
            if (r8 == 0) goto L35
            goto L3d
        L35:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r5.setValue(r7)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L3d:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r5.setValue(r8)
            r7.a = r6
            java.lang.Object r8 = defpackage.hkd.b(r2, r7)
            if (r8 != r0) goto L4b
            goto L58
        L4b:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r5.setValue(r8)
            r7.a = r4
            java.lang.Object r8 = defpackage.hkd.b(r2, r7)
            if (r8 != r0) goto L3d
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
