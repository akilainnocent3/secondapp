package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.window.layout.oKr.TEFcJcMqR;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class jel0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ lel0 e;

    public jel0(lel0 lel0Var, boolean z, Uri uri, String str, String str2) {
        this.a = z;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = lel0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: RuntimeException -> 0x0084, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[Catch: RuntimeException -> 0x0084, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: RuntimeException -> 0x0084, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106 A[Catch: RuntimeException -> 0x0084, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010d A[Catch: RuntimeException -> 0x0084, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0128 A[Catch: RuntimeException -> 0x0084, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012e A[Catch: RuntimeException -> 0x0084, TryCatch #0 {RuntimeException -> 0x0084, blocks: (B:3:0x0013, B:35:0x00a4, B:37:0x00af, B:40:0x00bc, B:42:0x00c2, B:44:0x00dc, B:46:0x00e5, B:49:0x00ed, B:52:0x0106, B:54:0x0115, B:53:0x010d, B:56:0x0128, B:58:0x012e, B:60:0x0134, B:62:0x013a, B:64:0x0140, B:66:0x0148, B:68:0x0150, B:70:0x0156, B:72:0x0168, B:8:0x0035, B:10:0x003b, B:12:0x0045, B:14:0x004b, B:16:0x0051, B:18:0x0057, B:20:0x005f, B:22:0x0067, B:24:0x006f, B:26:0x0077, B:30:0x0089, B:32:0x0097), top: B:76:0x0013 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        y4l0 y4l0Var;
        Bundle bundleG0;
        boolean z;
        String str;
        y4l0 y4l0Var2;
        u4l0 u4l0Var;
        Bundle bundleG1;
        nfl0 nfl0Var = this.e.a;
        k8l0 k8l0Var = nfl0Var.a;
        nfl0Var.g();
        utl0 utl0Var = nfl0Var.r;
        String str2 = this.d;
        Uri uri = this.b;
        try {
            yol0 yol0Var = k8l0Var.i;
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.k(yol0Var);
            String str3 = TEFcJcMqR.SUObEfPB;
            String str4 = "Activity created with data 'referrer' without required params";
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid")) {
                    y4l0Var = y4l0Var3;
                    if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                        y4l0 y4l0Var4 = yol0Var.a.f;
                        k8l0.m(y4l0Var4);
                        y4l0Var4.m.a("Activity created with data 'referrer' without required params");
                    }
                    z = this.a;
                    str = this.c;
                    if (z) {
                        yol0 yol0Var2 = k8l0Var.i;
                        k8l0.k(yol0Var2);
                        bundleG1 = yol0Var2.g0(uri);
                        if (bundleG1 != null) {
                            bundleG1.putString("_cis", "intent");
                            if (bundleG1.containsKey("gclid") && bundleG0 != null && bundleG0.containsKey("gclid")) {
                                bundleG1.putString("_cer", "gclid=" + bundleG0.getString("gclid"));
                            }
                            nfl0Var.n(str, "_cmp", bundleG1);
                            utl0Var.a(str, bundleG1);
                        } else {
                            str4 = "Activity created with data 'referrer' without required params";
                        }
                    } else {
                        str4 = "Activity created with data 'referrer' without required params";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    k8l0.m(y4l0Var);
                    y4l0Var2 = y4l0Var;
                    u4l0Var = y4l0Var2.m;
                    u4l0Var.b(str2, "Activity created with referrer");
                    if (k8l0Var.d.q(null, v2l0.G0)) {
                        if (bundleG0 != null) {
                            nfl0Var.n(str, "_cmp", bundleG0);
                            utl0Var.a(str, bundleG0);
                        } else {
                            k8l0.m(y4l0Var2);
                            u4l0Var.b(str2, "Referrer does not contain valid parameters");
                        }
                        k8l0Var.k.getClass();
                        nfl0Var.q(StompClient.DEFAULT_ACK, "_ldl", null, true, System.currentTimeMillis());
                    }
                    if (str2.contains("gclid") || !(str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a(str4);
                        return;
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        k8l0Var.k.getClass();
                        nfl0Var.q(StompClient.DEFAULT_ACK, "_ldl", str2, true, System.currentTimeMillis());
                        return;
                    }
                }
                y4l0Var = y4l0Var3;
                bundleG0 = yol0Var.g0(Uri.parse(str3.concat(str2)));
                if (bundleG0 != null) {
                    bundleG0.putString("_cis", "referrer");
                }
                z = this.a;
                str = this.c;
                if (z) {
                    yol0 yol0Var3 = k8l0Var.i;
                    k8l0.k(yol0Var3);
                    bundleG1 = yol0Var3.g0(uri);
                    if (bundleG1 != null) {
                        bundleG1.putString("_cis", "intent");
                        if (bundleG1.containsKey("gclid")) {
                        }
                        nfl0Var.n(str, "_cmp", bundleG1);
                        utl0Var.a(str, bundleG1);
                    } else {
                        str4 = "Activity created with data 'referrer' without required params";
                    }
                } else {
                    str4 = "Activity created with data 'referrer' without required params";
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                k8l0.m(y4l0Var);
                y4l0Var2 = y4l0Var;
                u4l0Var = y4l0Var2.m;
                u4l0Var.b(str2, "Activity created with referrer");
                if (k8l0Var.d.q(null, v2l0.G0)) {
                    if (str2.contains("gclid")) {
                    }
                    k8l0.m(y4l0Var2);
                    u4l0Var.a(str4);
                    return;
                }
                if (bundleG0 != null) {
                    nfl0Var.n(str, "_cmp", bundleG0);
                    utl0Var.a(str, bundleG0);
                } else {
                    k8l0.m(y4l0Var2);
                    u4l0Var.b(str2, "Referrer does not contain valid parameters");
                }
                k8l0Var.k.getClass();
                nfl0Var.q(StompClient.DEFAULT_ACK, "_ldl", null, true, System.currentTimeMillis());
            }
            y4l0Var = y4l0Var3;
            bundleG0 = null;
            z = this.a;
            str = this.c;
            if (z) {
                yol0 yol0Var4 = k8l0Var.i;
                k8l0.k(yol0Var4);
                bundleG1 = yol0Var4.g0(uri);
                if (bundleG1 != null) {
                    bundleG1.putString("_cis", "intent");
                    if (bundleG1.containsKey("gclid")) {
                    }
                    nfl0Var.n(str, "_cmp", bundleG1);
                    utl0Var.a(str, bundleG1);
                } else {
                    str4 = "Activity created with data 'referrer' without required params";
                }
            } else {
                str4 = "Activity created with data 'referrer' without required params";
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            k8l0.m(y4l0Var);
            y4l0Var2 = y4l0Var;
            u4l0Var = y4l0Var2.m;
            u4l0Var.b(str2, "Activity created with referrer");
            if (k8l0Var.d.q(null, v2l0.G0)) {
                if (str2.contains("gclid")) {
                }
                k8l0.m(y4l0Var2);
                u4l0Var.a(str4);
                return;
            }
            if (bundleG0 != null) {
                nfl0Var.n(str, "_cmp", bundleG0);
                utl0Var.a(str, bundleG0);
            } else {
                k8l0.m(y4l0Var2);
                u4l0Var.b(str2, "Referrer does not contain valid parameters");
            }
            k8l0Var.k.getClass();
            nfl0Var.q(StompClient.DEFAULT_ACK, "_ldl", null, true, System.currentTimeMillis());
        } catch (RuntimeException e) {
            y4l0 y4l0Var5 = nfl0Var.a.f;
            k8l0.m(y4l0Var5);
            y4l0Var5.f.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
        }
    }
}
