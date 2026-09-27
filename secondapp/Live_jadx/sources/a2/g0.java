package a2;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f3557a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f3558b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f3559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f3560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f3561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f0 f3562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f3563g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f3564h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f3565i = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f3566b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3567a;

        public a(boolean z10) {
            this.f3567a = z10;
        }

        @Override // a2.g0.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = g0.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f3567a) {
                        return 1;
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f3567a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f3567a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3568a = new b();

        @Override // a2.g0.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = g0.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f3569a;

        public d(c cVar) {
            this.f3569a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f3569a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        @Override // a2.f0
        public boolean isRtl(char[] cArr, int i10, int i11) {
            return isRtl(CharBuffer.wrap(cArr), i10, i11);
        }

        @Override // a2.f0
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f3569a == null ? a() : b(charSequence, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3570b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f3570b = z10;
        }

        @Override // a2.g0.d
        public boolean a() {
            return this.f3570b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f3571b = new f();

        public f() {
            super(null);
        }

        @Override // a2.g0.d
        public boolean a() {
            return h0.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f3568a;
        f3559c = new e(bVar, false);
        f3560d = new e(bVar, true);
        f3561e = new e(a.f3566b, false);
        f3562f = f.f3571b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
