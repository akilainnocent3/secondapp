package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {
    private d0() {
    }

    public static void clear(Buffer b10) {
        b10.clear();
    }

    public static void flip(Buffer b10) {
        b10.flip();
    }

    public static void limit(Buffer b10, int limit) {
        b10.limit(limit);
    }

    public static void mark(Buffer b10) {
        b10.mark();
    }

    public static void position(Buffer b10, int position) {
        b10.position(position);
    }

    public static void reset(Buffer b10) {
        b10.reset();
    }
}
