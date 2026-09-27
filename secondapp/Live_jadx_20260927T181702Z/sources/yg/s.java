package yg;

import androidx.annotation.Nullable;
import java.util.List;
import re.n2;
import re.y7;
import zf.l0;
import zf.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface s extends x {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f159492d = "ETSDefinition";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1 f159493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f159494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f159495c;

        public a(s1 s1Var, int... iArr) {
            this(s1Var, iArr, 0);
        }

        public a(s1 s1Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                eh.h0.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f159493a = s1Var;
            this.f159494b = iArr;
            this.f159495c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        s[] a(a[] aVarArr, ah.f fVar, l0.b bVar, y7 y7Var);
    }

    long a();

    boolean b(int i10, long j10);

    boolean c(int i10, long j10);

    void d();

    void disable();

    void e();

    void enable();

    int evaluateQueueSize(long j10, List<? extends bg.n> list);

    void f(boolean z10);

    boolean g(long j10, bg.f fVar, List<? extends bg.n> list);

    n2 getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    void i(long j10, long j11, long j12, List<? extends bg.n> list, bg.o[] oVarArr);

    void onPlaybackSpeed(float f10);
}
