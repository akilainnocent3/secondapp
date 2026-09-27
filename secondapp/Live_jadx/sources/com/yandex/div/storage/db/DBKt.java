package com.yandex.div.storage.db;

import gi.j;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DBKt {
    @l
    public static final StringBuilder appendPlaceholders(@l StringBuilder sb2, int i10) {
        sb2.append(j.f86770c);
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
        sb2.append(j.f86771d);
        return sb2;
    }
}
