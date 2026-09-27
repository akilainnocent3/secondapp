package g;

import android.content.Context;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addOnContextAvailableListener(@l d dVar);

    @m
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@l d dVar);
}
