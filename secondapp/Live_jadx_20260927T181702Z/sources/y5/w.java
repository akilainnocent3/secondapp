package y5;

import androidx.annotation.Nullable;
import java.util.List;
import s5.s0;
import u4.a5;
import u4.y4;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface w extends c0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f146319d = "ETSDefinition";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a5 f146320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f146321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f146322c;

        public a(a5 a5Var, int... iArr) {
            this(a5Var, iArr, 0);
        }

        public a(a5 a5Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                x4.d0.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f146320a = a5Var;
            this.f146321b = iArr;
            this.f146322c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        w[] a(a[] aVarArr, z5.e eVar, s0.b bVar, y4 y4Var);
    }

    long a();

    boolean b(int i10, long j10);

    boolean c(int i10, long j10);

    void d();

    void disable();

    void e();

    void enable();

    int evaluateQueueSize(long j10, List<? extends u5.p> list);

    void f(boolean z10);

    androidx.media3.common.a getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    void h(long j10, long j11, long j12, List<? extends u5.p> list, u5.q[] qVarArr);

    boolean i(long j10, u5.g gVar, List<? extends u5.p> list);

    void onPlaybackSpeed(float f10);
}
