package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.screenshot.LNScreenShotTool$captureContextOnlyComposable$1$1$1$1", f = "LNScreenShotTool.kt", l = {110, 114}, m = "invokeSuspend", v = 2)
public final class g9r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ b9r d;

    @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.screenshot.LNScreenShotTool$captureContextOnlyComposable$1$1$1$1$2", f = "LNScreenShotTool.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ b9r a;
        public final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b9r b9rVar, File file, v1b v1bVar) {
            super(2, v1bVar);
            this.a = b9rVar;
            this.b = file;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Boolean bool = Boolean.TRUE;
            String absolutePath = this.b.getAbsolutePath();
            absolutePath.getClass();
            this.a.invoke(bool, absolutePath);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.screenshot.LNScreenShotTool$captureContextOnlyComposable$1$1$1$1$3", f = "LNScreenShotTool.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ b9r a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b9r b9rVar, Exception exc, v1b v1bVar) {
            super(2, v1bVar);
            this.a = b9rVar;
            this.b = exc;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Boolean bool = Boolean.FALSE;
            String message = this.b.getMessage();
            if (message == null) {
                message = "檔案儲存失敗";
            }
            this.a.invoke(bool, message);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9r(String str, Bitmap bitmap, b9r b9rVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = bitmap;
        this.d = b9rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g9r(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g9r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (defpackage.ej5.d(r1, r6, r9) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (defpackage.ej5.d(r1, r4, r9) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            b9r r2 = r9.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L19
            if (r1 != r3) goto L13
            defpackage.uj50.b(r10)
            goto L6e
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r5
        L19:
            defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> L1d
            goto L6e
        L1d:
            r10 = move-exception
            goto L5c
        L1f:
            defpackage.uj50.b(r10)
            java.io.File r10 = new java.io.File     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = r9.b     // Catch: java.lang.Exception -> L1d
            r10.<init>(r1)     // Catch: java.lang.Exception -> L1d
            java.io.File r1 = r10.getParentFile()     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L32
            r1.mkdirs()     // Catch: java.lang.Exception -> L1d
        L32:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L1d
            r1.<init>(r10)     // Catch: java.lang.Exception -> L1d
            android.graphics.Bitmap r6 = r9.c     // Catch: java.lang.Exception -> L1d
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L55
            r8 = 95
            r6.compress(r7, r8, r1)     // Catch: java.lang.Throwable -> L55
            r1.close()     // Catch: java.lang.Exception -> L1d
            pfd r1 = defpackage.fse.a     // Catch: java.lang.Exception -> L1d
            wcl r1 = defpackage.gku.a     // Catch: java.lang.Exception -> L1d
            g9r$a r6 = new g9r$a     // Catch: java.lang.Exception -> L1d
            r6.<init>(r2, r10, r5)     // Catch: java.lang.Exception -> L1d
            r9.a = r4     // Catch: java.lang.Exception -> L1d
            java.lang.Object r9 = defpackage.ej5.d(r1, r6, r9)     // Catch: java.lang.Exception -> L1d
            if (r9 != r0) goto L6e
            goto L6d
        L55:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L57
        L57:
            r4 = move-exception
            defpackage.ft7.a(r1, r10)     // Catch: java.lang.Exception -> L1d
            throw r4     // Catch: java.lang.Exception -> L1d
        L5c:
            pfd r1 = defpackage.fse.a
            wcl r1 = defpackage.gku.a
            g9r$b r4 = new g9r$b
            r4.<init>(r2, r10, r5)
            r9.a = r3
            java.lang.Object r9 = defpackage.ej5.d(r1, r4, r9)
            if (r9 != r0) goto L6e
        L6d:
            return r0
        L6e:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
