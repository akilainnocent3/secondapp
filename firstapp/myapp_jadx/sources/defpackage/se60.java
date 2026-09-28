package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface se60 {

    public static final class a implements se60 {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("Loading(progress="), this.a, ')');
        }

        public /* synthetic */ a(int i) {
            this(0.0f);
        }
    }

    public static final class b implements se60 {
        public final fa60 a;
        public final wb60 b;
        public final wb60 c;
        public final dw1 d;
        public final do70 e;
        public final bz2 f;
        public final i4h g;
        public final sd60 h;
        public final boolean i;

        public b(fa60 fa60Var, wb60 wb60Var, wb60 wb60Var2, dw1 dw1Var, do70 do70Var, bz2 bz2Var, i4h i4hVar, sd60 sd60Var, boolean z) {
            fa60Var.getClass();
            wb60Var.getClass();
            wb60Var2.getClass();
            dw1Var.getClass();
            do70Var.getClass();
            bz2Var.getClass();
            i4hVar.getClass();
            sd60Var.getClass();
            this.a = fa60Var;
            this.b = wb60Var;
            this.c = wb60Var2;
            this.d = dw1Var;
            this.e = do70Var;
            this.f = bz2Var;
            this.g = i4hVar;
            this.h = sd60Var;
            this.i = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g) && Intrinsics.g(this.h, bVar.h) && this.i == bVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + shu.a(this.e.a, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(betPanelState=");
            sb.append(this.a);
            sb.append(", firstCard=");
            sb.append(this.b);
            sb.append(", secondCard=");
            sb.append(this.c);
            sb.append(", ballPoolState=");
            sb.append(this.d);
            sb.append(", boardScoreLayoutState=");
            sb.append(this.e);
            sb.append(", betRowState=");
            sb.append(this.f);
            sb.append(", extraBallDialogState=");
            sb.append(this.g);
            sb.append(", footerState=");
            sb.append(this.h);
            sb.append(", bgMusicEnable=");
            return ruw.a(sb, this.i, ')');
        }

        public b() {
            this(0);
        }

        public /* synthetic */ b(int i) {
            this(new fa60(), new wb60.b(3, false), new wb60.b(3, false), new dw1(), new do70(0), new bz2.a(0), i4h.a.a, new sd60(0), true);
        }
    }
}
