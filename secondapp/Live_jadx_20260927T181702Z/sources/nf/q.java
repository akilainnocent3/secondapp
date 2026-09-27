package nf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f116688a = new q() { // from class: nf.p
        @Override // nf.q
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return v.u(str, z10, z11);
        }
    };

    List<n> getDecoderInfos(String str, boolean z10, boolean z11) throws v.c;
}
