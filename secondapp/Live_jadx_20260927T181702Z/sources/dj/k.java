package dj;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@f
@yi.b(emulated = true)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<char[]> f79365a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    public static char[] a() {
        char[] cArr = f79365a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
