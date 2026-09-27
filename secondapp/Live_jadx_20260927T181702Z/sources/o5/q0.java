package o5;

import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f118793a = new q0() { // from class: o5.n0
        @Override // o5.q0
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return a1.o(str, z10, z11);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f118794b = new q0() { // from class: o5.o0
        @Override // o5.q0
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return a1.t(q0.f118793a.getDecoderInfos(str, z10, z11));
        }
    };

    List<d0> getDecoderInfos(String str, boolean z10, boolean z11) throws a1.c;
}
