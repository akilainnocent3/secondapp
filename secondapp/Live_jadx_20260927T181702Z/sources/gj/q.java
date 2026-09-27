package gj;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
@qj.j
public interface q {
    s a(int expectedInputSize);

    p b(byte[] input);

    p c(int input);

    p d(long input);

    <T> p e(@i0 T instance, n<? super T> funnel);

    p f(CharSequence input, Charset charset);

    p g(CharSequence input);

    int h();

    s i();

    p j(ByteBuffer input);

    p k(byte[] input, int off, int len);
}
