package com.applovin.shadow.okhttp3;

import java.io.IOException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface Callback {
    void onFailure(@l Call call, @l IOException iOException);

    void onResponse(@l Call call, @l Response response) throws IOException;
}
