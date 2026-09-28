package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPUseCase$autoCheckVerify$1", f = "ReversedOTPUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 49, 51}, m = "invokeSuspend", v = 2)
public final class dq50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jq50 c;
    public final /* synthetic */ fq50 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPUseCase$autoCheckVerify$1$response$1$1", f = "ReversedOTPUseCase.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super to50>, Object> {
        public fq50 a;
        public int b;
        public final /* synthetic */ fq50 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fq50 fq50Var, String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = fq50Var;
            this.d = str;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super to50> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fq50 fq50Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                fq50 fq50Var2 = this.c;
                t8w t8wVar = fq50Var2.b;
                this.a = fq50Var2;
                this.b = 1;
                Object objC = t8wVar.c(this.d, this.e, this);
                if (objC == y5bVar) {
                    return y5bVar;
                }
                obj = objC;
                fq50Var = fq50Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fq50Var = this.a;
                uj50.b(obj);
            }
            fq50Var.getClass();
            return fq50.a((BaseResponse) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq50(jq50 jq50Var, fq50 fq50Var, String str, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.c = jq50Var;
        this.d = fq50Var;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dq50 dq50Var = new dq50(this.c, this.d, this.e, this.f, v1bVar);
        dq50Var.b = obj;
        return dq50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((dq50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x0023, PHI: r11
      0x0042: PHI (r11v8 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:18:0x003f, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:17:0x002e, B:20:0x0042, B:11:0x001f), top: B:34:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0070 -> B:16:0x0028). Please report as a decompilation issue!!! */
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
            java.lang.Object r0 = r10.b
            v5b r0 = (defpackage.v5b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r10.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            goto L25
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r6
        L1b:
            defpackage.uj50.b(r11)
            goto L66
        L1f:
            defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L23
            goto L42
        L23:
            r11 = move-exception
            goto L47
        L25:
            defpackage.uj50.b(r11)
        L28:
            fq50 r11 = r10.d
            java.lang.String r2 = r10.e
            java.lang.String r7 = r10.f
            zi50$a r8 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L23
            k5b r8 = r11.c     // Catch: java.lang.Throwable -> L23
            dq50$a r9 = new dq50$a     // Catch: java.lang.Throwable -> L23
            r9.<init>(r11, r2, r7, r6)     // Catch: java.lang.Throwable -> L23
            r10.b = r0     // Catch: java.lang.Throwable -> L23
            r10.a = r5     // Catch: java.lang.Throwable -> L23
            java.lang.Object r11 = defpackage.ej5.d(r8, r9, r10)     // Catch: java.lang.Throwable -> L23
            if (r11 != r1) goto L42
            goto L72
        L42:
            to50 r11 = (defpackage.to50) r11     // Catch: java.lang.Throwable -> L23
            zi50$a r2 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L23
            goto L4f
        L47:
            zi50$a r2 = defpackage.zi50.b
            zi50$b r2 = new zi50$b
            r2.<init>(r11)
            r11 = r2
        L4f:
            boolean r2 = r11 instanceof zi50.b
            if (r2 == 0) goto L55
            r11 = r6
        L55:
            to50 r11 = (defpackage.to50) r11
            if (r11 == 0) goto L66
            r10.b = r0
            r10.a = r4
            jq50 r2 = r10.c
            java.lang.Object r11 = r2.invoke(r11, r10)
            if (r11 != r1) goto L66
            goto L72
        L66:
            r10.b = r0
            r10.a = r3
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r11 = defpackage.hkd.b(r7, r10)
            if (r11 != r1) goto L28
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
