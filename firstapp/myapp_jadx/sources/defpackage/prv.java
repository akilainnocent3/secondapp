package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.api.mission.MissionCancelCooldownKt$buildCancelCooldownFlow$2", f = "MissionCancelCooldown.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class prv extends tje0 implements Function2<myh<? super UiText>, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0<Long> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prv(long j, Function0<Long> function0, v1b<? super prv> v1bVar) {
        super(2, v1bVar);
        this.d = j;
        this.e = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        prv prvVar = new prv(this.d, this.e, v1bVar);
        prvVar.c = obj;
        return prvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super UiText> myhVar, v1b<? super Unit> v1bVar) {
        return ((prv) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d A[PHI: r7
      0x008d: PHI (r7v2 long) = (r7v1 long), (r7v3 long) binds: [B:20:0x008a, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009f -> B:11:0x0023). Please report as a decompilation issue!!! */
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
            java.lang.Object r0 = r13.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r13.b
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L20
            if (r2 == r6) goto L1a
            if (r2 != r5) goto L13
            goto L20
        L13:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            r13 = 0
            return r13
        L1a:
            long r7 = r13.a
            defpackage.uj50.b(r14)
            goto L8d
        L20:
            defpackage.uj50.b(r14)
        L23:
            kotlin.coroutines.CoroutineContext r14 = r13.getContext()
            boolean r14 = defpackage.i9p.h(r14)
            if (r14 == 0) goto La2
            kotlin.jvm.functions.Function0<java.lang.Long> r14 = r13.e
            java.lang.Object r14 = r14.invoke()
            java.lang.Number r14 = (java.lang.Number) r14
            long r7 = r14.longValue()
            long r9 = r13.d
            long r7 = r9 - r7
            r9 = 0
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto La2
            r9 = 60000(0xea60, double:2.9644E-319)
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 < 0) goto L66
            r11 = 59999(0xea5f, double:2.96434E-319)
            long r11 = r11 + r7
            long r11 = r11 / r9
            java.lang.String r14 = java.lang.String.valueOf(r11)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            java.util.List r14 = defpackage.ay0.S(r14)
            r9 = 2132022191(0x7f1413af, float:1.9682795E38)
            r2.<init>(r9, r14)
            goto L80
        L66:
            r9 = 999(0x3e7, double:4.936E-321)
            long r9 = r9 + r7
            long r9 = r9 / r3
            java.lang.String r14 = java.lang.String.valueOf(r9)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            java.util.List r14 = defpackage.ay0.S(r14)
            r9 = 2132022192(0x7f1413b0, float:1.9682797E38)
            r2.<init>(r9, r14)
        L80:
            r13.c = r0
            r13.a = r7
            r13.b = r6
            java.lang.Object r14 = r0.emit(r2, r13)
            if (r14 != r1) goto L8d
            goto La1
        L8d:
            kotlin.time.b$a r14 = kotlin.time.b.b
            rgf r14 = defpackage.rgf.MILLISECONDS
            long r9 = kotlin.time.c.i(r3, r14)
            r13.c = r0
            r13.a = r7
            r13.b = r5
            java.lang.Object r14 = defpackage.hkd.c(r9, r13)
            if (r14 != r1) goto L23
        La1:
            return r1
        La2:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
