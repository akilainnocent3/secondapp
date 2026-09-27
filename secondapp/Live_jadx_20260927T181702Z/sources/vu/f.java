package vu;

import kotlin.jvm.internal.m0;
import ws.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @oy.m
        public static String a(@oy.l f fVar, @oy.l z functionDescriptor) {
            m0.p(functionDescriptor, "functionDescriptor");
            if (fVar.a(functionDescriptor)) {
                return null;
            }
            return fVar.getDescription();
        }
    }

    boolean a(@oy.l z zVar);

    @oy.m
    String b(@oy.l z zVar);

    @oy.l
    String getDescription();
}
