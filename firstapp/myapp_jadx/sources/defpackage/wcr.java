package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffDialogKt$LNShowOffDialog$2$1", f = "LNShowOffDialog.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING, 478, 129}, m = "invokeSuspend", v = 2)
public final class wcr extends tje0 implements gaj<v5b, cdr, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ cdr b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ ms7 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ yha0 f;
    public final /* synthetic */ Function1<jdr, Unit> i;

    public static final class a implements ee00 {
        public final /* synthetic */ bc6 a;

        public a(bc6 bc6Var) {
            this.a = bc6Var;
        }

        @Override // defpackage.ee00
        public final void onDenied() {
            zi50.a aVar = zi50.b;
            this.a.resumeWith(Boolean.FALSE);
        }

        @Override // defpackage.ee00
        public final void onGranted() {
            zi50.a aVar = zi50.b;
            this.a.resumeWith(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wcr(Function0<Unit> function0, ms7 ms7Var, Context context, yha0 yha0Var, Function1<? super jdr, Unit> function1, v1b<? super wcr> v1bVar) {
        super(3, v1bVar);
        this.c = function0;
        this.d = ms7Var;
        this.e = context;
        this.f = yha0Var;
        this.i = function1;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, cdr cdrVar, v1b<? super Unit> v1bVar) {
        yha0 yha0Var = this.f;
        Function1<jdr, Unit> function1 = this.i;
        wcr wcrVar = new wcr(this.c, this.d, this.e, yha0Var, function1, v1bVar);
        wcrVar.b = cdrVar;
        return wcrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (defpackage.bdr.f((cdr.b) r0, r11.c, r11.d, r11.e, r11.f, r11) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r0 == r6) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
