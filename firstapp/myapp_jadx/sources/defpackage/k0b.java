package defpackage;

import android.content.Context;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class k0b extends WebViewClient {
    public final String a;
    public final Function1<String, Unit> b;
    public final WeakReference<Context> c;

    /* JADX WARN: Multi-variable type inference failed */
    public k0b(Context context, String str, Function1<? super String, Unit> function1) {
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = function1;
        this.c = new WeakReference<>(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.g(r8, kotlin.text.StringsKt.v0(r4 != null ? r4 : "", '/')) != false) goto L36;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, android.webkit.WebResourceRequest r8) {
        /*
            r6 = this;
            r7 = 0
            if (r8 == 0) goto L9c
            android.net.Uri r0 = r8.getUrl()
            if (r0 == 0) goto L9c
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L11
            goto L9c
        L11:
            boolean r1 = r8.isRedirect()
            if (r1 == 0) goto L19
            goto L9c
        L19:
            boolean r8 = r8.isForMainFrame()
            if (r8 == 0) goto L9c
            boolean r8 = kotlin.text.StringsKt.U(r0)
            if (r8 == 0) goto L27
            goto L9c
        L27:
            java.lang.String r8 = defpackage.l0b.c(r0)
            java.lang.String r1 = r6.a
            java.lang.String r2 = defpackage.l0b.c(r1)
            boolean r8 = r8.equals(r2)
            r2 = 1
            if (r8 == 0) goto L6a
            android.net.Uri r8 = android.net.Uri.parse(r0)
            java.lang.String r8 = r8.getPath()
            java.lang.String r3 = ""
            if (r8 != 0) goto L45
            r8 = r3
        L45:
            char[] r4 = new char[r2]
            r5 = 47
            r4[r7] = r5
            java.lang.String r8 = kotlin.text.StringsKt.v0(r8, r4)
            android.net.Uri r4 = android.net.Uri.parse(r1)
            java.lang.String r4 = r4.getPath()
            if (r4 != 0) goto L5a
            goto L5b
        L5a:
            r3 = r4
        L5b:
            char[] r4 = new char[r2]
            r4[r7] = r5
            java.lang.String r3 = kotlin.text.StringsKt.v0(r3, r4)
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r8, r3)
            if (r8 == 0) goto L6a
            goto L9c
        L6a:
            java.lang.String r7 = defpackage.l0b.c(r0)
            java.lang.String r8 = defpackage.l0b.c(r1)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L96
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r7.<init>(r8, r0)
            r8 = 268435456(0x10000000, float:2.524355E-29)
            r7.setFlags(r8)
            java.lang.ref.WeakReference<android.content.Context> r6 = r6.c
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto L9b
            r6.startActivity(r7)
            goto L9b
        L96:
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r6 = r6.b
            r6.invoke(r0)
        L9b:
            return r2
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0b.shouldOverrideUrlLoading(android.webkit.WebView, android.webkit.WebResourceRequest):boolean");
    }
}
