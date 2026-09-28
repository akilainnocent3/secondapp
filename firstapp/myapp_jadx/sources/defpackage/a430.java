package defpackage;

import com.sportygames.commons.components.ProgressMeterComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.components.ProgressMeterComponent$updateTimeByProgress$1", f = "ProgressMeterComponent.kt", l = {67}, m = "invokeSuspend", v = 1)
public final class a430 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public ProgressMeterComponent c;
    public int d;
    public final /* synthetic */ ProgressMeterComponent e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a430(ProgressMeterComponent progressMeterComponent, v1b v1bVar) {
        super(2, v1bVar);
        this.e = progressMeterComponent;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a430(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a430) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            int r1 = r7.b
            int r3 = r7.a
            com.sportygames.commons.components.ProgressMeterComponent r4 = r7.c
            defpackage.uj50.b(r8)
            goto L37
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1a:
            defpackage.uj50.b(r8)
            r8 = 0
            r1 = 2
            com.sportygames.commons.components.ProgressMeterComponent r3 = r7.e
            r4 = r3
            r3 = r1
            r1 = r8
        L24:
            if (r1 >= r3) goto L50
            r7.c = r4
            r7.a = r3
            r7.b = r1
            r7.d = r2
            r5 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = defpackage.hkd.b(r5, r7)
            if (r8 != r0) goto L37
            return r0
        L37:
            int r8 = r4.getCurrentProgress()
            r5 = 100
            if (r8 >= r5) goto L4e
            int r8 = r4.getCurrentProgress()
            int r8 = r8 + r2
            r4.setCurrentProgress(r8)
            int r8 = r4.getCurrentProgress()
            r4.O(r8)
        L4e:
            int r1 = r1 + r2
            goto L24
        L50:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a430.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
