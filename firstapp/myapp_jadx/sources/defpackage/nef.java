package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public interface nef {
    public static final a a = new a();

    public interface b {
        public static final sxa a = new sxa();

        void release();
    }

    void e(Looper looper, sp10 sp10Var);

    lef f(mef.a aVar, androidx.media3.common.a aVar2);

    int g(androidx.media3.common.a aVar);

    default void d() {
    }

    default void release() {
    }

    public class a implements nef {
        @Override // defpackage.nef
        public final lef f(mef.a aVar, androidx.media3.common.a aVar2) {
            if (aVar2.r == null) {
                return null;
            }
            return new xcg(new lef.a(6001, new lhh0()));
        }

        @Override // defpackage.nef
        public final int g(androidx.media3.common.a aVar) {
            return aVar.r != null ? 1 : 0;
        }

        @Override // defpackage.nef
        public final void e(Looper looper, sp10 sp10Var) {
        }
    }
}
