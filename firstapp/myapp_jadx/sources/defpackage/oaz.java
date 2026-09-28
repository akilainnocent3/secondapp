package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class oaz {
    public final paz a;

    public interface a {
        void a(long j);

        void b(Surface surface);

        void c(long j);

        void d(String str);

        String e();

        void f();

        void g(int i);

        Object h();
    }

    public oaz(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.a = new saz(new OutputConfiguration(i, surface));
            return;
        }
        if (i2 >= 28) {
            this.a = new raz(new raz.a(new OutputConfiguration(i, surface)));
        } else if (i2 >= 26) {
            this.a = new qaz(new qaz.a(new OutputConfiguration(i, surface)));
        } else {
            this.a = new paz(new paz.a(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oaz)) {
            return false;
        }
        return this.a.equals(((oaz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public oaz(OutputConfiguration outputConfiguration) {
        this.a = new saz(outputConfiguration);
    }

    public oaz(paz pazVar) {
        this.a = pazVar;
    }
}
