package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.matchmaking.QuickTipCardKt$AnimatedTips$1$1", f = "QuickTipCard.kt", l = {87, 88, 90}, m = "invokeSuspend", v = 1)
public final class qj30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ List<String> c;
    public final /* synthetic */ osw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj30(wd0<Float, ij0> wd0Var, List<String> list, osw oswVar, v1b<? super qj30> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = list;
        this.d = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qj30(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((qj30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:13:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            y5b r7 = defpackage.y5b.a
            int r0 = r15.a
            r8 = 6
            r9 = 0
            r10 = 300(0x12c, float:4.2E-43)
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L23
            if (r0 == r13) goto L1f
            if (r0 == r12) goto L1b
            if (r0 != r11) goto L15
            goto L23
        L15:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r14
        L1b:
            defpackage.uj50.b(r16)
            goto L4b
        L1f:
            defpackage.uj50.b(r16)
            goto L31
        L23:
            defpackage.uj50.b(r16)
        L26:
            r15.a = r13
            r0 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r0 = defpackage.hkd.b(r0, r15)
            if (r0 != r7) goto L31
            goto L78
        L31:
            java.lang.Float r1 = new java.lang.Float
            r0 = 0
            r1.<init>(r0)
            gzg0 r2 = defpackage.yi0.e(r10, r9, r14, r8)
            r15.a = r12
            wd0<java.lang.Float, ij0> r0 = r15.b
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r15
            java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L4b
            goto L78
        L4b:
            i060 r0 = defpackage.rj30.c
            osw r0 = r15.d
            int r1 = r0.D()
            int r1 = r1 + r13
            java.util.List<java.lang.String> r2 = r15.c
            int r2 = r2.size()
            int r1 = r1 % r2
            r0.k(r1)
            java.lang.Float r1 = new java.lang.Float
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r0)
            gzg0 r2 = defpackage.yi0.e(r10, r9, r14, r8)
            r15.a = r11
            wd0<java.lang.Float, ij0> r0 = r15.b
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r15
            java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L26
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
