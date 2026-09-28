package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$checkAnyUnreadFromCache$1", f = "NCUseCase.kt", l = {96, 98}, m = "invokeSuspend", v = 2)
public final class i4x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public h4x a;
    public f4x[] b;
    public Collection c;
    public Collection d;
    public int e;
    public int f;
    public int i;
    public final /* synthetic */ h4x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4x(h4x h4xVar, v1b<? super i4x> v1bVar) {
        super(2, v1bVar);
        this.v = h4xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i4x(this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i4x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:16:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r13.i
            h4x r2 = r13.v
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L1b
            if (r1 != r3) goto L15
            defpackage.uj50.b(r14)
            goto Laf
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r6
        L1b:
            int r1 = r13.f
            int r7 = r13.e
            java.util.Collection r8 = r13.d
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Collection r9 = r13.c
            java.util.Collection r9 = (java.util.Collection) r9
            f4x[] r10 = r13.b
            h4x r11 = r13.a
            defpackage.uj50.b(r14)
            goto L65
        L2f:
            defpackage.uj50.b(r14)
            f4x[] r14 = defpackage.f4x.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = r14.length
            r1.<init>(r7)
            int r7 = r14.length
            r10 = r14
            r8 = r1
            r11 = r2
            r1 = r7
            r7 = r4
        L42:
            if (r7 >= r1) goto L70
            r14 = r10[r7]
            m2l r9 = r11.b
            java.lang.String r14 = r14.c
            r13.a = r11
            r13.b = r10
            r12 = r8
            java.util.Collection r12 = (java.util.Collection) r12
            r13.c = r12
            r13.d = r12
            r13.e = r7
            r13.f = r1
            r13.i = r5
            zed r9 = r9.a
            java.lang.Object r14 = r9.getBoolean(r14, r4, r13)
            if (r14 != r0) goto L64
            goto Lae
        L64:
            r9 = r8
        L65:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.getClass()
            r8.add(r14)
            int r7 = r7 + r5
            r8 = r9
            goto L42
        L70:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L7b
            boolean r14 = r8.isEmpty()
            if (r14 == 0) goto L7b
            goto L92
        L7b:
            java.util.Iterator r14 = r8.iterator()
        L7f:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r14.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7f
            r4 = r5
        L92:
            m2l r14 = r2.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r13.a = r6
            r13.b = r6
            r13.c = r6
            r13.d = r6
            r13.e = r4
            r13.i = r3
            zed r14 = r14.a
            java.lang.String r2 = "notification_center_any_unread"
            java.lang.Object r13 = r14.putBoolean(r2, r1, r13)
            if (r13 != r0) goto Laf
        Lae:
            return r0
        Laf:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
