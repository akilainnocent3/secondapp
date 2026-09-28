package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$SpriteAnimation$2$1", f = "OngoingComponent.kt", l = {674}, m = "invokeSuspend", v = 1)
public final class axy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List<c8n> d;
    public final /* synthetic */ osw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public axy(long j, boolean z, List<? extends c8n> list, osw oswVar, v1b<? super axy> v1bVar) {
        super(2, v1bVar);
        this.b = j;
        this.c = z;
        this.d = list;
        this.e = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new axy(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((axy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:12:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x002e
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
            r2 = 0
            osw r3 = r7.e
            r4 = 1
            if (r1 == 0) goto L17
            if (r1 != r4) goto L10
            defpackage.uj50.b(r8)
            goto L2a
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L17:
            defpackage.uj50.b(r8)
            int r8 = defpackage.bxy.a
            r3.k(r2)
        L1f:
            r7.a = r4
            long r5 = r7.b
            java.lang.Object r8 = defpackage.hkd.b(r5, r7)
            if (r8 != r0) goto L2a
            return r0
        L2a:
            boolean r8 = r7.c
            if (r8 == 0) goto L3d
            int r8 = defpackage.bxy.a
            int r8 = r3.D()
            int r8 = r8 + r4
            java.util.List<c8n> r1 = r7.d
            int r1 = r1.size()
            int r8 = r8 % r1
            goto L3e
        L3d:
            r8 = r2
        L3e:
            int r1 = defpackage.bxy.a
            r3.k(r8)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
