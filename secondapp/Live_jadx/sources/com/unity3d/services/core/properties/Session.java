package com.unity3d.services.core.properties;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Session {

    @l
    public static final Default Default = Default.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @l
        private static final String f76404id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        @l
        public String getId() {
            return f76404id;
        }
    }

    @l
    String getId();
}
