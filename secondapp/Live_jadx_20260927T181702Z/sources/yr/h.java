package yr;

import dr.l1;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class h {
    @l
    @l1(version = "1.8")
    @f
    public static final InputStream a(@l InputStream inputStream, @l a base64) {
        m0.p(inputStream, "<this>");
        m0.p(base64, "base64");
        return new d(inputStream, base64);
    }

    @l
    @l1(version = "1.8")
    @f
    public static final OutputStream b(@l OutputStream outputStream, @l a base64) {
        m0.p(outputStream, "<this>");
        m0.p(base64, "base64");
        return new e(outputStream, base64);
    }
}
