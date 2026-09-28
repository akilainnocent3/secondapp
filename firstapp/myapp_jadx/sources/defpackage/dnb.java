package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$GiftBellBox$1$1", f = "CrashInitiatedFragment.kt", l = {3650, 3653}, m = "invokeSuspend", v = 1)
public final class dnb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public List a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final /* synthetic */ wd0<Float, ij0> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnb(wd0<Float, ij0> wd0Var, v1b<? super dnb> v1bVar) {
        super(2, v1bVar);
        this.i = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dnb(this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((dnb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007e  */
    /* JADX WARN: Code duplicated, block: B:16:0x008a  */
    /* JADX WARN: Code duplicated, block: B:19:0x00af  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00af -> B:20:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r17
            y5b r7 = defpackage.y5b.a
            int r0 = r5.f
            r8 = 0
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L33
            if (r0 == r10) goto L29
            if (r0 != r9) goto L22
            int r0 = r5.e
            int r1 = r5.d
            int r2 = r5.c
            int r3 = r5.b
            java.util.List r4 = r5.a
            defpackage.uj50.b(r18)
            r11 = r0
            r12 = r2
            r14 = r3
            r15 = r4
            goto Lb0
        L22:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L29:
            int r0 = r5.c
            int r1 = r5.b
            java.util.List r2 = r5.a
            defpackage.uj50.b(r18)
            goto L7e
        L33:
            defpackage.uj50.b(r18)
            java.lang.Float r0 = new java.lang.Float
            r1 = 0
            r0.<init>(r1)
            java.lang.Float r2 = new java.lang.Float
            r3 = 1092616192(0x41200000, float:10.0)
            r2.<init>(r3)
            java.lang.Float r3 = new java.lang.Float
            r4 = -1063256064(0xffffffffc0a00000, float:-5.0)
            r3.<init>(r4)
            java.lang.Float r4 = new java.lang.Float
            r6 = 1084227584(0x40a00000, float:5.0)
            r4.<init>(r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            java.lang.Float[] r0 = new java.lang.Float[]{r0, r2, r3, r4, r6}
            java.util.List r0 = kotlin.collections.b.k(r0)
            int r1 = r0.size()
            int r1 = r1 - r10
            r2 = 500(0x1f4, float:7.0E-43)
            int r1 = r2 / r1
            r16 = r2
            r2 = r0
            r0 = r1
            r1 = r16
        L6d:
            r5.a = r2
            r5.b = r1
            r5.c = r0
            r5.f = r10
            r3 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Object r3 = defpackage.hkd.b(r3, r5)
            if (r3 != r7) goto L7e
            goto Lae
        L7e:
            int r3 = r2.size()
            int r3 = r3 - r10
            r12 = r0
            r14 = r1
            r15 = r2
            r11 = r3
            r13 = r8
        L88:
            if (r13 >= r11) goto Lb5
            int r0 = r13 + 1
            java.lang.Object r1 = r15.get(r0)
            f4c r0 = defpackage.xkf.a
            gzg0 r2 = defpackage.yi0.e(r12, r8, r0, r9)
            r5.a = r15
            r5.b = r14
            r5.c = r12
            r5.d = r13
            r5.e = r11
            r5.f = r9
            wd0<java.lang.Float, ij0> r0 = r5.i
            r3 = 0
            r4 = 0
            r6 = 12
            java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Laf
        Lae:
            return r7
        Laf:
            r1 = r13
        Lb0:
            int r13 = r1 + 1
            r5 = r17
            goto L88
        Lb5:
            r5 = r17
            r0 = r12
            r1 = r14
            r2 = r15
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
