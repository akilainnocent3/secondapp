package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.captcha.CaptchaProvider;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pt7.a;

/* JADX INFO: loaded from: classes5.dex */
public final class pt7 implements jd6 {
    public final m2l a;
    public final k5b b;
    public final int c;

    @c0d(c = "com.sporty.android.platform.features.captcha.data.repository.CloudflareCaptchaRepoImpl$action$1$1", f = "CloudflareCaptchaRepoImpl.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 77}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ au90.a d;

        /* JADX INFO: renamed from: pt7$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.captcha.data.repository.CloudflareCaptchaRepoImpl$action$1$1$1", f = "CloudflareCaptchaRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0983a extends tje0 implements gaj<String, String, v1b<? super String>, Object> {
            public /* synthetic */ String a;
            public /* synthetic */ String b;
            public final /* synthetic */ au90.a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0983a(au90.a aVar, v1b v1bVar) {
                super(3, v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(String str, String str2, v1b<? super String> v1bVar) {
                C0983a c0983a = new C0983a(this.c, v1bVar);
                c0983a.a = str;
                c0983a.b = str2;
                return c0983a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = this.a;
                String str2 = this.b;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                int length = str.length();
                au90.a aVar = this.c;
                if (length > 0 && !str.equals("CAPTCHA_CLIENT_ERROR_TOKEN")) {
                    qt7 qt7Var = qt7.a;
                    if (Intrinsics.g(str2, "Success")) {
                        iu90.a(aVar, str);
                        return str;
                    }
                }
                if (!str.equals("CAPTCHA_CLIENT_ERROR_TOKEN")) {
                    qt7 qt7Var2 = qt7.a;
                    if (!Intrinsics.g(str2, "Failure")) {
                        return "";
                    }
                }
                iu90.a(aVar, "CAPTCHA_CLIENT_ERROR_TOKEN");
                return "CAPTCHA_CLIENT_ERROR_TOKEN";
            }
        }

        @c0d(c = "com.sporty.android.platform.features.captcha.data.repository.CloudflareCaptchaRepoImpl$action$1$1$2", f = "CloudflareCaptchaRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements gaj<myh<? super String>, Throwable, v1b<? super Unit>, Object> {
            public /* synthetic */ Throwable a;
            public final /* synthetic */ au90.a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(au90.a aVar, v1b v1bVar) {
                super(3, v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super String> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
                b bVar = new b(this.b, v1bVar);
                bVar.a = th;
                return bVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Throwable th = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                boolean z = th instanceof txf0;
                au90.a aVar = this.b;
                if (z) {
                    iu90.a(aVar, "CAPTCHA_CLIENT_ERROR_TOKEN");
                } else {
                    iu90.b(aVar, new CaptchaError.CaptchaNeedRetry(null, 1, null));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, au90.a aVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return pt7.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
        
            if (defpackage.kzh.a(r2, r9) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                pt7 r0 = defpackage.pt7.this
                m2l r0 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r9.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r10)
                goto L76
            L15:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r3
            L1b:
                defpackage.uj50.b(r10)
                goto L31
            L1f:
                defpackage.uj50.b(r10)
                r9.a = r5
                zed r10 = r0.a
                java.lang.String r2 = "cloudflare_siteKey"
                java.lang.String r5 = r9.c
                java.lang.Object r10 = r10.putString(r2, r5, r9)
                if (r10 != r1) goto L31
                goto L75
            L31:
                java.lang.String r10 = "cloudflare_result_token"
                java.lang.String r2 = ""
                lyh r10 = r0.getStringByFlow(r10, r2)
                qt7 r2 = defpackage.qt7.a
                java.lang.String r2 = "Started"
                java.lang.String r5 = "cloudflare_loading_state"
                lyh r0 = r0.getStringByFlow(r5, r2)
                pt7$a$a r2 = new pt7$a$a
                au90$a r5 = r9.d
                r2.<init>(r5, r3)
                n1i r6 = new n1i
                r6.<init>(r10, r0, r2)
                kotlin.time.b$a r10 = kotlin.time.b.b
                r10 = 7000(0x1b58, float:9.809E-42)
                rgf r0 = defpackage.rgf.MILLISECONDS
                long r7 = kotlin.time.c.h(r10, r0)
                rzh r10 = new rzh
                r10.<init>(r7, r3, r6)
                oyh r0 = new oyh
                r0.<init>(r10)
                pt7$a$b r10 = new pt7$a$b
                r10.<init>(r5, r3)
                yzh r2 = new yzh
                r2.<init>(r0, r10)
                r9.a = r4
                java.lang.Object r9 = defpackage.kzh.a(r2, r9)
                if (r9 != r1) goto L76
            L75:
                return r1
            L76:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pt7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public pt7(m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        m2lVar.getClass();
        this.a = m2lVar;
        this.b = k5bVar;
        this.c = CaptchaProvider.Cloudflare.getId();
    }

    @Override // defpackage.jd6
    public final ct90<String> b(final String str, j6c j6cVar) {
        j6cVar.getClass();
        final dq40 dq40Var = new dq40();
        return new cu90(new au90(new bv90() { // from class: nt7
            /* JADX WARN: Type inference failed for: r6v2, types: [T, jvd0] */
            @Override // defpackage.bv90
            public final void a(au90.a aVar) {
                pt7 pt7Var = this;
                dq40Var.a = ej5.c(w5b.a(pt7Var.b), null, null, pt7Var.new a(str, aVar, null), 3);
            }
        }).d(wm70.c), new ib() { // from class: ot7
            @Override // defpackage.ib
            public final void run() {
                c9p c9pVar = (c9p) dq40Var.a;
                if (c9pVar != null) {
                    c9pVar.cancel((CancellationException) null);
                }
            }
        });
    }

    @Override // defpackage.jd6
    public final ct90<Boolean> c(String str) {
        return new qu90(Boolean.TRUE);
    }

    @Override // defpackage.jd6
    public final int d() {
        return this.c;
    }
}
