package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class vnu {
    public static final a b = new a();
    public final b a;

    public class a implements vnv {
        @Override // defpackage.vnv
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // defpackage.vnv
        public final tnv messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements vnv {
        public vnv[] a;

        @Override // defpackage.vnv
        public final boolean isSupported(Class<?> cls) {
            for (vnv vnvVar : this.a) {
                if (vnvVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.vnv
        public final tnv messageInfoFor(Class<?> cls) {
            for (vnv vnvVar : this.a) {
                if (vnvVar.isSupported(cls)) {
                    return vnvVar.messageInfoFor(cls);
                }
            }
            zkh.a("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }
    }

    public vnu() {
        vnv vnvVar;
        w630 w630Var = w630.c;
        try {
            vnvVar = (vnv) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            vnvVar = b;
        }
        vnv[] vnvVarArr = {l1k.a, vnvVar};
        b bVar = new b();
        bVar.a = vnvVarArr;
        Charset charset = fyo.a;
        this.a = bVar;
    }
}
