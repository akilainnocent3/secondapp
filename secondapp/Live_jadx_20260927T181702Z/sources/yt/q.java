package yt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface q extends r {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends Cloneable, r {
        a C2(e eVar, g gVar) throws IOException;

        q build();
    }

    void a(f fVar) throws IOException;

    s<? extends q> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
