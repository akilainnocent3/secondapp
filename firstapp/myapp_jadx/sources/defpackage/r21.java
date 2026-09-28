package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class r21 {
    public static final r21 d = new r21(0, 1);
    public final int a;
    public final int b;
    public c c;

    public static final class a {
        public static void a(AudioAttributes.Builder builder) {
            builder.setAllowedCapturePolicy(1);
        }
    }

    public static final class b {
        public static void a(AudioAttributes.Builder builder) {
            builder.setIsContentSpatialized(false);
        }

        public static void b(AudioAttributes.Builder builder) {
            builder.setSpatializationBehavior(0);
        }
    }

    public static final class c {
        public final AudioAttributes a;

        public c(r21 r21Var) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(r21Var.a).setFlags(0).setUsage(r21Var.b);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                a.a(usage);
            }
            if (i >= 32) {
                b.b(usage);
                b.a(usage);
            }
            this.a = usage.build();
        }
    }

    static {
        jf.a(0, 1, 2, 3, 4);
        jrh0.J(5);
    }

    public r21(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final c a() {
        c cVar = this.c;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.c = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r21.class != obj.getClass()) {
            return false;
        }
        r21 r21Var = (r21) obj;
        return this.a == r21Var.a && this.b == r21Var.b;
    }

    public final int hashCode() {
        return (((((527 + this.a) * 961) + this.b) * 31) + 1) * 961;
    }
}
