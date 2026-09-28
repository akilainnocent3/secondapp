package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.CountdownTickerModule$provideCountdownTicker$1$1", f = "CountdownTicker.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class m6b extends tje0 implements Function2<myh<? super Long>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m6b m6bVar = new m6b(2, v1bVar);
        m6bVar.b = obj;
        return m6bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Long> myhVar, v1b<? super Unit> v1bVar) {
        ((m6b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:11:0x001f). Please report as a decompilation issue!!! */
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
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L1c
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L18:
            defpackage.uj50.b(r8)
            goto L33
        L1c:
            defpackage.uj50.b(r8)
        L1f:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r7.b = r0
            r7.a = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L33
            goto L48
        L33:
            kotlin.time.b$a r8 = kotlin.time.b.b
            r5 = 60000(0xea60, double:2.9644E-319)
            rgf r8 = defpackage.rgf.MILLISECONDS
            long r5 = kotlin.time.c.i(r5, r8)
            r7.b = r0
            r7.a = r3
            java.lang.Object r8 = defpackage.hkd.c(r5, r7)
            if (r8 != r1) goto L1f
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
