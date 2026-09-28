package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class wnu {
    public static final a b = new a();
    public final b a;

    public class a implements unv {
        @Override // defpackage.unv
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // defpackage.unv
        public final snv messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements unv {
        public unv[] a;

        @Override // defpackage.unv
        public final boolean isSupported(Class<?> cls) {
            for (unv unvVar : this.a) {
                if (unvVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.unv
        public final snv messageInfoFor(Class<?> cls) {
            for (unv unvVar : this.a) {
                if (unvVar.isSupported(cls)) {
                    return unvVar.messageInfoFor(cls);
                }
            }
            zkh.a("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }
    }

    public wnu() {
        unv unvVar;
        try {
            unvVar = (unv) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            unvVar = b;
        }
        unv[] unvVarArr = {k1k.a, unvVar};
        b bVar = new b();
        bVar.a = unvVarArr;
        Charset charset = gyo.a;
        this.a = bVar;
    }
}
