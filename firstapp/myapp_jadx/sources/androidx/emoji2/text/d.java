package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import com.google.protobuf.Reader;
import defpackage.cpv;
import defpackage.hb5;
import defpackage.j1g;
import defpackage.km20;
import defpackage.ngh0;
import defpackage.tx0;
import defpackage.xra0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Object j = new Object();
    public static volatile d k;
    public final ReentrantReadWriteLock a;
    public final tx0 b;
    public volatile int c;
    public final Handler d;
    public final a e;
    public final h f;
    public final C0057d g;
    public final int h;
    public final androidx.emoji2.text.b i;

    public static final class a extends b {
        public volatile androidx.emoji2.text.f b;
        public volatile androidx.emoji2.text.h c;
    }

    public static class b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }
    }

    public static abstract class c {
        public final h a;
        public int b = 0;
        public final androidx.emoji2.text.b c = new androidx.emoji2.text.b();

        public c(h hVar) {
            this.a = hVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public static class C0057d implements j {
    }

    public interface e {
    }

    public static class g implements Runnable {
        public final ArrayList a;
        public final int b;

        public g(List list, int i, Throwable th) {
            km20.f(list, "initCallbacks cannot be null");
            this.a = new ArrayList(list);
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            if (this.b != 1) {
                while (i < size) {
                    ((f) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) arrayList.get(i)).b();
                    i++;
                }
            }
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    public interface j {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        h hVar = aVar.a;
        this.f = hVar;
        int i2 = aVar.b;
        this.h = i2;
        this.i = aVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new tx0(0);
        this.g = new C0057d();
        a aVar2 = new a(this);
        this.e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                hVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (j) {
            dVar = k;
            km20.g("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", dVar != null);
        }
        return dVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i2, CharSequence charSequence) {
        km20.g("Not initialized yet", c() == 1);
        km20.f(charSequence, "charSequence cannot be null");
        androidx.emoji2.text.f fVar = this.e.b;
        fVar.getClass();
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            j1g[] j1gVarArr = (j1g[]) spanned.getSpans(i2, i2 + 1, j1g.class);
            if (j1gVarArr.length > 0) {
                return spanned.getSpanStart(j1gVarArr[0]);
            }
        }
        return ((androidx.emoji2.text.f.c) fVar.d(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Reader.READ_DONE, true, new androidx.emoji2.text.f.c(i2))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        km20.g("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            a aVar = this.e;
            d dVar = aVar.a;
            try {
                dVar.f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th) {
                dVar.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(int i2, int i3, int i4, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i5;
        int i6;
        j1g[] j1gVarArr;
        int spanStart;
        km20.g("Not initialized yet", c() == 1);
        ngh0 ngh0Var = null;
        if (i2 < 0) {
            hb5.a("start cannot be negative");
            return null;
        }
        if (i3 < 0) {
            hb5.a("end cannot be negative");
            return null;
        }
        km20.a("start should be <= than end", i2 <= i3);
        if (charSequence == null) {
            return null;
        }
        km20.a("start should be < than charSequence length", i2 <= charSequence.length());
        km20.a("end should be < than charSequence length", i3 <= charSequence.length());
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        boolean z = i4 == 1;
        androidx.emoji2.text.f fVar = this.e.b;
        fVar.getClass();
        boolean z2 = charSequence instanceof xra0;
        if (z2) {
            ((xra0) charSequence).a();
        }
        if (z2) {
            ngh0Var = new ngh0((Spannable) charSequence);
            if (ngh0Var != null) {
                for (j1g j1gVar : j1gVarArr) {
                    spanStart = ngh0Var.b.getSpanStart(j1gVar);
                    int spanEnd = ngh0Var.b.getSpanEnd(j1gVar);
                    if (spanStart != i3) {
                        ngh0Var.removeSpan(j1gVar);
                    }
                    i2 = Math.min(spanStart, i2);
                    i3 = Math.max(spanEnd, i3);
                }
            }
            i5 = i2;
            i6 = i3;
            if (i5 != i6) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((xra0) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    ngh0Var = new ngh0((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((xra0) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, j1g.class) <= i3) {
                ngh0Var = new ngh0();
                ngh0Var.a = false;
                ngh0Var.b = new SpannableString(charSequence);
            }
            if (ngh0Var != null && (j1gVarArr = (j1g[]) ngh0Var.b.getSpans(i2, i3, j1g.class)) != null && j1gVarArr.length > 0) {
                while (i < r2) {
                    spanStart = ngh0Var.b.getSpanStart(j1gVar);
                    int spanEnd2 = ngh0Var.b.getSpanEnd(j1gVar);
                    if (spanStart != i3) {
                        ngh0Var.removeSpan(j1gVar);
                    }
                    i2 = Math.min(spanStart, i2);
                    i3 = Math.max(spanEnd2, i3);
                }
            }
            i5 = i2;
            i6 = i3;
            if (i5 != i6 || i5 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    ngh0 ngh0Var2 = (ngh0) fVar.d(charSequence2, i5, i6, Reader.READ_DONE, z, new androidx.emoji2.text.f.a(ngh0Var, fVar.a));
                    if (ngh0Var2 != null) {
                        Spannable spannable = ngh0Var2.b;
                        if (z2) {
                            ((xra0) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((xra0) charSequence2).b();
                    throw th;
                }
            }
            ((xra0) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((xra0) charSequence2).b();
        throw th;
    }

    public final void h(f fVar) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new g(Arrays.asList(fVar), this.c, null));
            } else {
                this.b.add(fVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.e;
        aVar.getClass();
        Bundle bundle = editorInfo.extras;
        cpv cpvVar = aVar.c.a;
        int iA = cpvVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? cpvVar.b.getInt(iA + cpvVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public static abstract class f {
        public void b() {
        }

        public void a() {
        }
    }
}
