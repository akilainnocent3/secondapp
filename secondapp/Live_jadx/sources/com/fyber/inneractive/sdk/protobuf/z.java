package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public z(IndexOutOfBoundsException indexOutOfBoundsException) {
        super(androidx.datastore.preferences.protobuf.b0.f.f9586c, indexOutOfBoundsException);
    }

    public z(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
