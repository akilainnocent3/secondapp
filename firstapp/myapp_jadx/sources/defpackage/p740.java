package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$pickDateRange$1", f = "RealBetHistoryViewModel.kt", l = {440, 441, 449}, m = "invokeSuspend", v = 2)
public final class p740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ztw a;
    public int b;
    public final /* synthetic */ d740 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p740(v1b v1bVar, d740 d740Var) {
        super(2, v1bVar);
        this.c = d740Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p740(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r9 == r3) goto L28;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            d740 r0 = r8.c
            ku90<b740> r1 = r0.C
            wwd0 r2 = r0.Q
            y5b r3 = defpackage.y5b.a
            int r4 = r8.b
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L2f
            if (r4 == r7) goto L29
            if (r4 == r6) goto L23
            if (r4 != r5) goto L1c
            ztw r2 = r8.a
            defpackage.uj50.b(r9)
            goto Lae
        L1c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L23:
            ztw r8 = r8.a
            defpackage.uj50.b(r9)
            goto L7c
        L29:
            ztw r0 = r8.a
            defpackage.uj50.b(r9)
            goto L4e
        L2f:
            defpackage.uj50.b(r9)
            v340 r9 = r0.H
            uwd0<T> r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L88
            r8.a = r2
            r8.b = r7
            java.lang.Object r9 = r0.y1(r8)
            if (r9 != r3) goto L4d
            goto Lad
        L4d:
            r0 = r2
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L80
            java.lang.Object r9 = r2.getValue()
            android.util.Range r9 = (android.util.Range) r9
            r8.a = r0
            r8.b = r6
            bc6 r2 = new bc6
            v1b r8 = defpackage.yzo.b(r8)
            r2.<init>(r7, r8)
            r2.q()
            b740$b r8 = new b740$b
            r8.<init>(r9, r7, r2)
            r1.a(r8)
            java.lang.Object r9 = r2.o()
            if (r9 != r3) goto L7b
            goto Lad
        L7b:
            r8 = r0
        L7c:
            android.util.Range r9 = (android.util.Range) r9
            r0 = r8
            goto Lb1
        L80:
            java.lang.Object r8 = r2.getValue()
            r9 = r8
            android.util.Range r9 = (android.util.Range) r9
            goto Lb1
        L88:
            java.lang.Object r9 = r2.getValue()
            android.util.Range r9 = (android.util.Range) r9
            r8.a = r2
            r8.b = r5
            bc6 r0 = new bc6
            v1b r8 = defpackage.yzo.b(r8)
            r0.<init>(r7, r8)
            r0.q()
            b740$b r8 = new b740$b
            r4 = 0
            r8.<init>(r9, r4, r0)
            r1.a(r8)
            java.lang.Object r9 = r0.o()
            if (r9 != r3) goto Lae
        Lad:
            return r3
        Lae:
            android.util.Range r9 = (android.util.Range) r9
            r0 = r2
        Lb1:
            r0.setValue(r9)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p740.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
