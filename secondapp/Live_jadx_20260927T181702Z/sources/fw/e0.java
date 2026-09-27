package fw;

import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@m0
public interface e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f85425a = a.f85426a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f85426a = new a();

        public final void a(@oy.l String text, @oy.l ds.q<? super String, ? super Integer, ? super Integer, w2> writeImpl) {
            kotlin.jvm.internal.m0.p(text, "text");
            kotlin.jvm.internal.m0.p(writeImpl, "writeImpl");
            int length = text.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = text.charAt(i11);
                if (cCharAt < t1.b().length && t1.b()[cCharAt] != null) {
                    writeImpl.invoke(text, Integer.valueOf(i10), Integer.valueOf(i11));
                    String str = t1.b()[cCharAt];
                    kotlin.jvm.internal.m0.m(str);
                    writeImpl.invoke(str, 0, Integer.valueOf(str.length()));
                    i10 = i11 + 1;
                }
            }
            writeImpl.invoke(text, Integer.valueOf(i10), Integer.valueOf(text.length()));
        }
    }

    void a(char c10);

    void b(@oy.l String str);

    void c(@oy.l String str);

    void release();

    void writeLong(long j10);
}
