package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.GetBannerUseCase$toBannerFlow$1", f = "GetBannerUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 47}, m = "invokeSuspend", v = 2)
public final class h3k extends tje0 implements Function2<myh<? super jxp>, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kmq d;
    public final /* synthetic */ i3k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3k(kmq kmqVar, i3k i3kVar, v1b<? super h3k> v1bVar) {
        super(2, v1bVar);
        this.d = kmqVar;
        this.e = i3kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h3k h3kVar = new h3k(this.d, this.e, v1bVar);
        h3kVar.c = obj;
        return h3kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super jxp> myhVar, v1b<? super Unit> v1bVar) {
        return ((h3k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r3
      0x006f: PHI (r3v5 int) = (r3v1 int), (r3v4 int), (r3v7 int) binds: [B:28:0x006d, B:33:0x0099, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[PHI: r3
      0x0087: PHI (r3v2 int) = (r3v5 int), (r3v6 int) binds: [B:30:0x0084, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Path cross not found for [B:4:0x0013, B:14:0x0035], limit reached: 32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0099 -> B:29:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kmq r0 = r11.d
            qcn<java.lang.String> r0 = r0.a
            java.lang.Object r1 = r11.c
            myh r1 = (defpackage.myh) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r11.b
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L35
            if (r3 == r8) goto L31
            if (r3 == r7) goto L2d
            if (r3 == r6) goto L27
            if (r3 != r5) goto L21
            int r3 = r11.a
            defpackage.uj50.b(r12)
            goto L6f
        L21:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r4
        L27:
            int r3 = r11.a
            defpackage.uj50.b(r12)
            goto L87
        L2d:
            defpackage.uj50.b(r12)
            goto L6a
        L31:
            defpackage.uj50.b(r12)
            goto L4b
        L35:
            defpackage.uj50.b(r12)
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L4e
            jxp$a r12 = jxp.a.a
            r11.c = r4
            r11.b = r8
            java.lang.Object r11 = r1.emit(r12, r11)
            if (r11 != r2) goto L4b
            goto L9b
        L4b:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L4e:
            int r12 = r0.size()
            if (r12 != r8) goto L6d
            jxp$b r12 = new jxp$b
            java.lang.Object r0 = kotlin.collections.CollectionsKt.T(r0)
            java.lang.String r0 = (java.lang.String) r0
            r12.<init>(r0)
            r11.c = r4
            r11.b = r7
            java.lang.Object r11 = r1.emit(r12, r11)
            if (r11 != r2) goto L6a
            goto L9b
        L6a:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L6d:
            r12 = 0
            r3 = r12
        L6f:
            jxp$b r12 = new jxp$b
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r12.<init>(r4)
            r11.c = r1
            r11.a = r3
            r11.b = r6
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r2) goto L87
            goto L9b
        L87:
            int r3 = r3 + r8
            int r12 = r0.size()
            int r3 = r3 % r12
            r11.c = r1
            r11.a = r3
            r11.b = r5
            r9 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r12 = defpackage.hkd.b(r9, r11)
            if (r12 != r2) goto L6f
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h3k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
