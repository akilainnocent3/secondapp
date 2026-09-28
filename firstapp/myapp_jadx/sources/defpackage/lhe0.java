package defpackage;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface lhe0 extends Closeable {

    public static abstract class a {
        public abstract n26 a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        public abstract int a();

        public abstract lhe0 b();
    }

    void E0(float[] fArr, float[] fArr2);

    Size a();

    default int getFormat() {
        return 34;
    }

    Surface j0(adl adlVar, qya qyaVar);

    default void A(float[] fArr, float[] fArr2, boolean z) {
    }
}
