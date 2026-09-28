package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.emoji2.text.h;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sd$a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r4;
        int i = this.a;
        Application application = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = sd.g;
                Method method = sd.f;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i2 != 26 && i2 != 27) || method != null) && (sd.e != null || sd.d != null)) {
                    try {
                        Object obj3 = sd.c.get(activity);
                        if (obj3 != null && (obj = sd.b.get(activity)) != null) {
                            application = activity.getApplication();
                            sd.a aVar = new sd.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar);
                            handler.post(new pd(aVar, obj3));
                            aVar = (i2 == 26 || i2 == 27) ? 1 : 0;
                            try {
                                if (aVar != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application = application;
                                        r4 = aVar;
                                        handler.post(new qd(application, r4));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new qd(application, aVar));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = aVar;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            default:
                g.b bVar = (g.b) obj2;
                synchronized (bVar.c) {
                    try {
                        if (bVar.g == null) {
                            return;
                        }
                        try {
                            v9i.b bVarC = bVar.c();
                            int i3 = bVarC.e;
                            if (i3 == 2) {
                                synchronized (bVar.c) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                Method method2 = vig0.b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = bVar.a;
                                v9i.b[] bVarArr = {bVarC};
                                q9h0 q9h0Var = j9h0.a;
                                Trace.beginSection(sig0.d("TypefaceCompat.createFromFontInfo"));
                                try {
                                    Typeface typefaceB = j9h0.a.b(context, bVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferD = r9h0.d(bVar.a, bVarC.a);
                                    if (mappedByteBufferD == null || typefaceB == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        h hVar = new h(typefaceB, co3.a(mappedByteBufferD));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (bVar.c) {
                                            try {
                                                d.i iVar = bVar.g;
                                                if (iVar != null) {
                                                    iVar.b(hVar);
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                            break;
                                        }
                                        bVar.b();
                                        return;
                                    } catch (Throwable th4) {
                                        Method method3 = vig0.b;
                                        Trace.endSection();
                                        throw th4;
                                    }
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                Method method4 = vig0.b;
                                Trace.endSection();
                                throw th6;
                            }
                            break;
                        } catch (Throwable th7) {
                            synchronized (bVar.c) {
                                try {
                                    d.i iVar2 = bVar.g;
                                    if (iVar2 != null) {
                                        iVar2.a(th7);
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        throw th9;
                    }
                }
        }
    }
}
