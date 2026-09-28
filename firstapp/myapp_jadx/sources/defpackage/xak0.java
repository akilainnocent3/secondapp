package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxak0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xak0 extends j8i0 {
    public final ul a;
    public final wwd0 b;

    @c0d(c = "com.sportybet.android.account.zaaccount.register.ZASuccessfulRegistrationViewModel$1", f = "ZASuccessfulRegistrationViewModel.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: xak0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.account.zaaccount.register.ZASuccessfulRegistrationViewModel$1$desc$1", f = "ZASuccessfulRegistrationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1282a extends tje0 implements Function2<String, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1282a c1282a = new C1282a(2, v1bVar);
                c1282a.a = obj;
                return c1282a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, v1b<? super Boolean> v1bVar) {
                return ((C1282a) create(str, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(!StringsKt.U(str));
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xak0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (r8.a(r7) == r2) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                xak0 r0 = defpackage.xak0.this
                ul r1 = r0.a
                y5b r2 = defpackage.y5b.a
                int r3 = r7.a
                r4 = 0
                r5 = 1
                r6 = 2
                if (r3 == 0) goto L1f
                if (r3 == r5) goto L1b
                if (r3 != r6) goto L15
                defpackage.uj50.b(r8)
                goto L62
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r4
            L1b:
                defpackage.uj50.b(r8)
                goto L3d
            L1f:
                defpackage.uj50.b(r8)
                wm20 r8 = r1.a()
                lyh r8 = r8.c()
                f1i r3 = new f1i
                r3.<init>(r8)
                xak0$a$a r8 = new xak0$a$a
                r8.<init>(r6, r4)
                r7.a = r5
                java.lang.Object r8 = defpackage.s0i.b(r3, r8, r7)
                if (r8 != r2) goto L3d
                goto L61
            L3d:
                java.lang.String r8 = (java.lang.String) r8
                wwd0 r0 = r0.b
                java.lang.Object r3 = r0.getValue()
                wak0 r3 = (defpackage.wak0) r3
                r3.getClass()
                r8.getClass()
                wak0 r3 = new wak0
                r3.<init>(r8)
                r0.k(r4, r3)
                wm20 r8 = r1.a()
                r7.a = r6
                java.lang.Object r7 = r8.a(r7)
                if (r7 != r2) goto L62
            L61:
                return r2
            L62:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xak0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public xak0(ul ulVar) {
        ulVar.getClass();
        this.a = ulVar;
        this.b = xwd0.a(new wak0(0));
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
