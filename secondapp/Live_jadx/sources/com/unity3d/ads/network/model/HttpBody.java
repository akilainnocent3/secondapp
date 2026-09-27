package com.unity3d.ads.network.model;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface HttpBody {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ByteArrayBody implements HttpBody {

        @l
        private final byte[] content;

        public ByteArrayBody(@l byte[] content) {
            m0.p(content, "content");
            this.content = content;
        }

        @l
        public final byte[] getContent() {
            return this.content;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class EmptyBody implements HttpBody {

        @l
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class StringBody implements HttpBody {

        @l
        private final String content;

        public StringBody(@l String content) {
            m0.p(content, "content");
            this.content = content;
        }

        @l
        public final String getContent() {
            return this.content;
        }
    }
}
