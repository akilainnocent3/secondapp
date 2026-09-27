package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import z.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f130706a = true;

    private static void a() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs libs does not exist.");
        f130706a = false;
    }

    public static void a(final Context context) {
        a(context, "", null, "warmup", new Runnable() { // from class: sg.bigo.ads.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVarA = b.a();
                Context context2 = context;
                if (context2 != null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs warming up.");
                    bVarA.a(context2.getApplicationContext());
                }
            }
        });
    }

    public static void a(final Context context, final String str, final int i10, final int i11, final boolean z10, final Bitmap bitmap, final a.c cVar, final a.b bVar) {
        a(context, str, bVar, "open", new Runnable() { // from class: sg.bigo.ads.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri;
                final b bVarA = b.a();
                Context context2 = context;
                final String str2 = str;
                int i12 = i10;
                int i13 = i11;
                boolean z11 = z10;
                Bitmap bitmap2 = bitmap;
                final a.c cVar2 = cVar;
                final a.b bVar2 = bVar;
                if (!TextUtils.isEmpty(str2)) {
                    bVarA.f130689b.remove(str2);
                }
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Start load url: " + str2 + " with chrome tab current thread: " + Thread.currentThread().getName() + fe.F);
                try {
                    uri = Uri.parse(str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Stop open chrome tab with error url.");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                bVarA.a(context2);
                bVarA.f130688a.f130676d = new z.c() { // from class: sg.bigo.ads.a.b.1
                    @Override // z.c
                    public final void onNavigationEvent(int i14, Bundle bundle) {
                        super.onNavigationEvent(i14, bundle);
                        if (cVar2 == null) {
                            return;
                        }
                        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Receive custom tab event: " + b.a(i14));
                        if (i14 == 5) {
                            cVar2.a();
                            return;
                        }
                        if (i14 == 1) {
                            cVar2.b();
                            return;
                        }
                        if (i14 == 3) {
                            cVar2.d();
                            return;
                        }
                        if (i14 == 4) {
                            cVar2.c();
                            return;
                        }
                        if (i14 == 2) {
                            cVar2.e();
                        } else if (i14 == 6) {
                            cVar2.f();
                            b.this.f130688a.f130676d = null;
                        }
                    }
                };
                f.i iVar = new f.i(bVarA.f130688a.a());
                if (i12 != 0) {
                    iVar.Q(i12);
                }
                if (i13 != 0) {
                    iVar.F(i13);
                }
                if (bitmap2 != null) {
                    iVar.o(bitmap2);
                }
                iVar.O(z11);
                f fVarD = iVar.d();
                try {
                    Context contextB = sg.bigo.ads.common.f.b.b();
                    if (contextB == null) {
                        contextB = context2;
                    }
                    sg.bigo.ads.a.a.a.b bVar3 = new sg.bigo.ads.a.a.a.b() { // from class: sg.bigo.ads.a.b.2
                        @Override // sg.bigo.ads.a.a.a.b
                        public final void a(Context context3, sg.bigo.ads.a.a.b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 != null) {
                                bVar4.a(context3, str2, 2, aVar == null ? "" : aVar.f130682b);
                            }
                        }

                        @Override // sg.bigo.ads.a.a.a.b
                        public final void a(sg.bigo.ads.a.a.b.a aVar) {
                            a.b bVar4 = bVar2;
                            if (bVar4 == null || aVar == null) {
                                return;
                            }
                            bVar4.a(aVar.f130685e, aVar.f130684d, aVar.f130683c);
                        }
                    };
                    sg.bigo.ads.a.a.b.a aVarA = sg.bigo.ads.a.a.b.a(contextB);
                    if (aVarA == null || !aVarA.f130681a) {
                        bVar3.a(contextB, aVarA);
                    } else {
                        fVarD.f160159a.setPackage(aVarA.f130685e);
                        fVarD.t(contextB, uri);
                        bVar3.a(aVarA);
                    }
                } catch (Exception e10) {
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 4, e10.toString());
                    }
                    bVarA.f130688a.f130676d = null;
                }
            }
        });
    }

    public static void a(final Context context, final String str, final a.b bVar) {
        a(context, str, bVar, "preload", new Runnable() { // from class: sg.bigo.ads.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVarA = b.a();
                Context context2 = context;
                String str2 = str;
                a.b bVar2 = bVar;
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Start preload url: " + str2 + " with chrome tab current thread: " + Thread.currentThread().getName() + fe.F);
                if (context2 == null) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Preload: empty context!");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid context");
                        return;
                    }
                    return;
                }
                Context applicationContext = context2.getApplicationContext();
                if (TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.common.t.a.a(0, "ChromeTabsStatic", "Preload: empty url!");
                    if (bVar2 != null) {
                        bVar2.a(applicationContext, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                bVarA.f130689b.add(str2);
                if (bVarA.a(applicationContext)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Meet the conditions for connection of Chrome service.");
                    bVarA.b();
                    if (bVar2 != null) {
                        bVar2.a("", "0", "");
                        return;
                    }
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to make connection of Chrome service.");
                bVarA.f130689b.remove(str2);
                if (bVar2 != null) {
                    bVar2.a(applicationContext, str2, 2, "Failed to make connection of Chrome service.");
                }
            }
        });
    }

    private static void a(@Nullable Context context, String str, @Nullable a.b bVar, String str2, Runnable runnable) {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "start ".concat(String.valueOf(str2)));
        if (!f130706a) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to " + str2 + " with not exists chrome tab libs");
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, "NoClassDefFoundError");
            return;
        }
        try {
            runnable.run();
        } catch (NoClassDefFoundError e10) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to " + str2 + " with not exists chrome tab libs");
            a();
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, e10.toString());
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Failed to " + str2 + " with unknown reason: " + th2.toString());
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 4, th2.toString());
        }
    }
}
