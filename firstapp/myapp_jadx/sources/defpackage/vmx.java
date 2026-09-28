package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class vmx implements uih {
    public final String a;
    public final u2z b;
    public final ttr<hmx> c;
    public final mpe0 d;
    public final ttr<yr5> e;
    public final cva f;

    public static final class a implements uih.a<kmh0> {
        public final mpe0 a;
        public final mpe0 b;
        public final fv90<Context, cva> c;

        public a(Function0 function0) {
            tmx tmxVar = new tmx();
            umx umxVar = umx.a;
            this.a = hwr.b(function0);
            this.b = hwr.b(tmxVar);
            fv90<Context, cva> fv90Var = new fv90<>();
            fv90Var.a = umxVar;
            fv90Var.b = sbh0.a;
            this.c = fv90Var;
        }

        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            if (!Intrinsics.g(kmh0Var.c, "http") && !Intrinsics.g(kmh0Var.c, "https")) {
                return null;
            }
            String str = kmh0Var.a;
            mpe0 mpe0Var = this.a;
            mpe0 mpe0VarB = hwr.b(new j4t(a840Var, 1));
            mpe0 mpe0Var2 = this.b;
            fv90<Context, cva> fv90Var = this.c;
            Context context = u2zVar.a;
            Object obj2 = fv90Var.b;
            sbh0 sbh0Var = sbh0.a;
            if (obj2 == sbh0Var) {
                synchronized (fv90Var) {
                    obj2 = fv90Var.b;
                    if (obj2 == sbh0Var) {
                        Function1<? super Context, ? extends cva> function1 = fv90Var.a;
                        function1.getClass();
                        cva cvaVarInvoke = function1.invoke(context);
                        fv90Var.b = cvaVarInvoke;
                        fv90Var.a = null;
                        obj2 = cvaVarInvoke;
                    }
                }
            }
            return new vmx(str, u2zVar, mpe0Var, mpe0VarB, mpe0Var2, (cva) obj2);
        }
    }

    @c0d(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, HttpStatusCodesKt.HTTP_PROCESSING}, m = "fetch")
    public static final class b extends x1b {
        public dq40 a;
        public dq40 b;
        public /* synthetic */ Object c;
        public int e;

        public b(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return vmx.this.a(this);
        }
    }

    @c0d(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {104}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<iox, v1b<? super aqa0>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = vmx.this.new c(v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iox ioxVar, v1b<? super aqa0> v1bVar) {
            return ((c) create(ioxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            iox ioxVar = (iox) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            vmx vmxVar = vmx.this;
            if (i == 0) {
                uj50.b(obj);
                iqa0 iqa0Var = ioxVar.e;
                if (iqa0Var == null) {
                    ib5.a("body == null");
                    return null;
                }
                this.b = ioxVar;
                this.a = 1;
                obj = vmxVar.g(iqa0Var, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return new aqa0((nbn) obj, vmx.d(vmxVar.a, ioxVar.d.a()), bqc.d);
        }
    }

    @c0d(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class d extends tje0 implements Function2<iox, v1b<? super aqa0>, Object> {
        public dq40 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ dq40<ere.c> d;
        public final /* synthetic */ vmx e;
        public final /* synthetic */ dq40<iox> f;
        public final /* synthetic */ wnx i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(dq40<ere.c> dq40Var, vmx vmxVar, dq40<iox> dq40Var2, wnx wnxVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.d = dq40Var;
            this.e = vmxVar;
            this.f = dq40Var2;
            this.i = wnxVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.d, this.e, this.f, this.i, v1bVar);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iox ioxVar, v1b<? super aqa0> v1bVar) {
            return ((d) create(ioxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        
            if (r13 == r7) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v5, types: [T, iox] */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
            /*
                r12 = this;
                vmx r0 = r12.e
                java.lang.String r6 = r0.a
                java.lang.Object r1 = r12.c
                r4 = r1
                iox r4 = (defpackage.iox) r4
                y5b r7 = defpackage.y5b.a
                int r1 = r12.b
                r8 = 2
                r2 = 1
                r9 = 0
                dq40<iox> r10 = r12.f
                dq40<ere$c> r11 = r12.d
                if (r1 == 0) goto L2c
                if (r1 == r2) goto L25
                if (r1 != r8) goto L1f
                defpackage.uj50.b(r13)
                goto L8e
            L1f:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r9
            L25:
                dq40 r1 = r12.a
                defpackage.uj50.b(r13)
                r5 = r12
                goto L4a
            L2c:
                defpackage.uj50.b(r13)
                T r13 = r11.a
                r1 = r13
                ere$c r1 = (ere.c) r1
                T r13 = r10.a
                iox r13 = (defpackage.iox) r13
                r12.c = r4
                r12.a = r11
                r12.b = r2
                wnx r3 = r12.i
                r5 = r12
                r2 = r13
                java.lang.Object r13 = r0.i(r1, r2, r3, r4, r5)
                if (r13 != r7) goto L49
                goto L8d
            L49:
                r1 = r11
            L4a:
                r1.a = r13
                T r12 = r11.a
                if (r12 == 0) goto L7d
                ere$c r12 = (ere.c) r12
                iox r12 = r0.h(r12)
                r10.a = r12
                aqa0 r12 = new aqa0
                T r13 = r11.a
                r13.getClass()
                ere$c r13 = (ere.c) r13
                dkh r13 = r0.f(r13)
                T r0 = r10.a
                iox r0 = (defpackage.iox) r0
                if (r0 == 0) goto L73
                anx r0 = r0.d
                if (r0 == 0) goto L73
                java.lang.String r9 = r0.a()
            L73:
                java.lang.String r0 = defpackage.vmx.d(r6, r9)
                bqc r1 = defpackage.bqc.d
                r12.<init>(r13, r0, r1)
                return r12
            L7d:
                iqa0 r12 = r4.e
                if (r12 == 0) goto Lb3
                r5.c = r4
                r5.a = r9
                r5.b = r8
                java.lang.Object r13 = defpackage.ssh0.a(r12, r5)
                if (r13 != r7) goto L8e
            L8d:
                return r7
            L8e:
                lb5 r13 = (defpackage.lb5) r13
                long r1 = r13.b
                r7 = 0
                int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r12 <= 0) goto Lb2
                aqa0 r12 = new aqa0
                blh r0 = r0.c()
                dqa0 r13 = defpackage.obn.b(r13, r0)
                anx r0 = r4.d
                java.lang.String r0 = r0.a()
                java.lang.String r0 = defpackage.vmx.d(r6, r0)
                bqc r1 = defpackage.bqc.d
                r12.<init>(r13, r0, r1)
                return r12
            Lb2:
                return r9
            Lb3:
                java.lang.String r12 = "body == null"
                defpackage.ib5.a(r12)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: vmx.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public vmx(String str, u2z u2zVar, mpe0 mpe0Var, mpe0 mpe0Var2, mpe0 mpe0Var3, cva cvaVar) {
        this.a = str;
        this.b = u2zVar;
        this.c = mpe0Var;
        this.d = mpe0Var2;
        this.e = mpe0Var3;
        this.f = cvaVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String d(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || kotlin.text.c.u(str2, "text/plain", false)) {
            if (StringsKt.U(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strQ0 = StringsKt.q0('?', StringsKt.q0('#', str));
                String strL0 = StringsKt.l0('.', StringsKt.l0('/', strQ0, strQ0), "");
                if (StringsKt.U(strL0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strL0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) hqv.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return StringsKt.n0(';', str2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0129 A[Catch: Exception -> 0x003f, PHI: r0 r1
      0x0129: PHI (r0v24 java.lang.Object) = (r0v17 java.lang.Object), (r0v2 java.lang.Object) binds: [B:61:0x0126, B:22:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r1v10 dq40) = (r1v8 dq40), (r1v16 dq40) binds: [B:61:0x0126, B:22:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x003f, blocks: (B:15:0x003a, B:68:0x0143, B:22:0x004e, B:63:0x0129, B:65:0x012d, B:54:0x00ed, B:56:0x00f3, B:60:0x0112, B:39:0x0086, B:41:0x008f, B:48:0x00c2, B:50:0x00ce, B:44:0x00a4, B:46:0x00ae), top: B:80:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012d A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:15:0x003a, B:68:0x0143, B:22:0x004e, B:63:0x0129, B:65:0x012d, B:54:0x00ed, B:56:0x00f3, B:60:0x0112, B:39:0x0086, B:41:0x008f, B:48:0x00c2, B:50:0x00ce, B:44:0x00a4, B:46:0x00ae), top: B:80:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        if (r0 == r7) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, iox] */
    @Override // defpackage.uih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v1b<? super defpackage.sih> r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmx.a(v1b):java.lang.Object");
    }

    public final Object b(wnx wnxVar, Function2 function2, b bVar) {
        if (this.b.i.a && Intrinsics.g(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        return this.c.getValue().a(wnxVar, new wmx(function2, null), bVar);
    }

    public final blh c() {
        blh fileSystem;
        ere ereVar = (ere) this.d.getValue();
        return (ereVar == null || (fileSystem = ereVar.getFileSystem()) == null) ? this.b.f : fileSystem;
    }

    public final wnx e() {
        p4h.b<anx> bVar = tan.b;
        u2z u2zVar = this.b;
        anx anxVar = (anx) q4h.b(u2zVar, bVar);
        anxVar.getClass();
        anx.a aVar = new anx.a(anxVar);
        wr5 wr5Var = u2zVar.h;
        boolean z = wr5Var.a;
        boolean z2 = u2zVar.i.a && this.f.a();
        if (!z2 && z) {
            aVar.b("only-if-cached, max-stale=2147483647");
        } else if (!z2 || z) {
            if (!z2 && !z) {
                aVar.b("no-cache, only-if-cached");
            }
        } else if (wr5Var.b) {
            aVar.b("no-cache");
        } else {
            aVar.b("no-cache, no-store");
        }
        return new wnx(this.a, (String) q4h.b(u2zVar, tan.a), new anx(kpu.l(aVar.a)), (xnx) q4h.b(u2zVar, tan.c), u2zVar.j);
    }

    public final dkh f(ere.c cVar) {
        cxz cxzVarK = cVar.k();
        blh blhVarC = c();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return obn.a(cxzVarK, blhVarC, str, cVar, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(iqa0 iqa0Var, x1b x1bVar) {
        xmx xmxVar;
        lb5 lb5Var;
        if (x1bVar instanceof xmx) {
            xmxVar = (xmx) x1bVar;
            int i = xmxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmxVar.d = i - Integer.MIN_VALUE;
            } else {
                xmxVar = new xmx(this, x1bVar);
            }
        } else {
            xmxVar = new xmx(this, x1bVar);
        }
        Object obj = xmxVar.b;
        y5b y5bVar = y5b.a;
        int i2 = xmxVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            lb5 lb5Var2 = new lb5();
            xmxVar.a = lb5Var2;
            xmxVar.d = 1;
            if (iqa0Var.d(lb5Var2) == y5bVar) {
                return y5bVar;
            }
            lb5Var = lb5Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lb5Var = xmxVar.a;
            uj50.b(obj);
        }
        return obn.b(lb5Var, c());
    }

    public final iox h(ere.c cVar) throws Throwable {
        Throwable th;
        iox ioxVarA;
        try {
            y740 y740VarB = z7b.b(c().source(cVar.p()));
            try {
                ioxVarA = vr5.a(y740VarB);
                try {
                    y740VarB.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    y740VarB.close();
                } catch (Throwable th4) {
                    rtg.a(th3, th4);
                }
                th = th3;
                ioxVarA = null;
            }
            if (th == null) {
                return ioxVarA;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ff, code lost:
    
        if (kotlin.Unit.a == r0) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(ere.c r7, defpackage.iox r8, defpackage.wnx r9, defpackage.iox r10, defpackage.x1b r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmx.i(ere$c, iox, wnx, iox, x1b):java.lang.Object");
    }
}
