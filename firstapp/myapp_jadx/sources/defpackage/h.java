package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend", v = 1)
public final class h extends ji50 implements Function2<wc80<? super cxz>, v1b<? super Unit>, Object> {
    public gx0 b;
    public Iterator c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cxz f;
    public final /* synthetic */ blh i;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cxz cxzVar, blh blhVar, boolean z, v1b<? super h> v1bVar) {
        super(2, v1bVar);
        this.f = cxzVar;
        this.i = blhVar;
        this.v = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h hVar = new h(this.f, this.i, this.v, v1bVar);
        hVar.e = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super cxz> wc80Var, v1b<? super Unit> v1bVar) {
        return ((h) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:14:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            r1 = r0
            wc80 r1 = (defpackage.wc80) r1
            y5b r0 = defpackage.y5b.a
            int r2 = r10.d
            r3 = r2
            blh r2 = r10.i
            r8 = 1
            if (r3 == 0) goto L23
            if (r3 != r8) goto L1c
            java.util.Iterator r3 = r10.c
            gx0 r4 = r10.b
            defpackage.uj50.b(r11)
            r7 = r10
            r11 = r3
            r3 = r4
            goto L5a
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L23:
            defpackage.uj50.b(r11)
            gx0 r11 = new gx0
            r11.<init>()
            cxz r3 = r10.f
            r11.addLast(r3)
            java.util.List r3 = r2.list(r3)
            java.util.Iterator r3 = r3.iterator()
            r9 = r3
            r3 = r11
            r11 = r9
        L3b:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r11.next()
            cxz r4 = (defpackage.cxz) r4
            r10.e = r1
            r10.b = r3
            r10.c = r11
            r10.d = r8
            boolean r5 = r10.v
            r6 = 0
            r7 = r10
            java.lang.Object r10 = defpackage.gq40.b(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L5a
            return r0
        L5a:
            r10 = r7
            goto L3b
        L5c:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
