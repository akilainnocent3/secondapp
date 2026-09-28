package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface dke0 {

    /* JADX INFO: loaded from: classes.dex */
    public static final /* synthetic */ class a implements dke0, paj {
        public static final a a = new a();

        @Override // defpackage.dke0
        public final lb0 a(cc5 cc5Var) {
            return new lb0(new dr60().f(cc5Var.I1()));
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return new saj(1, psz.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dke0) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    lb0 a(cc5 cc5Var);
}
