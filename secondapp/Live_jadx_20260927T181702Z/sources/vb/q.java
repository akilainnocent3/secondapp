package vb;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f140813h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final StackTraceElement[] f140814i = new StackTraceElement[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Throwable> f140815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tb.f f140816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tb.a f140817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Class<?> f140818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f140819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Exception f140820g;

    public q(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).k(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof q)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((q) th2).g().iterator();
        while (it.hasNext()) {
            a(it.next(), list);
        }
    }

    public List<Throwable> g() {
        return this.f140815b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f140819f);
        sb2.append(this.f140818e != null ? ", " + this.f140818e : "");
        sb2.append(this.f140817d != null ? ", " + this.f140817d : "");
        sb2.append(this.f140816c != null ? ", " + this.f140816c : "");
        List<Throwable> listI = i();
        if (listI.isEmpty()) {
            return sb2.toString();
        }
        if (listI.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(listI.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : listI) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Nullable
    public Exception h() {
        return this.f140820g;
    }

    public List<Throwable> i() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void j(String str) {
        List<Throwable> listI = i();
        int size = listI.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(gi.j.f86771d);
            Log.i(str, sb2.toString(), listI.get(i10));
            i10 = i11;
        }
    }

    public final void k(Appendable appendable) {
        d(this, appendable);
        b(g(), new a(appendable));
    }

    public void l(tb.f fVar, tb.a aVar) {
        m(fVar, aVar, null);
    }

    public void m(tb.f fVar, tb.a aVar, Class<?> cls) {
        this.f140816c = fVar;
        this.f140817d = aVar;
        this.f140818e = cls;
    }

    public void n(@Nullable Exception exc) {
        this.f140820g = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        k(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f140819f = str;
        setStackTrace(f140814i);
        this.f140815b = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        k(printWriter);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f140821d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f140822e = "  ";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Appendable f140823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f140824c = true;

        public a(Appendable appendable) {
            this.f140823b = appendable;
        }

        @NonNull
        public final CharSequence a(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) throws IOException {
            if (this.f140824c) {
                this.f140824c = false;
                this.f140823b.append(f140822e);
            }
            this.f140824c = c10 == '\n';
            this.f140823b.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            return append(charSequenceA, 0, charSequenceA.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence charSequenceA = a(charSequence);
            boolean z10 = false;
            if (this.f140824c) {
                this.f140824c = false;
                this.f140823b.append(f140822e);
            }
            if (charSequenceA.length() > 0 && charSequenceA.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f140824c = z10;
            this.f140823b.append(charSequenceA, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
