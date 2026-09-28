package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eff0 {
    public static final d a = new d(null, false);
    public static final d b = new d(null, true);
    public static final d c;
    public static final d d;

    public static class a implements b {
        public static final a a = new a();

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        @Override // eff0.b
        public final int a(int i, CharSequence charSequence) {
            int i2 = 0;
            i2 = 2;
            for (int i3 = 0; i3 < i && i2 == 2; i3++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i3));
                d dVar = eff0.a;
                if (directionality == 0) {
                    i2 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i2 = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            continue;
                    }
                }
            }
            return i2;
        }
    }

    public interface b {
        int a(int i, CharSequence charSequence);
    }

    public static abstract class c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a();

        public final boolean b(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                d580.a();
                return false;
            }
            b bVar = this.a;
            if (bVar == null) {
                return a();
            }
            int iA = bVar.a(i, charSequence);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    public static class d extends c {
        public final boolean b;

        public d(b bVar, boolean z) {
            super(bVar);
            this.b = z;
        }

        @Override // eff0.c
        public final boolean a() {
            return this.b;
        }
    }

    static {
        a aVar = a.a;
        c = new d(aVar, false);
        d = new d(aVar, true);
    }
}
