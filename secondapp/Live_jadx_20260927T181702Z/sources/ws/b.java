package ws;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface b extends ws.a, e0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean d() {
            return this != FAKE_OVERRIDE;
        }
    }

    void S(@oy.l Collection<? extends b> collection);

    @Override // ws.a, ws.m
    @oy.l
    b a();

    @Override // ws.a
    @oy.l
    Collection<? extends b> e();

    @oy.l
    a getKind();

    @oy.l
    b o0(m mVar, f0 f0Var, u uVar, a aVar, boolean z10);
}
