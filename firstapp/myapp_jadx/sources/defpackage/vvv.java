package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.api.mission.MissionTabContentKt$MissionTabContent$3$1", f = "MissionTabContent.kt", l = {137, 140}, m = "invokeSuspend", v = 2)
public final class vvv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ float A;
    public int a;
    public int b;
    public int c;
    public ia5 d;
    public float e;
    public float f;
    public int i;
    public final /* synthetic */ cr3 v;
    public final /* synthetic */ Integer w;
    public final /* synthetic */ ia5 y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvv(cr3 cr3Var, Integer num, ia5 ia5Var, float f, float f2, v1b<? super vvv> v1bVar) {
        super(2, v1bVar);
        this.v = cr3Var;
        this.w = num;
        this.y = ia5Var;
        this.z = f;
        this.A = f2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vvv(this.v, this.w, this.y, this.z, this.A, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vvv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (defpackage.hkd.b(100, r14) == r0) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:7:0x001b). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r14.i
            cr3 r2 = r14.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L27
            if (r1 != r3) goto L20
            int r1 = r14.b
            float r5 = r14.f
            float r6 = r14.e
            int r7 = r14.a
            ia5 r8 = r14.d
            defpackage.uj50.b(r15)
        L1b:
            r15 = r7
            r7 = r5
            r5 = r8
            goto L94
        L20:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r14)
            r14 = 0
            return r14
        L27:
            int r1 = r14.c
            int r5 = r14.b
            float r6 = r14.f
            float r7 = r14.e
            int r8 = r14.a
            ia5 r9 = r14.d
            defpackage.uj50.b(r15)
            r15 = r1
            r1 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            goto L7d
        L3d:
            defpackage.uj50.b(r15)
            if (r2 == 0) goto L9b
            boolean r15 = r2.a
            if (r15 != r4) goto L9b
            java.lang.Integer r15 = r14.w
            if (r15 == 0) goto L9b
            r15 = 5
            ia5 r1 = r14.y
            float r5 = r14.z
            float r6 = r14.A
            r7 = 0
            r13 = r5
            r5 = r1
            r1 = r7
            r7 = r6
            r6 = r13
        L57:
            if (r1 >= r15) goto L96
            lk40 r8 = new lk40
            float r9 = -r6
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r7 - r6
            r12 = 0
            r8.<init>(r12, r9, r10, r11)
            r14.d = r5
            r14.a = r15
            r14.e = r6
            r14.f = r7
            r14.b = r1
            r14.c = r1
            r14.i = r4
            java.lang.Object r8 = r5.a(r8, r14)
            if (r8 != r0) goto L79
            goto L93
        L79:
            r8 = r5
            r5 = r7
            r7 = r15
            r15 = r1
        L7d:
            r14.d = r8
            r14.a = r7
            r14.e = r6
            r14.f = r5
            r14.b = r1
            r14.c = r15
            r14.i = r3
            r9 = 100
            java.lang.Object r15 = defpackage.hkd.b(r9, r14)
            if (r15 != r0) goto L1b
        L93:
            return r0
        L94:
            int r1 = r1 + r4
            goto L57
        L96:
            aut r14 = r2.b
            r14.invoke()
        L9b:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
